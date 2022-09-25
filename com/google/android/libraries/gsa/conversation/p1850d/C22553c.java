package com.google.android.libraries.gsa.conversation.p1850d;

import android.util.Pair;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.conversation.d.c */
/* compiled from: PG */
public final /* synthetic */ class C22553c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22559i f62166a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f62167b;

    /* renamed from: c */
    public final /* synthetic */ String f62168c;

    /* renamed from: d */
    public final /* synthetic */ long f62169d;

    public /* synthetic */ C22553c(C22559i iVar, SettableFuture settableFuture, String str, long j) {
        this.f62166a = iVar;
        this.f62167b = settableFuture;
        this.f62168c = str;
        this.f62169d = j;
    }

    public final void run() {
        C22559i iVar = this.f62166a;
        SettableFuture settableFuture = this.f62167b;
        String str = this.f62168c;
        long j = this.f62169d;
        if (iVar.f62185f.get()) {
            iVar.f62188i = C58836b.f156633a;
            try {
                WebView webView = (WebView) iVar.f62187h.mo56107c();
                webView.getClass();
                webView.evaluateJavascript(str, new C22551a(iVar, j, settableFuture));
            } catch (Exception e) {
                C59104x c = C22559i.f62180a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "JavascriptRunner");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48319)).mo56386p("Failed to evaluate Javascript");
                settableFuture.mo57356n(Pair.create(BuildConfig.FLAVOR, C58833ax.m90834k("Failed to evaluate Javascript: ".concat(String.valueOf(e.getMessage())))));
            }
        } else {
            settableFuture.mo57356n(Pair.create(BuildConfig.FLAVOR, C58833ax.m90834k("WebView not initialized")));
        }
    }
}
