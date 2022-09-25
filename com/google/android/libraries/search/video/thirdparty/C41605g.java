package com.google.android.libraries.search.video.thirdparty;

import androidx.media3.common.C2646bh;
import androidx.media3.common.C2682z;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.thirdparty.g */
/* compiled from: PG */
public final class C41605g extends C2682z {

    /* renamed from: a */
    final C41607i f108756a;

    public C41605g(C2646bh bhVar, C41607i iVar) {
        super(bhVar);
        this.f108756a = iVar;
    }

    /* renamed from: A */
    public final void mo5973A(int i, long j) {
        mo6263ah(j);
    }

    /* renamed from: B */
    public final void mo5974B(boolean z) {
        if (z) {
            this.f108756a.mo44171E();
        } else {
            this.f108756a.mo44170D();
        }
    }

    /* renamed from: ad */
    public final void mo6259ad() {
        mo5974B(false);
    }

    /* renamed from: ae */
    public final void mo6260ae() {
        mo5974B(true);
    }

    /* renamed from: ah */
    public final void mo6263ah(long j) {
        this.f108756a.mo44174H(Duration.ofMillis(j));
    }

    /* renamed from: ai */
    public final void mo6264ai(int i) {
        mo6263ah(-9223372036854775807L);
    }
}
