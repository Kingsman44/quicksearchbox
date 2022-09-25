package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.y */
/* compiled from: PG */
public final /* synthetic */ class C112017y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311189a;

    /* renamed from: b */
    public final /* synthetic */ long f311190b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311191c;

    public /* synthetic */ C112017y(C111825ap apVar, long j, C113405ep epVar) {
        this.f311189a = apVar;
        this.f311190b = j;
        this.f311191c = epVar;
    }

    public final void run() {
        C111825ap apVar = this.f311189a;
        long j = this.f311190b;
        C113405ep epVar = this.f311191c;
        ((C111806n) apVar.f310778l.mo27525b()).mo99250a(epVar.mo100016a(), epVar.mo100033p(), "Combined Source + Mix Latency, ".concat(true != apVar.f310769c.mo79746e(C90063do.f249410cx) ? "prefetch disabled" : "prefetch enabled"), apVar.f310774h.mo26871c() - j);
        ((C113389c) apVar.f310790x.mo27525b()).mo99630e(epVar.mo100016a(), "Modular engine sources fetch completed");
    }
}
