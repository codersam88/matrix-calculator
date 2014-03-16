package matrixCalc;
import sam.matrixcalc.R;
import android.app.Activity;
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
		createSkel(2,2);//for rows
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
	void createSkel(int r,int c){
		//tv = new TextView(this);
		//tv.setText("hello");
		lIl=new LinearLayout[r];
		etm = new EditText[r][c];
		for(int i=0; i < r; i++){
			lIl[i] = new LinearLayout(this);
			lIl[i].setOrientation(LinearLayout.HORIZONTAL);
			for(int j=0; j<c;j++){
				etm[i][j]= new EditText(this);
				lIl[i].addView(etm[i][j]);
				
			}
			lOut.addView(lIl[i]);
		}
		


	}

}
