package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.DirectActionsContextImpl$start$1$job$1$1$1", mo61344c = "DirectActionsContextImpl.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.p */
/* compiled from: PG */
final class C125361p extends C69572j implements C69630p {

    /* renamed from: a */
    int f345754a;

    /* renamed from: b */
    final /* synthetic */ C125364s f345755b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125361p(C125364s sVar, C69577g gVar) {
        super(2, gVar);
        this.f345755b = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125361p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345754a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C125365t.f345773a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(36539));
                cVar.mo56386p("onDirectActionsInvalidated failed [SD]");
                this.f345755b.mo106935c();
            }
        } else {
            C69714l.m101134b(obj);
            C125364s sVar = this.f345755b;
            this.f345754a = 1;
            Object a = C71423ax.m104196a(new C125354i(sVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125361p(this.f345755b, gVar);
    }
}
