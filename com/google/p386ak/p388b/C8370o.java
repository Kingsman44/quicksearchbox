package com.google.p386ak.p388b;

/* renamed from: com.google.ak.b.o */
/* compiled from: PG */
final class C8370o implements C8338al {

    /* renamed from: a */
    final /* synthetic */ Class f29194a;

    /* renamed from: b */
    private final C8348av f29195b;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8370o(java.lang.Class r8) {
        /*
            r7 = this;
            java.lang.String r0 = "newInstance"
            r7.f29194a = r8
            r7.<init>()
            r8 = 0
            r1 = 0
            r2 = 1
            java.lang.String r3 = "sun.misc.Unsafe"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "theUnsafe"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x002f }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x002f }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ Exception -> 0x002f }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x002f }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r1] = r6     // Catch:{ Exception -> 0x002f }
            java.lang.String r6 = "allocateInstance"
            java.lang.reflect.Method r3 = r3.getMethod(r6, r5)     // Catch:{ Exception -> 0x002f }
            com.google.ak.b.ar r5 = new com.google.ak.b.ar     // Catch:{ Exception -> 0x002f }
            r5.<init>(r3, r4)     // Catch:{ Exception -> 0x002f }
            goto L_0x0088
        L_0x002f:
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006a }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r1] = r5     // Catch:{ Exception -> 0x006a }
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.String r6 = "getConstructorId"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x006a }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x006a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006a }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r1] = r6     // Catch:{ Exception -> 0x006a }
            java.lang.Object r8 = r4.invoke(r8, r5)     // Catch:{ Exception -> 0x006a }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x006a }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x006a }
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x006a }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r1] = r5     // Catch:{ Exception -> 0x006a }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006a }
            r4[r2] = r5     // Catch:{ Exception -> 0x006a }
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r0, r4)     // Catch:{ Exception -> 0x006a }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x006a }
            com.google.ak.b.as r5 = new com.google.ak.b.as     // Catch:{ Exception -> 0x006a }
            r5.<init>(r4, r8)     // Catch:{ Exception -> 0x006a }
            goto L_0x0088
        L_0x006a:
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0083 }
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r8[r1] = r3     // Catch:{ Exception -> 0x0083 }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r8[r2] = r1     // Catch:{ Exception -> 0x0083 }
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.reflect.Method r8 = r1.getDeclaredMethod(r0, r8)     // Catch:{ Exception -> 0x0083 }
            r8.setAccessible(r2)     // Catch:{ Exception -> 0x0083 }
            com.google.ak.b.at r5 = new com.google.ak.b.at     // Catch:{ Exception -> 0x0083 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0088
        L_0x0083:
            com.google.ak.b.au r5 = new com.google.ak.b.au
            r5.<init>()
        L_0x0088:
            r7.f29195b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.C8370o.<init>(java.lang.Class):void");
    }

    /* renamed from: a */
    public final Object mo17084a() {
        try {
            return this.f29195b.mo17086a(this.f29194a);
        } catch (Exception e) {
            String valueOf = String.valueOf(this.f29194a);
            throw new RuntimeException("Unable to create instance of " + valueOf + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
