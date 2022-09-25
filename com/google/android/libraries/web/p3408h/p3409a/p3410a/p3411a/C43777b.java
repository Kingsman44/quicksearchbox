package com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.page.document.js.internal.AndroidMessagePort$onMessage$1", mo61344c = "WebMessageChannelsManager.kt", mo61345d = "invokeSuspend", mo61346e = {137})
/* renamed from: com.google.android.libraries.web.h.a.a.a.b */
/* compiled from: PG */
final class C43777b extends C69572j implements C69630p {

    /* renamed from: a */
    int f114151a;

    /* renamed from: b */
    final /* synthetic */ C43778c f114152b;

    /* renamed from: c */
    final /* synthetic */ String f114153c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43777b(C43778c cVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f114152b = cVar;
        this.f114153c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43777b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114151a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71547cx cxVar = this.f114152b.f114154a;
            String str = this.f114153c;
            this.f114151a = 1;
            if (cxVar.mo20883a(str, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43777b(this.f114152b, this.f114153c, gVar);
    }
}
