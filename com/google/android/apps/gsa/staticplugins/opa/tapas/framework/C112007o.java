package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111948ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.o */
/* compiled from: PG */
public final /* synthetic */ class C112007o implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311168a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311169b;

    public /* synthetic */ C112007o(C111825ap apVar, C113405ep epVar) {
        this.f311168a = apVar;
        this.f311169b = epVar;
    }

    public final Object get() {
        C111825ap apVar = this.f311168a;
        C113405ep epVar = this.f311169b;
        if (apVar.f310769c.mo79746e(C90063do.f249319bL)) {
            ((C111248k) apVar.f310777k.mo27525b()).mo99076a(C111255r.GENERAL, String.format("Prefix change detected: \"%s\"", new Object[]{epVar.mo100033p()}));
        }
        if (apVar.f310769c.mo79746e(C90063do.f249399cm)) {
            if (epVar.mo100033p().isEmpty()) {
                ((C107662av) apVar.f310784r.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_START);
            } else {
                ((C107662av) apVar.f310784r.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_START);
            }
            ((C113389c) apVar.f310790x.mo27525b()).mo99630e(epVar.mo100016a(), "Modular engine sources fetch start");
            long c = apVar.f310774h.mo26871c();
            C60870cx a = apVar.f310779m.mo99335a(epVar, new C112016x(apVar));
            a.mo4106b(new C112017y(apVar, c, epVar), C60826bg.f164896a);
            return a;
        }
        ((C111948ap) apVar.f310783q.mo27525b()).f311016e.set(epVar.mo100017b());
        apVar.f310775i.set(epVar.mo100033p());
        return apVar.f310779m.mo99335a(epVar, new C112010r(apVar));
    }
}
