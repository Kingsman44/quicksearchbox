package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f;

import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.f.a */
/* compiled from: PG */
public final class C121335a {

    /* renamed from: a */
    public static final C58869cf f336942a = C58869cf.m90936b(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    private static final C58528ij f336943b = C58528ij.m90015O("a", "able", "about", "across", "after", "all", "almost", "also", C141584am.f384270a, "among", "an", "and", "any", "are", "as", "at", "be", "because", "been", "but", "by", "can", "cannot", "could", "dear", "did", "do", "does", "either", "else", "ever", "every", "for", "from", "get", "got", "had", "has", "have", "he", "her", "hers", "him", "his", "how", "however", "i", "if", "in", "into", "is", "it", "its", "just", "least", "let", "like", "likely", "may", "me", "might", "most", "must", "my", "neither", "no", "nor", "not", "of", "off", "often", "on", "only", "or", "other", "our", "own", "rather", "said", "say", "says", "she", "should", "since", "so", "some", "than", "that", "the", "their", "them", "then", "there", "these", "they", "this", "tis", "to", "too", "twas", "us", "wants", "was", "we", "were", "what", "when", "where", "which", "while", "who", "whom", "why", "will", "with", "would", "yet", "you", "your");

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r1.charAt(0) == r13.charAt(0)) goto L_0x00ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m200594a(com.google.common.p4522b.C58485gu r24, com.google.common.p4522b.C58485gu r25) {
        /*
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x017f
            boolean r0 = r25.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x017f
        L_0x000e:
            int r0 = r25.size()
            r3 = 0
            r4 = 0
        L_0x0014:
            if (r3 >= r0) goto L_0x017e
            r5 = r25
            java.lang.Object r6 = r5.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            com.google.common.base.cf r7 = f336942a
            java.util.List r6 = r7.mo56155i(r6)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            int r8 = r24.size()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0030:
            if (r9 >= r8) goto L_0x015c
            r12 = r24
            java.lang.Object r13 = r12.get(r9)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.trim()
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.lang.String r13 = r13.toLowerCase(r14)
            int r14 = r13.length()
            int r10 = r10 + r14
            java.util.Iterator r15 = r6.iterator()
            r16 = -1
            r17 = 0
            r18 = 0
        L_0x0055:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x0140
            java.lang.Object r19 = r15.next()
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r1 = r19.trim()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x012b
            com.google.common.b.ij r2 = f336943b
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x012b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            boolean r2 = r7.contains(r2)
            if (r2 != 0) goto L_0x012b
            java.lang.String r2 = "{"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = "}"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x012b
        L_0x0095:
            if (r14 <= 0) goto L_0x00ab
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x00ab
            r20 = r0
            r2 = 0
            char r0 = r1.charAt(r2)
            char r5 = r13.charAt(r2)
            if (r0 != r5) goto L_0x012d
            goto L_0x00ae
        L_0x00ab:
            r20 = r0
            r2 = 0
        L_0x00ae:
            int r0 = r13.length()
            int r5 = r1.length()
            if (r0 > r5) goto L_0x00f0
            r21 = r6
            com.google.common.c.k r6 = com.google.common.p4523c.C58929d.f156772a
            com.google.common.c.r r6 = r6.mo56208a(r13)
            r22 = r8
            java.lang.String r8 = r1.substring(r2, r0)
            int r6 = r6.mo56211a(r8, r0)
            if (r5 <= r0) goto L_0x00e6
            int r8 = r0 + 1
            r23 = r10
            com.google.common.c.k r10 = com.google.common.p4523c.C58929d.f156772a
            com.google.common.c.r r10 = r10.mo56208a(r13)
            java.lang.String r1 = r1.substring(r2, r8)
            int r1 = r10.mo56211a(r1, r8)
            if (r6 > r1) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            int r2 = r8 - r1
            r6 = r1
            r1 = r2
            goto L_0x00ea
        L_0x00e6:
            r23 = r10
        L_0x00e8:
            int r1 = r0 - r6
        L_0x00ea:
            float r2 = (float) r0
            float r5 = (float) r5
            float r2 = r2 / r5
            r5 = r6
            r6 = 0
            goto L_0x0110
        L_0x00f0:
            r21 = r6
            r22 = r8
            r23 = r10
            com.google.common.c.k r2 = com.google.common.p4523c.C58929d.f156772a
            r6 = 0
            java.lang.String r8 = r13.substring(r6, r5)
            com.google.common.c.r r2 = r2.mo56208a(r8)
            int r1 = r2.mo56211a(r1, r5)
            int r2 = r0 - r5
            int r1 = r1 + r2
            int r2 = r0 - r1
            r5 = 1065353216(0x3f800000, float:1.0)
            r5 = r1
            r1 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0110:
            int r1 = r1 - r5
            int r1 = java.lang.Math.max(r1, r6)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 * r2
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            r16 = r18
        L_0x0120:
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            r17 = r1
        L_0x0126:
            int r18 = r18 + 1
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0134
        L_0x012b:
            r20 = r0
        L_0x012d:
            r21 = r6
            r22 = r8
            r23 = r10
            r6 = 0
        L_0x0134:
            r5 = r25
            r0 = r20
            r6 = r21
            r8 = r22
            r10 = r23
            goto L_0x0055
        L_0x0140:
            r20 = r0
            r21 = r6
            r22 = r8
            r23 = r10
            r6 = 0
            float r11 = r11 + r17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r7.add(r0)
            int r9 = r9 + 1
            r5 = r25
            r0 = r20
            r6 = r21
            goto L_0x0030
        L_0x015c:
            r6 = 0
            r12 = r24
            r20 = r0
            if (r10 <= 0) goto L_0x0171
            int r0 = r24.size()
            if (r0 != 0) goto L_0x016a
            goto L_0x0171
        L_0x016a:
            int r0 = r24.size()
            float r0 = (float) r0
            float r11 = r11 / r0
            goto L_0x0172
        L_0x0171:
            r11 = 0
        L_0x0172:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            float r4 = java.lang.Math.max(r11, r4)
            int r3 = r3 + 1
            r0 = r20
            goto L_0x0014
        L_0x017e:
            return r4
        L_0x017f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f.C121335a.m200594a(com.google.common.b.gu, com.google.common.b.gu):float");
    }
}
