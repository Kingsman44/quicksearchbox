package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.d */
/* compiled from: PG */
final class C77082d extends C77125f {

    /* renamed from: a */
    private final C77141v f212739a;

    public C77082d(C77141v vVar) {
        this.f212739a = vVar;
    }

    /* renamed from: a */
    public final int mo72383a() {
        return 3;
    }

    /* renamed from: c */
    public final C77141v mo72395c() {
        return this.f212739a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C77143x) {
            C77143x xVar = (C77143x) obj;
            if (xVar.mo72383a() != 3 || !this.f212739a.equals(xVar.mo72395c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f212739a.hashCode();
    }

    public final String toString() {
        String obj = this.f212739a.toString();
        return "MessagingTarget{foregroundConversation=" + obj + "}";
    }
}
