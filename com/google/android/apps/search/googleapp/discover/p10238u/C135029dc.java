package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10214s.C134601s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RefreshMetadataStore$getLastSuccessfulRefreshTime$2", mo61344c = "RefreshMetadataStore.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.dc */
/* compiled from: PG */
final class C135029dc extends C69572j implements C69630p {

    /* renamed from: a */
    int f367694a;

    /* renamed from: b */
    final /* synthetic */ C135032df f367695b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135029dc(C135032df dfVar, C69577g gVar) {
        super(2, gVar);
        this.f367695b = dfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135029dc) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367694a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C135032df.f367700a.mo56224b();
            cVar.mo56379ah(new C59094n(40403));
            cVar.mo56386p("#getLastSuccessfulTime");
            C60870cx d = this.f367695b.f367701b.mo46042d();
            C69664n.m101060f(d, "refreshMetadataProtoDataStore.data");
            this.f367694a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return C60945d.m93099d(((C134601s) obj).f366556b);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135029dc(this.f367695b, gVar);
    }
}
