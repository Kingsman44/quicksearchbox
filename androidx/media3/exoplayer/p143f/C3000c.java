package androidx.media3.exoplayer.p143f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2838bh;
import androidx.media3.exoplayer.C2839bi;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.C3001g;
import androidx.media3.extractor.metadata.C3584a;
import androidx.media3.extractor.metadata.C3585b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.f.c */
/* compiled from: PG */
public final class C3000c extends C3001g implements Handler.Callback {

    /* renamed from: f */
    private final C2999b f8670f;

    /* renamed from: g */
    private final Handler f8671g;

    /* renamed from: h */
    private final C3585b f8672h;

    /* renamed from: i */
    private C3584a f8673i;

    /* renamed from: j */
    private boolean f8674j;

    /* renamed from: k */
    private boolean f8675k;

    /* renamed from: l */
    private long f8676l;

    /* renamed from: m */
    private Metadata f8677m;

    /* renamed from: n */
    private long f8678n;

    /* renamed from: o */
    private final C2845bo f8679o;

    public C3000c(C2845bo boVar, Looper looper, C2999b bVar) {
        super(5);
        Handler handler;
        boVar.getClass();
        this.f8679o = boVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C2612ak.m6921D(looper, this);
        }
        this.f8671g = handler;
        this.f8670f = bVar;
        this.f8672h = new C3585b();
        this.f8678n = -9223372036854775807L;
    }

    /* renamed from: M */
    private final long m8532M(long j) {
        boolean z = true;
        C2601a.m6832d(j != -9223372036854775807L);
        if (this.f8678n == -9223372036854775807L) {
            z = false;
        }
        C2601a.m6832d(z);
        return j - this.f8678n;
    }

    /* renamed from: N */
    private final void m8533N(Metadata metadata, List list) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f7056a;
            if (i < entryArr.length) {
                C2680x a = entryArr[i].mo6066a();
                if (a == null || !this.f8670f.mo6929b(a)) {
                    list.add(metadata.f7056a[i]);
                } else {
                    C3584a a2 = this.f8670f.mo6928a(a);
                    byte[] c = metadata.f7056a[i].mo6068c();
                    c.getClass();
                    byte[] bArr = c;
                    this.f8672h.mo5953fg();
                    this.f8672h.mo5960c(bArr.length);
                    ByteBuffer byteBuffer = this.f8672h.f6955c;
                    int i2 = C2612ak.f7249a;
                    byteBuffer.put(bArr);
                    this.f8672h.mo5961d();
                    Metadata a3 = a2.mo7491a(this.f8672h);
                    if (a3 != null) {
                        m8533N(a3, list);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    private final void m8534O(Metadata metadata) {
        C2845bo boVar = this.f8679o;
        C2848br brVar = boVar.f7944a;
        C2592as asVar = new C2592as(brVar.f7953B);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f7056a;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].mo6067b(asVar);
            i++;
        }
        brVar.f7953B = new C2593at(asVar);
        C2593at aB = boVar.f7944a.mo6585aB();
        if (!aB.equals(boVar.f7944a.f8006s)) {
            C2848br brVar2 = boVar.f7944a;
            brVar2.f8006s = aB;
            brVar2.f7992d.mo6204c(14, new C2838bh(boVar));
        }
        boVar.f7944a.f7992d.mo6204c(28, new C2839bi(metadata));
        boVar.f7944a.f7992d.mo6203b();
    }

    /* renamed from: H */
    public final String mo6504H() {
        return "MetadataRenderer";
    }

    /* renamed from: I */
    public final void mo6686I(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.f8674j && this.f8677m == null) {
                this.f8672h.mo5953fg();
                C2874cc h = mo6935h();
                int eW = mo6933eW(h, this.f8672h, 0);
                if (eW == -4) {
                    if (this.f8672h.mo5954fh(4)) {
                        this.f8674j = true;
                    } else {
                        C3585b bVar = this.f8672h;
                        bVar.f11423g = this.f8676l;
                        bVar.mo5961d();
                        C3584a aVar = this.f8673i;
                        int i = C2612ak.f7249a;
                        Metadata a = aVar.mo7491a(this.f8672h);
                        if (a != null) {
                            ArrayList arrayList = new ArrayList(a.f7056a.length);
                            m8533N(a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f8677m = new Metadata(m8532M(this.f8672h.f6957e), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (eW == -5) {
                    C2680x xVar = h.f8096a;
                    xVar.getClass();
                    this.f8676l = xVar.f7500r;
                }
            }
            Metadata metadata = this.f8677m;
            if (metadata != null && metadata.f7057b <= m8532M(j)) {
                Metadata metadata2 = this.f8677m;
                Handler handler = this.f8671g;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    m8534O(metadata2);
                }
                this.f8677m = null;
                z = true;
            }
            if (this.f8674j && this.f8677m == null) {
                this.f8675k = true;
                continue;
            }
        } while (z);
    }

    /* renamed from: J */
    public final boolean mo6505J() {
        return this.f8675k;
    }

    /* renamed from: K */
    public final boolean mo6506K() {
        return true;
    }

    /* renamed from: L */
    public final int mo6699L(C2680x xVar) {
        if (!this.f8670f.mo6929b(xVar)) {
            return 128;
        }
        return (xVar.f7483G == 0 ? 4 : 2) | 128;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m8534O((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6527q() {
        this.f8677m = null;
        this.f8673i = null;
        this.f8678n = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6529s(long j, boolean z) {
        this.f8677m = null;
        this.f8674j = false;
        this.f8675k = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6920w(C2680x[] xVarArr, long j, long j2) {
        this.f8673i = this.f8670f.mo6928a(xVarArr[0]);
        Metadata metadata = this.f8677m;
        if (metadata != null) {
            long j3 = metadata.f7057b;
            long j4 = (this.f8678n + j3) - j2;
            if (j3 != j4) {
                metadata = new Metadata(j4, metadata.f7056a);
            }
            this.f8677m = metadata;
        }
        this.f8678n = j2;
    }
}
