package p3186j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* renamed from: j$.sun.misc.c */
public final class C40953c {

    /* renamed from: b */
    private static final C40953c f107232b;

    /* renamed from: a */
    private final Unsafe f107233a;

    static {
        Field i = m71115i();
        i.setAccessible(true);
        try {
            f107232b = new C40953c((Unsafe) i.get((Object) null));
        } catch (IllegalAccessException e) {
            throw C40951a.m71110a(e);
        }
    }

    C40953c(Unsafe unsafe) {
        this.f107233a = unsafe;
    }

    /* renamed from: h */
    public static C40953c m71114h() {
        return f107232b;
    }

    /* renamed from: i */
    private static Field m71115i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw C40951a.m71111b(e);
        }
    }

    /* renamed from: a */
    public final int mo42980a(Class cls) {
        return this.f107233a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int mo42981b(Class cls) {
        return this.f107233a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public final boolean mo42982c(Object obj, long j, int i, int i2) {
        return this.f107233a.compareAndSwapInt(obj, j, i, i2);
    }

    /* renamed from: d */
    public final boolean mo42983d(Object obj, long j, long j2, long j3) {
        return this.f107233a.compareAndSwapLong(obj, j, j2, j3);
    }

    /* renamed from: e */
    public final boolean mo42984e(Object obj, long j, Object obj2) {
        return C40952b.m71113a(this.f107233a, obj, j, obj2);
    }

    /* renamed from: f */
    public final int mo42985f(Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = this.f107233a.getIntVolatile(obj, j);
        } while (!this.f107233a.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* renamed from: g */
    public final Object mo42986g(Object obj, long j) {
        return this.f107233a.getObjectVolatile(obj, j);
    }

    /* renamed from: j */
    public final long mo42987j(Class cls, String str) {
        try {
            return mo42988k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw C40951a.m71112c(e);
        }
    }

    /* renamed from: k */
    public final long mo42988k(Field field) {
        return this.f107233a.objectFieldOffset(field);
    }

    /* renamed from: l */
    public final void mo42989l(Object obj, long j, Object obj2) {
        this.f107233a.putObjectVolatile(obj, j, obj2);
    }
}
