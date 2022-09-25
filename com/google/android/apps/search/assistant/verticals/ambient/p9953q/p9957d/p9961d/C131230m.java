package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.d.m */
/* compiled from: PG */
public final class C131230m {

    /* renamed from: a */
    public final C42876ab f358855a;

    /* renamed from: b */
    public final C60950i f358856b;

    /* renamed from: c */
    public final C60887da f358857c;

    /* renamed from: d */
    private final C58974d f358858d;

    /* renamed from: e */
    private final int f358859e;

    /* renamed from: f */
    private final Duration f358860f;

    /* renamed from: g */
    private final Duration f358861g;

    /* renamed from: h */
    private final Duration f358862h;

    public C131230m(C130603a aVar, C42876ab abVar, C60950i iVar, C60887da daVar, long j, long j2, long j3, long j4) {
        this.f358858d = aVar.mo109740b(this);
        this.f358855a = abVar;
        this.f358856b = iVar;
        this.f358857c = daVar;
        this.f358859e = (int) j;
        this.f358860f = Duration.ofHours(j2);
        this.f358861g = Duration.ofMinutes(j3);
        this.f358862h = Duration.ofDays(j4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo110119a(com.google.assistant.p3886c.C50794cr r6, com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131222e r7) {
        /*
            r5 = this;
            com.google.protobuf.cj r0 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r7.f358846f
            com.google.protobuf.ci r2 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131222e.f358838g
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.common.f.a.d r7 = r5.f358858d
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r6 = r6.name()
            r0 = 39082(0x98aa, float:5.4766E-41)
            java.lang.String r2 = "Card type disabled: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r0)).mo56389s(r2, r6)
            return r1
        L_0x0023:
            com.google.common.v.i r0 = r5.f358856b
            j$.time.Instant r0 = r0.mo57444a()
            int r2 = r7.f358841a
            r2 = r2 & 4
            r3 = 1
            if (r2 == 0) goto L_0x0048
            com.google.protobuf.fg r2 = r7.f358845e
            if (r2 != 0) goto L_0x0036
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x0036:
            j$.time.Instant r2 = com.google.protobuf.p4750c.C62950b.m95474e(r2)
            j$.time.Duration r4 = r5.f358862h
            j$.time.Instant r2 = r2.plus(r4)
            boolean r2 = r0.isAfter(r2)
            if (r2 == 0) goto L_0x0048
            r2 = 1
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 != 0) goto L_0x0052
            int r4 = r7.f358841a
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r3
        L_0x0052:
            boolean r4 = r5.mo110120b(r0, r6, r7)
            if (r4 == 0) goto L_0x0059
            return r3
        L_0x0059:
            if (r2 != 0) goto L_0x00b2
            com.google.protobuf.fg r2 = r7.f358843c
            if (r2 != 0) goto L_0x0061
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x0061:
            j$.time.Instant r2 = com.google.protobuf.p4750c.C62950b.m95474e(r2)
            j$.time.Duration r4 = r5.f358860f
            j$.time.Instant r2 = r2.plus(r4)
            boolean r0 = r0.isBefore(r2)
            if (r0 != 0) goto L_0x00a3
            com.google.protobuf.dn r7 = r7.f358842b
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)
            int r0 = r6.f132222T
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = p3186j$.util.Map.EL.getOrDefault(r7, r0, r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r0 = r5.f358859e
            if (r7 < r0) goto L_0x00a2
            com.google.common.f.a.d r7 = r5.f358858d
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r6 = r6.name()
            r0 = 39079(0x98a7, float:5.4761E-41)
            java.lang.String r2 = "Maximum number of sign-up cards for %s reached."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r0)).mo56389s(r2, r6)
            return r1
        L_0x00a2:
            return r3
        L_0x00a3:
            com.google.common.f.a.d r6 = r5.f358858d
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Already showed a sign-up card recently."
            r0 = 39080(0x98a8, float:5.4763E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r0)).mo56386p(r7)
            return r1
        L_0x00b2:
            com.google.common.f.a.d r6 = r5.f358858d
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Sign-up period exceeded."
            r0 = 39081(0x98a9, float:5.4764E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r0)).mo56386p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131230m.mo110119a(com.google.assistant.c.cr, com.google.android.apps.search.assistant.verticals.ambient.q.d.d.e):boolean");
    }

    /* renamed from: b */
    public final boolean mo110120b(Instant instant, C50794cr crVar, C131222e eVar) {
        C63042fg fgVar = eVar.f358843c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (!instant.isBefore(C62950b.m95474e(fgVar).plus(this.f358861g))) {
            return false;
        }
        C50794cr a = C50794cr.m85938a(eVar.f358844d);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return a.equals(crVar);
    }
}
