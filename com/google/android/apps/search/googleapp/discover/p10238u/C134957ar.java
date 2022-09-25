package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.DiscoverUrlFetcher$fetchInternal$2$clientDataDeferred$1", mo61344c = "DiscoverUrlFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {130})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ar */
/* compiled from: PG */
final class C134957ar extends C69572j implements C69630p {

    /* renamed from: a */
    int f367450a;

    /* renamed from: b */
    final /* synthetic */ C134962aw f367451b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134957ar(C134962aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f367451b = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134957ar) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367450a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f367451b.f367473d.mo115317a(true, true);
            C69664n.m101060f(a, "clientDataHeaderFetcher.…eviceProperties= */ true)");
            this.f367450a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134957ar(this.f367451b, gVar);
    }
}
