package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.e */
/* compiled from: PG */
public final /* synthetic */ class C30205e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccountParticleDisc f81664a;

    /* renamed from: b */
    public final /* synthetic */ C30158c f81665b;

    public /* synthetic */ C30205e(AccountParticleDisc accountParticleDisc, C30158c cVar) {
        this.f81664a = accountParticleDisc;
        this.f81665b = cVar;
    }

    public final void run() {
        AccountParticleDisc accountParticleDisc = this.f81664a;
        C30158c cVar = this.f81665b;
        C30195aw awVar = accountParticleDisc.f81551e;
        C30185am amVar = new C30185am(new C30187ao(accountParticleDisc.getResources()), cVar);
        C19559g.m37304c();
        awVar.mo35653c(awVar.f81635a, awVar.f81637c);
        awVar.f81635a = amVar;
        awVar.mo35652b(amVar, awVar.f81637c);
    }
}
