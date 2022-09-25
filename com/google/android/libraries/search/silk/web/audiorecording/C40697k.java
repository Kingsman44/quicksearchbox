package com.google.android.libraries.search.silk.web.audiorecording;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3214c.C41717a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.audiorecording.k */
/* compiled from: PG */
public final /* synthetic */ class C40697k implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAudioRecordingMessageHandler f106748a;

    /* renamed from: b */
    public final /* synthetic */ C41717a f106749b;

    public /* synthetic */ C40697k(SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler, C41717a aVar) {
        this.f106748a = silkAudioRecordingMessageHandler;
        this.f106749b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler = this.f106748a;
        C41717a aVar = this.f106749b;
        C40769f fVar = silkAudioRecordingMessageHandler.f106736d;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40690d(aVar), oVar, jSONObject, "AudioRecording", "stopRecording");
    }
}
