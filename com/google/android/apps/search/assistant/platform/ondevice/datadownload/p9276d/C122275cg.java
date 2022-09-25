package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122338ad;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122348an;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122364p;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122368t;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17053at;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17080y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.cg */
/* compiled from: PG */
public final class C122275cg extends C17053at {

    /* renamed from: a */
    public static final C59071e f339060a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.cg");

    /* renamed from: b */
    private final C60888db f339061b;

    /* renamed from: c */
    private final C122348an f339062c;

    public C122275cg(C122348an anVar, C60888db dbVar) {
        this.f339062c = anVar;
        this.f339061b = dbVar;
    }

    /* renamed from: b */
    public final void mo23175b(C17080y yVar, C70862aj ajVar) {
        C122348an anVar = this.f339062c;
        Locale forLanguageTag = Locale.forLanguageTag(yVar.f49725b);
        C60870cx a = anVar.f339227b.mo105598a(forLanguageTag);
        C122364p pVar = new C122364p(anVar, anVar.f339227b.mo105599b(forLanguageTag));
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(pVar), anVar.f339230e);
        C122368t tVar = new C122368t(new C122338ad(anVar, forLanguageTag));
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(tVar), anVar.f339230e);
        C122274cf cfVar = new C122274cf(ajVar);
        C60856cj.m92911t(h2, C47810es.m84974n(cfVar), this.f339061b);
    }
}
