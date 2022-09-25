package com.google.android.libraries.lens.view.onboarding;

/* renamed from: com.google.android.libraries.lens.view.onboarding.b */
/* compiled from: PG */
final class C27494b extends C27473af {

    /* renamed from: a */
    public final boolean f75195a;

    public C27494b(boolean z) {
        this.f75195a = z;
    }

    /* renamed from: a */
    public final C27472ae mo33009a() {
        return new C27467a(this);
    }

    /* renamed from: b */
    public final boolean mo33010b() {
        return this.f75195a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C27473af) && this.f75195a == ((C27473af) obj).mo33010b();
    }

    public final int hashCode() {
        return (true != this.f75195a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f75195a;
        return "OnboardingState{warmWelcomePending=" + z + "}";
    }
}
