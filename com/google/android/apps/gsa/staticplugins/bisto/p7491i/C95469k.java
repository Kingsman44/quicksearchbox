package com.google.android.apps.gsa.staticplugins.bisto.p7491i;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9388c.C124532d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58844bh;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59402j;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4543n.p4546c.C59415w;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i.k */
/* compiled from: PG */
public final class C95469k {

    /* renamed from: a */
    public static final C59071e f267148a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.i.k");

    /* renamed from: b */
    static final Duration f267149b;

    /* renamed from: c */
    static final C59407o f267150c;

    /* renamed from: g */
    private static final Duration f267151g;

    /* renamed from: d */
    public final C60950i f267152d;

    /* renamed from: e */
    public final AtomicReference f267153e = new AtomicReference();

    /* renamed from: f */
    public final C124532d f267154f;

    /* renamed from: h */
    private final C60888db f267155h;

    /* renamed from: i */
    private final C59407o f267156i;

    static {
        Duration ofSeconds = Duration.ofSeconds(1);
        f267149b = ofSeconds;
        Duration ofSeconds2 = Duration.ofSeconds(2);
        f267151g = ofSeconds2;
        f267150c = new C59402j(new C59401i(C59407o.m92308d(ofSeconds2), 2.0d, 5), C59407o.m92309e(C59407o.m92308d(ofSeconds), Integer.MAX_VALUE));
    }

    public C95469k(C124532d dVar, C60888db dbVar, C60950i iVar) {
        this.f267154f = dVar;
        this.f267155h = dbVar;
        this.f267152d = iVar;
        this.f267156i = new C95467i(this, iVar);
    }

    /* renamed from: a */
    public final C60870cx mo89378a(String str, String str2, byte[] bArr) {
        ((C59052c) ((C59052c) f267148a.mo56226d()).mo56372aa(15070)).mo56386p("sendRequestWithRetries");
        Logger logger = C59417y.f157631a;
        C58836b bVar = C58836b.f156633a;
        C58889cz czVar = C58889cz.f156731b;
        C59411s sVar = C59417y.f157633i;
        C59417y a = C59415w.m92318a(new C95468j(this, str, str2, bArr), this.f267156i, C58844bh.ALWAYS_TRUE, bVar, C58833ax.m90834k(this.f267155h), czVar, sVar);
        C95466h hVar = new C95466h(str2);
        return C60846c.m92878g(a, Exception.class, C47810es.m84963c(hVar), this.f267155h);
    }
}
