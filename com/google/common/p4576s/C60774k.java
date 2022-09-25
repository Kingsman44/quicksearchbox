package com.google.common.p4576s;

import com.google.common.base.C58832aw;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: com.google.common.s.k */
/* compiled from: PG */
final class C60774k implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f164818a;

    public C60774k(Type type) {
        this.f164818a = C60777n.f164823e.mo57228d(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return C58832aw.m90831a(this.f164818a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    public final Type getGenericComponentType() {
        return this.f164818a;
    }

    public final int hashCode() {
        return this.f164818a.hashCode();
    }

    public final String toString() {
        return String.valueOf(C60784u.m92779b(this.f164818a)).concat("[]");
    }
}
