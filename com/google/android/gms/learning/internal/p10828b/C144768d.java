package com.google.android.gms.learning.internal.p10828b;

import android.content.Context;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.learning.internal.b.d */
/* compiled from: PG */
public final class C144768d {

    /* renamed from: a */
    private static final Object f391618a = new Object();

    /* renamed from: b */
    private static volatile C144765a f391619b;

    private C144768d() {
    }

    /* renamed from: a */
    public static IInterface m235289a(Context context, String str, C144767c cVar) {
        return m235290b(context).mo120201b(str, cVar);
    }

    /* renamed from: b */
    public static C144765a m235290b(Context context) {
        C144765a aVar = f391619b;
        if (aVar == null) {
            synchronized (f391618a) {
                aVar = f391619b;
                if (aVar == null) {
                    C144765a c = m235291c(context);
                    f391619b = c;
                    aVar = c;
                }
            }
        }
        return aVar;
    }

    /* renamed from: c */
    private static C144765a m235291c(Context context) {
        Class<?> cls;
        if (Log.isLoggable("brella.DynamiteLdr", 3)) {
            Log.d("brella.DynamiteLdr", "Trying to load fat dynamite loader");
        }
        try {
            cls = C144768d.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.b.f");
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                String name = cls.getName();
                Log.d("brella.DynamiteLdr", "Found fat DynamiteLoader impl: " + name);
            }
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", "Falling back to trying to load default dynamite loader");
            }
            cls = null;
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                throw null;
            }
        } catch (ClassNotFoundException e) {
            String concat = "No dynamite loader found: ".concat(String.valueOf(e.getMessage()));
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", concat, e);
            }
            throw new C144766b(concat, e);
        }
        try {
            return (C144765a) cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            String concat2 = "Failed to create dynamite loader instance: ".concat(String.valueOf(e2.getMessage()));
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", concat2, e2);
            }
            throw new C144766b(concat2, e2);
        }
    }
}
