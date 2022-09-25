package androidx.media;

import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C4265d dVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f6635a = (AudioAttributesImpl) dVar.mo9105j(audioAttributesCompat.f6635a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C4265d dVar) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6635a;
        dVar.mo9111p(1);
        dVar.mo9090A(audioAttributesImpl);
    }
}
