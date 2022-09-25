package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.view.ViewActionsLogger$reportViewActions$2", mo61344c = "ViewActionsLogger.kt", mo61345d = "invokeSuspend", mo61346e = {255})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.d */
/* compiled from: PG */
final class C133981d extends C69572j implements C69630p {

    /* renamed from: a */
    int f364943a;

    /* renamed from: b */
    final /* synthetic */ List f364944b;

    /* renamed from: c */
    final /* synthetic */ C133984g f364945c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133981d(List list, C133984g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f364944b = list;
        this.f364945c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133981d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364943a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (!this.f364944b.isEmpty()) {
                C133984g gVar = this.f364945c;
                C133986i iVar = gVar.f364952a;
                List list = this.f364944b;
                Instant a = gVar.f364954c.mo57444a();
                C69664n.m101060f(a, "timeSource.now()");
                this.f364943a = 1;
                Object a2 = C71803m.m105040a(iVar.f364972c, new C133985h(list, iVar, a, (C69577g) null), this);
                if (a2 != C69554a.COROUTINE_SUSPENDED) {
                    a2 = C69788q.f186170a;
                }
                if (a2 == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133981d(this.f364944b, this.f364945c, gVar);
    }
}
