package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8263a;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8382c;
import com.google.p386ak.C8399o;
import com.google.p386ak.p388b.C8327aa;
import com.google.p386ak.p388b.C8341ao;
import com.google.p386ak.p388b.C8380y;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.b.a.q */
/* compiled from: PG */
public final class C8317q implements C8267ab {

    /* renamed from: a */
    private final C8380y f29120a;

    /* renamed from: b */
    private final C8382c f29121b;

    /* renamed from: c */
    private final C8327aa f29122c;

    /* renamed from: d */
    private final List f29123d;

    public C8317q(C8380y yVar, C8382c cVar, C8327aa aaVar, List list) {
        this.f29120a = yVar;
        this.f29121b = cVar;
        this.f29122c = aaVar;
        this.f29123d = list;
    }

    /* renamed from: b */
    public static void m23072b(Object obj, Field field) {
        if (true == Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (!C8341ao.f29171b.mo17085a(field, obj)) {
            String name = field.getDeclaringClass().getName();
            String name2 = field.getName();
            throw new C8399o("Field '" + name + "#" + name2 + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
        }
    }

    /* renamed from: c */
    private final boolean m23073c(Field field, boolean z) {
        List<C8263a> list;
        C8327aa aaVar = this.f29122c;
        if (aaVar.mo17042c(field.getType()) || aaVar.mo17045e(z)) {
            return false;
        }
        C8327aa aaVar2 = this.f29122c;
        int i = aaVar2.f29140c;
        if ((field.getModifiers() & 136) != 0) {
            return false;
        }
        double d = aaVar2.f29139b;
        if (field.isSynthetic()) {
            return false;
        }
        boolean z2 = aaVar2.f29141d;
        if (aaVar2.mo17044d(field.getType())) {
            return false;
        }
        if (z) {
            list = aaVar2.f29142e;
        } else {
            list = aaVar2.f29143f;
        }
        if (list.isEmpty()) {
            return true;
        }
        Field field2 = (Field) Objects.requireNonNull(field);
        for (C8263a b : list) {
            if (b.mo17024b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.google.ak.b.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p386ak.C8266aa mo17031a(com.google.p386ak.C8393i r39, com.google.p386ak.p393c.C8383a r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
            java.lang.Class r13 = r2.f29213a
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r3.isAssignableFrom(r13)
            r14 = 0
            if (r3 != 0) goto L_0x0012
            return r14
        L_0x0012:
            java.util.List r3 = r1.f29123d
            int r3 = com.google.p386ak.p388b.C8342ap.m23113a(r3)
            java.lang.String r15 = "ReflectionAccessFilter does not permit using reflection for "
            r12 = 4
            if (r3 == r12) goto L_0x0294
            r11 = 3
            r9 = 1
            if (r3 != r11) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            com.google.ak.b.y r4 = r1.f29120a
            com.google.ak.b.al r8 = r4.mo17104a(r2)
            com.google.ak.b.a.o r7 = new com.google.ak.b.a.o
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            boolean r4 = r13.isInterface()
            if (r4 == 0) goto L_0x003c
            r13 = r6
            r0 = r7
            r15 = r8
            goto L_0x0290
        L_0x003c:
            java.lang.reflect.Type r5 = r2.f29214b
            r4 = r2
            r2 = r13
        L_0x0040:
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            if (r2 == r14) goto L_0x028d
            java.lang.reflect.Field[] r14 = r2.getDeclaredFields()
            if (r2 == r13) goto L_0x0082
            int r10 = r14.length
            if (r10 <= 0) goto L_0x0082
            java.util.List r3 = r1.f29123d
            int r3 = com.google.p386ak.p388b.C8342ap.m23113a(r3)
            if (r3 == r12) goto L_0x005b
            if (r3 != r11) goto L_0x0059
            r3 = 1
            goto L_0x0082
        L_0x0059:
            r3 = 0
            goto L_0x0082
        L_0x005b:
            com.google.ak.o r0 = new com.google.ak.o
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r15)
            r4.append(r2)
            java.lang.String r2 = " (supertype of "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0082:
            r17 = r3
            int r10 = r14.length
            r3 = 0
        L_0x0086:
            if (r3 >= r10) goto L_0x0258
            r18 = r15
            r15 = r14[r3]
            boolean r19 = r1.m23073c(r15, r9)
            r11 = 0
            boolean r16 = r1.m23073c(r15, r11)
            if (r19 != 0) goto L_0x00b6
            if (r16 != 0) goto L_0x00b4
            r32 = r2
            r23 = r3
            r28 = r5
            r34 = r7
            r15 = r8
            r31 = r10
            r33 = r13
            r24 = r14
            r26 = 4
            r30 = 1
            r36 = 0
            r37 = 3
            r14 = r4
            r13 = r6
            goto L_0x021c
        L_0x00b4:
            r16 = 1
        L_0x00b6:
            if (r17 != 0) goto L_0x00eb
            r15.setAccessible(r9)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00eb
        L_0x00bc:
            r0 = move-exception
            r2 = r0
            com.google.ak.o r0 = new com.google.ak.o
            java.lang.Class r3 = r15.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r15.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed making field '"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "#"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x00eb:
            java.lang.reflect.Type r9 = r4.f29214b
            java.lang.reflect.Type r11 = r15.getGenericType()
            java.lang.reflect.Type r11 = com.google.p386ak.p388b.C8360e.m23138e(r9, r2, r11)
            java.lang.Class<com.google.ak.a.b> r9 = com.google.p386ak.p387a.C8265b.class
            java.lang.annotation.Annotation r9 = r15.getAnnotation(r9)
            com.google.ak.a.b r9 = (com.google.p386ak.p387a.C8265b) r9
            if (r9 != 0) goto L_0x0111
            com.google.ak.c r9 = r1.f29121b
            java.lang.String r9 = r9.mo17032c(r15)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r23 = r2
        L_0x010b:
            r24 = r3
            r25 = r4
            r12 = r9
            goto L_0x013d
        L_0x0111:
            java.lang.String r12 = r9.mo17027a()
            java.lang.String[] r9 = r9.mo17028b()
            r23 = r2
            int r2 = r9.length
            if (r2 != 0) goto L_0x0123
            java.util.List r9 = java.util.Collections.singletonList(r12)
            goto L_0x010b
        L_0x0123:
            r24 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r25 = r4
            int r4 = r2 + 1
            r3.<init>(r4)
            r3.add(r12)
            r4 = 0
        L_0x0132:
            if (r4 >= r2) goto L_0x013c
            r12 = r9[r4]
            r3.add(r12)
            int r4 = r4 + 1
            goto L_0x0132
        L_0x013c:
            r12 = r3
        L_0x013d:
            int r9 = r12.size()
            r3 = 0
            r4 = 0
        L_0x0143:
            if (r4 >= r9) goto L_0x01ff
            java.lang.Object r2 = r12.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r4 == 0) goto L_0x0150
            r26 = 0
            goto L_0x0152
        L_0x0150:
            r26 = 1
        L_0x0152:
            r19 = r26 & r19
            r26 = r12
            com.google.ak.c.a r12 = new com.google.ak.c.a
            r12.<init>(r11)
            r27 = r2
            java.lang.Class r2 = r12.f29213a
            r28 = r3
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x016e
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x016e
            r29 = 1
            goto L_0x0170
        L_0x016e:
            r29 = 0
        L_0x0170:
            java.lang.Class<com.google.ak.a.a> r2 = com.google.p386ak.p387a.C8264a.class
            java.lang.annotation.Annotation r2 = r15.getAnnotation(r2)
            com.google.ak.a.a r2 = (com.google.p386ak.p387a.C8264a) r2
            if (r2 == 0) goto L_0x0181
            com.google.ak.b.y r3 = r1.f29120a
            com.google.ak.aa r2 = com.google.p386ak.p388b.p389a.C8307g.m23050b(r3, r0, r12, r2)
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            if (r2 == 0) goto L_0x0187
            r30 = 1
            goto L_0x0189
        L_0x0187:
            r30 = 0
        L_0x0189:
            if (r2 != 0) goto L_0x018f
            com.google.ak.aa r2 = r0.mo17143a(r12)
        L_0x018f:
            r31 = r2
            com.google.ak.b.a.n r3 = new com.google.ak.b.a.n
            r32 = r23
            r2 = r3
            r1 = r3
            r23 = r24
            r0 = r28
            r3 = r27
            r24 = r14
            r14 = r25
            r25 = r4
            r4 = r19
            r28 = r5
            r5 = r16
            r33 = r13
            r13 = r6
            r6 = r17
            r34 = r7
            r7 = r15
            r35 = r15
            r15 = r8
            r8 = r30
            r21 = r9
            r30 = 1
            r9 = r31
            r31 = r10
            r36 = 0
            r10 = r39
            r20 = r11
            r37 = 3
            r11 = r12
            r22 = r26
            r26 = 4
            r12 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r27
            java.lang.Object r1 = r13.put(r2, r1)
            r3 = r1
            com.google.ak.b.a.p r3 = (com.google.p386ak.p388b.p389a.C8316p) r3
            if (r0 != 0) goto L_0x01dc
            goto L_0x01dd
        L_0x01dc:
            r3 = r0
        L_0x01dd:
            int r4 = r25 + 1
            r1 = r38
            r0 = r39
            r6 = r13
            r25 = r14
            r8 = r15
            r11 = r20
            r9 = r21
            r12 = r22
            r14 = r24
            r5 = r28
            r10 = r31
            r13 = r33
            r7 = r34
            r15 = r35
            r24 = r23
            r23 = r32
            goto L_0x0143
        L_0x01ff:
            r0 = r3
            r28 = r5
            r34 = r7
            r15 = r8
            r31 = r10
            r33 = r13
            r32 = r23
            r23 = r24
            r26 = 4
            r30 = 1
            r36 = 0
            r37 = 3
            r13 = r6
            r24 = r14
            r14 = r25
            if (r0 != 0) goto L_0x0238
        L_0x021c:
            int r3 = r23 + 1
            r1 = r38
            r0 = r39
            r6 = r13
            r4 = r14
            r8 = r15
            r15 = r18
            r14 = r24
            r5 = r28
            r10 = r31
            r2 = r32
            r13 = r33
            r7 = r34
            r9 = 1
            r11 = 3
            r12 = 4
            goto L_0x0086
        L_0x0238:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r28)
            java.lang.String r0 = r0.f29117h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " declares multiple JSON fields named "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0258:
            r32 = r2
            r14 = r4
            r28 = r5
            r34 = r7
            r33 = r13
            r18 = r15
            r26 = 4
            r30 = 1
            r36 = 0
            r37 = 3
            r13 = r6
            r15 = r8
            java.lang.reflect.Type r0 = r14.f29214b
            java.lang.reflect.Type r1 = r32.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.p386ak.p388b.C8360e.m23138e(r0, r2, r1)
            com.google.ak.c.a r4 = new com.google.ak.c.a
            r4.<init>(r0)
            java.lang.Class r2 = r4.f29213a
            r1 = r38
            r0 = r39
            r3 = r17
            r15 = r18
            r13 = r33
            r9 = 1
            r11 = 3
            r12 = 4
            goto L_0x0040
        L_0x028d:
            r13 = r6
            r15 = r8
            r0 = r7
        L_0x0290:
            r0.<init>(r15, r13)
            return r0
        L_0x0294:
            r33 = r13
            r18 = r15
            com.google.ak.o r0 = new com.google.ak.o
            java.lang.String r1 = java.lang.String.valueOf(r33)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r18
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ". Register a TypeAdapter for this type or adjust the access filter."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            goto L_0x02b6
        L_0x02b5:
            throw r0
        L_0x02b6:
            goto L_0x02b5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.p389a.C8317q.mo17031a(com.google.ak.i, com.google.ak.c.a):com.google.ak.aa");
    }
}
