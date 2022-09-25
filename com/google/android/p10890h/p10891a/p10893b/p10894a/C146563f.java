package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.f */
/* compiled from: PG */
public final class C146563f extends C146579j {

    /* renamed from: b */
    private final C2649bk f395807b = new C2649bk();

    /* renamed from: c */
    private final C2650bl f395808c = new C2650bl();

    /* renamed from: d */
    private boolean f395809d;

    /* renamed from: u */
    private final void m238691u(C2711b bVar, boolean z) {
        long j;
        if (!this.f395809d && z) {
            C2651bm bmVar = bVar.f7528b;
            if (!bmVar.mo6304o()) {
                C3036as asVar = bVar.f7530d;
                if (asVar == null || !asVar.mo6102a()) {
                    j = bmVar.mo6024e(bVar.f7529c, this.f395808c, 0).f7349n;
                } else {
                    C2649bk n = bmVar.mo6303n(asVar.f7204a, this.f395807b);
                    C3036as asVar2 = bVar.f7530d;
                    j = n.mo6284e(asVar2.f7205b, asVar2.f7206c);
                }
                if (j != -9223372036854775807L) {
                    this.f395809d = true;
                    this.f395862a.mo123373c("len", Uri.encode(C146580k.m238793a(C2612ak.m6918A(j)), ",:"));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        m238691u(bVar, true);
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("len");
    }

    /* renamed from: s */
    public final void mo123359s(C2711b bVar, boolean z) {
        m238691u(bVar, z);
    }
}
