package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.d */
/* compiled from: PG */
final class C103086d extends C103096n {

    /* renamed from: a */
    private final Optional f287726a;

    /* renamed from: b */
    private final Optional f287727b;

    /* renamed from: c */
    private final boolean f287728c;

    public C103086d(Optional optional, Optional optional2, boolean z) {
        this.f287726a = optional;
        this.f287727b = optional2;
        this.f287728c = z;
    }

    /* renamed from: a */
    public final Optional mo93610a() {
        return this.f287726a;
    }

    /* renamed from: b */
    public final Optional mo93611b() {
        return this.f287727b;
    }

    /* renamed from: c */
    public final boolean mo93612c() {
        return this.f287728c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103096n) {
            C103096n nVar = (C103096n) obj;
            return this.f287726a.equals(nVar.mo93610a()) && this.f287727b.equals(nVar.mo93611b()) && this.f287728c == nVar.mo93612c();
        }
    }

    public final int hashCode() {
        return ((((this.f287726a.hashCode() ^ 1000003) * 1000003) ^ this.f287727b.hashCode()) * 1000003) ^ (true != this.f287728c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f287726a);
        String valueOf2 = String.valueOf(this.f287727b);
        boolean z = this.f287728c;
        return "UsecaseTriggerResult{additionalTriggerCondition=" + valueOf + ", turnUsecaseDormantUntilTimestamp=" + valueOf2 + ", turnUsecaseOff=" + z + "}";
    }
}
