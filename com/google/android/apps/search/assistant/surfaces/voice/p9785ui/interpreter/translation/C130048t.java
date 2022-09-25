package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.t */
/* compiled from: PG */
final class C130048t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130047s f356624a;

    public C130048t(C130047s sVar) {
        this.f356624a = sVar;
    }

    public final void onClick(View view) {
        C130047s sVar = this.f356624a;
        C69664n.m101061g(view, "view");
        TtsViewModel ttsViewModel = sVar.f356620j;
        String str = null;
        if (ttsViewModel == null) {
            C69664n.m101065k("viewModel");
            ttsViewModel = null;
        }
        String obj = sVar.mo109459e().getText().toString();
        String str2 = sVar.f356622l;
        if (str2 == null) {
            C69664n.m101065k("outputTtsLocale");
        } else {
            str = str2;
        }
        ttsViewModel.mo107940a(obj, str, false);
    }
}
