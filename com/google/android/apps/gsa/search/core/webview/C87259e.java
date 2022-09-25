package com.google.android.apps.gsa.search.core.webview;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.webview.e */
/* compiled from: PG */
public final class C87259e extends C87260f {

    /* renamed from: b */
    private final String f235711b;

    public C87259e(String str) {
        this.f235711b = str;
    }

    /* renamed from: a */
    public final C60870cx mo80875a() {
        C59104x c = C87260f.f235712a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "JavaScriptTimeoutHandle");
        ((C59052c) ((C59052c) c).mo56372aa(9514)).mo56389s("Stuck JavaScript detected in %s", this.f235711b);
        return C118826c.f331423b;
    }
}
