package com.google.android.apps.gsa.speech.settingsui.language;

import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.g */
/* compiled from: PG */
final class C92643g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C90580b f258608a;

    /* renamed from: b */
    final /* synthetic */ DialogInterface f258609b;

    /* renamed from: c */
    final /* synthetic */ LanguagePreference f258610c;

    public C92643g(LanguagePreference languagePreference, C90580b bVar, DialogInterface dialogInterface) {
        this.f258610c = languagePreference;
        this.f258608a = bVar;
        this.f258609b = dialogInterface;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        LanguagePreference languagePreference = this.f258610c;
        languagePreference.f258590b = this.f258608a.f253240b;
        languagePreference.mo87404a(this.f258609b);
    }
}
