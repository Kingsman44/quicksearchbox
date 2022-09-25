package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58838bb;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.e.a.d.n */
/* compiled from: PG */
public final class C61060n {

    /* renamed from: d */
    private static final Map f165328d = new WeakHashMap();

    /* renamed from: a */
    public final boolean f165329a;

    /* renamed from: b */
    public final Field f165330b;

    /* renamed from: c */
    public final String f165331c;

    /* renamed from: a */
    public static C61060n m93423a(Enum enumR) {
        try {
            C61060n b = m93424b(enumR.getClass().getField(enumR.name()));
            C58838bb.m90874i(b != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return b;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4591e.p4592a.p4603d.C61060n m93424b(java.lang.reflect.Field r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map r1 = f165328d
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x0066 }
            com.google.e.a.d.n r2 = (com.google.p4591e.p4592a.p4603d.C61060n) r2     // Catch:{ all -> 0x0066 }
            boolean r3 = r4.isEnumConstant()     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0064
            if (r3 != 0) goto L_0x0034
            int r3 = r4.getModifiers()     // Catch:{ all -> 0x0066 }
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch:{ all -> 0x0066 }
            if (r3 != 0) goto L_0x0064
            java.lang.Class<com.google.e.a.d.s> r2 = com.google.p4591e.p4592a.p4603d.C61065s.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)     // Catch:{ all -> 0x0066 }
            com.google.e.a.d.s r2 = (com.google.p4591e.p4592a.p4603d.C61065s) r2     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x002b
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            return r0
        L_0x002b:
            java.lang.String r0 = r2.mo57641a()     // Catch:{ all -> 0x0066 }
            r2 = 1
            r4.setAccessible(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x004d
        L_0x0034:
            java.lang.Class<com.google.e.a.d.ab> r2 = com.google.p4591e.p4592a.p4603d.C61047ab.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)     // Catch:{ all -> 0x0066 }
            com.google.e.a.d.ab r2 = (com.google.p4591e.p4592a.p4603d.C61047ab) r2     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r0 = r2.mo57593a()     // Catch:{ all -> 0x0066 }
            goto L_0x004d
        L_0x0043:
            java.lang.Class<com.google.e.a.d.t> r2 = com.google.p4591e.p4592a.p4603d.C61066t.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)     // Catch:{ all -> 0x0066 }
            com.google.e.a.d.t r2 = (com.google.p4591e.p4592a.p4603d.C61066t) r2     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0062
        L_0x004d:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0066 }
        L_0x0059:
            com.google.e.a.d.n r2 = new com.google.e.a.d.n     // Catch:{ all -> 0x0066 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0066 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0062:
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            return r0
        L_0x0064:
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0066:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0066 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4591e.p4592a.p4603d.C61060n.m93424b(java.lang.reflect.Field):com.google.e.a.d.n");
    }

    /* renamed from: d */
    public static Object m93425d(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static void m93426e(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object d = m93425d(field, obj);
            if (obj2 == null) {
                if (d == null) {
                    return;
                }
            } else if (obj2.equals(d)) {
                return;
            }
            throw new IllegalArgumentException("expected final value <" + d + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: c */
    public final Enum mo57631c() {
        return Enum.valueOf(this.f165330b.getDeclaringClass(), this.f165330b.getName());
    }

    /* renamed from: f */
    public final boolean mo57632f() {
        return Modifier.isFinal(this.f165330b.getModifiers());
    }

    public C61060n(Field field, String str) {
        String str2;
        this.f165330b = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.f165331c = str2;
        this.f165329a = C61054h.m93416j(field.getType());
    }
}
