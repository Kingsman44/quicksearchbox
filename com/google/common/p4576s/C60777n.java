package com.google.common.p4576s;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: com.google.common.s.n */
/* compiled from: PG */
enum C60777n {
    JAVA6,
    JAVA7,
    JAVA8,
    JAVA9;
    

    /* renamed from: e */
    static final C60777n f164823e = null;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58485gu mo57225a(Type[] typeArr) {
        C58480gp e = C58485gu.m89837e();
        for (Type d : typeArr) {
            e.mo55395g(mo57228d(d));
        }
        return e.mo55394f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Type mo57227c(Type type) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return new C60774k(type);
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return JAVA7.mo57227c(type);
            }
            if (ordinal == 3) {
                return JAVA8.mo57227c(type);
            }
            throw null;
        } else if (type instanceof Class) {
            return C60784u.m92778a((Class) type);
        } else {
            return new C60774k(type);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Type mo57228d(Type type) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            type.getClass();
            if (!(type instanceof Class)) {
                return type;
            }
            Class cls = (Class) type;
            return cls.isArray() ? new C60774k(cls.getComponentType()) : type;
        } else if (ordinal == 1) {
            type.getClass();
            return type;
        } else if (ordinal == 2) {
            return JAVA7.mo57228d(type);
        } else {
            if (ordinal == 3) {
                return JAVA8.mo57228d(type);
            }
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo57226b(Type type) {
        int ordinal = ordinal();
        if (ordinal == 2) {
            try {
                return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
            } catch (NoSuchMethodException unused) {
                throw new AssertionError("Type.getTypeName should be available in Java 8");
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        } else if (ordinal != 3) {
            return C60784u.m92779b(type);
        } else {
            return JAVA8.mo57226b(type);
        }
    }
}
