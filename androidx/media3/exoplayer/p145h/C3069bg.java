package androidx.media3.exoplayer.p145h;

import androidx.media3.exoplayer.C2874cc;
import androidx.media3.p134c.C2529g;

/* renamed from: androidx.media3.exoplayer.h.bg */
/* compiled from: PG */
final class C3069bg implements C3095cf {

    /* renamed from: a */
    public final C3095cf f8916a;

    /* renamed from: b */
    private final long f8917b;

    public C3069bg(C3095cf cfVar, long j) {
        this.f8916a = cfVar;
        this.f8917b = j;
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        int a = this.f8916a.mo6843a(ccVar, gVar, i);
        if (a != -4) {
            return a;
        }
        gVar.f6957e = Math.max(0, gVar.f6957e + this.f8917b);
        return -4;
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        return this.f8916a.mo6844b(j - this.f8917b);
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        return this.f8916a.mo6847f();
    }

    /* renamed from: fd */
    public final void mo6848fd() {
        this.f8916a.mo6848fd();
    }
}
