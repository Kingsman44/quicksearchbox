package com.google.android.libraries.parenttools.youtube;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class ParentToolsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C31094ab();

    /* renamed from: d */
    public static C31095ac m58007d() {
        C31092a aVar = new C31092a();
        aVar.mo36840c(1);
        return aVar;
    }

    /* renamed from: a */
    public abstract C31095ac mo36827a();

    /* renamed from: b */
    public abstract byte[] mo36828b();

    /* renamed from: c */
    public abstract int mo36829c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(mo36828b());
        int c = mo36829c();
        int i2 = c - 1;
        if (c != 0) {
            parcel.writeInt(i2);
            return;
        }
        throw null;
    }
}
