package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.location.a.l */
/* compiled from: PG */
public final /* synthetic */ class C38668l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38586af f102129a;

    /* renamed from: b */
    public final /* synthetic */ String f102130b;

    public /* synthetic */ C38668l(C38586af afVar, String str) {
        this.f102129a = afVar;
        this.f102130b = str;
    }

    public final Object apply(Object obj) {
        C38586af afVar = this.f102129a;
        String str = this.f102130b;
        C38585ae aeVar = (C38585ae) obj;
        C37215b bVar = afVar.f101996g;
        C37257f fVar = C37173a.f96782b;
        int e = aeVar.mo41498e();
        int i = e - 1;
        if (e != 0) {
            C37252a a = fVar.mo40803a(i, "compliance_location_consent_ds");
            ((C37253b) a).mo40795s("flow_id", str);
            bVar.mo19974a(a);
            aeVar.mo41497d();
            return Boolean.valueOf(aeVar.mo41497d());
        }
        throw null;
    }
}
