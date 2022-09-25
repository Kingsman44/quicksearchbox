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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildChannelDetailRequestConfig$requestMaker$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {273})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ef */
/* compiled from: PG */
public final class C135059ef extends C69572j implements C69632r {

    /* renamed from: a */
    int f367812a;

    /* renamed from: b */
    /* synthetic */ Object f367813b;

    /* renamed from: c */
    /* synthetic */ Object f367814c;

    /* renamed from: d */
    /* synthetic */ Object f367815d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367816e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135059ef(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367816e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135059ef efVar = new C135059ef(this.f367816e, (C69577g) obj4);
        efVar.f367813b = (C57303dd) obj;
        efVar.f367814c = (C134226o) obj2;
        efVar.f367815d = (C57259bn) obj3;
        return efVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367812a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367813b;
            Object obj3 = this.f367814c;
            Object obj4 = this.f367815d;
            C135086ff ffVar = this.f367816e;
            C69585o oVar = ffVar.f367927l;
            C57303dd ddVar = (C57303dd) obj2;
            C135058ee eeVar = new C135058ee(ffVar, ddVar, (C134226o) obj3, (C57259bn) obj4, (C69577g) null);
            this.f367813b = null;
            this.f367814c = null;
            this.f367812a = 1;
            obj = C71803m.m105040a(oVar, eeVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "fun buildChannelDetailRe…nsistencyToken,\n    )\n  }");
        return obj;
    }
}
