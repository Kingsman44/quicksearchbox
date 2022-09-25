package com.google.android.libraries.p11012aj;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import java.util.Map;

/* renamed from: com.google.android.libraries.aj.g */
/* compiled from: PG */
public final class C147608g {

    /* renamed from: a */
    private Map f398422a;

    public C147608g(Map map) {
        this.f398422a = map;
    }

    /* renamed from: a */
    public final void mo124375a() {
        C19559g.m37304c();
        C58838bb.m90866a(this.f398422a, "init() was already called");
        for (C147606e eVar : C147606e.values()) {
            C147607f fVar = (C147607f) this.f398422a.get(eVar);
            if (fVar != null) {
                fVar.mo41448a();
            }
        }
        this.f398422a = null;
    }
}
