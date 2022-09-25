package com.google.android.libraries.accountlinking.p10974a;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.accountlinking.a.c */
/* compiled from: PG */
public class C147362c extends Fragment {

    /* renamed from: a */
    public static final C58528ij f397786a = C58528ij.m90012L("https://myaccount.google.com/embedded/accountlinking/info", "https://myaccount.google.com/embedded/accountlinking/usagenotice", "https://myaccount.google.com/embedded/accountlinking/create");

    /* renamed from: b */
    public static final C58528ij f397787b = C58528ij.m90015O("https://myaccount.google.com/", "https://play.google.com/", "https://www.gstatic.com/", "https://fonts.gstatic.com/", "https://encrypted-tbn0.gstatic.com/", "https://encrypted-tbn1.gstatic.com/", "https://encrypted-tbn2.gstatic.com/", "https://encrypted-tbn3.gstatic.com/", "https://lh3.googleusercontent.com/", "https://lh4.googleusercontent.com/", "https://lh5.googleusercontent.com/", "https://lh6.googleusercontent.com/", "https://play-lh.googleusercontent.com/");

    /* renamed from: c */
    public static final Pattern f397788c = Pattern.compile("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|ico))$)", 2);

    /* renamed from: d */
    public WebView f397789d;

    static {
        C58974d.m91134h("GAL");
    }

    /* renamed from: c */
    public static final String m240270c(String str) {
        return Uri.parse(str).buildUpon().appendQueryParameter("color_scheme", "dark").build().toString();
    }

    /* renamed from: a */
    public void mo124126a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo124127b(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo124128d() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.base_fragment_full_screen, viewGroup, false);
        WebView webView = (WebView) inflate.findViewById(R.id.webView);
        this.f397789d = webView;
        webView.setFocusable(true);
        this.f397789d.setFocusableInTouchMode(true);
        this.f397789d.setMapTrackballToArrowKeys(false);
        WebSettings settings = this.f397789d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        settings.setDisabledActionModeMenuItems(7);
        this.f397789d.setWebViewClient(new C147353b(this));
        this.f397789d.setOnKeyListener(new C147350a(this));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f397789d;
        if (webView != null) {
            webView.stopLoading();
            this.f397789d.destroy();
        }
    }
}
