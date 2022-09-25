package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71647ct;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityImpl$initialize$1$1$1", mo61344c = "VoiceInteractionSessionConformityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {63, 64})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.k */
/* compiled from: PG */
final class C120065k extends C69572j implements C69630p {

    /* renamed from: a */
    int f334244a;

    /* renamed from: b */
    final /* synthetic */ C71643cp f334245b;

    /* renamed from: c */
    final /* synthetic */ C120076v f334246c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120065k(C71643cp cpVar, C120076v vVar, C69577g gVar) {
        super(2, gVar);
        this.f334245b = cpVar;
        this.f334246c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120065k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f334244a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71643cp cpVar = this.f334245b;
            this.f334244a = 1;
            if (C71647ct.m104637a(cpVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C120076v vVar = this.f334246c;
        C120124o oVar = C120124o.CLASSIC;
        this.f334244a = 2;
        if (vVar.mo104657b(oVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120065k(this.f334245b, this.f334246c, gVar);
    }
}
