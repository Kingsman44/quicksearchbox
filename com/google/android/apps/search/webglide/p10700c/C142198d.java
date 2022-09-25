package com.google.android.apps.search.webglide.p10700c;

import android.content.Context;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2513q;

/* renamed from: com.google.android.apps.search.webglide.c.d */
/* compiled from: PG */
public final class C142198d {

    /* renamed from: a */
    public final C2759ad f385766a;

    /* renamed from: b */
    public final C3086bx f385767b;

    /* renamed from: c */
    public final C3086bx f385768c;

    /* renamed from: d */
    public boolean f385769d;

    public C142198d(Context context) {
        this.f385766a = new C2758ac(context).mo6454a();
        this.f385767b = new C3086bx(new C2513q(context, "Webglide", (C2495an) null));
        this.f385768c = new C3086bx(new C142196b(context));
    }

    /* renamed from: a */
    public final void mo117050a() {
        if (this.f385769d) {
            throw new IllegalStateException("This instance of ExoPlayerManager has already been released. Please create a new ExoPlayerManager instance for usage.");
        }
    }

    /* renamed from: b */
    public final void mo117051b() {
        mo117050a();
        this.f385766a.mo5974B(false);
    }
}
