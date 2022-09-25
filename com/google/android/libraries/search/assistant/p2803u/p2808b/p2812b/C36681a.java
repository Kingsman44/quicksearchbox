package com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.b.a */
/* compiled from: PG */
public final class C36681a extends C36683c {

    /* renamed from: a */
    private final Optional f95568a;

    /* renamed from: b */
    private final int f95569b;

    public C36681a(int i, Optional optional) {
        this.f95569b = i;
        if (optional != null) {
            this.f95568a = optional;
            return;
        }
        throw new NullPointerException("Null currentSettingSetId");
    }

    /* renamed from: a */
    public final Optional mo40317a() {
        return this.f95568a;
    }

    /* renamed from: b */
    public final int mo40318b() {
        return this.f95569b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36683c) {
            C36683c cVar = (C36683c) obj;
            return this.f95569b == cVar.mo40318b() && this.f95568a.equals(cVar.mo40317a());
        }
    }

    public final int hashCode() {
        return ((this.f95569b ^ 1000003) * 1000003) ^ this.f95568a.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f95569b - 1);
        String obj = this.f95568a.toString();
        return "OmniconsentFragmentCompletedEvent{currentStep=" + num + ", currentSettingSetId=" + obj + "}";
    }
}
