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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildBackgroundFeedRequestConfig$requestMaker$2", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {404})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ec */
/* compiled from: PG */
final class C135056ec extends C69572j implements C69632r {

    /* renamed from: a */
    int f367801a;

    /* renamed from: b */
    /* synthetic */ Object f367802b;

    /* renamed from: c */
    /* synthetic */ Object f367803c;

    /* renamed from: d */
    /* synthetic */ Object f367804d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367805e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135056ec(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367805e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135056ec ecVar = new C135056ec(this.f367805e, (C69577g) obj4);
        ecVar.f367802b = (C57303dd) obj;
        ecVar.f367803c = (UUID) obj2;
        ecVar.f367804d = (C57259bn) obj3;
        return ecVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367801a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367802b;
            Object obj3 = this.f367803c;
            Object obj4 = this.f367804d;
            C135086ff ffVar = this.f367805e;
            C69585o oVar = ffVar.f367927l;
            C57303dd ddVar = (C57303dd) obj2;
            C135055eb ebVar = new C135055eb(ffVar, ddVar, (UUID) obj3, (C57259bn) obj4, (C69577g) null);
            this.f367802b = null;
            this.f367803c = null;
            this.f367801a = 1;
            obj = C71803m.m105040a(oVar, ebVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
