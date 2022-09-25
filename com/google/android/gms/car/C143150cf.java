package com.google.android.gms.car;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.cf */
/* compiled from: PG */
public final class C143150cf extends C8848a implements IInterface {
    public C143150cf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjectionCallback");
    }

    /* renamed from: e */
    public final void mo118109e(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17262he(33, gA);
    }

    /* renamed from: f */
    public final void mo118110f(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17262he(9, gA);
    }
}
