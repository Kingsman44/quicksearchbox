package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.p2081au.C25562l;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.main.ab */
/* compiled from: PG */
final class C27285ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25562l f74656a;

    /* renamed from: b */
    final /* synthetic */ C27288ae f74657b;

    public C27285ab(C27288ae aeVar, C25562l lVar) {
        this.f74657b = aeVar;
        this.f74656a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f74657b.f74676i.mo30255d(th instanceof CancellationException ? C62722b.CANCELLED : C62722b.INTERNAL, this.f74656a.mo30631b().mo29680c(), 1);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
