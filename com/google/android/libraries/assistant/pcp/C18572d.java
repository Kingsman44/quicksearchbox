package com.google.android.libraries.assistant.pcp;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.assistant.pcp.d */
/* compiled from: PG */
final class C18572d extends C18947l {

    /* renamed from: a */
    private final C58528ij f52592a;

    public C18572d(C58528ij ijVar) {
        this.f52592a = ijVar;
    }

    /* renamed from: a */
    public final C58528ij mo24056a() {
        return this.f52592a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18947l) {
            return this.f52592a.equals(((C18947l) obj).mo24056a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f52592a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f52592a.toString();
        return "ProactiveClientListenerProperties{featuresSubset=" + obj + "}";
    }
}
