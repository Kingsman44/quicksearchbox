package com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a;

import androidx.p104d.p105a.C2169h;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C124342l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124348r f343227a;

    public /* synthetic */ C124342l(C124348r rVar) {
        this.f343227a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C124348r rVar = this.f343227a;
        int i = ((ModuleAvailabilityResponse) obj).f390185b;
        if (i == 0) {
            ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36215)).mo56386p("Usonia module is already available.");
            return C60866ct.f164955a;
        } else if (i == 1) {
            ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36216)).mo56386p("Usonia module is ready to be downloaded.");
            return C2169h.m6027a(new C124345o(rVar));
        } else if (i != 2) {
            return C60866ct.f164955a;
        } else {
            ((C58970a) ((C58970a) C124348r.f343234a.mo56226d()).mo56372aa(36217)).mo56386p("Usonia module status is unknown. This should never happen.");
            return C60866ct.f164955a;
        }
    }
}
