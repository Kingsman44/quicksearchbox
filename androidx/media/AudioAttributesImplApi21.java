package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f6636a;

    /* renamed from: b */
    public int f6637b = -1;

    public AudioAttributesImplApi21() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f6636a = audioAttributes;
    }

    /* renamed from: a */
    public final Object mo5809a() {
        return this.f6636a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f6636a.equals(((AudioAttributesImplApi21) obj).f6636a);
    }

    public final int hashCode() {
        return this.f6636a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        AudioAttributes audioAttributes = this.f6636a;
        sb.append(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }
}
