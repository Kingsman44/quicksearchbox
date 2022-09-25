package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3428m.C43941r;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.web.data.internal.WebStateCoordinatorModelKt$webStateFlow$2$1", mo61344c = "WebStateCoordinatorModel.kt", mo61345d = "invokeSuspend", mo61346e = {167})
/* renamed from: com.google.android.libraries.web.c.b.l */
/* compiled from: PG */
final class C43343l extends C69572j implements C69630p {

    /* renamed from: a */
    int f113219a;

    /* renamed from: b */
    final /* synthetic */ C43731a f113220b;

    /* renamed from: c */
    final /* synthetic */ C71548cy f113221c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43343l(C43731a aVar, C71548cy cyVar, C69577g gVar) {
        super(2, gVar);
        this.f113220b = aVar;
        this.f113221c = cyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43343l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113219a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            aeVar.f186027a = C43374s.RENDER_UNSUPPORTED;
            C71587n e = C71506bj.m104339e(C43941r.m77580a(this.f113220b), new C43342k((C69577g) null));
            C43341j jVar = new C43341j(aeVar, this.f113221c);
            this.f113219a = 1;
            if (e.mo38165mp(jVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43343l(this.f113220b, this.f113221c, gVar);
    }
}
