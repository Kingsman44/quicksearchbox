package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$setSessionStatus$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.r */
/* compiled from: PG */
public final class C135198r extends C69572j implements C69630p {

    /* renamed from: a */
    int f368280a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368281b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368282c;

    /* renamed from: d */
    final /* synthetic */ C134555at f368283d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135198r(C135200t tVar, C134755f fVar, C134555at atVar, C69577g gVar) {
        super(2, gVar);
        this.f368281b = tVar;
        this.f368282c = fVar;
        this.f368283d = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135198r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368280a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368281b.f368289c;
            C134755f fVar = this.f368282c;
            C134555at atVar = this.f368283d;
            this.f368280a = 1;
            Object a = C71803m.m105040a(bpVar.f368191a, new C135169bn(bpVar, fVar, atVar, (C69577g) null), this);
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
        return new C135198r(this.f368281b, this.f368282c, this.f368283d, gVar);
    }
}
