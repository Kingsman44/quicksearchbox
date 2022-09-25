package com.google.android.apps.search.assistant.verticals.p9880a.p9892h;

import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.d */
/* compiled from: PG */
public final /* synthetic */ class C130466d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f357430a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f357431b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f357432c;

    public /* synthetic */ C130466d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f357430a = cxVar;
        this.f357431b = cxVar2;
        this.f357432c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f357430a;
        C60870cx cxVar2 = this.f357431b;
        C60870cx cxVar3 = this.f357432c;
        C58485gu m = C58485gu.m89845m();
        try {
            m = (C58485gu) C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C130476n.f357443a.mo56226d()).mo56382g(e)).mo56372aa(39432)).mo56386p("Failed to fetch icing shortcuts");
        }
        C58485gu m2 = C58485gu.m89845m();
        try {
            m2 = (C58485gu) C60856cj.m92909r(cxVar2);
        } catch (ExecutionException e2) {
            ((C58970a) ((C58970a) ((C58970a) C130476n.f357443a.mo56226d()).mo56382g(e2)).mo56372aa(39431)).mo56386p("Failed to fetch Android shortcuts");
        }
        C58485gu m3 = C58485gu.m89845m();
        try {
            m3 = (C58485gu) C60856cj.m92909r(cxVar3);
        } catch (ExecutionException e3) {
            ((C58970a) ((C58970a) ((C58970a) C130476n.f357443a.mo56226d()).mo56382g(e3)).mo56372aa(39430)).mo56386p("Failed to fetch Curated Shortcuts");
        }
        HashSet hashSet = new HashSet();
        C58480gp e4 = C58485gu.m89837e();
        int size = m2.size();
        for (int i = 0; i < size; i++) {
            C49330g gVar = (C49330g) m2.get(i);
            if (hashSet.add(gVar.f127496g)) {
                e4.mo55395g(gVar);
            }
        }
        int size2 = m.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C49330g gVar2 = (C49330g) m.get(i2);
            if (hashSet.add(gVar2.f127496g)) {
                e4.mo55395g(gVar2);
            }
        }
        e4.mo55396h(m3);
        return e4.mo55394f();
    }
}
