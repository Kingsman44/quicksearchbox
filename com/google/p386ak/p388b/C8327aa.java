package com.google.p386ak.p388b;

import com.google.p386ak.C8263a;
import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ak.b.aa */
/* compiled from: PG */
public final class C8327aa implements Cloneable, C8267ab {

    /* renamed from: a */
    public static final C8327aa f29138a = new C8327aa();

    /* renamed from: b */
    public final double f29139b = -1.0d;

    /* renamed from: c */
    public final int f29140c = 136;

    /* renamed from: d */
    public final boolean f29141d = true;

    /* renamed from: e */
    public final List f29142e = Collections.emptyList();

    /* renamed from: f */
    public final List f29143f = Collections.emptyList();

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        boolean c = mo17042c(aVar.f29213a);
        boolean z = c || mo17045e(true);
        boolean z2 = c || mo17045e(false);
        if (z || z2) {
            return new C8381z(this, z2, z, iVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C8327aa clone() {
        try {
            return (C8327aa) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final boolean mo17042c(Class cls) {
        return mo17044d(cls);
    }

    /* renamed from: d */
    public final boolean mo17044d(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo17045e(boolean z) {
        List<C8263a> list;
        if (z) {
            list = this.f29142e;
        } else {
            list = this.f29143f;
        }
        for (C8263a a : list) {
            if (a.mo17023a()) {
                return true;
            }
        }
        return false;
    }
}
