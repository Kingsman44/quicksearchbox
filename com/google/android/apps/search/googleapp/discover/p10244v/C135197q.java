package com.google.android.apps.search.googleapp.discover.p10244v;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$recordUserInteraction$1", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.q */
/* compiled from: PG */
final class C135197q extends C69572j implements C69630p {

    /* renamed from: a */
    int f368277a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368278b;

    /* renamed from: c */
    final /* synthetic */ String f368279c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135197q(C135200t tVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f368278b = tVar;
        this.f368279c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135197q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368277a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135183ca caVar = this.f368278b.f368288b;
            String str = this.f368279c;
            this.f368277a = 1;
            Object c = caVar.mo112152c(str, new C135179bx(caVar), this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135197q(this.f368278b, this.f368279c, gVar);
    }
}
