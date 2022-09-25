package androidx.media3.exoplayer.p145h;

import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2508l;
import androidx.media3.p132b.C2510n;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.h.cl */
/* compiled from: PG */
final class C3101cl implements C3252r {

    /* renamed from: a */
    public final long f9084a = C3027aj.f8771a.getAndIncrement();

    /* renamed from: b */
    public final C2510n f9085b;

    /* renamed from: c */
    public final C2493al f9086c;

    /* renamed from: d */
    public byte[] f9087d;

    public C3101cl(C2510n nVar, C2505i iVar) {
        this.f9085b = nVar;
        this.f9086c = new C2493al(iVar);
    }

    /* renamed from: b */
    public final void mo6996b() {
    }

    /* renamed from: c */
    public final void mo6997c() {
        int i;
        C2493al alVar;
        byte[] bArr;
        C2493al alVar2 = this.f9086c;
        alVar2.f6845a = 0;
        try {
            alVar2.mo5880b(this.f9085b);
            do {
                i = (int) this.f9086c.f6845a;
                byte[] bArr2 = this.f9087d;
                if (bArr2 == null) {
                    this.f9087d = new byte[1024];
                } else {
                    int length = bArr2.length;
                    if (i == length) {
                        this.f9087d = Arrays.copyOf(bArr2, length + length);
                    }
                }
                alVar = this.f9086c;
                bArr = this.f9087d;
            } while (alVar.mo5879a(bArr, i, bArr.length - i) != -1);
        } finally {
            C2508l.m6614a(this.f9086c);
        }
    }
}
