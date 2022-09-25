package com.android.launcher3.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;
import com.android.launcher3.Utilities;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class UserHandleCompat {
    private UserHandle mUser;

    private UserHandleCompat() {
    }

    private UserHandleCompat(UserHandle userHandle) {
        this.mUser = userHandle;
    }

    public static UserHandleCompat fromBundle(Bundle bundle, String str) {
        if (Utilities.ATLEAST_LOLLIPOP) {
            Parcelable parcelable = bundle.getParcelable(str);
            if (parcelable instanceof UserHandle) {
                return fromUser((UserHandle) parcelable);
            }
        }
        return myUserHandle();
    }

    public static UserHandleCompat fromIntent(Intent intent) {
        UserHandle userHandle;
        if (!Utilities.ATLEAST_LOLLIPOP || (userHandle = (UserHandle) intent.getParcelableExtra("android.intent.extra.USER")) == null) {
            return null;
        }
        return fromUser(userHandle);
    }

    public static UserHandleCompat fromUser(UserHandle userHandle) {
        if (userHandle == null) {
            return null;
        }
        return new UserHandleCompat(userHandle);
    }

    public static UserHandleCompat myUserHandle() {
        return Utilities.ATLEAST_JB_MR1 ? new UserHandleCompat(Process.myUserHandle()) : new UserHandleCompat();
    }

    public void addToBundle(Bundle bundle, String str) {
        UserHandle userHandle;
        if (Utilities.ATLEAST_LOLLIPOP && (userHandle = this.mUser) != null) {
            bundle.putParcelable(str, userHandle);
        }
    }

    public void addToIntent(Intent intent, String str) {
        UserHandle userHandle;
        if (Utilities.ATLEAST_LOLLIPOP && (userHandle = this.mUser) != null) {
            intent.putExtra(str, userHandle);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserHandleCompat)) {
            return false;
        }
        if (Utilities.ATLEAST_JB_MR1) {
            return this.mUser.equals(((UserHandleCompat) obj).mUser);
        }
        return true;
    }

    public UserHandle getUser() {
        return this.mUser;
    }

    public int hashCode() {
        if (Utilities.ATLEAST_JB_MR1) {
            return this.mUser.hashCode();
        }
        return 0;
    }

    public String toString() {
        return Utilities.ATLEAST_JB_MR1 ? this.mUser.toString() : BuildConfig.FLAVOR;
    }
}
