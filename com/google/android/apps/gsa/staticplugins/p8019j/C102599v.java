package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.v */
/* compiled from: PG */
public final /* synthetic */ class C102599v implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C102599v f286358a = new C102599v();

    private /* synthetic */ C102599v() {
    }

    public final Object apply(Object obj) {
        C59104x c = C102550al.f286195a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(13966)).mo56386p("Failed in constructing model id from make, model and year vhals");
        return C58833ax.m90833j("AUTO-".concat(String.valueOf(C90744a.m148217a("ro.opa.device_model_id"))));
    }
}
