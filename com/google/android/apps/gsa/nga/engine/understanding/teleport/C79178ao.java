package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import java.util.List;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ao */
/* compiled from: PG */
public final /* synthetic */ class C79178ao implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ List f217641a;

    public /* synthetic */ C79178ao(List list) {
        this.f217641a = list;
    }

    public final Object apply(int i) {
        List list = this.f217641a;
        int i2 = C79204bn.f217670a;
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder((C80047aa) list.get(i));
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219664h = (long) i;
        return (C80047aa) xVar.build();
    }
}
