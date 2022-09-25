package com.google.android.apps.gsa.staticplugins.opa.setupwizard.p8447a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.a.a */
/* compiled from: PG */
public final /* synthetic */ class C110440a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110450k f307892a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f307893b;

    public /* synthetic */ C110440a(C110450k kVar, JSONObject jSONObject) {
        this.f307892a = kVar;
        this.f307893b = jSONObject;
    }

    public final void run() {
        C110450k kVar = this.f307892a;
        JSONObject jSONObject = this.f307893b;
        C58485gu c = kVar.f307904c.mo79745c(C90062dn.f249197A);
        SharedPreferences.Editor edit = kVar.f307906e.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!c.contains(next)) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                boolean optBoolean = jSONObject.optBoolean(next, false);
                if (next.equals("setting_screen_context")) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    kVar.f307907f.mo17661b(optBoolean, new C9409b(kVar.getActivity(), kVar.f307909h));
                } else if (next.equals("setting_personal_lockscreen")) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    C89994f fVar = kVar.f307905d;
                    EventForDump.m147676e(5, "handle personal response from WebView");
                    fVar.mo83837C(optBoolean);
                } else {
                    edit.putBoolean(next, optBoolean);
                }
            }
        }
        edit.apply();
        kVar.completeStep();
    }
}
