package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111053cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112562q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113193cx;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.o */
/* compiled from: PG */
public final class C111565o extends C113409et {

    /* renamed from: k */
    public static final /* synthetic */ int f310276k = 0;

    /* renamed from: a */
    public final C22871g f310277a;

    /* renamed from: b */
    public final C86124t f310278b;

    /* renamed from: c */
    public final C113251ad f310279c;

    /* renamed from: d */
    public final C112471ap f310280d;

    /* renamed from: e */
    public final C111053cn f310281e;

    /* renamed from: f */
    public final C112562q f310282f;

    /* renamed from: g */
    public final Executor f310283g;

    /* renamed from: h */
    public final C68214a f310284h;

    /* renamed from: i */
    public C60870cx f310285i = C60856cj.m92900i(C58733pz.f156496a);

    /* renamed from: j */
    public final C113193cx f310286j;

    /* renamed from: m */
    private final C68214a f310287m;

    public C111565o(C22871g gVar, C68214a aVar, C86124t tVar, C113251ad adVar, C112471ap apVar, C111053cn cnVar, C112562q qVar, C113193cx cxVar, Executor executor, C68214a aVar2) {
        this.f310277a = gVar;
        this.f310287m = aVar;
        this.f310278b = tVar;
        this.f310279c = adVar;
        this.f310280d = apVar;
        this.f310281e = cnVar;
        this.f310282f = qVar;
        this.f310286j = cxVar;
        this.f310283g = executor;
        this.f310284h = aVar2;
    }

    /* renamed from: b */
    public static C58528ij m185323b(C48645f fVar) {
        return (C58528ij) Collection.EL.stream(fVar.f125728a).map(C111557g.f310264a).collect(C58370cn.f155947b);
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.OFFLINE_WORKER;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        if (!epVar.mo100033p().isEmpty() || !this.f310278b.mo79746e(C90063do.f249448di)) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C60870cx g = ((C83581al) this.f310287m.mo27525b()).mo76932g();
        this.f310285i = this.f310277a.mo28210j(g, "get app action packages", new C111561k(this));
        return this.f310277a.mo28209i(this.f310277a.mo28210j(g, "transform opaStore to Tapas suggestion list", new C111558h(this)), "Build Tapas Suggestion response.", C111559i.f310266a);
    }
}
