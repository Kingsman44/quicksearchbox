package com.google.common.p4522b;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.de */
/* compiled from: PG */
final class C58388de extends C58384da {

    /* renamed from: h */
    transient long[] f155984h;

    /* renamed from: i */
    private transient int f155985i;

    /* renamed from: j */
    private transient int f155986j;

    public C58388de() {
        super(3);
    }

    /* renamed from: u */
    private final int m89463u(int i) {
        return ((int) (m89465w()[i] >>> 32)) - 1;
    }

    /* renamed from: w */
    private final long[] m89465w() {
        return (long[]) Objects.requireNonNull(this.f155984h);
    }

    /* renamed from: a */
    public final int mo55084a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* renamed from: b */
    public final int mo55085b() {
        int b = super.mo55085b();
        this.f155984h = new long[b];
        return b;
    }

    /* renamed from: c */
    public final int mo55086c() {
        return this.f155985i;
    }

    public final void clear() {
        if (!mo55108q()) {
            this.f155985i = -2;
            this.f155986j = -2;
            long[] jArr = this.f155984h;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0);
            }
            super.clear();
        }
    }

    /* renamed from: d */
    public final int mo55090d(int i) {
        return ((int) m89465w()[i]) - 1;
    }

    /* renamed from: i */
    public final Map mo55097i() {
        Map i = super.mo55097i();
        this.f155984h = null;
        return i;
    }

    /* renamed from: j */
    public final Map mo55099j(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    /* renamed from: m */
    public final void mo55103m(int i) {
        super.mo55103m(i);
        this.f155985i = -2;
        this.f155986j = -2;
    }

    /* renamed from: n */
    public final void mo55104n(int i, Object obj, Object obj2, int i2, int i3) {
        super.mo55104n(i, obj, obj2, i2, i3);
        m89464v(this.f155986j, i);
        m89464v(i, -2);
    }

    /* renamed from: o */
    public final void mo55105o(int i, int i2) {
        int size = size() - 1;
        super.mo55105o(i, i2);
        m89464v(m89463u(i), mo55090d(i));
        if (i < size) {
            m89464v(m89463u(size), i);
            m89464v(i, mo55090d(size));
        }
        m89465w()[size] = 0;
    }

    /* renamed from: p */
    public final void mo55106p(int i) {
        super.mo55106p(i);
        this.f155984h = Arrays.copyOf(m89465w(), i);
    }

    public C58388de(byte[] bArr) {
        super(3);
    }

    /* renamed from: v */
    private final void m89464v(int i, int i2) {
        if (i == -2) {
            this.f155985i = i2;
            i = -2;
        } else {
            m89465w()[i] = (m89465w()[i] & -4294967296L) | (((long) (i2 + 1)) & 4294967295L);
        }
        if (i2 == -2) {
            this.f155986j = i;
            return;
        }
        m89465w()[i2] = (4294967295L & m89465w()[i2]) | (((long) (i + 1)) << 32);
    }
}
