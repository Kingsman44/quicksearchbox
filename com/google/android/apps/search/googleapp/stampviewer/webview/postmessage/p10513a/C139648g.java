package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.C139641a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5124m.p5125a.C65601d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.g */
/* compiled from: PG */
public final class C139648g implements C139642a {

    /* renamed from: a */
    private static final C59071e f379623a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.g");

    /* renamed from: b */
    private final C65601d f379624b;

    public C139648g(C65601d dVar) {
        this.f379624b = dVar;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_player_experiments_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "playerExperiments";
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        if (!z || !optional.isPresent()) {
            ((C59052c) ((C59052c) f379623a.mo56226d()).mo56372aa(41400)).mo56386p("cannot send response to playerExperiments message");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("experimentIds", new JSONArray(C58528ij.m90006F(this.f379624b.f178304a)));
            ((C139641a) optional.get()).mo115136c(jSONObject2);
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f379623a.mo56226d()).mo56382g(e)).mo56372aa(41401)).mo56386p("cannot build response to playerExperiments message");
        }
    }

    /* renamed from: d */
    public final boolean mo115141d() {
        return false;
    }
}
