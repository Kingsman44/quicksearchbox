package com.google.p3723ar.imp.core.web;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: com.google.ar.imp.core.web.ImpWebViewFragment */
/* compiled from: PG */
public final class ImpWebViewFragment extends Fragment {

    /* renamed from: a */
    public ImpWebViewBridge f124158a;

    /* renamed from: b */
    private WebView f124159b;

    /* renamed from: c */
    private long f124160c;

    /* renamed from: d */
    private float f124161d;

    /* renamed from: e */
    private float f124162e;

    /* renamed from: f */
    private int f124163f;

    /* renamed from: g */
    private int f124164g;

    /* renamed from: h */
    private String f124165h;

    /* renamed from: i */
    private String f124166i;

    /* renamed from: j */
    private boolean f124167j;

    public static void deflate(C47971a aVar, long j) {
        FragmentManager a = aVar.mo53077a();
        Fragment c = a.f634a.mo671c(Long.toString(j));
        if (c != null) {
            C0154a aVar2 = new C0154a(a);
            aVar2.mo516m(c);
            aVar2.mo505b(false);
        }
    }

    private static native void nOnDestroyed(long j);

    public void inflate(C47971a aVar, long j, float f, float f2, int i, int i2, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("webViewHandle", j);
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        bundle.putInt("width", i);
        bundle.putInt("height", i2);
        bundle.putString("url", str);
        bundle.putString("injectionScript", str2);
        setArguments(bundle);
        this.f124167j = z;
        C0154a aVar2 = new C0154a(aVar.mo53077a());
        aVar2.mo511h(16908290, this, Long.toString(j), 1);
        aVar2.mo505b(false);
    }

    public void injectScript() {
        this.f124158a.injectScript();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f124160c = arguments.getLong("webViewHandle");
        this.f124161d = arguments.getFloat("x");
        this.f124162e = arguments.getFloat("y");
        this.f124163f = arguments.getInt("width");
        this.f124164g = arguments.getInt("height");
        this.f124165h = arguments.getString("url");
        this.f124166i = arguments.getString("injectionScript");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0167am activity = getActivity();
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebView webView = new WebView(activity);
        webView.setWebViewClient(new C47979i(this));
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSafeBrowsingEnabled(true);
        settings.setUserAgentString("ImpWebView");
        webView.loadUrl(this.f124165h);
        this.f124159b = webView;
        frameLayout.addView(webView, this.f124163f, this.f124164g);
        this.f124159b.setX(this.f124161d);
        this.f124159b.setY(this.f124162e);
        this.f124158a = new ImpWebViewBridge(this.f124160c, this.f124159b, this.f124166i, this.f124167j);
        return frameLayout;
    }

    public final void onDestroyView() {
        ImpWebViewBridge impWebViewBridge = this.f124158a;
        impWebViewBridge.f124157d = true;
        impWebViewBridge.f124156c = null;
        WebView webView = this.f124159b;
        if (webView != null) {
            webView.destroy();
            this.f124159b = null;
        }
        nOnDestroyed(this.f124160c);
        super.onDestroyView();
    }

    public final void onPause() {
        super.onPause();
        this.f124159b.onPause();
        this.f124159b.pauseTimers();
        this.f124158a.f124157d = true;
    }

    public final void onResume() {
        super.onResume();
        this.f124159b.onResume();
        this.f124159b.resumeTimers();
        this.f124158a.f124157d = false;
    }

    public void postMessageToJs(String str) {
        this.f124158a.postMessage(str);
    }
}
