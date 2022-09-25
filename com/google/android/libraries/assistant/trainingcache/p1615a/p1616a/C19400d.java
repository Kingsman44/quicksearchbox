package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.d */
/* compiled from: PG */
final class C19400d extends C19411o {

    /* renamed from: a */
    private final boolean f54276a;

    public C19400d(boolean z) {
        this.f54276a = z;
    }

    /* renamed from: a */
    public final boolean mo24555a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo24556b() {
        return this.f54276a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19411o) {
            C19411o oVar = (C19411o) obj;
            return this.f54276a == oVar.mo24556b() && !oVar.mo24555a();
        }
    }

    public final int hashCode() {
        return (((true != this.f54276a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        boolean z = this.f54276a;
        return "FedoraLcResultHandlerResult{success=" + z + ", resumptionNeeded=false}";
    }
}
