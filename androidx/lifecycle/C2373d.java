package androidx.lifecycle;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.lifecycle.d */
/* compiled from: PG */
final class C2373d {

    /* renamed from: a */
    final int f6593a;

    /* renamed from: b */
    final Method f6594b;

    public C2373d(int i, Method method) {
        this.f6593a = i;
        this.f6594b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2373d)) {
            return false;
        }
        C2373d dVar = (C2373d) obj;
        return this.f6593a == dVar.f6593a && this.f6594b.getName().equals(dVar.f6594b.getName());
    }

    public final int hashCode() {
        return (this.f6593a * 31) + this.f6594b.getName().hashCode();
    }
}
