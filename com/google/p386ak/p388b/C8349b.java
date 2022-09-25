package com.google.p386ak.p388b;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.b.b */
/* compiled from: PG */
final class C8349b implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f29177a;

    public C8349b(Type type) {
        Objects.requireNonNull(type);
        this.f29177a = C8360e.m23136c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C8360e.m23140g(this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.f29177a;
    }

    public final int hashCode() {
        return this.f29177a.hashCode();
    }

    public final String toString() {
        return String.valueOf(C8360e.m23135b(this.f29177a)).concat("[]");
    }
}
