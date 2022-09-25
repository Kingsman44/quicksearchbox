package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26517cv;
import com.google.android.libraries.lens.view.gleam.C26518cw;
import com.google.android.libraries.lens.view.gleam.C26519cx;
import com.google.android.libraries.lens.view.gleam.C26520cy;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25531n;
import com.google.android.libraries.lens.view.p2078at.C25532o;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60922j;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.main.am */
/* compiled from: PG */
public final /* synthetic */ class C27296am implements C25532o {

    /* renamed from: a */
    public final /* synthetic */ C27327bq f74704a;

    /* renamed from: b */
    public final /* synthetic */ boolean f74705b;

    /* renamed from: c */
    public final /* synthetic */ C25533p f74706c;

    public /* synthetic */ C27296am(C27327bq bqVar, boolean z, C25533p pVar) {
        this.f74704a = bqVar;
        this.f74705b = z;
        this.f74706c = pVar;
    }

    /* renamed from: a */
    public final void mo30586a(C25531n nVar) {
        C24231w wVar;
        C27327bq bqVar = this.f74704a;
        boolean z = this.f74705b;
        C25533p pVar = this.f74706c;
        C26505cj cjVar = bqVar.f74767M;
        long a = nVar.mo30577a();
        C26526dd ddVar = (C26526dd) cjVar;
        C58838bb.m90883r(((C25497ac) ddVar.f72311u.mo3842a()).mo30525b());
        if (a != 0 && ddVar.f72304n == a) {
            ddVar.mo31805y();
        } else {
            ddVar.f72304n = a;
            C27793m mVar = ddVar.f72305o;
            if (mVar == null) {
                ddVar.f72294d.execute(C47810es.m84977q(new C26517cv(ddVar, a)));
            } else {
                ddVar.f72305o = null;
                C60871cy cyVar = new C60871cy((Callable) new C26518cw(ddVar, a));
                ddVar.f72294d.execute(cyVar);
                C46459k.m82829b(C60922j.m93044g(C60922j.m93044g(cyVar, C47810es.m84963c(new C26519cx(ddVar, mVar)), ddVar.f72293c), C47810es.m84963c(new C26520cy(ddVar)), ddVar.f72294d), "Freezing gleams failed.", new Object[0]);
            }
        }
        if (!bqVar.f74806k) {
            boolean z2 = !z;
            if (bqVar.f74777W.mo31207f(C56306df.EDUCATION)) {
                if (bqVar.mo32870C() || ((C26526dd) bqVar.f74767M).f72283F.mo56113h()) {
                    C25523f fVar = (C25523f) pVar;
                    if (fVar.f69506d.mo56113h()) {
                        wVar = ((C27777bm) fVar.f69506d.mo56107c()).mo33256c();
                    } else {
                        wVar = C24231w.UNKNOWN;
                    }
                    if (z2) {
                        if (wVar == C24231w.TEXT) {
                            return;
                        }
                    } else if (wVar != C24231w.FILTER_SWITCH) {
                        return;
                    }
                    bqVar.f74799d.execute(C47810es.m84977q(new C27294ak(bqVar)));
                }
            }
        }
    }
}
