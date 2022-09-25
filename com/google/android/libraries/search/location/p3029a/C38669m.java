package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.m */
/* compiled from: PG */
public final /* synthetic */ class C38669m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38586af f102131a;

    /* renamed from: b */
    public final /* synthetic */ String f102132b;

    public /* synthetic */ C38669m(C38586af afVar, String str) {
        this.f102131a = afVar;
        this.f102132b = str;
    }

    public final C60870cx apply(Object obj) {
        C38586af afVar = this.f102131a;
        String str = this.f102132b;
        ((C59052c) ((C59052c) C38586af.f101990a.mo56223a(afVar.f101991b).mo56382g((Throwable) obj)).mo56372aa(53153)).mo56386p("unable to determine if user should be prompted.");
        C37215b bVar = afVar.f101996g;
        C37252a a = C37173a.f96782b.mo40803a(1, "compliance_location_consent_ds");
        ((C37253b) a).mo40795s("flow_id", str);
        bVar.mo19974a(a);
        return C47633f.m84733g(C60856cj.m92900i(Boolean.valueOf(((C38571a) C38585ae.m67872f(2)).f101956a)));
    }
}
