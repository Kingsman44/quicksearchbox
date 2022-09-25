package com.google.android.apps.gsa.shared.p6987ak;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.ak.a */
/* compiled from: PG */
public final /* synthetic */ class C89187a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C89190d f241805a;

    public /* synthetic */ C89187a(C89190d dVar) {
        this.f241805a = dVar;
    }

    public final Object apply(Object obj) {
        C89190d dVar = this.f241805a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        dVar.f241812f.mo57444a();
        if (!axVar.mo56113h()) {
            return false;
        }
        return Boolean.valueOf(dVar.f241812f.mo57444a().minus(dVar.f241808b).isBefore((Instant) axVar.mo56107c()));
    }
}
