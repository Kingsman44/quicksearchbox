package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34174at;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34254bj;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.platform.PerConnectionPlatformConfigurationTracker$special$$inlined$flatMapLatest$1", mo61344c = "PlatformConfigurationTracker.kt", mo61345d = "invokeSuspend", mo61346e = {219})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.h */
/* compiled from: PG */
public final class C34443h extends C69572j implements C69631q {

    /* renamed from: a */
    int f91526a;

    /* renamed from: b */
    /* synthetic */ Object f91527b;

    /* renamed from: c */
    final /* synthetic */ C34254bj f91528c;

    /* renamed from: d */
    final /* synthetic */ C34449n f91529d;

    /* renamed from: e */
    private /* synthetic */ Object f91530e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34443h(C69577g gVar, C34254bj bjVar, C34449n nVar) {
        super(3, gVar);
        this.f91528c = bjVar;
        this.f91529d = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34443h hVar = new C34443h((C69577g) obj3, this.f91528c, this.f91529d);
        hVar.f91530e = (C71588o) obj;
        hVar.f91527b = obj2;
        return hVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91526a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r9 = this.f91530e;
            C69685i iVar = (C69685i) this.f91527b;
            C34120b bVar = (C34120b) iVar.f186052a;
            C34174at atVar = (C34174at) iVar.f186053b;
            C34439d dVar = new C34439d(this.f91528c.mo39286a(bVar.f90874c, bVar.f90875d, this.f91529d.mo39355a(atVar)), bVar, atVar);
            this.f91526a = 1;
            if (C71594u.m104516c(r9, dVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
