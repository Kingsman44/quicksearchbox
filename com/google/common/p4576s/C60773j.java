package com.google.common.p4576s;

import java.lang.reflect.ParameterizedType;
import p3186j$.util.Objects;

/* renamed from: com.google.common.s.j */
/* compiled from: PG */
enum C60773j {
    OWNED_BY_ENCLOSING_CLASS,
    LOCAL_CLASS_HAS_NO_OWNER;
    

    /* renamed from: c */
    static final C60773j f164816c = null;

    static {
        int i;
        ParameterizedType parameterizedType = (ParameterizedType) Objects.requireNonNull((ParameterizedType) new C60772i().getClass().getGenericSuperclass());
        for (C60773j jVar : values()) {
            if (jVar.mo57220a(C60771h.class) == parameterizedType.getOwnerType()) {
                f164816c = jVar;
                return;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class mo57220a(Class cls) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return cls.getEnclosingClass();
        }
        if (ordinal != 1) {
            throw null;
        } else if (cls.isLocalClass()) {
            return null;
        } else {
            return cls.getEnclosingClass();
        }
    }
}
