package com.facebook.litho;

import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p325d.C6180a;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.litho.an */
/* compiled from: PG */
public final class C6103an {
    /* renamed from: a */
    public static C6196dp m15874a(C6411u uVar, Exception exc) {
        if (exc instanceof C6196dp) {
            return (C6196dp) exc;
        }
        return new C6196dp(uVar, (ComponentTree) null, exc);
    }

    /* renamed from: b */
    public static void m15875b(C6411u uVar, C6143bx bxVar) {
        C6154cb b = uVar.mo13467b();
        if (b != null) {
            b.mo13111fD(bxVar);
        }
    }

    /* renamed from: c */
    static void m15876c(C6411u uVar, Exception exc) {
        C6143bx bxVar = new C6143bx();
        bxVar.f18172a = exc;
        m15875b(uVar, bxVar);
    }

    /* renamed from: d */
    static void m15877d(C6411u uVar, Exception exc) {
        try {
            m15876c(uVar, exc);
        } catch (C6263ff unused) {
            throw m15874a(uVar, exc);
        } catch (Exception e) {
            throw m15874a(uVar, e);
        }
    }

    /* renamed from: e */
    static void m15878e(Exception exc) {
        if (exc instanceof C6263ff) {
            Exception exc2 = ((C6263ff) exc).f18503a;
            m15878e((Exception) null);
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    /* renamed from: f */
    public static boolean m15879f(Object obj, Object obj2) {
        if (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) {
            throw new IllegalArgumentException("The input is invalid.");
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(C6117a.class)) {
                Class<?> type = field.getType();
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    field.setAccessible(false);
                    boolean z = C6180a.f18234a;
                    if (!m15884k(field, type, obj3, obj4)) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e);
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m15880g(C6279fv fvVar, C6279fv fvVar2) {
        if (fvVar == null && fvVar2 == null) {
            return true;
        }
        if (fvVar == null || fvVar2 == null) {
            return false;
        }
        return m15879f(fvVar, fvVar2);
    }

    /* renamed from: h */
    public static boolean m15881h(C6407q qVar, C6407q qVar2) {
        if (qVar == qVar2) {
            return true;
        }
        if (qVar == null || qVar2 == null) {
            return false;
        }
        return qVar.getClass().equals(qVar2.getClass());
    }

    /* renamed from: i */
    static String m15882i(C6407q qVar) {
        if (qVar == null) {
            return null;
        }
        return C6407q.m17273E(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[RETURN] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m15884k(java.lang.reflect.Field r2, java.lang.Class r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            r0 = 0
            java.lang.Class<com.facebook.litho.b.a> r1 = com.facebook.litho.p323b.C6117a.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r1)     // Catch:{ IncompatibleClassChangeError | NullPointerException -> 0x014d }
            com.facebook.litho.b.a r2 = (com.facebook.litho.p323b.C6117a) r2     // Catch:{ IncompatibleClassChangeError | NullPointerException -> 0x014d }
            int r2 = r2.mo12871a()     // Catch:{ IncompatibleClassChangeError | NullPointerException -> 0x014d }
            switch(r2) {
                case 0: goto L_0x0138;
                case 1: goto L_0x0125;
                case 2: goto L_0x007b;
                case 3: goto L_0x0074;
                case 4: goto L_0x0069;
                case 5: goto L_0x0059;
                case 6: goto L_0x004c;
                case 7: goto L_0x004c;
                case 8: goto L_0x004c;
                case 9: goto L_0x004c;
                case 10: goto L_0x003c;
                case 11: goto L_0x002c;
                case 12: goto L_0x002c;
                case 13: goto L_0x0020;
                case 14: goto L_0x0010;
                case 15: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x014b
        L_0x0012:
            if (r4 == 0) goto L_0x001d
            com.facebook.litho.bw r4 = (com.facebook.litho.C6142bw) r4
            boolean r2 = r4.mo13057a(r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x001f
        L_0x001d:
            if (r5 == 0) goto L_0x014b
        L_0x001f:
            return r0
        L_0x0020:
            if (r4 == 0) goto L_0x0029
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x002b
        L_0x0029:
            if (r5 == 0) goto L_0x014b
        L_0x002b:
            return r0
        L_0x002c:
            if (r4 == 0) goto L_0x0039
            com.facebook.litho.cb r4 = (com.facebook.litho.C6154cb) r4
            com.facebook.litho.cb r5 = (com.facebook.litho.C6154cb) r5
            boolean r2 = r4.mo13057a(r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x003b
        L_0x0039:
            if (r5 == 0) goto L_0x014b
        L_0x003b:
            return r0
        L_0x003c:
            if (r4 == 0) goto L_0x0049
            com.facebook.litho.q r4 = (com.facebook.litho.C6407q) r4
            com.facebook.litho.q r5 = (com.facebook.litho.C6407q) r5
            boolean r2 = r4.mo13057a(r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x004b
        L_0x0049:
            if (r5 == 0) goto L_0x014b
        L_0x004b:
            return r0
        L_0x004c:
            int r2 = r2 + -5
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r2 = m15883j(r2, r4, r5)
            if (r2 != 0) goto L_0x014b
            return r0
        L_0x0059:
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Collection r5 = (java.util.Collection) r5
            if (r4 == 0) goto L_0x0066
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0068
        L_0x0066:
            if (r5 == 0) goto L_0x014b
        L_0x0068:
            return r0
        L_0x0069:
            com.facebook.litho.f.c r4 = (com.facebook.litho.p328f.C6256c) r4
            com.facebook.litho.f.c r5 = (com.facebook.litho.p328f.C6256c) r5
            boolean r2 = r4.mo13241a(r5)
            if (r2 != 0) goto L_0x014b
            return r0
        L_0x0074:
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x014b
            return r0
        L_0x007b:
            java.lang.Class r2 = r3.getComponentType()
            java.lang.Class r3 = java.lang.Byte.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0093
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x0093:
            java.lang.Class r3 = java.lang.Short.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x00a7
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 == 0) goto L_0x0124
            goto L_0x014b
        L_0x00a7:
            java.lang.Class r3 = java.lang.Character.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x00bb
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x00bb:
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x00ce
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x00ce:
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x00e1
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x00e1:
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x00f4
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x00f4:
            java.lang.Class r3 = java.lang.Double.TYPE
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0107
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x0107:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x011a
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
            goto L_0x0124
        L_0x011a:
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r2 = java.util.Arrays.equals(r4, r5)
            if (r2 != 0) goto L_0x014b
        L_0x0124:
            return r0
        L_0x0125:
            java.lang.Double r4 = (java.lang.Double) r4
            double r2 = r4.doubleValue()
            java.lang.Double r5 = (java.lang.Double) r5
            double r4 = r5.doubleValue()
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L_0x014b
            return r0
        L_0x0138:
            java.lang.Float r4 = (java.lang.Float) r4
            float r2 = r4.floatValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r3 = r5.floatValue()
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L_0x014b
            return r0
        L_0x014b:
            r2 = 1
            return r2
        L_0x014d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6103an.m15884k(java.lang.reflect.Field, java.lang.Class, java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: j */
    private static boolean m15883j(int i, Collection collection, Collection collection2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        } else if (collection == null && collection2 == null) {
            return true;
        } else {
            if (collection == null || collection2 == null || collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (i == 1) {
                    if (!((C6407q) it.next()).mo13057a((C6407q) it2.next())) {
                        return false;
                    }
                } else if (!m15883j(i - 1, (Collection) it.next(), (Collection) it2.next())) {
                    return false;
                }
            }
            return true;
        }
    }
}
