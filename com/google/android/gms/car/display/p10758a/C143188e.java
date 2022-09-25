package com.google.android.gms.car.display.p10758a;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.display.a.e */
/* compiled from: PG */
public abstract class C143188e extends C8849b implements C143189f {
    public C143188e() {
        super("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        CarDisplayId carDisplayId = (CarDisplayId) C8850c.m23492a(parcel, CarDisplayId.CREATOR);
        Rect rect = (Rect) C8850c.m23492a(parcel, Rect.CREATOR);
        enforceNoDataAvail(parcel);
        mo117986b();
        parcel2.writeNoException();
        return true;
    }
}
