package com.google.android.apps.gsa.shared.bisto;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ao */
/* compiled from: PG */
public final /* synthetic */ class C89617ao implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C89617ao f242681a = new C89617ao();

    private /* synthetic */ C89617ao() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C89618ap.m145852b((String) optional.get(), "\n");
        }
        C59104x c = C89618ap.f242682a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
        ((C59052c) ((C59052c) c).mo56372aa(10260)).mo56386p("Model map not available.");
        return C58729pv.f156485a;
    }
}
