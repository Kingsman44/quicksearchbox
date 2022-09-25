package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.au */
/* compiled from: PG */
final class C8292au extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        int r = aVar.mo17127r();
        if (r == 9) {
            aVar.mo17123n();
            return null;
        } else if (r == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.mo17117h()));
        } else {
            return Boolean.valueOf(aVar.mo17126q());
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17130b();
        cVar.mo17129a();
        cVar.f29234a.write(true != bool.booleanValue() ? "false" : "true");
    }
}
