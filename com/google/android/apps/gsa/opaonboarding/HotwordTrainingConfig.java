package com.google.android.apps.gsa.opaonboarding;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class HotwordTrainingConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C83876aj();

    /* renamed from: d */
    public static C83877ak m133502d() {
        C83939f fVar = new C83939f();
        fVar.mo77218b(0);
        fVar.mo77220d(false);
        fVar.mo77219c(1);
        return fVar;
    }

    /* renamed from: a */
    public abstract int mo77193a();

    /* renamed from: b */
    public abstract int mo77194b();

    /* renamed from: c */
    public abstract boolean mo77195c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo77193a());
        parcel.writeInt(mo77195c() ? 1 : 0);
        parcel.writeInt(mo77194b());
    }
}
