package com.google.android.apps.gsa.nga.engine.warmactions;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a */
/* compiled from: PG */
public final class C79403a extends C79566g {

    /* renamed from: a */
    public final C79569ab f218040a;

    /* renamed from: c */
    private final int f218041c;

    public C79403a(C79569ab abVar, int i) {
        if (abVar != null) {
            this.f218040a = abVar;
            this.f218041c = i;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final C79569ab mo74017a() {
        return this.f218040a;
    }

    /* renamed from: b */
    public final int mo74018b() {
        return this.f218041c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79566g) {
            C79566g gVar = (C79566g) obj;
            return this.f218040a.equals(gVar.mo74017a()) && this.f218041c == gVar.mo74018b();
        }
    }

    public final int hashCode() {
        return ((this.f218040a.hashCode() ^ 1000003) * 1000003) ^ this.f218041c;
    }

    public final String toString() {
        String obj = this.f218040a.toString();
        String str = this.f218041c != 1 ? "ANSWERING" : "NONE";
        return "WarmActionsState{config=" + obj + ", uiBehavior=" + str + "}";
    }
}
