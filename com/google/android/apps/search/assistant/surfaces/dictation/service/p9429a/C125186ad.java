package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$AiAiListener$onError$1$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {568})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ad */
/* compiled from: PG */
final class C125186ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f345344a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345345b;

    /* renamed from: c */
    final /* synthetic */ int f345346c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125186ad(C125234by byVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f345345b = byVar;
        this.f345346c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125186ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345344a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125234by byVar = this.f345345b;
            int i = this.f345346c;
            this.f345344a = 1;
            if (byVar.mo106857d(i, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125186ad(this.f345345b, this.f345346c, gVar);
    }
}