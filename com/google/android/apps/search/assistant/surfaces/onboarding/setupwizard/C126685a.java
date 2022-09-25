package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.a */
/* compiled from: PG */
final class C126685a extends C126733t {

    /* renamed from: a */
    private int f348878a;

    /* renamed from: b */
    private byte f348879b;

    /* renamed from: a */
    public final C126734u mo107682a() {
        if (this.f348879b == 1) {
            return new C126713b(this.f348878a);
        }
        throw new IllegalStateException("Missing required properties: screenType");
    }

    /* renamed from: b */
    public final void mo107683b(int i) {
        this.f348878a = i;
        this.f348879b = 1;
    }
}
