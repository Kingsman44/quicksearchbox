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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$getNextPageRequestMaker$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {431})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ez */
/* compiled from: PG */
final class C135079ez extends C69572j implements C69632r {

    /* renamed from: a */
    int f367896a;

    /* renamed from: b */
    /* synthetic */ Object f367897b;

    /* renamed from: c */
    /* synthetic */ Object f367898c;

    /* renamed from: d */
    /* synthetic */ Object f367899d;

    /* renamed from: e */
    final /* synthetic */ C135086ff f367900e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135079ez(C135086ff ffVar, C69577g gVar) {
        super(4, gVar);
        this.f367900e = ffVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C135079ez ezVar = new C135079ez(this.f367900e, (C69577g) obj4);
        ezVar.f367897b = (C57303dd) obj;
        ezVar.f367898c = (C134226o) obj2;
        ezVar.f367899d = (C57259bn) obj3;
        return ezVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367896a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f367897b;
            Object obj3 = this.f367898c;
            Object obj4 = this.f367899d;
            C135086ff ffVar = this.f367900e;
            C69585o oVar = ffVar.f367927l;
            C135078ey eyVar = new C135078ey(ffVar, (C134226o) obj3, (C57259bn) obj4, (C57303dd) obj2, (C69577g) null);
            this.f367897b = null;
            this.f367898c = null;
            this.f367896a = 1;
            obj = C71803m.m105040a(oVar, eyVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "fun getNextPageRequestMa…      }\n      }\n    }\n  }");
        return obj;
    }
}
