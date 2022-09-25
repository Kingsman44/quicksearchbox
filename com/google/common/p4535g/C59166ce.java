package com.google.common.p4535g;

import java.util.ArrayList;
import java.util.PriorityQueue;

/* renamed from: com.google.common.g.ce */
/* compiled from: PG */
final class C59166ce {

    /* renamed from: a */
    final C59165cd f157209a;

    /* renamed from: b */
    int f157210b = 0;

    /* renamed from: c */
    final ArrayList f157211c = new ArrayList();

    /* renamed from: d */
    final PriorityQueue f157212d = new PriorityQueue(10, new C59169ch());

    /* renamed from: e */
    final /* synthetic */ C59171cj f157213e;

    public C59166ce(C59171cj cjVar, C59165cd cdVar) {
        this.f157213e = cjVar;
        this.f157209a = cdVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r0.mo56644e(r11, r4) == false) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4535g.C59168cg mo56545a(com.google.common.p4535g.C59225s r11) {
        /*
            r10 = this;
            com.google.common.g.cd r0 = r10.f157209a
            boolean r0 = r0.mo56467g(r11)
            if (r0 == 0) goto L_0x0084
            byte r0 = r11.f157322b
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L_0x006f
            int r0 = r0 + r3
            r4 = 30
            if (r0 > r4) goto L_0x006e
            com.google.common.g.cd r0 = r10.f157209a
            com.google.common.g.bb[] r4 = new com.google.common.p4535g.C59136bb[r1]
            r5 = 0
        L_0x0019:
            if (r5 >= r1) goto L_0x0032
            com.google.common.g.bb r6 = r11.mo56650b(r5)
            com.google.common.g.bb r6 = com.google.common.p4535g.C59136bb.m91671n(r6)
            r4[r5] = r6
            r7 = r0
            com.google.common.g.r r7 = (com.google.common.p4535g.C59224r) r7
            boolean r6 = r7.mo56643d(r6)
            if (r6 != 0) goto L_0x002f
            goto L_0x006f
        L_0x002f:
            int r5 = r5 + 1
            goto L_0x0019
        L_0x0032:
            com.google.common.g.r r0 = (com.google.common.p4535g.C59224r) r0
            boolean r5 = r0.mo56646f()
            if (r5 == 0) goto L_0x003f
            com.google.common.g.r r0 = com.google.common.p4535g.C59224r.m91904b()
            goto L_0x0068
        L_0x003f:
            com.google.common.g.m r5 = r0.f157320b
            boolean r5 = r5.mo56621g()
            if (r5 == 0) goto L_0x0051
            com.google.common.g.r r0 = new com.google.common.g.r
            com.google.common.g.bb r5 = com.google.common.p4535g.C59136bb.f157159b
            com.google.common.g.m r6 = com.google.common.p4535g.C59219m.f157302c
            r0.<init>(r5, r6)
            goto L_0x0068
        L_0x0051:
            com.google.common.g.bb r5 = r0.f157319a
            com.google.common.g.bb r5 = com.google.common.p4535g.C59136bb.m91670m(r5)
            com.google.common.g.m r0 = r0.f157320b
            double r6 = r0.f157305f
            r8 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r8 = r8 - r6
            com.google.common.g.m r0 = com.google.common.p4535g.C59219m.m91873d(r8)
            com.google.common.g.r r6 = new com.google.common.g.r
            r6.<init>(r5, r0)
            r0 = r6
        L_0x0068:
            boolean r0 = r0.mo56644e(r11, r4)
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r2 = 1
        L_0x006f:
            com.google.common.g.cg r0 = new com.google.common.g.cg
            r0.<init>()
            r0.f157215a = r11
            r0.f157216b = r2
            if (r2 != 0) goto L_0x007e
            com.google.common.g.cg[] r11 = new com.google.common.p4535g.C59168cg[r1]
            r0.f157218d = r11
        L_0x007e:
            int r11 = r10.f157210b
            int r11 = r11 + r3
            r10.f157210b = r11
            return r0
        L_0x0084:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59166ce.mo56545a(com.google.common.g.s):com.google.common.g.cg");
    }

    /* renamed from: b */
    public final void mo56546b(C59168cg cgVar) {
        C59225s[] sVarArr;
        C59168cg cgVar2 = cgVar;
        if (cgVar2 != null) {
            if (!cgVar2.f157216b) {
                C59225s sVar = cgVar2.f157215a;
                byte b = sVar.f157322b;
                int i = 4;
                C59225s[] sVarArr2 = new C59225s[4];
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    sVarArr2[i3] = new C59225s();
                }
                if (!sVar.f157324d.mo56661G()) {
                    C59226t p = sVar.f157324d.mo56672p();
                    long j = sVar.f157324d.mo56670j();
                    C59216j jVar = new C59216j(C59164cc.f157204f.mo56542c(C59164cc.m91750b((long) ((int) (j >> 32)))), C59164cc.f157204f.mo56542c(C59164cc.m91750b((long) ((int) j))));
                    double d = jVar.f157293a;
                    double d2 = jVar.f157294b;
                    int i4 = 0;
                    while (i4 < i) {
                        C59225s sVar2 = sVarArr2[i4];
                        sVar2.f157321a = sVar.f157321a;
                        sVar2.f157322b = (byte) (sVar.f157322b + 1);
                        sVar2.f157323c = (byte) (sVar.f157323c ^ C59222p.m91899e(i4));
                        sVar2.f157324d = p;
                        int i5 = C59222p.f157313e[sVar.f157323c][i4];
                        if ((i5 & 2) != 0) {
                            sVar2.f157325e = d;
                            sVarArr = sVarArr2;
                            sVar2.f157326f = sVar.f157326f;
                        } else {
                            sVarArr = sVarArr2;
                            sVar2.f157325e = sVar.f157325e;
                            sVar2.f157326f = d;
                        }
                        if ((i5 & 1) != 0) {
                            sVar2.f157327g = d2;
                            sVar2.f157328h = sVar.f157328h;
                        } else {
                            sVar2.f157327g = sVar.f157327g;
                            sVar2.f157328h = d2;
                        }
                        i4++;
                        p = p.mo56674u();
                        sVarArr2 = sVarArr;
                        i = 4;
                    }
                }
                C59225s[] sVarArr3 = sVarArr2;
                int i6 = 0;
                while (i2 < i) {
                    C59168cg a = mo56545a(sVarArr3[i2]);
                    if (a != null) {
                        C59168cg[] cgVarArr = cgVar2.f157218d;
                        int i7 = cgVar2.f157217c;
                        cgVar2.f157217c = i7 + 1;
                        cgVarArr[i7] = a;
                        if (a.f157216b) {
                            i6++;
                        }
                    }
                    i2++;
                    i = 4;
                }
                int i8 = cgVar2.f157217c;
                if (i8 != 0) {
                    if (i6 == 4) {
                        if (cgVar2.f157215a.f157322b < 0) {
                            i6 = 4;
                        } else {
                            cgVar2.f157216b = true;
                            mo56546b(cgVar);
                            return;
                        }
                    }
                    this.f157212d.add(new C59170ci(-((((cgVar2.f157215a.f157322b << 2) + i8) << 2) + i6), cgVar2));
                    return;
                }
                return;
            }
            this.f157211c.add(cgVar2.f157215a.f157324d);
        }
    }
}
