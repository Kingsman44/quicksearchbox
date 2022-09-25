package com.google.android.libraries.storage.p3304a.p3311e;

import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.storage.a.e.c */
/* compiled from: PG */
public final class C42775c implements C42802e {

    /* renamed from: a */
    public final C42774b f112034a;

    /* renamed from: b */
    private final C42773a f112035b;

    /* renamed from: c */
    private final long f112036c;

    /* renamed from: d */
    private long f112037d;

    public C42775c(C42774b bVar, C42773a aVar, long j, TimeUnit timeUnit) {
        this.f112034a = bVar;
        this.f112035b = aVar;
        this.f112036c = timeUnit.toMillis(j);
        this.f112037d = aVar.mo34735a();
    }

    /* renamed from: a */
    public final void mo34687a(int i) {
        this.f112034a.mo34737a(i);
        if (this.f112035b.mo34735a() - this.f112037d >= this.f112036c) {
            this.f112034a.mo34738b();
            this.f112037d = this.f112035b.mo34735a();
        }
    }

    public final void close() {
        this.f112034a.mo34738b();
    }
}
