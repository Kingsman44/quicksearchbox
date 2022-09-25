package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Modifier;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aij */
/* compiled from: PG */
public abstract class aij {
    /* renamed from: b */
    static void m18770b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(String.valueOf(cls.getName())));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(String.valueOf(cls.getName())));
        }
    }

    /* renamed from: a */
    public abstract Object mo14818a(Class cls);
}
