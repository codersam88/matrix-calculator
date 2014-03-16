package matrixCalc;
import sam.matrixcalc.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class TakeMat extends Activity{
	LinearLayout lOut;
	LinearLayout lIl[];
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		lOut= new LinearLayout(this);
		b1 = new Button(this);
		b1.setText("hi");
		lOut.addView(b1);
		//createSubLs(3);//for columns
		//createSkel(5,6);//for rows
		setContentView(lOut);

	}

	void createSubLs(int ll){
		lIl=new LinearLayout[ll];
		for(int i=0;i<ll;i++){
			lIl[i].setOrientation(LinearLayout.HORIZONTAL);
			lOut.addView(lIl[i]);

		}
	}
	void createSkel(int r,int c){
		EditText etm[][]= new EditText[r][c];
		for(int i=0; i < c; c ++){
			for(int j=0; j<r;j++){
				lIl[i].addView(etm[r][c]);
			}
		}


	}

}
