package android.support.constraint.p029a.p030a;

import android.support.constraint.p029a.C0142e;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.d */
/* compiled from: PG */
public final class C0134d extends C0138h {

    /* renamed from: ah */
    protected final C0142e f472ah = new C0142e();

    /* renamed from: ai */
    int f473ai;

    /* renamed from: aj */
    int f474aj;

    /* renamed from: ak */
    public int f475ak = 2;

    /* renamed from: al */
    public boolean f476al = false;

    /* renamed from: am */
    public boolean f477am = false;

    /* renamed from: ao */
    private C0137g f478ao;

    /* renamed from: ap */
    private int f479ap = 0;

    /* renamed from: aq */
    private int f480aq = 0;

    /* renamed from: ar */
    private C0133c[] f481ar = new C0133c[4];

    /* renamed from: as */
    private C0133c[] f482as = new C0133c[4];

    /* renamed from: at */
    private C0133c[] f483at = new C0133c[4];

    /* renamed from: au */
    private final boolean[] f484au = new boolean[3];

    /* renamed from: av */
    private final C0133c[] f485av = new C0133c[4];

    /* renamed from: B */
    private final int m182B(C0142e eVar, C0133c[] cVarArr, C0133c cVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        C0142e eVar2 = eVar;
        C0133c cVar2 = cVar;
        zArr[0] = true;
        zArr[1] = false;
        C0133c cVar3 = null;
        cVarArr[0] = null;
        cVarArr[2] = null;
        cVarArr[1] = null;
        cVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            C0132b bVar = cVar2.f454i.f405b;
            boolean z = bVar == null || bVar.f404a == this;
            cVar2.f443ad = null;
            C0133c cVar4 = cVar2.f425M != 8 ? cVar2 : null;
            C0133c cVar5 = cVar2;
            C0133c cVar6 = null;
            C0133c cVar7 = cVar4;
            i2 = 0;
            while (cVar5.f456k.f405b != null) {
                cVar5.f443ad = cVar3;
                if (cVar5.f425M != 8) {
                    if (cVar4 == null) {
                        cVar4 = cVar5;
                    }
                    if (!(cVar7 == null || cVar7 == cVar5)) {
                        cVar7.f443ad = cVar5;
                    }
                    cVar7 = cVar5;
                } else {
                    C0132b bVar2 = cVar5.f454i;
                    eVar2.mo181n(bVar2.f409f, bVar2.f405b.f409f, 0, 5);
                    eVar2.mo181n(cVar5.f456k.f409f, cVar5.f454i.f409f, 0, 5);
                }
                if (cVar5.f425M != 8 && cVar5.f445af == 3) {
                    if (cVar5.f446ag == 3) {
                        zArr[0] = false;
                    }
                    if (cVar5.f466u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        C0133c[] cVarArr2 = this.f481ar;
                        int length = cVarArr2.length;
                        if (i4 >= length) {
                            this.f481ar = (C0133c[]) Arrays.copyOf(cVarArr2, length + length);
                        }
                        this.f481ar[i2] = cVar5;
                        i2 = i4;
                    }
                }
                C0133c cVar8 = cVar5.f456k.f405b.f404a;
                C0132b bVar3 = cVar8.f454i.f405b;
                if (bVar3 == null || bVar3.f404a != cVar5 || cVar8 == cVar5) {
                    break;
                }
                cVar6 = cVar8;
                cVar5 = cVar6;
                cVar3 = null;
                f = 0.0f;
            }
            C0132b bVar4 = cVar5.f456k.f405b;
            if (!(bVar4 == null || bVar4.f404a == this)) {
                z = false;
            }
            if (cVar2.f454i.f405b == null || cVar6.f456k.f405b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            cVar2.f438Z = z;
            cVar6.f443ad = null;
            cVarArr[0] = cVar2;
            cVarArr[2] = cVar4;
            cVarArr[c2] = cVar6;
            cVarArr[3] = cVar7;
        } else {
            C0132b bVar5 = cVar2.f455j.f405b;
            boolean z2 = bVar5 == null || bVar5.f404a == this;
            C0133c cVar9 = null;
            cVar2.f444ae = null;
            C0133c cVar10 = cVar2;
            C0133c cVar11 = null;
            C0133c cVar12 = cVar2.f425M != 8 ? cVar2 : null;
            C0133c cVar13 = cVar12;
            int i5 = 0;
            while (cVar10.f457l.f405b != null) {
                cVar10.f444ae = cVar9;
                if (cVar10.f425M != 8) {
                    if (cVar12 == null) {
                        cVar12 = cVar10;
                    }
                    if (!(cVar13 == null || cVar13 == cVar10)) {
                        cVar13.f444ae = cVar10;
                    }
                    cVar13 = cVar10;
                } else {
                    C0132b bVar6 = cVar10.f455j;
                    eVar2.mo181n(bVar6.f409f, bVar6.f405b.f409f, 0, i3);
                    eVar2.mo181n(cVar10.f457l.f409f, cVar10.f455j.f409f, 0, i3);
                }
                if (cVar10.f425M != 8 && cVar10.f446ag == 3) {
                    if (cVar10.f445af == 3) {
                        zArr[0] = false;
                    }
                    if (cVar10.f466u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        C0133c[] cVarArr3 = this.f481ar;
                        int length2 = cVarArr3.length;
                        if (i6 >= length2) {
                            this.f481ar = (C0133c[]) Arrays.copyOf(cVarArr3, length2 + length2);
                        }
                        this.f481ar[i5] = cVar10;
                        i5 = i6;
                    }
                }
                C0133c cVar14 = cVar10.f457l.f405b.f404a;
                C0132b bVar7 = cVar14.f455j.f405b;
                if (bVar7 == null || bVar7.f404a != cVar10 || cVar14 == cVar10) {
                    break;
                }
                cVar11 = cVar14;
                cVar10 = cVar11;
                cVar9 = null;
                i3 = 5;
            }
            i2 = i5;
            C0132b bVar8 = cVar10.f457l.f405b;
            if (!(bVar8 == null || bVar8.f404a == this)) {
                z2 = false;
            }
            if (cVar2.f455j.f405b == null || cVar11.f457l.f405b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            cVar2.f440aa = z2;
            cVar11.f444ae = null;
            cVarArr[0] = cVar2;
            cVarArr[2] = cVar12;
            cVarArr[c] = cVar11;
            cVarArr[3] = cVar13;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:249:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x050b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0155  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m183C(android.support.constraint.p029a.C0142e r31) {
        /*
            r30 = this;
            r6 = r30
            r15 = r31
            r14 = 0
            r13 = 0
        L_0x0006:
            int r0 = r6.f479ap
            if (r13 >= r0) goto L_0x055b
            android.support.constraint.a.a.c[] r0 = r6.f483at
            r12 = r0[r13]
            android.support.constraint.a.a.c[] r2 = r6.f485av
            r4 = 0
            boolean[] r5 = r6.f484au
            r0 = r30
            r1 = r31
            r3 = r12
            int r0 = r0.m182B(r1, r2, r3, r4, r5)
            android.support.constraint.a.a.c[] r1 = r6.f485av
            r2 = 2
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0027
        L_0x0023:
            r0 = r13
            r6 = 0
            goto L_0x0554
        L_0x0027:
            boolean[] r3 = r6.f484au
            r4 = 1
            boolean r5 = r3[r4]
            if (r5 == 0) goto L_0x0053
            int r0 = r12.f470y
            int r2 = r12.f415C
            int r0 = r0 + r2
        L_0x0033:
            if (r1 == 0) goto L_0x0023
            android.support.constraint.a.a.b r2 = r1.f454i
            android.support.constraint.a.g r2 = r2.f409f
            r15.mo175h(r2, r0)
            android.support.constraint.a.a.c r2 = r1.f443ad
            android.support.constraint.a.a.b r3 = r1.f454i
            int r3 = r3.mo123a()
            int r4 = r1.mo132d()
            int r3 = r3 + r4
            android.support.constraint.a.a.b r1 = r1.f456k
            int r1 = r1.mo123a()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x0033
        L_0x0053:
            int r5 = r12.f436X
            if (r5 != 0) goto L_0x005a
            r16 = 1
            goto L_0x005c
        L_0x005a:
            r16 = 0
        L_0x005c:
            if (r5 != r2) goto L_0x0061
            r17 = 1
            goto L_0x0063
        L_0x0061:
            r17 = 0
        L_0x0063:
            int r7 = r6.f445af
            int r8 = r6.f475ak
            r9 = 8
            r10 = 0
            r11 = 3
            r18 = 0
            if (r8 == r2) goto L_0x0071
            if (r8 != r9) goto L_0x0193
        L_0x0071:
            boolean r3 = r3[r14]
            if (r3 == 0) goto L_0x0193
            boolean r3 = r12.f438Z
            if (r3 == 0) goto L_0x0193
            if (r17 != 0) goto L_0x0193
            if (r7 == r2) goto L_0x0193
            if (r5 != 0) goto L_0x0193
            r1 = r12
            r2 = r18
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0085:
            if (r1 == 0) goto L_0x00d4
            int r2 = r1.f425M
            if (r2 != r9) goto L_0x008c
            goto L_0x00b5
        L_0x008c:
            int r3 = r3 + 1
            int r2 = r1.f445af
            if (r2 == r11) goto L_0x00b2
            int r2 = r1.mo132d()
            int r5 = r5 + r2
            android.support.constraint.a.a.b r2 = r1.f454i
            android.support.constraint.a.a.b r7 = r2.f405b
            if (r7 == 0) goto L_0x00a2
            int r2 = r2.mo123a()
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            int r5 = r5 + r2
            android.support.constraint.a.a.b r2 = r1.f456k
            android.support.constraint.a.a.b r7 = r2.f405b
            if (r7 == 0) goto L_0x00af
            int r2 = r2.mo123a()
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            int r5 = r5 + r2
            goto L_0x00b5
        L_0x00b2:
            float r2 = r1.f441ab
            float r4 = r4 + r2
        L_0x00b5:
            android.support.constraint.a.a.b r2 = r1.f456k
            android.support.constraint.a.a.b r2 = r2.f405b
            if (r2 == 0) goto L_0x00be
            android.support.constraint.a.a.c r2 = r2.f404a
            goto L_0x00c0
        L_0x00be:
            r2 = r18
        L_0x00c0:
            if (r2 == 0) goto L_0x00ce
            android.support.constraint.a.a.b r7 = r2.f454i
            android.support.constraint.a.a.b r7 = r7.f405b
            if (r7 == 0) goto L_0x00cc
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 == r1) goto L_0x00ce
        L_0x00cc:
            r2 = r18
        L_0x00ce:
            r29 = r2
            r2 = r1
            r1 = r29
            goto L_0x0085
        L_0x00d4:
            if (r2 == 0) goto L_0x00ee
            android.support.constraint.a.a.b r1 = r2.f456k
            android.support.constraint.a.a.b r1 = r1.f405b
            if (r1 == 0) goto L_0x00e1
            android.support.constraint.a.a.c r2 = r1.f404a
            int r2 = r2.f468w
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            if (r1 == 0) goto L_0x00ef
            android.support.constraint.a.a.c r1 = r1.f404a
            if (r1 != r6) goto L_0x00ef
            int r1 = r6.f468w
            int r2 = r6.f464s
            int r2 = r2 + r1
            goto L_0x00ef
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            float r1 = (float) r2
            float r2 = (float) r5
            float r1 = r1 - r2
            int r3 = r3 + 1
            float r2 = (float) r3
            float r2 = r1 / r2
            if (r0 != 0) goto L_0x00fb
            r3 = r2
            goto L_0x0100
        L_0x00fb:
            float r2 = (float) r0
            float r2 = r1 / r2
            r3 = r2
            r2 = 0
        L_0x0100:
            if (r12 == 0) goto L_0x0023
            android.support.constraint.a.a.b r5 = r12.f454i
            android.support.constraint.a.a.b r7 = r5.f405b
            if (r7 == 0) goto L_0x010d
            int r5 = r5.mo123a()
            goto L_0x010e
        L_0x010d:
            r5 = 0
        L_0x010e:
            android.support.constraint.a.a.b r7 = r12.f456k
            android.support.constraint.a.a.b r8 = r7.f405b
            if (r8 == 0) goto L_0x0119
            int r7 = r7.mo123a()
            goto L_0x011a
        L_0x0119:
            r7 = 0
        L_0x011a:
            int r8 = r12.f425M
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r8 == r9) goto L_0x0159
            float r5 = (float) r5
            float r2 = r2 + r5
            android.support.constraint.a.a.b r8 = r12.f454i
            android.support.constraint.a.g r8 = r8.f409f
            float r9 = r2 + r16
            int r9 = (int) r9
            r15.mo175h(r8, r9)
            int r8 = r12.f445af
            if (r8 != r11) goto L_0x0143
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0139
            float r5 = r3 - r5
            float r8 = (float) r7
            float r5 = r5 - r8
            goto L_0x0148
        L_0x0139:
            float r8 = r12.f441ab
            float r8 = r8 * r1
            float r8 = r8 / r4
            float r8 = r8 - r5
            float r5 = (float) r7
            float r8 = r8 - r5
            float r2 = r2 + r8
            goto L_0x0149
        L_0x0143:
            int r5 = r12.mo132d()
            float r5 = (float) r5
        L_0x0148:
            float r2 = r2 + r5
        L_0x0149:
            android.support.constraint.a.a.b r5 = r12.f456k
            android.support.constraint.a.g r5 = r5.f409f
            float r8 = r2 + r16
            int r8 = (int) r8
            r15.mo175h(r5, r8)
            if (r0 != 0) goto L_0x0156
            float r2 = r2 + r3
        L_0x0156:
            float r5 = (float) r7
            float r2 = r2 + r5
            goto L_0x0170
        L_0x0159:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r5
            float r5 = r2 - r5
            float r5 = r5 + r16
            int r5 = (int) r5
            android.support.constraint.a.a.b r7 = r12.f454i
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo175h(r7, r5)
            android.support.constraint.a.a.b r7 = r12.f456k
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo175h(r7, r5)
        L_0x0170:
            android.support.constraint.a.a.b r5 = r12.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x0179
            android.support.constraint.a.a.c r5 = r5.f404a
            goto L_0x017b
        L_0x0179:
            r5 = r18
        L_0x017b:
            if (r5 == 0) goto L_0x018a
            android.support.constraint.a.a.b r7 = r5.f454i
            android.support.constraint.a.a.b r7 = r7.f405b
            if (r7 == 0) goto L_0x018a
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 == r12) goto L_0x018a
            r12 = r18
            goto L_0x018b
        L_0x018a:
            r12 = r5
        L_0x018b:
            if (r12 != r6) goto L_0x018f
            r12 = r18
        L_0x018f:
            r9 = 8
            goto L_0x0100
        L_0x0193:
            if (r0 == 0) goto L_0x03d2
            if (r17 == 0) goto L_0x019d
            r0 = r1
            r2 = r18
            r3 = r2
            goto L_0x03d7
        L_0x019d:
            r3 = r18
        L_0x019f:
            if (r1 == 0) goto L_0x023b
            int r5 = r1.f445af
            if (r5 == r11) goto L_0x01f9
            android.support.constraint.a.a.b r5 = r1.f454i
            int r5 = r5.mo123a()
            if (r3 == 0) goto L_0x01b4
            android.support.constraint.a.a.b r3 = r3.f456k
            int r3 = r3.mo123a()
            int r5 = r5 + r3
        L_0x01b4:
            android.support.constraint.a.a.b r3 = r1.f454i
            android.support.constraint.a.a.b r7 = r3.f405b
            android.support.constraint.a.a.c r8 = r7.f404a
            int r8 = r8.f445af
            if (r8 != r11) goto L_0x01c0
            r8 = 2
            goto L_0x01c1
        L_0x01c0:
            r8 = 3
        L_0x01c1:
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo176i(r3, r7, r5, r8)
            android.support.constraint.a.a.b r3 = r1.f456k
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r5 = r1.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.a.c r5 = r5.f404a
            android.support.constraint.a.a.b r5 = r5.f454i
            android.support.constraint.a.a.b r7 = r5.f405b
            if (r7 == 0) goto L_0x01e3
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 != r1) goto L_0x01e3
            int r5 = r5.mo123a()
            int r3 = r3 + r5
        L_0x01e3:
            android.support.constraint.a.a.b r5 = r1.f456k
            android.support.constraint.a.a.b r7 = r5.f405b
            android.support.constraint.a.a.c r8 = r7.f404a
            int r8 = r8.f445af
            if (r8 != r11) goto L_0x01ef
            r8 = 2
            goto L_0x01f0
        L_0x01ef:
            r8 = 3
        L_0x01f0:
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.g r7 = r7.f409f
            int r3 = -r3
            r15.mo177j(r5, r7, r3, r8)
            goto L_0x0232
        L_0x01f9:
            float r3 = r1.f441ab
            float r10 = r10 + r3
            android.support.constraint.a.a.b r3 = r1.f456k
            android.support.constraint.a.a.b r5 = r3.f405b
            if (r5 == 0) goto L_0x021a
            int r3 = r3.mo123a()
            android.support.constraint.a.a.c[] r5 = r6.f485av
            r5 = r5[r11]
            if (r1 == r5) goto L_0x021b
            android.support.constraint.a.a.b r5 = r1.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.a.c r5 = r5.f404a
            android.support.constraint.a.a.b r5 = r5.f454i
            int r5 = r5.mo123a()
            int r3 = r3 + r5
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            android.support.constraint.a.a.b r5 = r1.f456k
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.a.b r7 = r1.f454i
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo176i(r5, r7, r14, r4)
            android.support.constraint.a.a.b r5 = r1.f456k
            android.support.constraint.a.g r7 = r5.f409f
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
            int r3 = -r3
            r15.mo177j(r7, r5, r3, r4)
        L_0x0232:
            android.support.constraint.a.a.c r3 = r1.f443ad
            r29 = r3
            r3 = r1
            r1 = r29
            goto L_0x019f
        L_0x023b:
            if (r0 != r4) goto L_0x02b4
            android.support.constraint.a.a.c[] r0 = r6.f481ar
            r0 = r0[r14]
            android.support.constraint.a.a.b r1 = r0.f454i
            int r1 = r1.mo123a()
            android.support.constraint.a.a.b r3 = r0.f454i
            android.support.constraint.a.a.b r3 = r3.f405b
            if (r3 == 0) goto L_0x0252
            int r3 = r3.mo123a()
            int r1 = r1 + r3
        L_0x0252:
            android.support.constraint.a.a.b r3 = r0.f456k
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r5 = r0.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x0263
            int r5 = r5.mo123a()
            int r3 = r3 + r5
        L_0x0263:
            android.support.constraint.a.a.b r5 = r12.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.a.c[] r7 = r6.f485av
            r8 = r7[r11]
            if (r0 != r8) goto L_0x0277
            r5 = r7[r4]
            android.support.constraint.a.a.b r5 = r5.f456k
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
        L_0x0277:
            int r7 = r0.f448c
            if (r7 != r4) goto L_0x029f
            android.support.constraint.a.a.b r0 = r12.f454i
            android.support.constraint.a.g r7 = r0.f409f
            android.support.constraint.a.a.b r0 = r0.f405b
            android.support.constraint.a.g r0 = r0.f409f
            r15.mo176i(r7, r0, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f456k
            android.support.constraint.a.g r0 = r0.f409f
            int r1 = -r3
            r15.mo177j(r0, r5, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f456k
            android.support.constraint.a.g r0 = r0.f409f
            android.support.constraint.a.a.b r1 = r12.f454i
            android.support.constraint.a.g r1 = r1.f409f
            int r3 = r12.mo132d()
            r15.mo181n(r0, r1, r3, r2)
            goto L_0x0023
        L_0x029f:
            android.support.constraint.a.a.b r2 = r0.f454i
            android.support.constraint.a.g r7 = r2.f409f
            android.support.constraint.a.a.b r2 = r2.f405b
            android.support.constraint.a.g r2 = r2.f409f
            r15.mo181n(r7, r2, r1, r4)
            android.support.constraint.a.a.b r0 = r0.f456k
            android.support.constraint.a.g r0 = r0.f409f
            int r1 = -r3
            r15.mo181n(r0, r5, r1, r4)
            goto L_0x0023
        L_0x02b4:
            r1 = 0
        L_0x02b5:
            int r3 = r0 + -1
            if (r1 >= r3) goto L_0x0023
            android.support.constraint.a.a.c[] r5 = r6.f481ar
            r7 = r5[r1]
            int r1 = r1 + 1
            r5 = r5[r1]
            android.support.constraint.a.a.b r8 = r7.f454i
            android.support.constraint.a.g r9 = r8.f409f
            android.support.constraint.a.a.b r14 = r7.f456k
            android.support.constraint.a.g r14 = r14.f409f
            android.support.constraint.a.a.b r2 = r5.f454i
            android.support.constraint.a.g r2 = r2.f409f
            android.support.constraint.a.a.b r4 = r5.f456k
            android.support.constraint.a.g r4 = r4.f409f
            r28 = r0
            android.support.constraint.a.a.c[] r0 = r6.f485av
            r16 = r4
            r4 = r0[r11]
            if (r5 != r4) goto L_0x02e3
            r4 = 1
            r0 = r0[r4]
            android.support.constraint.a.a.b r0 = r0.f456k
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x02e5
        L_0x02e3:
            r0 = r16
        L_0x02e5:
            int r4 = r8.mo123a()
            android.support.constraint.a.a.b r8 = r7.f454i
            android.support.constraint.a.a.b r8 = r8.f405b
            if (r8 == 0) goto L_0x0300
            android.support.constraint.a.a.c r8 = r8.f404a
            android.support.constraint.a.a.b r8 = r8.f456k
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0300
            android.support.constraint.a.a.c r11 = r11.f404a
            if (r11 != r7) goto L_0x0300
            int r8 = r8.mo123a()
            int r4 = r4 + r8
        L_0x0300:
            android.support.constraint.a.a.b r8 = r7.f454i
            android.support.constraint.a.a.b r8 = r8.f405b
            android.support.constraint.a.g r8 = r8.f409f
            r11 = 2
            r15.mo176i(r9, r8, r4, r11)
            android.support.constraint.a.a.b r4 = r7.f456k
            int r4 = r4.mo123a()
            android.support.constraint.a.a.b r8 = r7.f456k
            android.support.constraint.a.a.b r8 = r8.f405b
            if (r8 == 0) goto L_0x0327
            android.support.constraint.a.a.c r8 = r7.f443ad
            if (r8 == 0) goto L_0x0327
            android.support.constraint.a.a.b r8 = r8.f454i
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0325
            int r8 = r8.mo123a()
            goto L_0x0326
        L_0x0325:
            r8 = 0
        L_0x0326:
            int r4 = r4 + r8
        L_0x0327:
            android.support.constraint.a.a.b r8 = r7.f456k
            android.support.constraint.a.a.b r8 = r8.f405b
            android.support.constraint.a.g r8 = r8.f409f
            int r4 = -r4
            r11 = 2
            r15.mo177j(r14, r8, r4, r11)
            if (r1 != r3) goto L_0x038c
            android.support.constraint.a.a.b r3 = r5.f454i
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r4 = r5.f454i
            android.support.constraint.a.a.b r4 = r4.f405b
            if (r4 == 0) goto L_0x0351
            android.support.constraint.a.a.c r4 = r4.f404a
            android.support.constraint.a.a.b r4 = r4.f456k
            android.support.constraint.a.a.b r8 = r4.f405b
            if (r8 == 0) goto L_0x0351
            android.support.constraint.a.a.c r8 = r8.f404a
            if (r8 != r5) goto L_0x0351
            int r4 = r4.mo123a()
            int r3 = r3 + r4
        L_0x0351:
            android.support.constraint.a.a.b r4 = r5.f454i
            android.support.constraint.a.a.b r4 = r4.f405b
            android.support.constraint.a.g r4 = r4.f409f
            r8 = 2
            r15.mo176i(r2, r4, r3, r8)
            android.support.constraint.a.a.b r3 = r5.f456k
            android.support.constraint.a.a.c[] r4 = r6.f485av
            r8 = 3
            r11 = r4[r8]
            if (r5 != r11) goto L_0x0369
            r8 = 1
            r3 = r4[r8]
            android.support.constraint.a.a.b r3 = r3.f456k
        L_0x0369:
            int r4 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 == 0) goto L_0x0382
            android.support.constraint.a.a.c r8 = r8.f404a
            android.support.constraint.a.a.b r8 = r8.f454i
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0382
            android.support.constraint.a.a.c r11 = r11.f404a
            if (r11 != r5) goto L_0x0382
            int r8 = r8.mo123a()
            int r4 = r4 + r8
        L_0x0382:
            android.support.constraint.a.a.b r3 = r3.f405b
            android.support.constraint.a.g r3 = r3.f409f
            int r4 = -r4
            r8 = 2
            r15.mo177j(r0, r3, r4, r8)
            goto L_0x038d
        L_0x038c:
            r8 = 2
        L_0x038d:
            int r3 = r12.f451f
            if (r3 <= 0) goto L_0x0394
            r15.mo177j(r14, r9, r3, r8)
        L_0x0394:
            android.support.constraint.a.b r3 = r31.mo170a()
            float r4 = r7.f441ab
            float r11 = r5.f441ab
            android.support.constraint.a.a.b r8 = r7.f454i
            int r21 = r8.mo123a()
            android.support.constraint.a.a.b r7 = r7.f456k
            int r23 = r7.mo123a()
            android.support.constraint.a.a.b r7 = r5.f454i
            int r25 = r7.mo123a()
            android.support.constraint.a.a.b r5 = r5.f456k
            int r27 = r5.mo123a()
            r16 = r3
            r17 = r4
            r18 = r10
            r19 = r11
            r20 = r9
            r22 = r14
            r24 = r2
            r26 = r0
            r16.mo162e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15.mo174g(r3)
            r0 = r28
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x02b5
        L_0x03d2:
            r0 = r1
            r2 = r18
            r3 = r2
            r14 = 0
        L_0x03d7:
            if (r0 == 0) goto L_0x0515
            android.support.constraint.a.a.c r4 = r0.f443ad
            if (r4 != 0) goto L_0x03e4
            android.support.constraint.a.a.c[] r2 = r6.f485av
            r5 = 1
            r2 = r2[r5]
            r5 = 1
            goto L_0x03e5
        L_0x03e4:
            r5 = r14
        L_0x03e5:
            if (r17 == 0) goto L_0x0437
            android.support.constraint.a.a.b r7 = r0.f454i
            int r8 = r7.mo123a()
            if (r3 == 0) goto L_0x03f6
            android.support.constraint.a.a.b r3 = r3.f456k
            int r3 = r3.mo123a()
            int r8 = r8 + r3
        L_0x03f6:
            if (r1 == r0) goto L_0x03fa
            r3 = 3
            goto L_0x03fb
        L_0x03fa:
            r3 = 1
        L_0x03fb:
            android.support.constraint.a.g r9 = r7.f409f
            android.support.constraint.a.a.b r10 = r7.f405b
            android.support.constraint.a.g r10 = r10.f409f
            r15.mo176i(r9, r10, r8, r3)
            int r3 = r0.f445af
            r11 = 3
            if (r3 != r11) goto L_0x048e
            android.support.constraint.a.a.b r3 = r0.f456k
            int r8 = r0.f448c
            r9 = 1
            if (r8 != r9) goto L_0x0422
            int r8 = r0.f450e
            int r9 = r0.mo132d()
            int r8 = java.lang.Math.max(r8, r9)
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo181n(r3, r7, r8, r11)
            goto L_0x048e
        L_0x0422:
            android.support.constraint.a.g r8 = r7.f409f
            android.support.constraint.a.a.b r9 = r7.f405b
            android.support.constraint.a.g r9 = r9.f409f
            int r10 = r7.f406c
            r15.mo176i(r8, r9, r10, r11)
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            int r8 = r0.f450e
            r15.mo177j(r3, r7, r8, r11)
            goto L_0x048e
        L_0x0437:
            r11 = 3
            r7 = 5
            if (r16 != 0) goto L_0x0466
            if (r5 == 0) goto L_0x0466
            if (r3 == 0) goto L_0x0466
            android.support.constraint.a.a.b r3 = r0.f456k
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 != 0) goto L_0x0453
            android.support.constraint.a.g r3 = r3.f409f
            int r7 = r0.f470y
            int r8 = r0.f415C
            int r7 = r7 + r8
            int r8 = r0.f413A
            int r7 = r7 + r8
            r15.mo175h(r3, r7)
            goto L_0x048e
        L_0x0453:
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r0.f456k
            android.support.constraint.a.g r8 = r8.f409f
            android.support.constraint.a.a.b r9 = r2.f456k
            android.support.constraint.a.a.b r9 = r9.f405b
            android.support.constraint.a.g r9 = r9.f409f
            int r3 = -r3
            r15.mo181n(r8, r9, r3, r7)
            goto L_0x048e
        L_0x0466:
            if (r16 != 0) goto L_0x0496
            if (r5 != 0) goto L_0x0496
            if (r3 != 0) goto L_0x0496
            android.support.constraint.a.a.b r3 = r0.f454i
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 != 0) goto L_0x047d
            android.support.constraint.a.g r3 = r3.f409f
            int r7 = r0.f470y
            int r8 = r0.f415C
            int r7 = r7 + r8
            r15.mo175h(r3, r7)
            goto L_0x048e
        L_0x047d:
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r0.f454i
            android.support.constraint.a.g r8 = r8.f409f
            android.support.constraint.a.a.b r9 = r12.f454i
            android.support.constraint.a.a.b r9 = r9.f405b
            android.support.constraint.a.g r9 = r9.f409f
            r15.mo181n(r8, r9, r3, r7)
        L_0x048e:
            r19 = r0
        L_0x0490:
            r3 = r12
            r0 = r13
            r6 = 0
        L_0x0493:
            r7 = 1
            goto L_0x0507
        L_0x0496:
            android.support.constraint.a.a.b r7 = r0.f454i
            android.support.constraint.a.a.b r8 = r0.f456k
            int r10 = r7.mo123a()
            int r14 = r8.mo123a()
            android.support.constraint.a.g r9 = r7.f409f
            android.support.constraint.a.a.b r11 = r7.f405b
            android.support.constraint.a.g r11 = r11.f409f
            r19 = r0
            r0 = 1
            r15.mo176i(r9, r11, r10, r0)
            android.support.constraint.a.g r9 = r8.f409f
            android.support.constraint.a.a.b r11 = r8.f405b
            android.support.constraint.a.g r11 = r11.f409f
            int r6 = -r14
            r15.mo177j(r9, r11, r6, r0)
            android.support.constraint.a.a.b r0 = r7.f405b
            if (r0 == 0) goto L_0x04bf
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x04c1
        L_0x04bf:
            r0 = r18
        L_0x04c1:
            if (r3 != 0) goto L_0x04cf
            android.support.constraint.a.a.b r0 = r12.f454i
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x04cc
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x04cf
        L_0x04cc:
            r9 = r18
            goto L_0x04d0
        L_0x04cf:
            r9 = r0
        L_0x04d0:
            if (r4 != 0) goto L_0x04dd
            android.support.constraint.a.a.b r0 = r2.f456k
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x04db
            android.support.constraint.a.a.c r4 = r0.f404a
            goto L_0x04dd
        L_0x04db:
            r4 = r18
        L_0x04dd:
            if (r4 == 0) goto L_0x0490
            android.support.constraint.a.a.b r0 = r4.f454i
            android.support.constraint.a.g r0 = r0.f409f
            if (r5 == 0) goto L_0x04f0
            android.support.constraint.a.a.b r0 = r2.f456k
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x04ee
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x04f0
        L_0x04ee:
            r0 = r18
        L_0x04f0:
            if (r9 == 0) goto L_0x0490
            if (r0 == 0) goto L_0x0490
            android.support.constraint.a.g r3 = r7.f409f
            r11 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.a.g r6 = r8.f409f
            r7 = r31
            r8 = r3
            r3 = 3
            r3 = r12
            r12 = r0
            r0 = r13
            r13 = r6
            r6 = 0
            r7.mo180m(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0493
        L_0x0507:
            if (r7 != r5) goto L_0x050b
            r4 = r18
        L_0x050b:
            r6 = r30
            r13 = r0
            r12 = r3
            r0 = r4
            r14 = r5
            r3 = r19
            goto L_0x03d7
        L_0x0515:
            r3 = r12
            r0 = r13
            r6 = 0
            if (r17 == 0) goto L_0x0554
            android.support.constraint.a.a.b r1 = r1.f454i
            android.support.constraint.a.a.b r4 = r2.f456k
            int r10 = r1.mo123a()
            int r14 = r4.mo123a()
            android.support.constraint.a.a.b r5 = r3.f454i
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x0530
            android.support.constraint.a.g r5 = r5.f409f
            r9 = r5
            goto L_0x0532
        L_0x0530:
            r9 = r18
        L_0x0532:
            android.support.constraint.a.a.b r2 = r2.f456k
            android.support.constraint.a.a.b r2 = r2.f405b
            if (r2 == 0) goto L_0x053c
            android.support.constraint.a.g r2 = r2.f409f
            r12 = r2
            goto L_0x053e
        L_0x053c:
            r12 = r18
        L_0x053e:
            if (r9 == 0) goto L_0x0554
            if (r12 == 0) goto L_0x0554
            android.support.constraint.a.g r2 = r4.f409f
            int r5 = -r14
            r7 = 1
            r15.mo177j(r2, r12, r5, r7)
            android.support.constraint.a.g r8 = r1.f409f
            float r11 = r3.f422J
            android.support.constraint.a.g r13 = r4.f409f
            r7 = r31
            r7.mo180m(r8, r9, r10, r11, r12, r13, r14)
        L_0x0554:
            int r13 = r0 + 1
            r14 = 0
            r6 = r30
            goto L_0x0006
        L_0x055b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0134d.m183C(android.support.constraint.a.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:259:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x052a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0155  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m184D(android.support.constraint.p029a.C0142e r31) {
        /*
            r30 = this;
            r6 = r30
            r15 = r31
            r14 = 0
            r13 = 0
        L_0x0006:
            int r0 = r6.f480aq
            if (r13 >= r0) goto L_0x057a
            android.support.constraint.a.a.c[] r0 = r6.f482as
            r12 = r0[r13]
            android.support.constraint.a.a.c[] r2 = r6.f485av
            r4 = 1
            boolean[] r5 = r6.f484au
            r0 = r30
            r1 = r31
            r3 = r12
            int r0 = r0.m182B(r1, r2, r3, r4, r5)
            android.support.constraint.a.a.c[] r1 = r6.f485av
            r2 = 2
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0027
        L_0x0023:
            r0 = r13
            r6 = 0
            goto L_0x0573
        L_0x0027:
            boolean[] r3 = r6.f484au
            r4 = 1
            boolean r5 = r3[r4]
            if (r5 == 0) goto L_0x0053
            int r0 = r12.f471z
            int r2 = r12.f416D
            int r0 = r0 + r2
        L_0x0033:
            if (r1 == 0) goto L_0x0023
            android.support.constraint.a.a.b r2 = r1.f455j
            android.support.constraint.a.g r2 = r2.f409f
            r15.mo175h(r2, r0)
            android.support.constraint.a.a.c r2 = r1.f444ae
            android.support.constraint.a.a.b r3 = r1.f455j
            int r3 = r3.mo123a()
            int r4 = r1.mo129a()
            int r3 = r3 + r4
            android.support.constraint.a.a.b r1 = r1.f457l
            int r1 = r1.mo123a()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x0033
        L_0x0053:
            int r5 = r12.f437Y
            if (r5 != 0) goto L_0x005a
            r16 = 1
            goto L_0x005c
        L_0x005a:
            r16 = 0
        L_0x005c:
            if (r5 != r2) goto L_0x0061
            r17 = 1
            goto L_0x0063
        L_0x0061:
            r17 = 0
        L_0x0063:
            int r7 = r6.f446ag
            int r8 = r6.f475ak
            r9 = 8
            r10 = 0
            r11 = 3
            r18 = 0
            if (r8 == r2) goto L_0x0071
            if (r8 != r9) goto L_0x0193
        L_0x0071:
            boolean r3 = r3[r14]
            if (r3 == 0) goto L_0x0193
            boolean r3 = r12.f440aa
            if (r3 == 0) goto L_0x0193
            if (r17 != 0) goto L_0x0193
            if (r7 == r2) goto L_0x0193
            if (r5 != 0) goto L_0x0193
            r1 = r12
            r2 = r18
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0085:
            if (r1 == 0) goto L_0x00d4
            int r2 = r1.f425M
            if (r2 != r9) goto L_0x008c
            goto L_0x00b5
        L_0x008c:
            int r3 = r3 + 1
            int r2 = r1.f446ag
            if (r2 == r11) goto L_0x00b2
            int r2 = r1.mo129a()
            int r5 = r5 + r2
            android.support.constraint.a.a.b r2 = r1.f455j
            android.support.constraint.a.a.b r7 = r2.f405b
            if (r7 == 0) goto L_0x00a2
            int r2 = r2.mo123a()
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            int r5 = r5 + r2
            android.support.constraint.a.a.b r2 = r1.f457l
            android.support.constraint.a.a.b r7 = r2.f405b
            if (r7 == 0) goto L_0x00af
            int r2 = r2.mo123a()
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            int r5 = r5 + r2
            goto L_0x00b5
        L_0x00b2:
            float r2 = r1.f442ac
            float r4 = r4 + r2
        L_0x00b5:
            android.support.constraint.a.a.b r2 = r1.f457l
            android.support.constraint.a.a.b r2 = r2.f405b
            if (r2 == 0) goto L_0x00be
            android.support.constraint.a.a.c r2 = r2.f404a
            goto L_0x00c0
        L_0x00be:
            r2 = r18
        L_0x00c0:
            if (r2 == 0) goto L_0x00ce
            android.support.constraint.a.a.b r7 = r2.f455j
            android.support.constraint.a.a.b r7 = r7.f405b
            if (r7 == 0) goto L_0x00cc
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 == r1) goto L_0x00ce
        L_0x00cc:
            r2 = r18
        L_0x00ce:
            r29 = r2
            r2 = r1
            r1 = r29
            goto L_0x0085
        L_0x00d4:
            if (r2 == 0) goto L_0x00ee
            android.support.constraint.a.a.b r1 = r2.f457l
            android.support.constraint.a.a.b r1 = r1.f405b
            if (r1 == 0) goto L_0x00e1
            android.support.constraint.a.a.c r2 = r1.f404a
            int r2 = r2.f468w
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            if (r1 == 0) goto L_0x00ef
            android.support.constraint.a.a.c r1 = r1.f404a
            if (r1 != r6) goto L_0x00ef
            int r1 = r6.f469x
            int r2 = r6.f465t
            int r2 = r2 + r1
            goto L_0x00ef
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            float r1 = (float) r2
            float r2 = (float) r5
            float r1 = r1 - r2
            int r3 = r3 + 1
            float r2 = (float) r3
            float r2 = r1 / r2
            if (r0 != 0) goto L_0x00fb
            r3 = r2
            goto L_0x0100
        L_0x00fb:
            float r2 = (float) r0
            float r2 = r1 / r2
            r3 = r2
            r2 = 0
        L_0x0100:
            if (r12 == 0) goto L_0x0023
            android.support.constraint.a.a.b r5 = r12.f455j
            android.support.constraint.a.a.b r7 = r5.f405b
            if (r7 == 0) goto L_0x010d
            int r5 = r5.mo123a()
            goto L_0x010e
        L_0x010d:
            r5 = 0
        L_0x010e:
            android.support.constraint.a.a.b r7 = r12.f457l
            android.support.constraint.a.a.b r8 = r7.f405b
            if (r8 == 0) goto L_0x0119
            int r7 = r7.mo123a()
            goto L_0x011a
        L_0x0119:
            r7 = 0
        L_0x011a:
            int r8 = r12.f425M
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r8 == r9) goto L_0x0159
            float r5 = (float) r5
            float r2 = r2 + r5
            android.support.constraint.a.a.b r8 = r12.f455j
            android.support.constraint.a.g r8 = r8.f409f
            float r9 = r2 + r16
            int r9 = (int) r9
            r15.mo175h(r8, r9)
            int r8 = r12.f446ag
            if (r8 != r11) goto L_0x0143
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0139
            float r5 = r3 - r5
            float r8 = (float) r7
            float r5 = r5 - r8
            goto L_0x0148
        L_0x0139:
            float r8 = r12.f442ac
            float r8 = r8 * r1
            float r8 = r8 / r4
            float r8 = r8 - r5
            float r5 = (float) r7
            float r8 = r8 - r5
            float r2 = r2 + r8
            goto L_0x0149
        L_0x0143:
            int r5 = r12.mo129a()
            float r5 = (float) r5
        L_0x0148:
            float r2 = r2 + r5
        L_0x0149:
            android.support.constraint.a.a.b r5 = r12.f457l
            android.support.constraint.a.g r5 = r5.f409f
            float r8 = r2 + r16
            int r8 = (int) r8
            r15.mo175h(r5, r8)
            if (r0 != 0) goto L_0x0156
            float r2 = r2 + r3
        L_0x0156:
            float r5 = (float) r7
            float r2 = r2 + r5
            goto L_0x0170
        L_0x0159:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r5
            float r5 = r2 - r5
            float r5 = r5 + r16
            int r5 = (int) r5
            android.support.constraint.a.a.b r7 = r12.f455j
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo175h(r7, r5)
            android.support.constraint.a.a.b r7 = r12.f457l
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo175h(r7, r5)
        L_0x0170:
            android.support.constraint.a.a.b r5 = r12.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x0179
            android.support.constraint.a.a.c r5 = r5.f404a
            goto L_0x017b
        L_0x0179:
            r5 = r18
        L_0x017b:
            if (r5 == 0) goto L_0x018a
            android.support.constraint.a.a.b r7 = r5.f455j
            android.support.constraint.a.a.b r7 = r7.f405b
            if (r7 == 0) goto L_0x018a
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 == r12) goto L_0x018a
            r12 = r18
            goto L_0x018b
        L_0x018a:
            r12 = r5
        L_0x018b:
            if (r12 != r6) goto L_0x018f
            r12 = r18
        L_0x018f:
            r9 = 8
            goto L_0x0100
        L_0x0193:
            if (r0 == 0) goto L_0x03d2
            if (r17 == 0) goto L_0x019d
            r0 = r1
            r2 = r18
            r3 = r2
            goto L_0x03d7
        L_0x019d:
            r3 = r18
        L_0x019f:
            if (r1 == 0) goto L_0x023b
            int r5 = r1.f446ag
            if (r5 == r11) goto L_0x01f9
            android.support.constraint.a.a.b r5 = r1.f455j
            int r5 = r5.mo123a()
            if (r3 == 0) goto L_0x01b4
            android.support.constraint.a.a.b r3 = r3.f457l
            int r3 = r3.mo123a()
            int r5 = r5 + r3
        L_0x01b4:
            android.support.constraint.a.a.b r3 = r1.f455j
            android.support.constraint.a.a.b r7 = r3.f405b
            android.support.constraint.a.a.c r8 = r7.f404a
            int r8 = r8.f446ag
            if (r8 != r11) goto L_0x01c0
            r8 = 2
            goto L_0x01c1
        L_0x01c0:
            r8 = 3
        L_0x01c1:
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo176i(r3, r7, r5, r8)
            android.support.constraint.a.a.b r3 = r1.f457l
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r5 = r1.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.a.c r5 = r5.f404a
            android.support.constraint.a.a.b r5 = r5.f455j
            android.support.constraint.a.a.b r7 = r5.f405b
            if (r7 == 0) goto L_0x01e3
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r7 != r1) goto L_0x01e3
            int r5 = r5.mo123a()
            int r3 = r3 + r5
        L_0x01e3:
            android.support.constraint.a.a.b r5 = r1.f457l
            android.support.constraint.a.a.b r7 = r5.f405b
            android.support.constraint.a.a.c r8 = r7.f404a
            int r8 = r8.f446ag
            if (r8 != r11) goto L_0x01ef
            r8 = 2
            goto L_0x01f0
        L_0x01ef:
            r8 = 3
        L_0x01f0:
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.g r7 = r7.f409f
            int r3 = -r3
            r15.mo177j(r5, r7, r3, r8)
            goto L_0x0232
        L_0x01f9:
            float r3 = r1.f442ac
            float r10 = r10 + r3
            android.support.constraint.a.a.b r3 = r1.f457l
            android.support.constraint.a.a.b r5 = r3.f405b
            if (r5 == 0) goto L_0x021a
            int r3 = r3.mo123a()
            android.support.constraint.a.a.c[] r5 = r6.f485av
            r5 = r5[r11]
            if (r1 == r5) goto L_0x021b
            android.support.constraint.a.a.b r5 = r1.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.a.c r5 = r5.f404a
            android.support.constraint.a.a.b r5 = r5.f455j
            int r5 = r5.mo123a()
            int r3 = r3 + r5
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            android.support.constraint.a.a.b r5 = r1.f457l
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.a.b r7 = r1.f455j
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo176i(r5, r7, r14, r4)
            android.support.constraint.a.a.b r5 = r1.f457l
            android.support.constraint.a.g r7 = r5.f409f
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
            int r3 = -r3
            r15.mo177j(r7, r5, r3, r4)
        L_0x0232:
            android.support.constraint.a.a.c r3 = r1.f444ae
            r29 = r3
            r3 = r1
            r1 = r29
            goto L_0x019f
        L_0x023b:
            if (r0 != r4) goto L_0x02b4
            android.support.constraint.a.a.c[] r0 = r6.f481ar
            r0 = r0[r14]
            android.support.constraint.a.a.b r1 = r0.f455j
            int r1 = r1.mo123a()
            android.support.constraint.a.a.b r3 = r0.f455j
            android.support.constraint.a.a.b r3 = r3.f405b
            if (r3 == 0) goto L_0x0252
            int r3 = r3.mo123a()
            int r1 = r1 + r3
        L_0x0252:
            android.support.constraint.a.a.b r3 = r0.f457l
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r5 = r0.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x0263
            int r5 = r5.mo123a()
            int r3 = r3 + r5
        L_0x0263:
            android.support.constraint.a.a.b r5 = r12.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
            android.support.constraint.a.a.c[] r7 = r6.f485av
            r8 = r7[r11]
            if (r0 != r8) goto L_0x0277
            r5 = r7[r4]
            android.support.constraint.a.a.b r5 = r5.f457l
            android.support.constraint.a.a.b r5 = r5.f405b
            android.support.constraint.a.g r5 = r5.f409f
        L_0x0277:
            int r7 = r0.f449d
            if (r7 != r4) goto L_0x029f
            android.support.constraint.a.a.b r0 = r12.f455j
            android.support.constraint.a.g r7 = r0.f409f
            android.support.constraint.a.a.b r0 = r0.f405b
            android.support.constraint.a.g r0 = r0.f409f
            r15.mo176i(r7, r0, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f457l
            android.support.constraint.a.g r0 = r0.f409f
            int r1 = -r3
            r15.mo177j(r0, r5, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f457l
            android.support.constraint.a.g r0 = r0.f409f
            android.support.constraint.a.a.b r1 = r12.f455j
            android.support.constraint.a.g r1 = r1.f409f
            int r3 = r12.mo129a()
            r15.mo181n(r0, r1, r3, r2)
            goto L_0x0023
        L_0x029f:
            android.support.constraint.a.a.b r2 = r0.f455j
            android.support.constraint.a.g r7 = r2.f409f
            android.support.constraint.a.a.b r2 = r2.f405b
            android.support.constraint.a.g r2 = r2.f409f
            r15.mo181n(r7, r2, r1, r4)
            android.support.constraint.a.a.b r0 = r0.f457l
            android.support.constraint.a.g r0 = r0.f409f
            int r1 = -r3
            r15.mo181n(r0, r5, r1, r4)
            goto L_0x0023
        L_0x02b4:
            r1 = 0
        L_0x02b5:
            int r3 = r0 + -1
            if (r1 >= r3) goto L_0x0023
            android.support.constraint.a.a.c[] r5 = r6.f481ar
            r7 = r5[r1]
            int r1 = r1 + 1
            r5 = r5[r1]
            android.support.constraint.a.a.b r8 = r7.f455j
            android.support.constraint.a.g r9 = r8.f409f
            android.support.constraint.a.a.b r14 = r7.f457l
            android.support.constraint.a.g r14 = r14.f409f
            android.support.constraint.a.a.b r2 = r5.f455j
            android.support.constraint.a.g r2 = r2.f409f
            android.support.constraint.a.a.b r4 = r5.f457l
            android.support.constraint.a.g r4 = r4.f409f
            r28 = r0
            android.support.constraint.a.a.c[] r0 = r6.f485av
            r16 = r4
            r4 = r0[r11]
            if (r5 != r4) goto L_0x02e3
            r4 = 1
            r0 = r0[r4]
            android.support.constraint.a.a.b r0 = r0.f457l
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x02e5
        L_0x02e3:
            r0 = r16
        L_0x02e5:
            int r4 = r8.mo123a()
            android.support.constraint.a.a.b r8 = r7.f455j
            android.support.constraint.a.a.b r8 = r8.f405b
            if (r8 == 0) goto L_0x0300
            android.support.constraint.a.a.c r8 = r8.f404a
            android.support.constraint.a.a.b r8 = r8.f457l
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0300
            android.support.constraint.a.a.c r11 = r11.f404a
            if (r11 != r7) goto L_0x0300
            int r8 = r8.mo123a()
            int r4 = r4 + r8
        L_0x0300:
            android.support.constraint.a.a.b r8 = r7.f455j
            android.support.constraint.a.a.b r8 = r8.f405b
            android.support.constraint.a.g r8 = r8.f409f
            r11 = 2
            r15.mo176i(r9, r8, r4, r11)
            android.support.constraint.a.a.b r4 = r7.f457l
            int r4 = r4.mo123a()
            android.support.constraint.a.a.b r8 = r7.f457l
            android.support.constraint.a.a.b r8 = r8.f405b
            if (r8 == 0) goto L_0x0327
            android.support.constraint.a.a.c r8 = r7.f444ae
            if (r8 == 0) goto L_0x0327
            android.support.constraint.a.a.b r8 = r8.f455j
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0325
            int r8 = r8.mo123a()
            goto L_0x0326
        L_0x0325:
            r8 = 0
        L_0x0326:
            int r4 = r4 + r8
        L_0x0327:
            android.support.constraint.a.a.b r8 = r7.f457l
            android.support.constraint.a.a.b r8 = r8.f405b
            android.support.constraint.a.g r8 = r8.f409f
            int r4 = -r4
            r11 = 2
            r15.mo177j(r14, r8, r4, r11)
            if (r1 != r3) goto L_0x038c
            android.support.constraint.a.a.b r3 = r5.f455j
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r4 = r5.f455j
            android.support.constraint.a.a.b r4 = r4.f405b
            if (r4 == 0) goto L_0x0351
            android.support.constraint.a.a.c r4 = r4.f404a
            android.support.constraint.a.a.b r4 = r4.f457l
            android.support.constraint.a.a.b r8 = r4.f405b
            if (r8 == 0) goto L_0x0351
            android.support.constraint.a.a.c r8 = r8.f404a
            if (r8 != r5) goto L_0x0351
            int r4 = r4.mo123a()
            int r3 = r3 + r4
        L_0x0351:
            android.support.constraint.a.a.b r4 = r5.f455j
            android.support.constraint.a.a.b r4 = r4.f405b
            android.support.constraint.a.g r4 = r4.f409f
            r8 = 2
            r15.mo176i(r2, r4, r3, r8)
            android.support.constraint.a.a.b r3 = r5.f457l
            android.support.constraint.a.a.c[] r4 = r6.f485av
            r8 = 3
            r11 = r4[r8]
            if (r5 != r11) goto L_0x0369
            r8 = 1
            r3 = r4[r8]
            android.support.constraint.a.a.b r3 = r3.f457l
        L_0x0369:
            int r4 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 == 0) goto L_0x0382
            android.support.constraint.a.a.c r8 = r8.f404a
            android.support.constraint.a.a.b r8 = r8.f455j
            android.support.constraint.a.a.b r11 = r8.f405b
            if (r11 == 0) goto L_0x0382
            android.support.constraint.a.a.c r11 = r11.f404a
            if (r11 != r5) goto L_0x0382
            int r8 = r8.mo123a()
            int r4 = r4 + r8
        L_0x0382:
            android.support.constraint.a.a.b r3 = r3.f405b
            android.support.constraint.a.g r3 = r3.f409f
            int r4 = -r4
            r8 = 2
            r15.mo177j(r0, r3, r4, r8)
            goto L_0x038d
        L_0x038c:
            r8 = 2
        L_0x038d:
            int r3 = r12.f453h
            if (r3 <= 0) goto L_0x0394
            r15.mo177j(r14, r9, r3, r8)
        L_0x0394:
            android.support.constraint.a.b r3 = r31.mo170a()
            float r4 = r7.f442ac
            float r11 = r5.f442ac
            android.support.constraint.a.a.b r8 = r7.f455j
            int r21 = r8.mo123a()
            android.support.constraint.a.a.b r7 = r7.f457l
            int r23 = r7.mo123a()
            android.support.constraint.a.a.b r7 = r5.f455j
            int r25 = r7.mo123a()
            android.support.constraint.a.a.b r5 = r5.f457l
            int r27 = r5.mo123a()
            r16 = r3
            r17 = r4
            r18 = r10
            r19 = r11
            r20 = r9
            r22 = r14
            r24 = r2
            r26 = r0
            r16.mo162e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15.mo174g(r3)
            r0 = r28
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x02b5
        L_0x03d2:
            r0 = r1
            r2 = r18
            r3 = r2
            r14 = 0
        L_0x03d7:
            if (r0 == 0) goto L_0x0534
            android.support.constraint.a.a.c r4 = r0.f444ae
            if (r4 != 0) goto L_0x03e4
            android.support.constraint.a.a.c[] r2 = r6.f485av
            r5 = 1
            r2 = r2[r5]
            r5 = 1
            goto L_0x03e5
        L_0x03e4:
            r5 = r14
        L_0x03e5:
            if (r17 == 0) goto L_0x0456
            android.support.constraint.a.a.b r7 = r0.f455j
            int r8 = r7.mo123a()
            if (r3 == 0) goto L_0x03f6
            android.support.constraint.a.a.b r3 = r3.f457l
            int r3 = r3.mo123a()
            int r8 = r8 + r3
        L_0x03f6:
            if (r1 == r0) goto L_0x03fa
            r3 = 3
            goto L_0x03fb
        L_0x03fa:
            r3 = 1
        L_0x03fb:
            android.support.constraint.a.a.b r9 = r7.f405b
            if (r9 == 0) goto L_0x0404
            android.support.constraint.a.g r10 = r7.f409f
            android.support.constraint.a.g r9 = r9.f409f
            goto L_0x041c
        L_0x0404:
            android.support.constraint.a.a.b r9 = r0.f458m
            android.support.constraint.a.a.b r10 = r9.f405b
            if (r10 == 0) goto L_0x0419
            android.support.constraint.a.g r9 = r9.f409f
            android.support.constraint.a.g r10 = r10.f409f
            int r11 = r7.mo123a()
            int r8 = r8 - r11
            r29 = r10
            r10 = r9
            r9 = r29
            goto L_0x041c
        L_0x0419:
            r9 = r18
            r10 = r9
        L_0x041c:
            if (r10 == 0) goto L_0x0423
            if (r9 == 0) goto L_0x0423
            r15.mo176i(r10, r9, r8, r3)
        L_0x0423:
            int r3 = r0.f446ag
            r11 = 3
            if (r3 != r11) goto L_0x04ad
            android.support.constraint.a.a.b r3 = r0.f457l
            int r8 = r0.f449d
            r9 = 1
            if (r8 != r9) goto L_0x0441
            int r8 = r0.f452g
            int r9 = r0.mo129a()
            int r8 = java.lang.Math.max(r8, r9)
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            r15.mo181n(r3, r7, r8, r11)
            goto L_0x04ad
        L_0x0441:
            android.support.constraint.a.g r8 = r7.f409f
            android.support.constraint.a.a.b r9 = r7.f405b
            android.support.constraint.a.g r9 = r9.f409f
            int r10 = r7.f406c
            r15.mo176i(r8, r9, r10, r11)
            android.support.constraint.a.g r3 = r3.f409f
            android.support.constraint.a.g r7 = r7.f409f
            int r8 = r0.f452g
            r15.mo177j(r3, r7, r8, r11)
            goto L_0x04ad
        L_0x0456:
            r11 = 3
            r7 = 5
            if (r16 != 0) goto L_0x0485
            if (r5 == 0) goto L_0x0485
            if (r3 == 0) goto L_0x0485
            android.support.constraint.a.a.b r3 = r0.f457l
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 != 0) goto L_0x0472
            android.support.constraint.a.g r3 = r3.f409f
            int r7 = r0.f471z
            int r8 = r0.f416D
            int r7 = r7 + r8
            int r8 = r0.f414B
            int r7 = r7 + r8
            r15.mo175h(r3, r7)
            goto L_0x04ad
        L_0x0472:
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r0.f457l
            android.support.constraint.a.g r8 = r8.f409f
            android.support.constraint.a.a.b r9 = r2.f457l
            android.support.constraint.a.a.b r9 = r9.f405b
            android.support.constraint.a.g r9 = r9.f409f
            int r3 = -r3
            r15.mo181n(r8, r9, r3, r7)
            goto L_0x04ad
        L_0x0485:
            if (r16 != 0) goto L_0x04b5
            if (r5 != 0) goto L_0x04b5
            if (r3 != 0) goto L_0x04b5
            android.support.constraint.a.a.b r3 = r0.f455j
            android.support.constraint.a.a.b r8 = r3.f405b
            if (r8 != 0) goto L_0x049c
            android.support.constraint.a.g r3 = r3.f409f
            int r7 = r0.f471z
            int r8 = r0.f416D
            int r7 = r7 + r8
            r15.mo175h(r3, r7)
            goto L_0x04ad
        L_0x049c:
            int r3 = r3.mo123a()
            android.support.constraint.a.a.b r8 = r0.f455j
            android.support.constraint.a.g r8 = r8.f409f
            android.support.constraint.a.a.b r9 = r12.f455j
            android.support.constraint.a.a.b r9 = r9.f405b
            android.support.constraint.a.g r9 = r9.f409f
            r15.mo181n(r8, r9, r3, r7)
        L_0x04ad:
            r19 = r0
        L_0x04af:
            r3 = r12
            r0 = r13
            r6 = 0
        L_0x04b2:
            r7 = 1
            goto L_0x0526
        L_0x04b5:
            android.support.constraint.a.a.b r7 = r0.f455j
            android.support.constraint.a.a.b r8 = r0.f457l
            int r10 = r7.mo123a()
            int r14 = r8.mo123a()
            android.support.constraint.a.g r9 = r7.f409f
            android.support.constraint.a.a.b r11 = r7.f405b
            android.support.constraint.a.g r11 = r11.f409f
            r19 = r0
            r0 = 1
            r15.mo176i(r9, r11, r10, r0)
            android.support.constraint.a.g r9 = r8.f409f
            android.support.constraint.a.a.b r11 = r8.f405b
            android.support.constraint.a.g r11 = r11.f409f
            int r6 = -r14
            r15.mo177j(r9, r11, r6, r0)
            android.support.constraint.a.a.b r0 = r7.f405b
            if (r0 == 0) goto L_0x04de
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x04e0
        L_0x04de:
            r0 = r18
        L_0x04e0:
            if (r3 != 0) goto L_0x04ee
            android.support.constraint.a.a.b r0 = r12.f455j
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x04eb
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x04ee
        L_0x04eb:
            r9 = r18
            goto L_0x04ef
        L_0x04ee:
            r9 = r0
        L_0x04ef:
            if (r4 != 0) goto L_0x04fc
            android.support.constraint.a.a.b r0 = r2.f457l
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x04fa
            android.support.constraint.a.a.c r4 = r0.f404a
            goto L_0x04fc
        L_0x04fa:
            r4 = r18
        L_0x04fc:
            if (r4 == 0) goto L_0x04af
            android.support.constraint.a.a.b r0 = r4.f455j
            android.support.constraint.a.g r0 = r0.f409f
            if (r5 == 0) goto L_0x050f
            android.support.constraint.a.a.b r0 = r2.f457l
            android.support.constraint.a.a.b r0 = r0.f405b
            if (r0 == 0) goto L_0x050d
            android.support.constraint.a.g r0 = r0.f409f
            goto L_0x050f
        L_0x050d:
            r0 = r18
        L_0x050f:
            if (r9 == 0) goto L_0x04af
            if (r0 == 0) goto L_0x04af
            android.support.constraint.a.g r3 = r7.f409f
            r11 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.a.g r6 = r8.f409f
            r7 = r31
            r8 = r3
            r3 = 3
            r3 = r12
            r12 = r0
            r0 = r13
            r13 = r6
            r6 = 0
            r7.mo180m(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x04b2
        L_0x0526:
            if (r7 != r5) goto L_0x052a
            r4 = r18
        L_0x052a:
            r6 = r30
            r13 = r0
            r12 = r3
            r0 = r4
            r14 = r5
            r3 = r19
            goto L_0x03d7
        L_0x0534:
            r3 = r12
            r0 = r13
            r6 = 0
            if (r17 == 0) goto L_0x0573
            android.support.constraint.a.a.b r1 = r1.f455j
            android.support.constraint.a.a.b r4 = r2.f457l
            int r10 = r1.mo123a()
            int r14 = r4.mo123a()
            android.support.constraint.a.a.b r5 = r3.f455j
            android.support.constraint.a.a.b r5 = r5.f405b
            if (r5 == 0) goto L_0x054f
            android.support.constraint.a.g r5 = r5.f409f
            r9 = r5
            goto L_0x0551
        L_0x054f:
            r9 = r18
        L_0x0551:
            android.support.constraint.a.a.b r2 = r2.f457l
            android.support.constraint.a.a.b r2 = r2.f405b
            if (r2 == 0) goto L_0x055b
            android.support.constraint.a.g r2 = r2.f409f
            r12 = r2
            goto L_0x055d
        L_0x055b:
            r12 = r18
        L_0x055d:
            if (r9 == 0) goto L_0x0573
            if (r12 == 0) goto L_0x0573
            android.support.constraint.a.g r2 = r4.f409f
            int r5 = -r14
            r7 = 1
            r15.mo177j(r2, r12, r5, r7)
            android.support.constraint.a.g r8 = r1.f409f
            float r11 = r3.f423K
            android.support.constraint.a.g r13 = r4.f409f
            r7 = r31
            r7.mo180m(r8, r9, r10, r11, r12, r13, r14)
        L_0x0573:
            int r13 = r0 + 1
            r14 = 0
            r6 = r30
            goto L_0x0006
        L_0x057a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0134d.m184D(android.support.constraint.a.e):void");
    }

    /* renamed from: e */
    public final void mo133e() {
        this.f472ah.mo179l();
        super.mo133e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r12 != -1) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo153x(android.support.constraint.p029a.p030a.C0133c r11, boolean[] r12) {
        /*
            r10 = this;
            int r0 = r11.f445af
            r1 = 0
            r2 = 0
            r3 = 3
            if (r0 != r3) goto L_0x0015
            int r0 = r11.f446ag
            if (r0 != r3) goto L_0x0015
            float r0 = r11.f466u
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r12[r2] = r2
            return
        L_0x0015:
            int r0 = r11.mo131c()
            int r4 = r11.f445af
            if (r4 != r3) goto L_0x002b
            int r4 = r11.f446ag
            if (r4 == r3) goto L_0x002b
            float r4 = r11.f466u
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r12[r2] = r2
            return
        L_0x002b:
            r1 = 1
            r11.f434V = r1
            boolean r4 = r11 instanceof android.support.constraint.p029a.p030a.C0135e
            if (r4 == 0) goto L_0x004b
            r12 = r11
            android.support.constraint.a.a.e r12 = (android.support.constraint.p029a.p030a.C0135e) r12
            int r3 = r12.f489ak
            if (r3 != r1) goto L_0x0046
            int r0 = r12.f487ai
            r1 = -1
            if (r0 == r1) goto L_0x0041
            r2 = r0
        L_0x003f:
            r12 = 0
            goto L_0x0048
        L_0x0041:
            int r12 = r12.f488aj
            if (r12 == r1) goto L_0x003f
            goto L_0x0048
        L_0x0046:
            r12 = r0
            r2 = r12
        L_0x0048:
            r0 = r12
            goto L_0x0151
        L_0x004b:
            android.support.constraint.a.a.b r4 = r11.f456k
            boolean r4 = r4.mo125c()
            if (r4 != 0) goto L_0x0061
            android.support.constraint.a.a.b r4 = r11.f454i
            boolean r4 = r4.mo125c()
            if (r4 != 0) goto L_0x0061
            int r12 = r11.f468w
            int r2 = r0 + r12
            goto L_0x0151
        L_0x0061:
            android.support.constraint.a.a.b r4 = r11.f456k
            android.support.constraint.a.a.b r5 = r4.f405b
            if (r5 == 0) goto L_0x007d
            android.support.constraint.a.a.b r6 = r11.f454i
            android.support.constraint.a.a.b r6 = r6.f405b
            if (r6 == 0) goto L_0x007d
            if (r5 == r6) goto L_0x007a
            android.support.constraint.a.a.c r7 = r5.f404a
            android.support.constraint.a.a.c r6 = r6.f404a
            if (r7 != r6) goto L_0x007d
            android.support.constraint.a.a.c r6 = r11.f463r
            if (r7 != r6) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r12[r2] = r2
            return
        L_0x007d:
            r6 = 0
            if (r5 == 0) goto L_0x0095
            android.support.constraint.a.a.c r5 = r5.f404a
            int r4 = r4.mo123a()
            int r4 = r4 + r0
            boolean r7 = r5.mo144p()
            if (r7 != 0) goto L_0x0097
            boolean r7 = r5.f434V
            if (r7 != 0) goto L_0x0097
            r10.mo153x(r5, r12)
            goto L_0x0097
        L_0x0095:
            r4 = r0
            r5 = r6
        L_0x0097:
            android.support.constraint.a.a.b r7 = r11.f454i
            android.support.constraint.a.a.b r8 = r7.f405b
            if (r8 == 0) goto L_0x00b1
            android.support.constraint.a.a.c r6 = r8.f404a
            int r7 = r7.mo123a()
            int r0 = r0 + r7
            boolean r7 = r6.mo144p()
            if (r7 != 0) goto L_0x00b1
            boolean r7 = r6.f434V
            if (r7 != 0) goto L_0x00b1
            r10.mo153x(r6, r12)
        L_0x00b1:
            android.support.constraint.a.a.b r12 = r11.f456k
            android.support.constraint.a.a.b r12 = r12.f405b
            r7 = 2
            r8 = 4
            if (r12 == 0) goto L_0x0101
            boolean r12 = r5.mo144p()
            if (r12 != 0) goto L_0x0101
            android.support.constraint.a.a.b r12 = r11.f456k
            android.support.constraint.a.a.b r12 = r12.f405b
            int r12 = r12.f410g
            if (r12 != r8) goto L_0x00d0
            int r12 = r5.f428P
            int r9 = r5.mo131c()
            int r12 = r12 - r9
        L_0x00ce:
            int r4 = r4 + r12
            goto L_0x00d5
        L_0x00d0:
            if (r12 != r7) goto L_0x00d5
            int r12 = r5.f428P
            goto L_0x00ce
        L_0x00d5:
            boolean r12 = r5.f431S
            if (r12 != 0) goto L_0x00ec
            android.support.constraint.a.a.b r12 = r5.f454i
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x00ea
            android.support.constraint.a.a.b r12 = r5.f456k
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x00ea
            int r12 = r5.f445af
            if (r12 == r3) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r12 = 0
            goto L_0x00ed
        L_0x00ec:
            r12 = 1
        L_0x00ed:
            r11.f431S = r12
            if (r12 == 0) goto L_0x0101
            android.support.constraint.a.a.b r12 = r5.f454i
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 != 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x0101
        L_0x00fc:
            int r12 = r5.f428P
            int r12 = r4 - r12
            int r4 = r4 + r12
        L_0x0101:
            android.support.constraint.a.a.b r12 = r11.f454i
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x014f
            boolean r12 = r6.mo144p()
            if (r12 != 0) goto L_0x014f
            android.support.constraint.a.a.b r12 = r11.f454i
            android.support.constraint.a.a.b r12 = r12.f405b
            int r12 = r12.f410g
            if (r12 != r7) goto L_0x011e
            int r12 = r6.f427O
            int r5 = r6.mo131c()
            int r12 = r12 - r5
        L_0x011c:
            int r0 = r0 + r12
            goto L_0x0123
        L_0x011e:
            if (r12 != r8) goto L_0x0123
            int r12 = r6.f427O
            goto L_0x011c
        L_0x0123:
            boolean r12 = r6.f430R
            if (r12 != 0) goto L_0x0137
            android.support.constraint.a.a.b r12 = r6.f454i
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x0138
            android.support.constraint.a.a.b r12 = r6.f456k
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x0138
            int r12 = r6.f445af
            if (r12 == r3) goto L_0x0138
        L_0x0137:
            r2 = 1
        L_0x0138:
            r11.f430R = r2
            if (r2 == 0) goto L_0x014f
            android.support.constraint.a.a.b r12 = r6.f456k
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 != 0) goto L_0x0143
            goto L_0x0148
        L_0x0143:
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 != r11) goto L_0x0148
            goto L_0x014f
        L_0x0148:
            int r12 = r6.f427O
            int r12 = r0 - r12
            int r2 = r0 + r12
            goto L_0x0150
        L_0x014f:
            r2 = r0
        L_0x0150:
            r0 = r4
        L_0x0151:
            int r12 = r11.f425M
            r1 = 8
            if (r12 != r1) goto L_0x015b
            int r12 = r11.f464s
            int r2 = r2 - r12
            int r0 = r0 - r12
        L_0x015b:
            r11.f427O = r2
            r11.f428P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0134d.mo153x(android.support.constraint.a.a.c, boolean[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010f, code lost:
        r12 = r7.f455j.f405b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0119, code lost:
        r12 = r7.f457l.f405b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012a  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154y(android.support.constraint.p029a.p030a.C0133c r11, boolean[] r12) {
        /*
            r10 = this;
            int r0 = r11.f446ag
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L_0x0015
            int r0 = r11.f445af
            if (r0 == r2) goto L_0x0015
            float r0 = r11.f466u
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r12[r1] = r1
            return
        L_0x0015:
            int r0 = r11.mo130b()
            r3 = 1
            r11.f435W = r3
            boolean r4 = r11 instanceof android.support.constraint.p029a.p030a.C0135e
            r5 = 8
            if (r4 == 0) goto L_0x003b
            r12 = r11
            android.support.constraint.a.a.e r12 = (android.support.constraint.p029a.p030a.C0135e) r12
            int r2 = r12.f489ak
            if (r2 != 0) goto L_0x0036
            int r0 = r12.f487ai
            r2 = -1
            if (r0 == r2) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            int r12 = r12.f488aj
            if (r12 == r2) goto L_0x0034
            r1 = r12
        L_0x0034:
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r1 = r0
        L_0x0037:
            r4 = r0
            r0 = r1
            goto L_0x0193
        L_0x003b:
            android.support.constraint.a.a.b r4 = r11.f458m
            android.support.constraint.a.a.b r6 = r4.f405b
            if (r6 != 0) goto L_0x0053
            android.support.constraint.a.a.b r6 = r11.f455j
            android.support.constraint.a.a.b r6 = r6.f405b
            if (r6 != 0) goto L_0x0053
            android.support.constraint.a.a.b r6 = r11.f457l
            android.support.constraint.a.a.b r6 = r6.f405b
            if (r6 != 0) goto L_0x0053
            int r12 = r11.f469x
            int r12 = r12 + r0
            r4 = r12
            goto L_0x0193
        L_0x0053:
            android.support.constraint.a.a.b r6 = r11.f457l
            android.support.constraint.a.a.b r6 = r6.f405b
            if (r6 == 0) goto L_0x006f
            android.support.constraint.a.a.b r7 = r11.f455j
            android.support.constraint.a.a.b r7 = r7.f405b
            if (r7 == 0) goto L_0x006f
            if (r6 == r7) goto L_0x006c
            android.support.constraint.a.a.c r6 = r6.f404a
            android.support.constraint.a.a.c r7 = r7.f404a
            if (r6 != r7) goto L_0x006f
            android.support.constraint.a.a.c r7 = r11.f463r
            if (r6 != r7) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r12[r1] = r1
            return
        L_0x006f:
            boolean r4 = r4.mo125c()
            if (r4 == 0) goto L_0x00a3
            android.support.constraint.a.a.b r1 = r11.f458m
            android.support.constraint.a.a.b r1 = r1.f405b
            android.support.constraint.a.a.c r1 = r1.f404a
            boolean r2 = r1.f435W
            if (r2 != 0) goto L_0x0082
            r10.mo154y(r1, r12)
        L_0x0082:
            int r12 = r1.f426N
            int r2 = r1.f465t
            int r12 = r12 - r2
            int r12 = r12 + r0
            int r12 = java.lang.Math.max(r12, r0)
            int r2 = r1.f429Q
            int r1 = r1.f465t
            int r2 = r2 - r1
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = r11.f425M
            if (r1 != r5) goto L_0x009e
            int r1 = r11.f465t
            int r12 = r12 - r1
            int r0 = r0 - r1
        L_0x009e:
            r11.f426N = r12
            r11.f429Q = r0
            return
        L_0x00a3:
            android.support.constraint.a.a.b r4 = r11.f455j
            boolean r4 = r4.mo125c()
            r6 = 0
            if (r4 == 0) goto L_0x00c5
            android.support.constraint.a.a.b r4 = r11.f455j
            android.support.constraint.a.a.b r7 = r4.f405b
            android.support.constraint.a.a.c r7 = r7.f404a
            int r4 = r4.mo123a()
            int r4 = r4 + r0
            boolean r8 = r7.mo144p()
            if (r8 != 0) goto L_0x00c7
            boolean r8 = r7.f435W
            if (r8 != 0) goto L_0x00c7
            r10.mo154y(r7, r12)
            goto L_0x00c7
        L_0x00c5:
            r4 = r0
            r7 = r6
        L_0x00c7:
            android.support.constraint.a.a.b r8 = r11.f457l
            boolean r8 = r8.mo125c()
            if (r8 == 0) goto L_0x00e8
            android.support.constraint.a.a.b r6 = r11.f457l
            android.support.constraint.a.a.b r8 = r6.f405b
            android.support.constraint.a.a.c r8 = r8.f404a
            int r6 = r6.mo123a()
            int r0 = r0 + r6
            boolean r6 = r8.mo144p()
            if (r6 != 0) goto L_0x00e7
            boolean r6 = r8.f435W
            if (r6 != 0) goto L_0x00e7
            r10.mo154y(r8, r12)
        L_0x00e7:
            r6 = r8
        L_0x00e8:
            android.support.constraint.a.a.b r12 = r11.f455j
            android.support.constraint.a.a.b r12 = r12.f405b
            r8 = 5
            if (r12 == 0) goto L_0x013f
            boolean r12 = r7.mo144p()
            if (r12 != 0) goto L_0x013f
            android.support.constraint.a.a.b r12 = r11.f455j
            android.support.constraint.a.a.b r12 = r12.f405b
            int r12 = r12.f410g
            if (r12 != r2) goto L_0x0106
            int r12 = r7.f426N
            int r9 = r7.mo130b()
            int r12 = r12 - r9
        L_0x0104:
            int r4 = r4 + r12
            goto L_0x010b
        L_0x0106:
            if (r12 != r8) goto L_0x010b
            int r12 = r7.f426N
            goto L_0x0104
        L_0x010b:
            boolean r12 = r7.f432T
            if (r12 != 0) goto L_0x012a
            android.support.constraint.a.a.b r12 = r7.f455j
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x0128
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x0128
            android.support.constraint.a.a.b r12 = r7.f457l
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x0128
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x0128
            int r12 = r7.f446ag
            if (r12 == r2) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r12 = 0
            goto L_0x012b
        L_0x012a:
            r12 = 1
        L_0x012b:
            r11.f432T = r12
            if (r12 == 0) goto L_0x013f
            android.support.constraint.a.a.b r12 = r7.f457l
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 != 0) goto L_0x0136
            goto L_0x013a
        L_0x0136:
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x013f
        L_0x013a:
            int r12 = r7.f426N
            int r12 = r4 - r12
            int r4 = r4 + r12
        L_0x013f:
            android.support.constraint.a.a.b r12 = r11.f457l
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x0193
            boolean r12 = r6.mo144p()
            if (r12 != 0) goto L_0x0193
            android.support.constraint.a.a.b r12 = r11.f457l
            android.support.constraint.a.a.b r12 = r12.f405b
            int r12 = r12.f410g
            if (r12 != r8) goto L_0x015c
            int r12 = r6.f429Q
            int r7 = r6.mo130b()
            int r12 = r12 - r7
        L_0x015a:
            int r0 = r0 + r12
            goto L_0x0161
        L_0x015c:
            if (r12 != r2) goto L_0x0161
            int r12 = r6.f429Q
            goto L_0x015a
        L_0x0161:
            boolean r12 = r6.f433U
            if (r12 != 0) goto L_0x017d
            android.support.constraint.a.a.b r12 = r6.f455j
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x017e
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x017e
            android.support.constraint.a.a.b r12 = r6.f457l
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 == 0) goto L_0x017e
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 == r11) goto L_0x017e
            int r12 = r6.f446ag
            if (r12 == r2) goto L_0x017e
        L_0x017d:
            r1 = 1
        L_0x017e:
            r11.f433U = r1
            if (r1 == 0) goto L_0x0193
            android.support.constraint.a.a.b r12 = r6.f455j
            android.support.constraint.a.a.b r12 = r12.f405b
            if (r12 != 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            android.support.constraint.a.a.c r12 = r12.f404a
            if (r12 != r11) goto L_0x018e
            goto L_0x0193
        L_0x018e:
            int r12 = r6.f429Q
            int r12 = r0 - r12
            int r0 = r0 + r12
        L_0x0193:
            int r12 = r11.f425M
            if (r12 != r5) goto L_0x019b
            int r12 = r11.f465t
            int r4 = r4 - r12
            int r0 = r0 - r12
        L_0x019b:
            r11.f426N = r4
            r11.f429Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0134d.mo154y(android.support.constraint.a.a.c, boolean[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.support.constraint.a.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.support.constraint.a.a.d} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v72 */
    /* JADX WARNING: type inference failed for: r5v73 */
    /* JADX WARNING: type inference failed for: r5v84 */
    /* JADX WARNING: type inference failed for: r5v106 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d5, code lost:
        if (r1.f474aj > r6) goto L_0x01d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x054b A[Catch:{ Exception -> 0x093e }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08b2 A[Catch:{ Exception -> 0x093e }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x08b8 A[Catch:{ Exception -> 0x093e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0950 A[SYNTHETIC, Splitter:B:388:0x0950] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0a1e A[Catch:{ Exception -> 0x0a37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0a25 A[Catch:{ Exception -> 0x0a37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0a2b A[SYNTHETIC, Splitter:B:439:0x0a2b] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a58  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0aea  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0b46  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0b5b  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0b66  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0b79  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0b81  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0b87  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0bc5  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x08ba A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo155z() {
        /*
            r34 = this;
            r1 = r34
            int r2 = r1.f468w
            int r3 = r1.f469x
            int r4 = r34.mo132d()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            int r6 = r34.mo129a()
            int r6 = java.lang.Math.max(r5, r6)
            r1.f476al = r5
            r1.f477am = r5
            android.support.constraint.a.a.c r7 = r1.f463r
            r8 = 2
            if (r7 == 0) goto L_0x00a2
            android.support.constraint.a.a.g r7 = r1.f478ao
            if (r7 != 0) goto L_0x002b
            android.support.constraint.a.a.g r7 = new android.support.constraint.a.a.g
            r7.<init>(r1)
            r1.f478ao = r7
        L_0x002b:
            android.support.constraint.a.a.g r7 = r1.f478ao
            int r9 = r1.f468w
            r7.f496a = r9
            int r9 = r1.f469x
            r7.f497b = r9
            int r9 = r34.mo132d()
            r7.f498c = r9
            int r9 = r34.mo129a()
            r7.f499d = r9
            java.util.ArrayList r9 = r7.f500e
            int r9 = r9.size()
            r10 = 0
        L_0x0048:
            if (r10 >= r9) goto L_0x007f
            java.util.ArrayList r11 = r7.f500e
            java.lang.Object r11 = r11.get(r10)
            android.support.constraint.a.a.f r11 = (android.support.constraint.p029a.p030a.C0136f) r11
            android.support.constraint.a.a.b r12 = r11.f491a
            int r12 = r12.f410g
            android.support.constraint.a.a.b r12 = r1.mo145q(r12)
            r11.f491a = r12
            android.support.constraint.a.a.b r12 = r11.f491a
            if (r12 == 0) goto L_0x0073
            android.support.constraint.a.a.b r13 = r12.f405b
            r11.f492b = r13
            int r13 = r12.mo123a()
            r11.f493c = r13
            int r13 = r12.f411h
            r11.f495e = r13
            int r12 = r12.f408e
            r11.f494d = r12
            goto L_0x007c
        L_0x0073:
            r12 = 0
            r11.f492b = r12
            r11.f493c = r5
            r11.f495e = r8
            r11.f494d = r5
        L_0x007c:
            int r10 = r10 + 1
            goto L_0x0048
        L_0x007f:
            r1.f468w = r5
            r1.f469x = r5
            java.util.ArrayList r7 = r1.f462q
            int r7 = r7.size()
            r9 = 0
        L_0x008a:
            if (r9 >= r7) goto L_0x009a
            java.util.ArrayList r10 = r1.f462q
            java.lang.Object r10 = r10.get(r9)
            android.support.constraint.a.a.b r10 = (android.support.constraint.p029a.p030a.C0132b) r10
            r10.mo124b()
            int r9 = r9 + 1
            goto L_0x008a
        L_0x009a:
            android.support.constraint.a.e r7 = r1.f472ah
            android.support.constraint.a.c r7 = r7.f516e
            r1.mo134f(r7)
            goto L_0x00a6
        L_0x00a2:
            r1.f468w = r5
            r1.f469x = r5
        L_0x00a6:
            int r7 = r1.f446ag
            int r9 = r1.f445af
            int r10 = r1.f475ak
            r13 = 1
            if (r10 != r8) goto L_0x021b
            if (r7 == r8) goto L_0x00b4
            if (r9 != r8) goto L_0x021c
            r9 = 2
        L_0x00b4:
            java.util.ArrayList r10 = r1.f501an
            boolean[] r14 = r1.f484au
            int r15 = r10.size()
            r14[r5] = r13
            r8 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x00ca:
            if (r13 >= r15) goto L_0x0181
            java.lang.Object r23 = r10.get(r13)
            r12 = r23
            android.support.constraint.a.a.c r12 = (android.support.constraint.p029a.p030a.C0133c) r12
            boolean r23 = r12.mo144p()
            if (r23 == 0) goto L_0x00e0
            r24 = r9
            r25 = r14
            goto L_0x0178
        L_0x00e0:
            boolean r11 = r12.f434V
            if (r11 != 0) goto L_0x00e7
            r1.mo153x(r12, r14)
        L_0x00e7:
            boolean r11 = r12.f435W
            if (r11 != 0) goto L_0x00ee
            r1.mo154y(r12, r14)
        L_0x00ee:
            boolean r11 = r14[r5]
            if (r11 != 0) goto L_0x00f6
            r24 = r9
            goto L_0x01c6
        L_0x00f6:
            int r11 = r12.f427O
            int r5 = r12.f428P
            int r11 = r11 + r5
            int r5 = r12.mo132d()
            int r11 = r11 - r5
            int r5 = r12.f426N
            r24 = r9
            int r9 = r12.f429Q
            int r5 = r5 + r9
            int r9 = r12.mo129a()
            int r5 = r5 - r9
            int r9 = r12.f445af
            r25 = r5
            r5 = 4
            if (r9 != r5) goto L_0x0122
            int r9 = r12.mo132d()
            android.support.constraint.a.a.b r11 = r12.f454i
            int r11 = r11.f406c
            int r9 = r9 + r11
            android.support.constraint.a.a.b r11 = r12.f456k
            int r11 = r11.f406c
            int r9 = r9 + r11
            goto L_0x0123
        L_0x0122:
            r9 = r11
        L_0x0123:
            int r11 = r12.f446ag
            if (r11 != r5) goto L_0x0136
            int r5 = r12.mo129a()
            android.support.constraint.a.a.b r11 = r12.f455j
            int r11 = r11.f406c
            int r5 = r5 + r11
            android.support.constraint.a.a.b r11 = r12.f457l
            int r11 = r11.f406c
            int r5 = r5 + r11
            goto L_0x0138
        L_0x0136:
            r5 = r25
        L_0x0138:
            int r11 = r12.f425M
            r25 = r5
            r5 = 8
            r26 = r9
            if (r11 != r5) goto L_0x0144
            r9 = 0
            goto L_0x0146
        L_0x0144:
            r9 = r25
        L_0x0146:
            if (r11 != r5) goto L_0x014a
            r5 = 0
            goto L_0x014c
        L_0x014a:
            r5 = r26
        L_0x014c:
            int r11 = r12.f427O
            int r8 = java.lang.Math.max(r8, r11)
            int r11 = r12.f428P
            r25 = r14
            r14 = r18
            int r18 = java.lang.Math.max(r14, r11)
            int r11 = r12.f429Q
            r14 = r21
            int r21 = java.lang.Math.max(r14, r11)
            int r11 = r12.f426N
            r12 = r20
            int r20 = java.lang.Math.max(r12, r11)
            r11 = r19
            int r19 = java.lang.Math.max(r11, r5)
            r5 = r22
            int r22 = java.lang.Math.max(r5, r9)
        L_0x0178:
            int r13 = r13 + 1
            r9 = r24
            r14 = r25
            r5 = 0
            goto L_0x00ca
        L_0x0181:
            r24 = r9
            r14 = r18
            r11 = r19
            r12 = r20
            r9 = r21
            r5 = r22
            int r8 = java.lang.Math.max(r8, r14)
            int r13 = r1.f418F
            int r8 = java.lang.Math.max(r8, r11)
            int r8 = java.lang.Math.max(r13, r8)
            r1.f473ai = r8
            int r8 = java.lang.Math.max(r12, r9)
            int r9 = r1.f419G
            int r5 = java.lang.Math.max(r8, r5)
            int r5 = java.lang.Math.max(r9, r5)
            r1.f474aj = r5
            r5 = 0
        L_0x01ae:
            if (r5 >= r15) goto L_0x01c6
            java.lang.Object r8 = r10.get(r5)
            android.support.constraint.a.a.c r8 = (android.support.constraint.p029a.p030a.C0133c) r8
            r9 = 0
            r8.f434V = r9
            r8.f435W = r9
            r8.f430R = r9
            r8.f431S = r9
            r8.f432T = r9
            r8.f433U = r9
            int r5 = r5 + 1
            goto L_0x01ae
        L_0x01c6:
            r9 = 0
            boolean[] r5 = r1.f484au
            boolean r5 = r5[r9]
            if (r4 <= 0) goto L_0x01d8
            if (r6 <= 0) goto L_0x01d8
            int r8 = r1.f473ai
            if (r8 > r4) goto L_0x01d7
            int r8 = r1.f474aj
            if (r8 <= r6) goto L_0x01d8
        L_0x01d7:
            r5 = 0
        L_0x01d8:
            if (r5 == 0) goto L_0x0218
            int r8 = r1.f445af
            r9 = 2
            if (r8 != r9) goto L_0x01f9
            r8 = 1
            r1.f445af = r8
            if (r4 <= 0) goto L_0x01ee
            int r9 = r1.f473ai
            if (r4 >= r9) goto L_0x01ee
            r1.f476al = r8
            r1.mo141m(r4)
            goto L_0x01f9
        L_0x01ee:
            int r8 = r1.f418F
            int r9 = r1.f473ai
            int r8 = java.lang.Math.max(r8, r9)
            r1.mo141m(r8)
        L_0x01f9:
            int r8 = r1.f446ag
            r9 = 2
            if (r8 != r9) goto L_0x0218
            r8 = 1
            r1.f446ag = r8
            if (r6 <= 0) goto L_0x020d
            int r9 = r1.f474aj
            if (r6 >= r9) goto L_0x020d
            r1.f477am = r8
            r1.mo135g(r6)
            goto L_0x0218
        L_0x020d:
            int r8 = r1.f419G
            int r9 = r1.f474aj
            int r8 = java.lang.Math.max(r8, r9)
            r1.mo135g(r8)
        L_0x0218:
            r9 = r24
            goto L_0x021c
        L_0x021b:
            r5 = 0
        L_0x021c:
            r8 = 0
            r1.f479ap = r8
            r1.f480aq = r8
            java.util.ArrayList r8 = r1.f501an
            int r8 = r8.size()
            r10 = 0
        L_0x0228:
            if (r10 >= r8) goto L_0x023e
            java.util.ArrayList r11 = r1.f501an
            java.lang.Object r11 = r11.get(r10)
            android.support.constraint.a.a.c r11 = (android.support.constraint.p029a.p030a.C0133c) r11
            boolean r12 = r11 instanceof android.support.constraint.p029a.p030a.C0138h
            if (r12 == 0) goto L_0x023b
            android.support.constraint.a.a.h r11 = (android.support.constraint.p029a.p030a.C0138h) r11
            r11.mo155z()
        L_0x023b:
            int r10 = r10 + 1
            goto L_0x0228
        L_0x023e:
            r10 = 1
            r11 = 0
        L_0x0240:
            if (r10 == 0) goto L_0x0bdc
            r12 = 1
            int r11 = r11 + r12
            android.support.constraint.a.e r13 = r1.f472ah     // Catch:{ Exception -> 0x0a39 }
            r13.mo179l()     // Catch:{ Exception -> 0x0a39 }
            android.support.constraint.a.e r13 = r1.f472ah     // Catch:{ Exception -> 0x0a39 }
            r1.mo150u(r13)     // Catch:{ Exception -> 0x0a39 }
            java.util.ArrayList r14 = r1.f501an     // Catch:{ Exception -> 0x0a39 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x0a39 }
            int r15 = r1.f475ak     // Catch:{ Exception -> 0x0a39 }
            r12 = 2
            if (r15 == r12) goto L_0x0276
            r12 = 4
            if (r15 != r12) goto L_0x025d
            goto L_0x0276
        L_0x025d:
            r24 = r2
            r22 = r3
            r26 = r4
            r21 = r5
            r25 = r6
            r28 = r7
            r31 = r8
            r29 = r9
            r19 = r10
            r30 = r11
            r32 = r14
            r2 = 1
            goto L_0x094b
        L_0x0276:
            java.util.ArrayList r12 = r1.f501an     // Catch:{ Exception -> 0x0a39 }
            int r12 = r12.size()     // Catch:{ Exception -> 0x0a39 }
            r19 = r10
            r15 = 0
        L_0x027f:
            if (r15 >= r12) goto L_0x02c4
            java.util.ArrayList r10 = r1.f501an     // Catch:{ Exception -> 0x02ad }
            java.lang.Object r10 = r10.get(r15)     // Catch:{ Exception -> 0x02ad }
            android.support.constraint.a.a.c r10 = (android.support.constraint.p029a.p030a.C0133c) r10     // Catch:{ Exception -> 0x02ad }
            r21 = r5
            r5 = -1
            r10.f439a = r5     // Catch:{ Exception -> 0x02a9 }
            r10.f447b = r5     // Catch:{ Exception -> 0x02a9 }
            int r5 = r10.f445af     // Catch:{ Exception -> 0x02a9 }
            r22 = r3
            r3 = 3
            if (r5 == r3) goto L_0x029b
            int r5 = r10.f446ag     // Catch:{ Exception -> 0x02a7 }
            if (r5 != r3) goto L_0x02a0
        L_0x029b:
            r3 = 1
            r10.f439a = r3     // Catch:{ Exception -> 0x02a7 }
            r10.f447b = r3     // Catch:{ Exception -> 0x02a7 }
        L_0x02a0:
            int r15 = r15 + 1
            r5 = r21
            r3 = r22
            goto L_0x027f
        L_0x02a7:
            r0 = move-exception
            goto L_0x02b2
        L_0x02a9:
            r0 = move-exception
            r22 = r3
            goto L_0x02b2
        L_0x02ad:
            r0 = move-exception
            r22 = r3
            r21 = r5
        L_0x02b2:
            r3 = r0
            r24 = r2
            r26 = r4
            r25 = r6
            r28 = r7
        L_0x02bb:
            r31 = r8
            r29 = r9
        L_0x02bf:
            r30 = r11
        L_0x02c1:
            r6 = 4
            goto L_0x0a50
        L_0x02c4:
            r22 = r3
            r21 = r5
            r3 = 0
            r5 = 0
            r10 = 0
        L_0x02cb:
            if (r10 != 0) goto L_0x090c
            r24 = r2
            r2 = 0
            r10 = 0
            r15 = 0
        L_0x02d2:
            if (r10 >= r12) goto L_0x08db
            r25 = r6
            java.util.ArrayList r6 = r1.f501an     // Catch:{ Exception -> 0x08ce }
            java.lang.Object r6 = r6.get(r10)     // Catch:{ Exception -> 0x08ce }
            android.support.constraint.a.a.c r6 = (android.support.constraint.p029a.p030a.C0133c) r6     // Catch:{ Exception -> 0x08ce }
            r26 = r4
            int r4 = r6.f439a     // Catch:{ Exception -> 0x08cc }
            r27 = 1056964608(0x3f000000, float:0.5)
            r28 = r7
            r7 = -1
            if (r4 != r7) goto L_0x0540
            int r4 = r1.f445af     // Catch:{ Exception -> 0x053d }
            r7 = 2
            if (r4 != r7) goto L_0x02f6
            r7 = 1
            r6.f439a = r7     // Catch:{ Exception -> 0x02f3 }
            goto L_0x0540
        L_0x02f3:
            r0 = move-exception
            r3 = r0
            goto L_0x02bb
        L_0x02f6:
            int r7 = r6.f445af     // Catch:{ Exception -> 0x053d }
            r29 = r9
            r9 = 3
            if (r7 != r9) goto L_0x0309
            r9 = 1
            r6.f439a = r9     // Catch:{ Exception -> 0x0304 }
            r31 = r8
            goto L_0x0544
        L_0x0304:
            r0 = move-exception
            r3 = r0
            r31 = r8
            goto L_0x02bf
        L_0x0309:
            r9 = 2
            if (r4 == r9) goto L_0x034a
            r4 = 4
            if (r7 != r4) goto L_0x034a
            android.support.constraint.a.a.b r4 = r6.f454i     // Catch:{ Exception -> 0x0342 }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x0342 }
            r4.f409f = r7     // Catch:{ Exception -> 0x0342 }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x0342 }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x0342 }
            r4.f409f = r7     // Catch:{ Exception -> 0x0342 }
            android.support.constraint.a.a.b r4 = r6.f454i     // Catch:{ Exception -> 0x0342 }
            int r7 = r4.f406c     // Catch:{ Exception -> 0x0342 }
            int r9 = r34.mo132d()     // Catch:{ Exception -> 0x0342 }
            r30 = r11
            android.support.constraint.a.a.b r11 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            int r11 = r11.f406c     // Catch:{ Exception -> 0x03bb }
            int r9 = r9 - r11
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r4, r7)     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r4, r9)     // Catch:{ Exception -> 0x03bb }
            r6.mo136h(r7, r9)     // Catch:{ Exception -> 0x03bb }
            r4 = 2
            r6.f439a = r4     // Catch:{ Exception -> 0x03bb }
            goto L_0x03b7
        L_0x0342:
            r0 = move-exception
            r30 = r11
        L_0x0345:
            r3 = r0
            r31 = r8
            goto L_0x02c1
        L_0x034a:
            r30 = r11
            android.support.constraint.a.a.b r4 = r6.f454i     // Catch:{ Exception -> 0x0538 }
            android.support.constraint.a.a.b r7 = r4.f405b     // Catch:{ Exception -> 0x0538 }
            if (r7 == 0) goto L_0x03bd
            android.support.constraint.a.a.b r9 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r9 = r9.f405b     // Catch:{ Exception -> 0x03bb }
            if (r9 == 0) goto L_0x03bd
            android.support.constraint.a.a.c r7 = r7.f404a     // Catch:{ Exception -> 0x03bb }
            if (r7 != r1) goto L_0x03b4
            android.support.constraint.a.a.c r7 = r9.f404a     // Catch:{ Exception -> 0x03bb }
            if (r7 != r1) goto L_0x03b4
            int r4 = r4.mo123a()     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x03bb }
            int r9 = r1.f445af     // Catch:{ Exception -> 0x03bb }
            r11 = 3
            if (r9 != r11) goto L_0x0375
            int r9 = r34.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r9 = r9 - r7
            goto L_0x038f
        L_0x0375:
            int r9 = r6.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r11 = r34.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r11 = r11 - r4
            int r11 = r11 - r7
            int r11 = r11 - r9
            float r7 = (float) r11     // Catch:{ Exception -> 0x03bb }
            float r9 = r6.f422J     // Catch:{ Exception -> 0x03bb }
            float r7 = r7 * r9
            float r7 = r7 + r27
            int r7 = (int) r7     // Catch:{ Exception -> 0x03bb }
            int r4 = r4 + r7
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r9 = r4 + r7
        L_0x038f:
            android.support.constraint.a.a.b r7 = r6.f454i     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r11 = r13.mo172e(r7)     // Catch:{ Exception -> 0x03bb }
            r7.f409f = r11     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r11 = r13.mo172e(r7)     // Catch:{ Exception -> 0x03bb }
            r7.f409f = r11     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r7 = r6.f454i     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r7, r9)     // Catch:{ Exception -> 0x03bb }
            r7 = 2
            r6.f439a = r7     // Catch:{ Exception -> 0x03bb }
            r6.mo136h(r4, r9)     // Catch:{ Exception -> 0x03bb }
            goto L_0x03b7
        L_0x03b4:
            r4 = 1
            r6.f439a = r4     // Catch:{ Exception -> 0x03bb }
        L_0x03b7:
            r31 = r8
            goto L_0x0546
        L_0x03bb:
            r0 = move-exception
            goto L_0x0345
        L_0x03bd:
            if (r7 == 0) goto L_0x03f1
            android.support.constraint.a.a.c r9 = r7.f404a     // Catch:{ Exception -> 0x03bb }
            if (r9 != r1) goto L_0x03f1
            int r4 = r4.mo123a()     // Catch:{ Exception -> 0x03bb }
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r9 = r6.f454i     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r11 = r13.mo172e(r9)     // Catch:{ Exception -> 0x03bb }
            r9.f409f = r11     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r9 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r11 = r13.mo172e(r9)     // Catch:{ Exception -> 0x03bb }
            r9.f409f = r11     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r9 = r6.f454i     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r9 = r9.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r9, r4)     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r9 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r9 = r9.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r9, r7)     // Catch:{ Exception -> 0x03bb }
            r9 = 2
            r6.f439a = r9     // Catch:{ Exception -> 0x03bb }
            r6.mo136h(r4, r7)     // Catch:{ Exception -> 0x03bb }
            goto L_0x03b7
        L_0x03f1:
            android.support.constraint.a.a.b r9 = r6.f456k     // Catch:{ Exception -> 0x0538 }
            android.support.constraint.a.a.b r9 = r9.f405b     // Catch:{ Exception -> 0x0538 }
            if (r9 == 0) goto L_0x042f
            android.support.constraint.a.a.c r11 = r9.f404a     // Catch:{ Exception -> 0x03bb }
            if (r11 != r1) goto L_0x042f
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x03bb }
            r4.f409f = r7     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x03bb }
            r4.f409f = r7     // Catch:{ Exception -> 0x03bb }
            int r4 = r34.mo132d()     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x03bb }
            int r4 = r4 - r7
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x03bb }
            int r7 = r4 - r7
            android.support.constraint.a.a.b r9 = r6.f454i     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r9 = r9.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r9, r7)     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.a.b r9 = r6.f456k     // Catch:{ Exception -> 0x03bb }
            android.support.constraint.a.g r9 = r9.f409f     // Catch:{ Exception -> 0x03bb }
            r13.mo175h(r9, r4)     // Catch:{ Exception -> 0x03bb }
            r9 = 2
            r6.f439a = r9     // Catch:{ Exception -> 0x03bb }
            r6.mo136h(r7, r4)     // Catch:{ Exception -> 0x03bb }
            goto L_0x03b7
        L_0x042f:
            if (r7 == 0) goto L_0x0472
            android.support.constraint.a.a.c r11 = r7.f404a     // Catch:{ Exception -> 0x0538 }
            int r11 = r11.f439a     // Catch:{ Exception -> 0x0538 }
            r31 = r8
            r8 = 2
            if (r11 != r8) goto L_0x0474
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            float r4 = r7.f530d     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f454i     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            float r7 = (float) r7     // Catch:{ Exception -> 0x093e }
            float r4 = r4 + r7
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f454i     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            r8 = 2
            r6.f439a = r8     // Catch:{ Exception -> 0x093e }
            r6.mo136h(r4, r7)     // Catch:{ Exception -> 0x093e }
            goto L_0x0546
        L_0x0472:
            r31 = r8
        L_0x0474:
            if (r9 == 0) goto L_0x04b6
            android.support.constraint.a.a.c r8 = r9.f404a     // Catch:{ Exception -> 0x093e }
            int r8 = r8.f439a     // Catch:{ Exception -> 0x093e }
            r11 = 2
            if (r8 != r11) goto L_0x04b6
            android.support.constraint.a.g r7 = r9.f409f     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            float r4 = r7.f530d     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            float r7 = (float) r7     // Catch:{ Exception -> 0x093e }
            float r4 = r4 - r7
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x093e }
            int r7 = r4 - r7
            android.support.constraint.a.a.b r8 = r6.f454i     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            r8 = 2
            r6.f439a = r8     // Catch:{ Exception -> 0x093e }
            r6.mo136h(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x0546
        L_0x04b6:
            if (r7 != 0) goto L_0x0546
            if (r9 != 0) goto L_0x0546
            boolean r7 = r6 instanceof android.support.constraint.p029a.p030a.C0135e     // Catch:{ Exception -> 0x093e }
            if (r7 == 0) goto L_0x0511
            r7 = r6
            android.support.constraint.a.a.e r7 = (android.support.constraint.p029a.p030a.C0135e) r7     // Catch:{ Exception -> 0x093e }
            int r8 = r7.f489ak     // Catch:{ Exception -> 0x093e }
            r9 = 1
            if (r8 != r9) goto L_0x0546
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            int r4 = r7.f487ai     // Catch:{ Exception -> 0x093e }
            r8 = -1
            if (r4 == r8) goto L_0x04db
            float r4 = (float) r4     // Catch:{ Exception -> 0x093e }
            goto L_0x04ef
        L_0x04db:
            int r4 = r7.f488aj     // Catch:{ Exception -> 0x093e }
            if (r4 == r8) goto L_0x04e6
            int r7 = r34.mo132d()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 - r4
            float r4 = (float) r7     // Catch:{ Exception -> 0x093e }
            goto L_0x04ef
        L_0x04e6:
            int r4 = r34.mo132d()     // Catch:{ Exception -> 0x093e }
            float r4 = (float) r4     // Catch:{ Exception -> 0x093e }
            float r7 = r7.f486ah     // Catch:{ Exception -> 0x093e }
            float r4 = r4 * r7
        L_0x04ef:
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f454i     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x093e }
            r7 = 2
            r6.f439a = r7     // Catch:{ Exception -> 0x093e }
            r6.f447b = r7     // Catch:{ Exception -> 0x093e }
            r6.mo136h(r4, r4)     // Catch:{ Exception -> 0x093e }
            int r4 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            r7 = 0
            r6.mo140l(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x0546
        L_0x0511:
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            int r4 = r6.f468w     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo132d()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f454i     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r4, r7)     // Catch:{ Exception -> 0x093e }
            r4 = 2
            r6.f439a = r4     // Catch:{ Exception -> 0x093e }
            goto L_0x0546
        L_0x0538:
            r0 = move-exception
            r31 = r8
            goto L_0x093f
        L_0x053d:
            r0 = move-exception
            goto L_0x08d3
        L_0x0540:
            r31 = r8
            r29 = r9
        L_0x0544:
            r30 = r11
        L_0x0546:
            int r4 = r6.f447b     // Catch:{ Exception -> 0x093e }
            r7 = -1
            if (r4 != r7) goto L_0x08ab
            int r4 = r1.f446ag     // Catch:{ Exception -> 0x093e }
            r7 = 2
            if (r4 != r7) goto L_0x0555
            r7 = 1
            r6.f447b = r7     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x0555:
            r7 = 1
            int r8 = r6.f446ag     // Catch:{ Exception -> 0x093e }
            r9 = 3
            if (r8 != r9) goto L_0x055f
            r6.f447b = r7     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x055f:
            r7 = 2
            if (r4 == r7) goto L_0x05b2
            r4 = 4
            if (r8 != r4) goto L_0x05b2
            android.support.constraint.a.a.b r4 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f455j     // Catch:{ Exception -> 0x093e }
            int r7 = r4.f406c     // Catch:{ Exception -> 0x093e }
            int r8 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r9 = r6.f457l     // Catch:{ Exception -> 0x093e }
            int r9 = r9.f406c     // Catch:{ Exception -> 0x093e }
            int r8 = r8 - r9
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r4, r7)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r4, r8)     // Catch:{ Exception -> 0x093e }
            int r4 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r4 > 0) goto L_0x0598
            int r4 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r4 != r9) goto L_0x05aa
        L_0x0598:
            android.support.constraint.a.a.b r4 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r4 = r4.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r7
            r13.mo175h(r4, r9)     // Catch:{ Exception -> 0x093e }
        L_0x05aa:
            r6.mo140l(r7, r8)     // Catch:{ Exception -> 0x093e }
            r4 = 2
            r6.f447b = r4     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x05b2:
            android.support.constraint.a.a.b r4 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r4.f405b     // Catch:{ Exception -> 0x093e }
            if (r7 == 0) goto L_0x063f
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r8.f405b     // Catch:{ Exception -> 0x093e }
            if (r8 == 0) goto L_0x063f
            android.support.constraint.a.a.c r7 = r7.f404a     // Catch:{ Exception -> 0x093e }
            if (r7 != r1) goto L_0x063a
            android.support.constraint.a.a.c r7 = r8.f404a     // Catch:{ Exception -> 0x093e }
            if (r7 != r1) goto L_0x063a
            int r4 = r4.mo123a()     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f457l     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            int r8 = r1.f446ag     // Catch:{ Exception -> 0x093e }
            r9 = 3
            if (r8 != r9) goto L_0x05db
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
        L_0x05d9:
            int r7 = r7 + r4
            goto L_0x05f5
        L_0x05db:
            int r8 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r9 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            float r11 = (float) r4     // Catch:{ Exception -> 0x093e }
            int r9 = r9 - r4
            int r9 = r9 - r7
            int r9 = r9 - r8
            float r4 = (float) r9     // Catch:{ Exception -> 0x093e }
            float r7 = r6.f423K     // Catch:{ Exception -> 0x093e }
            float r4 = r4 * r7
            float r11 = r11 + r4
            float r11 = r11 + r27
            int r4 = (int) r11     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            goto L_0x05d9
        L_0x05f5:
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r8 > 0) goto L_0x0620
            int r8 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r8 != r9) goto L_0x061e
            goto L_0x0620
        L_0x061e:
            r8 = 2
            goto L_0x0633
        L_0x0620:
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r4
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            goto L_0x061e
        L_0x0633:
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r4, r7)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x063a:
            r4 = 1
            r6.f447b = r4     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x063f:
            if (r7 == 0) goto L_0x0693
            android.support.constraint.a.a.c r8 = r7.f404a     // Catch:{ Exception -> 0x093e }
            if (r8 != r1) goto L_0x0693
            int r4 = r4.mo123a()     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r8 > 0) goto L_0x0679
            int r8 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r8 != r9) goto L_0x0677
            goto L_0x0679
        L_0x0677:
            r8 = 2
            goto L_0x068c
        L_0x0679:
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r4
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            goto L_0x0677
        L_0x068c:
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r4, r7)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x0693:
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r8.f405b     // Catch:{ Exception -> 0x093e }
            if (r8 == 0) goto L_0x06f1
            android.support.constraint.a.a.c r9 = r8.f404a     // Catch:{ Exception -> 0x093e }
            if (r9 != r1) goto L_0x06f1
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            int r4 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f457l     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            int r4 = r4 - r7
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r4 - r7
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r8 > 0) goto L_0x06d7
            int r8 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r8 != r9) goto L_0x06d5
            goto L_0x06d7
        L_0x06d5:
            r8 = 2
            goto L_0x06ea
        L_0x06d7:
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r7
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            goto L_0x06d5
        L_0x06ea:
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x06f1:
            if (r7 == 0) goto L_0x0751
            android.support.constraint.a.a.c r9 = r7.f404a     // Catch:{ Exception -> 0x093e }
            int r9 = r9.f447b     // Catch:{ Exception -> 0x093e }
            r11 = 2
            if (r9 != r11) goto L_0x0751
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            float r4 = r7.f530d     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f455j     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            float r7 = (float) r7     // Catch:{ Exception -> 0x093e }
            float r4 = r4 + r7
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r8 > 0) goto L_0x0737
            int r8 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r8 != r9) goto L_0x0735
            goto L_0x0737
        L_0x0735:
            r8 = 2
            goto L_0x074a
        L_0x0737:
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r4
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            goto L_0x0735
        L_0x074a:
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r4, r7)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x0751:
            if (r8 == 0) goto L_0x07b2
            android.support.constraint.a.a.c r9 = r8.f404a     // Catch:{ Exception -> 0x093e }
            int r9 = r9.f447b     // Catch:{ Exception -> 0x093e }
            r11 = 2
            if (r9 != r11) goto L_0x07b2
            android.support.constraint.a.g r7 = r8.f409f     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            float r4 = r7.f530d     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f457l     // Catch:{ Exception -> 0x093e }
            int r7 = r7.mo123a()     // Catch:{ Exception -> 0x093e }
            float r7 = (float) r7     // Catch:{ Exception -> 0x093e }
            float r4 = r4 - r7
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r4 - r7
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r8 > 0) goto L_0x0798
            int r8 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r9 = 8
            if (r8 != r9) goto L_0x0796
            goto L_0x0798
        L_0x0796:
            r8 = 2
            goto L_0x07ab
        L_0x0798:
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r7
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            goto L_0x0796
        L_0x07ab:
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ab
        L_0x07b2:
            android.support.constraint.a.a.b r9 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r9 = r9.f405b     // Catch:{ Exception -> 0x093e }
            if (r9 == 0) goto L_0x0807
            android.support.constraint.a.a.c r11 = r9.f404a     // Catch:{ Exception -> 0x093e }
            int r11 = r11.f447b     // Catch:{ Exception -> 0x093e }
            r32 = r14
            r14 = 2
            if (r11 != r14) goto L_0x0809
            android.support.constraint.a.g r7 = r9.f409f     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            float r4 = r7.f530d     // Catch:{ Exception -> 0x093e }
            int r7 = r6.f417E     // Catch:{ Exception -> 0x093e }
            float r7 = (float) r7     // Catch:{ Exception -> 0x093e }
            float r4 = r4 - r7
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r9 = r13.mo172e(r8)     // Catch:{ Exception -> 0x093e }
            r8.f409f = r9     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            int r9 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r9 = r9 + r4
            r13.mo175h(r8, r9)     // Catch:{ Exception -> 0x093e }
            r8 = 2
            r6.f447b = r8     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r4, r7)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ad
        L_0x0807:
            r32 = r14
        L_0x0809:
            if (r9 != 0) goto L_0x08ad
            if (r7 != 0) goto L_0x08ad
            if (r8 != 0) goto L_0x08ad
            boolean r7 = r6 instanceof android.support.constraint.p029a.p030a.C0135e     // Catch:{ Exception -> 0x093e }
            if (r7 == 0) goto L_0x0865
            r7 = r6
            android.support.constraint.a.a.e r7 = (android.support.constraint.p029a.p030a.C0135e) r7     // Catch:{ Exception -> 0x093e }
            int r8 = r7.f489ak     // Catch:{ Exception -> 0x093e }
            if (r8 != 0) goto L_0x08ad
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r8     // Catch:{ Exception -> 0x093e }
            int r4 = r7.f487ai     // Catch:{ Exception -> 0x093e }
            r8 = -1
            if (r4 == r8) goto L_0x082f
            float r4 = (float) r4     // Catch:{ Exception -> 0x093e }
            goto L_0x0843
        L_0x082f:
            int r4 = r7.f488aj     // Catch:{ Exception -> 0x093e }
            if (r4 == r8) goto L_0x083a
            int r7 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 - r4
            float r4 = (float) r7     // Catch:{ Exception -> 0x093e }
            goto L_0x0843
        L_0x083a:
            int r4 = r34.mo129a()     // Catch:{ Exception -> 0x093e }
            float r4 = (float) r4     // Catch:{ Exception -> 0x093e }
            float r7 = r7.f486ah     // Catch:{ Exception -> 0x093e }
            float r4 = r4 * r7
        L_0x0843:
            float r4 = r4 + r27
            int r4 = (int) r4     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x093e }
            r7 = 2
            r6.f447b = r7     // Catch:{ Exception -> 0x093e }
            r6.f439a = r7     // Catch:{ Exception -> 0x093e }
            r6.mo140l(r4, r4)     // Catch:{ Exception -> 0x093e }
            int r4 = r34.mo132d()     // Catch:{ Exception -> 0x093e }
            r7 = 0
            r6.mo136h(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x08ad
        L_0x0865:
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r4 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r13.mo172e(r4)     // Catch:{ Exception -> 0x093e }
            r4.f409f = r7     // Catch:{ Exception -> 0x093e }
            int r4 = r6.f469x     // Catch:{ Exception -> 0x093e }
            int r7 = r6.mo129a()     // Catch:{ Exception -> 0x093e }
            int r7 = r7 + r4
            android.support.constraint.a.a.b r8 = r6.f455j     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r4)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r6.f457l     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r8.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r8, r7)     // Catch:{ Exception -> 0x093e }
            int r7 = r6.f417E     // Catch:{ Exception -> 0x093e }
            if (r7 > 0) goto L_0x0895
            int r7 = r6.f425M     // Catch:{ Exception -> 0x093e }
            r8 = 8
            if (r7 != r8) goto L_0x0893
            goto L_0x0895
        L_0x0893:
            r4 = 2
            goto L_0x08a8
        L_0x0895:
            android.support.constraint.a.a.b r7 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r8 = r13.mo172e(r7)     // Catch:{ Exception -> 0x093e }
            r7.f409f = r8     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r7 = r6.f458m     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r7 = r7.f409f     // Catch:{ Exception -> 0x093e }
            int r8 = r6.f417E     // Catch:{ Exception -> 0x093e }
            int r4 = r4 + r8
            r13.mo175h(r7, r4)     // Catch:{ Exception -> 0x093e }
            goto L_0x0893
        L_0x08a8:
            r6.f447b = r4     // Catch:{ Exception -> 0x093e }
            goto L_0x08ad
        L_0x08ab:
            r32 = r14
        L_0x08ad:
            int r4 = r6.f447b     // Catch:{ Exception -> 0x093e }
            r7 = -1
            if (r4 != r7) goto L_0x08b4
            int r15 = r15 + 1
        L_0x08b4:
            int r4 = r6.f439a     // Catch:{ Exception -> 0x093e }
            if (r4 != r7) goto L_0x08ba
            int r2 = r2 + 1
        L_0x08ba:
            int r10 = r10 + 1
            r6 = r25
            r4 = r26
            r7 = r28
            r9 = r29
            r11 = r30
            r8 = r31
            r14 = r32
            goto L_0x02d2
        L_0x08cc:
            r0 = move-exception
            goto L_0x08d1
        L_0x08ce:
            r0 = move-exception
            r26 = r4
        L_0x08d1:
            r28 = r7
        L_0x08d3:
            r31 = r8
            r29 = r9
            r30 = r11
            goto L_0x093f
        L_0x08db:
            r26 = r4
            r25 = r6
            r28 = r7
            r31 = r8
            r29 = r9
            r30 = r11
            r32 = r14
            if (r15 != 0) goto L_0x08f1
            if (r2 != 0) goto L_0x08ef
        L_0x08ed:
            r10 = 1
            goto L_0x08f8
        L_0x08ef:
            r9 = 0
            goto L_0x08f2
        L_0x08f1:
            r9 = r15
        L_0x08f2:
            if (r3 != r9) goto L_0x08f7
            if (r5 != r2) goto L_0x08f7
            goto L_0x08ed
        L_0x08f7:
            r10 = 0
        L_0x08f8:
            r5 = r2
            r3 = r15
            r2 = r24
            r6 = r25
            r4 = r26
            r7 = r28
            r9 = r29
            r11 = r30
            r8 = r31
            r14 = r32
            goto L_0x02cb
        L_0x090c:
            r24 = r2
            r26 = r4
            r25 = r6
            r28 = r7
            r31 = r8
            r29 = r9
            r30 = r11
            r32 = r14
            r2 = 0
            r3 = 0
            r9 = 0
        L_0x091f:
            if (r9 >= r12) goto L_0x0942
            java.util.ArrayList r4 = r1.f501an     // Catch:{ Exception -> 0x093e }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.c r4 = (android.support.constraint.p029a.p030a.C0133c) r4     // Catch:{ Exception -> 0x093e }
            int r5 = r4.f439a     // Catch:{ Exception -> 0x093e }
            r6 = 1
            r7 = -1
            if (r5 == r6) goto L_0x0931
            if (r5 != r7) goto L_0x0933
        L_0x0931:
            int r2 = r2 + 1
        L_0x0933:
            int r4 = r4.f447b     // Catch:{ Exception -> 0x093e }
            if (r4 == r6) goto L_0x0939
            if (r4 != r7) goto L_0x093b
        L_0x0939:
            int r3 = r3 + 1
        L_0x093b:
            int r9 = r9 + 1
            goto L_0x091f
        L_0x093e:
            r0 = move-exception
        L_0x093f:
            r3 = r0
            goto L_0x02c1
        L_0x0942:
            if (r2 != 0) goto L_0x094a
            if (r3 != 0) goto L_0x094a
            r2 = 0
            r6 = 4
            goto L_0x0a29
        L_0x094a:
            r2 = 0
        L_0x094b:
            r3 = r32
            r9 = 0
        L_0x094e:
            if (r9 >= r3) goto L_0x0a19
            java.util.ArrayList r4 = r1.f501an     // Catch:{ Exception -> 0x0a17 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x0a17 }
            android.support.constraint.a.a.c r4 = (android.support.constraint.p029a.p030a.C0133c) r4     // Catch:{ Exception -> 0x0a17 }
            boolean r5 = r4 instanceof android.support.constraint.p029a.p030a.C0134d     // Catch:{ Exception -> 0x0a17 }
            if (r5 == 0) goto L_0x097e
            int r5 = r4.f445af     // Catch:{ Exception -> 0x093e }
            int r6 = r4.f446ag     // Catch:{ Exception -> 0x093e }
            r7 = 2
            if (r5 != r7) goto L_0x0968
            r8 = 1
            r4.f445af = r8     // Catch:{ Exception -> 0x093e }
            r5 = 2
            goto L_0x0969
        L_0x0968:
            r8 = 1
        L_0x0969:
            if (r6 != r7) goto L_0x096e
            r4.f446ag = r8     // Catch:{ Exception -> 0x093e }
            r6 = 2
        L_0x096e:
            r4.mo150u(r13)     // Catch:{ Exception -> 0x093e }
            if (r5 != r7) goto L_0x0976
            r4.mo147s(r7)     // Catch:{ Exception -> 0x093e }
        L_0x0976:
            if (r6 != r7) goto L_0x097b
            r4.mo148t(r7)     // Catch:{ Exception -> 0x093e }
        L_0x097b:
            r6 = 4
            goto L_0x0a13
        L_0x097e:
            if (r2 == 0) goto L_0x0a0f
            int r5 = r1.f445af     // Catch:{ Exception -> 0x0a17 }
            r6 = 2
            if (r5 == r6) goto L_0x09b9
            int r5 = r4.f445af     // Catch:{ Exception -> 0x093e }
            r6 = 4
            if (r5 != r6) goto L_0x09b9
            android.support.constraint.a.a.b r5 = r4.f454i     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r6 = r13.mo172e(r5)     // Catch:{ Exception -> 0x093e }
            r5.f409f = r6     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r5 = r4.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r6 = r13.mo172e(r5)     // Catch:{ Exception -> 0x093e }
            r5.f409f = r6     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r5 = r4.f454i     // Catch:{ Exception -> 0x093e }
            int r6 = r5.f406c     // Catch:{ Exception -> 0x093e }
            int r7 = r34.mo132d()     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r8 = r4.f456k     // Catch:{ Exception -> 0x093e }
            int r8 = r8.f406c     // Catch:{ Exception -> 0x093e }
            int r7 = r7 - r8
            android.support.constraint.a.g r5 = r5.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r5, r6)     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.a.b r5 = r4.f456k     // Catch:{ Exception -> 0x093e }
            android.support.constraint.a.g r5 = r5.f409f     // Catch:{ Exception -> 0x093e }
            r13.mo175h(r5, r7)     // Catch:{ Exception -> 0x093e }
            r4.mo136h(r6, r7)     // Catch:{ Exception -> 0x093e }
            r5 = 2
            r4.f439a = r5     // Catch:{ Exception -> 0x093e }
        L_0x09b9:
            int r5 = r1.f446ag     // Catch:{ Exception -> 0x0a17 }
            r6 = 2
            if (r5 == r6) goto L_0x0a0f
            int r5 = r4.f446ag     // Catch:{ Exception -> 0x0a17 }
            r6 = 4
            if (r5 != r6) goto L_0x0a10
            android.support.constraint.a.a.b r5 = r4.f455j     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.g r7 = r13.mo172e(r5)     // Catch:{ Exception -> 0x0a37 }
            r5.f409f = r7     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.a.b r5 = r4.f457l     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.g r7 = r13.mo172e(r5)     // Catch:{ Exception -> 0x0a37 }
            r5.f409f = r7     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.a.b r5 = r4.f455j     // Catch:{ Exception -> 0x0a37 }
            int r7 = r5.f406c     // Catch:{ Exception -> 0x0a37 }
            int r8 = r34.mo129a()     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.a.b r10 = r4.f457l     // Catch:{ Exception -> 0x0a37 }
            int r10 = r10.f406c     // Catch:{ Exception -> 0x0a37 }
            int r8 = r8 - r10
            android.support.constraint.a.g r5 = r5.f409f     // Catch:{ Exception -> 0x0a37 }
            r13.mo175h(r5, r7)     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.a.b r5 = r4.f457l     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.g r5 = r5.f409f     // Catch:{ Exception -> 0x0a37 }
            r13.mo175h(r5, r8)     // Catch:{ Exception -> 0x0a37 }
            int r5 = r4.f417E     // Catch:{ Exception -> 0x0a37 }
            if (r5 > 0) goto L_0x09f6
            int r5 = r4.f425M     // Catch:{ Exception -> 0x0a37 }
            r10 = 8
            if (r5 != r10) goto L_0x0a08
        L_0x09f6:
            android.support.constraint.a.a.b r5 = r4.f458m     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.g r10 = r13.mo172e(r5)     // Catch:{ Exception -> 0x0a37 }
            r5.f409f = r10     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.a.b r5 = r4.f458m     // Catch:{ Exception -> 0x0a37 }
            android.support.constraint.a.g r5 = r5.f409f     // Catch:{ Exception -> 0x0a37 }
            int r10 = r4.f417E     // Catch:{ Exception -> 0x0a37 }
            int r10 = r10 + r7
            r13.mo175h(r5, r10)     // Catch:{ Exception -> 0x0a37 }
        L_0x0a08:
            r4.mo140l(r7, r8)     // Catch:{ Exception -> 0x0a37 }
            r5 = 2
            r4.f447b = r5     // Catch:{ Exception -> 0x0a37 }
            goto L_0x0a10
        L_0x0a0f:
            r6 = 4
        L_0x0a10:
            r4.mo150u(r13)     // Catch:{ Exception -> 0x0a37 }
        L_0x0a13:
            int r9 = r9 + 1
            goto L_0x094e
        L_0x0a17:
            r0 = move-exception
            goto L_0x0a4e
        L_0x0a19:
            r6 = 4
            int r2 = r1.f479ap     // Catch:{ Exception -> 0x0a37 }
            if (r2 <= 0) goto L_0x0a21
            r1.m183C(r13)     // Catch:{ Exception -> 0x0a37 }
        L_0x0a21:
            int r2 = r1.f480aq     // Catch:{ Exception -> 0x0a37 }
            if (r2 <= 0) goto L_0x0a28
            r1.m184D(r13)     // Catch:{ Exception -> 0x0a37 }
        L_0x0a28:
            r2 = 1
        L_0x0a29:
            if (r2 == 0) goto L_0x0a56
            android.support.constraint.a.e r3 = r1.f472ah     // Catch:{ Exception -> 0x0a33 }
            android.support.constraint.a.d r4 = r3.f513b     // Catch:{ Exception -> 0x0a33 }
            r3.mo178k(r4)     // Catch:{ Exception -> 0x0a33 }
            goto L_0x0a56
        L_0x0a33:
            r0 = move-exception
            r3 = r0
            r10 = r2
            goto L_0x0a52
        L_0x0a37:
            r0 = move-exception
            goto L_0x0a4f
        L_0x0a39:
            r0 = move-exception
            r24 = r2
            r22 = r3
            r26 = r4
            r21 = r5
            r25 = r6
            r28 = r7
            r31 = r8
            r29 = r9
            r19 = r10
            r30 = r11
        L_0x0a4e:
            r6 = 4
        L_0x0a4f:
            r3 = r0
        L_0x0a50:
            r10 = r19
        L_0x0a52:
            r3.printStackTrace()
            r2 = r10
        L_0x0a56:
            if (r2 == 0) goto L_0x0aa2
            boolean[] r2 = r1.f484au
            r3 = 2
            r9 = 0
            r2[r3] = r9
            r34.mo151v()
            java.util.ArrayList r3 = r1.f501an
            int r3 = r3.size()
            r4 = 0
        L_0x0a68:
            if (r4 >= r3) goto L_0x0a9a
            java.util.ArrayList r5 = r1.f501an
            java.lang.Object r5 = r5.get(r4)
            android.support.constraint.a.a.c r5 = (android.support.constraint.p029a.p030a.C0133c) r5
            r5.mo151v()
            int r7 = r5.f445af
            r8 = 3
            if (r7 != r8) goto L_0x0a87
            int r7 = r5.mo132d()
            int r10 = r5.f420H
            if (r7 >= r10) goto L_0x0a87
            r7 = 2
            r10 = 1
            r2[r7] = r10
            goto L_0x0a89
        L_0x0a87:
            r7 = 2
            r10 = 1
        L_0x0a89:
            int r11 = r5.f446ag
            if (r11 != r8) goto L_0x0a97
            int r8 = r5.mo129a()
            int r5 = r5.f421I
            if (r8 >= r5) goto L_0x0a97
            r2[r7] = r10
        L_0x0a97:
            int r4 = r4 + 1
            goto L_0x0a68
        L_0x0a9a:
            r11 = r30
            r3 = r31
            r2 = 8
            r5 = 2
            goto L_0x0ae2
        L_0x0aa2:
            r9 = 0
            r34.mo151v()
            r3 = r31
            r2 = 0
        L_0x0aa9:
            if (r2 >= r3) goto L_0x0add
            java.util.ArrayList r4 = r1.f501an
            java.lang.Object r4 = r4.get(r2)
            android.support.constraint.a.a.c r4 = (android.support.constraint.p029a.p030a.C0133c) r4
            int r5 = r4.f445af
            r7 = 3
            if (r5 != r7) goto L_0x0ac7
            int r5 = r4.mo132d()
            int r8 = r4.f420H
            if (r5 >= r8) goto L_0x0ac7
            boolean[] r2 = r1.f484au
            r5 = 2
            r8 = 1
            r2[r5] = r8
            goto L_0x0ade
        L_0x0ac7:
            r5 = 2
            r8 = 1
            int r10 = r4.f446ag
            if (r10 != r7) goto L_0x0ada
            int r10 = r4.mo129a()
            int r4 = r4.f421I
            if (r10 >= r4) goto L_0x0ada
            boolean[] r2 = r1.f484au
            r2[r5] = r8
            goto L_0x0ade
        L_0x0ada:
            int r2 = r2 + 1
            goto L_0x0aa9
        L_0x0add:
            r5 = 2
        L_0x0ade:
            r11 = r30
            r2 = 8
        L_0x0ae2:
            if (r11 >= r2) goto L_0x0b46
            boolean[] r4 = r1.f484au
            boolean r4 = r4[r5]
            if (r4 == 0) goto L_0x0b46
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x0aed:
            if (r4 >= r3) goto L_0x0b10
            java.util.ArrayList r8 = r1.f501an
            java.lang.Object r8 = r8.get(r4)
            android.support.constraint.a.a.c r8 = (android.support.constraint.p029a.p030a.C0133c) r8
            int r10 = r8.f468w
            int r12 = r8.mo132d()
            int r10 = r10 + r12
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r8.f469x
            int r8 = r8.mo129a()
            int r10 = r10 + r8
            int r7 = java.lang.Math.max(r7, r10)
            int r4 = r4 + 1
            goto L_0x0aed
        L_0x0b10:
            int r4 = r1.f418F
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.f419G
            int r5 = java.lang.Math.max(r5, r7)
            r7 = r29
            r8 = 2
            if (r7 != r8) goto L_0x0b32
            int r10 = r34.mo132d()
            if (r10 >= r4) goto L_0x0b32
            r1.mo141m(r4)
            r1.f445af = r8
            r10 = r28
            r4 = 1
            r21 = 1
            goto L_0x0b35
        L_0x0b32:
            r10 = r28
            r4 = 0
        L_0x0b35:
            if (r10 != r8) goto L_0x0b4b
            int r12 = r34.mo129a()
            if (r12 >= r5) goto L_0x0b4b
            r1.mo135g(r5)
            r1.f446ag = r8
            r4 = 1
            r21 = 1
            goto L_0x0b4b
        L_0x0b46:
            r10 = r28
            r7 = r29
            r4 = 0
        L_0x0b4b:
            int r5 = r1.f418F
            int r8 = r34.mo132d()
            int r5 = java.lang.Math.max(r5, r8)
            int r8 = r34.mo132d()
            if (r5 <= r8) goto L_0x0b66
            r1.mo141m(r5)
            r5 = 1
            r1.f445af = r5
            r16 = 1
            r21 = 1
            goto L_0x0b69
        L_0x0b66:
            r5 = 1
            r16 = r4
        L_0x0b69:
            int r4 = r1.f419G
            int r8 = r34.mo129a()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r34.mo129a()
            if (r4 <= r8) goto L_0x0b81
            r1.mo135g(r4)
            r1.f446ag = r5
            r4 = 1
            r8 = 1
            goto L_0x0b85
        L_0x0b81:
            r4 = r16
            r8 = r21
        L_0x0b85:
            if (r8 != 0) goto L_0x0bc5
            int r12 = r1.f445af
            r13 = 2
            if (r12 != r13) goto L_0x0ba0
            if (r26 <= 0) goto L_0x0ba0
            int r12 = r34.mo132d()
            r13 = r26
            if (r12 <= r13) goto L_0x0ba2
            r1.f476al = r5
            r1.f445af = r5
            r1.mo141m(r13)
            r4 = 1
            r8 = 1
            goto L_0x0ba7
        L_0x0ba0:
            r13 = r26
        L_0x0ba2:
            r33 = r8
            r8 = r4
            r4 = r33
        L_0x0ba7:
            int r5 = r1.f446ag
            r12 = 2
            if (r5 != r12) goto L_0x0bc1
            if (r25 <= 0) goto L_0x0bc1
            int r5 = r34.mo129a()
            r14 = r25
            if (r5 <= r14) goto L_0x0bc3
            r5 = 1
            r1.f477am = r5
            r1.f446ag = r5
            r1.mo135g(r14)
            r4 = 1
            r8 = 1
            goto L_0x0bcf
        L_0x0bc1:
            r14 = r25
        L_0x0bc3:
            r5 = 1
            goto L_0x0bcf
        L_0x0bc5:
            r14 = r25
            r13 = r26
            r12 = 2
            r33 = r8
            r8 = r4
            r4 = r33
        L_0x0bcf:
            r5 = r4
            r9 = r7
            r7 = r10
            r4 = r13
            r6 = r14
            r2 = r24
            r10 = r8
            r8 = r3
            r3 = r22
            goto L_0x0240
        L_0x0bdc:
            r24 = r2
            r22 = r3
            r21 = r5
            r10 = r7
            r7 = r9
            r9 = 0
            android.support.constraint.a.a.c r2 = r1.f463r
            if (r2 == 0) goto L_0x0c43
            int r2 = r1.f418F
            int r3 = r34.mo132d()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f419G
            int r4 = r34.mo129a()
            int r3 = java.lang.Math.max(r3, r4)
            android.support.constraint.a.a.g r4 = r1.f478ao
            int r5 = r4.f496a
            r1.f468w = r5
            int r5 = r4.f497b
            r1.f469x = r5
            int r5 = r4.f498c
            r1.mo141m(r5)
            int r5 = r4.f499d
            r1.mo135g(r5)
            java.util.ArrayList r5 = r4.f500e
            int r5 = r5.size()
        L_0x0c17:
            if (r9 >= r5) goto L_0x0c3c
            java.util.ArrayList r6 = r4.f500e
            java.lang.Object r6 = r6.get(r9)
            android.support.constraint.a.a.f r6 = (android.support.constraint.p029a.p030a.C0136f) r6
            android.support.constraint.a.a.b r8 = r6.f491a
            int r8 = r8.f410g
            android.support.constraint.a.a.b r11 = r1.mo145q(r8)
            android.support.constraint.a.a.b r12 = r6.f492b
            int r13 = r6.f493c
            r14 = -1
            int r15 = r6.f495e
            int r6 = r6.f494d
            r17 = 0
            r16 = r6
            r11.mo126d(r12, r13, r14, r15, r16, r17)
            int r9 = r9 + 1
            goto L_0x0c17
        L_0x0c3c:
            r1.mo141m(r2)
            r1.mo135g(r3)
            goto L_0x0c4b
        L_0x0c43:
            r2 = r24
            r1.f468w = r2
            r2 = r22
            r1.f469x = r2
        L_0x0c4b:
            if (r21 == 0) goto L_0x0c51
            r1.f445af = r7
            r1.f446ag = r10
        L_0x0c51:
            android.support.constraint.a.e r2 = r1.f472ah
            android.support.constraint.a.c r2 = r2.f516e
            r1.mo134f(r2)
            android.support.constraint.a.a.c r2 = r1.f463r
            r3 = r1
        L_0x0c5b:
            if (r2 == 0) goto L_0x0c65
            android.support.constraint.a.a.c r3 = r2.f463r
            r33 = r3
            r3 = r2
            r2 = r33
            goto L_0x0c5b
        L_0x0c65:
            if (r1 != r3) goto L_0x0c6a
            r34.mo142n()
        L_0x0c6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0134d.mo155z():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo152w(C0133c cVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                C0132b bVar = cVar.f454i;
                C0132b bVar2 = bVar.f405b;
                if (bVar2 == null) {
                    break;
                }
                C0133c cVar2 = bVar2.f404a;
                C0132b bVar3 = cVar2.f456k.f405b;
                if (bVar3 == null || bVar3 != bVar || cVar2 == cVar) {
                    break;
                }
                cVar = cVar2;
            }
            while (true) {
                int i3 = this.f479ap;
                if (i2 >= i3) {
                    C0133c[] cVarArr = this.f483at;
                    int length = cVarArr.length;
                    if (i3 + 1 >= length) {
                        this.f483at = (C0133c[]) Arrays.copyOf(cVarArr, length + length);
                    }
                    C0133c[] cVarArr2 = this.f483at;
                    int i4 = this.f479ap;
                    cVarArr2[i4] = cVar;
                    this.f479ap = i4 + 1;
                    return;
                } else if (this.f483at[i2] != cVar) {
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C0132b bVar4 = cVar.f455j;
                C0132b bVar5 = bVar4.f405b;
                if (bVar5 == null) {
                    break;
                }
                C0133c cVar3 = bVar5.f404a;
                C0132b bVar6 = cVar3.f457l.f405b;
                if (bVar6 == null || bVar6 != bVar4 || cVar3 == cVar) {
                    break;
                }
                cVar = cVar3;
            }
            while (true) {
                int i5 = this.f480aq;
                if (i2 >= i5) {
                    C0133c[] cVarArr3 = this.f482as;
                    int length2 = cVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.f482as = (C0133c[]) Arrays.copyOf(cVarArr3, length2 + length2);
                    }
                    C0133c[] cVarArr4 = this.f482as;
                    int i6 = this.f480aq;
                    cVarArr4[i6] = cVar;
                    this.f480aq = i6 + 1;
                    return;
                } else if (this.f482as[i2] != cVar) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
