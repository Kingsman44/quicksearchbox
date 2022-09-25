package com.android.launcher3.compat;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
public class UserManagerCompatVN extends UserManagerCompatVL {
    private static final String TAG = "UserManagerCompatVN";

    public UserManagerCompatVN(Context context) {
        super(context);
    }

    public boolean isQuietModeEnabled(UserHandleCompat userHandleCompat) {
        if (userHandleCompat != null) {
            try {
                return ((Boolean) UserManager.class.getMethod("isQuietModeEnabled", new Class[]{UserHandle.class}).invoke(this.mUserManager, new Object[]{userHandleCompat.getUser()})).booleanValue();
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public boolean isUserUnlocked(UserHandleCompat userHandleCompat) {
        try {
            return ((Boolean) UserManager.class.getMethod("isUserUnlocked", new Class[]{UserHandle.class}).invoke(this.mUserManager, new Object[]{userHandleCompat.getUser()})).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return true;
        }
    }
}
