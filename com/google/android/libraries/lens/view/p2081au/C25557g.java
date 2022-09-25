package com.google.android.libraries.lens.view.p2081au;

/* renamed from: com.google.android.libraries.lens.view.au.g */
/* compiled from: PG */
public final class C25557g extends C25563m {

    /* renamed from: a */
    private final Throwable f69576a;

    /* renamed from: b */
    private final int f69577b;

    public C25557g(int i, Throwable th) {
        this.f69577b = i;
        if (th != null) {
            this.f69576a = th;
            return;
        }
        throw new NullPointerException("Null cause");
    }

    /* renamed from: a */
    public final Throwable mo30639a() {
        return this.f69576a;
    }

    /* renamed from: b */
    public final int mo30640b() {
        return this.f69577b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25563m) {
            C25563m mVar = (C25563m) obj;
            return this.f69577b == mVar.mo30640b() && this.f69576a.equals(mVar.mo30639a());
        }
    }

    public final int hashCode() {
        return ((this.f69577b ^ 1000003) * 1000003) ^ this.f69576a.hashCode();
    }

    public final String toString() {
        String str = this.f69577b != 1 ? "TIMEOUT" : "OTHER";
        String obj = this.f69576a.toString();
        return "QueryError{errorType=" + str + ", cause=" + obj + "}";
    }
}
