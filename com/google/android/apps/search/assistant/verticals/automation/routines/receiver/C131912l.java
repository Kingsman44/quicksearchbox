package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10034g.C131899e;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.afx;
import com.google.assistant.p3861at.afy;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.l */
/* compiled from: PG */
public final /* synthetic */ class C131912l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360187a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableGeofence f360188b;

    public /* synthetic */ C131912l(C131921u uVar, ParcelableGeofence parcelableGeofence) {
        this.f360187a = uVar;
        this.f360188b = parcelableGeofence;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C60870cx cxVar;
        C131921u uVar = this.f360187a;
        ParcelableGeofence parcelableGeofence = this.f360188b;
        AccountId accountId = (AccountId) ((Optional) obj).orElse(null);
        if (accountId == null) {
            C59104x c = C131921u.f360205a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new IllegalStateException("Disabled account"))).mo56372aa(39467)).mo56384n();
            return C60856cj.m92897f(new C60870cx[0]);
        }
        String str2 = parcelableGeofence.f391867a;
        int indexOf = str2.indexOf("#routines#");
        int indexOf2 = str2.indexOf("#routines_standalone#");
        boolean z = indexOf > 0 && indexOf + 10 < str2.length();
        C58838bb.m90880o(z != (indexOf2 > 0 && indexOf2 + 21 < str2.length()), "The Geofence ID '%s' does not contain either the '%s' (for prod use) or the '%s' (for standalone app) delimiter at a valid index", str2, "#routines#", "#routines_standalone#");
        if (z) {
            str = str2.substring(indexOf + 10);
        } else {
            str = str2.substring(indexOf2 + 21);
        }
        int indexOf3 = str.indexOf("@");
        if (z) {
            C58838bb.m90880o(indexOf3 < 0, "The Geofence ID '%s' contains '%s' and therefore must not contain the standalone params delimiter '%s'", str2, "#routines#", "@");
        } else {
            C58838bb.m90879n(indexOf3 > 0 && indexOf3 + 1 < str.length(), "The Geofence ID '%s' does not contain the standalone params delimiter '%s' at a valid index", str2, "@");
            str = str.substring(0, indexOf3);
        }
        if (!uVar.mo110346a(accountId).mo110347bo().f360069c) {
            C58976aa aaVar = C58975e.f156826a;
            afx afx = (afx) afy.f129188g.createBuilder();
            afx.copyOnWrite();
            afy afy = (afy) afx.instance;
            afy.f129190a |= 32;
            afy.f129193d = true;
            afx.copyOnWrite();
            afy afy2 = (afy) afx.instance;
            str.getClass();
            afy2.f129190a |= 1;
            afy2.f129191b = str;
            if (true != str.startsWith("routine_")) {
                str = "category_template";
            }
            afx.copyOnWrite();
            afy afy3 = (afy) afx.instance;
            str.getClass();
            afy3.f129190a |= 256;
            afy3.f129195f = str;
            String a = C131899e.m214363a(uVar.f360206b, (afy) afx.build());
            afx.copyOnWrite();
            afy afy4 = (afy) afx.instance;
            a.getClass();
            afy4.f129190a |= 64;
            afy4.f129194e = a;
            if (afy4.f129194e.isEmpty()) {
                String string = uVar.f360206b.getString(R.string.assistant_routine_name_custom);
                afx.copyOnWrite();
                afy afy5 = (afy) afx.instance;
                string.getClass();
                afy5.f129190a |= 64;
                afy5.f129194e = string;
            }
            cxVar = C60856cj.m92900i((afy) afx.build());
        } else {
            cxVar = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C131904d(uVar, accountId, str)), uVar.f360209e)).mo51513e(Throwable.class, C131905e.f360178a, uVar.f360209e).mo51515h(new C131906f(str), uVar.f360209e);
        }
        return C60856cj.m92897f(C47633f.m84733g(cxVar).mo51516i(new C131913m(uVar, accountId, parcelableGeofence), uVar.f360209e), C47633f.m84733g(cxVar).mo51516i(new C131914n(uVar, accountId), uVar.f360209e));
    }
}
