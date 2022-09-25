package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10295i;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.prewarmer.GoogleAppBrowserPrewarmerImpl$prewarmForJava$1", mo61344c = "GoogleAppBrowserPrewarmerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.i.c */
/* compiled from: PG */
final class C135858c extends C69572j implements C69630p {

    /* renamed from: a */
    int f370011a;

    /* renamed from: b */
    final /* synthetic */ C135860e f370012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135858c(C135860e eVar, C69577g gVar) {
        super(2, gVar);
        this.f370012b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135858c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f370011a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135860e eVar = this.f370012b;
            this.f370011a = 1;
            if (!eVar.f370014a) {
                obj2 = C69788q.f186170a;
            } else {
                obj2 = C71803m.m105040a(eVar.f370016c, new C135857b(eVar, (C69577g) null), this);
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135858c(this.f370012b, gVar);
    }
}
