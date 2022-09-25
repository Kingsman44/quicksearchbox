package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p823a;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.C12025a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.C12613a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.C12624c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.C12625d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p824b.p825a.C12622b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.a.a */
/* compiled from: PG */
public final class C12614a implements C12624c {

    /* renamed from: a */
    private final C12619f f39586a;

    public C12614a(C12619f fVar) {
        this.f39586a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20686a(C12625d dVar) {
        C12619f fVar = this.f39586a;
        C12622b bVar = (C12622b) fVar.f39598a.mo17428b();
        bVar.getClass();
        C58833ax axVar = (C58833ax) fVar.f39599b.mo17428b();
        axVar.getClass();
        C12025a aVar = (C12025a) fVar.f39600c.mo17428b();
        aVar.getClass();
        C12618e eVar = new C12618e(bVar, axVar, aVar);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intent.putExtra("android.speech.extra.LANGUAGE", "en-US");
        C12113b bVar2 = ((C12613a) dVar).f39585a;
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE", Uri.parse(bVar2.f38727b == 5 ? (String) bVar2.f38728c : BuildConfig.FLAVOR));
        intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 5000);
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", bVar2.f38729d);
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
        C12622b bVar3 = eVar.f39596g;
        bVar3.f39604c = eVar.f39591b;
        bVar3.f39603b.mo116877a(bVar3.f39606e, intent, bVar3.f39605d, Process.myUid());
        return C60856cj.m92900i(eVar);
    }
}
