package rs.pedjaapps.KernelTuner.ui;

import android.content.*;
import android.content.pm.*;
import android.net.*;
import android.os.*;
import android.preference.*;
import android.text.method.*;
import android.view.*;
import android.widget.*;
import org.holoeverywhere.app.*;
import org.holoeverywhere.widget.*;

import org.holoeverywhere.widget.TextView;
import rs.pedjaapps.KernelTuner.R;



public class About extends Activity
{
	
	

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		String theme = preferences.getString("theme", "light");
		
		if(theme.equals("light")){
			setTheme(R.style.Theme_Sherlock_Light);
		}
		else if(theme.equals("dark")){
			setTheme(R.style.Theme_Sherlock);
			
		}
		else if(theme.equals("light_dark_action_bar")){
			setTheme(R.style.Theme_Sherlock_Light_DarkActionBar);
			
		}
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
	final TextView versiontext = (TextView)findViewById(R.id.textView1);
		
		final TextView mail = (TextView)findViewById(R.id.textView6);
		final ImageView gp = (ImageView)findViewById(R.id.imageView1);
		final ImageView fb = (ImageView)findViewById(R.id.imageView2);
		final ImageView tw = (ImageView)findViewById(R.id.imageView3);
		final ImageView gpl = (ImageView)findViewById(R.id.imageView4);
		final ImageView xda = (ImageView)findViewById(R.id.imageView5);
		final ImageView anthrax = (ImageView)findViewById(R.id.imageView6);
		final ImageView kt = (ImageView)findViewById(R.id.imageView7);
		
		gp.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.setData(Uri.parse("market://details?id=rs.pedjaapps.KernelTuner"));
		        startActivity(intent);
		    }
		});
		
		fb.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://www.facebook.com/KernelTuner"));
		        startActivity(intent);
		    }
		});
		
		tw.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://twitter.com/kerneltuner"));
		        startActivity(intent);
		    }
		});
		
		gpl.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://plus.google.com/u/0/b/115273553144904124119/115273553144904124119"));
		        startActivity(intent);
		    }
		});
		
		kt.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://kerneltuner.pedjaapps.in.rs"));
		        startActivity(intent);
		    }
		});
		
		xda.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://forum.xda-developers.com/showthread.php?t=1719934"));
		        startActivity(intent);
		    }
		});
		
		anthrax.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://anthrax-kernels.us/forum/showthread.php?t=574"));
		        startActivity(intent);
		    }
		});
		
		if (mail != null)
		{
			mail.setMovementMethod(LinkMovementMethod.getInstance());
		}

	

		

		
		try
		{
			PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			String	version = pInfo.versionName;
			
			versiontext.setText(getResources().getString(R.string.version) + version);
		}
		catch (PackageManager.NameNotFoundException e)
		{}


	}

	
	
}
