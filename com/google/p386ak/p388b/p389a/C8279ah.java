package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.UUID;

/* renamed from: com.google.ak.b.a.ah */
/* compiled from: PG */
final class C8279ah extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        try {
            return UUID.fromString(h);
        } catch (IllegalArgumentException e) {
            String d = aVar.mo17113d(true);
            throw new C8406v("Failed parsing '" + h + "' as UUID; at path " + d, e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            str = null;
        } else {
            str = uuid.toString();
        }
        cVar.mo17141k(str);
    }
}
