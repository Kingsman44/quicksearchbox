package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.y */
/* compiled from: PG */
public final /* synthetic */ class C98143y implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274056a;

    public /* synthetic */ C98143y(C98064as asVar) {
        this.f274056a = asVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98064as asVar = this.f274056a;
        C118826c cVar = (C118826c) obj;
        if (((C91376f) asVar.f273814j.mo17428b()).mo85697b()) {
            asVar.mo90925t();
            return true;
        }
        C59104x d = C98064as.f273803a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EntryProvider");
        ((C59052c) ((C59052c) d).mo56372aa(30528)).mo56386p("Network not available. Skipping invalidate.");
        return false;
    }
}
