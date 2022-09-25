package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.a */
/* compiled from: PG */
final class C91652a extends C91655d {

    /* renamed from: a */
    public final C89857g f255608a;

    /* renamed from: b */
    public final long f255609b;

    public C91652a(C89857g gVar, long j) {
        this.f255608a = gVar;
        this.f255609b = j;
    }

    /* renamed from: a */
    public final long mo86034a() {
        return this.f255609b;
    }

    /* renamed from: b */
    public final C89857g mo86035b() {
        return this.f255608a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91655d) {
            C91655d dVar = (C91655d) obj;
            return this.f255608a.equals(dVar.mo86035b()) && this.f255609b == dVar.mo86034a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f255608a.hashCode();
        long j = this.f255609b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f255608a.toString();
        long j = this.f255609b;
        return "EventData{event=" + obj + ", timeMillis=" + j + "}";
    }
}
