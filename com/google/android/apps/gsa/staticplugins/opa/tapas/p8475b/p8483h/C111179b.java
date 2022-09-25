package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.b */
/* compiled from: PG */
final class C111179b extends C111174al {

    /* renamed from: a */
    private final Optional f309474a;

    /* renamed from: b */
    private final Optional f309475b;

    public C111179b(Optional optional, Optional optional2) {
        this.f309474a = optional;
        this.f309475b = optional2;
    }

    /* renamed from: a */
    public final Optional mo99052a() {
        return this.f309474a;
    }

    /* renamed from: b */
    public final Optional mo99053b() {
        return this.f309475b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111174al) {
            C111174al alVar = (C111174al) obj;
            return this.f309474a.equals(alVar.mo99052a()) && this.f309475b.equals(alVar.mo99053b());
        }
    }

    public final int hashCode() {
        return ((this.f309474a.hashCode() ^ 1000003) * 1000003) ^ this.f309475b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f309474a);
        String valueOf2 = String.valueOf(this.f309475b);
        return "AlarmStatusInfo{alarmStatus=" + valueOf + ", firingAlarmId=" + valueOf2 + "}";
    }
}
