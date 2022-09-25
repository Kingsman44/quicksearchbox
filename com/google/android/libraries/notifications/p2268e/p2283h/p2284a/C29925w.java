package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.internal.scheduled.impl.GnpJobFutureAdapter$executeGnpJob$1", mo61344c = "GnpJobFutureAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {17})
/* renamed from: com.google.android.libraries.notifications.e.h.a.w */
/* compiled from: PG */
final class C29925w extends C69572j implements C69630p {

    /* renamed from: a */
    int f81050a;

    /* renamed from: b */
    final /* synthetic */ Bundle f81051b;

    /* renamed from: c */
    final /* synthetic */ C30040c f81052c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29925w(C30040c cVar, Bundle bundle, C69577g gVar) {
        super(2, gVar);
        this.f81052c = cVar;
        this.f81051b = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C29925w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f81050a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C30040c cVar = this.f81052c;
            Bundle bundle = this.f81051b;
            this.f81050a = 1;
            obj = cVar.mo35376d(bundle, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C29925w(this.f81052c, this.f81051b, gVar);
    }
}
