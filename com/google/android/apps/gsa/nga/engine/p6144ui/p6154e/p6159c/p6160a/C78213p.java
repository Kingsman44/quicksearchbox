package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.api.a.az;
import com.google.android.apps.gsa.nga.api.a.ba;
import com.google.android.apps.gsa.nga.api.a.bc;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C78213p implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C78213p f215341a = new C78213p();

    private /* synthetic */ C78213p() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bc bcVar = (bc) obj3;
        az createBuilder = ba.e.createBuilder();
        int i = 1;
        int i2 = true != ((Boolean) obj).booleanValue() ? 1 : 2;
        createBuilder.copyOnWrite();
        ba baVar = createBuilder.instance;
        baVar.b = i2 - 1;
        baVar.a |= 1;
        if (bool.booleanValue() && bcVar == bc.b) {
            i = 2;
        }
        createBuilder.copyOnWrite();
        ba baVar2 = createBuilder.instance;
        baVar2.c = i - 1;
        baVar2.a |= 2;
        createBuilder.copyOnWrite();
        ba baVar3 = createBuilder.instance;
        baVar3.d = bcVar.d;
        baVar3.a |= 4;
        return createBuilder.build();
    }
}
