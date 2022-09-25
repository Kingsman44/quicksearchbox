package com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu;

import android.view.View;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26116cz;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.f */
/* compiled from: PG */
public final /* synthetic */ class C26211f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OnboardingLanguageMenuFragmentPeer f71240a;

    /* renamed from: b */
    public final /* synthetic */ Locale f71241b;

    public /* synthetic */ C26211f(OnboardingLanguageMenuFragmentPeer onboardingLanguageMenuFragmentPeer, Locale locale) {
        this.f71240a = onboardingLanguageMenuFragmentPeer;
        this.f71241b = locale;
    }

    public final void onClick(View view) {
        OnboardingLanguageMenuFragmentPeer onboardingLanguageMenuFragmentPeer = this.f71240a;
        Locale locale = this.f71241b;
        C26059ax axVar = onboardingLanguageMenuFragmentPeer.f71209f;
        axVar.mo31256k();
        C26116cz czVar = (C26116cz) axVar.f70826p.mo3842a();
        czVar.getClass();
        onboardingLanguageMenuFragmentPeer.f71209f.mo31258m(czVar.mo31306a(), locale, true);
        onboardingLanguageMenuFragmentPeer.mo31424c(locale, 2);
    }
}
