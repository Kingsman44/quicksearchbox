package com.google.android.apps.gsa.speech.settingsui.language;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.f */
/* compiled from: PG */
final class C92642f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DialogInterface f258606a;

    /* renamed from: b */
    final /* synthetic */ LanguagePreference f258607b;

    public C92642f(LanguagePreference languagePreference, DialogInterface dialogInterface) {
        this.f258607b = languagePreference;
        this.f258606a = dialogInterface;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f258607b.mo87404a(this.f258606a);
    }
}
