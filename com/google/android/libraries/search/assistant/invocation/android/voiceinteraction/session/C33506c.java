package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session;

import android.service.voice.VoiceInteractionSession;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c */
/* compiled from: PG */
public interface C33506c {
    void registerVisibleActivityCallback(Executor executor, VoiceInteractionSession.VisibleActivityCallback visibleActivityCallback);

    void unregisterVisibleActivityCallback(VoiceInteractionSession.VisibleActivityCallback visibleActivityCallback);
}
