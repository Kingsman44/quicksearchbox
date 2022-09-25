package com.google.android.libraries.lens.view.filters.p2097a;

import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.C146042v;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.p2437b.C31859o;

/* renamed from: com.google.android.libraries.lens.view.filters.a.c */
/* compiled from: PG */
public final /* synthetic */ class C25870c implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C25872e f70291a;

    public /* synthetic */ C25870c(C25872e eVar) {
        this.f70291a = eVar;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        C25872e eVar = this.f70291a;
        for (AutocompletePrediction autocompletePrediction : ((C31859o) obj).mo37433a()) {
            eVar.f70294a.add(new C25850a(autocompletePrediction.mo37462c(), autocompletePrediction.mo37573j((CharacterStyle) null).toString(), autocompletePrediction.mo37574k((CharacterStyle) null).toString(), -1.0f));
        }
        eVar.mo31038a();
    }
}
