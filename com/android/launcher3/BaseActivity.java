package com.android.launcher3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
public class BaseActivity extends Activity {
    public DeviceProfile mDeviceProfile;

    public static BaseActivity fromContext(Context context) {
        if (context instanceof BaseActivity) {
            return (BaseActivity) context;
        }
        return (BaseActivity) ((ContextWrapper) context).getBaseContext();
    }
}
