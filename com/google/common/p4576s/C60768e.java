package com.google.common.p4576s;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: com.google.common.s.e */
/* compiled from: PG */
public final class C60768e {
    /* renamed from: b */
    public static final Type[] m92772b(Type[] typeArr, C60766c cVar) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = m92771a(typeArr[i], cVar);
        }
        return typeArr2;
    }

    /* renamed from: a */
    public static final Type m92771a(Type type, C60766c cVar) {
        Type type2;
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            return cVar.mo57212a(typeVariable, new C60765b(typeVariable, cVar));
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                type2 = null;
            } else {
                type2 = m92771a(ownerType, cVar);
            }
            return C60784u.m92780c(type2, (Class) m92771a(parameterizedType.getRawType(), cVar), m92772b(parameterizedType.getActualTypeArguments(), cVar));
        } else if (type instanceof GenericArrayType) {
            return C60784u.m92781d(m92771a(((GenericArrayType) type).getGenericComponentType(), cVar));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C60783t(m92772b(wildcardType.getLowerBounds(), cVar), m92772b(wildcardType.getUpperBounds(), cVar));
        }
    }
}
