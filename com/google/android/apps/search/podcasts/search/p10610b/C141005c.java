package com.google.android.apps.search.podcasts.search.p10610b;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.search.p10609a.C141000a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54355bh;
import com.google.p4017at.p4082j.p4083a.C54407df;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.b.c */
/* compiled from: PG */
final class C141005c implements C60931s {

    /* renamed from: a */
    public static final C141005c f382815a = new C141005c();

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C54355bh bhVar = (C54355bh) obj;
        C69664n.m101058d(bhVar);
        C62971cq<C54407df> cqVar = bhVar.f142792a;
        C69664n.m101060f(cqVar, "response!!.suggestResultsList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C54407df dfVar : cqVar) {
            C69664n.m101060f(dfVar, "suggestResult");
            arrayList.add(new C141000a(dfVar));
        }
        return C60856cj.m92900i(new C140952k(arrayList, (Integer) null));
    }
}
