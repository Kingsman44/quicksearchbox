package com.google.firebase.components;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.firebase.components.h */
/* compiled from: PG */
public final class C61154h {
    /* renamed from: a */
    public static C61156j m93523a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (C61156j.class.isAssignableFrom(cls)) {
                return (C61156j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C61171y(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException e) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}), e);
            return null;
        } catch (IllegalAccessException e2) {
            throw new C61171y(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (InstantiationException e3) {
            throw new C61171y(String.format("Could not instantiate %s.", new Object[]{str}), e3);
        } catch (NoSuchMethodException e4) {
            throw new C61171y(String.format("Could not instantiate %s", new Object[]{str}), e4);
        } catch (InvocationTargetException e5) {
            throw new C61171y(String.format("Could not instantiate %s", new Object[]{str}), e5);
        }
    }
}
