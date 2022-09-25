package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.cast.usonia.adapter.service.DirectoryServiceAdapter$updateStateObservers$1$2", mo61344c = "DirectoryServiceAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.g */
/* compiled from: PG */
final class C19719g extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f54755a;

    public C19719g(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C19719g gVar = new C19719g((C69577g) obj3);
        gVar.f54755a = (Throwable) obj2;
        return gVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) ((C59052c) C19723k.f54768a.mo56226d()).mo56382g((Throwable) this.f54755a);
        cVar.mo56379ah(new C59094n(47910));
        cVar.mo56386p("updateStateObservers() stream ended with error");
        return C69788q.f186170a;
    }
}
