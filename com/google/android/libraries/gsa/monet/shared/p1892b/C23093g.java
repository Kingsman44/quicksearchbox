package com.google.android.libraries.gsa.monet.shared.p1892b;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.gsa.monet.shared.b.g */
/* compiled from: PG */
public final class C23093g implements Serializable {

    /* renamed from: a */
    public static final C23093g f63435a = new C23093g();
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private final Object f63436b;

    private C23093g() {
        this.f63436b = null;
    }

    public C23093g(Object obj) {
        obj.getClass();
        this.f63436b = obj;
    }

    /* renamed from: a */
    public final Object mo28552a() {
        Object obj = this.f63436b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Optional.get() cannot be called on an absent value.");
    }

    /* renamed from: b */
    public final Object mo28553b(Object obj) {
        Object obj2 = this.f63436b;
        if (obj2 != null) {
            return obj2;
        }
        C23067b.m43236i(obj, "use MonetOptional.orNull() instead of MonetOptional.or(null)");
        return obj;
    }

    /* renamed from: c */
    public final boolean mo28554c() {
        return this.f63436b != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23093g) {
            C23093g gVar = (C23093g) obj;
            if (this.f63436b != null) {
                if (!gVar.mo28554c() || !this.f63436b.equals(gVar.mo28552a())) {
                    return false;
                }
                return true;
            } else if (!gVar.mo28554c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f63436b;
        if (obj != null) {
            return obj.hashCode() + 1502476572;
        }
        return 2040732332;
    }

    public final String toString() {
        Object obj = this.f63436b;
        if (obj == null) {
            return "MonetOptional.absent()";
        }
        String obj2 = obj.toString();
        return "MonetOptional.of(" + obj2 + ")";
    }
}
