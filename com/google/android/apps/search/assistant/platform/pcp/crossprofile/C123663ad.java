package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.enterprise.connectedapps.C142570e;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.ad */
/* compiled from: PG */
public final class C123663ad implements C123687w {

    /* renamed from: a */
    public static final C59071e f341624a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.crossprofile.ad");

    /* renamed from: b */
    private final C123659a f341625b;

    /* renamed from: c */
    private final C123666c f341626c;

    public C123663ad(C123659a aVar, C123666c cVar) {
        this.f341625b = aVar;
        this.f341626c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo106087a(C53306j jVar, Set set, boolean z, C123755bv bvVar, C123777f fVar, boolean z2) {
        C60870cx cxVar;
        C142570e i = this.f341626c.mo117178i();
        if (!this.f341626c.mo117175b().mo117165q() || C142574h.m231178b(i.f386862c)) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = C60922j.m93045h(this.f341625b.mo106086b().mo106100a(jVar.f139793X, set, z, bvVar, fVar, z2), C47810es.m84966f(C123661ab.f341622a), C60826bg.f164896a);
        }
        C123688x xVar = C123688x.f341654a;
        return C60846c.m92879h(cxVar, Exception.class, C47810es.m84966f(xVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo106088b(C58528ij ijVar) {
        C60870cx c = this.f341625b.mo106086b().mo106102c(new ArrayList(ijVar));
        C123662ac acVar = C123662ac.f341623a;
        return C60846c.m92879h(c, Exception.class, C47810es.m84966f(acVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final boolean mo106089c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo106090d() {
        return C142574h.m231178b(this.f341626c.mo117178i().f386862c);
    }

    /* renamed from: e */
    public final void mo106091e(List list) {
        if (!C142574h.m231178b(this.f341626c.mo117178i().f386862c)) {
            C60870cx cxVar = C60866ct.f164955a;
            return;
        }
        C123659a aVar = this.f341625b;
        C60870cx b = aVar.mo106085a(aVar.f341620a.mo117178i().mo117185a()).mo106101b((List) Collection.EL.stream(list).map(C123689y.f341655a).collect(Collectors.toCollection(C123690z.f341656a)));
        C123660aa aaVar = C123660aa.f341621a;
        C60846c.m92879h(b, Exception.class, C47810es.m84966f(aaVar), C60826bg.f164896a);
    }
}
