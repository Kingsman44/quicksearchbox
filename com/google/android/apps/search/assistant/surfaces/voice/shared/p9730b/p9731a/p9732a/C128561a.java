package com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.p9732a;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128564b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71608bi;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.shared.timeout.dataservice.impl.TimeoutDataServiceImpl$scheduleTimeout$1", mo61344c = "TimeoutDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.b.a.a.a */
/* compiled from: PG */
final class C128561a extends C69572j implements C69630p {

    /* renamed from: a */
    int f353504a;

    /* renamed from: b */
    final /* synthetic */ Duration f353505b;

    /* renamed from: c */
    final /* synthetic */ C128563c f353506c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128561a(Duration duration, C128563c cVar, C69577g gVar) {
        super(2, gVar);
        this.f353505b = duration;
        this.f353506c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128561a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353504a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            long millis = this.f353505b.toMillis();
            this.f353504a = 1;
            if (C71608bi.m104551c(millis, this) == aVar) {
                return aVar;
            }
        }
        this.f353506c.mo108519c(C128564b.EXPIRED);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128561a(this.f353505b, this.f353506c, gVar);
    }
}
