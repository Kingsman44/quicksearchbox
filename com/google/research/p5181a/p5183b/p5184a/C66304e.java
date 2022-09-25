package com.google.research.p5181a.p5183b.p5184a;

import com.google.protobuf.C62963cj;
import com.google.research.p5181a.C66387p;
import com.google.research.p5181a.C66388q;
import com.google.research.p5181a.C66389r;
import com.google.research.p5181a.p5188f.C66377b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.research.a.b.a.e */
/* compiled from: PG */
public final class C66304e {

    /* renamed from: a */
    public final C66388q f180313a;

    public C66304e() {
        this.f180313a = (C66388q) C66389r.f180521e.createBuilder();
    }

    /* renamed from: a */
    public final List mo59475a() {
        ArrayList arrayList = new ArrayList(((C66389r) this.f180313a.instance).f180525c.size());
        for (C66387p pVar : new C62963cj(((C66389r) this.f180313a.instance).f180525c, C66389r.f180520d)) {
            arrayList.add(C66377b.values()[pVar.f180519m]);
        }
        return arrayList;
    }

    public C66304e(C66389r rVar) {
        this.f180313a = (C66388q) rVar.toBuilder();
    }
}
