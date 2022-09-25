package com.google.speech.p5218j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.j.mc */
/* compiled from: PG */
public final class C67129mc extends C62934bn implements C63001dt {
    public C67129mc() {
        super(C67131me.f182477b);
    }

    /* renamed from: a */
    public final void mo59772a(String str, C63088z zVar) {
        copyOnWrite();
        C67131me meVar = (C67131me) this.instance;
        C67131me meVar2 = C67131me.f182477b;
        C62995dn dnVar = meVar.f182479a;
        if (!dnVar.f170058b) {
            meVar.f182479a = dnVar.mo58980a();
        }
        meVar.f182479a.put(str, zVar);
    }
}
