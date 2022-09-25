package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.ax */
/* compiled from: PG */
final class C8295ax extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        try {
            int c = aVar.mo17111c();
            if (c <= 65535 && c >= -32768) {
                return Short.valueOf((short) c);
            }
            String d = aVar.mo17113d(true);
            throw new C8406v("Lossy conversion from " + c + " to short; at path " + d);
        } catch (NumberFormatException e) {
            throw new C8406v((Throwable) e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17140j((Number) obj);
    }
}
