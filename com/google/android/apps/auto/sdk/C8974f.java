package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.auto.sdk.f */
/* compiled from: PG */
public final class C8974f {

    /* renamed from: a */
    public final C8992x f31101a;

    /* renamed from: b */
    private final C8979k f31102b;

    public C8974f(C8979k kVar, C8992x xVar) {
        this.f31102b = kVar;
        this.f31101a = xVar;
        try {
            C8973e eVar = new C8973e(this);
            Parcel gA = kVar.mo17260gA();
            C8850c.m23499h(gA, eVar);
            kVar.mo17262he(5, gA);
        } catch (RemoteException e) {
            Log.e("CSL.DrawerController", "Error setting DrawerCallbacks", e);
        }
    }
}
