package com.google.android.libraries.mdi.download.p2247g;

import com.google.android.libraries.mdi.download.C28742bt;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3311e.C42774b;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.mdi.download.g.d */
/* compiled from: PG */
final class C29440d implements C42774b {

    /* renamed from: a */
    public final C28742bt f79816a;

    /* renamed from: b */
    public final AtomicLong f79817b = new AtomicLong();

    /* renamed from: c */
    final /* synthetic */ C29441e f79818c;

    /* renamed from: d */
    private final String f79819d;

    public C29440d(C29441e eVar, String str, C28742bt btVar) {
        this.f79818c = eVar;
        this.f79819d = str;
        this.f79816a = btVar;
    }

    /* renamed from: a */
    public final void mo34737a(int i) {
        this.f79817b.getAndAdd((long) i);
        C29045l.m53941m("%s: Received data for groupName = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.f79819d, Integer.valueOf(i), Long.valueOf(this.f79817b.get()));
    }

    /* renamed from: b */
    public final void mo34738b() {
        synchronized (C29441e.class) {
            if (this.f79818c.f79822c.containsKey(this.f79819d)) {
                this.f79818c.f79820a.execute(new C29439c(this));
            }
        }
    }
}
