package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$getQPEventFlow$2", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.x.a.s */
/* compiled from: PG */
final class C36813s extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C36808o f95941a;

    /* renamed from: b */
    final /* synthetic */ C34053bp f95942b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36813s(C36808o oVar, C34053bp bpVar, C69577g gVar) {
        super(3, gVar);
        this.f95941a = oVar;
        this.f95942b = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C36813s(this.f95941a, this.f95942b, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f95941a.mo40414h(this.f95942b);
        return C69788q.f186170a;
    }
}
