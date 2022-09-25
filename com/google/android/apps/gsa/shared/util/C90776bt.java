package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.util.bt */
/* compiled from: PG */
public final class C90776bt {

    /* renamed from: a */
    private static final AtomicBoolean f253867a = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m148327a() {
        f253867a.set(true);
    }

    /* renamed from: b */
    public static WebView m148328b(Context context) {
        C90476a aVar = C91018d.f254254a;
        WebView webView = new WebView(context, (AttributeSet) null, 0);
        m148327a();
        return webView;
    }

    /* renamed from: c */
    public static void m148329c(C91006f fVar, WebView webView) {
        String str;
        fVar.mo85291r("WebView");
        if (webView == null) {
            fVar.mo85292s(C90752i.m148229c((CharSequence) null));
            return;
        }
        fVar.mo85279c("toString").mo85276a(C90752i.m148229c(webView.toString()));
        C91005e c = fVar.mo85279c("visibility");
        int visibility = webView.getVisibility();
        if (visibility == 0) {
            str = "VISIBLE";
        } else if (visibility == 4) {
            str = "INVISIBLE";
        } else if (visibility != 8) {
            str = "UNDEFINED[" + visibility + "]";
        } else {
            str = "GONE";
        }
        c.mo85276a(C90752i.m148229c(str));
        fVar.mo85279c("Content height").mo85276a(C90752i.m148229c(String.valueOf(webView.getContentHeight())));
        fVar.mo85279c("Visual X").mo85276a(C90752i.m148229c(String.valueOf(webView.getX())));
        fVar.mo85279c("Visual Y").mo85276a(C90752i.m148229c(String.valueOf(webView.getY())));
        fVar.mo85279c("Translation X").mo85276a(C90752i.m148229c(String.valueOf(webView.getTranslationX())));
        fVar.mo85279c("Translation Y").mo85276a(C90752i.m148229c(String.valueOf(webView.getTranslationY())));
        fVar.mo85279c("Scroll X").mo85276a(C90752i.m148229c(String.valueOf(webView.getScrollX())));
        fVar.mo85279c("Scroll Y").mo85276a(C90752i.m148229c(String.valueOf(webView.getScrollY())));
        fVar.mo85279c("Scale X").mo85276a(C90752i.m148229c(String.valueOf(webView.getScaleX())));
        fVar.mo85279c("Scale Y").mo85276a(C90752i.m148229c(String.valueOf(webView.getScaleY())));
        fVar.mo85279c("Height").mo85276a(C90752i.m148229c(String.valueOf(webView.getHeight())));
        fVar.mo85279c("Width").mo85276a(C90752i.m148229c(String.valueOf(webView.getWidth())));
        boolean z = true;
        if (webView.getTranslationX() > ((float) (-webView.getWidth())) && webView.getTranslationY() > ((float) (-webView.getHeight()))) {
            z = false;
        }
        fVar.mo85279c("translated off screen").mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        fVar.mo85279c("layout params").mo85276a(C90752i.m148229c(String.valueOf(layoutParams)));
        if (layoutParams != null) {
            fVar.mo85279c("layout params height").mo85276a(C90752i.m148229c(String.valueOf(webView.getLayoutParams().height)));
            fVar.mo85279c("layout params width").mo85276a(C90752i.m148229c(String.valueOf(webView.getLayoutParams().width)));
        }
    }
}
