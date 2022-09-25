package com.google.android.apps.gsa.staticplugins.webview;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.C87266l;
import com.google.android.apps.gsa.search.core.webview.C87273s;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.webview.common.C118180a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.t */
/* compiled from: PG */
public final class C118263t extends C118180a {

    /* renamed from: d */
    private static final C59071e f328312d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.t");

    /* renamed from: a */
    public final C87266l f328313a;

    /* renamed from: b */
    public volatile long f328314b = Query.f252741b.f252749G;

    /* renamed from: e */
    private final C87278x f328315e;

    /* renamed from: f */
    private final C22871g f328316f;

    /* renamed from: g */
    private final C68214a f328317g;

    /* renamed from: h */
    private final C118189cw f328318h;

    /* renamed from: i */
    private final C118191cy f328319i;

    /* renamed from: j */
    private final C87273s f328320j;

    public C118263t(C22871g gVar, C68214a aVar, C118189cw cwVar, C118191cy cyVar, C87273s sVar, C87278x xVar, C87266l lVar) {
        xVar.getClass();
        this.f328315e = xVar;
        gVar.getClass();
        this.f328316f = gVar;
        aVar.getClass();
        this.f328317g = aVar;
        this.f328313a = lVar;
        this.f328318h = cwVar;
        this.f328319i = cyVar;
        this.f328320j = sVar;
    }

    public final void onCloseWindow(WebView webView) {
        ((C59052c) ((C59052c) f328312d.mo56225c()).mo56372aa(33744)).mo56386p("onCloseWindow");
        ((C89911f) this.f328317g.mo27525b()).mo83755a((Throwable) null, 18554572, 29).mo83721a();
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Level level;
        int i = C118262s.f328311a[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            level = i != 2 ? Level.FINE : Level.WARNING;
        } else {
            level = Level.SEVERE;
        }
        if (level.equals(Level.SEVERE)) {
            C87278x xVar = this.f328315e;
            ((C59052c) f328312d.mo56223a(level).mo56372aa(33749)).mo56361N("WebView=%s, Url=%s, Source=%s, Line=%d, Message=%s", xVar, xVar.f235736a.getUrl(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
        }
        return true;
    }

    public final void onGeolocationPermissionsHidePrompt() {
        this.f328320j.f235728d = null;
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f328320j.mo80920b(str, callback);
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        List asList = Arrays.asList(permissionRequest.getResources());
        String url = this.f328315e.f235736a.getUrl();
        ArrayList arrayList = new ArrayList();
        if (asList.contains("android.webkit.resource.AUDIO_CAPTURE")) {
            C118191cy cyVar = this.f328319i;
            String fragment = Uri.parse(url).getFragment();
            if (fragment == null || !fragment.contains("agsawvar")) {
                C58976aa aaVar = C58975e.f156826a;
            } else if (!cyVar.f328125a.f254356c.mo85346a("android.permission.RECORD_AUDIO")) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                arrayList.add("android.webkit.resource.AUDIO_CAPTURE");
            }
        }
        permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (!"about:blank".equals(webView.getUrl())) {
            this.f328316f.mo28212l("SrpWebClientCallbacks#onProgressChanged", new C118261r(this, i));
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        C118189cw cwVar = this.f328318h;
        ValueCallback valueCallback2 = cwVar.f328121f;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue((Object) null);
        }
        cwVar.f328121f = valueCallback;
        cwVar.f328122g = fileChooserParams;
        ArrayList arrayList = new ArrayList();
        if (cwVar.mo103649b()) {
            strArr = cwVar.f328120e;
        } else {
            strArr = C118189cw.f328117b;
        }
        for (String str : strArr) {
            if (cwVar.f328118c.checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            cwVar.mo103648a(true, true);
        } else {
            cwVar.f328119d.mo81047ju((String[]) arrayList.toArray(new String[arrayList.size()]), 13, new C118188cv(cwVar));
        }
        return true;
    }
}
