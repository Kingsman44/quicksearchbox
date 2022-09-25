package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.C90719ac;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dm */
/* compiled from: PG */
public final class C113372dm {

    /* renamed from: a */
    private final C86124t f313924a;

    /* renamed from: b */
    private final AtomicLong f313925b = new AtomicLong();

    public C113372dm(C86124t tVar) {
        this.f313924a = tVar;
    }

    /* renamed from: a */
    public final long mo100146a() {
        if (this.f313924a.mo79746e(C90063do.f249265aK)) {
            return this.f313925b.getAndIncrement();
        }
        return C90719ac.f253778a.f253779b.nextLong();
    }
}
