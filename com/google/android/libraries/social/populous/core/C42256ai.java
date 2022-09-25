package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.ai */
/* compiled from: PG */
final class C42256ai extends C42321ct {

    /* renamed from: a */
    private final String f110842a;

    /* renamed from: b */
    private final C42320cs f110843b;

    public C42256ai(String str, C42320cs csVar) {
        this.f110842a = str;
        this.f110843b = csVar;
    }

    /* renamed from: a */
    public final C42320cs mo45203a() {
        return this.f110843b;
    }

    /* renamed from: b */
    public final String mo45204b() {
        return this.f110842a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42321ct) {
            C42321ct ctVar = (C42321ct) obj;
            return this.f110842a.equals(ctVar.mo45204b()) && this.f110843b.equals(ctVar.mo45203a());
        }
    }

    public final int hashCode() {
        return ((this.f110842a.hashCode() ^ 1000003) * 1000003) ^ this.f110843b.hashCode();
    }

    public final String toString() {
        String str = this.f110842a;
        String obj = this.f110843b.toString();
        return "PersonId{id=" + str + ", type=" + obj + "}";
    }
}
