package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.net.InetAddress;

/* renamed from: com.google.ak.b.a.ag */
/* compiled from: PG */
final class C8278ag extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() != 9) {
            return InetAddress.getByName(aVar.mo17117h());
        }
        aVar.mo17123n();
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            str = null;
        } else {
            str = inetAddress.getHostAddress();
        }
        cVar.mo17141k(str);
    }
}
