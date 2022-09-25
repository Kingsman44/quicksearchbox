package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.common.C2640bb;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import java.util.Locale;

/* renamed from: com.google.android.h.a.b.a.k */
/* compiled from: PG */
public final class C146568k extends C146579j {
    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("rate");
    }

    /* renamed from: h */
    public final void mo123363h(C2711b bVar, C2640bb bbVar, boolean z) {
        C146580k kVar = this.f395862a;
        StringBuilder b = kVar.mo123372b(bVar.f7527a);
        b.append(String.format(Locale.US, "%.3f", new Object[]{Float.valueOf(bbVar.f7313b)}));
        kVar.mo123373c("rate", Uri.encode(b.toString(), ",:"));
    }
}
