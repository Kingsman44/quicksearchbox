package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import com.google.assistant.p3781ad.p3789d.p3791b.C48711bs;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bq */
/* compiled from: PG */
public final class C113159bq {

    /* renamed from: a */
    public static final C58869cf f313474a = C58869cf.m90936b(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    private static final C58528ij f313475b = C58528ij.m90015O("a", "able", "about", "across", "after", "all", "almost", "also", C141584am.f384270a, "among", "an", "and", "any", "are", "as", "at", "be", "because", "been", "but", "by", "can", "cannot", "could", "dear", "did", "do", "does", "either", "else", "ever", "every", "for", "from", "get", "got", "had", "has", "have", "he", "her", "hers", "him", "his", "how", "however", "i", "if", "in", "into", "is", "it", "its", "just", "least", "let", "like", "likely", "may", "me", "might", "most", "must", "my", "neither", "no", "nor", "not", "of", "off", "often", "on", "only", "or", "other", "our", "own", "rather", "said", "say", "says", "she", "should", "since", "so", "some", "than", "that", "the", "their", "them", "then", "there", "these", "they", "this", "tis", "to", "too", "twas", "us", "wants", "was", "we", "were", "what", "when", "where", "which", "while", "who", "whom", "why", "will", "with", "would", "yet", "you", "your");

    /* renamed from: c */
    private final C86124t f313476c;

    public C113159bq(C86124t tVar) {
        this.f313476c = tVar;
    }

    /* renamed from: b */
    public static boolean m187171b(String str) {
        return TextUtils.isEmpty(str) || f313475b.contains(str);
    }

    /* renamed from: c */
    public static final C48712bt m187172c(String str, String str2, String str3) {
        double d;
        double d2;
        int i;
        int i2;
        String trim = str.toLowerCase(Locale.getDefault()).trim();
        String trim2 = str2.toLowerCase(Locale.getDefault()).trim();
        String trim3 = str3.toLowerCase(Locale.getDefault()).trim();
        C58869cf cfVar = f313474a;
        List<String> i3 = cfVar.mo56155i(trim);
        List i4 = cfVar.mo56155i(trim2);
        LinkedList linkedList = new LinkedList(cfVar.mo56155i(trim3));
        linkedList.removeAll(f313475b);
        int i5 = 0;
        int i6 = 0;
        for (String str4 : i3) {
            Iterator it = i4.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((String) it.next()).startsWith(str4)) {
                        i = str4.length();
                        C58976aa aaVar = C58975e.f156826a;
                        break;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((String) it2.next()).startsWith(str4)) {
                        i2 = str4.length();
                        C58976aa aaVar2 = C58975e.f156826a;
                        break;
                    }
                } else {
                    i2 = 0;
                    break;
                }
            }
            if (i <= 0 && i2 <= 0 && !f313475b.contains(str4)) {
                return C48712bt.f126024f;
            }
            i5 += i;
            i6 += i2;
        }
        double sum = (double) Collection.EL.stream(i3).mapToInt(C113158bp.f313473a).sum();
        double sum2 = (double) Collection.EL.stream(i4).mapToInt(C113158bp.f313473a).sum();
        double sum3 = (double) Collection.EL.stream(linkedList).mapToInt(C113158bp.f313473a).sum();
        C48711bs bsVar = (C48711bs) C48712bt.f126024f.createBuilder();
        double d3 = C59203do.f157270a;
        if (sum2 > C59203do.f157270a) {
            double d4 = (double) i5;
            Double.isNaN(d4);
            Double.isNaN(sum2);
            d = d4 / sum2;
        } else {
            d = 0.0d;
        }
        bsVar.copyOnWrite();
        C48712bt btVar = (C48712bt) bsVar.instance;
        btVar.f126026a |= 2;
        btVar.f126028c = d;
        if (sum3 > C59203do.f157270a) {
            double d5 = (double) i6;
            Double.isNaN(d5);
            Double.isNaN(sum3);
            d2 = d5 / sum3;
        } else {
            d2 = 0.0d;
        }
        bsVar.copyOnWrite();
        C48712bt btVar2 = (C48712bt) bsVar.instance;
        btVar2.f126026a |= 4;
        btVar2.f126029d = d2;
        Double.isNaN(sum2);
        Double.isNaN(sum3);
        double d6 = sum2 + sum3;
        if (d6 > C59203do.f157270a) {
            Double.isNaN(sum);
            d3 = sum / d6;
        }
        bsVar.copyOnWrite();
        C48712bt btVar3 = (C48712bt) bsVar.instance;
        btVar3.f126026a |= 1;
        btVar3.f126027b = d3;
        return (C48712bt) bsVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r1.charAt(0) == r2.charAt(0)) goto L_0x00cf;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo99892a(com.google.common.p4522b.C58485gu r25, com.google.common.p4522b.C58485gu r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r25.isEmpty()
            if (r1 != 0) goto L_0x01c1
            boolean r1 = r26.isEmpty()
            if (r1 == 0) goto L_0x0010
            goto L_0x01c1
        L_0x0010:
            int r1 = r26.size()
            r4 = 0
            r5 = 0
        L_0x0016:
            if (r4 >= r1) goto L_0x01c0
            r6 = r26
            java.lang.Object r7 = r6.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.base.cf r8 = f313474a
            java.util.List r7 = r8.mo56155i(r7)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            int r9 = r25.size()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0033:
            if (r10 >= r9) goto L_0x0199
            r14 = r25
            java.lang.Object r15 = r14.get(r10)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = r15.trim()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r15.toLowerCase(r2)
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f313476c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249412cz
            boolean r3 = r15.mo79746e(r3)
            if (r3 == 0) goto L_0x0064
            boolean r3 = m187171b(r2)
            if (r3 == 0) goto L_0x0064
            int r12 = r12 + 1
            r19 = r1
            r20 = r7
            r21 = r9
            r3 = 0
            goto L_0x018b
        L_0x0064:
            int r3 = r2.length()
            int r11 = r11 + r3
            java.util.Iterator r3 = r7.iterator()
            r15 = -1
            r16 = 0
            r17 = 0
        L_0x0072:
            boolean r18 = r3.hasNext()
            if (r18 == 0) goto L_0x0179
            java.lang.Object r18 = r3.next()
            java.lang.String r18 = (java.lang.String) r18
            r19 = r1
            java.lang.String r1 = r18.trim()
            r18 = r3
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r3)
            boolean r3 = m187171b(r1)
            if (r3 != 0) goto L_0x0162
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            boolean r3 = r8.contains(r3)
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = "{"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x00ae
            java.lang.String r3 = "}"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L_0x0162
        L_0x00ae:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f313476c
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249370cJ
            boolean r3 = r3.mo79746e(r6)
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r1.contains(r2)
            if (r3 != 0) goto L_0x00cc
            r3 = 0
            char r6 = r1.charAt(r3)
            r20 = r7
            char r7 = r2.charAt(r3)
            if (r6 != r7) goto L_0x00e4
            goto L_0x00cf
        L_0x00cc:
            r20 = r7
            r3 = 0
        L_0x00cf:
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f313476c
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249524fE
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x00ea
            char r6 = r1.charAt(r3)
            char r7 = r2.charAt(r3)
            if (r6 != r7) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            r21 = r9
            r22 = r11
            goto L_0x0169
        L_0x00ea:
            int r6 = r2.length()
            int r7 = r1.length()
            if (r6 > r7) goto L_0x012d
            com.google.common.c.k r0 = com.google.common.p4523c.C58929d.f156772a
            com.google.common.c.r r0 = r0.mo56208a(r2)
            r21 = r9
            java.lang.String r9 = r1.substring(r3, r6)
            int r0 = r0.mo56211a(r9, r6)
            if (r7 <= r6) goto L_0x0123
            int r9 = r6 + 1
            r22 = r11
            com.google.common.c.k r11 = com.google.common.p4523c.C58929d.f156772a
            com.google.common.c.r r11 = r11.mo56208a(r2)
            java.lang.String r1 = r1.substring(r3, r9)
            int r1 = r11.mo56211a(r1, r9)
            if (r0 > r1) goto L_0x011b
            goto L_0x0125
        L_0x011b:
            int r0 = r9 - r1
            r23 = r1
            r1 = r0
            r0 = r23
            goto L_0x0127
        L_0x0123:
            r22 = r11
        L_0x0125:
            int r1 = r6 - r0
        L_0x0127:
            float r3 = (float) r6
            float r7 = (float) r7
            float r3 = r3 / r7
            r7 = r3
            r3 = 0
            goto L_0x0147
        L_0x012d:
            r21 = r9
            r22 = r11
            com.google.common.c.k r0 = com.google.common.p4523c.C58929d.f156772a
            r3 = 0
            java.lang.String r9 = r2.substring(r3, r7)
            com.google.common.c.r r0 = r0.mo56208a(r9)
            int r0 = r0.mo56211a(r1, r7)
            int r1 = r6 - r7
            int r0 = r0 + r1
            int r1 = r6 - r0
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0147:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r1, r3)
            float r0 = (float) r0
            float r1 = (float) r6
            float r0 = r0 / r1
            float r0 = r0 * r7
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0157
            r15 = r17
        L_0x0157:
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x015d
            r16 = r0
        L_0x015d:
            int r17 = r17 + 1
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0169
        L_0x0162:
            r20 = r7
            r21 = r9
            r22 = r11
            r3 = 0
        L_0x0169:
            r0 = r24
            r6 = r26
            r3 = r18
            r1 = r19
            r7 = r20
            r9 = r21
            r11 = r22
            goto L_0x0072
        L_0x0179:
            r19 = r1
            r20 = r7
            r21 = r9
            r22 = r11
            r3 = 0
            float r13 = r13 + r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r8.add(r0)
        L_0x018b:
            int r10 = r10 + 1
            r0 = r24
            r6 = r26
            r1 = r19
            r7 = r20
            r9 = r21
            goto L_0x0033
        L_0x0199:
            r14 = r25
            r0 = r27
            r19 = r1
            r3 = 0
            if (r11 < r0) goto L_0x01b1
            int r1 = r25.size()
            if (r1 != r12) goto L_0x01a9
            goto L_0x01b1
        L_0x01a9:
            int r1 = r25.size()
            int r1 = r1 - r12
            float r1 = (float) r1
            float r13 = r13 / r1
            goto L_0x01b2
        L_0x01b1:
            r13 = 0
        L_0x01b2:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            float r5 = java.lang.Math.max(r13, r5)
            int r4 = r4 + 1
            r0 = r24
            r1 = r19
            goto L_0x0016
        L_0x01c0:
            return r5
        L_0x01c1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113159bq.mo99892a(com.google.common.b.gu, com.google.common.b.gu, int):float");
    }
}
