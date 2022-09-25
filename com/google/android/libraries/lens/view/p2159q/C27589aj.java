package com.google.android.libraries.lens.view.p2159q;

import com.google.android.apps.gsa.g.e.c;
import com.google.android.apps.gsa.g.e.e;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Collections;

/* renamed from: com.google.android.libraries.lens.view.q.aj */
/* compiled from: PG */
public final /* synthetic */ class C27589aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f75394a;

    public /* synthetic */ C27589aj(String str) {
        this.f75394a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f75394a;
        e eVar = (e) obj;
        C58974d dVar = C27608bb.f75425a;
        if (Collections.unmodifiableMap(eVar.a).containsKey(str)) {
            return eVar;
        }
        c createBuilder = e.c.createBuilder(eVar);
        str.getClass();
        createBuilder.copyOnWrite();
        createBuilder.instance.a().put(str, 0L);
        createBuilder.copyOnWrite();
        e eVar2 = createBuilder.instance;
        str.getClass();
        eVar2.b();
        eVar2.b.add(str);
        return createBuilder.build();
    }
}
