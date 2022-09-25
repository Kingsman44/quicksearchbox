package com.google.android.libraries.search.silk.web.audiorecording;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3214c.C41717a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4299d.C56676d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.audiorecording.m */
/* compiled from: PG */
public final /* synthetic */ class C40699m implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAudioRecordingMessageHandler f106751a;

    /* renamed from: b */
    public final /* synthetic */ C41717a f106752b;

    public /* synthetic */ C40699m(SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler, C41717a aVar) {
        this.f106751a = silkAudioRecordingMessageHandler;
        this.f106752b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler = this.f106751a;
        C41717a aVar = this.f106752b;
        C40769f fVar = silkAudioRecordingMessageHandler.f106736d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40691e(aVar), oVar, jSONObject, "AudioRecording", "record", C56676d.f151284b.getParserForType());
    }
}
