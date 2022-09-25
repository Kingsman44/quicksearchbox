package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiController$onSessionFinished$3", mo61344c = "AiAiController.kt", mo61345d = "invokeSuspend", mo61346e = {65})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.s */
/* compiled from: PG */
final class C125263s extends C69572j implements C69630p {

    /* renamed from: a */
    int f345570a;

    /* renamed from: b */
    final /* synthetic */ C125265u f345571b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125263s(C125265u uVar, C69577g gVar) {
        super(2, gVar);
        this.f345571b = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125263s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345570a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125265u uVar = this.f345571b;
            this.f345570a = 1;
            if (uVar.mo106891d(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125263s(this.f345571b, gVar);
    }
}
