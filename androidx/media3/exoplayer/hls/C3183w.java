package androidx.media3.exoplayer.hls;

import androidx.media3.common.C2671o;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.metadata.emsg.C3590b;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.hls.w */
/* compiled from: PG */
final class C3183w implements C3368bf {

    /* renamed from: a */
    private static final C2680x f9475a;

    /* renamed from: b */
    private final C3368bf f9476b;

    /* renamed from: c */
    private final C2680x f9477c;

    /* renamed from: d */
    private C2680x f9478d;

    /* renamed from: e */
    private byte[] f9479e;

    /* renamed from: f */
    private int f9480f;

    static {
        C2679w wVar = new C2679w();
        wVar.f7459k = "application/id3";
        f9475a = new C2680x(wVar);
        C2679w wVar2 = new C2679w();
        wVar2.f7459k = "application/x-emsg";
        new C2680x(wVar2);
    }

    public C3183w(C3368bf bfVar, int i) {
        this.f9476b = bfVar;
        if (i == 1) {
            this.f9477c = f9475a;
            this.f9479e = new byte[0];
            this.f9480f = 0;
            return;
        }
        throw new IllegalArgumentException("Unknown metadataType: " + i);
    }

    /* renamed from: g */
    private final void m9288g(int i) {
        byte[] bArr = this.f9479e;
        if (bArr.length < i) {
            this.f9479e = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ int mo6849a(C2671o oVar, int i, boolean z) {
        m9288g(this.f9480f + i);
        int a = oVar.mo5879a(this.f9479e, this.f9480f, i);
        if (a != -1) {
            this.f9480f += a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final void mo6850b(C2680x xVar) {
        this.f9478d = xVar;
        this.f9476b.mo6850b(this.f9477c);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6851c(C2604ac acVar, int i) {
        mo6854f(acVar, i);
    }

    /* renamed from: d */
    public final void mo6852d(long j, int i, int i2, int i3, C3367be beVar) {
        this.f9478d.getClass();
        int i4 = this.f9480f - i3;
        C2604ac acVar = new C2604ac(Arrays.copyOfRange(this.f9479e, i4 - i2, i4));
        byte[] bArr = this.f9479e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f9480f = i3;
        if (!C2612ak.m6951aa(this.f9478d.f7496n, this.f9477c.f7496n)) {
            if ("application/x-emsg".equals(this.f9478d.f7496n)) {
                EventMessage c = C3590b.m10387c(acVar);
                C2680x a = c.mo6066a();
                if (a == null || !C2612ak.m6951aa(this.f9477c.f7496n, a.f7496n)) {
                    C2633u.m7050e("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f9477c.f7496n, c.mo6066a()}));
                    return;
                }
                byte[] c2 = c.mo6068c();
                c2.getClass();
                acVar = new C2604ac(c2);
            } else {
                C2633u.m7050e("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: ".concat(String.valueOf(this.f9478d.f7496n)));
                return;
            }
        }
        int i5 = acVar.f7236c - acVar.f7235b;
        this.f9476b.mo6851c(acVar, i5);
        this.f9476b.mo6852d(j, i, i5, i3, beVar);
    }

    /* renamed from: e */
    public final int mo6853e(C2671o oVar, int i, boolean z) {
        throw null;
    }

    /* renamed from: f */
    public final void mo6854f(C2604ac acVar, int i) {
        m9288g(this.f9480f + i);
        acVar.mo6155w(this.f9479e, this.f9480f, i);
        this.f9480f += i;
    }
}
