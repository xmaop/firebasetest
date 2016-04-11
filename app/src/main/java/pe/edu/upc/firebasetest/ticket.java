package pe.edu.upc.firebasetest;

import com.firebase.client.Firebase;

/**
 * Created by xmaop on 8/04/2016.
 */
public class ticket extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
