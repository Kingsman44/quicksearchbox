package com.google.android.apps.gsa.staticplugins.opa.errorui;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.o */
/* compiled from: PG */
final class C108994o extends C108933ei {

    /* renamed from: a */
    private final C108936el f303076a;

    /* renamed from: b */
    private final long f303077b;

    /* renamed from: c */
    private final StartupConfig f303078c;

    public C108994o(C108936el elVar, long j, StartupConfig startupConfig) {
        this.f303076a = elVar;
        this.f303077b = j;
        if (startupConfig != null) {
            this.f303078c = startupConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final long mo97281a() {
        return this.f303077b;
    }

    /* renamed from: b */
    public final C108936el mo97282b() {
        return this.f303076a;
    }

    /* renamed from: c */
    public final StartupConfig mo97283c() {
        return this.f303078c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108933ei) {
            C108933ei eiVar = (C108933ei) obj;
            return this.f303076a.equals(eiVar.mo97282b()) && this.f303077b == eiVar.mo97281a() && this.f303078c.equals(eiVar.mo97283c());
        }
    }

    public final int hashCode() {
        int hashCode = this.f303076a.hashCode();
        long j = this.f303077b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f303078c.hashCode();
    }

    public final String toString() {
        String obj = this.f303076a.toString();
        long j = this.f303077b;
        String obj2 = this.f303078c.toString();
        return "DebugSnapshot{condition=" + obj + ", timestamp=" + j + ", config=" + obj2 + "}";
    }
}
