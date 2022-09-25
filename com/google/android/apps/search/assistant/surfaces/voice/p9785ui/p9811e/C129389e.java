package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9811e;

import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128560a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.e.e */
/* compiled from: PG */
public final class C129389e {

    /* renamed from: a */
    public static final C59071e f355307a = C59071e.m91331h();

    /* renamed from: b */
    public final C46855i f355308b;

    /* renamed from: c */
    public final C46439e f355309c;

    /* renamed from: d */
    public final C127118j f355310d;

    /* renamed from: e */
    public final C126879a f355311e;

    /* renamed from: f */
    public final C127120a f355312f;

    /* renamed from: g */
    public final C47215a f355313g;

    /* renamed from: h */
    public final C129386b f355314h;

    /* renamed from: i */
    public final C129540c f355315i;

    /* renamed from: j */
    public final C128560a f355316j;

    /* renamed from: k */
    public final C129024a f355317k;

    /* renamed from: l */
    public C58485gu f355318l;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.e.e$a */
    /* compiled from: PG */
    final class C129390a implements C46440f {

        /* renamed from: a */
        public static final C129390a f355319a = new C129390a();

        private C129390a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            C69664n.m101061g(str, "inputArg");
            C59052c cVar = (C59052c) ((C59052c) C129389e.f355307a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38294));
            cVar.mo56389s("%s onFailure", str);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str = (String) obj;
            Void voidR = (Void) obj2;
            C69664n.m101061g(str, "inputArg");
            C59052c cVar = (C59052c) C129389e.f355307a.mo56224b();
            cVar.mo56379ah(new C59094n(38295));
            cVar.mo56389s("%s onSuccess", str);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129389e(C46855i iVar, C46439e eVar, C127118j jVar, C126879a aVar, C127120a aVar2, C47215a aVar3, C129386b bVar, C129540c cVar, C128560a aVar4, C129024a aVar5) {
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(aVar3, "fragmentHost");
        this.f355308b = iVar;
        this.f355309c = eVar;
        this.f355310d = jVar;
        this.f355311e = aVar;
        this.f355312f = aVar2;
        this.f355313g = aVar3;
        this.f355314h = bVar;
        this.f355315i = cVar;
        this.f355316j = aVar4;
        this.f355317k = aVar5;
        C58485gu m = C58485gu.m89845m();
        C69664n.m101060f(m, "of()");
        this.f355318l = m;
    }
}
