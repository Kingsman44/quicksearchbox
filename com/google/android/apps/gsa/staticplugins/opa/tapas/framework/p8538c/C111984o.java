package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111792a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111884bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111997e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.o */
/* compiled from: PG */
public final class C111984o extends C68247h {

    /* renamed from: a */
    private final C68283d f311094a;

    /* renamed from: c */
    private final C68283d f311095c;

    /* renamed from: d */
    private final C68283d f311096d;

    /* renamed from: e */
    private final C68283d f311097e;

    /* renamed from: f */
    private final C68283d f311098f;

    /* renamed from: g */
    private final C68283d f311099g;

    /* renamed from: h */
    private final C69464a f311100h;

    /* renamed from: i */
    private final C68283d f311101i;

    /* renamed from: j */
    private final C68283d f311102j;

    /* renamed from: k */
    private final C68283d f311103k;

    /* renamed from: l */
    private final C68283d f311104l;

    public C111984o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C69464a aVar3, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10) {
        super(aVar2, new C68277d(C111984o.class), aVar);
        this.f311094a = C68236af.m98549d(dVar);
        this.f311095c = C68236af.m98549d(dVar2);
        this.f311096d = C68236af.m98549d(dVar3);
        this.f311097e = C68236af.m98549d(dVar4);
        this.f311098f = C68236af.m98549d(dVar5);
        this.f311099g = C68236af.m98549d(dVar6);
        this.f311100h = aVar3;
        this.f311101i = C68236af.m98549d(dVar7);
        this.f311102j = C68236af.m98549d(dVar8);
        this.f311103k = C68236af.m98549d(dVar9);
        this.f311104l = C68236af.m98549d(dVar10);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C113405ep epVar = (C113405ep) list.get(0);
        Map map = (Map) list.get(2);
        C22871g gVar = (C22871g) list.get(5);
        C68214a a = C68219e.m98518a(this.f311100h);
        C111792a aVar = (C111792a) list.get(6);
        C86124t tVar = (C86124t) list.get(8);
        C58485gu a2 = ((C111884bv) list.get(1)).mo99271a(epVar);
        aVar.mo99235a(epVar.mo100016a(), epVar.mo100033p());
        aVar.mo99236b(epVar.mo100016a());
        C58495hd hdVar = (C58495hd) Collection.EL.stream(a2).filter(C111978i.f311083a).filter(new C111979j(map)).collect(C58370cn.m89403c(C111980k.f311085a, new C111981l(map, (C21370a) list.get(7), a, epVar, gVar, (C111948ap) list.get(4)), C111982m.f311092a));
        ((C111997e) list.get(9)).mo99332a(hdVar);
        return ((C111977h) list.get(3)).mo99328a(hdVar, epVar.mo100033p(), C111885bw.m185717c(epVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f311094a.mo60297gq(), this.f311095c.mo60297gq(), this.f311096d.mo60297gq(), this.f311097e.mo60297gq(), this.f311098f.mo60297gq(), this.f311099g.mo60297gq(), this.f311101i.mo60297gq(), this.f311102j.mo60297gq(), this.f311103k.mo60297gq(), this.f311104l.mo60297gq());
    }
}
