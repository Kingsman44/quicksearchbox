package androidx.media;

import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C4265d dVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6638a = dVar.mo9097b(audioAttributesImplBase.f6638a, 1);
        audioAttributesImplBase.f6639b = dVar.mo9097b(audioAttributesImplBase.f6639b, 2);
        audioAttributesImplBase.f6640c = dVar.mo9097b(audioAttributesImplBase.f6640c, 3);
        audioAttributesImplBase.f6641d = dVar.mo9097b(audioAttributesImplBase.f6641d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C4265d dVar) {
        int i = audioAttributesImplBase.f6638a;
        dVar.mo9111p(1);
        dVar.mo9117v(i);
        int i2 = audioAttributesImplBase.f6639b;
        dVar.mo9111p(2);
        dVar.mo9117v(i2);
        int i3 = audioAttributesImplBase.f6640c;
        dVar.mo9111p(3);
        dVar.mo9117v(i3);
        int i4 = audioAttributesImplBase.f6641d;
        dVar.mo9111p(4);
        dVar.mo9117v(i4);
    }
}
