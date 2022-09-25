package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.C141734a;
import com.google.android.apps.search.transcription.C141741b;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.search.transcription.f.bu */
/* compiled from: PG */
public final class C141853bu {

    /* renamed from: a */
    public final AtomicLong f384949a;

    public C141853bu(C21370a aVar) {
        this.f384949a = new AtomicLong(aVar.mo26871c());
    }

    /* renamed from: a */
    public final C141741b mo116843a() {
        C141734a aVar = (C141734a) C141741b.f384719d.createBuilder();
        long incrementAndGet = this.f384949a.incrementAndGet();
        aVar.copyOnWrite();
        C141741b bVar = (C141741b) aVar.instance;
        bVar.f384721a |= 1;
        bVar.f384722b = incrementAndGet;
        return (C141741b) aVar.build();
    }
}
