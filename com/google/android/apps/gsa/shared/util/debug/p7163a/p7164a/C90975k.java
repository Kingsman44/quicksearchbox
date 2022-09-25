package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59851ho;
import com.google.common.p4552o.C59852hp;
import com.google.common.p4552o.C59854hr;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.k */
/* compiled from: PG */
public final class C90975k extends C90983s {

    /* renamed from: b */
    private static final long f254187b = TimeUnit.MILLISECONDS.toNanos(1);

    public C90975k(C90974j jVar) {
        super(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m148602b(com.google.common.p4552o.C59852hp r19, java.util.List r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.shared.util.debug.a.a.j r2 = r0.f254188a
            r2.mo85261e()
            boolean r2 = r20.isEmpty()
            if (r2 != 0) goto L_0x0120
            com.google.android.apps.gsa.shared.util.debug.a.a.j r2 = r0.f254188a
            java.util.Locale r3 = java.util.Locale.US
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Started"
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "Duration"
            r8 = 1
            r5[r8] = r6
            java.lang.String r6 = "Latency"
            r9 = 2
            r5[r9] = r6
            java.lang.String r6 = "%18s %10s %10s"
            java.lang.String r3 = java.lang.String.format(r3, r6, r5)
            r2.mo85257a(r3)
            java.util.Iterator r2 = r20.iterator()
        L_0x0032:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0127
            java.lang.Object r3 = r2.next()
            com.google.common.o.hr r3 = (com.google.common.p4552o.C59854hr) r3
            java.util.Locale r5 = java.util.Locale.US
            r6 = 4
            java.lang.Object[] r10 = new java.lang.Object[r6]
            int r11 = r3.f161752a
            r6 = r6 & r11
            java.lang.String r11 = "-"
            if (r6 == 0) goto L_0x005c
            long r12 = r3.f161755d
            long r14 = f254187b
            long r12 = r12 / r14
            long r14 = r1.f161745c
            java.util.Date r6 = new java.util.Date
            long r12 = r12 + r14
            r6.<init>(r12)
            java.lang.String r6 = com.google.android.apps.gsa.shared.util.p7158b.C90745b.m148220a(r6)
            goto L_0x005d
        L_0x005c:
            r6 = r11
        L_0x005d:
            r10[r7] = r6
            int r6 = r3.f161752a
            r12 = r6 & 4
            if (r12 == 0) goto L_0x0084
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0084
            long r12 = r3.f161756e
            long r14 = r3.f161755d
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r8]
            long r12 = r12 - r14
            float r12 = (float) r12
            long r13 = f254187b
            float r13 = (float) r13
            float r12 = r12 / r13
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r4[r7] = r12
            java.lang.String r12 = "%8.3fms"
            java.lang.String r4 = java.lang.String.format(r6, r12, r4)
            goto L_0x0085
        L_0x0084:
            r4 = r11
        L_0x0085:
            r10[r8] = r4
            int r4 = r3.f161752a
            r6 = r4 & 4
            if (r6 == 0) goto L_0x00bf
            r4 = r4 & 16
            if (r4 == 0) goto L_0x00bf
            long r12 = r3.f161757f
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
            long r14 = r3.f161755d
            r6 = r10
            long r9 = r1.f161745c
            long r16 = f254187b
            r20 = r5
            long r4 = r1.f161746d
            java.util.Locale r11 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r8]
            long r9 = r9 * r16
            long r14 = r14 + r9
            long r12 = r12 + r4
            long r12 = r12 * r16
            long r14 = r14 - r12
            long r14 = r14 / r16
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r5 = 0
            r7[r5] = r4
            java.lang.String r4 = "%dms"
            java.lang.String r11 = java.lang.String.format(r11, r4, r7)
            goto L_0x00c3
        L_0x00bf:
            r20 = r5
            r6 = r10
            r5 = 0
        L_0x00c3:
            r4 = 2
            r6[r4] = r11
            int r7 = r3.f161752a
            r9 = r7 & 1
            java.lang.String r10 = "("
            if (r9 == 0) goto L_0x00eb
            r11 = r7 & 2
            if (r11 == 0) goto L_0x00eb
            java.lang.String r7 = r3.f161753b
            java.lang.String r3 = r3.f161754c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = ") "
            r9.append(r7)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            goto L_0x0100
        L_0x00eb:
            if (r9 == 0) goto L_0x0102
            java.lang.String r3 = r3.f161753b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r10)
            r7.append(r3)
            java.lang.String r3 = ")"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x0100:
            r7 = 3
            goto L_0x010c
        L_0x0102:
            r7 = r7 & 2
            if (r7 == 0) goto L_0x0109
            java.lang.String r3 = r3.f161754c
            goto L_0x0100
        L_0x0109:
            java.lang.String r3 = "[unknown]"
            goto L_0x0100
        L_0x010c:
            r6[r7] = r3
            java.lang.String r3 = "%18s %10s %10s %s"
            r9 = r20
            java.lang.String r3 = java.lang.String.format(r9, r3, r6)
            com.google.android.apps.gsa.shared.util.debug.a.a.j r6 = r0.f254188a
            r6.mo85257a(r3)
            r4 = 3
            r7 = 0
            r9 = 2
            goto L_0x0032
        L_0x0120:
            com.google.android.apps.gsa.shared.util.debug.a.a.j r1 = r0.f254188a
            java.lang.String r2 = "None"
            r1.mo85257a(r2)
        L_0x0127:
            com.google.android.apps.gsa.shared.util.debug.a.a.j r1 = r0.f254188a
            r1.mo85260d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a.C90975k.m148602b(com.google.common.o.hp, java.util.List):void");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59852hp hpVar = (C59852hp) messageLite;
        if (hpVar != null) {
            C90974j jVar = this.f254188a;
            int a = C59851ho.m92515a(hpVar.f161744b);
            if (a == 0) {
                a = 1;
            }
            jVar.mo85258b(a + -1 != 1 ? "Unknown" : "Main Thread");
            this.f254188a.mo85261e();
            if ((hpVar.f161743a & 8) != 0) {
                this.f254188a.mo85259c("Only lists finished tasks taking longer than", String.format(Locale.US, "%dms", new Object[]{Long.valueOf(hpVar.f161747e)}));
            }
            this.f254188a.mo85258b("Current Task");
            if ((hpVar.f161743a & 16) != 0) {
                C59854hr hrVar = hpVar.f161748f;
                if (hrVar == null) {
                    hrVar = C59854hr.f161750g;
                }
                int i = hrVar.f161752a;
                if (!((i & 1) == 0 && (i & 2) == 0 && (i & 4) == 0)) {
                    C59854hr hrVar2 = hpVar.f161748f;
                    if (hrVar2 == null) {
                        hrVar2 = C59854hr.f161750g;
                    }
                    m148602b(hpVar, Collections.singletonList(hrVar2));
                    this.f254188a.mo85258b("Finished Tasks");
                    m148602b(hpVar, hpVar.f161749g);
                    this.f254188a.mo85260d();
                }
            }
            m148602b(hpVar, Collections.emptyList());
            this.f254188a.mo85258b("Finished Tasks");
            m148602b(hpVar, hpVar.f161749g);
            this.f254188a.mo85260d();
        }
    }
}
