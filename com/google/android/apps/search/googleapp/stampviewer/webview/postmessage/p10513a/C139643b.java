package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139347c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.b */
/* compiled from: PG */
public final class C139643b implements C139642a {

    /* renamed from: a */
    private static final C59071e f379612a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.b");

    /* renamed from: b */
    private final Fragment f379613b;

    /* renamed from: c */
    private final boolean f379614c;

    public C139643b(Fragment fragment, boolean z) {
        this.f379613b = fragment;
        this.f379614c = z;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_document_loaded_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "documentLoaded";
    }

    /* renamed from: d */
    public final boolean mo115141d() {
        return false;
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        boolean z2 = true;
        if (this.f379614c && !(z2 = jSONObject.optBoolean("isStory", true))) {
            ((C59052c) ((C59052c) f379612a.mo56225c()).mo56372aa(41393)).mo56386p("Non-Stamp loaded in the StampViewer");
        }
        C47393f.m84236g(new C139347c(z2), this.f379613b);
    }
}
