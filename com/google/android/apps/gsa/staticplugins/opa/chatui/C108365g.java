package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.p201w.C4366j;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.p3926e.C51840ba;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.g */
/* compiled from: PG */
public final class C108365g extends C108232bc {

    /* renamed from: a */
    private final String f301412a;

    public C108365g(C51840ba baVar) {
        super((byte[]) null);
        this.f301412a = baVar.f135996a;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 139623;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 35;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar == null) {
            return null;
        }
        jVar.mo33795i(5);
        return C28293k.m52908e(this.f301030l, new C28293k[0]);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        WebView webView = blVar.f301066P;
        FrameLayout frameLayout = blVar.f301067Q;
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        ArrayList arrayList = new ArrayList();
        C4366j.m12516a("/assets/", new C108283d(this.f301412a), arrayList);
        webView.setWebViewClient(new C108310e(C4366j.m12517b(arrayList)));
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setJavaScriptEnabled(true);
        webView.loadUrl("https://appassets.androidplatform.net/assets/www/amaunique.html");
        webView.addJavascriptInterface(new C108338f(frameLayout), "adWebViewInterface");
        blVar.setIsRecyclable(false);
    }
}
