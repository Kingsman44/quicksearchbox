package com.google.android.apps.search.googleapp.discover.p10182e.p10183a;

import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.appstatus.dataservice.FirstApplicationLaunchDataServiceImpl$getFirstApplicationLaunchSignal$2", mo61344c = "FirstApplicationLaunchDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.googleapp.discover.e.a.d */
/* compiled from: PG */
final class C134241d extends C69572j implements C69630p {

    /* renamed from: a */
    int f365714a;

    /* renamed from: b */
    final /* synthetic */ C134243f f365715b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134241d(C134243f fVar, C69577g gVar) {
        super(2, gVar);
        this.f365715b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134241d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365714a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f365715b.f365718a.mo46042d();
            C69664n.m101060f(d, "dataStore.data");
            this.f365714a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C63042fg fgVar = ((C134248k) obj).f365724b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "data.firstApplicationLaunchTime");
        return C62949a.m95469d(fgVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134241d(this.f365715b, gVar);
    }
}
