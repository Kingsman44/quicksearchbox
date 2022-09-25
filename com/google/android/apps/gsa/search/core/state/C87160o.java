package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.state.o */
/* compiled from: PG */
public final /* synthetic */ class C87160o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235511a;

    public /* synthetic */ C87160o(C87171z zVar) {
        this.f235511a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235511a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            if (zVar.mo80804b() == intValue) {
                zVar.f235559n++;
            } else {
                zVar.f235559n = 1;
            }
            zVar.f235560o.push(Integer.valueOf(intValue));
        } else {
            zVar.f235560o.clear();
            zVar.f235559n = 0;
        }
        zVar.f235571z = true;
        zVar.mo80802aj(false);
    }
}
