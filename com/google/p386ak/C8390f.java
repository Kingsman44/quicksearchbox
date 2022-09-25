package com.google.p386ak;

import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.ak.f */
/* compiled from: PG */
final class C8390f extends C8266aa {

    /* renamed from: a */
    final /* synthetic */ C8266aa f29242a;

    public C8390f(C8266aa aaVar) {
        this.f29242a = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        return new AtomicLong(((Number) this.f29242a.mo17029a(aVar)).longValue());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        this.f29242a.mo17030b(cVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
