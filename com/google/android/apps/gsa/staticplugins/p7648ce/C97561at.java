package com.google.android.apps.gsa.staticplugins.p7648ce;

import android.webkit.WebView;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.at */
/* compiled from: PG */
final class C97561at extends C90904ba {
    public C97561at() {
        super("enableWebViewDebugging");
    }

    public final void run() {
        C90476a aVar = C91018d.f254254a;
        WebView.setWebContentsDebuggingEnabled(true);
    }
}
