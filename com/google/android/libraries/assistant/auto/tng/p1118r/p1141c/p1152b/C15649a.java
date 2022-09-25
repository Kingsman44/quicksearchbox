package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.protos.p4850an.C63595f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.a */
/* compiled from: PG */
public final class C15649a extends C15652d {

    /* renamed from: a */
    private final C63595f f46772a;

    public C15649a(C63595f fVar) {
        this.f46772a = fVar;
    }

    /* renamed from: a */
    public final C63595f mo22461a() {
        return this.f46772a;
    }

    /* renamed from: b */
    public final int mo22462b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15663o) {
            C15663o oVar = (C15663o) obj;
            if (oVar.mo22462b() != 1 || !this.f46772a.equals(oVar.mo22461a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46772a.hashCode();
    }

    public final String toString() {
        String obj = this.f46772a.toString();
        return "NluResult{analyzerResponse=" + obj + "}";
    }
}
