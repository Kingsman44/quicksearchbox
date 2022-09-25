package com.google.protos.youtube.elements;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.protos.youtube.elements.bi */
/* compiled from: PG */
public final class C66130bi extends C62934bn implements C63001dt {
    public C66130bi() {
        super(C66132bk.f179834b);
    }

    /* renamed from: a */
    public final void mo59442a(String str, C66134bm bmVar) {
        bmVar.getClass();
        copyOnWrite();
        C66132bk bkVar = (C66132bk) this.instance;
        C66132bk bkVar2 = C66132bk.f179834b;
        C62995dn dnVar = bkVar.f179837a;
        if (!dnVar.f170058b) {
            bkVar.f179837a = dnVar.mo58980a();
        }
        bkVar.f179837a.put(str, bmVar);
    }
}
