package com.google.android.libraries.mdi.download.p2243e;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.mdi.download.e.f */
/* compiled from: PG */
final class C29356f implements C42802e {

    /* renamed from: a */
    public final C29353c f79576a;

    /* renamed from: b */
    public final AtomicLong f79577b = new AtomicLong();

    /* renamed from: c */
    final /* synthetic */ C29357g f79578c;

    /* renamed from: d */
    private final Uri f79579d;

    /* renamed from: e */
    private long f79580e;

    public C29356f(C29357g gVar, Uri uri, C29353c cVar) {
        this.f79578c = gVar;
        this.f79579d = uri;
        this.f79576a = cVar;
        this.f79580e = gVar.f79581a.mo34498a();
    }

    /* renamed from: a */
    public final void mo34687a(int i) {
        long j = (long) i;
        if (this.f79578c.f79581a.mo34498a() - this.f79580e < 1000) {
            this.f79577b.getAndAdd(j);
            C29045l.m53941m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.f79579d, Long.valueOf(j), Long.valueOf(this.f79577b.get()));
            return;
        }
        synchronized (C29357g.class) {
            this.f79580e = this.f79578c.f79581a.mo34498a();
            this.f79577b.getAndAdd(j);
            C29045l.m53941m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.f79579d, Long.valueOf(j), Long.valueOf(this.f79577b.get()));
            if (this.f79578c.f79583c.containsKey(this.f79579d)) {
                this.f79578c.f79582b.execute(new C29355e(this));
            }
        }
    }

    public final /* synthetic */ void close() {
    }
}
