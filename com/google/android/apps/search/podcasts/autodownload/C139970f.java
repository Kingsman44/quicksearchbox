package com.google.android.apps.search.podcasts.autodownload;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.f */
/* compiled from: PG */
final class C139970f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139977m f380457a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139970f(C139977m mVar) {
        super(1);
        this.f380457a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C69664n.m101061g(axVar, "it");
        C139977m mVar = this.f380457a;
        Duration ofMinutes = Duration.ofMinutes(1);
        C69664n.m101060f(ofMinutes, "ofMinutes(1L)");
        if (!axVar.mo56113h() || mVar.f380469e.mo26870b() - ((C46370ah) axVar.mo56107c()).f121385b >= ofMinutes.toMillis()) {
            C59052c cVar = (C59052c) C139977m.f380465a.mo56224b();
            cVar.mo56379ah(new C59094n(41501));
            cVar.mo56386p("Fetching home feed");
            return C140989k.m228945c(this.f380457a.f380468d.mo115830c(), new C139969e(this.f380457a));
        }
        C59052c cVar2 = (C59052c) C139977m.f380465a.mo56224b();
        cVar2.mo56379ah(new C59094n(41500));
        cVar2.mo56386p("Using cached home feed");
        return C60856cj.m92900i(axVar);
    }
}
