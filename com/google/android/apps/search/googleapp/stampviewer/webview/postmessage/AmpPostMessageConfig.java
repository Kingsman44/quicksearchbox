package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.common.p4522b.C58485gu;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* compiled from: PG */
public abstract class AmpPostMessageConfig implements PostMessageConfig {

    /* renamed from: b */
    public static final C43775a f379611b = new C43775a("AMP_WEBX");

    /* renamed from: a */
    public final C43775a mo42598a() {
        return f379611b;
    }

    /* renamed from: b */
    public final C58485gu mo42599b() {
        return C58485gu.m89846n(true != mo115129f() ? "https://*.cdn.ampproject.org" : "*");
    }

    /* renamed from: c */
    public final /* synthetic */ Optional mo42600c() {
        return Optional.empty();
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo42601d(JSONObject jSONObject) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo42602e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo115129f();
}
