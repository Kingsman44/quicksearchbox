package com.google.apps.tiktok.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public abstract class AccountId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45950a();

    /* renamed from: b */
    public static AccountId m82057b(int i) {
        C58838bb.m90884s(i >= -1, "Invalid AccountId");
        return new AutoValue_AccountId(i);
    }

    @Deprecated
    /* renamed from: a */
    public abstract int mo50068a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo50068a());
    }
}
