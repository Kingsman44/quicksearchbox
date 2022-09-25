package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1214b;

import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.b.a */
/* compiled from: PG */
public final class C15967a {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (m32773b(r12, 1 == (r11.f140282a & 1), r11.f140283b, r11.f140286e, r10.mo22703g(), r10.mo22702f()) != false) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32772a(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac r10, com.google.assistant.p3994s.p3995a.C53448og r11, p3186j$.time.Instant r12, boolean r13) {
        /*
            r0 = 0
            r1 = 1
            if (r13 != 0) goto L_0x001f
            int r13 = r11.f140282a
            int r4 = r11.f140283b
            com.google.protobuf.ch r5 = r11.f140286e
            long r6 = r10.mo22703g()
            long r8 = r10.mo22702f()
            r13 = r13 & r1
            if (r1 == r13) goto L_0x0017
            r3 = 0
            goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            r2 = r12
            boolean r13 = m32773b(r2, r3, r4, r5, r6, r8)
            if (r13 == 0) goto L_0x0058
        L_0x001f:
            int r13 = r11.f140282a
            r13 = r13 & 2
            if (r13 == 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            int r4 = r11.f140284c
            com.google.protobuf.ch r5 = r11.f140287f
            long r6 = r10.mo22697a()
            long r8 = r10.mo22700d()
            r2 = r12
            boolean r13 = m32773b(r2, r3, r4, r5, r6, r8)
            if (r13 == 0) goto L_0x0058
            int r13 = r11.f140282a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            int r4 = r11.f140285d
            com.google.protobuf.ch r5 = r11.f140288g
            long r6 = r10.mo22698b()
            long r8 = r10.mo22701e()
            r2 = r12
            boolean r10 = m32773b(r2, r3, r4, r5, r6, r8)
            if (r10 == 0) goto L_0x0058
            return r1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1214b.C15967a.m32772a(com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ac, com.google.assistant.s.a.og, j$.time.Instant, boolean):boolean");
    }

    /* renamed from: b */
    private static boolean m32773b(Instant instant, boolean z, int i, List list, long j, long j2) {
        if (z && j >= ((long) i)) {
            return false;
        }
        if (list.isEmpty() || j <= 0) {
            return true;
        }
        if (instant.minusMillis(j2).isBefore(Instant.ofEpochSecond((long) ((Integer) list.get(((long) list.size()) >= j ? (int) (j - 1) : list.size() - 1)).intValue()))) {
            return false;
        }
        return true;
    }
}
