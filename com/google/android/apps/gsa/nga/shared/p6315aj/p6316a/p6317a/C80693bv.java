package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bv */
/* compiled from: PG */
public final class C80693bv extends C80794fo {

    /* renamed from: a */
    public final C80793fn f221558a;

    public C80693bv(C80793fn fnVar) {
        if (fnVar != null) {
            this.f221558a = fnVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: a */
    public final C80793fn mo74626a() {
        return this.f221558a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80794fo) {
            return this.f221558a.equals(((C80794fo) obj).mo74626a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f221558a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f221558a.toString();
        return "TtsStatusChange{status=" + obj + "}";
    }
}
