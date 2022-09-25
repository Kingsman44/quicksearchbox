package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.t */
/* compiled from: PG */
public final /* synthetic */ class C93840t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262098a;

    public /* synthetic */ C93840t(C93809aa aaVar) {
        this.f262098a = aaVar;
    }

    public final Object call() {
        C93809aa aaVar = this.f262098a;
        CookieSyncManager.createInstance((Context) aaVar.f262036b.mo27525b());
        aaVar.f262043i = CookieSyncManager.getInstance();
        C90476a aVar = C91018d.f254254a;
        aaVar.f262044j = CookieManager.getInstance();
        return C118826c.f331422a;
    }
}
