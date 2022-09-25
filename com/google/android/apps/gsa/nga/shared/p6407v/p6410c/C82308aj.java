package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.aj */
/* compiled from: PG */
public final class C82308aj extends C82536iv {

    /* renamed from: a */
    private final String f224829a = "HOTWORD_VERIFICATION_STATUS";

    /* renamed from: b */
    private final String f224830b;

    public C82308aj(String str, String str2) {
        this.f224830b = str2;
    }

    /* renamed from: b */
    public final String mo75627b() {
        return this.f224830b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224829a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82536iv) {
            C82536iv ivVar = (C82536iv) obj;
            return this.f224829a.equals(ivVar.mo75583d()) && this.f224830b.equals(ivVar.mo75627b());
        }
    }

    public final int hashCode() {
        return ((this.f224829a.hashCode() ^ 1000003) * 1000003) ^ this.f224830b.hashCode();
    }

    public final String toString() {
        String str = this.f224829a;
        String str2 = this.f224830b;
        return "HotwordVerificationStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
