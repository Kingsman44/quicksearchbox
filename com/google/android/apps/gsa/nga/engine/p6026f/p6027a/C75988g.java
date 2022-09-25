package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C75988g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C75989h f210796a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f210797b;

    public /* synthetic */ C75988g(C75989h hVar, C58833ax axVar) {
        this.f210796a = hVar;
        this.f210797b = axVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C75989h hVar = this.f210796a;
        String str = (String) this.f210797b.mo56107c();
        Optional findAny = Collection.EL.stream((C58528ij) obj).filter(C75985d.f210793a).findAny();
        if (findAny.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return hVar.f210802e.a(str, C65753ak.ASSISTANT_SETTINGS, (String) findAny.get(), C63662ac.f172144a, C65849r.f179002c);
    }
}
