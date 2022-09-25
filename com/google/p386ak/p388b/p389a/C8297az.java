package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ak.b.a.az */
/* compiled from: PG */
final class C8297az extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        try {
            return new AtomicInteger(aVar.mo17111c());
        } catch (NumberFormatException e) {
            throw new C8406v((Throwable) e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17139i((long) ((AtomicInteger) obj).get());
    }
}
