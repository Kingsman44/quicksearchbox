package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fz */
/* compiled from: PG */
final class C108977fz implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C108980gb f303024a;

    public C108977fz(C108980gb gbVar) {
        this.f303024a = gbVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C108980gb.f303029b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24471)).mo56386p("Failed to fetch Routine data");
        this.f303024a.mo77318iT().mo77312a();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C89057m mVar = (C89057m) obj;
        C59071e eVar = C108980gb.f303029b;
        C58976aa aaVar = C58975e.f156826a;
        try {
            String e = mVar.mo83035e();
            if (e.startsWith(")]}'\n")) {
                e = e.substring(5);
            }
            JSONObject jSONObject = new JSONObject(e);
            String optString = jSONObject.optString("workflow_title");
            String optString2 = jSONObject.optString("workflow_id");
            C59104x b = C108980gb.f303029b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
            ((C59052c) ((C59052c) b).mo56372aa(24474)).mo56354G("workflowTitle: %s workflowId: %s", optString, optString2);
            if (optString.isEmpty() || optString2.isEmpty()) {
                C59104x c = C108980gb.f303029b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
                ((C59052c) ((C59052c) c).mo56372aa(24475)).mo56386p("Failed to parse Routine data");
                this.f303024a.mo77318iT().mo77312a();
                return;
            }
            C108980gb gbVar = this.f303024a;
            Uri.Builder appendQueryParameter = C108980gb.f303030c.buildUpon().appendPath("create").appendQueryParameter("hour", Integer.toString(gbVar.f303047l.get(11))).appendQueryParameter("minute", Integer.toString(gbVar.f303047l.get(12)));
            ArrayList e2 = gbVar.mo97337e();
            int size = e2.size();
            for (int i = 0; i < size; i++) {
                appendQueryParameter.appendQueryParameter("dayOfWeek", (String) C108980gb.f303031d.get((Integer) e2.get(i)));
            }
            if (!(optString == null || optString2 == null)) {
                appendQueryParameter.appendQueryParameter("workflowLabel", optString).appendQueryParameter("workflowData", optString2);
            }
            Intent intent = new Intent().setData(appendQueryParameter.build()).setPackage(C108980gb.f303030c.getHost());
            if (gbVar.isAdded()) {
                gbVar.startActivity(intent);
            } else {
                C59104x d = C108980gb.f303029b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
                ((C59052c) ((C59052c) d).mo56372aa(24482)).mo56386p("Alarm is not created because the fragment is not added to the activity.");
            }
            this.f303024a.mo77318iT().mo77312a();
        } catch (C89013ak | C90457d | JSONException e3) {
            C59104x c2 = C108980gb.f303029b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(24476)).mo56386p("Failed to read the response");
            this.f303024a.mo77318iT().mo77312a();
        }
    }
}
