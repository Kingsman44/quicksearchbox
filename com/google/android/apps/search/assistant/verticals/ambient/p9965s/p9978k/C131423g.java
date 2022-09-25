package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9978k;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10003i.C131674a;
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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.k.g */
/* compiled from: PG */
public final class C131423g implements C131258a {

    /* renamed from: a */
    public static final C58528ij f359230a = C58528ij.m90011K(41, 25);

    /* renamed from: e */
    private static final C58528ij f359231e = new C58759qy(C50794cr.REMINDER);

    /* renamed from: b */
    public final C58974d f359232b;

    /* renamed from: c */
    public final C131674a f359233c;

    /* renamed from: d */
    public final C131251t f359234d;

    /* renamed from: f */
    private final boolean f359235f;

    /* renamed from: g */
    private final C60887da f359236g;

    public C131423g(boolean z, C130603a aVar, C131674a aVar2, C131251t tVar, C60887da daVar) {
        this.f359232b = aVar.mo109740b(this);
        this.f359233c = aVar2;
        this.f359235f = z;
        this.f359234d = tVar;
        this.f359236g = daVar;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(((C58759qy) f359231e).f156534a);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123746bm bmVar2 = (C123746bm) obj;
        if (this.f359235f) {
            return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131417a.f359224a).map(new C131418b(this)).collect(Collectors.toCollection(C131419c.f359226a)))).mo51515h(C131420d.f359227a, this.f359236g);
        }
        ((C58970a) ((C58970a) this.f359232b.mo56224b()).mo56372aa(39249)).mo56386p("Reminder feature is disabled.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
