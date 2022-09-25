package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.webkit.CookieManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.n */
/* compiled from: PG */
public final /* synthetic */ class C93834n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262087a;

    /* renamed from: b */
    public final /* synthetic */ List f262088b;

    /* renamed from: c */
    public final /* synthetic */ String f262089c;

    public /* synthetic */ C93834n(C93809aa aaVar, List list, String str) {
        this.f262087a = aaVar;
        this.f262088b = list;
        this.f262089c = str;
    }

    public final Object call() {
        C93809aa aaVar = this.f262087a;
        List<String> list = this.f262088b;
        String str = this.f262089c;
        for (String cookie : list) {
            CookieManager cookieManager = aaVar.f262044j;
            cookieManager.getClass();
            cookieManager.setCookie(str, cookie);
        }
        return C118826c.f331422a;
    }
}
