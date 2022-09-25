package com.google.android.libraries.assistant.p1528m.p1529a;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58851bo;
import com.google.common.p4525e.C58967o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.assistant.m.a.p */
/* compiled from: PG */
public final class C18431p {

    /* renamed from: a */
    public static final C59071e f52308a = C59071e.m91332i("com.google.android.libraries.assistant.m.a.p");

    /* renamed from: n */
    private static final WebChromeClient f52309n = new C18419d();

    /* renamed from: b */
    public final WebView f52310b;

    /* renamed from: c */
    public final Handler f52311c;

    /* renamed from: d */
    public final C18421f f52312d;

    /* renamed from: e */
    public final double f52313e;

    /* renamed from: f */
    public final C63037fb f52314f;

    /* renamed from: g */
    public final C63037fb f52315g;

    /* renamed from: h */
    public final Map f52316h = new LinkedHashMap();

    /* renamed from: i */
    public final Random f52317i = new Random();

    /* renamed from: j */
    public final String f52318j;

    /* renamed from: k */
    public final long f52319k;

    /* renamed from: l */
    public C18429n f52320l = new C18429n(this);

    /* renamed from: m */
    public int f52321m = 2;

    /* renamed from: o */
    private final WebViewClient f52322o;

    public C18431p(WebView webView, Context context, C18421f fVar, C18424i iVar, long j) {
        this.f52310b = webView;
        this.f52312d = fVar;
        this.f52313e = iVar.mo23909a();
        this.f52314f = iVar.mo23912d();
        this.f52315g = iVar.mo23911c();
        this.f52319k = j;
        C18420e eVar = new C18420e(this, iVar.mo23910b(), fVar);
        this.f52322o = eVar;
        this.f52311c = new Handler(context.getMainLooper());
        byte[] bArr = new byte[16];
        C58851bo.f156650b.nextBytes(bArr);
        this.f52318j = C59326i.f157517e.mo56837l(bArr, 16);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(false);
        settings.setDefaultTextEncodingName(StandardCharsets.UTF_8.name());
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        settings.setSupportMultipleWindows(false);
        settings.setSavePassword(false);
        webView.setWebViewClient(eVar);
        webView.setWebChromeClient(f52309n);
        webView.addJavascriptInterface(this, "immersiveCanvasBridge");
    }

    /* renamed from: a */
    public static Object m35888a(C63037fb fbVar) {
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        fbVar.getClass();
        gaVar.f170182b = fbVar;
        gaVar.f170181a = 5;
        return m35889b((C63063ga) fyVar.build());
    }

