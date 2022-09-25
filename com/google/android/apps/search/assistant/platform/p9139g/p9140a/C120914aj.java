package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$requestFulfillmentAsync$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {259})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.aj */
/* compiled from: PG */
final class C120914aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f336169a;

    /* renamed from: b */
    final /* synthetic */ C52897d f336170b;

    /* renamed from: c */
    final /* synthetic */ C120917am f336171c;

    /* renamed from: d */
    final /* synthetic */ C52896c f336172d;

    /* renamed from: e */
    final /* synthetic */ int f336173e;

    /* renamed from: f */
    final /* synthetic */ C71816z f336174f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120914aj(C52897d dVar, C71816z zVar, C120917am amVar, C52896c cVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f336170b = dVar;
        this.f336174f = zVar;
        this.f336171c = amVar;
        this.f336172d = cVar;
        this.f336173e = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120914aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336169a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71590q.m104504a(new C120912ah(this.f336170b, this.f336174f, this.f336171c, (C69577g) null));
            C120913ai aiVar = new C120913ai(this.f336171c, this.f336172d, this.f336173e);
            this.f336169a = 1;
            if (C71450g.m104241h((C71450g) a, aiVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120914aj(this.f336170b, this.f336174f, this.f336171c, this.f336172d, this.f336173e, gVar);
    }
}
