package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SessionImpl$parentSourceStubDeferred$1", mo61344c = "SessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ea */
/* compiled from: PG */
final class C32713ea extends C69572j implements C69630p {

    /* renamed from: a */
    int f87673a;

    /* renamed from: b */
    final /* synthetic */ C32716ed f87674b;

    /* renamed from: c */
    final /* synthetic */ C71816z f87675c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32713ea(C32716ed edVar, C71816z zVar, C69577g gVar) {
        super(2, gVar);
        this.f87674b = edVar;
        this.f87675c = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32713ea) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87673a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f87674b.f87686c;
            this.f87673a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32708dw dwVar = (C32708dw) obj;
        if (dwVar != null) {
            return new C32697dl(this.f87675c, dwVar.f87660a);
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32713ea(this.f87674b, this.f87675c, gVar);
    }
}
