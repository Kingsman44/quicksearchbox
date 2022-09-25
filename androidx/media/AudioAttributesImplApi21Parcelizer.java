package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C4265d dVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6636a = (AudioAttributes) dVar.mo9102g(audioAttributesImplApi21.f6636a, 1);
        audioAttributesImplApi21.f6637b = dVar.mo9097b(audioAttributesImplApi21.f6637b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C4265d dVar) {
        AudioAttributes audioAttributes = audioAttributesImplApi21.f6636a;
        dVar.mo9111p(1);
        dVar.mo9119x(audioAttributes);
        int i = audioAttributesImplApi21.f6637b;
        dVar.mo9111p(2);
        dVar.mo9117v(i);
    }
}
