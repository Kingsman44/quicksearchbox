package com.google.android.libraries.search.assistant.invocation.p2615e.p2616a;

import com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a.C120093i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.configuration.defaults.LocaleProvider$locale$1", mo61344c = "LocaleProvider.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.search.assistant.invocation.e.a.g */
/* compiled from: PG */
final class C33713g extends C69572j implements C69626l {

    /* renamed from: a */
    int f90061a;

    /* renamed from: b */
    final /* synthetic */ C33717k f90062b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33713g(C33717k kVar, C69577g gVar) {
        super(1, gVar);
        this.f90062b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33713g(this.f90062b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90061a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120093i iVar = this.f90062b.f90067c;
            this.f90061a = 1;
            obj = iVar.mo104663a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
