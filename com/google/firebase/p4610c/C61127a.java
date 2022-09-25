package com.google.firebase.p4610c;

import java.util.List;

/* renamed from: com.google.firebase.c.a */
/* compiled from: PG */
final class C61127a extends C61139m {

    /* renamed from: a */
    private final String f165446a;

    /* renamed from: b */
    private final List f165447b;

    public C61127a(String str, List list) {
        if (str != null) {
            this.f165446a = str;
            this.f165447b = list;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    /* renamed from: a */
    public final String mo57690a() {
        return this.f165446a;
    }

    /* renamed from: b */
    public final List mo57691b() {
        return this.f165447b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61139m) {
            C61139m mVar = (C61139m) obj;
            return this.f165446a.equals(mVar.mo57690a()) && this.f165447b.equals(mVar.mo57691b());
        }
    }

    public final int hashCode() {
        return ((this.f165446a.hashCode() ^ 1000003) * 1000003) ^ this.f165447b.hashCode();
    }

    public final String toString() {
        String str = this.f165446a;
        String obj = this.f165447b.toString();
        return "HeartBeatResult{userAgent=" + str + ", usedDates=" + obj + "}";
    }
}
