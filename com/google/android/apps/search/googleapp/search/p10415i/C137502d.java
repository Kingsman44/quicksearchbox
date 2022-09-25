package com.google.android.apps.search.googleapp.search.p10415i;

import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4522b.C58585km;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.search.i.d */
/* compiled from: PG */
public final /* synthetic */ class C137502d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f373989a;

    /* renamed from: b */
    public final /* synthetic */ URL f373990b;

    /* renamed from: c */
    public final /* synthetic */ C58585km f373991c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f373992d;

    public /* synthetic */ C137502d(C60870cx cxVar, URL url, C58585km kmVar, C60870cx cxVar2) {
        this.f373989a = cxVar;
        this.f373990b = url;
        this.f373991c = kmVar;
        this.f373992d = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f373989a;
        URL url = this.f373990b;
        C58585km kmVar = this.f373991c;
        String str = (String) C60856cj.m92909r(this.f373992d);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((CronetEngine) C60856cj.m92909r(cxVar)).openConnection(url);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.addRequestProperty("Cookie", str);
        }
        Collection.EL.stream(kmVar.mo54948A()).forEach(new C137507i(httpURLConnection));
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("Cookie"))) {
            C95883aa.m158983d(C137508j.f374002a.mo56224b(), "Made a request with no Cookie present.", 40992, C38505d.f101864b, 178123714);
        }
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        C137511m mVar = C137511m.UNKNOWN;
        C137511m a = C137510l.m223397a(responseCode);
        if ((a == C137511m.CLIENT_ERROR || a == C137511m.SERVER_ERROR) && responseCode != 429) {
            return C60856cj.m92899h(new C137509k(responseCode));
        }
        return C60856cj.m92900i(httpURLConnection);
    }
}
