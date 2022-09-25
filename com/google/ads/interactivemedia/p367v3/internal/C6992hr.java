package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hr */
/* compiled from: PG */
final class C6992hr {

    /* renamed from: A */
    private long f22279A;

    /* renamed from: B */
    private long f22280B;

    /* renamed from: C */
    private long f22281C;

    /* renamed from: D */
    private boolean f22282D;

    /* renamed from: E */
    private long f22283E;

    /* renamed from: F */
    private long f22284F;

    /* renamed from: a */
    private final C6991hq f22285a;

    /* renamed from: b */
    private final long[] f22286b;

    /* renamed from: c */
    private AudioTrack f22287c;

    /* renamed from: d */
    private int f22288d;

    /* renamed from: e */
    private int f22289e;

    /* renamed from: f */
    private C6990hp f22290f;

    /* renamed from: g */
    private int f22291g;

    /* renamed from: h */
    private boolean f22292h;

    /* renamed from: i */
    private long f22293i;

    /* renamed from: j */
    private float f22294j;

    /* renamed from: k */
    private boolean f22295k;

    /* renamed from: l */
    private long f22296l;

    /* renamed from: m */
    private long f22297m;

    /* renamed from: n */
    private Method f22298n;

    /* renamed from: o */
    private long f22299o;

    /* renamed from: p */
    private boolean f22300p;

    /* renamed from: q */
    private boolean f22301q;

    /* renamed from: r */
    private long f22302r;

    /* renamed from: s */
    private long f22303s;

    /* renamed from: t */
    private long f22304t;

    /* renamed from: u */
    private long f22305u;

    /* renamed from: v */
    private int f22306v;

    /* renamed from: w */
    private int f22307w;

    /* renamed from: x */
    private long f22308x;

    /* renamed from: y */
    private long f22309y;

    /* renamed from: z */
    private long f22310z;

