package com.google.android.apps.search.googleapp.compliance.p10144a;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.c */
/* compiled from: PG */
final class C133552c extends C133549ar {

    /* renamed from: a */
    private final boolean f363873a;

    /* renamed from: b */
    private final boolean f363874b;

    public C133552c(boolean z, boolean z2) {
        this.f363873a = z;
        this.f363874b = z2;
    }

    /* renamed from: a */
    public final boolean mo111257a() {
        return this.f363873a;
    }

    /* renamed from: b */
    public final boolean mo111258b() {
        return this.f363874b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C133549ar) {
            C133549ar arVar = (C133549ar) obj;
            return this.f363873a == arVar.mo111257a() && this.f363874b == arVar.mo111258b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f363873a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f363874b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f363873a;
        boolean z2 = this.f363874b;
        return "SignedOutSearchCustomization{enabled=" + z + ", flowCompleted=" + z2 + "}";
    }
}
