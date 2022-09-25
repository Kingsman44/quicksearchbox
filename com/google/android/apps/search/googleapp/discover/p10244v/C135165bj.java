package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$delete$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {73, 74})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bj */
/* compiled from: PG */
final class C135165bj extends C69572j implements C69630p {

    /* renamed from: a */
    int f368169a;

    /* renamed from: b */
    final /* synthetic */ C135171bp f368170b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368171c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135165bj(C135171bp bpVar, C134755f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368170b = bpVar;
        this.f368171c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135165bj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368169a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368170b;
            C134755f fVar = this.f368171c;
            this.f368169a = 1;
            if (bpVar.mo112143d(fVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C135173br a = this.f368170b.mo112140a(this.f368171c);
        this.f368169a = 2;
        C135157bb bbVar = (C135157bb) a;
        Object a2 = C71803m.m105040a(bbVar.f368139e, new C135144ap(bbVar, (C69577g) null), this);
        if (a2 != C69554a.COROUTINE_SUSPENDED) {
            a2 = C69788q.f186170a;
        }
        if (a2 == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135165bj(this.f368170b, this.f368171c, gVar);
    }
}
