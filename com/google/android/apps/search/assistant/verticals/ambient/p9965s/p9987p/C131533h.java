package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9987p;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9994b.C131598a;
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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.p.h */
/* compiled from: PG */
public final class C131533h implements C131258a {

    /* renamed from: a */
    public static final C58528ij f359404a = new C58759qy(17);

    /* renamed from: f */
    private static final C58528ij f359405f = new C58759qy(C50794cr.CALENDAR);

    /* renamed from: b */
    public final C58974d f359406b;

    /* renamed from: c */
    public final C131598a f359407c;

    /* renamed from: d */
    public final C131251t f359408d;

    /* renamed from: e */
    public final C60887da f359409e;

    /* renamed from: g */
    private final boolean f359410g;

    public C131533h(C130603a aVar, C131598a aVar2, C131251t tVar, C60887da daVar, boolean z) {
        this.f359406b = aVar.mo109740b(this);
        this.f359407c = aVar2;
        this.f359408d = tVar;
        this.f359409e = daVar;
        this.f359410g = z;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(((C58759qy) f359405f).f156534a);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123746bm bmVar2 = (C123746bm) obj;
        if (this.f359410g) {
            return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131529d.f359400a).map(new C131530e(this)).collect(Collectors.toCollection(C131531f.f359402a)))).mo51515h(C131532g.f359403a, this.f359409e);
        }
        ((C58970a) ((C58970a) this.f359406b.mo56224b()).mo56372aa(39304)).mo56386p("Calendar feature is disabled for smartspace TNG.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
