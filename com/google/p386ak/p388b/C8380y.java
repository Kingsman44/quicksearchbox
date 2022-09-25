package com.google.p386ak.p388b;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.ak.b.y */
/* compiled from: PG */
public final class C8380y {

    /* renamed from: a */
    private final Map f29205a;

    /* renamed from: b */
    private final List f29206b;

    public C8380y(Map map, List list) {
        this.f29205a = map;
        this.f29206b = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01cf A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p386ak.p388b.C8338al mo17104a(com.google.p386ak.p393c.C8383a r12) {
        /*
            r11 = this;
            java.lang.reflect.Type r0 = r12.f29214b
            java.lang.Class r12 = r12.f29213a
            java.util.Map r1 = r11.f29205a
            java.lang.Object r1 = r1.get(r0)
            com.google.ak.k r1 = (com.google.p386ak.C8395k) r1
            if (r1 == 0) goto L_0x0014
            com.google.ak.b.p r12 = new com.google.ak.b.p
            r12.<init>(r1)
            return r12
        L_0x0014:
            java.util.Map r1 = r11.f29205a
            java.lang.Object r1 = r1.get(r12)
            com.google.ak.k r1 = (com.google.p386ak.C8395k) r1
            if (r1 != 0) goto L_0x01d0
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r12)
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.ak.b.t r1 = new com.google.ak.b.t
            r1.<init>(r0)
            goto L_0x0038
        L_0x002d:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r12 != r1) goto L_0x0037
            com.google.ak.b.u r1 = new com.google.ak.b.u
            r1.<init>(r0)
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.List r1 = r11.f29206b
            int r1 = com.google.p386ak.p388b.C8342ap.m23113a(r1)
            int r3 = r12.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r3)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0050
        L_0x004d:
            r6 = r2
            goto L_0x0107
        L_0x0050:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0104 }
            java.lang.reflect.Constructor r3 = r12.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x0104 }
            if (r1 == r5) goto L_0x008c
            com.google.ak.b.ao r6 = com.google.p386ak.p388b.C8341ao.f29171b
            boolean r6 = r6.mo17085a(r3, r2)
            if (r6 == 0) goto L_0x006e
            r6 = 4
            if (r1 != r6) goto L_0x008c
            int r6 = r3.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isPublic(r6)
            if (r6 == 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            java.lang.String r3 = java.lang.String.valueOf(r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to invoke no-args constructor of "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.google.ak.b.v r6 = new com.google.ak.b.v
            r6.<init>(r3)
            goto L_0x0107
        L_0x008c:
            if (r1 != r5) goto L_0x00fe
            r3.setAccessible(r5)     // Catch:{ Exception -> 0x0093 }
            r6 = r2
            goto L_0x00f4
        L_0x0093:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.Class r8 = r3.getDeclaringClass()
            java.lang.String r8 = r8.getName()
            r7.<init>(r8)
            r8 = 35
            r7.append(r8)
            java.lang.Class r8 = r3.getDeclaringClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            r8 = 40
            r7.append(r8)
            java.lang.Class[] r8 = r3.getParameterTypes()
            r9 = 0
        L_0x00bb:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x00d1
            if (r9 <= 0) goto L_0x00c5
            java.lang.String r10 = ", "
            r7.append(r10)
        L_0x00c5:
            r10 = r8[r9]
            java.lang.String r10 = r10.getSimpleName()
            r7.append(r10)
            int r9 = r9 + 1
            goto L_0x00bb
        L_0x00d1:
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed making constructor '"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x00f4:
            if (r6 == 0) goto L_0x00fd
            com.google.ak.b.w r3 = new com.google.ak.b.w
            r3.<init>(r6)
            r6 = r3
            goto L_0x0107
        L_0x00fd:
            r1 = 1
        L_0x00fe:
            com.google.ak.b.x r6 = new com.google.ak.b.x
            r6.<init>(r3)
            goto L_0x0107
        L_0x0104:
            goto L_0x004d
        L_0x0107:
            if (r6 != 0) goto L_0x01cf
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r12)
            if (r3 == 0) goto L_0x0143
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x0120
            com.google.ak.b.f r2 = new com.google.ak.b.f
            r2.<init>()
            goto L_0x019b
        L_0x0120:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x012f
            com.google.ak.b.g r2 = new com.google.ak.b.g
            r2.<init>()
            goto L_0x019b
        L_0x012f:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x013d
            com.google.ak.b.h r2 = new com.google.ak.b.h
            r2.<init>()
            goto L_0x019b
        L_0x013d:
            com.google.ak.b.i r2 = new com.google.ak.b.i
            r2.<init>()
            goto L_0x019b
        L_0x0143:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r12)
            if (r3 == 0) goto L_0x019b
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r2 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r2 = r2.isAssignableFrom(r12)
            if (r2 == 0) goto L_0x0159
            com.google.ak.b.j r2 = new com.google.ak.b.j
            r2.<init>()
            goto L_0x019b
        L_0x0159:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r2 = java.util.concurrent.ConcurrentMap.class
            boolean r2 = r2.isAssignableFrom(r12)
            if (r2 == 0) goto L_0x0167
            com.google.ak.b.k r2 = new com.google.ak.b.k
            r2.<init>()
            goto L_0x019b
        L_0x0167:
            java.lang.Class<java.util.SortedMap> r2 = java.util.SortedMap.class
            boolean r2 = r2.isAssignableFrom(r12)
            if (r2 == 0) goto L_0x0175
            com.google.ak.b.l r2 = new com.google.ak.b.l
            r2.<init>()
            goto L_0x019b
        L_0x0175:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0196
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r4]
            com.google.ak.c.a r2 = new com.google.ak.c.a
            r2.<init>(r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r2 = r2.f29213a
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x0196
            com.google.ak.b.m r2 = new com.google.ak.b.m
            r2.<init>()
            goto L_0x019b
        L_0x0196:
            com.google.ak.b.n r2 = new com.google.ak.b.n
            r2.<init>()
        L_0x019b:
            if (r2 == 0) goto L_0x019e
            return r2
        L_0x019e:
            java.lang.String r0 = com.google.p386ak.p388b.C8348av.m23119b(r12)
            if (r0 == 0) goto L_0x01aa
            com.google.ak.b.r r12 = new com.google.ak.b.r
            r12.<init>(r0)
            return r12
        L_0x01aa:
            if (r1 != r5) goto L_0x01b2
            com.google.ak.b.o r0 = new com.google.ak.b.o
            r0.<init>(r12)
            return r0
        L_0x01b2:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create instance of "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.ak.b.s r0 = new com.google.ak.b.s
            r0.<init>(r12)
            return r0
        L_0x01cf:
            return r6
        L_0x01d0:
            com.google.ak.b.q r12 = new com.google.ak.b.q
            r12.<init>(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.C8380y.mo17104a(com.google.ak.c.a):com.google.ak.b.al");
    }

    public final String toString() {
        return this.f29205a.toString();
    }
}
