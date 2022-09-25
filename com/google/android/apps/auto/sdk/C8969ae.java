package com.google.android.apps.auto.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.google.android.apps.auto.sdk.ae */
/* compiled from: PG */
public final class C8969ae implements LayoutInflater.Factory {

    /* renamed from: a */
    private static final HashMap f31067a = new HashMap();

    /* renamed from: b */
    private static final ClassLoader f31068b = LayoutInflater.class.getClassLoader();

    /* renamed from: c */
    private static final Class[] f31069c = {Context.class, AttributeSet.class};

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ClassLoader classLoader;
        if (!str.startsWith("com.google.android.gms.car.support") && !str.startsWith("android.support") && !str.startsWith("com.google.android.apps.auto.sdk.ui")) {
            return null;
        }
        if (Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
            Log.v("CSL.SupportLibViewLoade", String.format("createView %s with context %s", new Object[]{str, context}));
        }
        Constructor<? extends U> constructor = (Constructor) f31067a.get(str);
        if (constructor != null && (classLoader = constructor.getDeclaringClass().getClassLoader()) != f31068b) {
            ClassLoader classLoader2 = context.getClassLoader();
            while (true) {
                if (classLoader == classLoader2) {
                    break;
                }
                classLoader2 = classLoader2.getParent();
                if (classLoader2 == null) {
                    f31067a.remove(str);
                    constructor = null;
                    break;
                }
            }
        }
        if (constructor == null) {
            if (Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
                Log.v("CSL.SupportLibViewLoade", "No cached constructor");
            }
            try {
                constructor = context.getClassLoader().loadClass(str).asSubclass(View.class).getConstructor(f31069c);
                constructor.setAccessible(true);
                f31067a.put(str, constructor);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.w("CSL.SupportLibViewLoade", "Error creating view", e);
                return null;
            }
        }
        try {
            return (View) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            Log.w("CSL.SupportLibViewLoade", "Error creating view: ".concat(e2.toString()));
            return null;
        }
    }
}
