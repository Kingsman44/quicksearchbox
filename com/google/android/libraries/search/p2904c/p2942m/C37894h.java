package com.google.android.libraries.search.p2904c.p2942m;

import com.google.android.libraries.search.p2904c.C37659hf;

/* renamed from: com.google.android.libraries.search.c.m.h */
/* compiled from: PG */
public final class C37894h extends C37897k {

    /* renamed from: a */
    public final C37659hf f100478a;

    /* renamed from: b */
    public final int f100479b;

    public C37894h(C37659hf hfVar, int i) {
        if (hfVar != null) {
            this.f100478a = hfVar;
            this.f100479b = i;
            return;
        }
        throw new NullPointerException("Null hotwordListeningSession");
    }

    /* renamed from: a */
    public final int mo41142a() {
        return this.f100479b;
    }

    /* renamed from: b */
    public final C37659hf mo41143b() {
        return this.f100478a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37897k) {
            C37897k kVar = (C37897k) obj;
            return this.f100478a.equals(kVar.mo41143b()) && this.f100479b == kVar.mo41142a();
        }
    }

    public final int hashCode() {
        return ((this.f100478a.hashCode() ^ 1000003) * 1000003) ^ this.f100479b;
    }

    public final String toString() {
        String obj = this.f100478a.toString();
        int i = this.f100479b;
        return "HotwordListeningSessionData{hotwordListeningSession=" + obj + ", sessionToken=" + i + "}";
    }
}
