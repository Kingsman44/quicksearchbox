package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SourceService$supportedKeysMemoized$1", mo61344c = "SourceService.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.fg */
/* compiled from: PG */
final class C32746fg extends C69572j implements C69626l {

    /* renamed from: a */
    int f87845a;

    /* renamed from: b */
    final /* synthetic */ C32750fk f87846b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32746fg(C32750fk fkVar, C69577g gVar) {
        super(1, gVar);
        this.f87846b = fkVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32746fg(this.f87846b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87845a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32750fk fkVar = this.f87846b;
            this.f87845a = 1;
            obj = fkVar.mo38278k(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
