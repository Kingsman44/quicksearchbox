package androidx.media3.exoplayer.p138b;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.media3.common.p136b.C2612ak;
import java.lang.reflect.Method;

/* renamed from: androidx.media3.exoplayer.b.x */
/* compiled from: PG */
final class C2828x {

    /* renamed from: A */
    public long f7889A;

    /* renamed from: B */
    public boolean f7890B;

    /* renamed from: C */
    public long f7891C;

    /* renamed from: D */
    public long f7892D;

    /* renamed from: E */
    public final C2792ai f7893E;

    /* renamed from: a */
    public final long[] f7894a;

    /* renamed from: b */
    public AudioTrack f7895b;

    /* renamed from: c */
    public int f7896c;

    /* renamed from: d */
    public C2827w f7897d;

    /* renamed from: e */
    public int f7898e;

    /* renamed from: f */
    public boolean f7899f;

    /* renamed from: g */
    public long f7900g;

    /* renamed from: h */
    public float f7901h;

    /* renamed from: i */
    public boolean f7902i;

    /* renamed from: j */
    public long f7903j;

    /* renamed from: k */
    public long f7904k;

    /* renamed from: l */
    public Method f7905l;

    /* renamed from: m */
    public long f7906m;

    /* renamed from: n */
    public boolean f7907n;

    /* renamed from: o */
    public boolean f7908o;

    /* renamed from: p */
    public long f7909p;

    /* renamed from: q */
    public long f7910q;

    /* renamed from: r */
    public long f7911r;

    /* renamed from: s */
    public long f7912s;

    /* renamed from: t */
    public int f7913t;

    /* renamed from: u */
    public int f7914u;

    /* renamed from: v */
    public long f7915v;

    /* renamed from: w */
    public long f7916w;

    /* renamed from: x */
    public long f7917x;

    /* renamed from: y */
    public long f7918y;

    /* renamed from: z */
    public long f7919z;

    public C2828x(C2792ai aiVar) {
        this.f7893E = aiVar;
        int i = C2612ak.f7249a;
        try {
            Class[] clsArr = null;
            this.f7905l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f7894a = new long[10];
    }

    /* renamed from: a */
    public final long mo6565a(long j) {
        return (j * 1000000) / ((long) this.f7898e);
    }

    /* renamed from: b */
    public final long mo6566b() {
        AudioTrack audioTrack = this.f7895b;
        audioTrack.getClass();
        if (this.f7915v != -9223372036854775807L) {
            return Math.min(this.f7918y, this.f7917x + ((((SystemClock.elapsedRealtime() * 1000) - this.f7915v) * ((long) this.f7898e)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (C2612ak.f7249a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.f7910q > 0 && playState == 3) {
                if (this.f7916w == -9223372036854775807L) {
                    this.f7916w = SystemClock.elapsedRealtime();
                }
                return this.f7910q;
            }
            this.f7916w = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.f7910q > playbackHeadPosition) {
            this.f7911r++;
        }
        this.f7910q = playbackHeadPosition;
        return playbackHeadPosition + (this.f7911r << 32);
    }

    /* renamed from: c */
    public final void mo6567c() {
        this.f7903j = 0;
        this.f7914u = 0;
        this.f7913t = 0;
        this.f7904k = 0;
        this.f7889A = 0;
        this.f7892D = 0;
        this.f7902i = false;
    }

    /* renamed from: d */
    public final boolean mo6568d(long j) {
        return j > mo6566b();
    }
}
