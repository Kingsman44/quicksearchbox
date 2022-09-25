package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34669b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c;
import com.google.android.libraries.search.assistant.p2825x.C36785a;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.quickphrases.QuickPhrasesInvocationSource$initialize$1$coroutineContext$2", mo61344c = "QuickPhrasesInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.c */
/* compiled from: PG */
final class C34681c extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C34683e f92084a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34681c(C34683e eVar, C69577g gVar) {
        super(3, gVar);
        this.f92084a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34681c(this.f92084a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C36785a aVar2 = this.f92084a.f92087b;
        C34669b bVar = (C34669b) C34670c.f92054e.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        aVar2.mo40400c(C69664n.m101061g(bVar, "builder").mo39462a(), (C34119a) null);
        return C69788q.f186170a;
    }
}
