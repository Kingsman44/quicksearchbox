package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134216e;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.FeedClient$executeFirstPageRequest$2", mo61344c = "FeedClient.kt", mo61345d = "invokeSuspend", mo61346e = {66})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.bd */
/* compiled from: PG */
final class C134972bd extends C69572j implements C69630p {

    /* renamed from: a */
    int f367505a;

    /* renamed from: b */
    final /* synthetic */ C134980bl f367506b;

    /* renamed from: c */
    final /* synthetic */ UUID f367507c;

    /* renamed from: d */
    final /* synthetic */ C57259bn f367508d;

    /* renamed from: e */
    final /* synthetic */ C57303dd f367509e;

    /* renamed from: f */
    final /* synthetic */ String f367510f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134972bd(C134980bl blVar, UUID uuid, C57259bn bnVar, C57303dd ddVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f367506b = blVar;
        this.f367507c = uuid;
        this.f367508d = bnVar;
        this.f367509e = ddVar;
        this.f367510f = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134972bd) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367505a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134216e a = this.f367506b.f367550b.mo111650a(this.f367507c, false, this.f367508d);
            C134980bl blVar = this.f367506b;
            C57303dd ddVar = this.f367509e;
            String str = this.f367510f;
            C57259bn bnVar = this.f367508d;
            this.f367505a = 1;
            obj = blVar.mo112098b(ddVar, str, a, bnVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134972bd(this.f367506b, this.f367507c, this.f367508d, this.f367509e, this.f367510f, gVar);
    }
}
