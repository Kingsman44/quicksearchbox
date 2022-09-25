package com.google.common.p4576s;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.s.g */
/* compiled from: PG */
public class C60770g extends C60764a implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* renamed from: a */
    public final Type f164813a;

    public C60770g() {
        Type a = mo57211a();
        this.f164813a = a;
        C58838bb.m90887v(!(a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C60770g) {
            return this.f164813a.equals(((C60770g) obj).f164813a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f164813a.hashCode();
    }

    public final String toString() {
        return C60784u.m92779b(this.f164813a);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new C60769f(C60768e.m92771a(this.f164813a, new C60766c()));
    }

    public C60770g(Type type) {
        type.getClass();
        this.f164813a = type;
    }
}
