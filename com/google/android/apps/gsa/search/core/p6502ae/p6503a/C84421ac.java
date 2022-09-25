package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7144t.C90611b;
import com.google.android.apps.gsa.shared.p7144t.C90612c;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21467o;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21540h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ac */
/* compiled from: PG */
public final class C84421ac {

    /* renamed from: a */
    public final C84424af f229707a;

    /* renamed from: b */
    public boolean f229708b = false;

    /* renamed from: c */
    public boolean f229709c;

    public C84421ac(C84424af afVar) {
        this.f229707a = afVar;
    }

    /* renamed from: a */
    public final void mo77989a() {
        this.f229709c = true;
        if (this.f229708b) {
            this.f229707a.mo77992a();
        }
    }

    /* renamed from: b */
    public final void mo77990b() {
        this.f229709c = false;
        if (this.f229708b && this.f229707a.f229713d.f59932a.mo119133h()) {
            C84424af afVar = this.f229707a;
            C59071e eVar = C84425ag.f229718a;
            C58976aa aaVar = C58975e.f156826a;
            if (afVar.f229713d.f59932a.mo119133h()) {
                afVar.f229713d.f59932a.mo119132g();
                afVar.f229713d = (C21529b) afVar.f229710a.mo6453a();
                new C21544l();
                afVar.f229712c = C21544l.m40656c(afVar.f229713d);
            }
        }
    }

    /* renamed from: c */
    public final C60870cx mo77991c(String str, int i, C21467o oVar) {
        C59071e eVar = C84425ag.f229718a;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f229708b || !this.f229707a.f229713d.f59932a.mo119133h()) {
            return C60866ct.f164955a;
        }
        C84424af afVar = this.f229707a;
        C90612c cVar = new C90612c(afVar.f229711b.mo27078c(afVar.f229713d, str, i, oVar));
        C21539g gVar = cVar.f253287b;
        gVar.f59939a.mo117321f(new C21540h(new C90611b(cVar), gVar.f59940b));
        C60870cx g = C60922j.m93044g(cVar, new C84423ae(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
