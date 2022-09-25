package com.google.android.libraries.p1623at.p1626c.p1629c;

import android.support.p031v4.app.FragmentManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.libraries.at.c.c.h */
/* compiled from: PG */
public final class C19528h {

    /* renamed from: a */
    private static Method f54445a;

    /* renamed from: a */
    public static void m37267a(FragmentManager fragmentManager) {
        if (f54445a == null) {
            try {
                Method declaredMethod = FragmentManager.class.getDeclaredMethod("noteStateNotSaved", new Class[0]);
                f54445a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                m37268b(e);
            }
        }
        try {
            Method method = f54445a;
            method.getClass();
            method.invoke(fragmentManager, new Object[0]);
        } catch (IllegalAccessException e2) {
            m37268b(e2);
        } catch (InvocationTargetException e3) {
            m37268b(e3);
        }
    }

    /* renamed from: b */
    private static void m37268b(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }
}
