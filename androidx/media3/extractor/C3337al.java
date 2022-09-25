package androidx.media3.extractor;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2612ak;
import java.util.Collections;

/* renamed from: androidx.media3.extractor.al */
/* compiled from: PG */
public final class C3337al {

    /* renamed from: a */
    public final int f10059a;

    /* renamed from: b */
    public final int f10060b;

    /* renamed from: c */
    public final int f10061c;

    /* renamed from: d */
    public final int f10062d;

    /* renamed from: e */
    public final int f10063e;

    /* renamed from: f */
    public final int f10064f;

    /* renamed from: g */
    public final int f10065g;

    /* renamed from: h */
    public final int f10066h;

    /* renamed from: i */
    public final int f10067i;

    /* renamed from: j */
    public final long f10068j;

    /* renamed from: k */
    public final C3336ak f10069k;

    /* renamed from: l */
    private final Metadata f10070l;

    public C3337al(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C3336ak akVar, Metadata metadata) {
        this.f10059a = i;
        this.f10060b = i2;
        this.f10061c = i3;
        this.f10062d = i4;
        this.f10063e = i5;
        this.f10064f = m9661g(i5);
        this.f10065g = i6;
        this.f10066h = i7;
        this.f10067i = m9660f(i7);
        this.f10068j = j;
        this.f10069k = akVar;
        this.f10070l = metadata;
    }

    public C3337al(byte[] bArr, int i) {
        C2603ab abVar = new C2603ab(bArr, bArr.length);
        abVar.mo6124i(i * 8);
        this.f10059a = abVar.mo6119d(16);
        this.f10060b = abVar.mo6119d(16);
        this.f10061c = abVar.mo6119d(24);
        this.f10062d = abVar.mo6119d(24);
        int d = abVar.mo6119d(20);
        this.f10063e = d;
        this.f10064f = m9661g(d);
        this.f10065g = abVar.mo6119d(3) + 1;
        int d2 = abVar.mo6119d(5) + 1;
        this.f10066h = d2;
        this.f10067i = m9660f(d2);
        this.f10068j = C2612ak.m7001z(abVar.mo6119d(4), abVar.mo6119d(32));
        this.f10069k = null;
        this.f10070l = null;
    }

    /* renamed from: f */
    private static int m9660f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: g */
    private static int m9661g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final long mo7327a() {
        long j = this.f10068j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f10063e);
    }

    /* renamed from: b */
    public final long mo7328b(long j) {
        return C2612ak.m6994s((j * ((long) this.f10063e)) / 1000000, 0, this.f10068j - 1);
    }

    /* renamed from: c */
    public final C2680x mo7329c(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f10062d;
        if (i <= 0) {
            i = -1;
        }
        Metadata d = mo7330d(metadata);
        C2679w wVar = new C2679w();
        wVar.f7459k = "audio/flac";
        wVar.f7460l = i;
        wVar.f7472x = this.f10065g;
        wVar.f7473y = this.f10063e;
        wVar.f7461m = Collections.singletonList(bArr);
        wVar.f7457i = d;
        return new C2680x(wVar);
    }

    /* renamed from: d */
    public final Metadata mo7330d(Metadata metadata) {
        Metadata metadata2 = this.f10070l;
        return metadata2 == null ? metadata : metadata2.mo6060b(metadata);
    }

    /* renamed from: e */
    public final C3337al mo7331e(C3336ak akVar) {
        return new C3337al(this.f10059a, this.f10060b, this.f10061c, this.f10062d, this.f10063e, this.f10065g, this.f10066h, this.f10068j, akVar, this.f10070l);
    }
}
