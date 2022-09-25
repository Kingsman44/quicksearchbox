package kotlinx.coroutines.p5579e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.coroutines.C71401ah;
import p5462h.C69692j;
import p5462h.C69714l;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.r */
/* compiled from: PG */
public final class C71736r {

    /* renamed from: a */
    private static final int f191214a = m104898c(Throwable.class, -1);

    /* renamed from: b */
    private static final C71727i f191215b;

    static {
        C71727i iVar;
        try {
            if (C71737s.f191216a) {
                iVar = C71720ba.f191192a;
            } else {
                iVar = C71724f.f191198a;
            }
        } catch (Throwable unused) {
            iVar = C71720ba.f191192a;
        }
        f191215b = iVar;
    }

    /* renamed from: a */
    public static final Throwable m104896a(Throwable th) {
        Object obj;
        C69664n.m101061g(th, "exception");
        if (!(th instanceof C71401ah)) {
            return (Throwable) f191215b.mo62975a(th.getClass()).mo5761a(th);
        }
        try {
            obj = ((C71401ah) th).mo62763a();
        } catch (Throwable th2) {
            obj = C69714l.m101133a(th2);
        }
        if (true == (obj instanceof C69692j)) {
            obj = null;
        }
        return (Throwable) obj;
    }

    /* renamed from: b */
    public static final C69626l m104897b(Class cls) {
        C69626l lVar;
        C71731m mVar = C71731m.f191209a;
        if (f191214a != m104898c(cls, 0)) {
            return mVar;
        }
        Object[] constructors = cls.getConstructors();
        C71730l lVar2 = new C71730l();
        C69664n.m101061g(constructors, "<this>");
        C69664n.m101061g(constructors, "<this>");
        int length = constructors.length;
        if (length != 0) {
            constructors = Arrays.copyOf(constructors, length);
            C69664n.m101060f(constructors, "copyOf(this, size)");
            C69531o.m100925c(constructors, lVar2);
        }
        for (Constructor constructor : C69531o.m100923a(constructors)) {
            Class[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                lVar = null;
                if (length2 == 1) {
                    Class cls2 = parameterTypes[0];
                    if (C69664n.m101066l(cls2, Throwable.class)) {
                        lVar = new C71733o(constructor);
                        continue;
                    } else if (C69664n.m101066l(cls2, String.class)) {
                        lVar = new C71734p(constructor);
                        continue;
                    } else {
                        continue;
                    }
                } else if (length2 == 2 && C69664n.m101066l(parameterTypes[0], String.class) && C69664n.m101066l(parameterTypes[1], Throwable.class)) {
                    lVar = new C71732n(constructor);
                    continue;
                }
            } else {
                lVar = new C71735q(constructor);
                continue;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return mVar;
    }

    /* renamed from: c */
    private static final int m104898c(Class cls, int i) {
        Object obj;
        C69664n.m101061g(cls, "<this>");
        int i2 = C69649af.f186028a;
        new C69657g(cls);
        int i3 = 0;
        do {
            try {
                int i4 = 0;
                for (Field modifiers : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(modifiers.getModifiers())) {
                        i4++;
                    }
                }
                i3 += i4;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                obj = C69714l.m101133a(th);
            }
        } while (cls != null);
        obj = Integer.valueOf(i3);
        Object valueOf = Integer.valueOf(i);
        if (true == (obj instanceof C69692j)) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }
}
