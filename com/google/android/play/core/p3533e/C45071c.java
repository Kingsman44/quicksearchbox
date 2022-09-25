package com.google.android.play.core.p3533e;

import android.os.IBinder;

/* renamed from: com.google.android.play.core.e.c */
/* compiled from: PG */
public final /* synthetic */ class C45071c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ C45079k f117716a;

    public /* synthetic */ C45071c(C45079k kVar) {
        this.f117716a = kVar;
    }

    public final void binderDied() {
        C45079k kVar = this.f117716a;
        kVar.f117726b.mo48886d("reportBinderDeath", new Object[0]);
        C45074f fVar = (C45074f) kVar.f117734j.get();
        if (fVar != null) {
            kVar.f117726b.mo48886d("calling onBinderDied", new Object[0]);
            fVar.mo48904a();
        } else {
            kVar.f117726b.mo48886d("%s : Binder has died.", kVar.f117727c);
            for (C45069a b : kVar.f117728d) {
                b.mo48901b(kVar.mo48908b());
            }
            kVar.f117728d.clear();
        }
        kVar.mo48910d();
    }
}
