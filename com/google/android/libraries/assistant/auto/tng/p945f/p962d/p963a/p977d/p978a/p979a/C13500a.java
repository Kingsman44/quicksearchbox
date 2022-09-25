package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.a */
/* compiled from: PG */
final class C13500a extends C13507h {

    /* renamed from: a */
    public final String f41419a;

    /* renamed from: b */
    public final String f41420b;

    public C13500a(String str, String str2) {
        if (str != null) {
            this.f41419a = str;
            if (str2 != null) {
                this.f41420b = str2;
                return;
            }
            throw new NullPointerException("Null messageString");
        }
        throw new NullPointerException("Null displayString");
    }

    /* renamed from: a */
    public final String mo21133a() {
        return this.f41419a;
    }

    /* renamed from: b */
    public final String mo21134b() {
        return this.f41420b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13507h) {
            C13507h hVar = (C13507h) obj;
            return this.f41419a.equals(hVar.mo21133a()) && this.f41420b.equals(hVar.mo21134b());
        }
    }

    public final int hashCode() {
        return ((this.f41419a.hashCode() ^ 1000003) * 1000003) ^ this.f41420b.hashCode();
    }

    public final String toString() {
        String str = this.f41419a;
        String str2 = this.f41420b;
        return "EtaButtonMessageString{displayString=" + str + ", messageString=" + str2 + "}";
    }
}
