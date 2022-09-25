package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39497b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39501f;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39504i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.n.c.a.bk */
/* compiled from: PG */
public final /* synthetic */ class C39434bk implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103814a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103815b;

    public /* synthetic */ C39434bk(C39479cu cuVar, C39411b bVar) {
        this.f103814a = cuVar;
        this.f103815b = bVar;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103814a;
        C39411b bVar = this.f103815b;
        cuVar.f103942D = C58833ax.m90834k(true);
        cuVar.f103970u.mo41870d(C37176a.f97233hg.mo40779c(), bVar);
        cuVar.f103970u.mo41870d(C37176a.f97234hh.mo40779c(), bVar);
        cuVar.f103943E = C58833ax.m90834k(false);
        C39501f fVar = cuVar.f103957h;
        C60870cx a = C70876o.m103760a(fVar.f189039a.mo39510a(C39504i.m68926a(), fVar.f189040b), C39497b.f104020a);
        C39437bn bnVar = new C39437bn(cuVar, bVar, (HotwordInformation) obj);
        return C60922j.m93045h(a, C47810es.m84966f(bnVar), cuVar.f103953d);
    }
}
