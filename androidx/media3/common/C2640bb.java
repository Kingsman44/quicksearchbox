package androidx.media3.common;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.bb */
/* compiled from: PG */
public final class C2640bb implements C2668l {

    /* renamed from: a */
    public static final C2640bb f7312a = new C2640bb(1.0f, 1.0f);

    /* renamed from: b */
    public final float f7313b;

    /* renamed from: c */
    public final float f7314c;

    /* renamed from: d */
    public final int f7315d;

    public C2640bb(float f, float f2) {
        boolean z = true;
        C2601a.m6830b(f > 0.0f);
        C2601a.m6830b(f2 <= 0.0f ? false : z);
        this.f7313b = f;
        this.f7314c = f2;
        this.f7315d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final C2640bb mo6212a(float f) {
        return new C2640bb(f, this.f7314c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2640bb bbVar = (C2640bb) obj;
            return this.f7313b == bbVar.f7313b && this.f7314c == bbVar.f7314c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f7313b) + 527) * 31) + Float.floatToRawIntBits(this.f7314c);
    }

    public final String toString() {
        return C2612ak.m6928K("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f7313b), Float.valueOf(this.f7314c));
    }
}
