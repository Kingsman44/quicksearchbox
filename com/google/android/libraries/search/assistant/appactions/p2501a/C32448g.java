package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3940d.p3941a.C52896c;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71760h;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.appactions.actionsservice.ActionsServiceSessionImpl$handleSimpleCollectionRequest$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {310, 339})
/* renamed from: com.google.android.libraries.search.assistant.appactions.a.g */
/* compiled from: PG */
final class C32448g extends C69572j implements C69630p {

    /* renamed from: a */
    int f86939a;

    /* renamed from: b */
    final /* synthetic */ C32458q f86940b;

    /* renamed from: c */
    final /* synthetic */ List f86941c;

    /* renamed from: d */
    final /* synthetic */ C52896c f86942d;

    /* renamed from: e */
    final /* synthetic */ int f86943e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32448g(C32458q qVar, List list, C52896c cVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f86940b = qVar;
        this.f86941c = list;
        this.f86942d = cVar;
        this.f86943e = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32448g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f86939a;
        if (i == 0) {
            C69714l.m101134b(obj);
            List list = this.f86941c;
            C32447f fVar = new C32447f(this.f86942d, this.f86943e, (C69577g) null);
            this.f86939a = 1;
            obj = C71423ax.m104196a(new C32450i(list, fVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            this.f86940b.f86982k.mo62807f(new C32438ae((List) obj));
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        this.f86939a = 2;
        obj = C71760h.m104949a((Collection) obj, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f86940b.f86982k.mo62807f(new C32438ae((List) obj));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32448g(this.f86940b, this.f86941c, this.f86942d, this.f86943e, gVar);
    }
}
