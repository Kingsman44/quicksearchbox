package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import org.chromium.weblayer.C72575ak;
import org.chromium.weblayer.C72632u;
import org.chromium.weblayer.C72633v;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.m */
/* compiled from: PG */
final class C44285m extends C72633v {

    /* renamed from: a */
    final /* synthetic */ C44296x f115181a;

    public C44285m(C44296x xVar) {
        this.f115181a = xVar;
    }

    /* renamed from: a */
    public final C72632u mo47196a(C72575ak akVar) {
        C69664n.m101061g(akVar, "navigation");
        C44296x xVar = this.f115181a;
        if (((Boolean) xVar.f115196e.mo5761a(xVar.f115194c.mo47176a(akVar))).booleanValue()) {
            return new C72632u();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo47197b() {
        if (this.f115181a.f115192a.mo64474d().mo64451e()) {
            return false;
        }
        this.f115181a.f115195d.f113006a.ifPresent(C44284l.f115180a);
        this.f115181a.f115192a.mo64473c().mo64484c(this.f115181a.f115192a);
        return true;
    }
}
