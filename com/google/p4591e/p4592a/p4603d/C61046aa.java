package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.e.a.d.aa */
/* compiled from: PG */
public final class C61046aa {
    /* renamed from: a */
    public static Class m93384a(List list, Type type) {
        if (type instanceof TypeVariable) {
            type = m93393j(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m93384a(list, m93390g(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m93385b((ParameterizedType) type);
        }
        C58838bb.m90874i(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: b */
    public static Class m93385b(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: c */
    public static Iterable m93386c(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        C58838bb.m90874i(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new C61072z(obj);
    }

    /* renamed from: d */
    public static Object m93387d(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m93396m(e, cls);
        } catch (InstantiationException e2) {
            throw m93396m(e2, cls);
        }
    }

    /* renamed from: e */
    public static ParameterizedType m93388e(Type type, Class cls) {
        Class cls2;
        Class cls3;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class b = m93385b(parameterizedType);
                if (b == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : b.getGenericInterfaces()) {
                        if (type2 instanceof Class) {
                            cls3 = (Class) type2;
                        } else {
                            cls3 = m93385b((ParameterizedType) type2);
                        }
                        if (cls.isAssignableFrom(cls3)) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = b;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    /* renamed from: f */
    public static Type m93389f(Type type, Class cls, int i) {
        ParameterizedType e = m93388e(type, cls);
        if (e == null) {
            return null;
        }
        Type type2 = e.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type j = m93393j(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (j != null) {
                return j;
            }
        }
        return type2;
    }

    /* renamed from: g */
    public static Type m93390g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m93391h(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* renamed from: i */
    public static Type m93392i(Type type) {
        return m93389f(type, Map.class, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = m93393j(r5, (java.lang.reflect.TypeVariable) r6);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m93393j(java.util.List r5, java.lang.reflect.TypeVariable r6) {
        /*
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x004d
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r3 = r5.size()
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0022
            java.lang.Object r4 = r5.get(r3)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.ParameterizedType r4 = m93388e(r4, r1)
            goto L_0x0011
        L_0x0022:
            if (r4 == 0) goto L_0x004d
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0038
            r2 = r0[r1]
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0038:
            java.lang.reflect.Type[] r6 = r4.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x004c
            r0 = r6
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type r5 = m93393j(r5, r0)
            if (r5 == 0) goto L_0x004c
            return r5
        L_0x004c:
            return r6
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4591e.p4592a.p4603d.C61046aa.m93393j(java.util.List, java.lang.reflect.TypeVariable):java.lang.reflect.Type");
    }

    /* renamed from: k */
    public static boolean m93394k(Type type) {
        if (!(type instanceof GenericArrayType)) {
            return (type instanceof Class) && ((Class) type).isArray();
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m93395l(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* renamed from: m */
    private static IllegalArgumentException m93396m(Exception exc, Class cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        int size = arrayList.size();
        boolean z = false;
        while (i < size) {
            String str = (String) arrayList.get(i);
            if (z) {
                sb.append(" and");
            }
            sb.append(" ");
            sb.append(str);
            i++;
            z = true;
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }
}
