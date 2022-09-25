package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.c */
/* compiled from: PG */
public final /* synthetic */ class C95146c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266220a;

    /* renamed from: b */
    public final /* synthetic */ String f266221b;

    /* renamed from: c */
    public final /* synthetic */ String f266222c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f266223d;

    public /* synthetic */ C95146c(C95144aj ajVar, String str, String str2, Bundle bundle) {
        this.f266220a = ajVar;
        this.f266221b = str;
        this.f266222c = str2;
        this.f266223d = bundle;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95144aj ajVar = this.f266220a;
        String str = this.f266221b;
        String str2 = this.f266222c;
        Bundle bundle = this.f266223d;
        C124548d dVar = (C124548d) obj;
        int i = 5;
        if (dVar != null && C124633az.OOBE_FINISHED.equals(dVar.mo106520r())) {
            if (dVar.mo106484Y()) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                i = 6;
            }
        }
        ajVar.mo89060A(str, str2, i, bundle);
    }
}
