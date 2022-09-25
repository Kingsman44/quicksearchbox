package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class Command implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR = new C142706ac();

    /* renamed from: a */
    public String f387221a;

    /* renamed from: b */
    public String f387222b;

    /* renamed from: c */
    private String f387223c;

    @Deprecated
    public Command() {
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f387221a);
        parcel.writeString(this.f387223c);
        parcel.writeString(this.f387222b);
    }

    @Deprecated
    public Command(Parcel parcel) {
        this.f387221a = parcel.readString();
        this.f387223c = parcel.readString();
        this.f387222b = parcel.readString();
    }
}
