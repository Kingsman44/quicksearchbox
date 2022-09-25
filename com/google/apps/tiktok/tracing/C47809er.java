package com.google.apps.tiktok.tracing;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.io.Closeable;

/* renamed from: com.google.apps.tiktok.tracing.er */
/* compiled from: PG */
public final class C47809er implements Closeable {

    /* renamed from: a */
    private final long f123820a;

    public C47809er(long j) {
        this.f123820a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51641a() {
        synchronized (C47810es.f123821a) {
            C47810es.f123821a.remove(Long.valueOf(this.f123820a));
        }
    }

    public final void close() {
        C19559g.m37302a().postDelayed(new C47808eq(this), 5000);
    }
}
