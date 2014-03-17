package matrixCalc;

import sam.matrixcalc.R;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Dime extends Activity{
	EditText rws;
	EditText cls;
	Button bigB;
	Intent i;
	int rw;
	int cl;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matrixdim);
		
		i = new Intent(this,TakeMat.class);
		bigB = ( Button)findViewById(R.id.takeDim);
		bigB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				getDims();
				startActivity(i);
				
			}
		});
		
	}
	
	void getDims(){
		rws = (EditText)findViewById(R.id.rows);
		cls = (EditText)findViewById(R.id.cols);
		int dim[]={Integer.valueOf(rws.getText().toString()),
				Integer.valueOf(cls.getText().toString())};
		i.putExtra("sam.matrixCalc.Dime.Dims", dim);
		}
		
	}


