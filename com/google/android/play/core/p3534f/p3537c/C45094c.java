package com.google.android.play.core.p3534f.p3537c;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.f.c.c */
/* compiled from: PG */
public final class C45094c {
    /* renamed from: a */
    public static C45092a m80260a(Object obj, String str, Class cls) {
        return new C45092a(obj, m80264e(obj, str), cls);
    }

    /* renamed from: b */
    public static C45093b m80261b(Object obj, String str, Class cls) {
        return new C45093b(obj, m80264e(obj, str), cls);
    }

    /* renamed from: c */
    public static Object m80262c(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(m80263d(obj.getClass(), str, cls2).invoke(obj, new Object[]{obj2}));
        } catch (Exception e) {
            throw new C45095d(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: d */
    public static Method m80263d(Class cls, String str, Class... clsArr) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C45095d(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: e */
    private static Field m80264e(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C45095d(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }
}
