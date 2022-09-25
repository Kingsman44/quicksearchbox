package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bg */
/* compiled from: PG */
public final /* synthetic */ class C114586bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114602bw f317815a;

    public /* synthetic */ C114586bg(C114602bw bwVar) {
        this.f317815a = bwVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114602bw bwVar = this.f317815a;
        C89062r rVar = (C89062r) obj;
        boolean z = bwVar.mo101440a() < TimeUnit.MINUTES.toMillis(bwVar.f317844e.mo79743a(C90014bt.f247827on));
        if (!rVar.mo83040a()) {
            return Boolean.valueOf(z);
        }
        if (!bwVar.f317841b) {
            return Boolean.valueOf(z);
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }
}
