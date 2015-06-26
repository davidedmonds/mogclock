package purplepudding.mogclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * A ninja moogle, that waits for the appropriate moment and then kupos in your ear.
 */
public class AlarmMoogle extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Kupo until you get attention
        // Put a notification in
        // Calculate next time for scheduling and reset
        Intent alarmIntent = new Intent(context, AlarmMoogle.class);
    }
}
