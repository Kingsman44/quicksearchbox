package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk;
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

/* renamed from: com.google.android.apps.search.podcasts.n.w */
/* compiled from: PG */
final class C140694w extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140697z f382104a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140694w(C140697z zVar) {
        super(1);
        this.f382104a = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List<C97912bk> list = (List) obj;
        C58459fv fvVar = new C58459fv();
        C69664n.m101060f(list, "recentEpisodeIds");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C97912bk bkVar : list) {
            arrayList.add(Boolean.valueOf(fvVar.mo54986h(bkVar.f273379b).add(bkVar.f273381d)));
        }
        C139997j jVar = this.f382104a.f382109b;
        Map C = fvVar.mo54950C();
        C69664n.m101060f(C, "feedUrlToGuid.asMap()");
        return jVar.mo115377b(C, C139988a.DONT_CARE);
    }
}
