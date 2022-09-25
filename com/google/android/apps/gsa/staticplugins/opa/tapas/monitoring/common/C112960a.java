package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.a */
/* compiled from: PG */
public final class C112960a extends C112965f {

    /* renamed from: a */
    private final String f313031a;

    /* renamed from: b */
    private final String f313032b;

    public C112960a(String str, String str2) {
        if (str != null) {
            this.f313031a = str;
            if (str2 != null) {
                this.f313032b = str2;
                return;
            }
            throw new NullPointerException("Null label");
        }
        throw new NullPointerException("Null component");
    }

    /* renamed from: a */
    public final String mo99789a() {
        return this.f313031a;
    }

    /* renamed from: b */
    public final String mo99790b() {
        return this.f313032b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112965f) {
            C112965f fVar = (C112965f) obj;
            return this.f313031a.equals(fVar.mo99789a()) && this.f313032b.equals(fVar.mo99790b());
        }
    }

    public final int hashCode() {
        return ((this.f313031a.hashCode() ^ 1000003) * 1000003) ^ this.f313032b.hashCode();
    }
}
