package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.c */
/* compiled from: PG */
final class C77055c extends C77125f {

    /* renamed from: a */
    private final C77131l f212671a;

    public C77055c(C77131l lVar) {
        this.f212671a = lVar;
    }

    /* renamed from: a */
    public final int mo72383a() {
        return 4;
    }

    /* renamed from: b */
    public final C77131l mo72390b() {
        return this.f212671a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C77143x) {
            C77143x xVar = (C77143x) obj;
            if (xVar.mo72383a() != 4 || !this.f212671a.equals(xVar.mo72390b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f212671a.hashCode();
    }

    public final String toString() {
        String obj = this.f212671a.toString();
        return "MessagingTarget{explicitConversation=" + obj + "}";
    }
}
