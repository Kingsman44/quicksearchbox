package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.b */
/* compiled from: PG */
public final /* synthetic */ class C139652b implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ String f379629a;

    public /* synthetic */ C139652b(String str) {
        this.f379629a = str;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        try {
            return this.f379629a.equals(((JSONObject) obj).getString("type"));
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) C139654d.f379631a.mo56226d()).mo56382g(e)).mo56372aa(41391)).mo56386p("No message type");
            return false;
        }
    }
}
