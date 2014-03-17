package matrixCalc;
import sam.matrixcalc.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TakeMat extends Activity{
	LinearLayout lOut;
	LinearLayout lIl[];
	EditText etm[][];
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		lOut= new LinearLayout(this);
		lOut.setOrientation(LinearLayout.VERTICAL);
		createSkel();//for rows
		//createSubLs(2);
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
