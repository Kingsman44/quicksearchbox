package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.apps.gsa.shared.util.ao */
/* compiled from: PG */
public final class C90731ao {
    /* renamed from: a */
    public static boolean m148191a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return audioManager != null && m148194d(audioManager);
    }

    /* renamed from: b */
    public static boolean m148192b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return false;
        }
        return m148193c(audioManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m148193c(android.media.AudioManager r3) {
        /*
            java.util.List r0 = r3.getActiveRecordingConfigurations()
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r0.next()
            android.media.AudioRecordingConfiguration r1 = (android.media.AudioRecordingConfiguration) r1
            int r1 = r1.getClientAudioSource()
            r2 = 5
            if (r1 == r2) goto L_0x0023
            r2 = 7
            if (r1 == r2) goto L_0x0023
            r2 = 4
            if (r1 != r2) goto L_0x000a
        L_0x0023:
            r3 = 1
            return r3
        L_0x0025:
            boolean r3 = m148194d(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C90731ao.m148193c(android.media.AudioManager):boolean");
    }

    /* renamed from: d */
    private static boolean m148194d(AudioManager audioManager) {
        return audioManager.getMode() == 2;
    }
}
