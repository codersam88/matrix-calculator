package matrixCalc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sam.matrixcalc.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class TakeMat extends Activity{
	LinearLayout lOut;
	LinearLayout lIl[];
	EditText etm[][];
	Button sav;
	Button scnd;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		lOut= new LinearLayout(this);
		lOut.setOrientation(LinearLayout.VERTICAL);
		createSkel();//for rows
		sav = new Button(this);
		scnd = new Button(this);
		sav.setText("save");
		scnd.setText("Enter 2nd matrix");
		//createSubLs(2);
		sav.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String filA = "maxA";
				try {
					FileOutputStream fos = openFileOutput(filA, Context.MODE_PRIVATE);
					for(int i = 0; i < etm.length; i++){
						for (int j = 0; j < etm[0].length; j++) {
							fos.write(etm[i][j].getText().toString().getBytes());
							
						}
					}
					fos.close();
					lOut.addView(scnd);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		lOut.addView(sav);
		setContentView(lOut);
		scnd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Dime.class);
				startActivity(intent);
				
			}
		});

	}

	void createSubLs(int ll){
		lIl=new LinearLayout[ll];
		for(int i=0;i<ll;i++){
			lIl[i] = new LinearLayout(this);
			lIl[i].setOrientation(LinearLayout.HORIZONTAL);
			lOut.addView(lIl[i]);

		}
	}
	void createSkel(){
		int dim[] = getIntent().getExtras().getIntArray("sam.matrixCalc.Dime.Dims");
		lIl=new LinearLayout[dim[0]];
		etm = new EditText[dim[0]][dim[1]];
		for(int i=0; i < dim[0]; i++){
			lIl[i] = new LinearLayout(this);
			lIl[i].setOrientation(LinearLayout.HORIZONTAL);
			for(int j=0; j<dim[1];j++){
				etm[i][j]= new EditText(this);
				lIl[i].addView(etm[i][j]);
				
			}
			lOut.addView(lIl[i]);
		}
		


	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.layout.menu, menu);
        return true;
    }
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
         
        switch (item.getItemId())
        {
        case R.id.scal:
            
            return true;
 
        
 
        default:
            return super.onOptionsItemSelected(item);
        }
    }

}
