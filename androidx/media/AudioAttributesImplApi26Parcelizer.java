package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C4265d dVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6636a = (AudioAttributes) dVar.mo9102g(audioAttributesImplApi26.f6636a, 1);
        audioAttributesImplApi26.f6637b = dVar.mo9097b(audioAttributesImplApi26.f6637b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C4265d dVar) {
        AudioAttributes audioAttributes = audioAttributesImplApi26.f6636a;
        dVar.mo9111p(1);
        dVar.mo9119x(audioAttributes);
        int i = audioAttributesImplApi26.f6637b;
        dVar.mo9111p(2);
        dVar.mo9117v(i);
    }
}
