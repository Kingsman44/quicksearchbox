package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.shared.util.c.f */
/* compiled from: PG */
public final class C90940f {
    /* renamed from: a */
    public static Class m148551a(Class cls) {
        if (!C58837ba.m90859h(cls.getSimpleName())) {
            return cls;
        }
        Class superclass = cls.getSuperclass();
        Class<Object> cls2 = Object.class;
        if (superclass != null && !cls2.equals(superclass)) {
            return superclass;
        }
        Class[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        if (length == 0) {
            return cls2;
        }
        return length == 1 ? interfaces[0] : cls;
    }

    /* renamed from: b */
    public static String m148552b(Class<?> cls, String str, String str2) {
        if (str == null) {
            while (true) {
                Class<?> enclosingClass = cls.getEnclosingClass();
                if (enclosingClass == null) {
                    break;
                }
                cls = enclosingClass;
            }
            str = cls.getSimpleName();
            int indexOf = str.indexOf("$");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
        }
        return str + "[" + str2 + "]";
    }

    /* renamed from: c */
    public static void m148553c(C58480gp gpVar, Class cls) {
        if (C58837ba.m90859h(cls.getSimpleName()) || cls.isLocalClass()) {
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                m148553c(gpVar, enclosingConstructor.getDeclaringClass());
                gpVar.mo55395g(enclosingConstructor);
                return;
            }
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                m148553c(gpVar, enclosingMethod.getDeclaringClass());
                gpVar.mo55395g(enclosingMethod);
                return;
            }
            Class<?> enclosingClass = cls.getEnclosingClass();
            if (enclosingClass != null) {
                m148553c(gpVar, enclosingClass);
                gpVar.mo55395g(enclosingClass);
            }
        }
    }

    /* renamed from: d */
    public static void m148554d(int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(String.format("Task priority flag %d does not contain exactly one of task priorities %d, %d", new Object[]{Integer.valueOf(i), 2, 1}));
        }
    }

    /* renamed from: e */
    public static void m148555e(int i) {
        int i2 = i & -29;
        if (i2 != 0) {
            throw new IllegalArgumentException(String.format("Task resources permissions flag %d contains invalid value %d outside of allowed set of flags %d, %d, %d, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 8, 4, 16, 0}));
        }
    }
}
