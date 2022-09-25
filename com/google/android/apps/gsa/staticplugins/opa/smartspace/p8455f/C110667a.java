package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.a */
/* compiled from: PG */
final class C110667a extends C110680n {

    /* renamed from: a */
    private final String f308382a;

    /* renamed from: b */
    private final String f308383b;

    /* renamed from: c */
    private final String f308384c;

    public C110667a(String str, String str2, String str3) {
        if (str != null) {
            this.f308382a = str;
            if (str2 != null) {
                this.f308383b = str2;
                if (str3 != null) {
                    this.f308384c = str3;
                    return;
                }
                throw new NullPointerException("Null contentText");
            }
            throw new NullPointerException("Null contentTitle");
        }
        throw new NullPointerException("Null localizedHolidayName");
    }

    /* renamed from: a */
    public final String mo98839a() {
        return this.f308384c;
    }

    /* renamed from: b */
    public final String mo98840b() {
        return this.f308383b;
    }

    /* renamed from: c */
    public final String mo98841c() {
        return this.f308382a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110680n) {
            C110680n nVar = (C110680n) obj;
            return this.f308382a.equals(nVar.mo98841c()) && this.f308383b.equals(nVar.mo98840b()) && this.f308384c.equals(nVar.mo98839a());
        }
    }

    public final int hashCode() {
        return ((((this.f308382a.hashCode() ^ 1000003) * 1000003) ^ this.f308383b.hashCode()) * 1000003) ^ this.f308384c.hashCode();
    }

    public final String toString() {
        String str = this.f308382a;
        String str2 = this.f308383b;
        String str3 = this.f308384c;
        return "NotificationContent{localizedHolidayName=" + str + ", contentTitle=" + str2 + ", contentText=" + str3 + "}";
    }
}
