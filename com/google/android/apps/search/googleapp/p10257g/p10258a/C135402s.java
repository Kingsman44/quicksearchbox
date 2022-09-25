package com.google.android.apps.search.googleapp.p10257g.p10258a;

import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.g.a.s */
/* compiled from: PG */
public final /* synthetic */ class C135402s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f368899a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f368900b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f368901c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f368902d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f368903e;

    public /* synthetic */ C135402s(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5) {
        this.f368899a = cxVar;
        this.f368900b = cxVar2;
        this.f368901c = cxVar3;
        this.f368902d = cxVar4;
        this.f368903e = cxVar5;
    }

    public final Object call() {
        C60870cx cxVar = this.f368899a;
        C60870cx cxVar2 = this.f368900b;
        C60870cx cxVar3 = this.f368901c;
        C60870cx cxVar4 = this.f368902d;
        C60870cx cxVar5 = this.f368903e;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        Uri.Builder appendQueryParameter = Uri.parse("https://www.google.com/async/ddljson").buildUpon().appendQueryParameter("async", "_fmt:pb");
        appendQueryParameter.appendQueryParameter("gl", (String) C60856cj.m92909r(cxVar4));
        appendQueryParameter.appendQueryParameter("hl", (String) C60856cj.m92909r(cxVar5));
        C61363ae aeVar = new C61363ae();
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), (String) C60856cj.m92909r(cxVar2));
        aeVar.mo57932a(C61362ad.m93870b("X-Client-Data"), (String) C60856cj.m92909r(cxVar3));
        aeVar.mo57932a(C61362ad.m93870b("Accept"), "*/*");
        String builder = appendQueryParameter.toString();
        builder.getClass();
        aeVar.f165930a = builder;
        aeVar.mo57933b("GET");
        if (axVar.mo56113h()) {
            aeVar.mo57932a(C61362ad.m93870b("Authorization"), (String) axVar.mo56107c());
        }
        return new C61365ag(aeVar);
    }
}
