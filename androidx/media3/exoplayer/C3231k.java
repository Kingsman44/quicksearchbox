package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p151k.C3241g;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: androidx.media3.exoplayer.k */
/* compiled from: PG */
public final class C3231k implements C2875cd {

    /* renamed from: a */
    private final C3241g f9710a;

    /* renamed from: b */
    private final long f9711b;

    /* renamed from: c */
    private final long f9712c;

    /* renamed from: d */
    private final long f9713d;

    /* renamed from: e */
    private final long f9714e;

    /* renamed from: f */
    private final long f9715f;

    /* renamed from: g */
    private int f9716g;

    /* renamed from: h */
    private boolean f9717h;

    public C3231k() {
        this(new C3241g(), 50000, 0);
    }

    /* renamed from: b */
    public static void m9433b(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C2601a.m6831c(z, str + " cannot be less than " + str2);
    }

    /* renamed from: k */
    private final void m9434k(boolean z) {
        this.f9716g = 13107200;
        this.f9717h = false;
        if (z) {
            this.f9710a.mo7237d();
        }
    }

    /* renamed from: a */
    public final long mo6622a() {
        return this.f9715f;
    }

    /* renamed from: c */
    public final void mo6623c() {
        m9434k(false);
    }

    /* renamed from: d */
    public final void mo6624d() {
        m9434k(true);
    }

    /* renamed from: e */
    public final void mo6625e() {
        m9434k(true);
    }

    /* renamed from: f */
    public final boolean mo6626f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo6627g(long j, float f, boolean z, long j2) {
        long j3;
        long v = C2612ak.m6997v(j, f);
        if (z) {
            j3 = this.f9714e;
        } else {
            j3 = this.f9713d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || v >= j3 || this.f9710a.mo7234a() >= this.f9716g;
    }

    /* renamed from: h */
    public final C3241g mo6628h() {
        return this.f9710a;
    }

    /* renamed from: i */
    public final void mo6629i(C2893cv[] cvVarArr, C3197ad[] adVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < cvVarArr.length) {
                if (adVarArr[i] != null) {
                    switch (cvVarArr[i].mo6688eV()) {
                        case -2:
                            i3 = 0;
                            break;
                        case 0:
                            i3 = 144310272;
                            break;
                        case 1:
                            break;
                        case 2:
                            i3 = 131072000;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i3 = C89885b.S3REQUEST_VALUE;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f9716g = max;
                this.f9710a.mo7238e(max);
                return;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo6630j(long j, float f) {
        int a = this.f9710a.mo7234a();
        int i = this.f9716g;
        long j2 = this.f9711b;
        if (f > 1.0f) {
            j2 = Math.min(C2612ak.m6995t(j2, f), this.f9712c);
        }
        boolean z = false;
        if (j < Math.max(j2, 500000)) {
            if (a < i) {
                z = true;
            }
            this.f9717h = z;
            if (!z && j < 500000) {
                C2633u.m7050e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f9712c || a >= i) {
            this.f9717h = false;
        }
        return this.f9717h;
    }

    public C3231k(C3241g gVar, int i, int i2) {
        m9433b(2500, 0, "bufferForPlaybackMs", "0");
        m9433b(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m9433b(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m9433b(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m9433b(i, 50000, "maxBufferMs", "minBufferMs");
        m9433b(i2, 0, "backBufferDurationMs", "0");
        this.f9710a = gVar;
        this.f9711b = C2612ak.m6998w(50000);
        this.f9712c = C2612ak.m6998w((long) i);
        this.f9713d = C2612ak.m6998w(2500);
        this.f9714e = C2612ak.m6998w(5000);
        this.f9716g = 13107200;
        this.f9715f = C2612ak.m6998w((long) i2);
    }
}
