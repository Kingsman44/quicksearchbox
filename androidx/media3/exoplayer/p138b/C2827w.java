package androidx.media3.exoplayer.p138b;

import android.media.AudioTrack;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.b.w */
/* compiled from: PG */
final class C2827w {

    /* renamed from: a */
    public final C2826v f7883a;

    /* renamed from: b */
    public int f7884b;

    /* renamed from: c */
    public long f7885c;

    /* renamed from: d */
    public long f7886d;

    /* renamed from: e */
    public long f7887e;

    /* renamed from: f */
    public long f7888f;

    public C2827w(AudioTrack audioTrack) {
        int i = C2612ak.f7249a;
        this.f7883a = new C2826v(audioTrack);
        mo6564a(0);
    }

    /* renamed from: a */
    public final void mo6564a(int i) {
        this.f7884b = i;
        long j = 10000;
        if (i == 0) {
            this.f7887e = 0;
            this.f7888f = -1;
            this.f7885c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f7886d = 10000;
            return;
        }
        this.f7886d = j;
    }
}
