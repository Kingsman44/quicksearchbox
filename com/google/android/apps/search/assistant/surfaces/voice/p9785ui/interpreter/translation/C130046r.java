package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.r */
/* compiled from: PG */
final class C130046r implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f356609a;

    /* renamed from: b */
    final /* synthetic */ C130047s f356610b;

    public C130046r(TextView textView, C130047s sVar) {
        this.f356609a = textView;
        this.f356610b = sVar;
    }

    public final void onClick(View view) {
        CharSequence text = this.f356609a.getText();
        C69664n.m101060f(text, "wordView.text");
        if (text.length() > 0) {
            C59052c cVar = (C59052c) C130047s.f356612b.mo56224b();
            cVar.mo56379ah(new C59094n(38666));
            cVar.mo56386p("Other translations requesting to play TTS");
            TtsViewModel ttsViewModel = this.f356610b.f356620j;
            String str = null;
            if (ttsViewModel == null) {
                C69664n.m101065k("viewModel");
                ttsViewModel = null;
            }
            String obj = this.f356609a.getText().toString();
            String str2 = this.f356610b.f356621k;
            if (str2 == null) {
                C69664n.m101065k("inputTtsLocale");
            } else {
                str = str2;
            }
            ttsViewModel.mo107940a(obj, str, false);
        }
    }
}
