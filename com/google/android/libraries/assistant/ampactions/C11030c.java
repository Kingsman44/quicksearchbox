package com.google.android.libraries.assistant.ampactions;

import android.util.Log;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.ampactions.c */
/* compiled from: PG */
public final class C11030c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ acy f36240a;

    /* renamed from: b */
    final /* synthetic */ String f36241b;

    /* renamed from: c */
    final /* synthetic */ C11031d f36242c;

    public C11030c(C11031d dVar, acy acy, String str) {
        this.f36242c = dVar;
        this.f36240a = acy;
        this.f36241b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.d("AmpActions", "Prerendering was not successful for: ".concat(String.valueOf(this.f36241b)));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        AmpWebView ampWebView = (AmpWebView) obj;
        ampWebView.f36228a.onPause();
        ampWebView.mo19490a(this.f36240a, this.f36242c.f36244b.mo92017a());
        Log.d("AmpActions", "WebView created successfully for: ".concat(String.valueOf(this.f36241b)));
    }
}
