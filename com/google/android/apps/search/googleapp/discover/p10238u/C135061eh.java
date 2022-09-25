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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildFullCoverageRequestConfig$requestMaker$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {354})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.eh */
/* compiled from: PG */
public final class C135061eh extends C69572j implements C69632r {

    /* renamed from: a */
    int f367822a;

    /* renamed from: b */
    /* synthetic */ Object f367823b;

    /* renamed from: c */
    /* synthetic */ Object f367824c;

    /* renamed from: d */
    /* synthetic */ Object f367825d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367826e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135061eh(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367826e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135061eh ehVar = new C135061eh(this.f367826e, (C69577g) obj4);
        ehVar.f367823b = (C57303dd) obj;
        ehVar.f367824c = (UUID) obj2;
        ehVar.f367825d = (C57259bn) obj3;
        return ehVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367822a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367823b;
            Object obj3 = this.f367824c;
            Object obj4 = this.f367825d;
            C135086ff ffVar = this.f367826e;
            C69585o oVar = ffVar.f367927l;
            C57303dd ddVar = (C57303dd) obj2;
            C135060eg egVar = new C135060eg(ffVar, ddVar, (UUID) obj3, (C57259bn) obj4, (C69577g) null);
            this.f367823b = null;
            this.f367824c = null;
            this.f367822a = 1;
            obj = C71803m.m105040a(oVar, egVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
