package com.android.launcher3.shortcuts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
public final class ShortcutInfoCompat {
    public final Object mShortcutInfo;
    public Class mShortcutInfoClass;

    public ShortcutInfoCompat(Object obj) {
        try {
            this.mShortcutInfoClass = Class.forName("android.content.pm.ShortcutInfo");
        } catch (ClassNotFoundException unused) {
            this.mShortcutInfoClass = null;
        }
        this.mShortcutInfo = obj;
    }

    public final ComponentName getActivity() {
        try {
            return (ComponentName) this.mShortcutInfoClass.getMethod("getActivity", new Class[0]).invoke(this.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getId() {
        try {
            return (String) this.mShortcutInfoClass.getMethod("getId", new Class[0]).invoke(this.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final CharSequence getLongLabel() {
        try {
            return (CharSequence) this.mShortcutInfoClass.getMethod("getLongLabel", new Class[0]).invoke(this.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getPackage() {
        try {
            return (String) this.mShortcutInfoClass.getMethod("getPackage", new Class[0]).invoke(this.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int getRank() {
        try {
            return ((Integer) this.mShortcutInfoClass.getMethod("getRank", new Class[0]).invoke(this.mShortcutInfo, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final CharSequence getShortLabel() {
        try {
            return (CharSequence) this.mShortcutInfoClass.getMethod("getShortLabel", new Class[0]).invoke(this.mShortcutInfo, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final UserHandleCompat getUserHandle() {
        try {
            return UserHandleCompat.fromUser((UserHandle) this.mShortcutInfoClass.getMethod("getUserHandle", new Class[0]).invoke(this.mShortcutInfo, new Object[0]));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean isDeclaredInManifest() {
        try {
            return ((Boolean) this.mShortcutInfoClass.getMethod("isDeclaredInManifest", new Class[0]).invoke(this.mShortcutInfo, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isDynamic() {
        try {
            return ((Boolean) this.mShortcutInfoClass.getMethod("isDynamic", new Class[0]).invoke(this.mShortcutInfo, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isEnabled() {
        try {
            return ((Boolean) this.mShortcutInfoClass.getMethod("isEnabled", new Class[0]).invoke(this.mShortcutInfo, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final Intent makeIntent(Context context) {
        return new Intent("android.intent.action.MAIN").addCategory("com.android.launcher3.DEEP_SHORTCUT").setComponent(getActivity()).setPackage(getPackage()).setFlags(270532608).putExtra("profile", UserManagerCompat.getInstance(context).getSerialNumberForUser(getUserHandle())).putExtra("shortcut_id", getId());
    }

    public final String toString() {
        return this.mShortcutInfo.toString();
    }
}
