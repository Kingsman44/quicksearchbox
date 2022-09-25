package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134226o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4028a.p4029a.C53852l;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildChannelDetailRequestConfig$requestMaker$1$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {274, 278})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ee */
/* compiled from: PG */
final class C135058ee extends C69572j implements C69630p {

    /* renamed from: a */
    int f367807a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367808b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367809c;

    /* renamed from: d */
    final /* synthetic */ C134226o f367810d;

    /* renamed from: e */
    final /* synthetic */ C57259bn f367811e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135058ee(C135086ff ffVar, C57303dd ddVar, C134226o oVar, C57259bn bnVar, C69577g gVar) {
        super(2, gVar);
        this.f367808b = ffVar;
        this.f367809c = ddVar;
        this.f367810d = oVar;
        this.f367811e = bnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135058ee) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f367807a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C47633f b = this.f367808b.mo112121b(C135022cx.CHANNELS, this.f367809c);
            this.f367807a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C135086ff ffVar = this.f367808b;
        C60870cx b2 = ((C53852l) ffVar.f367926k.mo112086b(ffVar.f367917b, this.f367810d, this.f367811e)).mo54032b(this.f367809c);
        this.f367807a = 2;
        obj = C71663i.m104690c(b2, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135058ee(this.f367808b, this.f367809c, this.f367810d, this.f367811e, gVar);
    }
}
