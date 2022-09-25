package androidx.preference;

import android.text.TextUtils;

/* renamed from: androidx.preference.ao */
/* compiled from: PG */
final class C3989ao {

    /* renamed from: a */
    final int f12817a;

    /* renamed from: b */
    final int f12818b;

    /* renamed from: c */
    final String f12819c;

    public C3989ao(Preference preference) {
        this.f12819c = preference.getClass().getName();
        this.f12817a = preference.f12718D;
        this.f12818b = preference.f12719E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3989ao)) {
            return false;
        }
        C3989ao aoVar = (C3989ao) obj;
        if (this.f12817a == aoVar.f12817a && this.f12818b == aoVar.f12818b && TextUtils.equals(this.f12819c, aoVar.f12819c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12817a + 527) * 31) + this.f12818b) * 31) + this.f12819c.hashCode();
    }
}
