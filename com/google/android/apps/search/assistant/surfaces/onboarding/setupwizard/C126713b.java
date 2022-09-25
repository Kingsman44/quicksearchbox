package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.b */
/* compiled from: PG */
final class C126713b extends C126734u {

    /* renamed from: a */
    private final int f348980a;

    public C126713b(int i) {
        this.f348980a = i;
    }

    /* renamed from: a */
    public final int mo107714a() {
        return this.f348980a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C126734u) && this.f348980a == ((C126734u) obj).mo107714a();
    }

    public final int hashCode() {
        return this.f348980a ^ 1000003;
    }

    public final String toString() {
        int i = this.f348980a;
        return "SuwIntent{screenType=" + i + "}";
    }
}
