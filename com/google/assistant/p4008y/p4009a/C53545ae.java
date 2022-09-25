package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.y.a.ae */
/* compiled from: PG */
public final class C53545ae extends C62934bn implements C63001dt {
    public C53545ae() {
        super(C53548ah.f140519n);
    }

    /* renamed from: a */
    public final void mo53995a(String str) {
        str.getClass();
        copyOnWrite();
        C53548ah ahVar = (C53548ah) this.instance;
        C53548ah ahVar2 = C53548ah.f140519n;
        C62995dn dnVar = ahVar.f140528h;
        if (!dnVar.f170058b) {
            ahVar.f140528h = dnVar.mo58980a();
        }
        ahVar.f140528h.put("User-Agent", str);
    }
}
