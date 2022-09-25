package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8399o;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.google.ak.b.a.af */
/* compiled from: PG */
final class C8277af extends C8266aa {
    /* renamed from: c */
    public static final URI m22996c(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        try {
            String h = aVar.mo17117h();
            if ("null".equals(h)) {
                return null;
            }
            return new URI(h);
        } catch (URISyntaxException e) {
            throw new C8399o((Throwable) e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        return m22996c(aVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        URI uri = (URI) obj;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toASCIIString();
        }
        cVar.mo17141k(str);
    }
}
