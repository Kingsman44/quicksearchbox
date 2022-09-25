package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.ag.c.fm */
/* compiled from: PG */
public final class C49074fm extends C62934bn implements C63001dt {
    public C49074fm() {
        super(C49076fo.f126934b);
    }

    /* renamed from: a */
    public final void mo53218a(int i, long j) {
        copyOnWrite();
        C49076fo foVar = (C49076fo) this.instance;
        C49076fo foVar2 = C49076fo.f126934b;
        C62995dn dnVar = foVar.f126936a;
        if (!dnVar.f170058b) {
            foVar.f126936a = dnVar.mo58980a();
        }
        foVar.f126936a.put(Integer.valueOf(i), Long.valueOf(j));
    }
}
