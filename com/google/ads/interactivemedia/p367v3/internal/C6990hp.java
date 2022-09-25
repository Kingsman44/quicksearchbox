package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hp */
/* compiled from: PG */
final class C6990hp {

    /* renamed from: a */
    private final C6989ho f22273a;

    /* renamed from: b */
    private int f22274b;

    /* renamed from: c */
    private long f22275c;

    /* renamed from: d */
    private long f22276d;

    /* renamed from: e */
    private long f22277e;

    /* renamed from: f */
    private long f22278f;

    public C6990hp(AudioTrack audioTrack) {
        if (aeu.f20466a >= 19) {
            this.f22273a = new C6989ho(audioTrack);
            mo15961e();
            return;
        }
        this.f22273a = null;
        m20590h(3);
    }

    /* renamed from: h */
    private final void m20590h(int i) {
        this.f22274b = i;
        long j = 10000;
        if (i == 0) {
            this.f22277e = 0;
            this.f22278f = -1;
            this.f22275c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f22276d = 10000;
            return;
        }
        this.f22276d = j;
    }

    /* renamed from: a */
    public final boolean mo15957a(long j) {
        C6989ho hoVar = this.f22273a;
        if (hoVar != null && j - this.f22277e >= this.f22276d) {
            this.f22277e = j;
            boolean a = hoVar.mo15954a();
            int i = this.f22274b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && a) {
                            mo15961e();
                            return true;
                        }
                    } else if (!a) {
                        mo15961e();
                        return false;
                    }
                } else if (!a) {
                    mo15961e();
                } else if (this.f22273a.mo15956c() > this.f22278f) {
                    m20590h(2);
                    return true;
                }
            } else if (a) {
                if (this.f22273a.mo15955b() < this.f22275c) {
                    return false;
                }
                this.f22278f = this.f22273a.mo15956c();
                m20590h(1);
                return true;
            } else if (j - this.f22275c > 500000) {
                m20590h(3);
            }
            return a;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo15958b() {
        m20590h(4);
    }

    /* renamed from: c */
    public final void mo15959c() {
        if (this.f22274b == 4) {
            mo15961e();
        }
    }

    /* renamed from: d */
    public final boolean mo15960d() {
        return this.f22274b == 2;
    }

    /* renamed from: e */
    public final void mo15961e() {
        if (this.f22273a != null) {
            m20590h(0);
        }
    }

    /* renamed from: f */
    public final long mo15962f() {
        C6989ho hoVar = this.f22273a;
        if (hoVar != null) {
            return hoVar.mo15955b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final long mo15963g() {
        C6989ho hoVar = this.f22273a;
        if (hoVar != null) {
            return hoVar.mo15956c();
        }
        return -1;
    }
}
