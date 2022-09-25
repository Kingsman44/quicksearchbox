package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34680g;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.x.a.m */
/* compiled from: PG */
final class C36806m extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f95910a;

    /* renamed from: b */
    final /* synthetic */ C36808o f95911b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36806m(C36808o oVar, C69577g gVar) {
        super(2, gVar);
        this.f95911b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36806m) mo5194c((C34680g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34680g gVar = (C34680g) this.f95910a;
        C36805l lVar = this.f95911b.f95916d;
        C69664n.m101061g(gVar, "quickPhrasesInvocationSourceState");
        Duration ofMillis = Duration.ofMillis(lVar.f95904b.mo26871c());
        C69664n.m101060f(ofMillis, "ofMillis(clock.elapsedRealtime())");
        C71803m.m105042c(lVar.f95905c, (C69585o) null, (C71424ay) null, new C36801h(lVar, new C36797d(gVar, ofMillis), (C69577g) null), 3).mo62873s(C36802i.f95895a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C36806m mVar = new C36806m(this.f95911b, gVar);
        mVar.f95910a = obj;
        return mVar;
    }
}
