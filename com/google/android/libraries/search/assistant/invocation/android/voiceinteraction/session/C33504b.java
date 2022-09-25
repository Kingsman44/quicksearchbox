package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session;

import android.app.Dialog;
import android.app.DirectAction;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.service.voice.VoiceInteractionSession;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b */
/* compiled from: PG */
public interface C33504b {
    Dialog getWindow();

    /* renamed from: h */
    void mo38925h(DirectAction directAction, Bundle bundle, CancellationSignal cancellationSignal, Executor executor, C33500a aVar);

    /* renamed from: i */
    void mo38926i(VoiceInteractionSession.ActivityId activityId, CancellationSignal cancellationSignal, Executor executor, C33500a aVar);

    /* renamed from: l */
    void mo38927l(VoiceInteractionSession.Insets insets);

    void setTheme(int i);

    void setUiEnabled(boolean z);

    void show(Bundle bundle, int i);

    void startAssistantActivity(Intent intent);

    void startVoiceActivity(Intent intent);
}
