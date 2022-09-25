package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.C133979b;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.C133984g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverStreamFragmentPeer$triggerRefresh$1", mo61344c = "DiscoverStreamFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {859})
/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ad */
/* compiled from: PG */
final class C134810ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f367053a;

    /* renamed from: b */
    final /* synthetic */ C134904m f367054b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134810ad(C134904m mVar, C69577g gVar) {
        super(2, gVar);
        this.f367054b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134810ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367053a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40483));
                cVar.mo56386p("Error flushing & reporting actions");
            }
        } else {
            C69714l.m101134b(obj);
            C133984g gVar = this.f367054b.f367272U;
            this.f367053a = 1;
            Object a = C71803m.m105040a(gVar.f364955d, new C133979b(gVar, (C69577g) null), this);
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
        return new C134810ad(this.f367054b, gVar);
    }
}
