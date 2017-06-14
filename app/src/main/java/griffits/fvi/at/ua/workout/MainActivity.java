package griffits.fvi.at.ua.workout;

import android.app.Activity;

import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // WorkoutDetailFragment wdf = (WorkoutDetailFragment)getFragmentManager().findFragmentById(R.id.detail_frag);
        //wdf.setWorkOutId(1);
    }
}
