package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.b.c */
/* compiled from: PG */
public final class C2807c {

    /* renamed from: a */
    public static final C2807c f7838a = new C2807c(-1, -1, -1);

    /* renamed from: b */
    public final int f7839b;

    /* renamed from: c */
    public final int f7840c;

    /* renamed from: d */
    public final int f7841d;

    /* renamed from: e */
    public final int f7842e;

    public C2807c(int i, int i2, int i3) {
        this.f7839b = i;
        this.f7840c = i2;
        this.f7841d = i3;
        this.f7842e = C2612ak.m6956af(i3) ? C2612ak.m6989n(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f7839b;
        int i2 = this.f7840c;
        int i3 = this.f7841d;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
