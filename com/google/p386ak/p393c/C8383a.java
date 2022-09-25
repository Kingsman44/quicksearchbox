package com.google.p386ak.p393c;

import com.google.p386ak.p388b.C8360e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.c.a */
/* compiled from: PG */
public class C8383a {

    /* renamed from: a */
    public final Class f29213a;

    /* renamed from: b */
    public final Type f29214b;

    /* renamed from: c */
    private final int f29215c;

    protected C8383a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Class<C8383a> cls = C8383a.class;
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                Type c = C8360e.m23136c(parameterizedType.getActualTypeArguments()[0]);
                this.f29214b = c;
                this.f29213a = C8360e.m23134a(c);
                this.f29215c = c.hashCode();
                return;
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8383a) && C8360e.m23140g(this.f29214b, ((C8383a) obj).f29214b);
    }

    public final int hashCode() {
        return this.f29215c;
    }

    public final String toString() {
        return C8360e.m23135b(this.f29214b);
    }

    public C8383a(Type type) {
        Type c = C8360e.m23136c((Type) Objects.requireNonNull(type));
        this.f29214b = c;
        this.f29213a = C8360e.m23134a(c);
        this.f29215c = c.hashCode();
    }
}
