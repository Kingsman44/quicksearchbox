package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.storage.C42685f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;

/* renamed from: com.google.android.libraries.social.populous.e.a.e */
/* compiled from: PG */
public final /* synthetic */ class C42390e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42401p f111172a;

    public /* synthetic */ C42390e(C42401p pVar) {
        this.f111172a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C42401p pVar = this.f111172a;
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C42685f fVar = (C42685f) guVar.get(i);
            if (!(fVar == null || fVar.f111904d == null)) {
                C42404aa aaVar = new C42404aa();
                aaVar.mo45398e(fVar.f111904d);
                aaVar.f111220c.add(C42331dc.PAPI_TOPN);
                C42405ab a = aaVar.mo45394a();
                if (!C69280a.m100466c() || !pVar.f111201f.mo56113h() || !a.mo45411m()) {
                    e.mo55395g(C60856cj.m92900i(a));
                } else {
                    e.mo55395g(((C42146a) pVar.f111201f.mo56107c()).mo44845a());
                }
            }
        }
        return C60922j.m93044g(C60856cj.m92896e(e.mo55394f()), C42387b.f111168a, C60826bg.f164896a);
    }
}
