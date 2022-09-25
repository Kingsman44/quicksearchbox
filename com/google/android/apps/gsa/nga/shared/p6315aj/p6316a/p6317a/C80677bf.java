package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bf */
/* compiled from: PG */
final class C80677bf extends C80744ds {

    /* renamed from: b */
    private final C80740do f221507b;

    /* renamed from: c */
    private final C80738dm f221508c;

    /* renamed from: d */
    private final C80742dq f221509d;

    public C80677bf(C80740do doVar, C80738dm dmVar, C80742dq dqVar) {
        this.f221507b = doVar;
        this.f221508c = dmVar;
        this.f221509d = dqVar;
    }

    /* renamed from: a */
    public final C80738dm mo74547a() {
        return this.f221508c;
    }

    /* renamed from: b */
    public final C80740do mo74548b() {
        return this.f221507b;
    }

    /* renamed from: c */
    public final C80742dq mo74549c() {
        return this.f221509d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80744ds) {
            C80744ds dsVar = (C80744ds) obj;
            return this.f221507b.equals(dsVar.mo74548b()) && this.f221508c.equals(dsVar.mo74547a()) && this.f221509d.equals(dsVar.mo74549c());
        }
    }

    public final int hashCode() {
        return ((((this.f221507b.hashCode() ^ 1000003) * 1000003) ^ this.f221508c.hashCode()) * 1000003) ^ this.f221509d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f221507b);
        String valueOf2 = String.valueOf(this.f221508c);
        String valueOf3 = String.valueOf(this.f221509d);
        return "InputPlateContent{singleContent=" + valueOf + ", doubleContent=" + valueOf2 + ", topContent=" + valueOf3 + "}";
    }
}
