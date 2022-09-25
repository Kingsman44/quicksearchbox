package com.google.common.p4576s;

import com.google.common.base.C58827ar;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.common.s.q */
/* compiled from: PG */
final class C60780q implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f164827a;

    /* renamed from: b */
    private final C58485gu f164828b;

    /* renamed from: c */
    private final Class f164829c;

    public C60780q(Type type, Class cls, Type[] typeArr) {
        cls.getClass();
        C58838bb.m90868c(typeArr.length == cls.getTypeParameters().length);
        C60784u.m92783f(typeArr, "type parameter");
        this.f164827a = type;
        this.f164829c = cls;
        this.f164828b = C60777n.f164823e.mo57225a(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (!this.f164829c.equals(parameterizedType.getRawType()) || !C58832aw.m90831a(this.f164827a, parameterizedType.getOwnerType()) || !Arrays.equals(C60784u.m92784g(this.f164828b), parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return C60784u.m92784g(this.f164828b);
    }

    public final Type getOwnerType() {
        return this.f164827a;
    }

    public final Type getRawType() {
        return this.f164829c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!(this.f164827a == null || C60777n.f164823e.ordinal() == 3)) {
            sb.append(C60777n.f164823e.mo57226b(this.f164827a));
            sb.append('.');
        }
        sb.append(this.f164829c.getName());
        sb.append('<');
        C58827ar arVar = C60784u.f164838a;
        C58485gu guVar = this.f164828b;
        C60777n nVar = C60777n.f164823e;
        Objects.requireNonNull(nVar);
        sb.append(arVar.mo56097d(C58557jl.m90127h(guVar, new C60779p(nVar))));
        sb.append('>');
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        Type type = this.f164827a;
        if (type == null) {
            i = 0;
        } else {
            i = type.hashCode();
        }
        return (i ^ this.f164828b.hashCode()) ^ this.f164829c.hashCode();
    }
}
