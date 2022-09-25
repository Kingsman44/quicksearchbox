package com.google.android.libraries.search.p2904c.p2942m.p2946d.p2947a;

import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37365b;
import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37366c;
import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37368e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.core.timeout.impl.TimeoutTrackerImpl$launchNewTimeout$1", mo61344c = "TimeoutTrackerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.libraries.search.c.m.d.a.a */
/* compiled from: PG */
final class C37884a extends C69572j implements C69630p {

    /* renamed from: a */
    int f100451a;

    /* renamed from: b */
    final /* synthetic */ Duration f100452b;

    /* renamed from: c */
    final /* synthetic */ String f100453c;

    /* renamed from: d */
    final /* synthetic */ C37885b f100454d;

    /* renamed from: e */
    final /* synthetic */ C37365b f100455e;

    /* renamed from: f */
    private /* synthetic */ Object f100456f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37884a(Duration duration, String str, C37365b bVar, C37885b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f100452b = duration;
        this.f100453c = str;
        this.f100455e = bVar;
        this.f100454d = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37884a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71422aw awVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100451a != 0) {
            awVar = (C71422aw) this.f100456f;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar2 = (C71422aw) this.f100456f;
            Duration duration = this.f100452b;
            this.f100456f = awVar2;
            this.f100451a = 1;
            if (C60942a.m93084b(duration, this) == aVar) {
                return aVar;
            }
            awVar = awVar2;
        }
        C59052c cVar = (C59052c) C37885b.f100457a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ALT.TimeoutTracker");
        String str = this.f100453c;
        cVar.mo56379ah(new C59094n(52850));
        cVar.mo56389s("#audio# on timeout(token(%s))", str);
        C37365b bVar = this.f100455e;
        C37368e eVar = bVar.f99240a;
        C46459k.m82829b(eVar.f99250e.mo57304a(C47810es.m84978r(new C37366c(eVar, bVar.f99241b)), eVar.f99248c), "Unregister audio adapter if inactive failed", new Object[0]);
        C37885b bVar2 = this.f100454d;
        Object obj2 = bVar2.f100458b;
        String str2 = this.f100453c;
        synchronized (obj2) {
            if (C71423ax.m104199d(awVar)) {
                bVar2.f100459c.remove(str2);
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37884a aVar = new C37884a(this.f100452b, this.f100453c, this.f100455e, this.f100454d, gVar);
        aVar.f100456f = obj;
        return aVar;
    }
}
