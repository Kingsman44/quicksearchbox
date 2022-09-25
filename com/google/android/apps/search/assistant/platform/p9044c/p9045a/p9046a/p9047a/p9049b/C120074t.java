package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityImpl$satisfyVariance$2$1", mo61344c = "VoiceInteractionSessionConformityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.t */
/* compiled from: PG */
final class C120074t extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f334270a;

    /* renamed from: b */
    final /* synthetic */ C120124o f334271b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120074t(C120124o oVar, C69577g gVar) {
        super(2, gVar);
        this.f334271b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120074t) mo5194c((C120079y) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C120079y yVar = (C120079y) this.f334270a;
        boolean z = true;
        if (!(yVar == null || yVar.mo104645a() == this.f334271b)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120074t tVar = new C120074t(this.f334271b, gVar);
        tVar.f334270a = obj;
        return tVar;
    }
}
