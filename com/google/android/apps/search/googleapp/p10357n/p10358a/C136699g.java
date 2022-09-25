package com.google.android.apps.search.googleapp.p10357n.p10358a;

import android.text.TextUtils;
import android.util.Base64;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;
import java.util.concurrent.Callable;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.googleapp.n.a.g */
/* compiled from: PG */
public final /* synthetic */ class C136699g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f372099a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f372100b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f372101c;

    /* renamed from: d */
    public final /* synthetic */ C54118q f372102d;

    /* renamed from: e */
    public final /* synthetic */ int f372103e;

    public /* synthetic */ C136699g(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C54118q qVar, int i) {
        this.f372099a = cxVar;
        this.f372100b = cxVar2;
        this.f372101c = cxVar3;
        this.f372102d = qVar;
        this.f372103e = i;
    }

    public final Object call() {
        C60870cx cxVar = this.f372099a;
        C60870cx cxVar2 = this.f372100b;
        C60870cx cxVar3 = this.f372101c;
        C54118q qVar = this.f372102d;
        int i = this.f372103e;
        String str = (String) C60856cj.m92909r(cxVar2);
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("GET");
        aeVar.f165930a = "https://www.google.com/httpservice/web/ExploreService/GetPivots";
        aeVar.mo57932a(C136695c.f372088a, new String(Base64.encode(qVar.toByteArray(), 10), StandardCharsets.UTF_8));
        aeVar.mo57932a(C61362ad.m93870b("X-Client-Data"), (String) C60856cj.m92909r(cxVar));
        aeVar.mo57932a(C61362ad.m93870b("Cache-Control"), "no-cache, no-store");
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), (String) C60856cj.m92909r(cxVar3));
        aeVar.f165933d = true;
        if (!TextUtils.isEmpty(str)) {
            aeVar.mo57932a(C61362ad.m93870b("Cookie"), str);
        }
        if (i == 3) {
            aeVar.mo57932a(C136695c.f372089b, "AndroidGSA");
            aeVar.mo57932a(C136695c.f372090c, "true");
        }
        return new C61365ag(aeVar);
    }
}
