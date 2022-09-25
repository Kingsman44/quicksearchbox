package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$AiAiListener$onPartialResults$1$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {614})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ae */
/* compiled from: PG */
final class C125187ae extends C69572j implements C69630p {

    /* renamed from: a */
    int f345347a;

    /* renamed from: b */
    final /* synthetic */ Bundle f345348b;

    /* renamed from: c */
    final /* synthetic */ C125234by f345349c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125187ae(Bundle bundle, C125234by byVar, C69577g gVar) {
        super(2, gVar);
        this.f345348b = bundle;
        this.f345349c = byVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125187ae) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345347a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Bundle bundle = this.f345348b;
            boolean z = bundle != null ? bundle.getBoolean("final_result") : false;
            C125234by byVar = this.f345349c;
            Bundle bundle2 = this.f345348b;
            this.f345347a = 1;
            if (byVar.mo106859f(bundle2, z, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125187ae(this.f345348b, this.f345349c, gVar);
    }
}
