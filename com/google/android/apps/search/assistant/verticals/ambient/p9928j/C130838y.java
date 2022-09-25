package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.y */
/* compiled from: PG */
final class C130838y extends C130835v {

    /* renamed from: a */
    private final Optional f358084a;

    /* renamed from: b */
    private final Optional f358085b;

    public C130838y(Optional optional, Optional optional2) {
        this.f358084a = optional;
        this.f358085b = optional2;
    }

    /* renamed from: a */
    public final Optional mo109831a() {
        return this.f358084a;
    }

    /* renamed from: b */
    public final Optional mo109832b() {
        return this.f358085b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130835v) {
            C130835v vVar = (C130835v) obj;
            return this.f358084a.equals(vVar.mo109831a()) && this.f358085b.equals(vVar.mo109832b());
        }
    }

    public final int hashCode() {
        return ((this.f358084a.hashCode() ^ 1000003) * 1000003) ^ this.f358085b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f358084a);
        String valueOf2 = String.valueOf(this.f358085b);
        return "AlarmStatusInfo{alarmStatus=" + valueOf + ", firingAlarmId=" + valueOf2 + "}";
    }
}
