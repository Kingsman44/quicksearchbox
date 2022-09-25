package com.google.android.libraries.search.assistant.p2511d;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.async.ClosingFutureScopeKt$closingFuture$1$task$1", mo61344c = "ClosingFutureScope.kt", mo61345d = "invokeSuspend", mo61346e = {76})
/* renamed from: com.google.android.libraries.search.assistant.d.s */
/* compiled from: PG */
final class C32556s extends C69572j implements C69630p {

    /* renamed from: a */
    int f87192a;

    /* renamed from: b */
    final /* synthetic */ C69630p f87193b;

    /* renamed from: c */
    final /* synthetic */ C71816z f87194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32556s(C71816z zVar, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f87194c = zVar;
        this.f87193b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32556s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87192a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                if (!this.f87194c.mo63050j(th)) {
                    throw th;
                }
            }
        } else {
            C69714l.m101134b(obj);
            C32555r rVar = new C32555r(this.f87193b, this.f87194c, (C69577g) null);
            this.f87192a = 1;
            if (C71423ax.m104196a(rVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32556s(this.f87194c, this.f87193b, gVar);
    }
}
