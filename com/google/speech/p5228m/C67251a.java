package com.google.speech.p5228m;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Map;

/* renamed from: com.google.speech.m.a */
/* compiled from: PG */
public final class C67251a extends C62934bn implements C63001dt {
    public C67251a() {
        super(C67341e.f183034i);
    }

    /* renamed from: a */
    public final void mo59781a(Map map) {
        copyOnWrite();
        C67341e eVar = (C67341e) this.instance;
        C67341e eVar2 = C67341e.f183034i;
        C62995dn dnVar = eVar.f183041e;
        if (!dnVar.f170058b) {
            eVar.f183041e = dnVar.mo58980a();
        }
        eVar.f183041e.putAll(map);
    }
}
