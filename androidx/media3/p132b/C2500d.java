package androidx.media3.p132b;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.b.d */
/* compiled from: PG */
public final class C2500d extends C2499c {

    /* renamed from: a */
    private final byte[] f6869a;

    /* renamed from: b */
    private Uri f6870b;

    /* renamed from: c */
    private int f6871c;

    /* renamed from: d */
    private int f6872d;

    /* renamed from: e */
    private boolean f6873e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2500d(byte[] bArr) {
        super(false);
        boolean z = false;
        bArr.getClass();
        C2601a.m6830b(bArr.length > 0 ? true : z);
        this.f6869a = bArr;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f6872d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f6869a, this.f6871c, bArr, i, min);
        this.f6871c += min;
        this.f6872d -= min;
        mo5927g(min);
        return min;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        this.f6870b = nVar.f6891a;
        mo5929i(nVar);
        long j = nVar.f6896f;
        int length = this.f6869a.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f6871c = i;
            int i2 = length - i;
            this.f6872d = i2;
            long j2 = nVar.f6897g;
            if (j2 != -1) {
                this.f6872d = (int) Math.min((long) i2, j2);
            }
            this.f6873e = true;
            mo5930j(nVar);
            long j3 = nVar.f6897g;
            return j3 != -1 ? j3 : (long) this.f6872d;
        }
        throw new C2506j(2008);
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6870b;
    }

    /* renamed from: d */
    public final void mo5882d() {
        if (this.f6873e) {
            this.f6873e = false;
            mo5928h();
        }
        this.f6870b = null;
    }
}
