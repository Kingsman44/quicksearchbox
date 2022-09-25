package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oq */
/* compiled from: PG */
final class C7180oq {

    /* renamed from: a */
    private final C7073kr f23341a;

    /* renamed from: b */
    private long f23342b;

    /* renamed from: c */
    private boolean f23343c;

    /* renamed from: d */
    private int f23344d;

    /* renamed from: e */
    private long f23345e;

    /* renamed from: f */
    private boolean f23346f;

    /* renamed from: g */
    private boolean f23347g;

    /* renamed from: h */
    private boolean f23348h;

    /* renamed from: i */
    private boolean f23349i;

    /* renamed from: j */
    private boolean f23350j;

    /* renamed from: k */
    private long f23351k;

    /* renamed from: l */
    private long f23352l;

    /* renamed from: m */
    private boolean f23353m;

    public C7180oq(C7073kr krVar) {
        this.f23341a = krVar;
    }

    /* renamed from: e */
    private final void m21394e(int i) {
        boolean z = this.f23353m;
        long j = this.f23342b;
        long j2 = this.f23351k;
        int i2 = z ? 1 : 0;
        this.f23341a.mo16103b(this.f23352l, i2, (int) (j - j2), i, (C7072kq) null);
    }

    /* renamed from: a */
    public final void mo16246a() {
        this.f23346f = false;
        this.f23347g = false;
        this.f23348h = false;
        this.f23349i = false;
        this.f23350j = false;
    }

    /* renamed from: b */
    public final void mo16247b(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f23347g = false;
        this.f23348h = false;
        this.f23345e = j2;
        this.f23344d = 0;
        this.f23342b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f23349i && !this.f23350j) {
                if (z) {
                    m21394e(i);
                }
                this.f23349i = false;
            }
            if (i2 > 35) {
                if (i2 == 39) {
                    i2 = 39;
                }
            }
            this.f23348h = !this.f23350j;
            this.f23350j = true;
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f23343c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f23346f = z2;
    }

    /* renamed from: c */
    public final void mo16248c(byte[] bArr, int i, int i2) {
        if (this.f23346f) {
            int i3 = this.f23344d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f23347g = (bArr[i4] & 128) != 0;
                this.f23346f = false;
                return;
            }
            this.f23344d = i3 + (i2 - i);
        }
    }

    /* renamed from: d */
    public final void mo16249d(long j, int i, boolean z) {
        if (this.f23350j && this.f23347g) {
            this.f23353m = this.f23343c;
            this.f23350j = false;
        } else if (this.f23348h || this.f23347g) {
            if (z && this.f23349i) {
                m21394e(i + ((int) (j - this.f23342b)));
            }
            this.f23351k = this.f23342b;
            this.f23352l = this.f23345e;
            this.f23353m = this.f23343c;
            this.f23349i = true;
        }
    }
}
