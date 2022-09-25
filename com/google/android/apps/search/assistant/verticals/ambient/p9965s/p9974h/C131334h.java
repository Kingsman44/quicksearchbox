package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9974h;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10002h.C131672e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.h.h */
/* compiled from: PG */
public final class C131334h implements C131258a {

    /* renamed from: a */
    public static final C58528ij f359038a = new C58759qy(40);

    /* renamed from: f */
    private static final C58528ij f359039f = new C58759qy(C50794cr.HOTEL_CHECK_OUT);

    /* renamed from: b */
    public final C58974d f359040b;

    /* renamed from: c */
    public final C131672e f359041c;

    /* renamed from: d */
    public final C131251t f359042d;

    /* renamed from: e */
    public final C60887da f359043e;

    /* renamed from: g */
    private final boolean f359044g;

    public C131334h(boolean z, C130603a aVar, C131672e eVar, C131251t tVar, C60887da daVar) {
        this.f359044g = z;
        this.f359040b = aVar.mo109740b(this);
        this.f359041c = eVar;
        this.f359042d = tVar;
        this.f359043e = daVar;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(((C58759qy) f359039f).f156534a);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123746bm bmVar2 = (C123746bm) obj;
        if (this.f359044g) {
            return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131328b.f359032a).map(new C131329c(this)).collect(Collectors.toCollection(C131330d.f359034a)))).mo51515h(C131331e.f359035a, this.f359043e);
        }
        ((C58970a) ((C58970a) this.f359040b.mo56224b()).mo56372aa(39205)).mo56386p("Hotel feature is disabled.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
