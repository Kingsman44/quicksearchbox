package com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.C12323c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d.a.b */
/* compiled from: PG */
public final class C13831b extends C13832c {

    /* renamed from: a */
    private final C12323c f42128a;

    public C13831b(C12323c cVar) {
        this.f42128a = cVar;
    }

    /* renamed from: b */
    public final int mo21276b() {
        return 2;
    }

    /* renamed from: c */
    public final C12323c mo21280c() {
        return this.f42128a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13840k) {
            C13840k kVar = (C13840k) obj;
            if (kVar.mo21276b() != 2 || !this.f42128a.equals(kVar.mo21280c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42128a.hashCode();
    }

    public final String toString() {
        String obj = this.f42128a.toString();
        return "FetchRequestParams{hybridVoiceRequestParams=" + obj + "}";
    }
}
