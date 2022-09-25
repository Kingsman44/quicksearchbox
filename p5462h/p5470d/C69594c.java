package p5462h.p5470d;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: h.d.c */
/* compiled from: PG */
public final class C69594c {

    /* renamed from: a */
    public static final C69593b f185997a;

    static {
        C69593b bVar;
        Object newInstance;
        Object newInstance2;
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int B = C69764m.m101185B(property, '.', 0, 6);
            if (B < 0) {
                try {
                    i = Integer.parseInt(property) * 65536;
                } catch (NumberFormatException unused) {
                }
            } else {
                int i2 = B + 1;
                int B2 = C69764m.m101185B(property, '.', i2, 4);
                if (B2 < 0) {
                    B2 = property.length();
                }
                String substring = property.substring(0, B);
                C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = property.substring(i2, B2);
                C69664n.m101060f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            }
        }
        if (i >= 65544 || i < 65536) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                C69664n.m101060f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    bVar = (C69593b) newInstance2;
                    f185997a = bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = C69593b.class.getClassLoader();
                if (!C69664n.m101066l(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused2) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C69664n.m101060f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            bVar = (C69593b) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = C69593b.class.getClassLoader();
                            if (!C69664n.m101066l(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
        }
        if (i >= 65543 || i < 65536) {
            try {
                newInstance = Class.forName("h.d.a.b").newInstance();
                C69664n.m101060f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    bVar = (C69593b) newInstance;
                    f185997a = bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = C69593b.class.getClassLoader();
                if (!C69664n.m101066l(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused4) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C69664n.m101060f(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            bVar = (C69593b) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = C69593b.class.getClassLoader();
                            if (!C69664n.m101066l(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused5) {
                }
            }
        }
        bVar = new C69593b();
        f185997a = bVar;
    }
}
