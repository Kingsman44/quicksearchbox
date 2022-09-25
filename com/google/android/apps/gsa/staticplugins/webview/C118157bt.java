package com.google.android.apps.gsa.staticplugins.webview;

import android.app.ActivityManager;
import android.webkit.WebView;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bt */
/* compiled from: PG */
public final /* synthetic */ class C118157bt implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118163bz f327950a;

    public /* synthetic */ C118157bt(C118163bz bzVar) {
        this.f327950a = bzVar;
    }

    public final void run() {
        C118163bz bzVar = this.f327950a;
        ActivityManager activityManager = bzVar.f327960e;
        if (activityManager == null || !((Boolean) Collection.EL.stream(activityManager.getRunningAppProcesses()).filter(new C118158bu(bzVar)).findFirst().map(C118159bv.f327952a).orElse(false)).booleanValue()) {
            if (!bzVar.f327964i.f327954a.isDone()) {
                C118162by byVar = bzVar.f327964i;
                if (byVar.f327955b) {
                    for (C118161bx a : bzVar.f327961f) {
                        a.mo103558a();
                    }
                    return;
                }
                byVar.f327955b = true;
            } else {
                bzVar.f327964i.f327955b = false;
            }
        }
        C118162by byVar2 = bzVar.f327964i;
        WebView webView = bzVar.f327963h;
        SettableFuture settableFuture = new SettableFuture();
        bzVar.mo103565a(webView, settableFuture);
        byVar2.f327954a = settableFuture;
        bzVar.mo103566b();
    }
}
