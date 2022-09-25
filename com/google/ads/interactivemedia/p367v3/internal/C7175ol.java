package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ol */
/* compiled from: PG */
final class C7175ol {

    /* renamed from: a */
    private final C7073kr f23272a;

    /* renamed from: b */
    private boolean f23273b;

    /* renamed from: c */
    private boolean f23274c;

    /* renamed from: d */
    private boolean f23275d;

    /* renamed from: e */
    private int f23276e;

    /* renamed from: f */
    private int f23277f;

    /* renamed from: g */
    private long f23278g;

    /* renamed from: h */
    private long f23279h;

    public C7175ol(C7073kr krVar) {
        this.f23272a = krVar;
    }

    /* renamed from: a */
    public final void mo16231a() {
        this.f23273b = false;
        this.f23274c = false;
        this.f23275d = false;
        this.f23276e = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16232b(int r5, long r6) {
        /*
            r4 = this;
            r4.f23276e = r5
            r0 = 0
            r4.f23275d = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto L_0x0013
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r3 = 0
            goto L_0x0014
        L_0x0013:
            r3 = 1
        L_0x0014:
            r4.f23273b = r3
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r4.f23274c = r1
            r4.f23277f = r0
            r4.f23279h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7175ol.mo16232b(int, long):void");
    }

    /* renamed from: c */
    public final void mo16233c(byte[] bArr, int i, int i2) {
        if (this.f23274c) {
            int i3 = this.f23277f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f23275d = ((bArr[i4] & 192) >> 6) == 0;
                this.f23274c = false;
                return;
            }
            this.f23277f = i3 + (i2 - i);
        }
    }

    /* renamed from: d */
    public final void mo16234d(long j, int i, boolean z) {
        if (this.f23276e == 182 && z && this.f23273b) {
            long j2 = this.f23278g;
            this.f23272a.mo16103b(this.f23279h, this.f23275d ? 1 : 0, (int) (j - j2), i, (C7072kq) null);
        }
        if (this.f23276e != 179) {
            this.f23278g = j;
        }
    }
}
