package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cu */
/* compiled from: PG */
public final /* synthetic */ class C96144cu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f269157a;

    public /* synthetic */ C96144cu(C60870cx cxVar) {
        this.f269157a = cxVar;
    }

    public final Object apply(Object obj) {
        C124548d dVar = (C124548d) C60856cj.m92910s(this.f269157a);
        boolean e = C89643n.m145920e(dVar);
        int intValue = ((Integer) obj).intValue();
        Bundle bundle = new Bundle();
        bundle.putBoolean("vm", e);
        bundle.putInt("hw", intValue);
        boolean z = true;
        bundle.putBoolean("vme", dVar != null && dVar.mo106495ai());
        bundle.putInt("ga", dVar != null ? dVar.mo106528z().f386391g : 0);
        if (dVar != null && !C124526g.m203993a(dVar)) {
            z = false;
        }
        bundle.putBoolean("fnse", z);
        return bundle;
    }
}
