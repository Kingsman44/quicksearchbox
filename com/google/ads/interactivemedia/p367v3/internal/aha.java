package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aha */
/* compiled from: PG */
public final class aha {

    /* renamed from: a */
    static final Type[] f20644a = new Type[0];

    /* renamed from: a */
    public static GenericArrayType m18710a(Type type) {
        return new agx(type);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.ads.interactivemedia.v3.internal.agx] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m18711b(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.agx r0 = new com.google.ads.interactivemedia.v3.internal.agx
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m18711b(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.ads.interactivemedia.v3.internal.agy r0 = new com.google.ads.interactivemedia.v3.internal.agy
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.ads.interactivemedia.v3.internal.agx r0 = new com.google.ads.interactivemedia.v3.internal.agx
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.ads.interactivemedia.v3.internal.agz r0 = new com.google.ads.interactivemedia.v3.internal.agz
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aha.m18711b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    public static Class m18712c(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6731ax.m18029e(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m18712c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m18712c(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: d */
    public static boolean m18713d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m18713d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: e */
    public static String m18714e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: f */
    static Type m18715f(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m18715f(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m18715f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: g */
    static Type m18716g(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C6731ax.m18029e(cls2.isAssignableFrom(cls));
        return m18719j(type, cls, m18715f(type, cls, cls2));
    }

    /* renamed from: h */
    public static Type m18717h(Type type, Class cls) {
        Type g = m18716g(type, cls, Collection.class);
        if (g instanceof WildcardType) {
            g = ((WildcardType) g).getUpperBounds()[0];
        }
        return g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    public static Type[] m18718i(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type g = m18716g(type, cls, Map.class);
        if (g instanceof ParameterizedType) {
            return ((ParameterizedType) g).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: j */
    public static Type m18719j(Type type, Class cls, Type type2) {
        return m18721l(type, cls, type2, new HashSet());
    }

    /* renamed from: k */
    static void m18720k(Type type) {
        boolean z = true;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z = false;
        }
        C6731ax.m18029e(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m18721l(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.Collection r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = m18715f(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002e:
            if (r1 >= r3) goto L_0x0044
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006b
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006b
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m18721l(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            return r0
        L_0x0066:
            java.lang.reflect.GenericArrayType r8 = m18710a(r8)
            return r8
        L_0x006b:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0081
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m18721l(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007c
            return r10
        L_0x007c:
            java.lang.reflect.GenericArrayType r8 = m18710a(r8)
            return r8
        L_0x0081:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m18721l(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009a:
            if (r1 >= r5) goto L_0x00b5
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m18721l(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b2
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
        L_0x00af:
            r4[r1] = r6
            r0 = 1
        L_0x00b2:
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00b5:
            if (r0 == 0) goto L_0x00c1
            java.lang.reflect.Type r8 = r10.getRawType()
            com.google.ads.interactivemedia.v3.internal.agy r9 = new com.google.ads.interactivemedia.v3.internal.agy
            r9.<init>(r3, r8, r4)
            return r9
        L_0x00c1:
            return r10
        L_0x00c2:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011e
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00f9
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m18721l(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011e
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e8
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ed
        L_0x00e8:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ed:
            com.google.ads.interactivemedia.v3.internal.agz r9 = new com.google.ads.interactivemedia.v3.internal.agz
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00f9:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011e
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m18721l(r8, r9, r0, r11)     // Catch:{ all -> 0x011f }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011e
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0111
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0116
        L_0x0111:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0116:
            com.google.ads.interactivemedia.v3.internal.agz r9 = new com.google.ads.interactivemedia.v3.internal.agz
            java.lang.reflect.Type[] r10 = f20644a
            r9.<init>(r8, r10)
            return r9
        L_0x011e:
            return r10
        L_0x011f:
            r8 = move-exception
            goto L_0x0122
        L_0x0121:
            throw r8
        L_0x0122:
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aha.m18721l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
