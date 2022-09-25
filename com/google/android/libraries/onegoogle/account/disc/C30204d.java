package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.d */
/* compiled from: PG */
public final /* synthetic */ class C30204d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccountParticleDisc f81662a;

    /* renamed from: b */
    public final /* synthetic */ C30180ah f81663b;

    public /* synthetic */ C30204d(AccountParticleDisc accountParticleDisc, C30180ah ahVar) {
        this.f81662a = accountParticleDisc;
        this.f81663b = ahVar;
    }

    public final void run() {
        AccountParticleDisc accountParticleDisc = this.f81662a;
        C30180ah ahVar = this.f81663b;
        C30195aw awVar = accountParticleDisc.f81551e;
        C19559g.m37304c();
        awVar.mo35653c(awVar.f81636b, awVar.f81637c);
        awVar.f81636b = ahVar;
        awVar.mo35652b(ahVar, awVar.f81637c);
        accountParticleDisc.mo35598p();
    }
}
