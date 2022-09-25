package com.google.android.apps.gsa.opa.p6443g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Serializable;

/* renamed from: com.google.android.apps.gsa.opa.g.a */
/* compiled from: PG */
public final class C83679a {

    /* renamed from: a */
    public static final C59071e f228102a = C59071e.m91332i("com.google.android.apps.gsa.opa.g.a");

    /* renamed from: b */
    public static final C58528ij f228103b = C58528ij.m90014N("ACTION_SHOW_NOTIFICATION", "ACTION_PROACTIVEAPI_SYNC_REQUEST", "ACTION_DISMISS_NOTIFICATION", "USER_DISMISSAL_ACTION", "ACTION_START_ZS_PARTIAL_REQUEST");

    /* renamed from: c */
    public final Context f228104c;

    public C83679a(Context context) {
        this.f228104c = context;
    }

    /* renamed from: a */
    public static Intent m133247a(C87696ae aeVar) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("ACTION_PROACTIVEAPI_SYNC_REQUEST");
        intent.putExtra("PROACTIVEAPI_CLIENT_EVENT_DATA_EXTRA", aeVar.toByteArray());
        return intent;
    }

    /* renamed from: b */
    public final void mo77006b(C48851br brVar, int i, C58833ax axVar) {
        C59104x b = f228102a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
        ((C59052c) ((C59052c) b).mo56372aa(6798)).mo56386p("#sendUserActionDismissalIntent");
        Intent intent = new Intent();
        intent.setAction("USER_DISMISSAL_ACTION");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("CONTENT_SELECTOR_EXTRA", brVar.toByteArray());
        if (axVar.mo56113h()) {
            intent.putExtra("DISMISSAL_EXPIRATION_TIMESTAMP_MILLIS_EXTRA", (Serializable) axVar.mo56107c());
        }
        intent.putExtra("CLIENT_UI_OBJECT_TYPE_EXTRA", i - 1);
        C74445c.m120396c(this.f228104c, intent);
    }
}
