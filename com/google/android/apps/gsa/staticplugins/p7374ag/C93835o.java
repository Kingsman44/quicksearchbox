package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.o */
/* compiled from: PG */
public final /* synthetic */ class C93835o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262090a;

    public /* synthetic */ C93835o(C93809aa aaVar) {
        this.f262090a = aaVar;
    }

    public final Object call() {
        C93809aa aaVar = this.f262090a;
        CookieManager cookieManager = aaVar.f262044j;
        cookieManager.getClass();
        cookieManager.removeAllCookie();
        aaVar.mo88181h((String) null);
        CookieSyncManager cookieSyncManager = aaVar.f262043i;
        cookieSyncManager.getClass();
        cookieSyncManager.sync();
        return C118826c.f331422a;
    }
}
