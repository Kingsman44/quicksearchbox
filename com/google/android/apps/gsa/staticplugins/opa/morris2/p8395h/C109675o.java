package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.common.p4552o.C59728dm;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.o */
/* compiled from: PG */
public final /* synthetic */ class C109675o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109685y f305459a;

    /* renamed from: b */
    public final /* synthetic */ Optional f305460b;

    public /* synthetic */ C109675o(C109685y yVar, Optional optional) {
        this.f305459a = yVar;
        this.f305460b = optional;
    }

    public final void run() {
        C109685y yVar = this.f305459a;
        Optional optional = this.f305460b;
        if (!yVar.f305502k.mo21578l() || (optional.isPresent() && !((C59728dm) optional.get()).equals(C59728dm.SUCCESS))) {
            if (yVar.f305503l) {
                yVar.f305501j.set(C17823i.UNKNOWN);
            } else {
                yVar.f305499h.mo5708l(C17823i.UNKNOWN);
            }
            if (yVar.f305504m && !yVar.f305493b.mo79746e(C90051dc.f248918o)) {
                synchronized (yVar) {
                    yVar.f305506o = Optional.empty();
                }
            }
        }
    }
}
