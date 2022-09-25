package com.google.android.apps.search.assistant.libraries.dictation.p8960a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.dictation.performer.StartDictationTngPerformer$perform$1", mo61344c = "StartDictationTngPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {32})
/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.a.a */
/* compiled from: PG */
final class C119260a extends C69572j implements C69630p {

    /* renamed from: a */
    int f332588a;

    /* renamed from: b */
    final /* synthetic */ C119263d f332589b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f332590c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119260a(C119263d dVar, C51809dy dyVar, C69577g gVar) {
        super(2, gVar);
        this.f332589b = dVar;
        this.f332590c = dyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119260a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332588a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119263d dVar = this.f332589b;
            C51809dy dyVar = this.f332590c;
            this.f332588a = 1;
            obj = dVar.mo104266b(dyVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119260a(this.f332589b, this.f332590c, gVar);
    }
}
