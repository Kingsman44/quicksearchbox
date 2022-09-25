package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.common.p4522b.C58512hu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.p */
/* compiled from: PG */
final class C75960p extends C75933as {

    /* renamed from: a */
    public final Optional f210751a;

    /* renamed from: b */
    public final C58512hu f210752b;

    public C75960p(Optional optional, C58512hu huVar) {
        this.f210751a = optional;
        this.f210752b = huVar;
    }

    /* renamed from: a */
    public final C75932ar mo71966a() {
        return new C75959o(this);
    }

    /* renamed from: b */
    public final C58512hu mo71967b() {
        return this.f210752b;
    }

    /* renamed from: c */
    public final Optional mo71968c() {
        return this.f210751a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C75933as) {
            C75933as asVar = (C75933as) obj;
            return this.f210751a.equals(asVar.mo71968c()) && this.f210752b.equals(asVar.mo71967b());
        }
    }

    public final int hashCode() {
        return ((this.f210751a.hashCode() ^ 1000003) * 1000003) ^ this.f210752b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f210751a);
        String obj = this.f210752b.toString();
        return "TimedEventTrackingStatus{appEnteredTimestamp=" + valueOf + ", trackedConditions=" + obj + "}";
    }
}
