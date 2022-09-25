package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$commitNewSession$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.j */
/* compiled from: PG */
public final class C135190j extends C69572j implements C69630p {

    /* renamed from: a */
    int f368245a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368246b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368247c;

    /* renamed from: d */
    final /* synthetic */ C60218r f368248d;

    /* renamed from: e */
    final /* synthetic */ C57051b f368249e;

    /* renamed from: f */
    final /* synthetic */ C134555at f368250f;

    /* renamed from: g */
    final /* synthetic */ List f368251g;

    /* renamed from: h */
    final /* synthetic */ C134548am f368252h;

    /* renamed from: i */
    final /* synthetic */ C134500f f368253i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135190j(C135200t tVar, C134755f fVar, C60218r rVar, C57051b bVar, C134555at atVar, List list, C134548am amVar, C134500f fVar2, C69577g gVar) {
        super(2, gVar);
        this.f368246b = tVar;
        this.f368247c = fVar;
        this.f368248d = rVar;
        this.f368249e = bVar;
        this.f368250f = atVar;
        this.f368251g = list;
        this.f368252h = amVar;
        this.f368253i = fVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135190j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368245a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368246b.f368289c;
            C134755f fVar = this.f368247c;
            C60218r rVar = this.f368248d;
            C57051b bVar = this.f368249e;
            C134555at atVar = this.f368250f;
            List list = this.f368251g;
            C134548am amVar = this.f368252h;
            C134500f fVar2 = this.f368253i;
            this.f368245a = 1;
            Object a = C71803m.m105040a(bpVar.f368191a, new C135164bi(bpVar, fVar, rVar, bVar, atVar, list, amVar, fVar2, (C69577g) null), this);
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
        return new C135190j(this.f368246b, this.f368247c, this.f368248d, this.f368249e, this.f368250f, this.f368251g, this.f368252h, this.f368253i, gVar);
    }
}
