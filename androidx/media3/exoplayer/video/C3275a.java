package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.video.a */
/* compiled from: PG */
final class C3275a {

    /* renamed from: a */
    public long f9830a;

    /* renamed from: b */
    public long f9831b;

    /* renamed from: c */
    public final boolean[] f9832c = new boolean[15];

    /* renamed from: d */
    private long f9833d;

    /* renamed from: e */
    private long f9834e;

    /* renamed from: f */
    private long f9835f;

    /* renamed from: g */
    private long f9836g;

    /* renamed from: h */
    private int f9837h;

    /* renamed from: a */
    public final long mo7260a() {
        long j = this.f9836g;
        if (j == 0) {
            return 0;
        }
        return this.f9831b / j;
    }

    /* renamed from: b */
    public final void mo7261b(long j) {
        long j2 = this.f9830a;
        if (j2 == 0) {
            this.f9833d = j;
        } else if (j2 == 1) {
            long j3 = j - this.f9833d;
            this.f9834e = j3;
            this.f9831b = j3;
            this.f9836g = 1;
        } else {
            long j4 = j - this.f9835f;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f9834e) <= 1000000) {
                this.f9836g++;
                this.f9831b += j4;
                boolean[] zArr = this.f9832c;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f9837h--;
                }
            } else {
                boolean[] zArr2 = this.f9832c;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f9837h++;
                }
            }
        }
        this.f9830a++;
        this.f9835f = j;
    }

    /* renamed from: c */
    public final void mo7262c() {
        this.f9830a = 0;
        this.f9836g = 0;
        this.f9831b = 0;
        this.f9837h = 0;
        Arrays.fill(this.f9832c, false);
    }

    /* renamed from: d */
    public final boolean mo7263d() {
        return this.f9830a > 15 && this.f9837h == 0;
    }
}
