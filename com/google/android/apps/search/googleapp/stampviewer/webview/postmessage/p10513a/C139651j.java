package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139359o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import org.json.JSONObject;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.j */
/* compiled from: PG */
public final class C139651j implements C139642a {

    /* renamed from: a */
    private final Fragment f379628a;

    public C139651j(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f379628a = fragment;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_story_preview_finished_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "storyPreviewFinished";
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        C69664n.m101061g(optional, "responseSender");
        C47393f.m84236g(C139359o.f378973a, this.f379628a);
    }

    /* renamed from: d */
    public final boolean mo115141d() {
        return false;
    }
}
