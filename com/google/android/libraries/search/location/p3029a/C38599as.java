package com.google.android.libraries.search.location.p3029a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.location.a.as */
/* compiled from: PG */
public final /* synthetic */ class C38599as implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f102026a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f102027b;

    public /* synthetic */ C38599as(C60870cx cxVar, C60870cx cxVar2) {
        this.f102026a = cxVar;
        this.f102027b = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f102026a;
        C60870cx cxVar2 = this.f102027b;
        C38630bv bvVar = (C38630bv) C60856cj.m92909r(cxVar);
        C38635c cVar = (C38635c) C60856cj.m92909r(cxVar2);
        if (cVar == null || cVar.f102094d <= 0) {
            int a = C38624bp.m67907a(bvVar.f102078d);
            if (a == 0 || a == 1) {
                return C47633f.m84733g(C60866ct.f164955a);
            }
            boolean z = bvVar.f102076b;
            return C47633f.m84733g(C60856cj.m92900i(bvVar));
        }
        C38629bu buVar = (C38629bu) C38630bv.f102073e.createBuilder();
        buVar.copyOnWrite();
        C38630bv bvVar2 = (C38630bv) buVar.instance;
        bvVar2.f102075a |= 1;
        bvVar2.f102076b = true;
        buVar.copyOnWrite();
        C38630bv bvVar3 = (C38630bv) buVar.instance;
        bvVar3.f102078d = 3;
        bvVar3.f102075a |= 4;
        return C47633f.m84733g(C60856cj.m92900i((C38630bv) buVar.build()));
    }
}
