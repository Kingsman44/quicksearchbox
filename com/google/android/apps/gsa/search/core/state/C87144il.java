package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.il */
/* compiled from: PG */
public final /* synthetic */ class C87144il implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87146in f235457a;

    /* renamed from: b */
    public final /* synthetic */ boolean f235458b;

    /* renamed from: c */
    public final /* synthetic */ String f235459c;

    public /* synthetic */ C87144il(C87146in inVar, boolean z, String str) {
        this.f235457a = inVar;
        this.f235458b = z;
        this.f235459c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87146in inVar = this.f235457a;
        boolean z = this.f235458b;
        String str = this.f235459c;
        if (C83583an.m133149d(inVar.f235463c, (C89062r) obj) && z) {
            C58976aa aaVar = C58975e.f156826a;
            ((C87052fn) inVar.f235462b.mo27525b()).mo80462q(inVar.f235464d.mo84268aE(str, false).mo84245H(0, true, QueryTriggerType.USER).mo84264aA("and.opa", new Bundle()));
        }
    }
}
