package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71517bu;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityImpl$satisfyVariance$2", mo61344c = "VoiceInteractionSessionConformityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.u */
/* compiled from: PG */
final class C120075u extends C69572j implements C69630p {

    /* renamed from: a */
    int f334272a;

    /* renamed from: b */
    final /* synthetic */ C120076v f334273b;

    /* renamed from: c */
    final /* synthetic */ C120124o f334274c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120075u(C120076v vVar, C120124o oVar, C69577g gVar) {
        super(2, gVar);
        this.f334273b = vVar;
        this.f334274c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120075u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334272a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71571du duVar = this.f334273b.f334277b.f334212c;
            C120074t tVar = new C120074t(this.f334274c, (C69577g) null);
            this.f334272a = 1;
            obj = C71517bu.m104351b(duVar, tVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120075u(this.f334273b, this.f334274c, gVar);
    }
}
