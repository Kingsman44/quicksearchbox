package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139350f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.h */
/* compiled from: PG */
public final class C139649h implements C139642a {

    /* renamed from: a */
    private static final C59071e f379625a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.h");

    /* renamed from: b */
    private final Fragment f379626b;

    public C139649h(Fragment fragment) {
        this.f379626b = fragment;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_select_document_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "selectDocument";
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        boolean optBoolean = jSONObject.optBoolean("next", false);
        boolean optBoolean2 = jSONObject.optBoolean("previous", false);
        String optString = jSONObject.optString("advancementMode");
        if (optString.isEmpty()) {
            ((C59052c) ((C59052c) f379625a.mo56225c()).mo56372aa(41403)).mo56386p("Missing advancementMode in SelectDocumentMessage.");
            return;
        }
        boolean startsWith = optString.startsWith("autoAdvance");
        if (optBoolean2 ^ optBoolean) {
            C47393f.m84236g(new C139350f(optBoolean, startsWith), this.f379626b);
        } else {
            ((C59052c) ((C59052c) f379625a.mo56225c()).mo56372aa(41402)).mo56386p("Invalid message");
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo115141d() {
        return true;
    }
}
