package com.google.apps.tiktok.tracing.contrib.p3685a.p3695e;

import android.webkit.WebView;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44477r;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.e.b */
/* compiled from: PG */
public final /* synthetic */ class C47605b implements WebView.FindListener {

    /* renamed from: a */
    public final /* synthetic */ C47606c f123529a;

    /* renamed from: b */
    public final /* synthetic */ WebView.FindListener f123530b;

    public /* synthetic */ C47605b(C47606c cVar, WebView.FindListener findListener) {
        this.f123529a = cVar;
        this.f123530b = findListener;
    }

    public final void onFindResultReceived(int i, int i2, boolean z) {
        C47606c cVar = this.f123529a;
        WebView.FindListener findListener = this.f123530b;
        if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a("onFindResultReceived");
            try {
                ((C44477r) findListener).f115625a.mo46540a(i2, i);
                a.close();
                return;
            } catch (Throwable th) {
                C47604a.m84696a(th, th);
            }
        } else {
            C47538ax c = cVar.f123531a.mo51613c("onFindResultReceived");
            try {
                ((C44477r) findListener).f115625a.mo46540a(i2, i);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47604a.m84696a(th, th2);
            }
        }
        throw th;
        throw th;
    }
}
