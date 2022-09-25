package androidx.media3.exoplayer.dash;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.dash.p141a.C2916g;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.extractor.metadata.emsg.C3591c;
import androidx.media3.p134c.C2529g;

/* renamed from: androidx.media3.exoplayer.dash.w */
/* compiled from: PG */
final class C2954w implements C3095cf {

    /* renamed from: a */
    public C2916g f8476a;

    /* renamed from: b */
    private final C2680x f8477b;

    /* renamed from: c */
    private final C3591c f8478c = new C3591c();

    /* renamed from: d */
    private long[] f8479d;

    /* renamed from: e */
    private boolean f8480e;

    /* renamed from: f */
    private boolean f8481f;

    /* renamed from: g */
    private int f8482g;

    /* renamed from: h */
    private long f8483h = -9223372036854775807L;

    public C2954w(C2916g gVar, C2680x xVar, boolean z) {
        this.f8477b = xVar;
        this.f8476a = gVar;
        this.f8479d = gVar.f8347b;
        mo6846e(gVar, z);
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        int i2 = this.f8482g;
        boolean z = i2 == this.f8479d.length;
        if (z && !this.f8480e) {
            gVar.f6941a = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.f8481f) {
            ccVar.f8096a = this.f8477b;
            this.f8481f = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.f8482g = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] a = this.f8478c.mo7505a(this.f8476a.f8346a[i2]);
                gVar.mo5960c(a.length);
                gVar.f6955c.put(a);
            }
            gVar.f6957e = this.f8479d[i2];
            gVar.f6941a = 1;
            return -4;
        }
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        int max = Math.max(this.f8482g, C2612ak.m6972av(this.f8479d, j, true));
        int i = this.f8482g;
        this.f8482g = max;
        return max - i;
    }

    /* renamed from: d */
    public final void mo6845d(long j) {
        int av = C2612ak.m6972av(this.f8479d, j, true);
        this.f8482g = av;
        if (!this.f8480e || av != this.f8479d.length) {
            j = -9223372036854775807L;
        }
        this.f8483h = j;
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        return true;
    }

    /* renamed from: fd */
    public final void mo6848fd() {
    }

    /* renamed from: e */
    public final void mo6846e(C2916g gVar, boolean z) {
        long j;
        int i = this.f8482g;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f8479d[i - 1];
        }
        this.f8480e = z;
        this.f8476a = gVar;
        long[] jArr = gVar.f8347b;
        this.f8479d = jArr;
        long j2 = this.f8483h;
        if (j2 != -9223372036854775807L) {
            mo6845d(j2);
        } else if (j != -9223372036854775807L) {
            this.f8482g = C2612ak.m6972av(jArr, j, false);
        }
    }
}
