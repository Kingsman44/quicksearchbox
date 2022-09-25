package com.google.android.apps.search.googleapp.launcher.p10341b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.g */
/* compiled from: PG */
final class C136473g extends C136447c {

    /* renamed from: a */
    private final int f371560a;

    /* renamed from: b */
    private final int f371561b;

    /* renamed from: c */
    private final C136443b f371562c;

    public C136473g(int i, int i2, C136443b bVar) {
        this.f371560a = i;
        this.f371561b = i2;
        if (bVar != null) {
            this.f371562c = bVar;
            return;
        }
        throw new NullPointerException("Null acetoneOptions");
    }

    /* renamed from: a */
    public final int mo113053a() {
        return this.f371561b;
    }

    /* renamed from: b */
    public final int mo113054b() {
        return this.f371560a;
    }

    /* renamed from: c */
    public final C136443b mo113055c() {
        return this.f371562c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136447c) {
            C136447c cVar = (C136447c) obj;
            return this.f371560a == cVar.mo113054b() && this.f371561b == cVar.mo113053a() && this.f371562c.equals(cVar.mo113055c());
        }
    }

    public final int hashCode() {
        return ((((this.f371560a ^ 1000003) * 1000003) ^ this.f371561b) * 1000003) ^ this.f371562c.hashCode();
    }

    public final String toString() {
        int i = this.f371560a;
        int i2 = this.f371561b;
        String obj = this.f371562c.toString();
        return "AcetoneState{serverVersion=" + i + ", clientVersion=" + i2 + ", acetoneOptions=" + obj + "}";
    }
}
