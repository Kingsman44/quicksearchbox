package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10237t.C134925a;
import com.google.android.apps.search.googleapp.discover.p10238u.C135031de;
import com.google.android.apps.search.googleapp.discover.p10238u.C135032df;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4580v.C60945d;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistFirstPageResponse$2$1", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.t */
/* compiled from: PG */
final class C135363t extends C69572j implements C69630p {

    /* renamed from: a */
    int f368804a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368805b;

    /* renamed from: c */
    final /* synthetic */ C134925a f368806c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135363t(C135294aa aaVar, C134925a aVar, C69577g gVar) {
        super(2, gVar);
        this.f368805b = aaVar;
        this.f368806c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135363t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368804a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135032df dfVar = this.f368805b.f368537b;
            C60220t tVar = this.f368806c.f367363a.f162928b;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            Instant d = C60945d.m93099d(tVar.f162934b);
            C69664n.m101060f(d, "ofEpochMicros(clientResp…nseEventId.base.timeUsec)");
            this.f368804a = 1;
            if (C71803m.m105040a(dfVar.f367703d, new C135031de(d, dfVar, (C69577g) null), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135363t(this.f368805b, this.f368806c, gVar);
    }
}
