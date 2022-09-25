package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32458q;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.tng.assistant.thirdpartydataservice.impl.RemoteActionsDataServiceImpl$subscribeToFlow$1$4", mo61344c = "RemoteActionsDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {128})
/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.l */
/* compiled from: PG */
final class C13093l extends C69572j implements C69630p {

    /* renamed from: a */
    int f40605a;

    /* renamed from: b */
    final /* synthetic */ C32433a f40606b;

    /* renamed from: c */
    final /* synthetic */ C13097p f40607c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13093l(C32433a aVar, C13097p pVar, C69577g gVar) {
        super(2, gVar);
        this.f40606b = aVar;
        this.f40607c = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C13093l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f40605a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(((C32458q) this.f40606b).f86977f);
            C13092k kVar = new C13092k(this.f40607c);
            this.f40605a = 1;
            if (a.mo38165mp(kVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C13093l(this.f40606b, this.f40607c, gVar);
    }
}
