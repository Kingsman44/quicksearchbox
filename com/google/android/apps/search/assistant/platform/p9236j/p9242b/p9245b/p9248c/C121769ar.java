package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.aqt;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2697j.C34749c;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.ar */
/* compiled from: PG */
public final class C121769ar implements C121761aj {

    /* renamed from: a */
    public final C37402bg f337928a;

    /* renamed from: b */
    public final C121758ag f337929b;

    /* renamed from: c */
    public final C71422aw f337930c;

    /* renamed from: d */
    public final C60870cx f337931d;

    /* renamed from: e */
    private final C60888db f337932e;

    /* renamed from: f */
    private final Duration f337933f;

    public C121769ar(C37402bg bgVar, C121758ag agVar, aqt aqt, C60888db dbVar, C71422aw awVar, C62910ar arVar, C21370a aVar) {
        C69664n.m101061g(bgVar, "delegate");
        C69664n.m101061g(agVar, "resource");
        C69664n.m101061g(aqt, "audioSessionFactory");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f337928a = bgVar;
        this.f337929b = agVar;
        this.f337932e = dbVar;
        this.f337930c = awVar;
        Duration c = C62949a.m95468c(arVar);
        this.f337933f = c;
        C121767ap apVar = new C121767ap(this);
        C69664n.m101061g(dbVar, "<this>");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(c, "delay");
        this.f337931d = C2169h.m6027a(new C34749c(c, aVar, dbVar, apVar));
    }

    /* renamed from: a */
    public final C37402bg mo105350a() {
        return this.f337928a;
    }
}
