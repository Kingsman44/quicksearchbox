package com.google.android.libraries.lens.view.onboarding;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;

/* renamed from: com.google.android.libraries.lens.view.onboarding.d */
/* compiled from: PG */
public final class C27506d {

    /* renamed from: a */
    public final C47449e f75223a;

    /* renamed from: b */
    public final View f75224b;

    /* renamed from: c */
    public boolean f75225c;

    public C27506d(C47449e eVar, OnboardingBackgroundView onboardingBackgroundView) {
        this.f75223a = eVar;
        this.f75224b = onboardingBackgroundView;
        mo33047a();
    }

    /* renamed from: a */
    public final void mo33047a() {
        View view = this.f75224b;
        view.setBackgroundColor(view.getContext().getColor(R.color.onboarding_background_color));
    }
}
