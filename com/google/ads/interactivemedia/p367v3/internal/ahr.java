package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahr */
/* compiled from: PG */
public final class ahr implements Cloneable, agu {

    /* renamed from: a */
    public static final ahr f20662a = new ahr();

    /* renamed from: b */
    private final double f20663b = -1.0d;

    /* renamed from: c */
    private final int f20664c = 136;

    /* renamed from: d */
    private final boolean f20665d = true;

    /* renamed from: e */
    private List f20666e = Collections.emptyList();

    /* renamed from: f */
    private final List f20667f = Collections.emptyList();

    /* renamed from: f */
    private final boolean m18738f(Class cls) {
        return m18740h(cls);
    }

    /* renamed from: g */
    private final boolean m18739g(Class cls, boolean z) {
        for (apz apz : z ? this.f20666e : this.f20667f) {
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m18740h(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        boolean z;
        boolean z2;
        Class a = akz.mo14887a();
        boolean f = m18738f(a);
        if (!f) {
            m18739g(a, true);
            z = false;
        } else {
            z = true;
        }
        if (!f) {
            m18739g(a, false);
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            return null;
        }
        return new ahq(this, z2, true, age, akz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ahr clone() {
        try {
            return (ahr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final boolean mo14772c(Field field, boolean z) {
        List<apz> list;
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m18740h(field.getType())) {
            return true;
        }
        if (z) {
            list = this.f20666e;
        } else {
            list = this.f20667f;
        }
        if (list.isEmpty()) {
            return false;
        }
        afv afv = new afv(field);
        for (apz apz : list) {
            if (apz.m19254c(afv)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo14774d(Class cls, boolean z) {
        if (m18738f(cls)) {
            return true;
        }
        m18739g(cls, z);
        return false;
    }

    /* renamed from: e */
    public final ahr mo14775e(apz apz) {
        ahr b = clone();
        ArrayList arrayList = new ArrayList(this.f20666e);
        b.f20666e = arrayList;
        arrayList.add(apz);
        return b;
    }
}
