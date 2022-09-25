package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a.C139642a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.c */
/* compiled from: PG */
public final /* synthetic */ class C139653c implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ C139642a f379630a;

    public /* synthetic */ C139653c(C139642a aVar) {
        this.f379630a = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        Optional optional;
        C139642a aVar = this.f379630a;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("payload");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            boolean optBoolean = jSONObject.optBoolean("awaitResponse", false);
            if (optBoolean) {
                optional = Optional.m71637of(new C139656f(jSONObject.getString("type"), Long.parseLong(jSONObject.getString("requestId")), oVar));
            } else {
                optional = Optional.empty();
            }
            aVar.mo115140c(optJSONObject, optBoolean, optional);
        } catch (NumberFormatException | JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) C139654d.f379631a.mo56226d()).mo56382g(e)).mo56372aa(41390)).mo56386p("Invalid message");
        }
    }
}
