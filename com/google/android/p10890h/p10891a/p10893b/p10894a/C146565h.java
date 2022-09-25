package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2645bg;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.h */
/* compiled from: PG */
public final class C146565h extends C146579j {
    /* renamed from: u */
    private final void m238705u(long j, long j2) {
        C146580k kVar = this.f395862a;
        StringBuilder b = kVar.mo123372b(j);
        b.append(C146580k.m238793a(j2));
        kVar.mo123373c("cmt", Uri.encode(b.toString(), ",:"));
    }

    /* renamed from: v */
    private final void m238706v(C2711b bVar) {
        m238705u(bVar.f7527a, bVar.f7531e);
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        m238706v(bVar);
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("cmt");
    }

    /* renamed from: h */
    public final void mo123363h(C2711b bVar, C2640bb bbVar, boolean z) {
        if (z) {
            m238706v(bVar);
        }
    }

    /* renamed from: i */
    public final void mo123364i(C2711b bVar, int i, boolean z) {
        if (z) {
            m238706v(bVar);
        }
    }

    /* renamed from: k */
    public final void mo123355k(C2711b bVar, boolean z, int i, boolean z2) {
        if (z2) {
            m238706v(bVar);
        }
    }

    /* renamed from: l */
    public final void mo123356l(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i, boolean z, boolean z2) {
        if (z) {
            m238705u(bVar.f7527a, bgVar.f7324f);
        }
        if (z2) {
            m238705u(bVar.f7527a, bgVar2.f7324f);
        }
    }

    /* renamed from: r */
    public final void mo123365r(C2711b bVar, boolean z) {
        if (z) {
            m238706v(bVar);
        }
    }
}
