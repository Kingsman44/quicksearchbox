package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.async.FlowDelimiterKt$delimitedBy$1$closingJob$1", mo61344c = "FlowDelimiter.kt", mo61345d = "invokeSuspend", mo61346e = {27})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.h */
/* compiled from: PG */
final class C125278h extends C69572j implements C69630p {

    /* renamed from: a */
    int f345607a;

    /* renamed from: b */
    final /* synthetic */ C125276f f345608b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f345609c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125278h(C125276f fVar, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f345608b = fVar;
        this.f345609c = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125278h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345607a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f345608b.f345605a;
            this.f345607a = 1;
            if (zVar.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        this.f345609c.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125278h(this.f345608b, this.f345609c, gVar);
    }
}
