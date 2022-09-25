package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import com.google.android.apps.gsa.binaries.satin.app.C74169na;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9778l.C128947a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9778l.C128948b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.p9783a.p9784a.C128964c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.i */
/* compiled from: PG */
public final class C128973i {

    /* renamed from: a */
    public static final C59071e f354383a = C59071e.m91331h();

    /* renamed from: b */
    public final C46855i f354384b;

    /* renamed from: c */
    public final C46439e f354385c;

    /* renamed from: d */
    public final C129024a f354386d;

    /* renamed from: e */
    public final C128970f f354387e;

    /* renamed from: f */
    public C128948b f354388f;

    /* renamed from: g */
    public Duration f354389g;

    /* renamed from: h */
    public boolean f354390h;

    /* renamed from: i */
    public final C128964c f354391i;

    /* renamed from: j */
    public final C128848e f354392j;

    /* renamed from: k */
    private final C74169na f354393k;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.i$a */
    /* compiled from: PG */
    final class C128974a implements C46440f {

        /* renamed from: a */
        public static final C128974a f354394a = new C128974a();

        private C128974a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            C69664n.m101061g(str, "inputArg");
            C59052c cVar = (C59052c) ((C59052c) C128973i.f354383a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38075));
            cVar.mo56389s("%s onFailure", str);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            C69664n.m101061g((String) obj, "inputArg");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C128973i(C46855i iVar, C128964c cVar, C74169na naVar, C128848e eVar, C46439e eVar2, C129024a aVar, C128970f fVar) {
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(cVar, "suggestionsDataService");
        C69664n.m101061g(naVar, "timeoutTimerFactory");
        C69664n.m101061g(eVar2, "mixin");
        this.f354384b = iVar;
        this.f354391i = cVar;
        this.f354393k = naVar;
        this.f354392j = eVar;
        this.f354385c = eVar2;
        this.f354386d = aVar;
        this.f354387e = fVar;
        Duration duration = Duration.ZERO;
        C69664n.m101060f(duration, "ZERO");
        this.f354389g = duration;
    }

    /* renamed from: a */
    public final void mo108781a(Duration duration, boolean z) {
        if (z) {
            C128948b bVar = this.f354388f;
            if (bVar != null) {
                bVar.mo108768a();
            }
            if (!duration.isZero()) {
                C74169na naVar = this.f354393k;
                C128948b bVar2 = new C128948b((C71422aw) naVar.f206644a.a.H.mo17428b(), duration, new C128977l(this));
                this.f354388f = bVar2;
                C71643cp cpVar = bVar2.f354332e;
                if (cpVar != null) {
                    cpVar.mo62723u((CancellationException) null);
                }
                bVar2.f354332e = C71803m.m105043d(bVar2.f354329b, (C69585o) null, (C71424ay) null, new C128947a(bVar2, (C69577g) null), 3);
            }
        }
    }
}
