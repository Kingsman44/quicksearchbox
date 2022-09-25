package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityImpl$initialize$1$coroutine$2", mo61344c = "VoiceInteractionSessionConformityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {58})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.m */
/* compiled from: PG */
final class C120067m extends C69572j implements C69630p {

    /* renamed from: a */
    int f334249a;

    /* renamed from: b */
    /* synthetic */ Object f334250b;

    /* renamed from: c */
    final /* synthetic */ C120076v f334251c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120067m(C120076v vVar, C69577g gVar) {
        super(2, gVar);
        this.f334251c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120067m) mo5194c((C120124o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334249a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120076v vVar = this.f334251c;
            this.f334249a = 1;
            if (vVar.mo104657b((C120124o) this.f334250b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120067m mVar = new C120067m(this.f334251c, gVar);
        mVar.f334250b = obj;
        return mVar;
    }
}
