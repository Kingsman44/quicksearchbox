package com.google.p386ak.p388b;

import java.lang.reflect.Modifier;

/* renamed from: com.google.ak.b.av */
/* compiled from: PG */
public abstract class C8348av {
    /* renamed from: b */
    static String m23119b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(String.valueOf(cls.getName()));
        }
        return null;
    }

    /* renamed from: c */
    public static void m23120c(Class cls) {
        String b = m23119b(cls);
        if (b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b));
        }
    }

    /* renamed from: a */
    public abstract Object mo17086a(Class cls);
}
