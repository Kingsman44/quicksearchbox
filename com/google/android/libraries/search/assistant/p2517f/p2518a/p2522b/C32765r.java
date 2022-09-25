package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$fetchClientIdForLogging$3", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {302})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.r */
/* compiled from: PG */
final class C32765r extends C69572j implements C69631q {

    /* renamed from: a */
    int f87912a;

    /* renamed from: b */
    /* synthetic */ Object f87913b;

    /* renamed from: c */
    /* synthetic */ Object f87914c;

    /* renamed from: d */
    final /* synthetic */ C32607ac f87915d;

    /* renamed from: e */
    final /* synthetic */ long f87916e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32765r(C32607ac acVar, long j, C69577g gVar) {
        super(3, gVar);
        this.f87915d = acVar;
        this.f87916e = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C32765r rVar = new C32765r(this.f87915d, this.f87916e, (C69577g) obj3);
        rVar.f87913b = (C32879y) obj;
        rVar.f87914c = (C32871q) obj2;
        return rVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87912a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f87913b;
            Object obj3 = this.f87914c;
            C32762o oVar = this.f87915d.f87322m;
            long j = this.f87916e;
            this.f87913b = null;
            this.f87912a = 1;
            obj = oVar.mo38286b(j, (C32879y) obj2, (C32871q) obj3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
