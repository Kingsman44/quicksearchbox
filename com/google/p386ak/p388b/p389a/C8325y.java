package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.math.BigDecimal;

/* renamed from: com.google.ak.b.a.y */
/* compiled from: PG */
final class C8325y extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        try {
            return new BigDecimal(h);
        } catch (NumberFormatException e) {
            String d = aVar.mo17113d(true);
            throw new C8406v("Failed parsing '" + h + "' as BigDecimal; at path " + d, e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17140j((BigDecimal) obj);
    }
}
