package com.google.android.libraries.kids.platform.kidonboarding;

import android.net.Uri;
import android.view.View;
import com.google.apps.tiktok.coroutines.p3632a.C46599ah;
import com.google.apps.tiktok.coroutines.p3632a.C46601aj;
import com.google.apps.tiktok.coroutines.p3632a.C46605an;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4109av.p4114c.p4115a.p4116a.C54610c;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54615h;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.m */
/* compiled from: PG */
final /* synthetic */ class C24056m extends C69663m implements C69626l {
    public C24056m(Object obj) {
        super(1, obj, C24058o.class, "handleAuthenticatedUri", "handleAuthenticatedUri(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;)V", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C46605an anVar = (C46605an) obj;
        C69664n.m101061g(anVar, "p0");
        C24058o oVar = (C24058o) this.f186034c;
        if (anVar instanceof C46601aj) {
            View requireView = oVar.f65728c.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            oVar.mo29443a(requireView).loadUrl(((Uri) ((C46601aj) anVar).f121790a).toString());
        } else if (anVar instanceof C46599ah) {
            C59052c cVar = (C59052c) ((C59052c) C24058o.f65726a.mo56225c()).mo56382g(((C46599ah) anVar).f121788a);
            cVar.mo56379ah(new C59094n(48705));
            cVar.mo56386p("Failed to authenticate URL.");
            C54610c cVar2 = (C54610c) C54613f.f143382f.createBuilder();
            C69664n.m101060f(cVar2, "newBuilder()");
            C54615h a = C69664n.m101061g(cVar2, "builder");
            a.mo54146b(C54612e.UNRECOVERABLE_ERROR);
            oVar.mo29445c(a.mo54145a());
        }
        return C69788q.f186170a;
    }
}
