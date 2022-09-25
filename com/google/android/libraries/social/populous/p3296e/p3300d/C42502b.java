package com.google.android.libraries.social.populous.p3296e.p3300d;

import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42239g;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4181bi.C55844f;
import com.google.p4181bi.C55847i;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;

/* renamed from: com.google.android.libraries.social.populous.e.d.b */
/* compiled from: PG */
public final /* synthetic */ class C42502b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42510j f111460a;

    public /* synthetic */ C42502b(C42510j jVar) {
        this.f111460a = jVar;
    }

    public final C60870cx apply(Object obj) {
        C42510j jVar = this.f111460a;
        C42239g gVar = (C42239g) obj;
        C58480gp e = C58485gu.m89837e();
        C55844f fVar = gVar.f110584a;
        if (fVar == null) {
            fVar = C55844f.f147352c;
        }
        for (C55847i d : fVar.f147354a) {
            C42404aa aaVar = new C42404aa();
            aaVar.mo45397d(d);
            aaVar.f111220c.add(C42331dc.PAPI_AUTOCOMPLETE);
            C42405ab a = aaVar.mo45394a();
            if (!C69280a.m100466c() || !jVar.f111479f.mo56113h() || !a.mo45411m()) {
                e.mo55395g(C60856cj.m92900i(a));
            } else {
                e.mo55395g(((C42146a) jVar.f111479f.mo56107c()).mo44845a());
            }
        }
        return C60922j.m93044g(C60856cj.m92896e(e.mo55394f()), new C42505e(gVar), C60826bg.f164896a);
    }
}
