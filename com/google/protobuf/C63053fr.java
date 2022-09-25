package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.fr */
/* compiled from: PG */
abstract class C63053fr {

    /* renamed from: a */
    final Unsafe f170168a;

    public C63053fr(Unsafe unsafe) {
        this.f170168a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo59123a(long j);

    /* renamed from: b */
    public abstract double mo59124b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo59125c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo59126d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo59127e(byte[] bArr, long j, long j2, long j3);

    /* renamed from: f */
    public abstract void mo59128f(Object obj, long j, boolean z);

    /* renamed from: g */
    public abstract void mo59129g(long j, byte b);

    /* renamed from: h */
    public abstract void mo59130h(Object obj, long j, byte b);

    /* renamed from: i */
    public abstract void mo59131i(Object obj, long j, double d);

    /* renamed from: j */
    public abstract void mo59132j(Object obj, long j, float f);

    /* renamed from: k */
    public abstract boolean mo59133k(Object obj, long j);

    /* renamed from: l */
    public final int mo59134l(Class cls) {
        return this.f170168a.arrayBaseOffset(cls);
    }

    /* renamed from: m */
    public final int mo59135m(Object obj, long j) {
        return this.f170168a.getInt(obj, j);
    }

    /* renamed from: n */
    public final long mo59136n(Object obj, long j) {
        return this.f170168a.getLong(obj, j);
    }

    /* renamed from: o */
    public final long mo59137o(Field field) {
        return this.f170168a.objectFieldOffset(field);
    }

    /* renamed from: p */
    public final Object mo59138p(Object obj, long j) {
        return this.f170168a.getObject(obj, j);
    }

    /* renamed from: q */
    public final void mo59139q(Object obj, long j, int i) {
        this.f170168a.putInt(obj, j, i);
    }

    /* renamed from: r */
    public final void mo59140r(Object obj, long j, long j2) {
        this.f170168a.putLong(obj, j, j2);
    }

    /* renamed from: s */
    public final void mo59141s(Object obj, long j, Object obj2) {
        this.f170168a.putObject(obj, j, obj2);
    }

    /* renamed from: t */
    public final void mo59142t(Class cls) {
        this.f170168a.arrayIndexScale(cls);
    }
}
