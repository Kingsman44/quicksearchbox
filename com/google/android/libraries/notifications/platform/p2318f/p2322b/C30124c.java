package com.google.android.libraries.notifications.platform.p2318f.p2322b;

import android.os.Bundle;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.job.GnpJobSchedulingApiFutureAdapterImpl$scheduleFuture$1", mo61344c = "GnpJobSchedulingApiFutureAdapterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {30})
/* renamed from: com.google.android.libraries.notifications.platform.f.b.c */
/* compiled from: PG */
final class C30124c extends C69572j implements C69630p {

    /* renamed from: a */
    int f81485a;

    /* renamed from: b */
    final /* synthetic */ C30125d f81486b;

    /* renamed from: c */
    final /* synthetic */ AccountRepresentation f81487c;

    /* renamed from: d */
    final /* synthetic */ Bundle f81488d;

    /* renamed from: e */
    final /* synthetic */ Long f81489e;

    /* renamed from: f */
    final /* synthetic */ C30040c f81490f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30124c(C30125d dVar, C30040c cVar, AccountRepresentation accountRepresentation, Bundle bundle, Long l, C69577g gVar) {
        super(2, gVar);
        this.f81486b = dVar;
        this.f81490f = cVar;
        this.f81487c = accountRepresentation;
        this.f81488d = bundle;
        this.f81489e = l;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30124c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f81485a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C30123b bVar = this.f81486b.f81491a;
            C30040c cVar = this.f81490f;
            AccountRepresentation accountRepresentation = this.f81487c;
            Bundle bundle = this.f81488d;
            Long l = this.f81489e;
            this.f81485a = 1;
            obj = bVar.mo35521c(cVar, accountRepresentation, bundle, l, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30124c(this.f81486b, this.f81490f, this.f81487c, this.f81488d, this.f81489e, gVar);
    }
}
