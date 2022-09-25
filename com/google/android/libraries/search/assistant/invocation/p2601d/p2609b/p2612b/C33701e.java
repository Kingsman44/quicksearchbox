package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.service.AudioInputInternalServiceImpl$openSessionStreaming$1$3$1", mo61344c = "AudioInputInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {113})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.e */
/* compiled from: PG */
final class C33701e extends C69572j implements C69630p {

    /* renamed from: a */
    int f90028a;

    /* renamed from: b */
    final /* synthetic */ C33706j f90029b;

    /* renamed from: c */
    final /* synthetic */ C33677e f90030c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33701e(C33706j jVar, C33677e eVar, C69577g gVar) {
        super(2, gVar);
        this.f90029b = jVar;
        this.f90030c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33701e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90028a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33706j jVar = this.f90029b;
            C33677e eVar = this.f90030c;
            this.f90028a = 1;
            obj = jVar.mo39033b(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33701e(this.f90029b, this.f90030c, gVar);
    }
}
