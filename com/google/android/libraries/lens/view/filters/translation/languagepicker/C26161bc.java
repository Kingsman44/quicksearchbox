package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bc */
/* compiled from: PG */
public final /* synthetic */ class C26161bc implements C26196w {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71071a;

    public /* synthetic */ C26161bc(LanguagePickerFragmentPeer languagePickerFragmentPeer) {
        this.f71071a = languagePickerFragmentPeer;
    }

    /* renamed from: a */
    public final void mo31391a(Locale locale) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71071a;
        Locale locale2 = languagePickerFragmentPeer.f71005b;
        if (locale.equals(locale2)) {
            locale2 = languagePickerFragmentPeer.f71006c;
            C26197x xVar = languagePickerFragmentPeer.f71007d;
            xVar.f71188l = locale2;
            xVar.mo31421d();
        }
        languagePickerFragmentPeer.mo31338c(locale2, locale);
        languagePickerFragmentPeer.f71022s.f70790D.mo5708l(locale);
    }
}
