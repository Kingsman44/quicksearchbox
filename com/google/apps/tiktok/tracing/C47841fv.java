package com.google.apps.tiktok.tracing;

import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.apps.tiktok.tracing.fv */
/* compiled from: PG */
public final class C47841fv implements Runnable, C47573bx {

    /* renamed from: a */
    C47572bw f123871a;

    public C47841fv(C47572bw bwVar) {
        this.f123871a = bwVar;
    }

    public final void close() {
        C19559g.m37302a().postDelayed(this, 5000);
    }

    public final void run() {
        this.f123871a = null;
    }
}
