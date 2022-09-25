package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3940d.p3941a.C52896c;
import com.google.assistant.p3931f.p3940d.p3941a.C52897d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.appactions.actionsservice.ActionsServiceSessionImpl$requestFulfillmentAsync$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {242})
/* renamed from: com.google.android.libraries.search.assistant.appactions.a.n */
/* compiled from: PG */
final class C32455n extends C69572j implements C69630p {

    /* renamed from: a */
    int f86961a;

    /* renamed from: b */
    final /* synthetic */ C52897d f86962b;

    /* renamed from: c */
    final /* synthetic */ C32458q f86963c;

    /* renamed from: d */
    final /* synthetic */ C52896c f86964d;

    /* renamed from: e */
    final /* synthetic */ int f86965e;

    /* renamed from: f */
    final /* synthetic */ C71816z f86966f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32455n(C52897d dVar, C71816z zVar, C32458q qVar, C52896c cVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f86962b = dVar;
        this.f86966f = zVar;
        this.f86963c = qVar;
        this.f86964d = cVar;
        this.f86965e = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32455n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86961a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71590q.m104504a(new C32453l(this.f86962b, this.f86966f, this.f86963c, (C69577g) null));
            C32454m mVar = new C32454m(this.f86963c, this.f86964d, this.f86965e);
            this.f86961a = 1;
            if (C71450g.m104241h((C71450g) a, mVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32455n(this.f86962b, this.f86966f, this.f86963c, this.f86964d, this.f86965e, gVar);
    }
}
