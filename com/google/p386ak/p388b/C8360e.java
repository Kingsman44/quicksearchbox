package com.google.p386ak.p388b;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.google.ak.b.e */
/* compiled from: PG */
public final class C8360e {

    /* renamed from: a */
    static final Type[] f29193a = new Type[0];

    /* renamed from: a */
    public static Class m23134a(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C8269a.m22981a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m23134a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m23134a(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            String valueOf = String.valueOf(type);
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + valueOf + "> is of type " + str);
        }
    }

    /* renamed from: b */
    public static String m23135b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: c */
    public static Type m23136c(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C8349b(m23136c(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C8351c(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C8349b(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C8359d(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: d */
    public static Type m23137d(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C8269a.m22981a(cls2.isAssignableFrom(cls));
        return m23138e(type, cls, m23141h(type, cls, cls2));
    }

    /* renamed from: e */
    public static Type m23138e(Type type, Class cls, Type type2) {
        return m23142i(type, cls, type2, new HashMap());
    }

    /* renamed from: f */
    static void m23139f(Type type) {
        boolean z = true;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z = false;
        }
        C8269a.m22981a(z);
    }

    /* renamed from: g */
    public static boolean m23140g(Type type, Type type2) {
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
            if (!m23143j(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m23140g(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: h */
    private static Type m23141h(Type type, Class<? super Object> cls, Class cls2) {
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
                    return m23141h(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m23141h(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: com.google.ak.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: com.google.ak.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013e A[EDGE_INSN: B:85:0x013e->B:78:0x013e ?: BREAK  , SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m23142i(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.Map r12) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r11 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L_0x005d
            r2 = r11
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L_0x0018
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 != r9) goto L_0x0017
            return r11
        L_0x0017:
            return r4
        L_0x0018:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r2, r11)
            if (r1 != 0) goto L_0x0020
            r1 = r2
        L_0x0020:
            java.lang.reflect.GenericDeclaration r11 = r2.getGenericDeclaration()
            boolean r4 = r11 instanceof java.lang.Class
            if (r4 == 0) goto L_0x002b
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002c
        L_0x002b:
            r11 = r0
        L_0x002c:
            if (r11 != 0) goto L_0x002f
            goto L_0x0058
        L_0x002f:
            java.lang.reflect.Type r4 = m23141h(r9, r10, r11)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0058
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r5 = r11.length
        L_0x003c:
            if (r3 >= r5) goto L_0x0052
            r6 = r11[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x004f
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r11 = r4.getActualTypeArguments()
            r11 = r11[r3]
            goto L_0x0059
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0052:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x0058:
            r11 = r2
        L_0x0059:
            if (r11 != r2) goto L_0x0002
            goto L_0x013e
        L_0x005d:
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0083
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0083
            java.lang.Class r11 = r0.getComponentType()
            java.lang.reflect.Type r9 = m23142i(r9, r10, r11, r12)
            boolean r10 = m23143j(r11, r9)
            if (r10 == 0) goto L_0x007b
            r11 = r0
            goto L_0x013e
        L_0x007b:
            com.google.ak.b.b r10 = new com.google.ak.b.b
            r10.<init>(r9)
        L_0x0080:
            r11 = r10
            goto L_0x013e
        L_0x0083:
            boolean r0 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x009f
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m23142i(r9, r10, r0, r12)
            boolean r10 = m23143j(r0, r9)
            if (r10 == 0) goto L_0x0099
            goto L_0x013e
        L_0x0099:
            com.google.ak.b.b r10 = new com.google.ak.b.b
            r10.<init>(r9)
            goto L_0x0080
        L_0x009f:
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00e3
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r0 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m23142i(r9, r10, r0, r12)
            boolean r0 = m23143j(r4, r0)
            r0 = r0 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b8:
            if (r3 >= r6) goto L_0x00d7
            r7 = r5[r3]
            java.lang.reflect.Type r7 = m23142i(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = m23143j(r7, r8)
            if (r8 != 0) goto L_0x00d4
            if (r0 != 0) goto L_0x00d1
            java.lang.Object r0 = r5.clone()
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
        L_0x00d1:
            r5[r3] = r7
            r0 = 1
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x00d7:
            if (r0 == 0) goto L_0x013e
            java.lang.reflect.Type r9 = r11.getRawType()
            com.google.ak.b.c r10 = new com.google.ak.b.c
            r10.<init>(r4, r9, r5)
            goto L_0x0080
        L_0x00e3:
            boolean r0 = r11 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x013e
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r0 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L_0x011a
            r4 = r0[r3]
            java.lang.reflect.Type r9 = m23142i(r9, r10, r4, r12)
            r10 = r0[r3]
            if (r9 == r10) goto L_0x013e
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0109
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getLowerBounds()
            goto L_0x010e
        L_0x0109:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x010e:
            com.google.ak.b.d r11 = new com.google.ak.b.d
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r3] = r0
            r11.<init>(r10, r9)
            goto L_0x013e
        L_0x011a:
            int r0 = r4.length
            if (r0 != r2) goto L_0x013e
            r0 = r4[r3]
            java.lang.reflect.Type r9 = m23142i(r9, r10, r0, r12)     // Catch:{ all -> 0x0144 }
            r10 = r4[r3]
            if (r9 == r10) goto L_0x013e
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0132
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getUpperBounds()
            goto L_0x0137
        L_0x0132:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x0137:
            com.google.ak.b.d r11 = new com.google.ak.b.d
            java.lang.reflect.Type[] r10 = f29193a
            r11.<init>(r9, r10)
        L_0x013e:
            if (r1 == 0) goto L_0x0143
            r12.put(r1, r11)
        L_0x0143:
            return r11
        L_0x0144:
            r9 = move-exception
            goto L_0x0147
        L_0x0146:
            throw r9
        L_0x0147:
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.C8360e.m23142i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: j */
    private static boolean m23143j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
