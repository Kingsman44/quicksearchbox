package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69632r;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildMainFeedRequestConfig$requestMaker$2", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {143})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.en */
/* compiled from: PG */
public final class C135067en extends C69572j implements C69632r {

    /* renamed from: a */
    int f367844a;

    /* renamed from: b */
    /* synthetic */ Object f367845b;

    /* renamed from: c */
    /* synthetic */ Object f367846c;

    /* renamed from: d */
    /* synthetic */ Object f367847d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367848e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135067en(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367848e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135067en enVar = new C135067en(this.f367848e, (C69577g) obj4);
        enVar.f367845b = (C57303dd) obj;
        enVar.f367846c = (UUID) obj2;
        enVar.f367847d = (C57259bn) obj3;
        return enVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367844a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367845b;
            Object obj3 = this.f367846c;
            Object obj4 = this.f367847d;
            C135086ff ffVar = this.f367848e;
            C69585o oVar = ffVar.f367927l;
            C57303dd ddVar = (C57303dd) obj2;
            C135066em emVar = new C135066em(ffVar, ddVar, (UUID) obj3, (C57259bn) obj4, (C69577g) null);
            this.f367845b = null;
            this.f367846c = null;
            this.f367844a = 1;
            obj = C71803m.m105040a(oVar, emVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
