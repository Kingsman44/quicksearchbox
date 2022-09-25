package androidx.media3.p132b;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p132b.p133a.C2458c;
import androidx.media3.p132b.p133a.C2459d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: androidx.media3.b.am */
/* compiled from: PG */
public final class C2494am implements C2505i {

    /* renamed from: a */
    private final C2505i f6848a;

    /* renamed from: b */
    private boolean f6849b;

    /* renamed from: c */
    private long f6850c;

    /* renamed from: d */
    private final C2459d f6851d;

    public C2494am(C2505i iVar, C2459d dVar) {
        this.f6848a = iVar;
        this.f6851d = dVar;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (this.f6850c == 0) {
            return -1;
        }
        int a = this.f6848a.mo5879a(bArr, i, i2);
        if (a > 0) {
            C2459d dVar = this.f6851d;
            C2510n nVar = dVar.f6749a;
            if (nVar != null) {
                int i3 = 0;
                while (i3 < a) {
                    try {
                        if (dVar.f6752d == dVar.f6750b) {
                            dVar.mo5876b();
                            dVar.mo5877c(nVar);
                        }
                        int min = (int) Math.min((long) (a - i3), dVar.f6750b - dVar.f6752d);
                        OutputStream outputStream = dVar.f6751c;
                        int i4 = C2612ak.f7249a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = (long) min;
                        dVar.f6752d += j;
                        dVar.f6753e += j;
                    } catch (IOException e) {
                        throw new C2458c(e);
                    }
                }
            }
            long j2 = this.f6850c;
            if (j2 != -1) {
                this.f6850c = j2 - ((long) a);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        long b = this.f6848a.mo5880b(nVar);
        this.f6850c = b;
        if (b == 0) {
            return 0;
        }
        if (nVar.f6897g == -1 && b != -1) {
            nVar = nVar.mo5937b(0, b);
        }
        this.f6849b = true;
        C2459d dVar = this.f6851d;
        nVar.f6898h.getClass();
        if (nVar.f6897g != -1 || !nVar.mo5938c(2)) {
            dVar.f6749a = nVar;
            dVar.f6750b = true != nVar.mo5938c(4) ? Long.MAX_VALUE : 5242880;
            dVar.f6753e = 0;
            try {
                dVar.mo5877c(nVar);
            } catch (IOException e) {
                throw new C2458c(e);
            }
        } else {
            dVar.f6749a = null;
        }
        return this.f6850c;
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6848a.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        try {
            this.f6848a.mo5882d();
            if (this.f6849b) {
                this.f6849b = false;
                this.f6851d.mo5875a();
            }
        } catch (Throwable th) {
            if (this.f6849b) {
                this.f6849b = false;
                this.f6851d.mo5875a();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return this.f6848a.mo5883e();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f6848a.mo5884f(anVar);
    }
}
