package com.google.android.libraries.lens.view.onboarding;

/* renamed from: com.google.android.libraries.lens.view.onboarding.a */
/* compiled from: PG */
final class C27467a extends C27472ae {

    /* renamed from: a */
    private boolean f75127a;

    /* renamed from: b */
    private byte f75128b;

    public C27467a() {
    }

    public C27467a(C27473af afVar) {
        this.f75127a = ((C27494b) afVar).f75195a;
        this.f75128b = 1;
    }

    /* renamed from: a */
    public final C27473af mo33007a() {
        if (this.f75128b == 1) {
            return new C27494b(this.f75127a);
        }
        throw new IllegalStateException("Missing required properties: warmWelcomePending");
    }

    /* renamed from: b */
    public final void mo33008b(boolean z) {
        this.f75127a = z;
        this.f75128b = 1;
    }
}
