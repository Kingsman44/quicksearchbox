package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134226o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4031b.p4035b.p4036a.C53883b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildMainFeedRequestConfig$requestMaker$1$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {134, 138})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ek */
/* compiled from: PG */
final class C135064ek extends C69572j implements C69630p {

    /* renamed from: a */
    int f367829a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367830b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367831c;

    /* renamed from: d */
    final /* synthetic */ C134226o f367832d;

    /* renamed from: e */
    final /* synthetic */ C57259bn f367833e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135064ek(C135086ff ffVar, C57303dd ddVar, C134226o oVar, C57259bn bnVar, C69577g gVar) {
        super(2, gVar);
        this.f367830b = ffVar;
        this.f367831c = ddVar;
        this.f367832d = oVar;
        this.f367833e = bnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135064ek) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f367829a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C47633f b = this.f367830b.mo112121b(C135022cx.MAIN_FEED, this.f367831c);
            this.f367829a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C135086ff ffVar = this.f367830b;
        C60870cx b2 = ((C53883b) ffVar.f367926k.mo112086b(ffVar.f367916a, this.f367832d, this.f367833e)).mo54039b(this.f367831c);
        this.f367829a = 2;
        obj = C71663i.m104690c(b2, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135064ek(this.f367830b, this.f367831c, this.f367832d, this.f367833e, gVar);
    }
}
