package rs.pedjaapps.KernelTuner;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;


public class StartupReceiver extends BroadcastReceiver
{
	@Override
  public void onReceive(Context context, Intent intent)
  {
  
	  Intent serviceIntent = new Intent();
		serviceIntent.setAction("rs.pedjaapps.DualCore.StartupService");
		context.startService(serviceIntent);
  }
}