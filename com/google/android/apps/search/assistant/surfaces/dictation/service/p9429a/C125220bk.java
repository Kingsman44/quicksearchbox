package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.libraries.search.assistant.p2511d.C32559v;
import com.google.protobuf.C62910ar;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$scheduleClose$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {460})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.bk */
/* compiled from: PG */
final class C125220bk extends C69572j implements C69630p {

    /* renamed from: a */
    int f345404a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345405b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125220bk(C125234by byVar, C69577g gVar) {
        super(2, gVar);
        this.f345405b = byVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125220bk) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345404a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C62910ar arVar = this.f345405b.f345461g;
            this.f345404a = 1;
            if (C32559v.m60377a(arVar, this) == aVar) {
                return aVar;
            }
        }
        this.f345405b.close();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125220bk(this.f345405b, gVar);
    }
}
