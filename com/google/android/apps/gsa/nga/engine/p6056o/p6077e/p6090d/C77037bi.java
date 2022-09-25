package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.u;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bi */
/* compiled from: PG */
public final /* synthetic */ class C77037bi implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212635a;

    public /* synthetic */ C77037bi(C77140u uVar) {
        this.f212635a = uVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77140u uVar = this.f212635a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return Optional.m71637of(u.a((String) optional.get()));
        }
        ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3818)).mo56386p("AUM failed to disambiguate phone number");
        C77089dg.m123752h(uVar, C82835ce.AUM_PHONE_NUMBER_NOT_RESOLVED);
        return Optional.empty();
    }
}
