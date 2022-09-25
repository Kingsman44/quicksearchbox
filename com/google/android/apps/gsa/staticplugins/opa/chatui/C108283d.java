package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.webkit.WebResourceResponse;
import androidx.p201w.C4368l;
import java.io.ByteArrayInputStream;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.d */
/* compiled from: PG */
final class C108283d implements C4368l {

    /* renamed from: a */
    private final String f301236a;

    public C108283d(String str) {
        this.f301236a = str;
    }

    /* renamed from: a */
    public final WebResourceResponse mo9290a(String str) {
        return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(this.f301236a.getBytes(StandardCharsets.UTF_8)));
    }
}
