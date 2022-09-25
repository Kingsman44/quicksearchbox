package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.tasks.C146021aq;
import com.google.p427am.p438d.p439a.C8718as;
import com.google.p427am.p438d.p439a.C8719at;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.cast.usonia.adapter.service.DistributedServiceDiscoveryAdapter$isIamEnabled$1", mo61344c = "DistributedServiceDiscoveryAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {281})
/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.r */
/* compiled from: PG */
final class C19730r extends C69572j implements C69630p {

    /* renamed from: a */
    int f54784a;

    /* renamed from: b */
    final /* synthetic */ C19710ab f54785b;

    /* renamed from: c */
    private /* synthetic */ Object f54786c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19730r(C19710ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f54785b = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C19730r) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f54784a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71588o oVar = (C71588o) this.f54786c;
            if (!this.f54785b.f54742c.mo122490i()) {
                C146021aq.m237852f(this.f54785b.f54742c);
            }
            C8718as asVar = (C8718as) C8719at.f30050b.createBuilder();
            C69664n.m101060f(asVar, "newBuilder()");
            C69664n.m101061g(asVar, "builder");
            asVar.copyOnWrite();
            ((C8719at) asVar.instance).f30052a = false;
            C62942bv build = asVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f54784a = 1;
            if (oVar.mo20883a((C8719at) build, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C19730r rVar = new C19730r(this.f54785b, gVar);
        rVar.f54786c = obj;
        return rVar;
    }
}
