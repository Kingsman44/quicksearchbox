package com.google.android.libraries.lens.view.livingsurfaces;

import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p137a.C2732c;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.g */
/* compiled from: PG */
final class C27248g implements C2733d {

    /* renamed from: a */
    private final C27245d f74542a;

    public C27248g(C27245d dVar) {
        this.f74542a = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6425a(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6426b(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6427c(C2711b bVar, C3032ao aoVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6428d(C2646bh bhVar, C2732c cVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6429e(C2711b bVar, C2640bb bbVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6430f(C2711b bVar, int i) {
    }

    /* renamed from: g */
    public final void mo6431g(C2711b bVar, C2639ba baVar) {
        this.f74542a.mo32767g();
        ((C58970a) ((C58970a) ((C58970a) C27249h.f74543a.mo56225c()).mo56382g(baVar)).mo56372aa(49640)).mo56386p("Error playing Lens video");
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6434j(C2711b bVar, boolean z) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6435k(C2711b bVar, C2657bs bsVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6436l() {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6437m(C2711b bVar) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6438n() {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6439o(C3004h hVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6440p(C2711b bVar) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6441q(C2658bt btVar) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6442r(C2711b bVar) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6443s(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6444t(C2711b bVar) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6445u(C2711b bVar) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo6446v(C2711b bVar) {
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6447w(C2711b bVar) {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6448x(Metadata metadata) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6449y(int i, int i2) {
    }

    /* renamed from: i */
    public final void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
        if (i == 0 && bVar.f7529c == 0 && bVar.f7531e < 200) {
            ((C58970a) ((C58970a) C27249h.f74543a.mo56224b()).mo56372aa(49644)).mo56386p("Lens video has restarted");
            this.f74542a.mo32769i();
            return;
        }
        ((C58970a) ((C58970a) C27249h.f74543a.mo56226d()).mo56372aa(49645)).mo56394x("Got non-restart discontinuity for Lens video: %d at %d", i, bVar.f7531e);
    }

    /* renamed from: h */
    public final void mo6432h(C2711b bVar, boolean z, int i) {
        if (i == 2) {
            ((C58970a) ((C58970a) C27249h.f74543a.mo56224b()).mo56372aa(49642)).mo56386p("Lens video changed state to buffering");
        } else if (i != 3) {
            ((C58970a) ((C58970a) C27249h.f74543a.mo56224b()).mo56372aa(49641)).mo56387q("Lens video changed state to %d", i);
        } else {
            ((C58970a) ((C58970a) C27249h.f74543a.mo56224b()).mo56372aa(49643)).mo56389s("Lens video changed state to ready, playWhenReady: %b", Boolean.valueOf(z));
            this.f74542a.mo32772l();
            this.f74542a.mo32771k();
        }
    }
}
