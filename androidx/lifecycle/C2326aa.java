package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.aa */
/* compiled from: PG */
public final class C2326aa {

    /* renamed from: a */
    private static final Map f6520a = new HashMap();

    /* renamed from: b */
    private static final Map f6521b = new HashMap();

    /* renamed from: a */
    static C2389t m6309a(Object obj) {
        boolean z = obj instanceof C2389t;
        boolean z2 = obj instanceof C2378i;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C2378i) obj, (C2389t) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C2378i) obj, (C2389t) null);
        }
        if (z) {
            return (C2389t) obj;
        }
        Class<?> cls = obj.getClass();
        if (m6310b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f6521b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m6311c((Constructor) list.get(0), obj));
        }
        C2379j[] jVarArr = new C2379j[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jVarArr[i] = m6311c((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(jVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r5.booleanValue() != false) goto L_0x0119;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m6310b(java.lang.Class r10) {
        /*
            java.lang.String r0 = "."
            java.util.Map r1 = f6520a
            java.lang.Object r1 = r1.get(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0123
            java.lang.String r1 = r10.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L_0x0015
            goto L_0x0119
        L_0x0015:
            r1 = 0
            r3 = 0
            java.lang.Package r4 = r10.getPackage()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.String r5 = r10.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r4 = ""
        L_0x0028:
            boolean r6 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            if (r6 != 0) goto L_0x0037
            int r6 = r4.length()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            int r6 = r6 + r2
            java.lang.String r5 = r5.substring(r6)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
        L_0x0037:
            java.lang.String r6 = "_"
            java.lang.String r5 = r5.replace(r0, r6)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.String r6 = "_LifecycleAdapter"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            boolean r6 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            if (r6 == 0) goto L_0x004e
            goto L_0x0060
        L_0x004e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            r6.append(r0)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            r6.append(r5)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.String r5 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
        L_0x0060:
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            r4[r3] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            boolean r4 = r0.isAccessible()     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            if (r4 != 0) goto L_0x007f
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0076 }
            goto L_0x007f
        L_0x0076:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        L_0x007d:
            r0 = r1
        L_0x007f:
            r4 = 2
            if (r0 == 0) goto L_0x008e
            java.util.Map r1 = f6521b
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.put(r10, r0)
        L_0x008b:
            r2 = 2
            goto L_0x0119
        L_0x008e:
            androidx.lifecycle.e r0 = androidx.lifecycle.C2374e.f6595a
            java.util.Map r5 = r0.f6596b
            java.lang.Object r5 = r5.get(r10)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x00a2
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x00c6
            goto L_0x0119
        L_0x00a2:
            java.lang.reflect.Method[] r5 = r0.mo5779c(r10)
            int r6 = r5.length
            r7 = 0
        L_0x00a8:
            if (r7 >= r6) goto L_0x00bd
            r8 = r5[r7]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r9 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r9)
            androidx.lifecycle.OnLifecycleEvent r8 = (androidx.lifecycle.OnLifecycleEvent) r8
            if (r8 == 0) goto L_0x00ba
            r0.mo5777a(r10, r5)
            goto L_0x0119
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x00a8
        L_0x00bd:
            java.util.Map r0 = r0.f6596b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.put(r10, r5)
        L_0x00c6:
            java.lang.Class r0 = r10.getSuperclass()
            boolean r5 = m6312d(r0)
            if (r5 == 0) goto L_0x00e4
            int r1 = m6310b(r0)
            if (r1 != r2) goto L_0x00d7
            goto L_0x0119
        L_0x00d7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map r5 = f6521b
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
        L_0x00e4:
            java.lang.Class[] r0 = r10.getInterfaces()
            int r5 = r0.length
        L_0x00e9:
            if (r3 >= r5) goto L_0x0110
            r6 = r0[r3]
            boolean r7 = m6312d(r6)
            if (r7 != 0) goto L_0x00f4
            goto L_0x010d
        L_0x00f4:
            int r7 = m6310b(r6)
            if (r7 != r2) goto L_0x00fb
            goto L_0x0119
        L_0x00fb:
            if (r1 != 0) goto L_0x0102
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0102:
            java.util.Map r7 = f6521b
            java.lang.Object r6 = r7.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r1.addAll(r6)
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00e9
        L_0x0110:
            if (r1 == 0) goto L_0x0119
            java.util.Map r0 = f6521b
            r0.put(r10, r1)
            goto L_0x008b
        L_0x0119:
            java.util.Map r0 = f6520a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r10, r1)
            return r2
        L_0x0123:
            int r10 = r1.intValue()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2326aa.m6310b(java.lang.Class):int");
    }

    /* renamed from: c */
    private static C2379j m6311c(Constructor constructor, Object obj) {
        try {
            return (C2379j) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: d */
    private static boolean m6312d(Class cls) {
        return cls != null && C2390u.class.isAssignableFrom(cls);
    }
}
