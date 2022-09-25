package com.google.research.p5181a.p5183b.p5184a;

import com.google.research.p5181a.C66392u;
import com.google.research.p5181a.C66393v;
import com.google.research.p5181a.C66396y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.research.a.b.a.g */
/* compiled from: PG */
public final class C66306g {

    /* renamed from: a */
    public final C66392u f180315a;

    public C66306g() {
        this.f180315a = (C66392u) C66393v.f180531f.createBuilder();
    }

    /* renamed from: a */
    public final String mo59478a() {
        return ((C66393v) this.f180315a.instance).f180537e;
    }

    /* renamed from: b */
    public final String mo59479b() {
        return ((C66393v) this.f180315a.instance).f180535c;
    }

    /* renamed from: c */
    public final List mo59480c() {
        ArrayList arrayList = new ArrayList(((C66393v) this.f180315a.instance).f180534b.size());
        for (C66396y hVar : Collections.unmodifiableList(((C66393v) this.f180315a.instance).f180534b)) {
            arrayList.add(new C66307h(hVar));
        }
        return arrayList;
    }

    public C66306g(C66393v vVar) {
        this.f180315a = (C66392u) vVar.toBuilder();
    }
}
