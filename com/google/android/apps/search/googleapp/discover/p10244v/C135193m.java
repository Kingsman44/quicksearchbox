package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$getContent$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {128})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.m */
/* compiled from: PG */
public final class C135193m extends C69572j implements C69630p {

    /* renamed from: a */
    int f368262a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368263b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368264c;

    /* renamed from: d */
    final /* synthetic */ String f368265d;

    /* renamed from: e */
    final /* synthetic */ Set f368266e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135193m(C135200t tVar, C134755f fVar, String str, Set set, C69577g gVar) {
        super(2, gVar);
        this.f368263b = tVar;
        this.f368264c = fVar;
        this.f368265d = str;
        this.f368266e = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135193m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368262a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368263b.f368289c;
            C134755f fVar = this.f368264c;
            String str = this.f368265d;
            Set set = this.f368266e;
            this.f368262a = 1;
            obj = C71803m.m105040a(bpVar.f368191a, new C135166bk(bpVar, fVar, set, str, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135193m(this.f368263b, this.f368264c, this.f368265d, this.f368266e, gVar);
    }
}
