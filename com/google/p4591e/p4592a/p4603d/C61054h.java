package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58838bb;
import com.google.common.base.C58880cq;
import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.e.a.d.h */
/* compiled from: PG */
public final class C61054h {

    /* renamed from: a */
    public static final Boolean f165297a;

    /* renamed from: b */
    public static final String f165298b;

    /* renamed from: c */
    public static final Character f165299c;

    /* renamed from: d */
    public static final Byte f165300d;

    /* renamed from: e */
    public static final Short f165301e;

    /* renamed from: f */
    public static final Integer f165302f;

    /* renamed from: g */
    public static final Float f165303g;

    /* renamed from: h */
    public static final Long f165304h;

    /* renamed from: i */
    public static final Double f165305i;

    /* renamed from: j */
    public static final BigInteger f165306j;

    /* renamed from: k */
    public static final BigDecimal f165307k;

    /* renamed from: l */
    public static final C61059m f165308l;

    /* renamed from: m */
    private static final ConcurrentHashMap f165309m;

    static {
        Boolean bool = new Boolean(true);
        f165297a = bool;
        String str = new String();
        f165298b = str;
        Character ch = new Character(0);
        f165299c = ch;
        Byte b = new Byte((byte) 0);
        f165300d = b;
        Short sh = new Short(0);
        f165301e = sh;
        Integer num = new Integer(0);
        f165302f = num;
        Float f = new Float(0.0f);
        f165303g = f;
        Long l = new Long(0);
        f165304h = l;
        Double d = new Double(C59203do.f157270a);
        f165305i = d;
        BigInteger bigInteger = new BigInteger("0");
        f165306j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f165307k = bigDecimal;
        C61059m mVar = new C61059m(false, 0, (Integer) null);
        f165308l = mVar;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f165309m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C61059m.class, mVar);
    }

    /* renamed from: a */
    public static Object m93407a(Object obj) {
        Object obj2;
        if (obj == null || m93416j(obj.getClass())) {
            return obj;
        }
        if (obj instanceof C61064r) {
            return ((C61064r) obj).clone();
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            obj2 = Array.newInstance(cls.getComponentType(), Array.getLength(obj));
        } else if (obj instanceof C61050d) {
            obj2 = ((C61050d) obj).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) obj).toArray();
            m93414h(array, array);
            return Arrays.asList(array);
        } else {
            obj2 = C61046aa.m93387d(cls);
        }
        m93414h(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public static Object m93408b(Class cls) {
        Object obj;
        Object obj2 = f165309m.get(cls);
        if (obj2 != null) {
            return obj2;
        }
        int i = 0;
        if (cls.isArray()) {
            Class cls2 = cls;
            do {
                cls2 = cls2.getComponentType();
                i++;
            } while (cls2.isArray());
            obj = Array.newInstance(cls2, new int[i]);
        } else if (cls.isEnum()) {
            C61060n b = C61053g.m93405a(cls, false).mo57610b((String) null);
            Object[] objArr = {cls};
            if (b != null) {
                obj = b.mo57631c();
            } else {
                throw new NullPointerException(C58880cq.m90965a("enum missing constant with @NullValue annotation: %s", objArr));
            }
        } else {
            obj = C61046aa.m93387d(cls);
        }
        Object putIfAbsent = f165309m.putIfAbsent(cls, obj);
        return putIfAbsent == null ? obj : putIfAbsent;
    }

    /* renamed from: c */
    public static Object m93409c(Type type, String str) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        int i5;
        Type type2 = type;
        String str3 = str;
        Class<BigDecimal> cls = type2 instanceof Class ? (Class) type2 : null;
        if (type2 == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str3 == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str3;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str3.charAt(0));
                }
                new StringBuilder("expected type Character/char but got ").append(cls);
                throw new IllegalArgumentException("expected type Character/char but got ".concat(cls.toString()));
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C61059m.class) {
                    Matcher matcher = C61059m.f165324b.matcher(str3);
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
                        int parseInt3 = Integer.parseInt(matcher.group(3));
                        boolean z = matcher.group(4) != null;
                        String group = matcher.group(9);
                        boolean z2 = group != null;
                        if (!z2 || z) {
                            if (z) {
                                int parseInt4 = Integer.parseInt(matcher.group(5));
                                int parseInt5 = Integer.parseInt(matcher.group(6));
                                int parseInt6 = Integer.parseInt(matcher.group(7));
                                if (matcher.group(8) != null) {
                                    str2 = group;
                                    double parseInt7 = (double) ((float) Integer.parseInt(matcher.group(8).substring(1)));
                                    double pow = Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3));
                                    Double.isNaN(parseInt7);
                                    i4 = (int) (parseInt7 / pow);
                                    i2 = parseInt5;
                                    i = parseInt6;
                                } else {
                                    str2 = group;
                                    i2 = parseInt5;
                                    i = parseInt6;
                                    i4 = 0;
                                }
                                i3 = parseInt4;
                            } else {
                                str2 = group;
                                i4 = 0;
                                i3 = 0;
                                i2 = 0;
                                i = 0;
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(C61059m.f165323a);
                            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i3, i2, i);
                            gregorianCalendar.set(14, i4);
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (!z || !z2) {
                                num = null;
                            } else {
                                if (Character.toUpperCase(str2.charAt(0)) == 'Z') {
                                    i5 = 0;
                                } else {
                                    int parseInt8 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                                    i5 = matcher.group(10).charAt(0) == '-' ? -parseInt8 : parseInt8;
                                    timeInMillis -= ((long) i5) * 60000;
                                }
                                num = Integer.valueOf(i5);
                            }
                            return new C61059m(true ^ z, timeInMillis, num);
                        }
                        throw new NumberFormatException("Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(str3));
                    }
                    throw new NumberFormatException("Invalid date/time format: ".concat(str3));
                } else if (cls == BigInteger.class) {
                    return new BigInteger(str3);
                } else {
                    if (cls == BigDecimal.class) {
                        return new BigDecimal(str3);
                    }
                    if (cls.isEnum()) {
                        if (C61053g.m93405a(cls, false).f165296d.contains(str3)) {
                            return C61053g.m93405a(cls, false).mo57610b(str3).mo57631c();
                        }
                        throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{str3}));
                    }
                }
            }
        }
        new StringBuilder("expected primitive class, but got: ").append(type2);
        throw new IllegalArgumentException("expected primitive class, but got: ".concat(String.valueOf(type)));
    }

    /* renamed from: d */
    public static Type m93410d(List list, Type type) {
        if (type instanceof WildcardType) {
            type = C61046aa.m93391h((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type j = C61046aa.m93393j(list, (TypeVariable) type);
            if (j != null) {
                type = j;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    /* renamed from: e */
    public static Collection m93411e(Type type) {
        if (type instanceof WildcardType) {
            type = C61046aa.m93391h((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            new StringBuilder("unable to create new instance of type: ").append(type);
            throw new IllegalArgumentException("unable to create new instance of type: ".concat(type.toString()));
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) C61046aa.m93387d(cls);
        }
    }

    /* renamed from: f */
    public static Map m93412f(Object obj) {
        if (m93415i(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new C61058l(obj, false);
    }

    /* renamed from: g */
    public static Map m93413g(Class cls) {
        if (cls == null || cls.isAssignableFrom(C61050d.class)) {
            return new C61050d();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) C61046aa.m93387d(cls);
    }

    /* renamed from: h */
    public static void m93414h(Object obj, Object obj2) {
        C61053g gVar;
        Object d;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i = 0;
        C58838bb.m90868c(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            C58838bb.m90868c(z);
            for (Object a : C61046aa.m93386c(obj)) {
                Array.set(obj2, i, m93407a(a));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a2 : collection) {
                collection2.add(m93407a(a2));
            }
        } else {
            boolean isAssignableFrom = C61064r.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                if (isAssignableFrom) {
                    gVar = ((C61064r) obj).f165340c;
                } else {
                    gVar = C61053g.m93405a(cls, false);
                }
                for (String b : gVar.f165296d) {
                    C61060n b2 = gVar.mo57610b(b);
                    if (!b2.mo57632f() && ((!isAssignableFrom || !b2.f165329a) && (d = C61060n.m93425d(b2.f165330b, obj)) != null)) {
                        C61060n.m93426e(b2.f165330b, obj2, m93407a(d));
                    }
                }
            } else if (C61050d.class.isAssignableFrom(cls)) {
                C61050d dVar = (C61050d) obj2;
                C61050d dVar2 = (C61050d) obj;
                int i2 = dVar2.f165288a;
                while (i < i2) {
                    dVar.mo57603d(i, m93407a(dVar2.mo57597b(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), m93407a(entry.getValue()));
                }
            }
        }
    }

    /* renamed from: i */
    public static boolean m93415i(Object obj) {
        return obj == f165309m.get(obj.getClass());
    }

    /* renamed from: j */
    public static boolean m93416j(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        if (((Class) type).isPrimitive() || type == Character.class || type == String.class || type == Integer.class || type == Long.class || type == Short.class || type == Byte.class || type == Float.class || type == Double.class || type == BigInteger.class || type == BigDecimal.class || type == C61059m.class || type == Boolean.class) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m93417k(Object obj) {
        return m93416j(obj.getClass());
    }
}
