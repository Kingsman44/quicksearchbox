package com.google.android.apps.search.fedora.p10106i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.fedora.i.q */
/* compiled from: PG */
public final /* synthetic */ class C132943q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132948v f362625a;

    public /* synthetic */ C132943q(C132948v vVar) {
        this.f362625a = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132948v vVar = this.f362625a;
        C132941o oVar = new C132941o(vVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(oVar), vVar.f362634d);
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = C132948v.f362632b;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(vVar.mo110942b((String) guVar.get(i2)));
        }
        C60870cx a = C47638k.m84752c(arrayList).mo51520a(new C132944r(arrayList), vVar.f362634d);
        C60870cx b = vVar.f362633c.mo110914b();
        return C47638k.m84753d(n, a, b).mo51521b(new C132942p(vVar, n, a, b), vVar.f362634d);
    }
}
