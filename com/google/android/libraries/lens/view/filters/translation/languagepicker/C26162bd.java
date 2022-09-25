package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bd */
/* compiled from: PG */
public final /* synthetic */ class C26162bd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71072a;

    public /* synthetic */ C26162bd(LanguagePickerFragmentPeer languagePickerFragmentPeer) {
        this.f71072a = languagePickerFragmentPeer;
    }

    public final void onClick(View view) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71072a;
        languagePickerFragmentPeer.f71024u.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        languagePickerFragmentPeer.f71020q.dismiss();
    }
}
