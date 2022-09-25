package com.google.common.p4576s;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.s.r */
/* compiled from: PG */
final class C60781r {

    /* renamed from: a */
    private final GenericDeclaration f164830a;

    /* renamed from: b */
    private final String f164831b;

    /* renamed from: c */
    private final C58485gu f164832c;

    public C60781r(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        C60784u.m92783f(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.f164830a = genericDeclaration;
        str.getClass();
        this.f164831b = str;
        this.f164832c = C58485gu.m89844l(typeArr);
    }

    public final boolean equals(Object obj) {
        if (C60778o.f164825a) {
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof C60782s)) {
                int i = C60782s.f164833b;
                C60781r rVar = ((C60782s) Proxy.getInvocationHandler(obj)).f164835a;
                return this.f164831b.equals(rVar.f164831b) && this.f164830a.equals(rVar.f164830a) && C58597ky.m90218i(this.f164832c, rVar.f164832c);
            }
        }
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return this.f164831b.equals(typeVariable.getName()) && this.f164830a.equals(typeVariable.getGenericDeclaration());
        }
    }

    public final int hashCode() {
        return this.f164830a.hashCode() ^ this.f164831b.hashCode();
    }

    public final String toString() {
        return this.f164831b;
    }
}
