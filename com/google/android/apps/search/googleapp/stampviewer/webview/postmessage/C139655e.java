package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.e */
/* compiled from: PG */
public abstract class C139655e {

    /* renamed from: a */
    private static final C59071e f379633a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.e");

    /* renamed from: a */
    public static C139655e m227076a(String str, Object obj) {
        return new C139658h(str, obj, Optional.empty());
    }

    /* renamed from: b */
    public abstract Optional mo115142b();

    /* renamed from: c */
    public abstract Object mo115143c();

    /* renamed from: d */
    public abstract String mo115144d();

    /* renamed from: e */
    public abstract boolean mo115145e();

    /* renamed from: f */
    public final void mo115146f(C43968o oVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", mo115144d());
            jSONObject.put("payload", mo115143c());
            jSONObject.put("awaitResponse", mo115145e());
            if (mo115142b().isPresent()) {
                jSONObject.put("requestId", mo115142b().get());
            }
            C46459k.m82829b(oVar.mo46960a(jSONObject.toString()), "Failed to send message", new Object[0]);
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f379633a.mo56226d()).mo56382g(e)).mo56372aa(41392)).mo56386p("Invalid message");
        }
    }
}
