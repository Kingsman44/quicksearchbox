package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1642j;
import androidx.constraintlayout.p079a.p082b.C1643k;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.a.j */
/* compiled from: PG */
public final class C1625j {
    /* renamed from: a */
    public static C1632q m4343a(C1638f fVar, int i, ArrayList arrayList, C1632q qVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = fVar.f4619aL;
        } else {
            i2 = fVar.f4620aM;
        }
        if (i2 != -1 && (qVar == null || i2 != qVar.f4533c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C1632q qVar2 = (C1632q) arrayList.get(i4);
                if (qVar2.f4533c == i2) {
                    if (qVar != null) {
                        qVar.mo4594c(i, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return qVar;
        }
        if (qVar == null) {
            if (fVar instanceof C1643k) {
                C1643k kVar = (C1643k) fVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= kVar.f4743bf) {
                        i3 = -1;
                        break;
                    }
                    C1638f fVar2 = kVar.f4742be[i5];
                    if (i == 0) {
                        i3 = fVar2.f4619aL;
                        if (i3 != -1) {
                            break;
                        }
                    } else {
                        i3 = fVar2.f4620aM;
                        if (i3 != -1) {
                            break;
                        }
                    }
                    i5++;
                }
                if (i3 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C1632q qVar3 = (C1632q) arrayList.get(i6);
                        if (qVar3.f4533c == i3) {
                            qVar = qVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (qVar == null) {
                qVar = new C1632q(i);
            }
            arrayList.add(qVar);
        }
        if (qVar.mo4595d(fVar)) {
            if (fVar instanceof C1642j) {
                C1642j jVar = (C1642j) fVar;
                jVar.f4736aN.mo4603d(jVar.f4737aO == 0 ? 1 : 0, arrayList, qVar);
            }
            if (i == 0) {
                fVar.f4619aL = qVar.f4533c;
                fVar.f4594N.mo4603d(0, arrayList, qVar);
                fVar.f4596P.mo4603d(0, arrayList, qVar);
            } else {
                fVar.f4620aM = qVar.f4533c;
                fVar.f4595O.mo4603d(1, arrayList, qVar);
                fVar.f4598R.mo4603d(1, arrayList, qVar);
                fVar.f4597Q.mo4603d(1, arrayList, qVar);
            }
            fVar.f4601U.mo4603d(i, arrayList, qVar);
        }
        return qVar;
    }

    /* renamed from: b */
    public static C1632q m4344b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1632q qVar = (C1632q) arrayList.get(i2);
            if (i == qVar.f4533c) {
                return qVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4345c(androidx.constraintlayout.p079a.p082b.C1637e r4, androidx.constraintlayout.p079a.p082b.C1637e r5, androidx.constraintlayout.p079a.p082b.C1637e r6, androidx.constraintlayout.p079a.p082b.C1637e r7) {
        /*
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L_0x0013
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r6 == r0) goto L_0x0013
            androidx.constraintlayout.a.b.e r3 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r6 != r3) goto L_0x0011
            if (r4 == r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r4 = 0
            goto L_0x0014
        L_0x0013:
            r4 = 1
        L_0x0014:
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r7 == r6) goto L_0x0025
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r7 == r6) goto L_0x0025
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_PARENT
            if (r7 != r0) goto L_0x0023
            if (r5 == r6) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            if (r4 != 0) goto L_0x002c
            if (r5 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            return r1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4345c(androidx.constraintlayout.a.b.e, androidx.constraintlayout.a.b.e, androidx.constraintlayout.a.b.e, androidx.constraintlayout.a.b.e):boolean");
    }
}
