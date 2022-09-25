package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.android.libraries.lens.view.filters.translation.C26217r;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bb */
/* compiled from: PG */
public final /* synthetic */ class C26160bb implements C26196w {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71070a;

    public /* synthetic */ C26160bb(LanguagePickerFragmentPeer languagePickerFragmentPeer) {
        this.f71070a = languagePickerFragmentPeer;
    }

    /* renamed from: a */
    public final void mo31391a(Locale locale) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71070a;
        Locale locale2 = languagePickerFragmentPeer.f71006c;
        if (locale.equals(locale2) && !languagePickerFragmentPeer.f71005b.equals(C26217r.f71251a)) {
            locale2 = languagePickerFragmentPeer.f71005b;
            C26197x xVar = languagePickerFragmentPeer.f71008e;
            xVar.f71188l = locale2;
            xVar.mo31421d();
        }
        languagePickerFragmentPeer.mo31338c(locale, locale2);
    }
}
