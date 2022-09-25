package com.google.android.apps.gsa.staticplugins.recently.monet.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class SnackbarData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C116133f();

    /* renamed from: a */
    public final boolean f322030a;

    /* renamed from: b */
    public final String f322031b;

    /* renamed from: c */
    public final String f322032c;

    /* renamed from: d */
    public final String f322033d;

    /* renamed from: e */
    public final String f322034e;

    /* renamed from: f */
    public final Bundle f322035f;

    public SnackbarData(Parcel parcel) {
        this.f322030a = parcel.readByte() != 0;
        this.f322031b = parcel.readString();
        this.f322032c = parcel.readString();
        this.f322033d = parcel.readString();
        this.f322034e = parcel.readString();
        this.f322035f = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
    }

    public SnackbarData(boolean z, String str, String str2, String str3, String str4, Bundle bundle) {
        this.f322030a = z;
        this.f322031b = str;
        this.f322032c = str2;
        this.f322033d = str3;
        this.f322034e = str4;
        this.f322035f = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f322030a ? (byte) 1 : 0);
        parcel.writeString(this.f322031b);
        parcel.writeString(this.f322032c);
        parcel.writeString(this.f322033d);
        parcel.writeString(this.f322034e);
        parcel.writeParcelable(this.f322035f, i);
    }
}
