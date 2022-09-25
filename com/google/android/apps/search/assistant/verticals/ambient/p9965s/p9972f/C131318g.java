package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9972f;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10000f.C131660a;
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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.f.g */
/* compiled from: PG */
public final class C131318g implements C131258a {

    /* renamed from: a */
    public static final C58528ij f359010a = new C58759qy(37);

    /* renamed from: e */
    private static final C58528ij f359011e = C58528ij.m90011K(C50794cr.GROCERY_DELIVERY, C50794cr.GROCERY_PICKUP);

    /* renamed from: b */
    public final C58974d f359012b;

    /* renamed from: c */
    public final C131660a f359013c;

    /* renamed from: d */
    public final C131251t f359014d;

    /* renamed from: f */
    private final boolean f359015f;

    /* renamed from: g */
    private final C60887da f359016g;

    public C131318g(boolean z, C130603a aVar, C131660a aVar2, C131251t tVar, C60887da daVar) {
        this.f359012b = aVar.mo109740b(this);
        this.f359013c = aVar2;
        this.f359015f = z;
        this.f359014d = tVar;
        this.f359016g = daVar;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return f359011e.mo55229u();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        C123746bm bmVar2 = (C123746bm) obj;
        if (this.f359015f) {
            return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(bmVar2.f341820a).filter(C131314c.f359006a).map(new C131315d(this)).collect(Collectors.toCollection(C131316e.f359008a)))).mo51515h(C131317f.f359009a, this.f359016g);
        }
        ((C58970a) ((C58970a) this.f359012b.mo56224b()).mo56372aa(39200)).mo56386p("Grocery feature is disabled.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
