package com.google.android.libraries.search.assistant.p2782r;

import com.google.common.base.C58833ax;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.locationservice.DefaultLocationService$getXGeoHeader$1", mo61344c = "DefaultLocationService.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.libraries.search.assistant.r.c */
/* compiled from: PG */
final class C36377c extends C69572j implements C69630p {

    /* renamed from: a */
    int f94989a;

    /* renamed from: b */
    final /* synthetic */ C36378d f94990b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36377c(C36378d dVar, C69577g gVar) {
        super(2, gVar);
        this.f94990b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36377c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f94989a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f94990b.mo21007a();
            this.f94989a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C58833ax b = ((C58833ax) obj).mo56106b(C36376b.f94988a);
        C69664n.m101060f(b, "location.await().transfo…odeLocationAsHeader(it) }");
        return b;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36377c(this.f94990b, gVar);
    }
}
