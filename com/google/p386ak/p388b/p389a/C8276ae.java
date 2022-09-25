package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.net.URL;

/* renamed from: com.google.ak.b.a.ae */
/* compiled from: PG */
final class C8276ae extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        if (!"null".equals(h)) {
            return new URL(h);
        }
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        URL url = (URL) obj;
        if (url == null) {
            str = null;
        } else {
            str = url.toExternalForm();
        }
        cVar.mo17141k(str);
    }
}
