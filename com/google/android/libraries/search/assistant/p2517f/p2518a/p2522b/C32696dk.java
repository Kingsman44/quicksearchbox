package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32832c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32862h;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.ParentSourceStub$token$1", mo61344c = "ParentSourceStub.kt", mo61345d = "invokeSuspend", mo61346e = {27})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dk */
/* compiled from: PG */
final class C32696dk extends C69572j implements C69626l {

    /* renamed from: a */
    Object f87631a;

    /* renamed from: b */
    Object f87632b;

    /* renamed from: c */
    int f87633c;

    /* renamed from: d */
    final /* synthetic */ C71604be f87634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32696dk(C71604be beVar, C69577g gVar) {
        super(1, gVar);
        this.f87634d = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32696dk(this.f87634d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87633c != 0) {
            obj3 = this.f87632b;
            obj2 = this.f87631a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f87634d;
            C32832c cVar = (C32832c) C32858d.f88081c.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            obj2 = C69664n.m101061g(cVar, "builder");
            this.f87631a = obj2;
            this.f87632b = obj2;
            this.f87633c = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
            obj3 = obj2;
        }
        C63088z zVar = ((C32849cq) obj).f88062b;
        C69664n.m101060f(zVar, "sessionTokenDeferred.await().payload");
        ((C32862h) obj3).mo38326b(zVar);
        return ((C32862h) obj2).mo38325a();
    }
}
