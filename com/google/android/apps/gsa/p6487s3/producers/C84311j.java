package com.google.android.apps.gsa.p6487s3.producers;

import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.s3.producers.j */
/* compiled from: PG */
public abstract class C84311j implements C84314m {

    /* renamed from: a */
    private final AtomicBoolean f229449a = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C66606cd mo77837a();

    public final void close() {
        this.f229449a.set(true);
    }

    /* renamed from: hj */
    public final C66607ce mo77855hj() {
        if (this.f229449a.compareAndSet(false, true)) {
            return (C66607ce) mo77837a().build();
        }
        return null;
    }
}
