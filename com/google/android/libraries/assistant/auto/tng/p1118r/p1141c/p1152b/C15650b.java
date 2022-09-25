package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.assistant.p3897e.p3921j.C52081en;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.b */
/* compiled from: PG */
final class C15650b extends C15652d {

    /* renamed from: a */
    private final C52081en f46773a;

    public C15650b(C52081en enVar) {
        this.f46773a = enVar;
    }

    /* renamed from: b */
    public final int mo22462b() {
        return 3;
    }

    /* renamed from: c */
    public final C52081en mo22466c() {
        return this.f46773a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15663o) {
            C15663o oVar = (C15663o) obj;
            if (oVar.mo22462b() != 3 || !this.f46773a.equals(oVar.mo22466c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46773a.hashCode();
    }

    public final String toString() {
        String obj = this.f46773a.toString();
        return "NluResult{conversationDelta=" + obj + "}";
    }
}
