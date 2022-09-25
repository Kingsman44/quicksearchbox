package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a */
/* compiled from: PG */
final class C112296a extends C112329ax {

    /* renamed from: a */
    private final Optional f311635a;

    /* renamed from: b */
    private final boolean f311636b;

    /* renamed from: c */
    private final Instant f311637c;

    public C112296a(Optional optional, boolean z, Instant instant) {
        if (optional != null) {
            this.f311635a = optional;
            this.f311636b = z;
            if (instant != null) {
                this.f311637c = instant;
                return;
            }
            throw new NullPointerException("Null lastSavedTimestamp");
        }
        throw new NullPointerException("Null optionalRankerMap");
    }

    /* renamed from: a */
    public final Instant mo99481a() {
        return this.f311637c;
    }

    /* renamed from: b */
    public final Optional mo99482b() {
        return this.f311635a;
    }

    /* renamed from: c */
    public final boolean mo99483c() {
        return this.f311636b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112329ax) {
            C112329ax axVar = (C112329ax) obj;
            return this.f311635a.equals(axVar.mo99482b()) && this.f311636b == axVar.mo99483c() && this.f311637c.equals(axVar.mo99481a());
        }
    }

    public final int hashCode() {
        return ((((this.f311635a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f311636b ? 1237 : 1231)) * 1000003) ^ this.f311637c.hashCode();
    }

    public final String toString() {
        String obj = this.f311635a.toString();
        boolean z = this.f311636b;
        String obj2 = this.f311637c.toString();
        return "ModelLoadResult{optionalRankerMap=" + obj + ", retrainNeeded=" + z + ", lastSavedTimestamp=" + obj2 + "}";
    }
}
