package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.common.data.f */
/* compiled from: PG */
public class C143866f extends C143861a {

    /* renamed from: b */
    private final Parcelable.Creator f389977b;

    public C143866f(DataHolder dataHolder, Parcelable.Creator creator) {
        super(dataHolder);
        this.f389977b = creator;
    }

    /* renamed from: a */
    public SafeParcelable mo119329d(int i) {
        DataHolder dataHolder = this.f389971a;
        C143919bh.m233958a(dataHolder);
        byte[] e = dataHolder.mo119321e("data", i, dataHolder.mo119316a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(e, 0, e.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) this.f389977b.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
