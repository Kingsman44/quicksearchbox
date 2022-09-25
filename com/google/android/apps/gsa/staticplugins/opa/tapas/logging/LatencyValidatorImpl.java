package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public final class LatencyValidatorImpl {

    /* renamed from: a */
    public final AtomicLong f312259a = new AtomicLong(0);

    /* renamed from: b */
    private final LiveData f312260b;

    public LatencyValidatorImpl(h hVar, C2391v vVar, C21370a aVar, C22871g gVar) {
        this.f312260b = hVar.a();
        gVar.mo28212l("observe on pause", new C112696d(this, vVar, aVar));
    }

    /* renamed from: a */
    public final boolean mo99611a(long j) {
        return j > this.f312259a.get() && !f.a.equals(this.f312260b.mo3842a());
    }
}