    public C6992hr(C6991hq hqVar) {
        this.f22285a = hqVar;
        if (aeu.f20466a >= 18) {
            try {
                Class[] clsArr = null;
                this.f22298n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f22286b = new long[10];
    }

    /* renamed from: m */
    private final long m20603m(long j) {
        return (j * 1000000) / ((long) this.f22291g);
    }

    /* renamed from: n */
    private final void m20604n() {
        this.f22296l = 0;
        this.f22307w = 0;
        this.f22306v = 0;
        this.f22297m = 0;
        this.f22281C = 0;
        this.f22284F = 0;
        this.f22295k = false;
    }

    /* renamed from: o */
    private final long m20605o() {
        return m20603m(m20606p());
    }

    /* renamed from: p */
    private final long m20606p() {
        AudioTrack audioTrack = this.f22287c;
        ary.m19467t(audioTrack);
        if (this.f22308x != -9223372036854775807L) {
            return Math.min(this.f22279A, this.f22310z + ((((SystemClock.elapsedRealtime() * 1000) - this.f22308x) * ((long) this.f22291g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f22292h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f22305u = this.f22303s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f22305u;
        }
        if (aeu.f20466a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.f22303s > 0 && playState == 3) {
                if (this.f22309y == -9223372036854775807L) {
                    this.f22309y = SystemClock.elapsedRealtime();
                }
                return this.f22303s;
            }
            this.f22309y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.f22303s > playbackHeadPosition) {
            this.f22304t++;
        }
        this.f22303s = playbackHeadPosition;
        return playbackHeadPosition + (this.f22304t << 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15969a(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f22287c = r3
            r2.f22288d = r6
            r2.f22289e = r7
            com.google.ads.interactivemedia.v3.internal.hp r0 = new com.google.ads.interactivemedia.v3.internal.hp
            r0.<init>(r3)
            r2.f22290f = r0
            int r3 = r3.getSampleRate()
            r2.f22291g = r3
            r3 = 0
            if (r4 == 0) goto L_0x0025
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r0 = 23
            if (r4 >= r0) goto L_0x0025
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L_0x0026
            r4 = 6
            if (r5 != r4) goto L_0x0025
            r5 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2.f22292h = r0
            boolean r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18506X(r5)
            r2.f22301q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.m20603m(r4)
            goto L_0x003d
        L_0x003c:
            r4 = r0
        L_0x003d:
            r2.f22293i = r4
            r4 = 0
            r2.f22303s = r4
            r2.f22304t = r4
            r2.f22305u = r4
            r2.f22300p = r3
            r2.f22308x = r0
            r2.f22309y = r0
            r2.f22302r = r4
            r2.f22299o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f22294j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6992hr.mo15969a(android.media.AudioTrack, boolean, int, int, int):void");
    }

    /* renamed from: b */
    public final long mo15970b(boolean z) {
        long j;
        long j2;
        int i;
        Method method;
        AudioTrack audioTrack = this.f22287c;
        ary.m19467t(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long o = m20605o();
            if (o != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f22297m >= 30000) {
                    long[] jArr = this.f22286b;
                    int i2 = this.f22306v;
                    jArr[i2] = o - nanoTime;
                    this.f22306v = (i2 + 1) % 10;
                    int i3 = this.f22307w;
                    if (i3 < 10) {
                        this.f22307w = i3 + 1;
                    }
                    this.f22297m = nanoTime;
                    this.f22296l = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f22307w;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f22296l += this.f22286b[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!this.f22292h) {
                    C6990hp hpVar = this.f22290f;
                    ary.m19467t(hpVar);
                    if (!hpVar.mo15957a(nanoTime)) {
                        i = 0;
                    } else {
                        long f = hpVar.mo15962f();
                        long g = hpVar.mo15963g();
                        if (Math.abs(f - nanoTime) > 5000000) {
                            i = 0;
                            this.f22285a.mo15966c(g, f, nanoTime, o);
                            hpVar.mo15958b();
                        } else {
                            C6990hp hpVar2 = hpVar;
                            i = 0;
                            if (Math.abs(m20603m(g) - o) > 5000000) {
                                this.f22285a.mo15965b(g, f, nanoTime, o);
                                hpVar2.mo15958b();
                            } else {
                                hpVar2.mo15959c();
                            }
                        }
                    }
                    if (this.f22301q && (method = this.f22298n) != null && nanoTime - this.f22302r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f22287c;
                            ary.m19467t(audioTrack2);
                            int i6 = aeu.f20466a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[i])).intValue()) * 1000) - this.f22293i;
                            this.f22299o = intValue;
                            long max = Math.max(intValue, 0);
                            this.f22299o = max;
                            if (max > 5000000) {
                                this.f22285a.mo15967d(max);
                                this.f22299o = 0;
                            }
                        } catch (Exception unused) {
                            this.f22298n = null;
                        }
                        this.f22302r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        C6990hp hpVar3 = this.f22290f;
        ary.m19467t(hpVar3);
        boolean d = hpVar3.mo15960d();
        if (d) {
            j = m20603m(hpVar3.mo15963g()) + aeu.m18497O(nanoTime2 - hpVar3.mo15962f(), this.f22294j);
        } else {
            if (this.f22307w == 0) {
                j2 = m20605o();
            } else {
                j2 = this.f22296l + nanoTime2;
            }
            j = !z ? Math.max(0, j2 - this.f22299o) : j2;
        }
        if (this.f22282D != d) {
            this.f22284F = this.f22281C;
            this.f22283E = this.f22280B;
        }
        long j3 = nanoTime2 - this.f22284F;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            j = ((j * j4) + ((1000 - j4) * (this.f22283E + aeu.m18497O(j3, this.f22294j)))) / 1000;
        }
        if (!this.f22295k) {
            long j5 = this.f22280B;
            if (j > j5) {
                this.f22295k = true;
                this.f22285a.mo15964a(System.currentTimeMillis() - C6821bi.m19754a(aeu.m18498P(C6821bi.m19754a(j - j5), this.f22294j)));
            }
        }
        this.f22281C = nanoTime2;
        this.f22280B = j;
        this.f22282D = d;
        return j;
    }

    /* renamed from: c */
    public final void mo15971c() {
        C6990hp hpVar = this.f22290f;
        ary.m19467t(hpVar);
        hpVar.mo15961e();
    }

    /* renamed from: d */
    public final boolean mo15972d() {
        AudioTrack audioTrack = this.f22287c;
        ary.m19467t(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: e */
    public final boolean mo15973e(long j) {
        AudioTrack audioTrack = this.f22287c;
        ary.m19467t(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f22292h) {
            if (playState == 2) {
                this.f22300p = false;
                return false;
            } else if (playState == 1) {
                if (m20606p() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f22300p;
        boolean j2 = mo15978j(j);
        this.f22300p = j2;
        if (z && !j2 && playState != 1) {
            this.f22285a.mo15968e(this.f22289e, C6821bi.m19754a(this.f22293i));
        }
        return true;
    }

    /* renamed from: f */
    public final int mo15974f(long j) {
        return this.f22289e - ((int) (j - (m20606p() * ((long) this.f22288d))));
    }

    /* renamed from: g */
    public final long mo15975g(long j) {
        return C6821bi.m19754a(m20603m(j - m20606p()));
    }

    /* renamed from: h */
    public final boolean mo15976h(long j) {
        return this.f22309y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f22309y >= 200;
    }

    /* renamed from: i */
    public final void mo15977i(long j) {
        this.f22310z = m20606p();
        this.f22308x = SystemClock.elapsedRealtime() * 1000;
        this.f22279A = j;
    }

    /* renamed from: j */
    public final boolean mo15978j(long j) {
        if (j > m20606p()) {
            return true;
        }
        if (!this.f22292h) {
            return false;
        }
        AudioTrack audioTrack = this.f22287c;
        ary.m19467t(audioTrack);
        return audioTrack.getPlayState() == 2 && m20606p() == 0;
    }

    /* renamed from: k */
    public final boolean mo15979k() {
        m20604n();
        if (this.f22308x != -9223372036854775807L) {
            return false;
        }
        C6990hp hpVar = this.f22290f;
        ary.m19467t(hpVar);
        hpVar.mo15961e();
        return true;
    }

    /* renamed from: l */
    public final void mo15980l() {
        m20604n();
        this.f22287c = null;
        this.f22290f = null;
    }
}
