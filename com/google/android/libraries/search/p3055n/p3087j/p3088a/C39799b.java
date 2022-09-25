package com.google.android.libraries.search.p3055n.p3087j.p3088a;

import com.google.speech.p5218j.C67046ja;
import com.google.speech.p5218j.p5223d.C66882a;
import com.google.speech.p5218j.p5223d.C66883b;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.n.j.a.b */
/* compiled from: PG */
public final class C39799b extends C39798a {
    /* renamed from: b */
    public final void mo42014b(C67046ja jaVar, C66882a aVar) {
        if (jaVar.f182251g.size() > 0) {
            long longValue = ((Long) ((Map.Entry) Collection.EL.stream(Collections.unmodifiableMap(jaVar.f182251g).entrySet()).max(Map.Entry.CC.comparingByValue()).get()).getKey()).longValue();
            aVar.copyOnWrite();
            C66883b bVar = (C66883b) aVar.instance;
            C66883b bVar2 = C66883b.f181830j;
            bVar.f181832a |= 128;
            bVar.f181840i = longValue;
        }
    }

    /* renamed from: c */
    public final void mo42015c(C67046ja jaVar, C66882a aVar) {
        int size = jaVar.f182251g.size();
        aVar.copyOnWrite();
        C66883b bVar = (C66883b) aVar.instance;
        C66883b bVar2 = C66883b.f181830j;
        bVar.f181832a |= 64;
        bVar.f181839h = size;
    }
}
