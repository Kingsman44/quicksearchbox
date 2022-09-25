package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133963k;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestBuilder$build$3$storedActionsCountDeferred$1", mo61344c = "RequestBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {118})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.dq */
/* compiled from: PG */
final class C135043dq extends C69572j implements C69630p {

    /* renamed from: a */
    int f367720a;

    /* renamed from: b */
    final /* synthetic */ C135049dw f367721b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135043dq(C135049dw dwVar, C69577g gVar) {
        super(2, gVar);
        this.f367721b = dwVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135043dq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367720a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C133963k kVar = this.f367721b.f367764e;
            this.f367720a = 1;
            obj = kVar.mo111470b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135043dq(this.f367721b, gVar);
    }
}
