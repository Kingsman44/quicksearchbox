package com.google.android.libraries.search.assistant.p2714o;

import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.o.b */
/* compiled from: PG */
public final class C34916b extends C34920f {

    /* renamed from: a */
    private final String f92576a;

    /* renamed from: b */
    private final Instant f92577b;

    public C34916b(String str, Instant instant) {
        if (str != null) {
            this.f92576a = str;
            if (instant != null) {
                this.f92577b = instant;
                return;
            }
            throw new NullPointerException("Null instant");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final Instant mo39628a() {
        return this.f92577b;
    }

    /* renamed from: b */
    public final String mo39629b() {
        return this.f92576a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34920f) {
            C34920f fVar = (C34920f) obj;
            return this.f92576a.equals(fVar.mo39629b()) && this.f92577b.equals(fVar.mo39628a());
        }
    }

    public final int hashCode() {
        return ((this.f92576a.hashCode() ^ 1000003) * 1000003) ^ this.f92577b.hashCode();
    }

    public final String toString() {
        String str = this.f92576a;
        String obj = this.f92577b.toString();
        return "PackageNameAndTime{packageName=" + str + ", instant=" + obj + "}";
    }
}
