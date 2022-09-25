package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10184f.C134258i;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistNextPageResponse$2$1", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.x */
/* compiled from: PG */
final class C135367x extends C69572j implements C69630p {

    /* renamed from: a */
    int f368823a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368824b;

    /* renamed from: c */
    final /* synthetic */ C134587e f368825c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135367x(C135294aa aaVar, C134587e eVar, C69577g gVar) {
        super(2, gVar);
        this.f368824b = aaVar;
        this.f368825c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135367x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368823a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134258i iVar = this.f368824b.f368538c;
            C134587e eVar = this.f368825c;
            this.f368823a = 1;
            if (iVar.mo111663a(eVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135367x(this.f368824b, this.f368825c, gVar);
    }
}
