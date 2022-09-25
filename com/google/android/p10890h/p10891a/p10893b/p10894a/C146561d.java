package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2657bs;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.d */
/* compiled from: PG */
public final class C146561d extends C146579j {

    /* renamed from: b */
    private long f395805b;

    /* renamed from: u */
    private final void m238680u(C2711b bVar, boolean z, boolean z2) {
        if (z2) {
            long j = bVar.f7527a;
            if (j - this.f395805b > 500 || z) {
                C146580k kVar = this.f395862a;
                StringBuilder b = kVar.mo123372b(j);
                b.append(C146580k.m238793a(bVar.f7536j));
                kVar.mo123373c("bh", Uri.encode(b.toString(), ",:"));
                this.f395805b = bVar.f7527a;
            }
        }
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        m238680u(bVar, false, true);
    }

    /* renamed from: b */
    public final void mo95068b(C2711b bVar, C2657bs bsVar, boolean z) {
        m238680u(bVar, true, z);
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("bh");
    }

    /* renamed from: k */
    public final void mo123355k(C2711b bVar, boolean z, int i, boolean z2) {
        m238680u(bVar, false, z2);
    }

    /* renamed from: l */
    public final void mo123356l(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i, boolean z, boolean z2) {
        m238680u(bVar, true, z2);
    }

    /* renamed from: n */
    public final void mo123353n(C2711b bVar, boolean z) {
        m238680u(bVar, true, z);
    }

    /* renamed from: o */
    public final void mo123357o(C2711b bVar, boolean z) {
        m238680u(bVar, false, z);
    }

    /* renamed from: t */
    public final void mo123358t(C2711b bVar, boolean z) {
        m238680u(bVar, false, z);
    }
}
