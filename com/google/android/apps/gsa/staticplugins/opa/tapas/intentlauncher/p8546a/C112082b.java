package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8546a;

import android.support.p033v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.a.b */
/* compiled from: PG */
final class C112082b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ long f311263a;

    /* renamed from: b */
    final /* synthetic */ String f311264b;

    /* renamed from: c */
    final /* synthetic */ long f311265c;

    /* renamed from: d */
    final /* synthetic */ C112084d f311266d;

    public C112082b(C112084d dVar, long j, String str, long j2) {
        this.f311266d = dVar;
        this.f311263a = j;
        this.f311264b = str;
        this.f311265c = j2;
    }

    public final boolean onPreDraw() {
        if (this.f311266d.f311275h.isPresent()) {
            ((RecyclerView) this.f311266d.f311275h.get()).getViewTreeObserver().removeOnPreDrawListener(this);
        }
        C112084d dVar = this.f311266d;
        dVar.f311274g = null;
        long c = dVar.f311269b.mo26871c() - this.f311263a;
        if (this.f311266d.f311273f.get() >= this.f311263a) {
            C58976aa aaVar = C58975e.f156826a;
            this.f311266d.f311273f.set(0);
            return true;
        }
        if (this.f311264b.length() == 0) {
            ((C107662av) this.f311266d.f311270c.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_SHOWN);
        } else {
            ((C107662av) this.f311266d.f311270c.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_SHOWN);
        }
        C112084d dVar2 = this.f311266d;
        ((C112705m) dVar2.f311271d.mo27525b()).mo99671f(this.f311265c, this.f311264b);
        ((C112686ax) this.f311266d.f311272e.mo27525b()).mo99642a(c, this.f311264b.length());
        C58976aa aaVar2 = C58975e.f156826a;
        return true;
    }
}
