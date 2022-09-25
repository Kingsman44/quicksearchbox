package com.google.android.libraries.search.p2904c.p2942m;

import com.google.android.libraries.search.p2904c.C37402bg;

/* renamed from: com.google.android.libraries.search.c.m.e */
/* compiled from: PG */
public final class C37886e extends C37872b {

    /* renamed from: a */
    public final C37402bg f100461a;

    /* renamed from: b */
    public final int f100462b;

    public C37886e(C37402bg bgVar, int i) {
        if (bgVar != null) {
            this.f100461a = bgVar;
            this.f100462b = i;
            return;
        }
        throw new NullPointerException("Null audioRequestListeningSession");
    }

    /* renamed from: a */
    public final int mo41092a() {
        return this.f100462b;
    }

    /* renamed from: b */
    public final C37402bg mo41093b() {
        return this.f100461a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37872b) {
            C37872b bVar = (C37872b) obj;
            return this.f100461a.equals(bVar.mo41093b()) && this.f100462b == bVar.mo41092a();
        }
    }

    public final int hashCode() {
        return ((this.f100461a.hashCode() ^ 1000003) * 1000003) ^ this.f100462b;
    }

    public final String toString() {
        String obj = this.f100461a.toString();
        int i = this.f100462b;
        return "AudioRequestListeningSessionData{audioRequestListeningSession=" + obj + ", sessionToken=" + i + "}";
    }
}
