package com.google.android.apps.search.podcasts.p10549a;

import com.google.android.apps.search.podcasts.p10550b.p10557g.C140160x;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10590o.C140704ae;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.a.f */
/* compiled from: PG */
final class C139961f implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f380438a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f380439b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f380440c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f380441d;

    public C139961f(List list, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f380438a = list;
        this.f380439b = cxVar;
        this.f380440c = cxVar2;
        this.f380441d = cxVar3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List<C63113l> list = this.f380438a;
        C60870cx cxVar = this.f380439b;
        C60870cx cxVar2 = this.f380440c;
        C60870cx cxVar3 = this.f380441d;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C63113l a : list) {
            Object r = C60856cj.m92909r(cxVar);
            C69664n.m101060f(r, "getDone(favorite)");
            Object r2 = C60856cj.m92909r(cxVar2);
            C69664n.m101060f(r2, "getDone(reactions)");
            Object r3 = C60856cj.m92909r(cxVar3);
            C69664n.m101060f(r3, "getDone(preference)");
            arrayList.add(C139959d.m227604a(a, (C140160x) r, (C140704ae) r2, (C140450al) r3));
        }
        return arrayList;
    }
}
