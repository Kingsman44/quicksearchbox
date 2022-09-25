package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32784af;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32787ai;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.ClientIdFetcher$fetchClientId$4", mo61344c = "ClientIdFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bn */
/* compiled from: PG */
final class C32645bn extends C69572j implements C69631q {

    /* renamed from: a */
    int f87499a;

    /* renamed from: b */
    /* synthetic */ Object f87500b;

    /* renamed from: c */
    /* synthetic */ Object f87501c;

    /* renamed from: d */
    final /* synthetic */ C69630p f87502d;

    /* renamed from: e */
    final /* synthetic */ C32840ch f87503e;

    /* renamed from: f */
    final /* synthetic */ boolean f87504f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32645bn(C69630p pVar, C32840ch chVar, boolean z, C69577g gVar) {
        super(3, gVar);
        this.f87502d = pVar;
        this.f87503e = chVar;
        this.f87504f = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C32645bn bnVar = new C32645bn(this.f87502d, this.f87503e, this.f87504f, (C69577g) obj3);
        bnVar.f87500b = (C32879y) obj;
        bnVar.f87501c = (C32871q) obj2;
        return bnVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87499a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f87500b;
            Object obj3 = this.f87501c;
            C32840ch chVar = this.f87503e;
            boolean z = this.f87504f;
            C32784af afVar = (C32784af) C32785ag.f87957e.createBuilder();
            C69664n.m101060f(afVar, "newBuilder()");
            C32787ai a = C69664n.m101061g(afVar, "builder");
            a.mo38296c((C32879y) obj2);
            a.mo38295b((C32871q) obj3);
            a.mo38297d(chVar);
            C32784af afVar2 = a.f87964a;
            afVar2.copyOnWrite();
            ((C32785ag) afVar2.instance).f87962d = z;
            C32785ag a2 = a.mo38294a();
            C69630p pVar = this.f87502d;
            this.f87500b = null;
            this.f87499a = 1;
            obj = pVar.mo5192a(a2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32801aw awVar = ((C32821bp) obj).f88016a;
        if (awVar == null) {
            awVar = C32801aw.f87978c;
        }
        C69664n.m101060f(awVar, "getContext(contextFetchRequest).contextResult");
        return awVar;
    }
}
