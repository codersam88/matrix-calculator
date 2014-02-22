package matrixCalc;

import sam.matrixcalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class EnterMat extends Activity{
	Button enter;
	Dime dim = new Dime();
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		final Intent i = new Intent(this,Dime.class);
		setContentView(R.layout.mainentrance);
		enter = (Button)findViewById(R.id.enter_matrix);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(i);
				
			}
		});
		
	}

}
