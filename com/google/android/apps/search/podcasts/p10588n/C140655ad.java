package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.common.p4522b.C58459fv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.ad */
/* compiled from: PG */
final class C140655ad extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140659ah f382026a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140655ad(C140659ah ahVar) {
        super(1);
        this.f382026a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List<C97920j> list = (List) obj;
        C58459fv fvVar = new C58459fv();
        C69664n.m101060f(list, "episodeIdList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C97920j jVar : list) {
            arrayList.add(Boolean.valueOf(fvVar.mo54986h(jVar.f273429b).add(jVar.f273431d)));
        }
        C139997j jVar2 = this.f382026a.f382033b;
        Map C = fvVar.mo54950C();
        C69664n.m101060f(C, "feedUrlToGuid.asMap()");
        return jVar2.mo115377b(C, C139988a.DONT_CARE);
    }
}
