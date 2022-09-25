package com.google.p386ak.p388b;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.b.d */
/* compiled from: PG */
final class C8359d implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f29191a;

    /* renamed from: b */
    private final Type f29192b;

    public C8359d(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        boolean z = true;
        C8269a.m22981a(length <= 1);
        C8269a.m22981a(typeArr.length == 1);
        if (length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            C8360e.m23139f(typeArr2[0]);
            C8269a.m22981a(typeArr[0] != Object.class ? false : z);
            this.f29192b = C8360e.m23136c(typeArr2[0]);
            this.f29191a = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        C8360e.m23139f(typeArr[0]);
        this.f29192b = null;
        this.f29191a = C8360e.m23136c(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C8360e.m23140g(this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        Type type = this.f29192b;
        if (type == null) {
            return C8360e.f29193a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f29191a};
    }

    public final int hashCode() {
        Type type = this.f29192b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f29191a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f29192b;
        if (type != null) {
            return "? super ".concat(String.valueOf(C8360e.m23135b(type)));
        }
        Type type2 = this.f29191a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(C8360e.m23135b(type2)));
    }
}
