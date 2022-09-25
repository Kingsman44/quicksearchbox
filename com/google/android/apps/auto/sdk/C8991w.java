package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.car.p10759e.C143212d;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.auto.sdk.w */
/* compiled from: PG */
public final class C8991w {

    /* renamed from: a */
    public final C143212d f31105a;

    /* renamed from: b */
    public final C8972d f31106b;

    /* renamed from: c */
    private final C8983o f31107c;

    public C8991w(C8983o oVar, C143212d dVar, C8972d dVar2) {
        this.f31107c = oVar;
        this.f31105a = dVar;
        this.f31106b = dVar2;
        try {
            C8989u uVar = new C8989u(this);
            Parcel gA = oVar.mo17260gA();
            C8850c.m23499h(gA, uVar);
            oVar.mo17262he(1, gA);
        } catch (RemoteException e) {
            Log.e("CSL.ImeController", "Error setting ImeCallbacks", e);
        }
    }

    /* renamed from: a */
    public final void mo17304a() {
        this.f31105a.mo118251a();
    }

    /* renamed from: b */
    public final boolean mo17305b() {
        return this.f31105a.mo118252b();
    }
}
