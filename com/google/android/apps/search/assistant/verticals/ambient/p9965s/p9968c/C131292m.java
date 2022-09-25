package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9968c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131655e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.c.m */
/* compiled from: PG */
public final class C131292m implements C131258a {

    /* renamed from: e */
    public static final /* synthetic */ int f358955e = 0;

    /* renamed from: f */
    private static final C58528ij f358956f = new C58759qy(C50794cr.FLIGHT);

    /* renamed from: a */
    public final C58974d f358957a;

    /* renamed from: b */
    public final C131655e f358958b;

    /* renamed from: c */
    public final C131251t f358959c;

    /* renamed from: d */
    public final C60887da f358960d;

    public C131292m(C130603a aVar, C131655e eVar, C131251t tVar, C60887da daVar) {
        this.f358957a = aVar.mo109740b(this);
        this.f358958b = eVar;
        this.f358959c = tVar;
        this.f358960d = daVar;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(((C58759qy) f358956f).f156534a);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123746bm bmVar2 = (C123746bm) obj;
        C47633f h = C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131287h.f358950a).map(new C131288i(this)).collect(Collectors.toCollection(C131289j.f358952a)))).mo51515h(C131290k.f358953a, this.f358960d);
        C47633f h2 = C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131291l.f358954a).map(new C131288i(this)).collect(Collectors.toCollection(C131289j.f358952a)))).mo51515h(C131281b.f358943a, this.f358960d);
        return C47636i.m84744c(h, h2).mo51518a(new C131282c(h, h2), this.f358960d);
    }
}
