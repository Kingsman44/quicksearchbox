package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.ExecutionPlanHelper$commitPendingNoncancellableSessions$1", mo61344c = "ExecutionPlanHelper.kt", mo61345d = "invokeSuspend", mo61346e = {130})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.a */
/* compiled from: PG */
final class C120543a extends C69572j implements C69630p {

    /* renamed from: a */
    int f335217a;

    /* renamed from: b */
    final /* synthetic */ C120563n f335218b;

    /* renamed from: c */
    final /* synthetic */ String f335219c;

    /* renamed from: d */
    final /* synthetic */ List f335220d;

    /* renamed from: e */
    final /* synthetic */ C120554e f335221e;

    /* renamed from: f */
    final /* synthetic */ Duration f335222f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120543a(C120563n nVar, String str, List list, C120554e eVar, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f335218b = nVar;
        this.f335219c = str;
        this.f335220d = list;
        this.f335221e = eVar;
        this.f335222f = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120543a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335217a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f335218b.f335320b.mo104299a();
            C69664n.m101060f(a, "session.clientOpPrefetchSession.commit()");
            this.f335217a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C52070ec ecVar = (C52070ec) obj;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a2 = C52235kf.m86549a(kgVar.f137092b);
        if (a2 == null) {
            a2 = C52235kf.OK;
        }
        a2.name();
        List list = this.f335220d;
        C120554e eVar = this.f335221e;
        C52083ep epVar = this.f335218b.f335319a;
        Duration duration = this.f335222f;
        C69664n.m101060f(duration, "startNanos");
        Duration ofNanos = Duration.ofNanos(this.f335221e.f335289a.mo26872d());
        C69664n.m101060f(ofNanos, "ofNanos(clock.elapsedRealtimeNanos())");
        list.add(eVar.mo104834c(epVar, ecVar, duration, ofNanos));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120543a(this.f335218b, this.f335219c, this.f335220d, this.f335221e, this.f335222f, gVar);
    }
}
