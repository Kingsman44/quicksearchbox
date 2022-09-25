package com.google.android.play.core.p3533e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.e.h */
/* compiled from: PG */
final class C45076h extends C45069a {

    /* renamed from: a */
    final /* synthetic */ IBinder f117720a;

    /* renamed from: b */
    final /* synthetic */ C45078j f117721b;

    public C45076h(C45078j jVar, IBinder iBinder) {
        this.f117721b = jVar;
        this.f117720a = iBinder;
    }

    /* renamed from: a */
    public final void mo48871a() {
        C45079k kVar = this.f117721b.f117723a;
        kVar.f117737m = (IInterface) kVar.f117733i.mo48870a(this.f117720a);
        C45079k kVar2 = this.f117721b.f117723a;
        kVar2.f117726b.mo48886d("linkToDeath", new Object[0]);
        try {
            kVar2.f117737m.asBinder().linkToDeath(kVar2.f117735k, 0);
        } catch (RemoteException e) {
            kVar2.f117726b.mo48885c(e, "linkToDeath failed", new Object[0]);
        }
        C45079k kVar3 = this.f117721b.f117723a;
        kVar3.f117731g = false;
        for (Runnable run : kVar3.f117728d) {
            run.run();
        }
        this.f117721b.f117723a.f117728d.clear();
    }
}
