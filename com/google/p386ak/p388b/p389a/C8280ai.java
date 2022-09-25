package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.Currency;

/* renamed from: com.google.ak.b.a.ai */
/* compiled from: PG */
final class C8280ai extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        String h = aVar.mo17117h();
        try {
            return Currency.getInstance(h);
        } catch (IllegalArgumentException e) {
            String d = aVar.mo17113d(true);
            throw new C8406v("Failed parsing '" + h + "' as Currency; at path " + d, e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17141k(((Currency) obj).getCurrencyCode());
    }
}
