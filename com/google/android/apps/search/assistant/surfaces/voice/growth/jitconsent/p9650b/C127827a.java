package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.p9650b;

import com.google.android.libraries.p1969j.p1970a.p1974b.C23957g;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import org.chromium.net.CronetEngine;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5523c.C70261e;
import p5488io.grpc.p5525e.C70549hc;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.b.a */
/* compiled from: PG */
public final /* synthetic */ class C127827a implements C23957g {

    /* renamed from: a */
    public final /* synthetic */ CronetEngine.Builder f351823a;

    /* renamed from: b */
    public final /* synthetic */ C60888db f351824b;

    /* renamed from: c */
    public final /* synthetic */ C60887da f351825c;

    public /* synthetic */ C127827a(CronetEngine.Builder builder, C60888db dbVar, C60887da daVar) {
        this.f351823a = builder;
        this.f351824b = dbVar;
        this.f351825c = daVar;
    }

    /* renamed from: a */
    public final C70286co mo29368a(String str, int i) {
        CronetEngine.Builder builder = this.f351823a;
        C60888db dbVar = this.f351824b;
        C60887da daVar = this.f351825c;
        C70261e b = C70261e.m102411b(str, i, builder.build());
        String defaultUserAgent = builder.getDefaultUserAgent();
        C70549hc hcVar = b.f187275c;
        hcVar.f188040h = defaultUserAgent;
        hcVar.mo62290e(dbVar);
        b.mo61906d(dbVar);
        b.f187275c.mo62294i(daVar);
        return b.f187275c.mo57963c();
    }
}
