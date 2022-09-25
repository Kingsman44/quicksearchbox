package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiLanguagePackManager$getAiAiStatus$2", mo61344c = "AiAiLanguagePackManager.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.z */
/* compiled from: PG */
final class C125270z extends C69572j implements C69630p {

    /* renamed from: a */
    int f345590a;

    /* renamed from: b */
    final /* synthetic */ C71816z f345591b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125270z(C71816z zVar, C69577g gVar) {
        super(2, gVar);
        this.f345591b = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125270z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345590a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f345591b;
            this.f345590a = 1;
            obj = zVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125270z(this.f345591b, gVar);
    }
}
