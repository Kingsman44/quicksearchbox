package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5188f.C66376a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.research.a.e.o */
/* compiled from: PG */
public final class C66365o extends C66368r {

    /* renamed from: a */
    private final List f180454a;

    public C66365o() {
        ArrayList arrayList = new ArrayList();
        this.f180454a = arrayList;
        arrayList.add(new C66357g());
        arrayList.add(new C66353c());
    }

    /* renamed from: e */
    public final String mo59575e() {
        return "Rule_Based_Predictor";
    }

    /* renamed from: m */
    public final void mo59595m(C66355e eVar) {
        this.f180447l = eVar;
        for (C66361k m : this.f180454a) {
            m.mo59595m(eVar);
        }
    }

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        for (C66361k t : this.f180454a) {
            C66367q t2 = t.mo59574t(aVar);
            ArrayList arrayList = t2.f180459b;
            if (arrayList != null && !arrayList.isEmpty()) {
                return t2;
            }
        }
        return new C66367q();
    }
}
