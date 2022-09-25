package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.android.apps.gsa.p8867w.p8871b.C118734a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130679b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131720e;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10005a.p10006a.C131688a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10005a.p10006a.C131689b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.C131702a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.j */
/* compiled from: PG */
public final class C131712j implements C131702a {

    /* renamed from: a */
    public final C58974d f359825a;

    /* renamed from: b */
    public final C131720e f359826b;

    /* renamed from: c */
    public final C131720e f359827c;

    /* renamed from: d */
    public final ExecutorService f359828d;

    /* renamed from: e */
    public final C130679b f359829e;

    /* renamed from: f */
    public final C131711i f359830f = new C131711i(this, C131707e.f359819a);

    /* renamed from: g */
    public final C131711i f359831g = new C131711i(this, C131708f.f359820a);

    /* renamed from: h */
    private final C118734a f359832h;

    /* renamed from: i */
    private final C131689b f359833i;

    public C131712j(C130603a aVar, C131720e eVar, C131720e eVar2, ExecutorService executorService, C118734a aVar2, C131689b bVar, C130679b bVar2) {
        this.f359825a = aVar.mo109740b(this);
        this.f359826b = eVar;
        this.f359827c = eVar2;
        this.f359828d = executorService;
        this.f359832h = aVar2;
        this.f359833i = bVar;
        this.f359829e = bVar2;
    }

    /* renamed from: a */
    public final C60870cx mo110277a() {
        C131689b bVar = this.f359833i;
        C60870cx d = bVar.f359796a.mo46042d();
        C131688a aVar = new C131688a();
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(aVar), bVar.f359797b);
        C60870cx a = this.f359832h.mo103943a();
        C60870cx a2 = C47638k.m84753d(g, a).mo51520a(new C131704b(g, a), this.f359828d);
        C131705c cVar = new C131705c(this);
        return C60922j.m93045h(a2, C47810es.m84966f(cVar), this.f359828d);
    }

    /* renamed from: b */
    public final C60870cx mo110278b() {
        return C47638k.m84753d(this.f359826b.mo110274b(this.f359830f), this.f359827c.mo110274b(this.f359831g)).mo51520a(C131703a.f359814a, this.f359828d);
    }
}
