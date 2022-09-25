package androidx.camera.camera2.p063b;

import android.content.Context;
import android.util.Size;
import androidx.camera.camera2.p063b.p064a.C1074q;
import androidx.camera.core.p069a.C1288ab;
import androidx.camera.core.p069a.C1362cv;
import androidx.camera.core.p069a.p070a.C1284o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.b.bu */
/* compiled from: PG */
public final class C1125bu implements C1288ab {

    /* renamed from: a */
    private final Map f3338a = new HashMap();

    public C1125bu(Context context, Object obj, Set set) {
        C1074q qVar;
        if (obj instanceof C1074q) {
            qVar = (C1074q) obj;
        } else {
            C1284o.m3461a();
            qVar = C1074q.m3045b(context);
        }
        context.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f3338a.put(str, new C1172dn(context, str, qVar));
        }
    }

    /* renamed from: a */
    public final C1362cv mo3873a(String str, int i, Size size) {
        C1172dn dnVar = (C1172dn) this.f3338a.get(str);
        if (dnVar != null) {
            return C1362cv.m3720c(i, size, dnVar.f3451k);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0336, code lost:
        if (androidx.camera.core.p073b.p077b.C1437c.m3897a(java.lang.Math.max(0, r4 - 16), r10, r13) == false) goto L_0x02d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0443 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01de  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map mo3874b(java.lang.String r24, java.util.List r25, java.util.List r26) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r26.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "No new use cases to be bound."
            androidx.core.p097i.C1974i.m5314b(r3, r5)
            r3 = r23
            java.util.Map r5 = r3.f3338a
            java.lang.Object r5 = r5.get(r0)
            androidx.camera.camera2.b.dn r5 = (androidx.camera.camera2.p063b.C1172dn) r5
            if (r5 == 0) goto L_0x05ce
            androidx.camera.camera2.b.cv r0 = r5.f3452l
            android.util.Size r6 = r0.mo3945a()
            r0.f3390a = r6
            androidx.camera.core.a.cw r0 = r5.f3451k
            if (r0 != 0) goto L_0x002d
            r5.mo3973c()
            goto L_0x0042
        L_0x002d:
            androidx.camera.camera2.b.cv r0 = r5.f3452l
            android.util.Size r0 = r0.mo3946b()
            androidx.camera.core.a.cw r6 = r5.f3451k
            androidx.camera.core.a.j r6 = (androidx.camera.core.p069a.C1383j) r6
            android.util.Size r7 = r6.f3894a
            android.util.Size r6 = r6.f3896c
            androidx.camera.core.a.j r8 = new androidx.camera.core.a.j
            r8.<init>(r7, r0, r6)
            r5.f3451k = r8
        L_0x0042:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r25.iterator()
        L_0x004b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r6.next()
            androidx.camera.core.a.a r7 = (androidx.camera.core.p069a.C1236a) r7
            androidx.camera.core.a.cv r7 = r7.mo4067d()
            r0.add(r7)
            goto L_0x004b
        L_0x005f:
            java.util.Iterator r6 = r26.iterator()
        L_0x0063:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0086
            java.lang.Object r7 = r6.next()
            androidx.camera.core.a.df r7 = (androidx.camera.core.p069a.C1373df) r7
            int r7 = r7.mo3956a()
            android.util.Size r8 = new android.util.Size
            r9 = 640(0x280, float:8.97E-43)
            r10 = 480(0x1e0, float:6.73E-43)
            r8.<init>(r9, r10)
            androidx.camera.core.a.cw r9 = r5.f3451k
            androidx.camera.core.a.cv r7 = androidx.camera.core.p069a.C1362cv.m3720c(r7, r8, r9)
            r0.add(r7)
            goto L_0x0063
        L_0x0086:
            boolean r0 = r5.mo3974d(r0)
            java.lang.String r6 = " New configs: "
            java.lang.String r7 = "No supported surface combination is found for camera device - Id : "
            if (r0 == 0) goto L_0x05a8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r26.iterator()
        L_0x009e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00bc
            java.lang.Object r10 = r9.next()
            androidx.camera.core.a.df r10 = (androidx.camera.core.p069a.C1373df) r10
            int r10 = r10.mo3965o()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r11 = r8.contains(r10)
            if (r11 != 0) goto L_0x009e
            r8.add(r10)
            goto L_0x009e
        L_0x00bc:
            java.util.Collections.sort(r8)
            java.util.Collections.reverse(r8)
            int r9 = r8.size()
            r11 = 0
        L_0x00c7:
            if (r11 >= r9) goto L_0x00f9
            java.lang.Object r12 = r8.get(r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.util.Iterator r13 = r26.iterator()
        L_0x00d7:
            int r14 = r11 + 1
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00f7
            java.lang.Object r14 = r13.next()
            androidx.camera.core.a.df r14 = (androidx.camera.core.p069a.C1373df) r14
            int r15 = r14.mo3965o()
            if (r12 != r15) goto L_0x00d7
            int r14 = r2.indexOf(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.add(r14)
            goto L_0x00d7
        L_0x00f7:
            r11 = r14
            goto L_0x00c7
        L_0x00f9:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x0102:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0457
            java.lang.Object r11 = r9.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r11 = r2.get(r11)
            androidx.camera.core.a.df r11 = (androidx.camera.core.p069a.C1373df) r11
            int r13 = r11.mo3956a()
            r14 = r11
            androidx.camera.core.a.bo r14 = (androidx.camera.core.p069a.C1328bo) r14
            java.util.List r15 = r14.mo4190x()
            if (r15 == 0) goto L_0x0146
            java.util.Iterator r15 = r15.iterator()
        L_0x0129:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0146
            java.lang.Object r16 = r15.next()
            r12 = r16
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r10 = r12.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 != r13) goto L_0x0129
            java.lang.Object r10 = r12.second
            android.util.Size[] r10 = (android.util.Size[]) r10
            goto L_0x0147
        L_0x0146:
            r10 = 0
        L_0x0147:
            if (r10 == 0) goto L_0x0156
            android.util.Size[] r10 = r5.mo3975e(r10, r13)
            androidx.camera.core.a.a.c r12 = new androidx.camera.core.a.a.c
            r12.<init>(r4)
            java.util.Arrays.sort(r10, r12)
            goto L_0x0157
        L_0x0156:
            r10 = 0
        L_0x0157:
            if (r10 != 0) goto L_0x015d
            android.util.Size[] r10 = r5.mo3976f(r13)
        L_0x015d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.util.Size r15 = r14.mo4189w()
            android.util.Size r17 = r5.mo3971a(r13)
            if (r15 == 0) goto L_0x0176
            int r4 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r17)
            int r3 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r15)
            if (r4 >= r3) goto L_0x0178
        L_0x0176:
            r15 = r17
        L_0x0178:
            androidx.camera.core.a.a.c r3 = new androidx.camera.core.a.a.c
            r4 = 1
            r3.<init>(r4)
            java.util.Arrays.sort(r10, r3)
            android.util.Size r3 = r5.mo3972b(r14)
            android.util.Size r4 = androidx.camera.core.p073b.p077b.C1438d.f3995a
            android.util.Size r17 = androidx.camera.core.p073b.p077b.C1438d.f3995a
            r18 = r4
            int r4 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r17)
            r17 = r9
            int r9 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r15)
            if (r9 >= r4) goto L_0x019a
            android.util.Size r4 = androidx.camera.camera2.p063b.C1172dn.f3439a
            goto L_0x01a6
        L_0x019a:
            if (r3 == 0) goto L_0x01a4
            int r9 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r3)
            if (r9 >= r4) goto L_0x01a4
            r4 = r3
            goto L_0x01a6
        L_0x01a4:
            r4 = r18
        L_0x01a6:
            int r9 = r10.length
            r18 = r6
            r6 = 0
        L_0x01aa:
            if (r6 >= r9) goto L_0x01d8
            r19 = r9
            r9 = r10[r6]
            r20 = r10
            int r10 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r9)
            int r1 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r15)
            if (r10 > r1) goto L_0x01cf
            int r1 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r9)
            int r10 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r4)
            if (r1 < r10) goto L_0x01cf
            boolean r1 = r12.contains(r9)
            if (r1 != 0) goto L_0x01cf
            r12.add(r9)
        L_0x01cf:
            int r6 = r6 + 1
            r1 = r25
            r9 = r19
            r10 = r20
            goto L_0x01aa
        L_0x01d8:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x0443
            androidx.camera.camera2.b.a.k r1 = r5.f3448h
            androidx.camera.core.a.cg r4 = androidx.camera.camera2.p063b.p064a.p066b.C1027l.f3156a
            java.lang.Class<androidx.camera.camera2.b.a.b.x> r6 = androidx.camera.camera2.p063b.p064a.p066b.C1039x.class
            androidx.camera.core.a.cf r4 = r4.mo4225a(r6)
            androidx.camera.camera2.b.a.b.x r4 = (androidx.camera.camera2.p063b.p064a.p066b.C1039x) r4
            if (r4 == 0) goto L_0x01ee
        L_0x01ec:
            r4 = 1
            goto L_0x024b
        L_0x01ee:
            androidx.camera.core.a.cg r1 = androidx.camera.camera2.p063b.p064a.p066b.C1022g.m3022a(r1)
            java.lang.Class<androidx.camera.camera2.b.a.b.c> r4 = androidx.camera.camera2.p063b.p064a.p066b.C1018c.class
            androidx.camera.core.a.cf r1 = r1.mo4225a(r4)
            androidx.camera.camera2.b.a.b.c r1 = (androidx.camera.camera2.p063b.p064a.p066b.C1018c) r1
            if (r1 != 0) goto L_0x01ec
            android.util.Size r1 = r5.mo3972b(r14)
            boolean r4 = r14.mo4186t()
            if (r4 == 0) goto L_0x0238
            int r1 = r14.mo4185s()
            if (r1 == 0) goto L_0x022d
            r4 = 1
            if (r1 == r4) goto L_0x0223
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Undefined target aspect ratio: "
            r6.<init>(r9)
            r6.append(r1)
            java.lang.String r1 = "SupportedSurfaceCombination"
            java.lang.String r6 = r6.toString()
            androidx.camera.core.C1477bw.m3980c(r1, r6)
            goto L_0x0249
        L_0x0223:
            boolean r1 = r5.f3450j
            if (r1 == 0) goto L_0x022a
            android.util.Rational r1 = androidx.camera.camera2.p063b.C1172dn.f3442d
            goto L_0x0272
        L_0x022a:
            android.util.Rational r1 = androidx.camera.camera2.p063b.C1172dn.f3443e
            goto L_0x0272
        L_0x022d:
            r4 = 1
            boolean r1 = r5.f3450j
            if (r1 == 0) goto L_0x0235
            android.util.Rational r1 = androidx.camera.camera2.p063b.C1172dn.f3440b
            goto L_0x0272
        L_0x0235:
            android.util.Rational r1 = androidx.camera.camera2.p063b.C1172dn.f3441c
            goto L_0x0272
        L_0x0238:
            r4 = 1
            if (r1 == 0) goto L_0x0249
            android.util.Rational r6 = new android.util.Rational
            int r9 = r1.getWidth()
            int r1 = r1.getHeight()
            r6.<init>(r9, r1)
            goto L_0x0271
        L_0x0249:
            r1 = 0
            goto L_0x0272
        L_0x024b:
            java.util.Map r1 = r5.f3446f
            r6 = 256(0x100, float:3.59E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.get(r9)
            android.util.Size r1 = (android.util.Size) r1
            if (r1 != 0) goto L_0x0264
            android.util.Size r1 = r5.mo3971a(r6)
            java.util.Map r6 = r5.f3446f
            r6.put(r9, r1)
        L_0x0264:
            android.util.Rational r6 = new android.util.Rational
            int r9 = r1.getWidth()
            int r1 = r1.getHeight()
            r6.<init>(r9, r1)
        L_0x0271:
            r1 = r6
        L_0x0272:
            if (r3 != 0) goto L_0x0278
            android.util.Size r3 = r14.mo4188v()
        L_0x0278:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            if (r1 != 0) goto L_0x0290
            r6.addAll(r12)
            if (r3 == 0) goto L_0x028c
            androidx.camera.camera2.p063b.C1172dn.m3252g(r6, r3)
        L_0x028c:
            r21 = r7
            goto L_0x03f8
        L_0x0290:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.util.Rational r10 = androidx.camera.camera2.p063b.C1172dn.f3440b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r9.put(r10, r13)
            android.util.Rational r10 = androidx.camera.camera2.p063b.C1172dn.f3442d
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r9.put(r10, r13)
            java.util.Iterator r10 = r12.iterator()
        L_0x02ad:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0394
            java.lang.Object r12 = r10.next()
            android.util.Size r12 = (android.util.Size) r12
            java.util.Set r13 = r9.keySet()
            java.util.Iterator r13 = r13.iterator()
            r14 = 0
        L_0x02c2:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x036c
            java.lang.Object r15 = r13.next()
            android.util.Rational r15 = (android.util.Rational) r15
            if (r15 != 0) goto L_0x02d9
            r21 = r7
            r19 = r10
            r20 = r13
        L_0x02d6:
            r4 = 0
            goto L_0x034c
        L_0x02d9:
            android.util.Rational r4 = new android.util.Rational
            r19 = r10
            int r10 = r12.getWidth()
            r20 = r13
            int r13 = r12.getHeight()
            r4.<init>(r10, r13)
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x02f4
            r21 = r7
        L_0x02f2:
            r4 = 1
            goto L_0x034c
        L_0x02f4:
            int r4 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r12)
            android.util.Size r10 = androidx.camera.core.p073b.p077b.C1438d.f3995a
            int r10 = androidx.camera.core.p073b.p077b.C1438d.m3898a(r10)
            if (r4 < r10) goto L_0x0349
            int r4 = r12.getWidth()
            int r10 = r12.getHeight()
            android.util.Rational r13 = new android.util.Rational
            r21 = r7
            int r7 = r15.getDenominator()
            int r2 = r15.getNumerator()
            r13.<init>(r7, r2)
            int r2 = r4 % 16
            if (r2 != 0) goto L_0x0339
            int r2 = r10 % 16
            if (r2 != 0) goto L_0x0344
            int r2 = r10 + -16
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            boolean r2 = androidx.camera.core.p073b.p077b.C1437c.m3897a(r2, r4, r15)
            if (r2 != 0) goto L_0x02f2
            int r4 = r4 + -16
            int r2 = java.lang.Math.max(r7, r4)
            boolean r2 = androidx.camera.core.p073b.p077b.C1437c.m3897a(r2, r10, r13)
            if (r2 == 0) goto L_0x02d6
            goto L_0x02f2
        L_0x0339:
            if (r2 == 0) goto L_0x0344
            int r2 = r10 % 16
            if (r2 != 0) goto L_0x02d6
            boolean r4 = androidx.camera.core.p073b.p077b.C1437c.m3897a(r4, r10, r13)
            goto L_0x034c
        L_0x0344:
            boolean r4 = androidx.camera.core.p073b.p077b.C1437c.m3897a(r10, r4, r15)
            goto L_0x034c
        L_0x0349:
            r21 = r7
            goto L_0x02d6
        L_0x034c:
            if (r4 == 0) goto L_0x0361
            java.lang.Object r2 = r9.get(r15)
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r2.contains(r12)
            if (r4 != 0) goto L_0x035d
            r2.add(r12)
        L_0x035d:
            r2 = r26
            r14 = r15
            goto L_0x0363
        L_0x0361:
            r2 = r26
        L_0x0363:
            r10 = r19
            r13 = r20
            r7 = r21
            r4 = 1
            goto L_0x02c2
        L_0x036c:
            r21 = r7
            r19 = r10
            if (r14 != 0) goto L_0x038b
            android.util.Rational r2 = new android.util.Rational
            int r4 = r12.getWidth()
            int r7 = r12.getHeight()
            r2.<init>(r4, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Set r7 = java.util.Collections.singleton(r12)
            r4.<init>(r7)
            r9.put(r2, r4)
        L_0x038b:
            r2 = r26
            r10 = r19
            r7 = r21
            r4 = 1
            goto L_0x02ad
        L_0x0394:
            r21 = r7
            if (r3 == 0) goto L_0x03b6
            java.util.Set r2 = r9.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x03a0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03b6
            java.lang.Object r4 = r2.next()
            android.util.Rational r4 = (android.util.Rational) r4
            java.lang.Object r4 = r9.get(r4)
            java.util.List r4 = (java.util.List) r4
            androidx.camera.camera2.p063b.C1172dn.m3252g(r4, r3)
            goto L_0x03a0
        L_0x03b6:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r9.keySet()
            r2.<init>(r3)
            androidx.camera.core.b.b.b r3 = new androidx.camera.core.b.b.b
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
            int r1 = r2.size()
            r7 = 0
        L_0x03cc:
            if (r7 >= r1) goto L_0x03f8
            java.lang.Object r3 = r2.get(r7)
            android.util.Rational r3 = (android.util.Rational) r3
            java.lang.Object r3 = r9.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x03de:
            int r4 = r7 + 1
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x03f6
            java.lang.Object r4 = r3.next()
            android.util.Size r4 = (android.util.Size) r4
            boolean r10 = r6.contains(r4)
            if (r10 != 0) goto L_0x03de
            r6.add(r4)
            goto L_0x03de
        L_0x03f6:
            r7 = r4
            goto L_0x03cc
        L_0x03f8:
            androidx.camera.camera2.b.a.c.j r1 = r5.f3453m
            int r2 = r11.mo3956a()
            int r2 = androidx.camera.core.p069a.C1362cv.m3721d(r2)
            androidx.camera.camera2.b.a.b.n r1 = r1.f3183a
            if (r1 != 0) goto L_0x0407
            goto L_0x0431
        L_0x0407:
            android.util.Size r1 = androidx.camera.camera2.p063b.p064a.p066b.C1029n.m3027b(r2)
            if (r1 != 0) goto L_0x040e
            goto L_0x0431
        L_0x040e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
            java.util.Iterator r3 = r6.iterator()
        L_0x041a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0430
            java.lang.Object r4 = r3.next()
            android.util.Size r4 = (android.util.Size) r4
            boolean r6 = r4.equals(r1)
            if (r6 != 0) goto L_0x041a
            r2.add(r4)
            goto L_0x041a
        L_0x0430:
            r6 = r2
        L_0x0431:
            r8.add(r6)
            r3 = r23
            r1 = r25
            r2 = r26
            r9 = r17
            r6 = r18
            r7 = r21
            r4 = 1
            goto L_0x0102
        L_0x0443:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can not get supported output size under supported maximum for the format: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0457:
            r18 = r6
            r21 = r7
            java.util.Iterator r1 = r8.iterator()
            r4 = 1
        L_0x0460:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0473
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r4 = r4 * r2
            goto L_0x0460
        L_0x0473:
            if (r4 == 0) goto L_0x05a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = 0
        L_0x047b:
            if (r7 >= r4) goto L_0x0488
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.add(r2)
            int r7 = r7 + 1
            goto L_0x047b
        L_0x0488:
            r7 = 0
            java.lang.Object r2 = r8.get(r7)
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r2 = r4 / r2
            r6 = r4
            r3 = 0
        L_0x0497:
            int r9 = r8.size()
            if (r3 >= r9) goto L_0x04d9
            java.lang.Object r9 = r8.get(r3)
            java.util.List r9 = (java.util.List) r9
            r10 = 0
        L_0x04a4:
            if (r10 >= r4) goto L_0x04bb
            java.lang.Object r11 = r1.get(r10)
            java.util.List r11 = (java.util.List) r11
            int r12 = r10 % r6
            int r12 = r12 / r2
            java.lang.Object r12 = r9.get(r12)
            android.util.Size r12 = (android.util.Size) r12
            r11.add(r12)
            int r10 = r10 + 1
            goto L_0x04a4
        L_0x04bb:
            int r9 = r8.size()
            int r9 = r9 + -1
            if (r3 >= r9) goto L_0x04d6
            int r6 = r3 + 1
            java.lang.Object r6 = r8.get(r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int r6 = r2 / r6
            r22 = r6
            r6 = r2
            r2 = r22
        L_0x04d6:
            int r3 = r3 + 1
            goto L_0x0497
        L_0x04d9:
            java.util.Iterator r1 = r1.iterator()
        L_0x04dd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0568
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r25.iterator()
        L_0x04f2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0506
            java.lang.Object r6 = r4.next()
            androidx.camera.core.a.a r6 = (androidx.camera.core.p069a.C1236a) r6
            androidx.camera.core.a.cv r6 = r6.mo4067d()
            r3.add(r6)
            goto L_0x04f2
        L_0x0506:
            r4 = 0
        L_0x0507:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x0535
            java.lang.Object r6 = r2.get(r4)
            android.util.Size r6 = (android.util.Size) r6
            java.lang.Object r8 = r0.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r26
            java.lang.Object r8 = r9.get(r8)
            androidx.camera.core.a.df r8 = (androidx.camera.core.p069a.C1373df) r8
            int r8 = r8.mo3956a()
            androidx.camera.core.a.cw r10 = r5.f3451k
            androidx.camera.core.a.cv r6 = androidx.camera.core.p069a.C1362cv.m3720c(r8, r6, r10)
            r3.add(r6)
            int r4 = r4 + 1
            goto L_0x0507
        L_0x0535:
            r9 = r26
            boolean r3 = r5.mo3974d(r3)
            if (r3 == 0) goto L_0x04dd
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Iterator r1 = r26.iterator()
        L_0x0546:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x056b
            java.lang.Object r3 = r1.next()
            androidx.camera.core.a.df r3 = (androidx.camera.core.p069a.C1373df) r3
            int r4 = r9.indexOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r0.indexOf(r4)
            java.lang.Object r4 = r2.get(r4)
            android.util.Size r4 = (android.util.Size) r4
            r12.put(r3, r4)
            goto L_0x0546
        L_0x0568:
            r9 = r26
            r12 = 0
        L_0x056b:
            if (r12 == 0) goto L_0x056e
            return r12
        L_0x056e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r21
            r1.<init>(r2)
            java.lang.String r2 = r5.f3447g
            r1.append(r2)
            java.lang.String r2 = " and Hardware level: "
            r1.append(r2)
            int r2 = r5.f3449i
            r1.append(r2)
            java.lang.String r2 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r1.append(r2)
            r3 = r25
            r1.append(r3)
            r4 = r18
            r1.append(r4)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x05a8:
            r3 = r1
            r9 = r2
            r4 = r6
            r2 = r7
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = r5.f3447g
            r1.append(r2)
            java.lang.String r2 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            r1.append(r2)
            r1.append(r3)
            r1.append(r4)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05ce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No such camera id in supported combination list: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            goto L_0x05db
        L_0x05da:
            throw r1
        L_0x05db:
            goto L_0x05da
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1125bu.mo3874b(java.lang.String, java.util.List, java.util.List):java.util.Map");
    }
}
