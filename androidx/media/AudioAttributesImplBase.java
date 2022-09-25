package androidx.media;

import java.util.Arrays;

/* compiled from: PG */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f6638a = 0;

    /* renamed from: b */
    public int f6639b = 0;

    /* renamed from: c */
    public int f6640c = 0;

    /* renamed from: d */
    public int f6641d = -1;

    /* renamed from: a */
    public final Object mo5809a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6639b == audioAttributesImplBase.f6639b) {
            int i = this.f6640c;
            int i2 = audioAttributesImplBase.f6640c;
            int i3 = audioAttributesImplBase.f6641d;
            if (i3 == -1) {
                i3 = AudioAttributesCompat.m6424b(i2, audioAttributesImplBase.f6638a);
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.f6638a == audioAttributesImplBase.f6638a && this.f6641d == audioAttributesImplBase.f6641d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6639b), Integer.valueOf(this.f6640c), Integer.valueOf(this.f6638a), Integer.valueOf(this.f6641d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6641d != -1) {
            sb.append(" stream=");
            sb.append(this.f6641d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m6423a(this.f6638a));
        sb.append(" content=");
        sb.append(this.f6639b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6640c).toUpperCase());
        return sb.toString();
    }
}
