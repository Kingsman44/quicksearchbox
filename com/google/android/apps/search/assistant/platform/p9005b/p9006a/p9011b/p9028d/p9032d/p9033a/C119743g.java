package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.p9033a;

import com.google.android.libraries.search.assistant.p2511d.C32538am;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.api.extensions.ttsstream.service.impl.TtsStreamServiceImpl$initializeOnce$service$1$fetch$1", mo61344c = "TtsStreamServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.d.a.g */
/* compiled from: PG */
final class C119743g extends C69572j implements C69630p {

    /* renamed from: a */
    int f333569a;

    /* renamed from: b */
    final /* synthetic */ C119747k f333570b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f333571c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119743g(C119747k kVar, C70862aj ajVar, C69577g gVar) {
        super(2, gVar);
        this.f333570b = kVar;
        this.f333571c = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119743g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333569a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f333571c.mo20122b(th);
            }
        } else {
            C69714l.m101134b(obj);
            C119742f fVar = new C119742f(C32538am.m60349a(new C119738b(this.f333570b.f333578b)));
            C119739c cVar = new C119739c(this.f333571c);
            this.f333569a = 1;
            if (fVar.mo38165mp(cVar, this) == aVar) {
                return aVar;
            }
        }
        this.f333571c.mo20121a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119743g(this.f333570b, this.f333571c, gVar);
    }
}
