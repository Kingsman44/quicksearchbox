package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import com.google.android.libraries.places.api.model.AutocompletePrediction;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.f */
/* compiled from: PG */
public final class C108759f {

    /* renamed from: e */
    private static final CharacterStyle f302463e = new StyleSpan(1);

    /* renamed from: a */
    public final CharSequence f302464a;

    /* renamed from: b */
    public final CharSequence f302465b;

    /* renamed from: c */
    public final String f302466c;

    /* renamed from: d */
    public final String f302467d;

    public C108759f(AutocompletePrediction autocompletePrediction) {
        CharacterStyle characterStyle = f302463e;
        this.f302464a = autocompletePrediction.mo37573j(characterStyle);
        this.f302465b = autocompletePrediction.mo37574k(characterStyle);
        this.f302466c = AutocompletePrediction.m59333l(autocompletePrediction.mo37461b(), autocompletePrediction.mo37466f(), (CharacterStyle) null).toString();
        this.f302467d = autocompletePrediction.mo37462c();
    }
}
