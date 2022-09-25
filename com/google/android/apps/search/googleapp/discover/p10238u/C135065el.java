package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134226o;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69632r;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildMainFeedRequestConfig$requestMaker$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {133})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.el */
/* compiled from: PG */
public final class C135065el extends C69572j implements C69632r {

    /* renamed from: a */
    int f367834a;

    /* renamed from: b */
    /* synthetic */ Object f367835b;

    /* renamed from: c */
    /* synthetic */ Object f367836c;

    /* renamed from: d */
    /* synthetic */ Object f367837d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367838e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135065el(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367838e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135065el elVar = new C135065el(this.f367838e, (C69577g) obj4);
        elVar.f367835b = (C57303dd) obj;
        elVar.f367836c = (C134226o) obj2;
        elVar.f367837d = (C57259bn) obj3;
        return elVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367834a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367835b;
            Object obj3 = this.f367836c;
            Object obj4 = this.f367837d;
            C135086ff ffVar = this.f367838e;
            C69585o oVar = ffVar.f367927l;
            C57303dd ddVar = (C57303dd) obj2;
            C135064ek ekVar = new C135064ek(ffVar, ddVar, (C134226o) obj3, (C57259bn) obj4, (C69577g) null);
            this.f367835b = null;
            this.f367836c = null;
            this.f367834a = 1;
            obj = C71803m.m105040a(oVar, ekVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "private fun buildMainFee…   requestMaker\n    )\n  }");
        return obj;
    }
}
