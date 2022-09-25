package androidx.media3.exoplayer.hls;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.p160g.C3407d;
import androidx.media3.extractor.p161h.C3428o;
import androidx.media3.extractor.p172k.C3527a;
import androidx.media3.extractor.p172k.C3541an;
import androidx.media3.extractor.p172k.C3550c;
import androidx.media3.extractor.p172k.C3552e;

/* renamed from: androidx.media3.exoplayer.hls.b */
/* compiled from: PG */
public final class C3162b implements C3176p {

    /* renamed from: b */
    private static final C3350ay f9383b = new C3350ay();

    /* renamed from: a */
    final C3326aa f9384a;

    /* renamed from: c */
    private final C2680x f9385c;

    /* renamed from: d */
    private final C2609ah f9386d;

    public C3162b(C3326aa aaVar, C2680x xVar, C2609ah ahVar) {
        this.f9384a = aaVar;
        this.f9385c = xVar;
        this.f9386d = ahVar;
    }

    /* renamed from: a */
    public final C3176p mo7157a() {
        C3326aa aaVar;
        C2601a.m6832d(!mo7161e());
        C3326aa aaVar2 = this.f9384a;
        if (aaVar2 instanceof C3161ad) {
            aaVar = new C3161ad(this.f9385c.f7487e, this.f9386d);
        } else if (aaVar2 instanceof C3552e) {
            aaVar = new C3552e(0);
        } else if (aaVar2 instanceof C3527a) {
            aaVar = new C3527a();
        } else if (aaVar2 instanceof C3550c) {
            aaVar = new C3550c();
        } else if (aaVar2 instanceof C3407d) {
            aaVar = new C3407d(0, -9223372036854775807L);
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(String.valueOf(aaVar2.getClass().getSimpleName())));
        }
        return new C3162b(aaVar, this.f9385c, this.f9386d);
    }

    /* renamed from: b */
    public final void mo7158b(C3329ad adVar) {
        this.f9384a.mo7156s(adVar);
    }

    /* renamed from: c */
    public final void mo7159c() {
        this.f9384a.mo7154d(0, 0);
    }

    /* renamed from: d */
    public final boolean mo7160d() {
        C3326aa aaVar = this.f9384a;
        return (aaVar instanceof C3552e) || (aaVar instanceof C3527a) || (aaVar instanceof C3550c) || (aaVar instanceof C3407d);
    }

    /* renamed from: e */
    public final boolean mo7161e() {
        C3326aa aaVar = this.f9384a;
        return (aaVar instanceof C3541an) || (aaVar instanceof C3428o);
    }

    /* renamed from: f */
    public final boolean mo7162f(C3327ab abVar) {
        return this.f9384a.mo7152a(abVar, f9383b) == 0;
    }
}
