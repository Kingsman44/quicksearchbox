package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bw */
/* compiled from: PG */
final class C136968bw {
    /* renamed from: a */
    public static boolean m222636a(C63909aw awVar) {
        int i = awVar.f172818a;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) ? false : true;
    }

    /* renamed from: b */
    public static boolean m222637b(C63919bf bfVar) {
        C63909aw awVar = bfVar.f172848b;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        return m222636a(awVar) && bfVar.f172850d.size() > 0 && (bfVar.f172847a & 4) != 0;
    }
}
