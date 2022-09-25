package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C107085ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107097an f298140a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f298141b;

    /* renamed from: c */
    public final /* synthetic */ C106596h f298142c;

    /* renamed from: d */
    public final /* synthetic */ C58528ij f298143d;

    public /* synthetic */ C107085ab(C107097an anVar, C58528ij ijVar, C106596h hVar, C58528ij ijVar2) {
        this.f298140a = anVar;
        this.f298141b = ijVar;
        this.f298142c = hVar;
        this.f298143d = ijVar2;
    }

    public final C60870cx apply(Object obj) {
        C107097an anVar = this.f298140a;
        C58528ij ijVar = this.f298141b;
        C106596h hVar = this.f298142c;
        C58528ij ijVar2 = this.f298143d;
        C58528ij ijVar3 = (C58528ij) obj;
        Collection.EL.stream(ijVar3).forEach(new C107094ak(anVar));
        C58528ij ijVar4 = (C58528ij) Collection.EL.stream(ijVar3).filter(new C107096am(ijVar)).collect(C58370cn.f155947b);
        if (Collection.EL.stream((C58528ij) Collection.EL.stream(ijVar).filter(new C107095al(ijVar3)).collect(C58370cn.f155947b)).anyMatch(C107118u.f298194a) && hVar.f297209d != 0) {
            C39141kp kpVar = anVar.f298162f;
            double b = (double) (anVar.f298163g.mo26870b() - hVar.f297209d);
            C106595g a = C106595g.m177369a(hVar.f297218m);
            if (a == null) {
                a = C106595g.UNSPECIFIED;
            }
            ((C19569f) kpVar.f102892bW.mo6453a()).mo24824b(b, a.name());
        }
        if (Collection.EL.stream(ijVar4).anyMatch(C107119v.f298195a) && hVar.f297210e != 0) {
            C39141kp kpVar2 = anVar.f298162f;
            double b2 = (double) (anVar.f298163g.mo26870b() - hVar.f297210e);
            C106595g a2 = C106595g.m177369a(hVar.f297218m);
            if (a2 == null) {
                a2 = C106595g.UNSPECIFIED;
            }
            ((C19569f) kpVar2.f102882bM.mo6453a()).mo24824b(b2, a2.name());
        }
        return C47638k.m84751b(C47638k.m84750a((Iterable) Collection.EL.stream(ijVar4).map(new C107091ah(anVar)).collect(C58370cn.f155947b)).mo51520a(C107092ai.f298151a, anVar.f298161e), C47638k.m84750a((Iterable) Collection.EL.stream(ijVar2).map(new C107117t(anVar)).collect(C58370cn.f155947b)).mo51520a(C107088ae.f298147a, anVar.f298161e)).mo51520a(C107120w.f298196a, anVar.f298161e);
    }
}
