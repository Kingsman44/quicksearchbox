package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.c */
/* compiled from: PG */
final class C15651c extends C15652d {

    /* renamed from: a */
    private final C61752n f46774a;

    public C15651c(C61752n nVar) {
        this.f46774a = nVar;
    }

    /* renamed from: b */
    public final int mo22462b() {
        return 2;
    }

    /* renamed from: d */
    public final C61752n mo22470d() {
        return this.f46774a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15663o) {
            C15663o oVar = (C15663o) obj;
            if (oVar.mo22462b() != 2 || !this.f46774a.equals(oVar.mo22470d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46774a.hashCode();
    }

    public final String toString() {
        String obj = this.f46774a.toString();
        return "NluResult{intentQuery=" + obj + "}";
    }
}
