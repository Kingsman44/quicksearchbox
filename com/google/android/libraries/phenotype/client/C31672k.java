package com.google.android.libraries.phenotype.client;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.libraries.phenotype.client.k */
/* compiled from: PG */
final class C31672k extends ContentObserver {
    public C31672k() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C31654aj.f85147b.incrementAndGet();
    }
}
