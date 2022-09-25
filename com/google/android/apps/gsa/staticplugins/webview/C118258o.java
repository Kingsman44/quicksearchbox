package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.o */
/* compiled from: PG */
public final class C118258o {

    /* renamed from: a */
    public static final C59071e f328299a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.o");

    /* renamed from: b */
    public static final Pattern f328300b = Pattern.compile("^/customfonts/googlesans/([0-9]+).woff2$");

    /* renamed from: c */
    public final Context f328301c;

    /* renamed from: d */
    public final C118256m f328302d;

    /* renamed from: e */
    public final C118251h f328303e;

    public C118258o(Context context, C118256m mVar, C118251h hVar) {
        this.f328301c = context;
        this.f328302d = mVar;
        this.f328303e = hVar;
    }

    /* renamed from: a */
    public static WebResourceResponse m196417a(C63088z zVar) {
        WebResourceResponse webResourceResponse = new WebResourceResponse("font/woff2", (String) null, zVar.mo59041m());
        webResourceResponse.setResponseHeaders(C58495hd.m89900n("Access-Control-Allow-Origin", "*"));
        return webResourceResponse;
    }
}
