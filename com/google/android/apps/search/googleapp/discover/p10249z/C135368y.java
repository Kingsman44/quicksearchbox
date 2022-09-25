package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10244v.C135188h;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistNextPageResponse$2$2", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.y */
/* compiled from: PG */
final class C135368y extends C69572j implements C69630p {

    /* renamed from: a */
    int f368826a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368827b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368828c;

    /* renamed from: d */
    final /* synthetic */ String f368829d;

    /* renamed from: e */
    final /* synthetic */ List f368830e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135368y(C135294aa aaVar, C134755f fVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f368827b = aaVar;
        this.f368828c = fVar;
        this.f368829d = str;
        this.f368830e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135368y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368826a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135200t tVar = this.f368827b.f368536a;
            C134755f fVar = this.f368828c;
            String str = this.f368829d;
            List list = this.f368830e;
            this.f368826a = 1;
            Object a = C71803m.m105040a(tVar.f368290d, new C135188h(tVar, fVar, str, list, (C69577g) null), this);
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
        return new C135368y(this.f368827b, this.f368828c, this.f368829d, this.f368830e, gVar);
    }
}
