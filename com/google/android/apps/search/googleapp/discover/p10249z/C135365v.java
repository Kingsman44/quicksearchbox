package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10237t.C134925a;
import com.google.android.apps.search.googleapp.discover.p10244v.C135190j;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistFirstPageResponse$2$3", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.v */
/* compiled from: PG */
final class C135365v extends C69572j implements C69630p {

    /* renamed from: a */
    int f368810a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368811b;

    /* renamed from: c */
    final /* synthetic */ C134766q f368812c;

    /* renamed from: d */
    final /* synthetic */ C134925a f368813d;

    /* renamed from: e */
    final /* synthetic */ C134555at f368814e;

    /* renamed from: f */
    final /* synthetic */ List f368815f;

    /* renamed from: g */
    final /* synthetic */ C134500f f368816g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135365v(C135294aa aaVar, C134766q qVar, C134925a aVar, C134555at atVar, List list, C134500f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368811b = aaVar;
        this.f368812c = qVar;
        this.f368813d = aVar;
        this.f368814e = atVar;
        this.f368815f = list;
        this.f368816g = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135365v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368810a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135200t tVar = this.f368811b.f368536a;
            C134755f fVar = this.f368812c.f366954c;
            C134925a aVar2 = this.f368813d;
            C60218r rVar = aVar2.f367363a;
            C57051b bVar = aVar2.f367364b;
            C134555at atVar = this.f368814e;
            List list = this.f368815f;
            C134548am amVar = aVar2.f367369g;
            C134500f fVar2 = this.f368816g;
            this.f368810a = 1;
            Object a = C71803m.m105040a(tVar.f368290d, new C135190j(tVar, fVar, rVar, bVar, atVar, list, amVar, fVar2, (C69577g) null), this);
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
        return new C135365v(this.f368811b, this.f368812c, this.f368813d, this.f368814e, this.f368815f, this.f368816g, gVar);
    }
}
