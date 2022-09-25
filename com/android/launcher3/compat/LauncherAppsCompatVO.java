package com.android.launcher3.compat;

import android.content.Context;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.os.UserHandle;
import android.util.Log;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class LauncherAppsCompatVO extends LauncherAppsCompatVL {
    public LauncherAppsCompatVO(Context context) {
        super(context);
    }

    public List getCustomShortcutActivityList() {
        ArrayList arrayList = new ArrayList();
        UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
        try {
            Method declaredMethod = LauncherApps.class.getDeclaredMethod("getShortcutConfigActivityList", new Class[]{String.class, UserHandle.class});
            for (UserHandleCompat userHandleCompat : UserManagerCompat.getInstance(this.mContext).getUserProfiles()) {
                boolean equals = myUserHandle.equals(userHandleCompat);
                for (LauncherActivityInfo launcherActivityInfo : (List) declaredMethod.invoke(this.mLauncherApps, new Object[]{null, userHandleCompat.getUser()})) {
                    if (equals || launcherActivityInfo.getApplicationInfo().targetSdkVersion >= 26) {
                        arrayList.add(new ShortcutConfigActivityInfo.ShortcutConfigActivityInfoVO(launcherActivityInfo));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("LauncherAppsCompatVO", "Error calling new API", e);
        }
        return arrayList;
    }
}
