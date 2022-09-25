package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4522b.C58487gw;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.apps.search.googleapp.search.i.h */
/* compiled from: PG */
public final /* synthetic */ class C137506h implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C137508j f374000a;

    public /* synthetic */ C137506h(C137508j jVar) {
        this.f374000a = jVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C137508j jVar = this.f374000a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
        httpURLConnection.getClass();
        C137514p pVar = new C137514p(httpURLConnection);
        atVar.mo57268a(pVar, jVar.f374004c);
        C58487gw gwVar = pVar.f374020a;
        if (gwVar.map.containsKey(C137508j.f374003b)) {
            C95883aa.m158983d(C137508j.f374002a.mo56224b(), "Got response header from GWS indicating invalid cookies.", 40990, C38505d.f101864b, 178123295);
        }
        return pVar;
    }
}
