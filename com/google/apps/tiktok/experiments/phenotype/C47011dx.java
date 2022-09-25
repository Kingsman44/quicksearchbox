package com.google.apps.tiktok.experiments.phenotype;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dx */
/* compiled from: PG */
final class C47011dx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C47013dz f122555a;

    public C47011dx(C47013dz dzVar) {
        this.f122555a = dzVar;
    }

    public final void run() {
        C47013dz dzVar = this.f122555a;
        C46917ak akVar = dzVar.f122560d;
        if (akVar != null && akVar.mo50921h()) {
            C46917ak akVar2 = dzVar.f122560d;
            if (akVar2 == null) {
                C69664n.m101065k("uiDeviceConfigurationState");
                akVar2 = null;
            }
            akVar2.mo50920g();
        }
        for (C46917ak akVar3 : dzVar.f122559c.values()) {
            if (akVar3.mo50921h()) {
                akVar3.mo50920g();
            }
        }
    }
}
