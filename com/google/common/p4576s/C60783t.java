package com.google.common.p4576s;

import com.google.common.base.C58843bg;
import com.google.common.base.C58846bj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: com.google.common.s.t */
/* compiled from: PG */
final class C60783t implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C58485gu f164836a;

    /* renamed from: b */
    private final C58485gu f164837b;

    public C60783t(Type[] typeArr, Type[] typeArr2) {
        C60784u.m92783f(typeArr, "lower bound for wildcard");
        C60784u.m92783f(typeArr2, "upper bound for wildcard");
        this.f164836a = C60777n.f164823e.mo57225a(typeArr);
        this.f164837b = C60777n.f164823e.mo57225a(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (!C58597ky.m90218i(this.f164836a, Arrays.asList(wildcardType.getLowerBounds())) || !C58597ky.m90218i(this.f164837b, Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Type[] getLowerBounds() {
        return C60784u.m92784g(this.f164836a);
    }

    public final Type[] getUpperBounds() {
        return C60784u.m92784g(this.f164837b);
    }

    public final int hashCode() {
        return this.f164836a.hashCode() ^ this.f164837b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("?");
        C58485gu guVar = this.f164836a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            sb.append(" super ");
            sb.append(C60777n.f164823e.mo57226b((Type) guVar.get(i)));
        }
        for (Type b : C58557jl.m90124e(this.f164837b, new C58843bg(C58846bj.m90900b(Object.class)))) {
            sb.append(" extends ");
            sb.append(C60777n.f164823e.mo57226b(b));
        }
        return sb.toString();
    }
}
