package com.google.android.libraries.search.assistant.p2697j.p2698a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.coroutines.flow.ExtensionsKt$runningMap$2", mo61344c = "Extensions.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.libraries.search.assistant.j.a.i */
/* compiled from: PG */
final class C34741i extends C69572j implements C69630p {

    /* renamed from: a */
    int f92199a;

    /* renamed from: b */
    final /* synthetic */ Object f92200b;

    /* renamed from: c */
    final /* synthetic */ C71587n f92201c;

    /* renamed from: d */
    final /* synthetic */ C69631q f92202d;

    /* renamed from: e */
    private /* synthetic */ Object f92203e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34741i(Object obj, C71587n nVar, C69631q qVar, C69577g gVar) {
        super(2, gVar);
        this.f92200b = obj;
        this.f92201c = nVar;
        this.f92202d = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34741i) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92199a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            aeVar.f186027a = this.f92200b;
            C71587n nVar = this.f92201c;
            C34740h hVar = new C34740h(this.f92202d, aeVar, (C71588o) this.f92203e);
            this.f92199a = 1;
            if (nVar.mo38165mp(hVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34741i iVar = new C34741i(this.f92200b, this.f92201c, this.f92202d, gVar);
        iVar.f92203e = obj;
        return iVar;
    }
}
