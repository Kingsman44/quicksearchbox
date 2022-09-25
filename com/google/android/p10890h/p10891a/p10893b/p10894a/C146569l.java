package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;

/* renamed from: com.google.android.h.a.b.a.l */
/* compiled from: PG */
public final class C146569l extends C146579j {

    /* renamed from: b */
    private boolean f395818b;

    /* renamed from: c */
    private boolean f395819c;

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        this.f395819c = true;
        if (this.f395818b) {
            StringBuilder b = this.f395862a.mo123372b(bVar.f7527a);
            b.deleteCharAt(b.length() - 1);
            this.f395862a.mo123373c("user_intent", Uri.encode(b.toString(), ",:"));
        }
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("user_intent");
    }

    /* renamed from: q */
    public final void mo123366q(C2711b bVar, boolean z) {
        if (!this.f395818b && z) {
            this.f395818b = true;
            if (!this.f395819c) {
                this.f395862a.mo123373c("cat", Uri.encode("prefetch", ",:"));
            }
        }
    }
}
