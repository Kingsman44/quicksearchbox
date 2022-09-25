package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityClientImpl$subscribe$subscription$4", mo61344c = "VoiceInteractionSessionConformityClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.i */
/* compiled from: PG */
final class C120063i extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C120124o f334240a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120063i(C120124o oVar, C69577g gVar) {
        super(3, gVar);
        this.f334240a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C120063i(this.f334240a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C120064j.f334241a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        C120124o oVar = this.f334240a;
        cVar.mo56379ah(new C59094n(34641));
        cVar.mo56389s("Conformity tracking session ended @ %s.", oVar);
        return C69788q.f186170a;
    }
}
