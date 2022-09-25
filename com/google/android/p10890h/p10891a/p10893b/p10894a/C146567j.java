package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import com.google.android.p10890h.p10891a.p10893b.C146582m;

/* renamed from: com.google.android.h.a.b.a.j */
/* compiled from: PG */
public final class C146567j extends C146579j {

    /* renamed from: b */
    private boolean f395817b;

    public C146567j(C146582m mVar) {
        this.f395817b = mVar.mo95066d();
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("is_offline");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95070d() {
        if (this.f395817b) {
            this.f395862a.mo123373c("feature", Uri.encode("offlinelist", ",:"));
            this.f395862a.mo123373c("is_offline", Uri.encode("0:1", ",:"));
        }
    }

    /* renamed from: f */
    public final void mo123351f(C2711b bVar, int i, long j, long j2, boolean z) {
        if (z && this.f395817b) {
            this.f395817b = false;
            C146580k kVar = this.f395862a;
            StringBuilder b = kVar.mo123372b(bVar.f7527a - ((long) i));
            b.append('0');
            kVar.mo123373c("is_offline", Uri.encode(b.toString(), ",:"));
        }
    }
}
