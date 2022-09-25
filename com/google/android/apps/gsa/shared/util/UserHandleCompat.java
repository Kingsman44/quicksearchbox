package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* compiled from: PG */
public class UserHandleCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90770bn();

    /* renamed from: a */
    public UserHandle f253767a;

    public UserHandleCompat(UserHandle userHandle) {
        this.f253767a = userHandle;
    }

    /* renamed from: a */
    public static UserHandleCompat m148154a() {
        return new UserHandleCompat(Process.myUserHandle());
    }

    /* renamed from: b */
    public final boolean mo85068b() {
        UserHandle userHandle = this.f253767a;
        if (userHandle != null) {
            try {
                Boolean bool = (Boolean) userHandle.getClass().getMethod("isOwner", new Class[0]).invoke(this.f253767a, new Object[0]);
                if (bool != null) {
                    return bool.booleanValue();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UserHandleCompat)) {
            return false;
        }
        return C58832aw.m90831a(this.f253767a, ((UserHandleCompat) obj).f253767a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f253767a});
    }

    public final String toString() {
        UserHandle userHandle = this.f253767a;
        return userHandle != null ? userHandle.toString() : BuildConfig.FLAVOR;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f253767a, 0);
    }
}
