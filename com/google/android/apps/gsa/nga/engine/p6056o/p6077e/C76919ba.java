package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ba */
/* compiled from: PG */
public final /* synthetic */ class C76919ba implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C76919ba f212383a = new C76919ba();

    private /* synthetic */ C76919ba() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C80401n.f220656k;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(53256);
        for (C51809dy dyVar : (List) axVar.mo56107c()) {
            C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
            eVar.copyOnWrite();
            C80394g gVar = (C80394g) eVar.instance;
            dyVar.getClass();
            gVar.f220648b = dyVar;
            gVar.f220647a = 1;
            lVar.mo74317i(eVar);
        }
        return (C80401n) lVar.build();
    }
}
