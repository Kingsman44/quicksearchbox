package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.StreamDataService$makeOutOfBandRefresh$2", mo61344c = "StreamDataService.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.bj */
/* compiled from: PG */
public final class C135249bj extends C69572j implements C69630p {

    /* renamed from: a */
    int f368443a;

    /* renamed from: b */
    final /* synthetic */ C135250bk f368444b;

    /* renamed from: c */
    final /* synthetic */ C135050dx f368445c;

    /* renamed from: d */
    final /* synthetic */ C134766q f368446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135249bj(C135250bk bkVar, C135050dx dxVar, C134766q qVar, C69577g gVar) {
        super(2, gVar);
        this.f368444b = bkVar;
        this.f368445c = dxVar;
        this.f368446d = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135249bj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368443a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135314au auVar = this.f368444b.f368447a;
            C135050dx dxVar = this.f368445c;
            C134766q qVar = this.f368446d;
            this.f368443a = 1;
            if (auVar.mo112253b(dxVar, qVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135249bj(this.f368444b, this.f368445c, this.f368446d, gVar);
    }
}
