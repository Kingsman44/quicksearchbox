package com.google.android.libraries.cast.usonia.adapter.service;

import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.cast.usonia.adapter.service.DirectoryServiceAdapter$updateStateObservers$1$1", mo61344c = "DirectoryServiceAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.f */
/* compiled from: PG */
final class C19718f extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C71361ao f54754a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19718f(C71361ao aoVar, C69577g gVar) {
        super(3, gVar);
        this.f54754a = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C19718f(this.f54754a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f54754a.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }
}
