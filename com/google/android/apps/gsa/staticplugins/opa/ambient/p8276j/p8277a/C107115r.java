package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.C107082a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.C110927t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.r */
/* compiled from: PG */
public final class C107115r implements C107082a {

    /* renamed from: a */
    public static final C58528ij f298187a = C58528ij.m90012L(C50794cr.HAMMERSPACE_DEBUG, C50794cr.SHOPPING_LIST, C50794cr.LOYALTY_CARD);

    /* renamed from: b */
    public final C58974d f298188b;

    /* renamed from: c */
    public final C60887da f298189c;

    /* renamed from: d */
    public final C83785c f298190d;

    /* renamed from: e */
    public final C110927t f298191e;

    /* renamed from: f */
    private final C86124t f298192f;

    public C107115r(C86124t tVar, C60887da daVar, C83785c cVar, C110927t tVar2, C83564a aVar) {
        this.f298192f = tVar;
        this.f298189c = daVar;
        this.f298190d = cVar;
        this.f298191e = tVar2;
        this.f298188b = aVar.mo76900a("AA-SSCardSurface");
    }

    /* renamed from: a */
    public final C60870cx mo95785a(C106596h hVar, C58485gu guVar) {
        if (!this.f298192f.mo79746e(C90017bw.f247969be)) {
            return C118826c.f331423b;
        }
        if (this.f298192f.mo79746e(C90017bw.f248018cr)) {
            guVar = C58485gu.m89845m();
        }
        C83785c cVar = this.f298190d;
        C58836b bVar = C58836b.f156633a;
        C60870cx c = cVar.mo77121c(bVar, bVar);
        C107107j jVar = new C107107j((C58528ij) Collection.EL.stream(guVar).map(C107106i.f298177a).collect(C58370cn.f155947b));
        C60870cx g = C60922j.m93044g(c, C47810es.m84963c(jVar), this.f298189c);
        C107108k kVar = new C107108k(this);
        return C47638k.m84751b(C60922j.m93045h(g, C47810es.m84966f(kVar), this.f298189c)).mo51521b(new C107109l(this, guVar), this.f298189c);
    }
}
