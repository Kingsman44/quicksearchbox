package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bp */
/* compiled from: PG */
public final class C91338bp implements C91326bd {

    /* renamed from: a */
    private final C7718hj f254888a;

    /* renamed from: b */
    private final List f254889b;

    public C91338bp(C7718hj hjVar, List list) {
        this.f254888a = hjVar;
        this.f254889b = list;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        if (hjVar == null || !C91978bb.m150941g(hjVar, this.f254888a)) {
            return C58836b.f156633a;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        if (((C7718hj) hcVar.instance).f26954Z.size() != 0) {
            hcVar.copyOnWrite();
            ((C7718hj) hcVar.instance).f26954Z = C7718hj.emptyProtobufList();
            hcVar.mo16938a(this.f254889b);
        }
        return C58833ax.m90834k((C7718hj) hcVar.build());
    }
}
