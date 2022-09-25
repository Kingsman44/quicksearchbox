package com.google.android.libraries.onegoogle.accountmenu.cards;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.i */
/* compiled from: PG */
final class C30441i extends C30356ak {

    /* renamed from: a */
    public final boolean f82242a;

    public C30441i(boolean z) {
        this.f82242a = z;
    }

    /* renamed from: a */
    public final C30355aj mo35934a() {
        return new C30440h(this);
    }

    /* renamed from: b */
    public final boolean mo35935b() {
        return this.f82242a;
    }

    /* renamed from: c */
    public final boolean mo35936c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30356ak) {
            C30356ak akVar = (C30356ak) obj;
            return this.f82242a == akVar.mo35935b() && !akVar.mo35936c();
        }
    }

    public final int hashCode() {
        return (((true != this.f82242a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        boolean z = this.f82242a;
        return "CriticalAlertsStatus{showingCriticalSecurityAlert=" + z + ", showingCriticalStorageAlert=false}";
    }
}
