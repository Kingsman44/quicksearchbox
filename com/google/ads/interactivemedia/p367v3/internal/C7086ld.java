package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ld */
/* compiled from: PG */
final class C7086ld extends C7091li {

    /* renamed from: b */
    private static final int[] f22700b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f22701c;

    /* renamed from: d */
    private boolean f22702d;

    /* renamed from: e */
    private int f22703e;

    public C7086ld(C7073kr krVar) {
        super(krVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16141a(aee aee) {
        if (!this.f22701c) {
            int n = aee.mo14560n();
            int i = n >> 4;
            this.f22703e = i;
            if (i == 2) {
                int i2 = f22700b[(n >> 2) & 3];
                C6863cx cxVar = new C6863cx();
                cxVar.mo15630ae("audio/mpeg");
                cxVar.mo15606H(1);
                cxVar.mo15631af(i2);
                this.f22726a.mo16102a(cxVar.mo15625a());
                this.f22702d = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C6863cx cxVar2 = new C6863cx();
                cxVar2.mo15630ae(str);
                cxVar2.mo15606H(1);
                cxVar2.mo15631af(8000);
                this.f22726a.mo16102a(cxVar2.mo15625a());
                this.f22702d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new C7090lh(sb.toString());
            }
            this.f22701c = true;
        } else {
            aee.mo14557k(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16142b(aee aee, long j) {
        if (this.f22703e == 2) {
            int d = aee.mo14550d();
            this.f22726a.mo16105d(aee, d);
            this.f22726a.mo16103b(j, 1, d, 0, (C7072kq) null);
            return true;
        }
        int n = aee.mo14560n();
        if (n == 0 && !this.f22702d) {
            int d2 = aee.mo14550d();
            byte[] bArr = new byte[d2];
            aee.mo14559m(bArr, 0, d2);
            C6960gm a = C6961gn.m20510a(bArr);
            C6863cx cxVar = new C6863cx();
            cxVar.mo15630ae("audio/mp4a-latm");
            cxVar.mo15607I(a.f22202c);
            cxVar.mo15606H(a.f22201b);
            cxVar.mo15631af(a.f22200a);
            cxVar.mo15618T(Collections.singletonList(bArr));
            this.f22726a.mo16102a(cxVar.mo15625a());
            this.f22702d = true;
            return false;
        } else if (this.f22703e == 10 && n != 1) {
            return false;
        } else {
            int d3 = aee.mo14550d();
            this.f22726a.mo16105d(aee, d3);
            this.f22726a.mo16103b(j, 1, d3, 0, (C7072kq) null);
            return true;
        }
    }
}
