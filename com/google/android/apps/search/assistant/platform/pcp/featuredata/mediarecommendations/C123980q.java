package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123924h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.q */
/* compiled from: PG */
final class C123980q implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f342448a;

    public C123980q(List list) {
        this.f342448a = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List<C60870cx> list = this.f342448a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C60870cx r : list) {
            Object r2 = C60856cj.m92909r(r);
            C69664n.m101060f(r2, "getDone(it)");
            arrayList.add((C123924h) r2);
        }
        return arrayList;
    }
}
