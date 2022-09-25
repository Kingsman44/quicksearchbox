package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: androidx.media.d */
/* compiled from: PG */
final class C2426d {
    /* renamed from: a */
    static AudioFocusRequest m6452a(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
