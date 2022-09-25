package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.api.internal.bs */
/* compiled from: PG */
public final class C143771bs extends C8848a implements C143773bu {
    public C143771bs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* renamed from: a */
    public final void mo117762a(Status status) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, status);
        mo17263hf(1, gA);
    }
}
