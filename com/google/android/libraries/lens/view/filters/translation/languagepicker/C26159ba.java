package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.translation.C26219t;
import com.google.android.libraries.lens.view.utils.C28101ac;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.ba */
/* compiled from: PG */
public final /* synthetic */ class C26159ba implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71069a;

    public /* synthetic */ C26159ba(LanguagePickerFragmentPeer languagePickerFragmentPeer) {
        this.f71069a = languagePickerFragmentPeer;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71069a;
        C26219t tVar = (C26219t) obj;
        View view = languagePickerFragmentPeer.f71020q.getView();
        if (view != null) {
            C28101ac.m52383a(tVar.mo31325b(), tVar.mo31324a(), view, languagePickerFragmentPeer.f71023t);
        }
    }
}
