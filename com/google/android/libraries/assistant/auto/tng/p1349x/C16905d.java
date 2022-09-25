package com.google.android.libraries.assistant.auto.tng.p1349x;

import android.os.Build;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1288d.C16533a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1324b.C16844j;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p935d.p940d.p941a.C13341a;
import com.google.android.libraries.assistant.auto.tng.p935d.p940d.p941a.p943b.C13343a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2992d.C38296g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4486ci.p4487a.C58119x;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.d */
/* compiled from: PG */
public final class C16905d implements C57974a {

    /* renamed from: a */
    public static final C59071e f49412a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.x.d");

    /* renamed from: c */
    private static final C58528ij f49413c = C58528ij.m90013M(54, 47, 7, 1);

    /* renamed from: b */
    public C63088z f49414b;

    /* renamed from: d */
    private final Executor f49415d;

    /* renamed from: e */
    private final C16912k f49416e;

    /* renamed from: f */
    private final int f49417f;

    /* renamed from: g */
    private final int f49418g;

    /* renamed from: h */
    private final C58833ax f49419h;

    /* renamed from: i */
    private final C58833ax f49420i;

    public C16905d(Executor executor, C16912k kVar, C58833ax axVar, C58833ax axVar2, int i, int i2) {
        this.f49415d = new C60904dr(executor);
        this.f49416e = kVar;
        this.f49417f = i;
        this.f49418g = i2;
        this.f49420i = axVar;
        this.f49419h = axVar2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C63088z zVar = ((C12115d) obj).f38736b;
        if (zVar.mo59173M()) {
            ((C59052c) ((C59052c) f49412a.mo56226d()).mo56372aa(46745)).mo56386p("Empty audio, skipping.");
        } else {
            this.f49415d.execute(C47810es.m84977q(new C16901a(this, zVar)));
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        if (this.f49420i.mo56113h() && this.f49419h.mo56113h()) {
            C13341a aVar = (C13341a) this.f49420i.mo56107c();
            if (((C13343a) this.f49419h.mo56107c()) == null) {
                throw new NullPointerException("Null carSignalEventCallback");
            } else if (f49413c != null) {
                C60870cx a = aVar.mo21034a();
                C16903b bVar = new C16903b();
                C60856cj.m92911t(a, C47810es.m84974n(bVar), this.f49415d);
            } else {
                throw new NullPointerException("Null signalIds");
            }
        }
    }

    /* renamed from: e */
    public final void mo23079e() {
        if (this.f49420i.mo56113h() && this.f49419h.mo56113h()) {
            C13341a aVar = (C13341a) this.f49420i.mo56107c();
            if (((C13343a) this.f49419h.mo56107c()) != null) {
                C58833ax.m90834k(f49413c);
                aVar.mo21035b();
                return;
            }
            throw new NullPointerException("Null carSignalEventCallback");
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C60870cx cxVar;
        if (this.f49414b == null) {
            ((C59052c) ((C59052c) f49412a.mo56226d()).mo56372aa(46742)).mo56386p("No audio is streamed into AudioDumpSink.");
            return;
        }
        C16912k kVar = this.f49416e;
        int i = this.f49417f;
        int i2 = this.f49418g;
        AccountId accountId = (AccountId) kVar.f49455a.mo17428b();
        accountId.getClass();
        C13213i iVar = (C13213i) kVar.f49456b.mo17428b();
        iVar.getClass();
        C21370a aVar = (C21370a) kVar.f49457c.mo17428b();
        aVar.getClass();
        C60888db dbVar = (C60888db) kVar.f49458d.mo17428b();
        dbVar.getClass();
        C58119x xVar = (C58119x) kVar.f49459e.mo17428b();
        xVar.getClass();
        C58833ax axVar = (C58833ax) kVar.f49460f.mo17428b();
        axVar.getClass();
        C16850a aVar2 = (C16850a) kVar.f49461g.mo17428b();
        aVar2.getClass();
        C16844j jVar = (C16844j) kVar.f49462h.mo17428b();
        jVar.getClass();
        C38296g gVar = (C38296g) kVar.f49463i.mo17428b();
        gVar.getClass();
        String str = (String) kVar.f49464j.mo17428b();
        str.getClass();
        String str2 = (String) kVar.f49465k.mo17428b();
        str2.getClass();
        String str3 = (String) kVar.f49466l.mo17428b();
        str3.getClass();
        C16911j jVar2 = r2;
        C16911j jVar3 = new C16911j(accountId, iVar, aVar, dbVar, xVar, axVar, aVar2, jVar, gVar, str, str2, str3, i, i2);
        C63088z zVar = this.f49414b;
        C16911j jVar4 = jVar2;
        if (!jVar4.f49444f.mo56113h()) {
            ((C59052c) ((C59052c) C16911j.f49439a.mo56224b()).mo56372aa(46753)).mo56386p("Car model info is not available, falling back to android device model.");
        }
        C60870cx a = jVar4.f49448j.mo20978a(jVar4.f49447i);
        if (jVar4.f49444f.mo56113h()) {
            C16533a aVar3 = (C16533a) jVar4.f49444f.mo56107c();
            cxVar = C60856cj.m92900i("AUTO-Toy-ProjectedCar-2021");
        } else {
            cxVar = C60856cj.m92900i(Build.MODEL);
        }
        C60870cx cxVar2 = cxVar;
        C60870cx b = jVar4.f49446h.mo23063b();
        C60870cx a2 = jVar4.f49441c.mo41362a(new C58759qy(jVar4.f49452n), false);
        C60870cx b2 = C47638k.m84753d(a2, a, cxVar2, b).mo51521b(new C16909h(jVar4, a, a2, zVar, cxVar2, b), jVar4.f49443e);
        C16904c cVar = new C16904c(this);
        C60856cj.m92911t(b2, C47810es.m84974n(cVar), this.f49415d);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f49412a.mo56226d()).mo56382g(th)).mo56372aa(46743)).mo56386p("Dump AudioStreamChunk failed.");
    }
}
