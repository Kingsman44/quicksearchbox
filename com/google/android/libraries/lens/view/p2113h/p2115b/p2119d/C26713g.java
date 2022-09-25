package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.util.Size;
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
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26742ak;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26756h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.g */
/* compiled from: PG */
final class C26713g implements C2733d {

    /* renamed from: a */
    final /* synthetic */ C26715i f72826a;

    public C26713g(C26715i iVar) {
        this.f72826a = iVar;
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
        ((C58970a) ((C58970a) ((C58970a) C26715i.f72830a.mo56225c()).mo56382g(baVar)).mo56372aa(49116)).mo56386p("Error playing Telelens video");
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
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
    public final void mo6448x(Metadata metadata) {
        C58974d dVar = C26715i.f72830a;
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f7056a;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    public final void mo6449y(int i, int i2) {
        C58974d dVar = C26715i.f72830a;
        C26715i iVar = this.f72826a;
        Size size = new Size(i, i2);
        C26756h hVar = new C26756h();
        hVar.mo32095e(C58485gu.m89846n(size));
        hVar.mo32094d(0);
        hVar.mo32093c(1.0f);
        hVar.f72896a = size;
        hVar.mo32092b(false);
        C26736ae aeVar = iVar.f72836g;
        aeVar.getClass();
        hVar.f72898c = aeVar;
        iVar.f72834e = hVar.mo32091a();
        iVar.mo32027e();
    }

    /* renamed from: h */
    public final void mo6432h(C2711b bVar, boolean z, int i) {
        if (i == 1) {
            C58974d dVar = C26715i.f72830a;
        } else if (i == 2) {
            C58974d dVar2 = C26715i.f72830a;
        } else if (i == 3) {
            C58974d dVar3 = C26715i.f72830a;
        } else if (i != 4) {
            C58974d dVar4 = C26715i.f72830a;
        } else {
            C58974d dVar5 = C26715i.f72830a;
            for (C26742ak a : this.f72826a.f72841l) {
                a.mo32076a();
            }
            C26715i iVar = this.f72826a;
            iVar.f72835f.f72827a.getLastPathSegment();
            iVar.f72835f.f72828b = C58833ax.m90834k(0L);
            iVar.f72839j = null;
        }
    }
}
