package app.muhammed.com.sqliteframework;

import com.facebook.stetho.Stetho;
import com.orm.SugarApp;

/**
 * Created by Muhammed on 30/09/17.
 */

public class MyApp extends SugarApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
