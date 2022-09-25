package com.google.common.p4576s;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: com.google.common.s.d */
/* compiled from: PG */
final class C60767d {

    /* renamed from: a */
    private final TypeVariable f164812a;

    public C60767d(TypeVariable typeVariable) {
        this.f164812a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C60767d) {
            TypeVariable typeVariable = ((C60767d) obj).f164812a;
            if (!this.f164812a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || !this.f164812a.getName().equals(typeVariable.getName())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f164812a.getGenericDeclaration(), this.f164812a.getName()});
    }

    public final String toString() {
        return this.f164812a.toString();
    }
}
