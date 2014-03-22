package matrixCalc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sam.matrixcalc.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		lOut= new LinearLayout(this);
		lOut.setOrientation(LinearLayout.VERTICAL);
		createSkel();//for rows
		sav = new Button(this);
		sav.setText("save");
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
							fos.close();
						}
					}
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

}
