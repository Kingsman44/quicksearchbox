package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bg */
/* compiled from: PG */
final class C113552bg implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ long f314362a;

    /* renamed from: b */
    final /* synthetic */ String f314363b;

    /* renamed from: c */
    final /* synthetic */ long f314364c;

    /* renamed from: d */
    final /* synthetic */ C113558bm f314365d;

    public C113552bg(C113558bm bmVar, long j, String str, long j2) {
        this.f314365d = bmVar;
        this.f314362a = j;
        this.f314363b = str;
        this.f314364c = j2;
    }

    public final boolean onPreDraw() {
        this.f314365d.f314416f.getViewTreeObserver().removeOnPreDrawListener(this);
        C113558bm bmVar = this.f314365d;
        bmVar.f314431u = null;
        long c = bmVar.f314420j.mo26871c() - this.f314362a;
        if (this.f314365d.f314432v.get() >= this.f314362a) {
            C58976aa aaVar = C58975e.f156826a;
            this.f314365d.f314432v.set(0);
            return true;
        }
        if (this.f314363b.length() == 0) {
            ((C107662av) this.f314365d.f314430t.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_SHOWN);
        } else {
            ((C107662av) this.f314365d.f314430t.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_SHOWN);
        }
        if (this.f314365d.mo99368y()) {
            C113558bm bmVar2 = this.f314365d;
            ((C112705m) bmVar2.f314423m.mo27525b()).mo99671f(this.f314364c, this.f314363b);
            ((C112686ax) this.f314365d.f314424n.mo27525b()).mo99642a(c, this.f314363b.length());
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            this.f314365d.mo99364jC(this.f314364c, this.f314363b);
        }
        return true;
    }
}
