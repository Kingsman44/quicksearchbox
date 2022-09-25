package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.w */
/* compiled from: PG */
final class C8323w extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        if (h.length() == 1) {
            return Character.valueOf(h.charAt(0));
        }
        String d = aVar.mo17113d(true);
        throw new C8406v("Expecting character, got: " + h + "; at " + d);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        Character ch = (Character) obj;
        if (ch == null) {
            str = null;
        } else {
            str = ch.toString();
        }
        cVar.mo17141k(str);
    }
}
