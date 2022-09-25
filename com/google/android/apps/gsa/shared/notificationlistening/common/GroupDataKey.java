package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public final class GroupDataKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90426g();

    /* renamed from: a */
    private final String f252529a;

    public GroupDataKey(Parcel parcel) {
        String readString = parcel.readString();
        this.f252529a = readString == null ? BuildConfig.FLAVOR : readString;
    }

    public GroupDataKey(String str) {
        this.f252529a = str;
    }

    public GroupDataKey(String str, String str2) {
        this.f252529a = String.valueOf(str).concat(String.valueOf(str2));
    }

    /* renamed from: a */
    public static GroupDataKey m147083a(StatusBarNotification statusBarNotification) {
        String group = statusBarNotification.getNotification().getGroup();
        if (group == null) {
            return null;
        }
        return new GroupDataKey(statusBarNotification.getPackageName(), group);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupDataKey)) {
            return false;
        }
        return this.f252529a.equals(((GroupDataKey) obj).f252529a);
    }

    public final int hashCode() {
        return this.f252529a.hashCode();
    }

    public final String toString() {
        return this.f252529a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252529a);
    }

    public GroupDataKey(StatusBarNotification statusBarNotification) {
        this(statusBarNotification.getPackageName(), statusBarNotification.getNotification().getGroup());
    }
}
