package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.c */
/* compiled from: PG */
final class C18854c extends C18872cr {

    /* renamed from: a */
    private final Optional f53098a;

    /* renamed from: b */
    private final int f53099b;

    public C18854c(int i, Optional optional) {
        this.f53099b = i;
        if (optional != null) {
            this.f53098a = optional;
            return;
        }
        throw new NullPointerException("Null errorMessage");
    }

    /* renamed from: a */
    public final Optional mo24193a() {
        return this.f53098a;
    }

    /* renamed from: b */
    public final int mo24194b() {
        return this.f53099b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18872cr) {
            C18872cr crVar = (C18872cr) obj;
            return this.f53099b == crVar.mo24194b() && this.f53098a.equals(crVar.mo24193a());
        }
    }

    public final int hashCode() {
        return ((this.f53099b ^ 1000003) * 1000003) ^ this.f53098a.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f53099b - 1);
        String obj = this.f53098a.toString();
        return "OnDeviceMediaStatus{statusCode=" + num + ", errorMessage=" + obj + "}";
    }
}