    /* renamed from: b */
    static Object m35889b(C63063ga gaVar) {
        int i;
        if (!(gaVar == null || (i = gaVar.f170181a) == 1)) {
            if (i == 2) {
                return Double.valueOf(((Double) gaVar.f170182b).doubleValue());
            }
            if (i == 3) {
                return (String) gaVar.f170182b;
            }
            if (i == 4) {
                return Boolean.valueOf(((Boolean) gaVar.f170182b).booleanValue());
            }
            if (i == 5) {
                Map unmodifiableMap = Collections.unmodifiableMap(((C63037fb) gaVar.f170182b).f170146a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : unmodifiableMap.keySet()) {
                    Object b = m35889b((C63063ga) unmodifiableMap.get(str));
                    if (b != null) {
                        linkedHashMap.put(str, b);
                    }
                }
                return new JSONObject(linkedHashMap);
            } else if (i == 6) {
                C62971cq<C63063ga> cqVar = ((C62988dg) gaVar.f170182b).f170045a;
                ArrayList arrayList = new ArrayList();
                for (C63063ga b2 : cqVar) {
                    Object b3 = m35889b(b2);
                    if (b3 != null) {
                        arrayList.add(b3);
                    }
                }
                return new JSONArray(arrayList);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m35890d(String str) {
        if (str == null) {
            return "null";
        }
        String a = C58967o.f156822c.mo56216a(str);
        return "'" + a + "'";
    }

    /* renamed from: o */
    public static String m35891o(int i) {
        C18422g gVar = C18422g.NO_CONTENT;
        int i2 = i - 1;
        if (i2 == 1) {
            return "PAUSE";
        }
        if (i2 == 2) {
            return "RESUME";
        }
        if (i2 == 3) {
            return "NEXT";
        }
        if (i2 != 4) {
            return i2 != 5 ? "UNKNOWN_COMMAND" : "SEEK";
        }
        return "PREVIOUS";
    }

    /* renamed from: p */
    private final boolean m35892p(String str) {
        boolean equals = str.equals(this.f52318j);
        if (!equals) {
            String str2 = this.f52318j;
            mo23960f("Invalid token (" + str + ") does not match expected token (" + str2 + ")");
        }
        return equals;
    }

    /* renamed from: c */
    public final String mo23953c(String str, Object... objArr) {
        return MessageFormat.format("{0}.{1}({2});", new Object[]{this.f52320l.f52295c, str, TextUtils.join(", ", objArr)});
    }

    @JavascriptInterface
    public void clearExpectation(String str, boolean z, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23925a(z, str2);
        }
    }

    /* renamed from: e */
    public final void mo23955e() {
        for (C18427l a : this.f52316h.values()) {
            a.mo23947a(false);
        }
        this.f52316h.clear();
    }

    @JavascriptInterface
    public void enterContinuousMatchMode(String str, String[] strArr, int i, boolean z) {
        if (m35892p(str)) {
            this.f52312d.mo23926b(strArr, i, z);
        }
    }

    @JavascriptInterface
    public void exitApp(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23927c(str2);
        }
    }

    @JavascriptInterface
    public void exitContinuousMatchMode(String str) {
        if (m35892p(str)) {
            this.f52321m = 3;
            this.f52312d.mo23928d();
        }
    }

    @JavascriptInterface
    public void expectIntent(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23929e(str2);
        }
    }

    /* renamed from: f */
    public final void mo23960f(String str) {
        ((C59052c) ((C59052c) f52308a.mo56225c()).mo56372aa(47310)).mo56389s("Closing Immersive Canvas app because of error: %s", str);
        this.f52312d.mo23927c(BuildConfig.FLAVOR);
    }

    /* renamed from: g */
    public final void mo23961g(String str, C18430o oVar, String str2, String str3) {
        if (this.f52320l.mo23950a() != C18422g.LOADED) {
            ((C59052c) ((C59052c) f52308a.mo56225c()).mo56372aa(47316)).mo56386p("Page content not loaded.");
            return;
        }
        this.f52310b.evaluateJavascript(mo23953c("sendSetUserParamStatus", m35890d(str), m35890d(oVar.name()), m35890d(str2), m35890d(str3)), (ValueCallback) null);
    }

