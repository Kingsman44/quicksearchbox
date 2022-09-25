package com.google.android.libraries.assistant.auto.tng.common.p919i;

import android.content.ComponentName;
import android.content.Context;
import android.service.voice.VoiceInteractionService;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.i.a */
/* compiled from: PG */
public final class C13271a {
    /* renamed from: a */
    public static boolean m29529a(Context context) {
        return VoiceInteractionService.isActiveService(context, new ComponentName(context.getPackageName(), "com.google.android.voiceinteraction.GsaVoiceInteractionService"));
    }
}
