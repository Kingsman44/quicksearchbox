package com.google.android.apps.search.podcasts.search;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.search.p10610b.C141008f;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.b */
/* compiled from: PG */
public final class C141001b {

    /* renamed from: a */
    public static final C59071e f382802a = C59071e.m91331h();

    /* renamed from: b */
    public final String f382803b;

    /* renamed from: c */
    public final SearchFragment f382804c;

    /* renamed from: d */
    public final C46801dp f382805d;

    /* renamed from: e */
    public final C141008f f382806e;

    /* renamed from: f */
    public final C141017i f382807f;

    /* renamed from: g */
    public final C47770dh f382808g;

    /* renamed from: h */
    public final C46485f f382809h;

    /* renamed from: i */
    public C140952k f382810i;

    /* renamed from: j */
    public C31974aw f382811j;

    /* renamed from: com.google.android.apps.search.podcasts.search.b$a */
    /* compiled from: PG */
    final class C141002a implements C46792di {

        /* renamed from: a */
        final /* synthetic */ C141001b f382812a;

        /* renamed from: b */
        private final C31974aw f382813b;

        public C141002a(C141001b bVar, C31974aw awVar) {
            C69664n.m101061g(awVar, "rootBindableController");
            this.f382812a = bVar;
            this.f382813b = awVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C141001b.f382802a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41643));
            cVar.mo56386p("Error loading search/suggest results");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            this.f382812a.mo116071a((C140952k) obj, this.f382813b);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C141001b(String str, SearchFragment searchFragment, C46801dp dpVar, C141008f fVar, C141017i iVar, C47770dh dhVar, C46485f fVar2) {
        C69664n.m101061g(searchFragment, "fragment");
        C69664n.m101061g(dpVar, "subscriptionsMixin");
        C69664n.m101061g(fVar, "dataService");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar2, "accountNavigation");
        this.f382803b = str;
        this.f382804c = searchFragment;
        this.f382805d = dpVar;
        this.f382806e = fVar;
        this.f382807f = iVar;
        this.f382808g = dhVar;
        this.f382809h = fVar2;
    }

    /* renamed from: a */
    public final void mo116071a(C140952k kVar, C31974aw awVar) {
        if (kVar != null) {
            awVar.mo37740a(kVar);
        }
        this.f382810i = kVar;
    }
}
