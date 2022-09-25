package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.common.base.C58832aw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.s */
/* compiled from: PG */
public final /* synthetic */ class C93839s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262096a;

    /* renamed from: b */
    public final /* synthetic */ String f262097b;

    public /* synthetic */ C93839s(C93809aa aaVar, String str) {
        this.f262096a = aaVar;
        this.f262097b = str;
    }

    public final Object call() {
        C93809aa aaVar = this.f262096a;
        String str = this.f262097b;
        CookieManager cookieManager = aaVar.f262044j;
        cookieManager.getClass();
        String cookie = cookieManager.getCookie(str);
        if (true == TextUtils.isEmpty(cookie)) {
            cookie = null;
        }
        if (!C58832aw.m90831a(cookie, aaVar.f262045k) && ((C85923cq) aaVar.f262040f.mo27525b()).mo79556g(Uri.parse(str), false, false)) {
            aaVar.f262045k = cookie;
            aaVar.mo88181h(aaVar.f262045k);
        }
        return cookie;
    }
}
