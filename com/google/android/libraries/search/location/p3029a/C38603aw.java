package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C38603aw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102034a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f102035b;

    public /* synthetic */ C38603aw(C38622bn bnVar, C58833ax axVar) {
        this.f102034a = bnVar;
        this.f102035b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C38622bn bnVar = this.f102034a;
        C58833ax axVar = this.f102035b;
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) ((C59052c) C38622bn.f102053a.mo56226d()).mo56382g(th)).mo56372aa(53166)).mo56386p("v2 eligibility check uncaught exception getting capability");
        bnVar.mo41524d(C37173a.f96790j.mo40779c(), axVar, 7);
        return C47633f.m84733g(C60856cj.m92899h(th));
    }
}
