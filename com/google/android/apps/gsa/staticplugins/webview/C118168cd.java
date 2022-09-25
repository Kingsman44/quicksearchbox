package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.webview.C87277w;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cd */
/* compiled from: PG */
public final class C118168cd {

    /* renamed from: a */
    private static final C59071e f328033a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.cd");

    /* renamed from: b */
    private final C89688a f328034b;

    /* renamed from: c */
    private final C22871g f328035c;

    /* renamed from: d */
    private final C87277w f328036d;

    /* renamed from: e */
    private final C69464a f328037e;

    public C118168cd(C89688a aVar, C87277w wVar, C22871g gVar, C69464a aVar2) {
        this.f328034b = aVar;
        this.f328035c = gVar;
        this.f328036d = wVar;
        this.f328037e = aVar2;
    }

    @JavascriptInterface
    public C118166cb loadJsInterface(String str, String str2) {
        if (!this.f328036d.mo80921a()) {
            ((C59052c) ((C59052c) f328033a.mo56225c()).mo56372aa(33836)).mo56386p("Javascript context not trusted.");
            return null;
        }
        C118166cb cbVar = new C118166cb(this.f328034b, this.f328035c);
        if (!str.equals("call") || !str2.equals("direct_call")) {
            cbVar.mo17910gl(new IllegalStateException(String.format("JavaScriptObject not found: %s.%s", new Object[]{str, str2})));
        } else {
            cbVar.mo17911gm(this.f328037e.mo17428b());
        }
        return cbVar;
    }
}
