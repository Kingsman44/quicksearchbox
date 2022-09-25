package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.b */
/* compiled from: PG */
public final /* synthetic */ class C141383b implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C2164c f383797a;

    public /* synthetic */ C141383b(C2164c cVar) {
        this.f383797a = cVar;
    }

    public final void onInit(int i) {
        C2164c cVar = this.f383797a;
        if (i == 0) {
            cVar.mo5437b((Object) null);
            return;
        }
        ((C59052c) ((C59052c) C141386e.f383803a.mo56226d()).mo56372aa(41686)).mo56386p("tts init failed");
        cVar.mo5438c();
    }
}
