package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76437j;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.z */
/* compiled from: PG */
public final class C76428z implements C76402a {

    /* renamed from: a */
    private final C58495hd f211572a;

    public C76428z(Map map) {
        if (((C58729pv) map).f156487c >= C76437j.values().length - 1) {
            this.f211572a = C58495hd.m89898l(map);
            return;
        }
        throw new AssertionError("conditionEvaluators must contain keys for every ConditionCase");
    }

    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C76402a aVar = (C76402a) this.f211572a.get(C76437j.m123054a(kVar.f211605a));
        if (aVar == null) {
            return true;
        }
        return aVar.mo72188a(bgVar, tVar, kVar);
    }

    /* renamed from: b */
    public final boolean mo72189b(C76438k kVar) {
        C76402a aVar = (C76402a) this.f211572a.get(C76437j.m123054a(kVar.f211605a));
        if (aVar == null) {
            return false;
        }
        return aVar.mo72189b(kVar);
    }
}
