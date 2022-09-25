package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RefreshMetadataStore$setLastSuccessfulRefreshTime$2", mo61344c = "RefreshMetadataStore.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.de */
/* compiled from: PG */
public final class C135031de extends C69572j implements C69630p {

    /* renamed from: a */
    int f367697a;

    /* renamed from: b */
    final /* synthetic */ Instant f367698b;

    /* renamed from: c */
    final /* synthetic */ C135032df f367699c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135031de(Instant instant, C135032df dfVar, C69577g gVar) {
        super(2, gVar);
        this.f367698b = instant;
        this.f367699c = dfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135031de) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367697a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C135032df.f367700a.mo56224b();
            Instant instant = this.f367698b;
            cVar.mo56379ah(new C59094n(40404));
            cVar.mo56389s("#setLastSuccessfulTime %s", instant);
            C135032df dfVar = this.f367699c;
            C60870cx a = dfVar.f367701b.mo46039a(new C135030dd(this.f367698b), dfVar.f367702c);
            C69664n.m101060f(a, "time: Instant) =\n    wit…tweightExecutor\n        )");
            this.f367697a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135031de(this.f367698b, this.f367699c, gVar);
    }
}
