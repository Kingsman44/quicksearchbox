package com.google.android.apps.search.transcription.p10670f.p10678g;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.transcription.f.g.c */
/* compiled from: PG */
public final class C141890c {

    /* renamed from: a */
    public final C60888db f385006a;

    /* renamed from: b */
    private final C21370a f385007b;

    /* renamed from: c */
    private volatile long f385008c;

    /* renamed from: d */
    private volatile long f385009d;

    public C141890c(C21370a aVar, C60888db dbVar) {
        this.f385007b = aVar;
        this.f385006a = dbVar;
    }

    /* renamed from: a */
    public final synchronized void mo116868a(Runnable runnable) {
        long c = this.f385007b.mo26871c();
        long j = c - this.f385008c;
        if (j >= this.f385009d) {
            runnable.run();
            this.f385008c = c;
            if (j >= 5000) {
                this.f385009d = 0;
            }
            long j2 = this.f385009d + 50;
            this.f385009d = Math.min(3000, j2 + j2);
            return;
        }
        this.f385006a.mo29164d(new C141873a(this, runnable), this.f385009d - j, TimeUnit.MILLISECONDS);
    }
}
