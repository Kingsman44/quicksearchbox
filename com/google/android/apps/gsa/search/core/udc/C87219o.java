package com.google.android.apps.gsa.search.core.udc;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10991a.C147484a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147518b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147545s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.storage.p3304a.C42813k;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.search.core.udc.o */
/* compiled from: PG */
public final class C87219o implements C68220f {
    /* renamed from: a */
    public static C147488c m141051a(Context context, C90851k kVar, C42813k kVar2, C21370a aVar, C86124t tVar) {
        C147518b bVar = new C147518b();
        bVar.f398153i = C147545s.f398216a;
        bVar.f398150f = new C21375e();
        C147484a.m240452b(context, bVar);
        bVar.mo124277d(kVar2);
        bVar.f398148d = "AGSA_UDC_INSTANCE";
        bVar.mo124278e(kVar.mo85208a("FacsIoExecutor"));
        bVar.f398147c = new C87218n(context);
        bVar.mo124276c(aVar);
        bVar.f398151g = new C87217m(tVar);
        return C147484a.m240451a(bVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
