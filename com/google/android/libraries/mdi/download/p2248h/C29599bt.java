package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.h.bt */
/* compiled from: PG */
public final /* synthetic */ class C29599bt implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29409fd f80180a;

    public /* synthetic */ C29599bt(C29409fd fdVar) {
        this.f80180a = fdVar;
    }

    public final C60870cx apply(Object obj) {
        C29409fd fdVar = this.f80180a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || ((C28708an) axVar.mo56107c()).f77997b.isEmpty()) {
            C29045l.m53930b("%s: Not adding file group because of overrider.", "SingleDataFileGroupPop");
            return C60856cj.m92900i(false);
        }
        C29343e eVar = new C29343e();
        eVar.mo34326b((C28708an) axVar.mo56107c());
        return fdVar.mo34712a(eVar.mo34325a());
    }
}
