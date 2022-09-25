package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.location.a.w */
/* compiled from: PG */
public final /* synthetic */ class C38679w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38586af f102147a;

    /* renamed from: b */
    public final /* synthetic */ boolean f102148b;

    /* renamed from: c */
    public final /* synthetic */ String f102149c;

    public /* synthetic */ C38679w(C38586af afVar, boolean z, String str) {
        this.f102147a = afVar;
        this.f102148b = z;
        this.f102149c = str;
    }

    public final Object apply(Object obj) {
        C38586af afVar = this.f102147a;
        boolean z = this.f102148b;
        String str = this.f102149c;
        C38585ae aeVar = (C38585ae) obj;
        if (z) {
            C37215b bVar = afVar.f101996g;
            C37257f fVar = C37173a.f96784d;
            int e = aeVar.mo41498e();
            int i = e - 1;
            if (e != 0) {
                C37252a a = fVar.mo40803a(i, "compliance_location_consent_ds");
                ((C37253b) a).mo40795s("flow_id", str);
                bVar.mo19974a(a);
            } else {
                throw null;
            }
        }
        aeVar.mo41496c();
        return Boolean.valueOf(aeVar.mo41496c());
    }
}
