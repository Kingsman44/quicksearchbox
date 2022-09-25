package com.google.p386ak.p388b;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.b.c */
/* compiled from: PG */
final class C8351c implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f29178a;

    /* renamed from: b */
    private final Type f29179b;

    /* renamed from: c */
    private final Type[] f29180c;

    public C8351c(Type type, Type type2, Type... typeArr) {
        Type type3;
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            C8269a.m22981a(z);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = C8360e.m23136c(type);
        }
        this.f29178a = type3;
        this.f29179b = C8360e.m23136c(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f29180c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f29180c[i]);
            C8360e.m23139f(this.f29180c[i]);
            Type[] typeArr3 = this.f29180c;
            typeArr3[i] = C8360e.m23136c(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C8360e.m23140g(this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f29180c.clone();
    }

    public final Type getOwnerType() {
        return this.f29178a;
    }

    public final Type getRawType() {
        return this.f29179b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f29180c) ^ this.f29179b.hashCode();
        Type type = this.f29178a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.f29180c.length;
        if (length == 0) {
            return C8360e.m23135b(this.f29179b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C8360e.m23135b(this.f29179b));
        sb.append("<");
        sb.append(C8360e.m23135b(this.f29180c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C8360e.m23135b(this.f29180c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
