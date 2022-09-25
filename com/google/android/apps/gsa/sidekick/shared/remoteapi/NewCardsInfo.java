package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class NewCardsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91912j();

    /* renamed from: a */
    public int f256278a;

    /* renamed from: b */
    private int f256279b;

    /* renamed from: c */
    private int f256280c;

    public NewCardsInfo() {
    }

    public NewCardsInfo(int i, int i2, int i3) {
        this.f256278a = i;
        this.f256279b = i2;
        this.f256280c = i3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f256278a);
        parcel.writeInt(this.f256279b);
        parcel.writeInt(this.f256280c);
    }

    public NewCardsInfo(Parcel parcel) {
        this.f256278a = parcel.readInt();
        this.f256279b = parcel.readInt();
        this.f256280c = parcel.readInt();
    }
}
