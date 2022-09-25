package com.google.android.libraries.search.assistant.p2697j;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.android.concurrent.C58301z;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.coroutines.ScheduledKt$withIntervalCallback$2", mo61344c = "Scheduled.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.libraries.search.assistant.j.i */
/* compiled from: PG */
public final class C34755i extends C69572j implements C69630p {

    /* renamed from: a */
    int f92225a;

    /* renamed from: b */
    final /* synthetic */ C21370a f92226b;

    /* renamed from: c */
    final /* synthetic */ C60888db f92227c;

    /* renamed from: d */
    final /* synthetic */ Duration f92228d;

    /* renamed from: e */
    final /* synthetic */ C69626l f92229e;

    /* renamed from: f */
    final /* synthetic */ C69626l f92230f;

    /* renamed from: g */
    private /* synthetic */ Object f92231g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34755i(C21370a aVar, C60888db dbVar, Duration duration, C69626l lVar, C69626l lVar2, C69577g gVar) {
        super(2, gVar);
        this.f92226b = aVar;
        this.f92227c = dbVar;
        this.f92228d = duration;
        this.f92229e = lVar;
        this.f92230f = lVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34755i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92225a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be c = C71803m.m105042c((C71422aw) this.f92231g, (C69585o) null, (C71424ay) null, new C34753g(this.f92229e, (C69577g) null), 3);
            Instant a = C34756j.m63507a(this.f92226b);
            C60888db dbVar = this.f92227c;
            C21370a aVar2 = this.f92226b;
            Duration duration = this.f92228d;
            C34754h hVar = new C34754h(a, aVar2, this.f92230f);
            C69664n.m101061g(dbVar, "<this>");
            C69664n.m101061g(aVar2, "clock");
            C69664n.m101061g(duration, "interval");
            C69664n.m101061g(duration, "initialDelay");
            C60870cx a2 = C58301z.m89281a(new C34751e(hVar), duration.toMillis(), duration.toMillis(), TimeUnit.MILLISECONDS, aVar2, dbVar);
            C34750d dVar = C34750d.f92217a;
            c.mo62873s(new C34752f(C60922j.m93044g(a2, C47810es.m84963c(dVar), C60826bg.f164896a)));
            this.f92225a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34755i iVar = new C34755i(this.f92226b, this.f92227c, this.f92228d, this.f92229e, this.f92230f, gVar);
        iVar.f92231g = obj;
        return iVar;
    }
}
