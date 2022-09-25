package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* renamed from: androidx.media.f */
/* compiled from: PG */
public final class C2428f {
    /* renamed from: a */
    public static int m6453a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* renamed from: b */
    public static int m6454b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
