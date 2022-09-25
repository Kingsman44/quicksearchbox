package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2508l;
import androidx.media3.p132b.C2510n;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.h.b.m */
/* compiled from: PG */
public abstract class C3057m extends C3050f {

    /* renamed from: a */
    private volatile boolean f8889a;

    /* renamed from: b */
    public byte[] f8890b;

    public C3057m(C2505i iVar, C2510n nVar, C2680x xVar, int i, Object obj, byte[] bArr) {
        super(iVar, nVar, 3, xVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        C3057m mVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C2612ak.f7254f;
            mVar = this;
        } else {
            mVar = this;
            bArr2 = bArr;
        }
        mVar.f8890b = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7000a(byte[] bArr, int i);

    /* renamed from: b */
    public final void mo6996b() {
        this.f8889a = true;
    }

    /* renamed from: c */
    public final void mo6997c() {
        try {
            this.f8853s.mo5880b(this.f8846l);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f8889a) {
                byte[] bArr = this.f8890b;
                int length = bArr.length;
                if (length < i2 + 16384) {
                    this.f8890b = Arrays.copyOf(bArr, length + 16384);
                }
                i = this.f8853s.mo5879a(this.f8890b, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f8889a) {
                mo7000a(this.f8890b, i2);
            }
        } finally {
            C2508l.m6614a(this.f8853s);
        }
    }
}