    @JavascriptInterface
    public void getUserParam(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23930f(str2);
        }
    }

    /* renamed from: h */
    public final void mo23963h(String str) {
        this.f52310b.evaluateJavascript(mo23953c("onTtsMark", m35890d(str)), (ValueCallback) null);
    }

    @JavascriptInterface
    public void handleCanvasWakeLockMessage(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23944t(str2);
        }
    }

    /* renamed from: i */
    public final void mo23965i() {
        this.f52320l.mo23951b(false);
        this.f52320l = new C18429n(this);
        mo23955e();
    }

    /* renamed from: j */
    public final void mo23966j(boolean z) {
        this.f52310b.setFocusable(z);
        this.f52310b.setFocusableInTouchMode(z);
    }

    /* renamed from: k */
    public final void mo23967k(boolean z) {
        this.f52310b.getSettings().setMixedContentMode(z ^ true ? 1 : 0);
    }

    /* renamed from: l */
    public final void mo23968l(int i) {
        if (this.f52320l.mo23950a() != C18422g.LOADED) {
            ((C59052c) ((C59052c) f52308a.mo56225c()).mo56372aa(47314)).mo56386p("Page content not loaded.");
        } else if (i == 2) {
            WebView webView = this.f52310b;
            Object[] objArr = new Object[2];
            objArr[0] = 1;
            int i2 = this.f52321m;
            String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "STREAMING_MODE_TIMEOUT" : "STREAMING_MODE_WEB_APP_EXIT" : "STREAMING_MODE_USER_EXIT" : "UNKNOWN_REASON";
            if (i2 != 0) {
                objArr[1] = m35890d(str);
                webView.evaluateJavascript(mo23953c("onMicModeUpdate", objArr), (ValueCallback) null);
                return;
            }
            throw null;
        } else {
            this.f52310b.evaluateJavascript(mo23953c("onMicModeUpdate", 2), (ValueCallback) null);
            this.f52321m = 2;
        }
    }

    @JavascriptInterface
    public void logJsRuntimeError(String str, String str2, String str3, int i, int i2) {
        this.f52312d.mo23932h(str2, str3, i, i2);
    }

    /* renamed from: m */
    public final void mo23970m(String str, int i) {
        if (this.f52320l.mo23950a() == C18422g.LOADED) {
            WebView webView = this.f52310b;
            Object[] objArr = new Object[2];
            objArr[0] = m35890d(str);
            objArr[1] = m35890d(i != 2 ? i != 3 ? "BLOCKED" : "MARK" : "END");
            webView.evaluateJavascript(mo23953c("onOutputTtsStatus", objArr), (ValueCallback) null);
        }
    }

    /* renamed from: n */
    public final void mo23971n(int i) {
        if (this.f52320l.mo23950a() != C18422g.LOADED) {
            ((C59052c) ((C59052c) f52308a.mo56225c()).mo56372aa(47319)).mo56386p("Page content not loaded.");
            return;
        }
        this.f52310b.evaluateJavascript(mo23953c("onUserInteraction", Integer.valueOf(i - 1)), (ValueCallback) null);
    }

    @JavascriptInterface
    public void onLoad(String str, String str2) {
        if (m35892p(str)) {
            this.f52311c.post(new C18418c(this, str2));
        }
    }

    @JavascriptInterface
    public void onStateUpdate(String str, String str2) {
        if (m35892p(str) && str2.length() <= 50000) {
            this.f52312d.mo23933i(str2);
        }
    }

    @JavascriptInterface
    public void onUpdateDone(String str, String str2) {
        if (m35892p(str)) {
            this.f52311c.post(new C18417b(this, str2));
        }
    }

    @JavascriptInterface
    public void outputTts(String str, String str2, String str3, boolean z) {
        if (m35892p(str)) {
            this.f52312d.mo23935k(str2, str3, z);
        }
    }

    @JavascriptInterface
    public void resetTypeOverrides(String str) {
        if (m35892p(str)) {
            this.f52312d.mo23936l();
        }
    }

    @JavascriptInterface
    public void resetUserParams(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23937m(str2);
        }
    }

    @JavascriptInterface
    public void sendTextQueryWithToken(String str, String str2) {
        if (m35892p(str) && str2.length() <= 640) {
            this.f52312d.mo23938n(str2);
        }
    }

    @JavascriptInterface
    public void setTypeOverride(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23939o(str2);
        }
    }

    @JavascriptInterface
    public void setUserParam(String str, String str2, String str3, String str4) {
        if (m35892p(str)) {
            this.f52312d.mo23940p(str2, str3, str4);
        }
    }

    @JavascriptInterface
    public void startMediaSession(String str) {
        if (m35892p(str)) {
            this.f52312d.mo23941q();
        }
    }

    @JavascriptInterface
    public void stopMediaSession(String str) {
        if (m35892p(str)) {
            this.f52312d.mo23942r();
        }
    }

    @JavascriptInterface
    public void stopTts(String str) {
        if (m35892p(str)) {
            this.f52312d.mo23943s();
        }
    }

    @JavascriptInterface
    public void triggerScene(String str, String str2) {
        if (m35892p(str)) {
            this.f52312d.mo23945u(str2);
        }
    }
}
