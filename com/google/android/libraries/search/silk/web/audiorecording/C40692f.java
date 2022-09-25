package com.google.android.libraries.search.silk.web.audiorecording;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3214c.C41717a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.audiorecording.f */
/* compiled from: PG */
public final /* synthetic */ class C40692f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkAudioRecordingMessageHandler f106742a;

    public /* synthetic */ C40692f(SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler) {
        this.f106742a = silkAudioRecordingMessageHandler;
    }

    public final void accept(Object obj) {
        SilkAudioRecordingMessageHandler silkAudioRecordingMessageHandler = this.f106742a;
        C41717a aVar = (C41717a) obj;
        ((PostMessageMixinImpl) silkAudioRecordingMessageHandler.f106735c).mo46952c(R.id.prepare_to_record, C40694h.f106744a, new C40695i(silkAudioRecordingMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAudioRecordingMessageHandler.f106735c).mo46952c(R.id.stop_recording, C40696j.f106747a, new C40697k(silkAudioRecordingMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAudioRecordingMessageHandler.f106735c).mo46952c(R.id.record, C40698l.f106750a, new C40699m(silkAudioRecordingMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
