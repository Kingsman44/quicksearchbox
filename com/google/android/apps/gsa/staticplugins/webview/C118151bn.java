package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bn */
/* compiled from: PG */
final class C118151bn implements C90991b {

    /* renamed from: a */
    final /* synthetic */ C118152bo f327919a;

    public C118151bn(C118152bo boVar) {
        this.f327919a = boVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GsaWebViewPool");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Used WebView Map");
        synchronized (this.f327919a.f327928g) {
            for (int i = 0; i < this.f327919a.f327929h.size(); i++) {
                e.mo85289p(String.format("Key: %s", new Object[]{Long.valueOf(this.f327919a.f327929h.keyAt(i))}), (C90991b) this.f327919a.f327929h.valueAt(i));
            }
        }
        C91006f e2 = fVar.mo85281e((Object) null);
        e2.mo85291r("Gsa Simple WebView Map");
        synchronized (this.f327919a.f327930i) {
            for (Map.Entry entry : this.f327919a.f327931j.entrySet()) {
                e2.mo85288o(String.format("Key: %s", new Object[]{entry.getKey()}), new C118150bm(entry));
            }
        }
    }
}
