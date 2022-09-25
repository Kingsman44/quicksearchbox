package com.google.android.apps.gsa.search.core.service.p6852g;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.d */
/* compiled from: PG */
public enum C86724d {
    IDLE(Long.MAX_VALUE, C118575h.UNKNOWN_WORKLOAD),
    SEARCH_TEXT(25000, C118575h.USER_ADVOCATE_STATE_SEARCH_TEXT),
    SEARCH_VOICE(3000, C118575h.USER_ADVOCATE_STATE_SEARCH_VOICE),
    STARTUP_G_ICON(1000, C118575h.UNKNOWN_WORKLOAD),
    STARTUP_QSB_TEXT(5000, C118575h.USER_ADVOCATE_STATE_STARTUP_QSB_TEXT),
    STARTUP_QSB_VOICE(1500, C118575h.UNKNOWN_WORKLOAD);
    

    /* renamed from: g */
    public static final C58528ij f234270g = null;

    /* renamed from: h */
    public final long f234272h;

    /* renamed from: i */
    public final C118575h f234273i;

    static {
        C86724d dVar;
        C86724d dVar2;
        f234270g = C58528ij.m90011K(dVar, dVar2);
    }

    private C86724d(long j, C118575h hVar) {
        this.f234272h = j;
        this.f234273i = hVar;
    }

    /* renamed from: a */
    public static C86724d m139698a(String str) {
        return (C86724d) Enum.valueOf(C86724d.class, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = f234264a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m139699b(com.google.android.apps.gsa.search.core.service.p6852g.C86724d r1, com.google.android.apps.gsa.search.core.service.p6852g.C86724d r2) {
        /*
            if (r1 == r2) goto L_0x000b
            com.google.android.apps.gsa.search.core.service.g.d r0 = IDLE
            if (r2 == r0) goto L_0x000b
            if (r1 != r0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r1 = 0
            return r1
        L_0x000b:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.p6852g.C86724d.m139699b(com.google.android.apps.gsa.search.core.service.g.d, com.google.android.apps.gsa.search.core.service.g.d):boolean");
    }
}
