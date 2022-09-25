package com.google.android.apps.gsa.opa.p6437d.p6438a;

/* renamed from: com.google.android.apps.gsa.opa.d.a.b */
/* compiled from: PG */
public final class C83605b extends C83604a {

    /* renamed from: a */
    private final String f227926a;

    /* renamed from: b */
    private final String f227927b;

    public C83605b(String str, String str2) {
        if (str != null) {
            this.f227926a = str;
            if (str2 != null) {
                this.f227927b = str2;
                return;
            }
            throw new NullPointerException("Null humanFriendlyName");
        }
        throw new NullPointerException("Null castDeviceId");
    }

    /* renamed from: a */
    public final String mo76960a() {
        return this.f227926a;
    }

    /* renamed from: b */
    public final String mo76961b() {
        return this.f227927b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83604a) {
            C83604a aVar = (C83604a) obj;
            return this.f227926a.equals(aVar.mo76960a()) && this.f227927b.equals(aVar.mo76961b());
        }
    }

    public final int hashCode() {
        return ((this.f227926a.hashCode() ^ 1000003) * 1000003) ^ this.f227927b.hashCode();
    }

    public final String toString() {
        String str = this.f227926a;
        String str2 = this.f227927b;
        return "AssistantDevice{castDeviceId=" + str + ", humanFriendlyName=" + str2 + "}";
    }
}
