package com.google.common.p4576s;

import com.google.common.base.C58823an;
import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: com.google.common.s.u */
/* compiled from: PG */
final class C60784u {

    /* renamed from: a */
    public static final C58827ar f164838a;

    static {
        C58827ar arVar = new C58827ar(", ");
        f164838a = new C58823an(arVar, arVar);
    }

    /* renamed from: a */
    static Class m92778a(Class cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    static String m92779b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: c */
    static ParameterizedType m92780c(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new C60780q(C60773j.f164816c.mo57220a(cls), cls, typeArr);
        }
        C58838bb.m90873h(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new C60780q(type, cls, typeArr);
    }

    /* renamed from: d */
    static Type m92781d(Type type) {
        if (!(type instanceof WildcardType)) {
            return C60777n.f164823e.mo57227c(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        C58838bb.m90869d(length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            return new C60783t(new Type[]{m92781d(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        C58838bb.m90869d(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new C60783t(new Type[0], new Type[]{m92781d(upperBounds[0])});
    }

    /* renamed from: e */
    static TypeVariable m92782e(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        C60782s sVar = new C60782s(new C60781r(genericDeclaration, str, typeArr));
        Class<TypeVariable> cls = TypeVariable.class;
        C58838bb.m90873h(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, sVar));
    }

    /* renamed from: f */
    public static void m92783f(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C58838bb.m90879n(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }

    /* renamed from: g */
    public static Type[] m92784g(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }
}
