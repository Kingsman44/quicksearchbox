package com.google.android.libraries.search.p2871b.p2888c;

/* renamed from: com.google.android.libraries.search.b.c.f */
/* compiled from: PG */
final class C37223f extends C37225h {

    /* renamed from: a */
    private final boolean f98895a;

    /* renamed from: b */
    private final boolean f98896b;

    public C37223f(boolean z, boolean z2) {
        this.f98895a = z;
        this.f98896b = z2;
    }

    /* renamed from: a */
    public final boolean mo40709a() {
        return this.f98896b;
    }

    /* renamed from: b */
    public final boolean mo40710b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo40711c() {
        return this.f98895a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37225h) {
            C37225h hVar = (C37225h) obj;
            return this.f98895a == hVar.mo40711c() && !hVar.mo40710b() && this.f98896b == hVar.mo40709a();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((true != this.f98895a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003;
        if (true != this.f98896b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f98895a;
        boolean z2 = this.f98896b;
        return "ExperimentConfiguration{tiktokIntegrationEnabled=" + z + ", throwExceptionForEventsLoggedInFuture=false, enableIndividualFlowEventsSending=" + z2 + "}";
    }
}
