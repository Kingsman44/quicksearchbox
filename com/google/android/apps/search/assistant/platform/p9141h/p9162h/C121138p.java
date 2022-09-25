package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.p */
/* compiled from: PG */
final class C121138p implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C121140r.f336590a.mo56226d()).mo56382g(th)).mo56372aa(35713)).mo56386p("Failed to write to Geller storage");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58495hd hdVar = (C58495hd) obj;
        if (!hdVar.containsKey(C121140r.f336591b)) {
            ((C59052c) ((C59052c) C121140r.f336590a.mo56225c()).mo56372aa(35715)).mo56386p("Could not find PRIVACY_SETTINGS corpus from sync result map");
        } else if (!((C21850cf) hdVar.get(C121140r.f336591b)).mo27152b().isEmpty()) {
            ((C59052c) ((C59052c) C121140r.f336590a.mo56225c()).mo56372aa(35714)).mo56386p("Failed to sync PRIVACY_SETTINGS corpus");
        }
    }
}
