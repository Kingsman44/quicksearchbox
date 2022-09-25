package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58729pv;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.p */
/* compiled from: PG */
public final /* synthetic */ class C89592p implements C89471bj {

    /* renamed from: a */
    public final /* synthetic */ C89484bw f242658a;

    public /* synthetic */ C89592p(C89484bw bwVar) {
        this.f242658a = bwVar;
    }

    /* renamed from: a */
    public final Object mo83355a() {
        SQLiteDatabase a = this.f242658a.mo83427a();
        if (a == null) {
            return C58729pv.f156485a;
        }
        List<C89481bt> m = C89484bw.m145622m(a);
        C58490gz gzVar = new C58490gz(4);
        for (C89481bt btVar : m) {
            C124709g gVar = btVar.f242511d;
            if (gVar != null) {
                gzVar.mo55429h(btVar.f242508a, new C124544b(gVar));
            }
        }
        return gzVar.mo55427f(false);
    }
}
