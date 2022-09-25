package com.google.apps.tiktok.contrib.work;

import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.contrib.work.f */
/* compiled from: PG */
final class C46572f extends C46583q {

    /* renamed from: a */
    private final C46584r f121768a;

    /* renamed from: b */
    private final C58833ax f121769b;

    public C46572f(C46584r rVar, C58833ax axVar) {
        this.f121768a = rVar;
        this.f121769b = axVar;
    }

    /* renamed from: a */
    public final C46584r mo50576a() {
        return this.f121768a;
    }

    /* renamed from: b */
    public final C58833ax mo50577b() {
        return this.f121769b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46583q) {
            C46583q qVar = (C46583q) obj;
            return this.f121768a.equals(qVar.mo50576a()) && this.f121769b.equals(qVar.mo50577b());
        }
    }

    public final int hashCode() {
        return ((this.f121768a.hashCode() ^ 1000003) * 1000003) ^ this.f121769b.hashCode();
    }

    public final String toString() {
        String obj = this.f121768a.toString();
        String obj2 = this.f121769b.toString();
        return "PeriodicWorkSpec{repeatInterval=" + obj + ", flexInterval=" + obj2 + "}";
    }
}
