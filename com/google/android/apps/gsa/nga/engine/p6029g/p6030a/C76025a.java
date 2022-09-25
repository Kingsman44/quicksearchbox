package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.a */
/* compiled from: PG */
final class C76025a extends C76042aq {

    /* renamed from: a */
    private final Optional f210875a;

    /* renamed from: b */
    private final Optional f210876b;

    public C76025a(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f210875a = optional;
            if (optional2 != null) {
                this.f210876b = optional2;
                return;
            }
            throw new NullPointerException("Null accountName");
        }
        throw new NullPointerException("Null accountId");
    }

    /* renamed from: a */
    public final Optional mo72015a() {
        return this.f210875a;
    }

    /* renamed from: b */
    public final Optional mo72016b() {
        return this.f210876b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76042aq) {
            C76042aq aqVar = (C76042aq) obj;
            return this.f210875a.equals(aqVar.mo72015a()) && this.f210876b.equals(aqVar.mo72016b());
        }
    }

    public final int hashCode() {
        return ((this.f210875a.hashCode() ^ 1000003) * 1000003) ^ this.f210876b.hashCode();
    }

    public final String toString() {
        String obj = this.f210875a.toString();
        String obj2 = this.f210876b.toString();
        return "AccountState{accountId=" + obj + ", accountName=" + obj2 + "}";
    }
}
