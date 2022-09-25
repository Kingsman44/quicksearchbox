package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10470a;

import android.content.Context;
import android.support.p033v7.app.C0401v;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8867w.p8879i.C118818s;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.search.p10406c.C137400a;
import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10406c.C137402c;
import com.google.android.apps.search.googleapp.search.p10406c.C137403d;
import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.apps.search.googleapp.search.p10420k.C137546e;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138776m;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138777n;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138778o;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138756q;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138758s;
import com.google.android.libraries.assistant.p1533o.C18442ae;
import com.google.android.libraries.assistant.p1533o.C18494l;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.a.c */
/* compiled from: PG */
public final class C138725c extends C18442ae {

    /* renamed from: a */
    private final C60887da f377301a;

    /* renamed from: b */
    private final C137401b f377302b;

    /* renamed from: c */
    private final C138778o f377303c;

    public C138725c(C60887da daVar, C138778o oVar, C137401b bVar) {
        this.f377303c = oVar;
        this.f377301a = daVar;
        this.f377302b = bVar;
    }

    /* renamed from: b */
    public final C70862aj mo23986b(C70862aj ajVar) {
        C137401b bVar = this.f377302b;
        C137403d dVar = bVar.f373727a;
        Context context = (Context) dVar.f373739a.mo17428b();
        context.getClass();
        C137493b bVar2 = (C137493b) dVar.f373740b.mo17428b();
        bVar2.getClass();
        Boolean bool = (Boolean) dVar.f373741c.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C37215b bVar3 = (C37215b) dVar.f373742d.mo17428b();
        bVar3.getClass();
        C137402c cVar = new C137402c(ajVar, context, bVar2, booleanValue, bVar3);
        bVar.f373728b = new C137400a(cVar, ajVar);
        return cVar;
    }

    /* renamed from: c */
    public final void mo23987c(C18494l lVar, C70862aj ajVar) {
        C60870cx cxVar;
        C138778o oVar = this.f377303c;
        boolean z = lVar.f52436a;
        C60870cx a = oVar.f377484b.mo111320a();
        C138758s sVar = oVar.f377485c;
        C137546e eVar = oVar.f377487e;
        C133933a aVar = oVar.f377488f;
        int i = C0401v.f1356b;
        C137542d b = eVar.mo113807b(BuildConfig.FLAVOR, C133933a.m217248a(aVar.f364779a), BuildConfig.FLAVOR, z ? 11 : 7, C58729pv.f156485a);
        C69664n.m101061g(b, "query");
        C60870cx a2 = C71663i.m104688a(C71803m.m105042c(sVar.f377416c, (C69585o) null, (C71424ay) null, new C138756q(sVar, b, (C69577g) null), 3));
        if (z) {
            cxVar = C47633f.m84733g(C60856cj.m92900i(((C118818s) oVar.f377483a).f331393a.getString("spoken-language-bcp-47", BuildConfig.FLAVOR))).mo51515h(C138776m.f377477a, C60826bg.f164896a);
        } else {
            cxVar = oVar.f377483a.mo104001d();
        }
        C60870cx cxVar2 = cxVar;
        C60870cx a3 = oVar.f377489g.mo114610a();
        C60870cx a4 = C47638k.m84753d(a, a2, cxVar2, a3).mo51520a(new C138777n(oVar, a, a2, cxVar2, a3), C60826bg.f164896a);
        ((C70883v) ajVar).mo62583d(new C138723a(a4));
        C60856cj.m92911t(a4, C47810es.m84974n(new C138724b(ajVar)), this.f377301a);
    }
}
