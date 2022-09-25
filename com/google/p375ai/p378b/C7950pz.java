package com.google.p375ai.p378b;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ai.b.pz */
/* compiled from: PG */
public final class C7950pz extends C62936bp implements C62938br {
    public C7950pz() {
        super(C7952qa.f27916z);
    }

    /* renamed from: a */
    public final boolean mo16967a() {
        return (((C7952qa) this.instance).f27920a & 4) != 0;
    }

    /* renamed from: b */
    public final C7720hl mo16989b() {
        C7720hl hlVar = ((C7952qa) this.instance).f27922c;
        return hlVar == null ? C7720hl.f26986e : hlVar;
    }

    /* renamed from: c */
    public final boolean mo16990c() {
        return (((C7952qa) this.instance).f27920a & 512) != 0;
    }

    /* renamed from: d */
    public final boolean mo16991d() {
        return (((C7952qa) this.instance).f27920a & 8192) != 0;
    }

    /* renamed from: e */
    public final List mo16992e() {
        return Collections.unmodifiableList(((C7952qa) this.instance).f27936q);
    }

    /* renamed from: f */
    public final void mo16993f(C7719hk hkVar) {
        copyOnWrite();
        C7952qa qaVar = (C7952qa) this.instance;
        C7720hl hlVar = (C7720hl) hkVar.build();
        C7952qa qaVar2 = C7952qa.f27916z;
        hlVar.getClass();
        qaVar.f27922c = hlVar;
        qaVar.f27920a |= 4;
    }

    /* renamed from: g */
    public final void mo16994g() {
        copyOnWrite();
        C7952qa qaVar = (C7952qa) this.instance;
        C7952qa qaVar2 = C7952qa.f27916z;
        qaVar.f27920a |= 65536;
        qaVar.f27933n = true;
    }
}
