package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.p134c.C2529g;

/* renamed from: androidx.media3.exoplayer.h.b.h */
/* compiled from: PG */
public final class C3052h implements C3095cf {

    /* renamed from: a */
    public final C3054j f8856a;

    /* renamed from: b */
    final /* synthetic */ C3054j f8857b;

    /* renamed from: c */
    private final C3094ce f8858c;

    /* renamed from: d */
    private final int f8859d;

    /* renamed from: e */
    private boolean f8860e;

    public C3052h(C3054j jVar, C3054j jVar2, C3094ce ceVar, int i) {
        this.f8857b = jVar;
        this.f8856a = jVar2;
        this.f8858c = ceVar;
        this.f8859d = i;
    }

    /* renamed from: e */
    private final void m8727e() {
        if (!this.f8860e) {
            C3054j jVar = this.f8857b;
            C3065bc bcVar = jVar.f8866f;
            int[] iArr = jVar.f8862b;
            int i = this.f8859d;
            bcVar.mo7016o(iArr[i], jVar.f8863c[i], 0, jVar.f8872l);
            this.f8860e = true;
        }
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        C3054j jVar = this.f8857b;
        if (jVar.mo6994i()) {
            return -3;
        }
        C3045a aVar = jVar.f8874n;
        if (aVar != null) {
            int a = aVar.mo6979a(this.f8859d + 1);
            C3094ce ceVar = this.f8858c;
            if (a <= ceVar.f9043e + ceVar.f9044f) {
                return -3;
            }
        }
        m8727e();
        return this.f8858c.mo7074j(ccVar, gVar, i, this.f8857b.f8875o);
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        C3054j jVar = this.f8857b;
        if (jVar.mo6994i()) {
            return 0;
        }
        int h = this.f8858c.mo7072h(j, jVar.f8875o);
        C3045a aVar = this.f8857b.f8874n;
        if (aVar != null) {
            int a = aVar.mo6979a(this.f8859d + 1);
            C3094ce ceVar = this.f8858c;
            h = Math.min(h, a - (ceVar.f9043e + ceVar.f9044f));
        }
        this.f8858c.mo7088y(h);
        if (h > 0) {
            m8727e();
        }
        return h;
    }

    /* renamed from: d */
    public final void mo6990d() {
        C2601a.m6832d(this.f8857b.f8864d[this.f8859d]);
        this.f8857b.f8864d[this.f8859d] = false;
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        C3054j jVar = this.f8857b;
        return !jVar.mo6994i() && this.f8858c.mo7068A(jVar.f8875o);
    }

    /* renamed from: fd */
    public final void mo6848fd() {
    }
}
