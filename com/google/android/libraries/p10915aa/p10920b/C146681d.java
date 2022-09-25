package com.google.android.libraries.p10915aa.p10920b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.aa.b.d */
/* compiled from: PG */
final class C146681d extends C146684g {

    /* renamed from: a */
    private final Optional f396114a;

    public C146681d(Optional optional) {
        this.f396114a = optional;
    }

    /* renamed from: b */
    public final int mo123435b() {
        return 4;
    }

    /* renamed from: c */
    public final Optional mo123436c() {
        return this.f396114a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146659ag) {
            C146659ag agVar = (C146659ag) obj;
            if (agVar.mo123435b() != 4 || !this.f396114a.equals(agVar.mo123436c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396114a.hashCode();
    }

    public final String toString() {
        String obj = this.f396114a.toString();
        return "ProcessedNodeConditions{condition=" + obj + "}";
    }
}
