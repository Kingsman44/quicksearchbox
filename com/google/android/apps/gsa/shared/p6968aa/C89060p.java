package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60324oh;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.aa.p */
/* compiled from: PG */
public final class C89060p {

    /* renamed from: a */
    public static final C89060p f241363a = new C89060p(C60324oh.UNDEFINED);

    /* renamed from: b */
    public static final C89060p f241364b = new C89060p(C60324oh.UNKNOWN);

    /* renamed from: c */
    public static final C89060p f241365c = new C89060p(C60324oh.QUALITY_UNKNOWN);

    /* renamed from: d */
    public static final C89060p f241366d = new C89060p(C60324oh.QUALITY_MET);

    /* renamed from: e */
    public final C60324oh f241367e;

    /* renamed from: f */
    public final C90457d f241368f;

    private C89060p(C60324oh ohVar) {
        this.f241367e = ohVar;
        this.f241368f = null;
    }

    public C89060p(C60324oh ohVar, C90457d dVar) {
        boolean z = true;
        if (!(ohVar == C60324oh.OFFLINE || ohVar == C60324oh.QUALITY_NOT_MET || ohVar == C60324oh.NETWORK_LEVEL_NOT_MET || ohVar == C60324oh.UNSTABLE_NOT_MET)) {
            z = false;
        }
        C58838bb.m90873h(z, "This constructor cannot be used with the given connectivity result (%s), use static constants instead.", ohVar);
        this.f241367e = ohVar;
        this.f241368f = dVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C89060p pVar = (C89060p) obj;
            C90457d dVar = this.f241368f;
            Integer num2 = null;
            if (dVar == null) {
                num = null;
            } else {
                num = Integer.valueOf(dVar.f252687a);
            }
            C90457d dVar2 = pVar.f241368f;
            if (dVar2 != null) {
                num2 = Integer.valueOf(dVar2.f252687a);
            }
            return this.f241367e == pVar.f241367e && C58832aw.m90831a(num, num2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f241367e, this.f241368f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f241367e);
        String valueOf2 = String.valueOf(this.f241368f);
        return "ConnectivityCheckResult(connectivityResult=" + valueOf + " offlineException=" + valueOf2 + ")";
    }
}
