package androidx.media3.exoplayer.p138b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: androidx.media3.exoplayer.b.v */
/* compiled from: PG */
final class C2826v {

    /* renamed from: a */
    public final AudioTrack f7878a;

    /* renamed from: b */
    public final AudioTimestamp f7879b = new AudioTimestamp();

    /* renamed from: c */
    public long f7880c;

    /* renamed from: d */
    public long f7881d;

    /* renamed from: e */
    public long f7882e;

    public C2826v(AudioTrack audioTrack) {
        this.f7878a = audioTrack;
    }

    /* renamed from: a */
    public final long mo6563a() {
        return this.f7879b.nanoTime / 1000;
    }
}
