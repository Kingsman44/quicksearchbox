package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajb */
/* compiled from: PG */
public final class ajb implements agu {

    /* renamed from: a */
    private final ahp f20748a;

    /* renamed from: b */
    private final afx f20749b;

    /* renamed from: c */
    private final ahr f20750c;

    /* renamed from: d */
    private final aiq f20751d;

    /* renamed from: e */
    private final akx f20752e = akx.m18863b();

    public ajb(ahp ahp, afx afx, ahr ahr, aiq aiq) {
        this.f20748a = ahp;
        this.f20749b = afx;
        this.f20750c = ahr;
        this.f20751d = aiq;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.ads.interactivemedia.v3.internal.aja} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0184 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.agt mo14748a(com.google.ads.interactivemedia.p367v3.internal.age r32, com.google.ads.interactivemedia.p367v3.internal.akz r33) {
        /*
            r31 = this;
            r0 = r31
            r11 = r32
            java.lang.Class r1 = r33.mo14887a()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r2.isAssignableFrom(r1)
            r12 = 0
            if (r2 != 0) goto L_0x0012
            return r12
        L_0x0012:
            com.google.ads.interactivemedia.v3.internal.ahp r2 = r0.f20748a
            r3 = r33
            com.google.ads.interactivemedia.v3.internal.aid r13 = r2.mo14769a(r3)
            com.google.ads.interactivemedia.v3.internal.aiz r14 = new com.google.ads.interactivemedia.v3.internal.aiz
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r0 = r13
            goto L_0x01d7
        L_0x002a:
            java.lang.reflect.Type r10 = r33.mo14888b()
            r9 = r1
            r16 = r3
        L_0x0031:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r9 == r1) goto L_0x0027
            java.lang.reflect.Field[] r8 = r9.getDeclaredFields()
            int r7 = r8.length
            r6 = 0
            r5 = 0
        L_0x003c:
            if (r5 >= r7) goto L_0x01b3
            r4 = r8[r5]
            r3 = 1
            boolean r1 = r0.mo14870b(r4, r3)
            boolean r2 = r0.mo14870b(r4, r6)
            if (r1 != 0) goto L_0x005f
            if (r2 != 0) goto L_0x005c
            r28 = r5
            r25 = r7
            r26 = r8
            r33 = r9
            r27 = r13
            r30 = 0
            r13 = r10
            goto L_0x0184
        L_0x005c:
            r17 = 1
            goto L_0x0061
        L_0x005f:
            r17 = r2
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.akx r2 = r0.f20752e
            r2.mo14886a(r4)
            java.lang.reflect.Type r2 = r16.mo14888b()
            java.lang.reflect.Type r6 = r4.getGenericType()
            java.lang.reflect.Type r18 = com.google.ads.interactivemedia.p367v3.internal.aha.m18719j(r2, r9, r6)
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.agw> r2 = com.google.ads.interactivemedia.p367v3.internal.agw.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            com.google.ads.interactivemedia.v3.internal.agw r2 = (com.google.ads.interactivemedia.p367v3.internal.agw) r2
            if (r2 != 0) goto L_0x00a3
            com.google.ads.interactivemedia.v3.internal.afx r2 = r0.f20749b
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x009a
            if (r2 == r3) goto L_0x0099
            r1 = 2
            if (r2 == r1) goto L_0x0098
            r1 = 3
            if (r2 == r1) goto L_0x0097
            r1 = 4
            if (r2 == r1) goto L_0x0096
            r1 = 5
            if (r2 == r1) goto L_0x0095
            throw r12
        L_0x0095:
            throw r12
        L_0x0096:
            throw r12
        L_0x0097:
            throw r12
        L_0x0098:
            throw r12
        L_0x0099:
            throw r12
        L_0x009a:
            java.lang.String r2 = r4.getName()
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L_0x00b2
        L_0x00a3:
            java.lang.String r6 = r2.mo14751a()
            java.lang.String[] r2 = r2.mo14752b()
            int r3 = r2.length
            if (r3 != 0) goto L_0x00b6
            java.util.List r2 = java.util.Collections.singletonList(r6)
        L_0x00b2:
            r20 = r1
            r12 = r2
            goto L_0x00cd
        L_0x00b6:
            java.util.ArrayList r12 = new java.util.ArrayList
            r20 = r1
            int r1 = r3 + 1
            r12.<init>(r1)
            r12.add(r6)
            r1 = 0
        L_0x00c3:
            if (r1 >= r3) goto L_0x00cd
            r6 = r2[r1]
            r12.add(r6)
            int r1 = r1 + 1
            goto L_0x00c3
        L_0x00cd:
            int r6 = r12.size()
            r1 = r20
            r2 = 0
            r3 = 0
        L_0x00d5:
            if (r3 >= r6) goto L_0x0174
            java.lang.Object r20 = r12.get(r3)
            r21 = r12
            r12 = r20
            java.lang.String r12 = (java.lang.String) r12
            if (r3 == 0) goto L_0x00e6
            r20 = 0
            goto L_0x00e8
        L_0x00e6:
            r20 = 1
        L_0x00e8:
            r20 = r20 & r1
            com.google.ads.interactivemedia.v3.internal.akz r1 = com.google.ads.interactivemedia.p367v3.internal.akz.m18867c(r18)
            java.lang.Class r22 = r1.mo14887a()
            boolean r22 = com.google.ads.interactivemedia.p367v3.internal.aie.m18763a(r22)
            r23 = r2
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.agv> r2 = com.google.ads.interactivemedia.p367v3.internal.agv.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            com.google.ads.interactivemedia.v3.internal.agv r2 = (com.google.ads.interactivemedia.p367v3.internal.agv) r2
            if (r2 == 0) goto L_0x010b
            r24 = r3
            com.google.ads.interactivemedia.v3.internal.ahp r3 = r0.f20748a
            com.google.ads.interactivemedia.v3.internal.agt r2 = com.google.ads.interactivemedia.p367v3.internal.aiq.m18777b(r3, r11, r1, r2)
            goto L_0x010e
        L_0x010b:
            r24 = r3
            r2 = 0
        L_0x010e:
            if (r2 == 0) goto L_0x0113
            r25 = 1
            goto L_0x0115
        L_0x0113:
            r25 = 0
        L_0x0115:
            if (r2 != 0) goto L_0x011b
            com.google.ads.interactivemedia.v3.internal.agt r2 = r11.mo14704b(r1)
        L_0x011b:
            r26 = r2
            com.google.ads.interactivemedia.v3.internal.aja r3 = new com.google.ads.interactivemedia.v3.internal.aja
            r27 = r1
            r1 = r3
            r0 = r23
            r2 = r12
            r11 = r3
            r19 = r24
            r23 = 1
            r3 = r20
            r24 = r4
            r4 = r17
            r28 = r5
            r5 = r24
            r29 = r6
            r30 = 0
            r6 = r25
            r25 = r7
            r7 = r26
            r26 = r8
            r8 = r32
            r33 = r9
            r9 = r27
            r27 = r13
            r13 = r10
            r10 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r15.put(r12, r11)
            r2 = r1
            com.google.ads.interactivemedia.v3.internal.aja r2 = (com.google.ads.interactivemedia.p367v3.internal.aja) r2
            if (r0 != 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r2 = r0
        L_0x0159:
            int r3 = r19 + 1
            r0 = r31
            r11 = r32
            r9 = r33
            r10 = r13
            r1 = r20
            r12 = r21
            r4 = r24
            r7 = r25
            r8 = r26
            r13 = r27
            r5 = r28
            r6 = r29
            goto L_0x00d5
        L_0x0174:
            r0 = r2
            r28 = r5
            r25 = r7
            r26 = r8
            r33 = r9
            r27 = r13
            r30 = 0
            r13 = r10
            if (r0 != 0) goto L_0x0197
        L_0x0184:
            int r5 = r28 + 1
            r0 = r31
            r11 = r32
            r9 = r33
            r10 = r13
            r7 = r25
            r8 = r26
            r13 = r27
            r6 = 0
            r12 = 0
            goto L_0x003c
        L_0x0197:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f20739a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b3:
            r33 = r9
            r27 = r13
            r13 = r10
            java.lang.reflect.Type r0 = r16.mo14888b()
            java.lang.reflect.Type r1 = r33.getGenericSuperclass()
            r2 = r33
            java.lang.reflect.Type r0 = com.google.ads.interactivemedia.p367v3.internal.aha.m18719j(r0, r2, r1)
            com.google.ads.interactivemedia.v3.internal.akz r16 = com.google.ads.interactivemedia.p367v3.internal.akz.m18867c(r0)
            java.lang.Class r9 = r16.mo14887a()
            r0 = r31
            r11 = r32
            r13 = r27
            r12 = 0
            goto L_0x0031
        L_0x01d7:
            r14.<init>(r0, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.ajb.mo14748a(com.google.ads.interactivemedia.v3.internal.age, com.google.ads.interactivemedia.v3.internal.akz):com.google.ads.interactivemedia.v3.internal.agt");
    }

    /* renamed from: b */
    public final boolean mo14870b(Field field, boolean z) {
        ahr ahr = this.f20750c;
        return !ahr.mo14774d(field.getType(), z) && !ahr.mo14772c(field, z);
    }
}
