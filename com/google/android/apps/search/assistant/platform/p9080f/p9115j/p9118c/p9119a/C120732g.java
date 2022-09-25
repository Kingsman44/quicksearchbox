package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.OnDeviceStreamingInterfaceImpl$process$1", mo61344c = "OnDeviceStreamingInterfaceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.g */
/* compiled from: PG */
final class C120732g extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C71643cp f335793a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120732g(C71643cp cpVar, C69577g gVar) {
        super(3, gVar);
        this.f335793a = cpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C120732g(this.f335793a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f335793a.mo62723u((CancellationException) null);
        return C69788q.f186170a;
    }
}
