package com.google.frameworks.client.data.android.p4639f;

/* renamed from: com.google.frameworks.client.data.android.f.c */
/* compiled from: PG */
public final class C61416c extends C61422i {

    /* renamed from: a */
    private final String f166097a;

    public C61416c(String str) {
        if (str != null) {
            this.f166097a = str;
            return;
        }
        throw new NullPointerException("Null host");
    }

    /* renamed from: a */
    public final int mo58032a() {
        return 443;
    }

    /* renamed from: b */
    public final int mo58033b() {
        return 443;
    }

    /* renamed from: c */
    public final String mo58034c() {
        return this.f166097a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61422i) {
            C61422i iVar = (C61422i) obj;
            return this.f166097a.equals(iVar.mo58034c()) && iVar.mo58033b() == 443 && iVar.mo58032a() == 443;
        }
    }

    public final int hashCode() {
        return ((((this.f166097a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        String str = this.f166097a;
        return "QuicHint{host=" + str + ", port=443, alternatePort=443}";
    }
}
