package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.execution.performer.SendPerformer$perform$1", mo61344c = "SendPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.w */
/* compiled from: PG */
final class C125457w extends C69572j implements C69630p {

    /* renamed from: a */
    int f345963a;

    /* renamed from: b */
    final /* synthetic */ C125459y f345964b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f345965c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125457w(C125459y yVar, C51809dy dyVar, C69577g gVar) {
        super(2, gVar);
        this.f345964b = yVar;
        this.f345965c = dyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125457w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345963a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125459y yVar = this.f345964b;
            C51809dy dyVar = this.f345965c;
            this.f345963a = 1;
            obj = yVar.mo106974b(dyVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125457w(this.f345964b, this.f345965c, gVar);
    }
}
