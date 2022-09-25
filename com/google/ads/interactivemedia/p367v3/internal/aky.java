package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aky */
/* compiled from: PG */
final class aky extends akx {

    /* renamed from: a */
    private static Class f20842a;

    /* renamed from: b */
    private final Object f20843b;

    /* renamed from: c */
    private final Field f20844c;

    public aky() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f20842a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
        }
        this.f20843b = obj;
        this.f20844c = m18865c();
    }

    /* renamed from: c */
    private static Field m18865c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:4|5|6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agk("Gson couldn't modify fields for " + r10 + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14886a(java.lang.reflect.AccessibleObject r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f20843b
            r1 = 1
            if (r0 == 0) goto L_0x0058
            java.lang.reflect.Field r0 = r9.f20844c
            if (r0 == 0) goto L_0x0058
            java.lang.Class r0 = f20842a     // Catch:{ Exception -> 0x0058 }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0058 }
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = "objectFieldOffset"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r2 = r9.f20843b     // Catch:{ Exception -> 0x0058 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0058 }
            java.lang.reflect.Field r5 = r9.f20844c     // Catch:{ Exception -> 0x0058 }
            r3[r4] = r5     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch:{ Exception -> 0x0058 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0058 }
            long r2 = r0.longValue()     // Catch:{ Exception -> 0x0058 }
            java.lang.Class r0 = f20842a     // Catch:{ Exception -> 0x0058 }
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0058 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r4] = r7     // Catch:{ Exception -> 0x0058 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0058 }
            r6[r1] = r7     // Catch:{ Exception -> 0x0058 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0058 }
            r8 = 2
            r6[r8] = r7     // Catch:{ Exception -> 0x0058 }
            java.lang.String r7 = "putBoolean"
            java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r6 = r9.f20843b     // Catch:{ Exception -> 0x0058 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0058 }
            r5[r4] = r10     // Catch:{ Exception -> 0x0058 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0058 }
            r5[r1] = r2     // Catch:{ Exception -> 0x0058 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0058 }
            r5[r8] = r2     // Catch:{ Exception -> 0x0058 }
            r0.invoke(r6, r5)     // Catch:{ Exception -> 0x0058 }
            return
        L_0x0058:
            r10.setAccessible(r1)     // Catch:{ SecurityException -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.agk r1 = new com.google.ads.interactivemedia.v3.internal.agk
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Gson couldn't modify fields for "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r1.<init>(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aky.mo14886a(java.lang.reflect.AccessibleObject):void");
    }
}
