package matrixCalc;

import sam.matrixcalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;



public class MainEntr extends Activity{
	Button enter;
	Dime dim = new Dime();
	Intent i;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		i = new Intent(this,Dime.class);
		setContentView(R.layout.mainentrance);
		enter = (Button)findViewById(R.id.enter_matrix);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(i);
				
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.layout.actions_menu, menu);
 
        return super.onCreateOptionsMenu(menu);
    }

}
