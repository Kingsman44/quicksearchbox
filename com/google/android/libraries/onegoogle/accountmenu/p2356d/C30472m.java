package com.google.android.libraries.onegoogle.accountmenu.p2356d;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.m */
/* compiled from: PG */
final class C30472m extends C30480u {

    /* renamed from: a */
    private final boolean f82328a;

    public C30472m(boolean z) {
        this.f82328a = z;
    }

    /* renamed from: a */
    public final boolean mo36101a() {
        return this.f82328a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C30480u) && this.f82328a == ((C30480u) obj).mo36101a();
    }

    public final int hashCode() {
        return (true != this.f82328a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f82328a;
        return "RestrictedConfiguration{enableSuperG=" + z + "}";
    }
}
