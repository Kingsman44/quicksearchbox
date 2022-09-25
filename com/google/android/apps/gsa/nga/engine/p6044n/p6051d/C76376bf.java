package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.bf */
/* compiled from: PG */
public final class C76376bf {

    /* renamed from: a */
    private final Map f211508a = new HashMap();

    /* renamed from: a */
    public final synchronized C58485gu mo72180a() {
        C58485gu j;
        j = C58485gu.m89842j(this.f211508a.values());
        this.f211508a.clear();
        return j;
    }

    /* renamed from: b */
    public final synchronized Optional mo72181b(String str) {
        return Optional.ofNullable((C58495hd) this.f211508a.remove(str));
    }

    /* renamed from: c */
    public final synchronized void mo72182c(String str, C58495hd hdVar) {
        this.f211508a.put(str, hdVar);
    }
}
