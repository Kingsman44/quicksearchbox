package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.au */
/* compiled from: PG */
public final /* synthetic */ class C38601au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102030a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f102031b;

    public /* synthetic */ C38601au(C38622bn bnVar, C58833ax axVar) {
        this.f102030a = bnVar;
        this.f102031b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C38622bn bnVar = this.f102030a;
        C58833ax axVar = this.f102031b;
        C38630bv bvVar = (C38630bv) obj;
        int a = C38624bp.m67907a(bvVar.f102078d);
        if (a == 0 || a == 1) {
            bnVar.mo41524d(C37173a.f96786f.mo40779c(), axVar, 6);
            return C47633f.m84733g(C47633f.m84733g(bnVar.f102062j.mo50246c(bnVar.f102060h)).mo51516i(new C38605ay(bnVar), bnVar.f102055c)).mo51516i(new C38597aq(bnVar, axVar), bnVar.f102055c).mo51514f(Throwable.class, C38598ar.f102025a, bnVar.f102055c);
        }
        bnVar.mo41524d(C37173a.f96786f.mo40779c(), axVar, 1);
        return C47633f.m84733g(C60856cj.m92900i(bvVar));
    }
}
