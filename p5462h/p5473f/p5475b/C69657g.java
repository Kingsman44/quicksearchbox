package p5462h.p5473f.p5475b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.C69614a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69616b;
import p5462h.p5473f.p5474a.C69617c;
import p5462h.p5473f.p5474a.C69618d;
import p5462h.p5473f.p5474a.C69619e;
import p5462h.p5473f.p5474a.C69620f;
import p5462h.p5473f.p5474a.C69621g;
import p5462h.p5473f.p5474a.C69622h;
import p5462h.p5473f.p5474a.C69623i;
import p5462h.p5473f.p5474a.C69624j;
import p5462h.p5473f.p5474a.C69625k;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69627m;
import p5462h.p5473f.p5474a.C69628n;
import p5462h.p5473f.p5474a.C69629o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5474a.C69632r;
import p5462h.p5473f.p5474a.C69633s;
import p5462h.p5473f.p5474a.C69634t;
import p5462h.p5473f.p5474a.C69635u;
import p5462h.p5473f.p5474a.C69636v;
import p5462h.p5473f.p5474a.C69637w;
import p5462h.p5481k.C69704b;
import p5462h.p5483m.C69764m;

/* renamed from: h.f.b.g */
/* compiled from: PG */
public final class C69657g implements C69704b, C69656f {

    /* renamed from: a */
    public static final Map f186039a;

    /* renamed from: c */
    private static final Map f186040c;

    /* renamed from: d */
    private static final HashMap f186041d;

    /* renamed from: e */
    private static final HashMap f186042e;

    /* renamed from: f */
    private static final HashMap f186043f;

    /* renamed from: b */
    public final Class f186044b;

    static {
        int i = 0;
        List e = C69540x.m100947e(C69615a.class, C69626l.class, C69630p.class, C69631q.class, C69632r.class, C69633s.class, C69634t.class, C69635u.class, C69636v.class, C69637w.class, C69616b.class, C69617c.class, C69618d.class, C69619e.class, C69620f.class, C69621g.class, C69622h.class, C69623i.class, C69624j.class, C69625k.class, C69627m.class, C69628n.class, C69629o.class);
        ArrayList arrayList = new ArrayList(C69540x.m100804k(e, 10));
        for (Object next : e) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            arrayList.add(new C69685i((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f186040c = C69505av.m100874p(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f186041d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f186042e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C69664n.m101060f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C69664n.m101060f(str, "kotlinName");
            sb.append(C69764m.m101190G(str, str));
            sb.append("CompanionObject");
            C69685i iVar = new C69685i(sb.toString(), String.valueOf(str).concat(".Companion"));
            hashMap3.put(iVar.f186052a, iVar.f186053b);
        }
        for (Map.Entry entry : f186040c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f186043f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, C69764m.m101190G(str2, str2));
        }
        f186039a = linkedHashMap;
    }

    public C69657g(Class cls) {
        C69664n.m101061g(cls, "jClass");
        this.f186044b = cls;
    }

    /* renamed from: a */
    public final Class mo61378a() {
        return this.f186044b;
    }

    /* renamed from: b */
    public final String mo61379b() {
        String str;
        Class cls = this.f186044b;
        C69664n.m101061g(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C69664n.m101060f(simpleName, "name");
                String u = C69764m.m101201u(simpleName, enclosingMethod.getName() + '$', simpleName);
                if (u != null) {
                    return u;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C69664n.m101060f(simpleName, "name");
                return C69764m.m101201u(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            C69664n.m101060f(simpleName, "name");
            C69664n.m101061g(simpleName, "<this>");
            C69664n.m101061g(simpleName, "missingDelimiterValue");
            int B = C69764m.m101185B(simpleName, '$', 0, 6);
            if (B == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(B + 1, simpleName.length());
            C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) f186039a.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        } else {
            String str3 = (String) f186039a.get(cls.getName());
            return str3 == null ? cls.getSimpleName() : str3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C69657g) && C69664n.m101066l(C69614a.m101027b(this), C69614a.m101027b((C69704b) obj));
    }

    public final int hashCode() {
        return C69614a.m101027b(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f186044b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
