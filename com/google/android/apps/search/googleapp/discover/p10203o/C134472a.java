package com.google.android.apps.search.googleapp.discover.p10203o;

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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.minusone.MinusOneDataManager$getLastLoadTime$2", mo61344c = "MinusOneDataManager.kt", mo61345d = "invokeSuspend", mo61346e = {48})
/* renamed from: com.google.android.apps.search.googleapp.discover.o.a */
/* compiled from: PG */
public final class C134472a extends C69572j implements C69630p {

    /* renamed from: a */
    int f366227a;

    /* renamed from: b */
    final /* synthetic */ C134475d f366228b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134472a(C134475d dVar, C69577g gVar) {
        super(2, gVar);
        this.f366228b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134472a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366227a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f366228b.f366233b.mo46042d();
            C69664n.m101060f(d, "store.data");
            this.f366227a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C63042fg fgVar = ((C134477f) obj).f366240b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "store.data.await().minusOneLastLoadTime");
        return C62949a.m95469d(fgVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134472a(this.f366228b, gVar);
    }
}
