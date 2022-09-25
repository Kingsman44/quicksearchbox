package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.sources.completeserver.CompleteServerClientImpl$getHeaders$2$locationHeader$1", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {150})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.n */
/* compiled from: PG */
final class C138484n extends C69572j implements C69630p {

    /* renamed from: a */
    int f376684a;

    /* renamed from: b */
    final /* synthetic */ boolean f376685b;

    /* renamed from: c */
    final /* synthetic */ C138490t f376686c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138484n(boolean z, C138490t tVar, C69577g gVar) {
        super(2, gVar);
        this.f376685b = z;
        this.f376686c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138484n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376684a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (!this.f376685b) {
                return Optional.empty();
            }
            C138382ad adVar = this.f376686c.f376710b;
            C47633f h = C47633f.m84733g(adVar.f376467f.mo113746a()).mo51515h(C138496z.f376723a, adVar.f376470i);
            this.f376684a = 1;
            obj = C71663i.m104690c(h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (Optional) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138484n(this.f376685b, this.f376686c, gVar);
    }
}
