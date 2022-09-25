package com.google.android.apps.search.assistant.verticals.ambient.startup;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.apps.tiktok.experiments.phenotype.C47065s;
import com.google.apps.tiktok.inject.C47267g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.startup.e */
/* compiled from: PG */
public final class C131683e implements C47267g {

    /* renamed from: a */
    public static final C59071e f359783a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.startup.e");

    /* renamed from: b */
    public final C131251t f359784b;

    /* renamed from: c */
    public final C69464a f359785c;

    /* renamed from: d */
    private final C47065s f359786d;

    /* renamed from: e */
    private final C60888db f359787e;

    public C131683e(C47065s sVar, C131251t tVar, C69464a aVar, C60888db dbVar) {
        this.f359786d = sVar;
        this.f359784b = tVar;
        this.f359785c = aVar;
        this.f359787e = dbVar;
    }

    /* renamed from: e */
    public final void mo35389e() {
        C60870cx a = this.f359786d.mo50994a("com.google.android.apps.search.assistant.device");
        C131682d dVar = new C131682d(this);
        C60856cj.m92911t(a, C47810es.m84974n(dVar), this.f359787e);
        C47633f.m84733g(a).mo51515h(C131681c.f359781a, this.f359787e);
    }
}
