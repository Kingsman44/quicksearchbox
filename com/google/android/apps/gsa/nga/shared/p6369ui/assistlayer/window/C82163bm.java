package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.view.Window;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.bm */
/* compiled from: PG */
public final /* synthetic */ class C82163bm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ Window f224583a;

    public /* synthetic */ C82163bm(Window window) {
        this.f224583a = window;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Window window = this.f224583a;
        Boolean bool = (Boolean) obj;
        window.addFlags(true != C1888a.m5150d() ? 4980768 : 7077920);
        window.clearFlags(134217728);
        window.setNavigationBarColor(0);
        window.setNavigationBarContrastEnforced(false);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        if (bool.booleanValue()) {
            window.clearFlags(8);
        } else {
            window.addFlags(8);
        }
    }
}
