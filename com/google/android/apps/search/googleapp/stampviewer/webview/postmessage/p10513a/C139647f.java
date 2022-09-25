package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139354j;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.f */
/* compiled from: PG */
public final class C139647f implements C139642a {

    /* renamed from: a */
    private static final C59071e f379621a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.f");

    /* renamed from: b */
    private final Fragment f379622b;

    public C139647f(Fragment fragment) {
        this.f379622b = fragment;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_load_failed_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "loadFailed";
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        C47393f.m84236g(new C139354j(), this.f379622b);
        ((C59052c) ((C59052c) f379621a.mo56226d()).mo56372aa(41399)).mo56386p("load failed message received");
    }

    /* renamed from: d */
    public final boolean mo115141d() {
        return false;
    }
}
