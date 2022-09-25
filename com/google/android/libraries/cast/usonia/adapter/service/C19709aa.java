package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.tasks.C146021aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.HashMap;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.cast.usonia.adapter.service.DistributedServiceDiscoveryAdapter$updateObservers$1", mo61344c = "DistributedServiceDiscoveryAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {104, 127})
/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.aa */
/* compiled from: PG */
final class C19709aa extends C69572j implements C69630p {

    /* renamed from: a */
    Object f54735a;

    /* renamed from: b */
    int f54736b;

    /* renamed from: c */
    final /* synthetic */ C19710ab f54737c;

    /* renamed from: d */
    final /* synthetic */ C71587n f54738d;

    /* renamed from: e */
    private /* synthetic */ Object f54739e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19709aa(C19710ab abVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f54737c = abVar;
        this.f54738d = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C19709aa) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71361ao aoVar;
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f54736b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71361ao aoVar2 = (C71361ao) this.f54739e;
            C59052c cVar = (C59052c) C19710ab.f54740a.mo56224b();
            cVar.mo56379ah(new C59094n(47924));
            cVar.mo56386p("updateStateObservers() stream started");
            if (!this.f54737c.f54742c.mo122490i()) {
                C146021aq.m237852f(this.f54737c.f54742c);
            }
            HashMap hashMap = new HashMap();
            C71587n b = C71486aq.m104308b(C71477ah.m104295b(this.f54738d, new C19735w(aoVar2, (C69577g) null)), new C19736x((C69577g) null));
            C19737y yVar = new C19737y(hashMap, aoVar2, this.f54737c);
            this.f54739e = aoVar2;
            this.f54735a = hashMap;
            this.f54736b = 1;
            if (b.mo38165mp(yVar, this) == aVar) {
                return aVar;
            }
            aoVar = aoVar2;
            obj2 = hashMap;
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            Object obj3 = this.f54735a;
            aoVar = (C71361ao) this.f54739e;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C19738z zVar = new C19738z((HashMap) obj2, this.f54737c);
        this.f54739e = null;
        this.f54735a = null;
        this.f54736b = 2;
        if (C71360an.m104022a(aoVar, zVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C19709aa aaVar = new C19709aa(this.f54737c, this.f54738d, gVar);
        aaVar.f54739e = obj;
        return aaVar;
    }
}
