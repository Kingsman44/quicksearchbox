package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.p10238u.C134992bx;
import com.google.android.apps.search.googleapp.discover.p10238u.C135012cn;
import com.google.android.apps.search.googleapp.discover.p10238u.C135016cr;
import com.google.android.apps.search.googleapp.discover.p10238u.C135034dh;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10238u.C135069ep;
import com.google.android.apps.search.googleapp.discover.p10238u.C135071er;
import com.google.android.apps.search.googleapp.discover.p10238u.C135072es;
import com.google.android.apps.search.googleapp.discover.p10238u.C135086ff;
import com.google.android.apps.search.googleapp.discover.p10238u.C135090fj;
import com.google.android.apps.search.googleapp.discover.p10248y.C135249bj;
import com.google.android.apps.search.googleapp.discover.p10248y.C135250bk;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverStreamFragmentPeer$maybeHandlePinnedContentToken$1", mo61344c = "DiscoverStreamFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {1015})
/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.v */
/* compiled from: PG */
final class C134917v extends C69572j implements C69630p {

    /* renamed from: a */
    int f367346a;

    /* renamed from: b */
    final /* synthetic */ C134904m f367347b;

    /* renamed from: c */
    final /* synthetic */ C57315dp f367348c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134917v(C134904m mVar, C57315dp dpVar, C69577g gVar) {
        super(2, gVar);
        this.f367347b = mVar;
        this.f367348c = dpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134917v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367346a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134904m mVar = this.f367347b;
            C135250bk bkVar = mVar.f367264M;
            C135086ff ffVar = mVar.f367259H;
            C57315dp dpVar = this.f367348c;
            C69664n.m101061g(dpVar, "token");
            C135072es esVar = new C135072es(dpVar);
            C135090fj cnVar = (ffVar.f367923h || C134992bx.m218910a()) ? new C135012cn(new C135069ep(ffVar, (C69577g) null)) : new C135016cr(new C135071er(ffVar, (C69577g) null));
            C57259bn bnVar = C57259bn.PINNED_CONTENT_REFRESH;
            C135034dh dhVar = C135034dh.PINNED_CONTENT;
            C37258g gVar = C37182a.f97771aC;
            C69664n.m101060f(gVar, "DISCOVER_PINNED_CONTENT_FEED_REQUEST_START");
            C135050dx dxVar = new C135050dx(bnVar, (C57252bg) null, BuildConfig.FLAVOR, esVar, dhVar, gVar, cnVar, ffVar.f367928m);
            C134766q qVar = this.f367347b.f367265N;
            this.f367346a = 1;
            Object a = C71803m.m105040a(bkVar.f368451e, new C135249bj(bkVar, dxVar, qVar, (C69577g) null), this);
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
        return new C134917v(this.f367347b, this.f367348c, gVar);
    }
}
