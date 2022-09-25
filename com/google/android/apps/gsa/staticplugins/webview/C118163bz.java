package com.google.android.apps.gsa.staticplugins.webview;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.webkit.WebView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bz */
/* compiled from: PG */
public final class C118163bz {

    /* renamed from: a */
    public static final C59071e f327956a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.bz");

    /* renamed from: b */
    public final C22871g f327957b;

    /* renamed from: c */
    public final Context f327958c;

    /* renamed from: d */
    public final int f327959d;

    /* renamed from: e */
    public final ActivityManager f327960e;

    /* renamed from: f */
    public final List f327961f = new ArrayList();

    /* renamed from: g */
    public final AtomicBoolean f327962g = new AtomicBoolean();

    /* renamed from: h */
    public WebView f327963h;

    /* renamed from: i */
    public final C118162by f327964i = new C118162by();

    /* renamed from: j */
    private int f327965j = 0;

    public C118163bz(C22871g gVar, Context context) {
        this.f327957b = gVar;
        this.f327958c = context;
        this.f327959d = Process.myPid();
        this.f327960e = (ActivityManager) context.getSystemService("activity");
    }

    /* renamed from: a */
    public final void mo103565a(WebView webView, SettableFuture settableFuture) {
        try {
            webView.evaluateJavascript("0", new C118160bw(settableFuture));
            this.f327965j++;
        } catch (IllegalStateException | NoSuchMethodError unused) {
            webView.loadUrl("javascript:0");
        }
    }

    /* renamed from: b */
    public final void mo103566b() {
        this.f327957b.mo28213m("JS watchdog task", 60000, new C118157bt(this));
    }
}
