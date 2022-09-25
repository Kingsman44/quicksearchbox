package com.google.android.apps.gsa.nowoverlayservice.p6424c.p6425a;

import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60343p;
import com.google.common.p4552o.C60522t;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.c.a.ad */
/* compiled from: PG */
final class C83489ad {

    /* renamed from: a */
    public final String f227637a;

    /* renamed from: b */
    public final C59582aj f227638b = ((C59582aj) C59687cb.f160034bf.createBuilder());

    /* renamed from: c */
    public final C60343p f227639c;

    /* renamed from: d */
    public volatile C60870cx f227640d;

    /* renamed from: e */
    public volatile int f227641e;

    public C83489ad(String str) {
        C60343p pVar = (C60343p) C60522t.f163843r.createBuilder();
        pVar.copyOnWrite();
        C60522t tVar = (C60522t) pVar.instance;
        tVar.f163857m = 3;
        tVar.f163845a |= 2048;
        this.f227639c = pVar;
        this.f227641e = 1;
        this.f227637a = str;
    }

    public final String toString() {
        String str = this.f227637a;
        int i = this.f227641e;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RESUMED" : "STARTED" : "CREATED" : "NOT_INITIALIZED";
        return "RequestDetails{requestId='" + str + "', controllerState=" + str2 + "}";
    }
}
