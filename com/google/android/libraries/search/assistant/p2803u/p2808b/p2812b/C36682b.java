package com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.b.b */
/* compiled from: PG */
final class C36682b extends C36684d {

    /* renamed from: a */
    private final String f95570a;

    /* renamed from: b */
    private final Optional f95571b;

    public C36682b(String str, Optional optional) {
        if (str != null) {
            this.f95570a = str;
            if (optional != null) {
                this.f95571b = optional;
                return;
            }
            throw new NullPointerException("Null accountId");
        }
        throw new NullPointerException("Null currentFragmentTag");
    }

    /* renamed from: a */
    public final Optional mo40322a() {
        return this.f95571b;
    }

    /* renamed from: b */
    public final String mo40323b() {
        return this.f95570a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36684d) {
            C36684d dVar = (C36684d) obj;
            return this.f95570a.equals(dVar.mo40323b()) && this.f95571b.equals(dVar.mo40322a());
        }
    }

    public final int hashCode() {
        return ((this.f95570a.hashCode() ^ 1000003) * 1000003) ^ this.f95571b.hashCode();
    }

    public final String toString() {
        String str = this.f95570a;
        String obj = this.f95571b.toString();
        return "OnboardingFragmentCompletedEvent{currentFragmentTag=" + str + ", accountId=" + obj + "}";
    }
}
