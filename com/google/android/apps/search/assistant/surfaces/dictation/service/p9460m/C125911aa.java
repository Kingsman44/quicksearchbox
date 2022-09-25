package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71573dw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.keyboardstate.KeyboardStateTailNotifier$notifyStateUpdateFuture$1", mo61344c = "KeyboardStateTailNotifier.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.aa */
/* compiled from: PG */
final class C125911aa extends C69572j implements C69630p {

    /* renamed from: a */
    int f347002a;

    /* renamed from: b */
    final /* synthetic */ C125912ab f347003b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125911aa(C125912ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f347003b = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125911aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f347002a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125912ab abVar = this.f347003b;
            this.f347002a = 1;
            ((C71573dw) abVar.f347005b).mo62807f(abVar.f347004a.mo107203b());
            if (C69788q.f186170a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125911aa(this.f347003b, gVar);
    }
}
