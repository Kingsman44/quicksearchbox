package com.google.android.libraries.lens.view.p2133i.p2134a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.view.i.a.a */
/* compiled from: PG */
public final class C26896a extends C26900e {

    /* renamed from: a */
    private final Optional f73321a;

    /* renamed from: b */
    private final int f73322b;

    public C26896a(int i, Optional optional) {
        this.f73322b = i;
        if (optional != null) {
            this.f73321a = optional;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public final Optional mo32265a() {
        return this.f73321a;
    }

    /* renamed from: b */
    public final int mo32266b() {
        return this.f73322b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26900e) {
            C26900e eVar = (C26900e) obj;
            return this.f73322b == eVar.mo32266b() && this.f73321a.equals(eVar.mo32265a());
        }
    }

    public final int hashCode() {
        return ((this.f73322b ^ 1000003) * 1000003) ^ this.f73321a.hashCode();
    }

    public final String toString() {
        int i = this.f73322b;
        String str = i != 1 ? i != 2 ? "PARTIAL_TEXT_UNDER_SIZE_LIMIT" : "SUCCESS" : "UNKNOWN";
        String obj = this.f73321a.toString();
        return "PayloadWithStatus{status=" + str + ", payload=" + obj + "}";
    }
}
