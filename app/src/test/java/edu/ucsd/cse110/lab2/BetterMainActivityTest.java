package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Test
    public void test_one_plus_one_equals_two() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            Button num1, num2, bAdd, bEqual;
            TextView result;

            num1 = activity.findViewById(R.id.btn_one);
            num2 = activity.findViewById(R.id.btn_one);
            bAdd = activity.findViewById(R.id.btn_plus);
            bEqual = activity.findViewById(R.id.btn_equals);

            num1.performClick();
            bAdd.performClick();
            num2.performClick();
            bEqual.performClick();
            result = activity.findViewById(R.id.display);

            assertEquals("2",result.getText().toString());

        });
    }
}
