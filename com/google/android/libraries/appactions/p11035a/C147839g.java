package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63061fz;
import com.google.protobuf.C63063ga;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.appactions.a.g */
/* compiled from: PG */
public final class C147839g {

    /* renamed from: a */
    public static final C59071e f398858a = C59071e.m91332i("com.google.android.libraries.appactions.a.g");

    /* renamed from: b */
    public final C147828ad f398859b;

    public C147839g(C147828ad adVar) {
        this.f398859b = adVar;
    }

    /* renamed from: a */
    public static C58495hd m240966a(String str, C63063ga gaVar) {
        C63037fb fbVar;
        if (C63061fz.m96003b(gaVar.f170181a) != 5) {
            return C58495hd.m89900n(str, gaVar);
        }
        C58490gz gzVar = new C58490gz(4);
        if (gaVar.f170181a == 5) {
            fbVar = (C63037fb) gaVar.f170182b;
        } else {
            fbVar = C63037fb.f170144b;
        }
        for (Map.Entry entry : Collections.unmodifiableMap(fbVar.f170146a).entrySet()) {
            gzVar.mo55433l(m240966a(str + "." + ((String) entry.getKey()), (C63063ga) entry.getValue()));
        }
        return gzVar.mo55427f(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0360, code lost:
        r20 = r1;
        r5 = r9.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0384 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo124517b(java.lang.String r19, java.lang.String r20, com.google.common.p4522b.C58495hd r21, p3186j$.util.Optional r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.libraries.appactions.a.ad r3 = r0.f398859b
            j$.util.Optional r3 = r3.mo124504c(r1, r2)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0398
            java.lang.Object r4 = r3.get()
            com.google.android.libraries.appactions.a.ai r4 = (com.google.android.libraries.appactions.p11035a.C147833ai) r4
            com.google.common.b.gu r4 = r4.mo124513a()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0024
            goto L_0x0398
        L_0x0024:
            java.lang.Object r3 = r3.get()
            com.google.android.libraries.appactions.a.ai r3 = (com.google.android.libraries.appactions.p11035a.C147833ai) r3
            com.google.android.libraries.appactions.a.ah r4 = new com.google.android.libraries.appactions.a.ah
            r4.<init>()
            boolean r5 = r22.isPresent()
            r6 = 1
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = r22.get()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x004c
            r4.f398847f = r6
            java.lang.Object r5 = r22.get()
            java.lang.String r5 = (java.lang.String) r5
            r4.f398846e = r5
        L_0x004c:
            com.google.common.b.gu r3 = r3.mo124513a()
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.android.libraries.appactions.a.e r5 = new com.google.android.libraries.appactions.a.e
            r5.<init>(r4)
            r3.forEach(r5)
            com.google.common.b.gz r3 = new com.google.common.b.gz
            r5 = 4
            r3.<init>(r5)
            com.google.android.libraries.appactions.a.b r5 = new com.google.android.libraries.appactions.a.b
            r5.<init>(r3)
            r7 = r21
            p3186j$.util.Map.EL.forEach(r7, r5)
            com.google.common.b.hd r3 = r3.mo55427f(r6)
            com.google.common.b.ij r3 = r3.entrySet()
            com.google.common.b.sl r3 = r3.iterator()
        L_0x007b:
            boolean r5 = r3.hasNext()
            java.lang.String r7 = ""
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.getValue()
            com.google.protobuf.ga r5 = (com.google.protobuf.C63063ga) r5
            java.util.Map r9 = r4.f398842a
            r9.put(r8, r5)
            int r9 = r5.f170181a
            r10 = 3
            if (r9 != r10) goto L_0x00a3
            java.lang.Object r7 = r5.f170182b
            java.lang.String r7 = (java.lang.String) r7
        L_0x00a3:
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x00bc
            com.google.common.f.e r7 = f398858a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r9 = "No string value found for: %s"
            r10 = 42253(0xa50d, float:5.9209E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56389s(r9, r8)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x00e4
        L_0x00bc:
            com.google.android.libraries.appactions.a.ad r9 = r0.f398859b
            com.google.common.b.gw r9 = r9.f398830a
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r10)
            com.google.common.b.gu r7 = r9.mo55277g(r7)
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.libraries.appactions.a.c r9 = new com.google.android.libraries.appactions.a.c
            r9.<init>(r1)
            j$.util.stream.Stream r7 = r7.filter(r9)
            com.google.android.libraries.appactions.a.d r9 = new com.google.android.libraries.appactions.a.d
            r9.<init>(r0, r1, r8, r2)
            j$.util.stream.Stream r7 = r7.filter(r9)
            j$.util.Optional r7 = r7.findAny()
        L_0x00e4:
            com.google.android.libraries.appactions.a.f r9 = new com.google.android.libraries.appactions.a.f
            r9.<init>(r8, r5, r4)
            r7.ifPresent(r9)
            goto L_0x007b
        L_0x00ed:
            java.util.List r1 = r4.f398844c
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0392
            java.lang.Object r2 = r1.next()
            com.google.b.c.e r2 = (com.google.p4129b.p4136c.C54757e) r2
            boolean r3 = com.google.android.libraries.appactions.p11035a.C147832ah.m240962a(r2)
            if (r3 == 0) goto L_0x0113
            boolean r3 = r4.f398847f
            if (r3 == 0) goto L_0x00f3
            java.lang.String r3 = r2.f143675c
            java.lang.String r5 = r4.f398846e
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00f3
        L_0x0113:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.b.c.x r8 = r2.f143674b
            if (r8 != 0) goto L_0x0123
            com.google.b.c.x r8 = com.google.p4129b.p4136c.C54776x.f143709e
        L_0x0123:
            com.google.protobuf.dn r9 = r8.f143712b
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)
            com.google.android.libraries.appactions.a.ag r10 = new com.google.android.libraries.appactions.a.ag
            r10.<init>(r4, r3, r5)
            p3186j$.util.Map.EL.forEach(r9, r10)
            java.util.Set r9 = r3.keySet()
            com.google.protobuf.cq r10 = r8.f143713c
            boolean r9 = r9.containsAll(r10)
            if (r9 != 0) goto L_0x0147
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0141:
            r20 = r1
            r16 = 1
            goto L_0x037e
        L_0x0147:
            com.google.protobuf.cq r9 = r8.f143714d
            boolean r5 = r5.containsAll(r9)
            if (r5 != 0) goto L_0x0154
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0141
        L_0x0154:
            java.lang.String r5 = r8.f143711a
            java.util.Set r8 = r3.keySet()
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r6
            java.lang.String r9 = "{@url}"
            boolean r10 = r5.startsWith(r9)
            if (r10 == 0) goto L_0x018a
            java.lang.String r8 = r4.f398845d
            if (r8 == 0) goto L_0x0185
            com.google.common.q.s r10 = com.google.common.p4574q.C60740s.m92701a(r8)
            java.lang.String r10 = r10.f164765e
            boolean r10 = com.google.common.base.C58837ba.m90859h(r10)
            if (r10 != 0) goto L_0x017f
            java.lang.String r10 = "\\?"
            java.lang.String r11 = "&"
            java.lang.String r5 = r5.replaceFirst(r10, r11)
        L_0x017f:
            java.lang.String r5 = r5.replace(r9, r8)
            r8 = 1
            goto L_0x018a
        L_0x0185:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0141
        L_0x018a:
            java.util.Map r3 = com.google.p4591e.p4592a.p4593a.C61015b.m93273b(r3)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r5.length()
            r11 = 0
            r12 = 0
        L_0x0199:
            if (r12 >= r10) goto L_0x0360
            r13 = 123(0x7b, float:1.72E-43)
            int r13 = r5.indexOf(r13, r12)
            r14 = -1
            if (r13 != r14) goto L_0x01b5
            if (r12 == 0) goto L_0x01af
            java.lang.String r3 = r5.substring(r12)
            r9.append(r3)
            goto L_0x0360
        L_0x01af:
            r20 = r1
            r16 = 1
            goto L_0x0368
        L_0x01b5:
            java.lang.String r12 = r5.substring(r12, r13)
            r9.append(r12)
            int r12 = r13 + 2
            r14 = 125(0x7d, float:1.75E-43)
            int r12 = r5.indexOf(r14, r12)
            int r14 = r12 + 1
            int r13 = r13 + 1
            java.lang.String r12 = r5.substring(r13, r12)
            java.util.Map r13 = com.google.p4591e.p4592a.p4593a.C61015b.f165232a
            char r15 = r12.charAt(r11)
            java.lang.Character r15 = java.lang.Character.valueOf(r15)
            java.lang.Object r13 = r13.get(r15)
            com.google.e.a.a.a r13 = (com.google.p4591e.p4592a.p4593a.C61014a) r13
            if (r13 != 0) goto L_0x01e0
            com.google.e.a.a.a r13 = com.google.p4591e.p4592a.p4593a.C61014a.SIMPLE
        L_0x01e0:
            com.google.common.base.m r15 = new com.google.common.base.m
            r11 = 44
            r15.<init>(r11)
            com.google.common.base.cf r11 = com.google.common.base.C58869cf.m90936b(r15)
            java.util.List r11 = r11.mo56155i(r12)
            java.util.ListIterator r11 = r11.listIterator()
            r12 = 1
        L_0x01f4:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x035a
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r6 = "*"
            boolean r6 = r15.endsWith(r6)
            int r0 = r11.nextIndex()
            r20 = r1
            r1 = 1
            if (r0 != r1) goto L_0x0216
            java.lang.Character r0 = r13.f165227i
            if (r0 != 0) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r0 = 1
            goto L_0x0217
        L_0x0216:
            r0 = 0
        L_0x0217:
            int r1 = r15.length()
            if (r6 == 0) goto L_0x021f
            int r1 = r1 + -1
        L_0x021f:
            java.lang.String r0 = r15.substring(r0, r1)
            java.lang.Object r1 = r3.remove(r0)
            if (r1 == 0) goto L_0x0351
            if (r12 != 0) goto L_0x0231
            java.lang.String r12 = r13.f165229k
            r9.append(r12)
            goto L_0x0236
        L_0x0231:
            java.lang.String r12 = r13.f165228j
            r9.append(r12)
        L_0x0236:
            boolean r12 = r1 instanceof java.util.Iterator
            if (r12 == 0) goto L_0x0248
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.String r1 = com.google.p4591e.p4592a.p4593a.C61015b.m93272a(r0, r1, r6, r13)
            r21 = r3
        L_0x0242:
            r16 = 1
            r17 = 0
            goto L_0x0344
        L_0x0248:
            boolean r12 = r1 instanceof java.lang.Iterable
            if (r12 != 0) goto L_0x0332
            java.lang.Class r12 = r1.getClass()
            boolean r12 = r12.isArray()
            if (r12 == 0) goto L_0x0258
            goto L_0x0332
        L_0x0258:
            java.lang.Class r12 = r1.getClass()
            boolean r12 = r12.isEnum()
            java.lang.String r15 = "%s=%s"
            r21 = r3
            r3 = 2
            if (r12 == 0) goto L_0x028d
            r6 = r1
            java.lang.Enum r6 = (java.lang.Enum) r6
            com.google.e.a.d.n r6 = com.google.p4591e.p4592a.p4603d.C61060n.m93423a(r6)
            java.lang.String r6 = r6.f165331c
            if (r6 == 0) goto L_0x0242
            boolean r6 = r13.f165230l
            if (r6 == 0) goto L_0x0282
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 0
            r3[r6] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.String r1 = java.lang.String.format(r15, r3)
        L_0x0282:
            java.lang.String r0 = r1.toString()
            com.google.e.a.d.a.b r1 = com.google.p4591e.p4592a.p4603d.p4604a.C61040a.f165277b
            java.lang.String r1 = r1.mo57591a(r0)
            goto L_0x0242
        L_0x028d:
            boolean r12 = com.google.p4591e.p4592a.p4603d.C61054h.m93417k(r1)
            if (r12 != 0) goto L_0x0301
            java.util.Map r1 = com.google.p4591e.p4592a.p4593a.C61015b.m93273b(r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x029f
            r1 = r7
            goto L_0x0242
        L_0x029f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "="
            if (r6 == 0) goto L_0x02ab
            java.lang.String r0 = r13.f165229k
            goto L_0x02be
        L_0x02ab:
            boolean r6 = r13.f165230l
            if (r6 == 0) goto L_0x02bb
            com.google.e.a.d.a.b r6 = com.google.p4591e.p4592a.p4603d.p4604a.C61040a.f165277b
            java.lang.String r0 = r6.mo57591a(r0)
            r3.append(r0)
            r3.append(r12)
        L_0x02bb:
            java.lang.String r12 = ","
            r0 = r12
        L_0x02be:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02c6:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x02fb
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r15 = r6.getKey()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = r13.mo57532a(r15)
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r13.mo57532a(r6)
            r3.append(r15)
            r3.append(r12)
            r3.append(r6)
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x02c6
            r3.append(r0)
            goto L_0x02c6
        L_0x02fb:
            java.lang.String r1 = r3.toString()
            goto L_0x0242
        L_0x0301:
            boolean r6 = r13.f165230l
            if (r6 == 0) goto L_0x0314
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r17 = 0
            r3[r17] = r0
            r16 = 1
            r3[r16] = r1
            java.lang.String r1 = java.lang.String.format(r15, r3)
            goto L_0x0318
        L_0x0314:
            r16 = 1
            r17 = 0
        L_0x0318:
            boolean r0 = r13.f165231m
            if (r0 == 0) goto L_0x0327
            java.lang.String r0 = r1.toString()
            com.google.e.a.d.a.b r1 = com.google.p4591e.p4592a.p4603d.p4604a.C61040a.f165278c
            java.lang.String r1 = r1.mo57591a(r0)
            goto L_0x0344
        L_0x0327:
            java.lang.String r0 = r1.toString()
            com.google.e.a.d.a.b r1 = com.google.p4591e.p4592a.p4603d.p4604a.C61040a.f165277b
            java.lang.String r1 = r1.mo57591a(r0)
            goto L_0x0344
        L_0x0332:
            r21 = r3
            r16 = 1
            r17 = 0
            java.lang.Iterable r1 = com.google.p4591e.p4592a.p4603d.C61046aa.m93386c(r1)
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = com.google.p4591e.p4592a.p4593a.C61015b.m93272a(r0, r1, r6, r13)
        L_0x0344:
            r9.append(r1)
            r0 = r18
            r1 = r20
            r3 = r21
            r6 = 1
            r12 = 0
            goto L_0x01f4
        L_0x0351:
            r16 = 1
            r0 = r18
            r1 = r20
            r6 = 1
            goto L_0x01f4
        L_0x035a:
            r0 = r18
            r12 = r14
            r11 = 0
            goto L_0x0199
        L_0x0360:
            r20 = r1
            r16 = 1
            java.lang.String r5 = r9.toString()
        L_0x0368:
            int r0 = r2.f143673a
            int r1 = com.google.p4129b.p4136c.C54756d.m87526a(r0)
            if (r1 != 0) goto L_0x0371
            r1 = 1
        L_0x0371:
            boolean r0 = com.google.android.libraries.appactions.p11035a.C147832ah.m240962a(r2)
            com.google.android.libraries.appactions.a.ae r2 = new com.google.android.libraries.appactions.a.ae
            r2.<init>(r5, r1, r8, r0)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
        L_0x037e:
            boolean r0 = r2.isPresent()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r0 = r2.get()
            com.google.android.libraries.appactions.a.h r0 = (com.google.android.libraries.appactions.p11035a.C147840h) r0
            goto L_0x0393
        L_0x038b:
            r0 = r18
            r1 = r20
            r6 = 1
            goto L_0x00f3
        L_0x0392:
            r0 = 0
        L_0x0393:
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            return r0
        L_0x0398:
            com.google.common.f.e r0 = f398858a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 42252(0xa50c, float:5.9208E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r3 = "Could not find any fulfillment options for: (%s, %s)"
            r0.mo56354G(r3, r1, r2)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.p11035a.C147839g.mo124517b(java.lang.String, java.lang.String, com.google.common.b.hd, j$.util.Optional):j$.util.Optional");
    }
}
