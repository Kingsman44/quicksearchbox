package com.google.android.apps.search.podcasts.p10550b.p10552b;

import android.app.DownloadManager;
import android.content.Context;
import android.os.Environment;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97882ah;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97883ai;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140057g;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10601r.C140958b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.frameworks.client.data.android.C61531o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63111j;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ao */
/* compiled from: PG */
public final class C140022ao {

    /* renamed from: a */
    public static final C59071e f380558a = C59071e.m91332i("com.google.android.apps.search.podcasts.b.b.ao");

    /* renamed from: b */
    public boolean f380559b = false;

    /* renamed from: c */
    public final C140021an f380560c = new C140021an();

    /* renamed from: d */
    public final C46423aj f380561d;

    /* renamed from: e */
    public final Set f380562e = new HashSet();

    /* renamed from: f */
    public final Set f380563f = new LinkedHashSet();

    /* renamed from: g */
    C60870cx f380564g = C60856cj.m92900i(C58729pv.f156485a);

    /* renamed from: h */
    public final Context f380565h;

    /* renamed from: i */
    public final DownloadManager f380566i;

    /* renamed from: j */
    public final Executor f380567j;

    /* renamed from: k */
    public final C60888db f380568k;

    /* renamed from: l */
    public final C21370a f380569l;

    /* renamed from: m */
    public final C140084z f380570m;

    /* renamed from: n */
    public final C140749o f380571n;

    /* renamed from: o */
    public final String f380572o;

    /* renamed from: p */
    public final C140958b f380573p;

    /* renamed from: q */
    public final C140050b f380574q;

    /* renamed from: r */
    private final C61531o f380575r;

    /* renamed from: s */
    private final C46778cv f380576s;

    /* renamed from: t */
    private final C140459au f380577t;

    /* renamed from: u */
    private final C140057g f380578u;

    /* renamed from: v */
    private final boolean f380579v;

    public C140022ao(Context context, C61531o oVar, C60888db dbVar, C60888db dbVar2, C21370a aVar, C46778cv cvVar, C140459au auVar, C140084z zVar, C140057g gVar, C140749o oVar2, String str, C140958b bVar, boolean z, C140050b bVar2) {
        this.f380565h = context;
        this.f380575r = oVar;
        this.f380566i = (DownloadManager) context.getSystemService("download");
        C60888db dbVar3 = dbVar;
        this.f380567j = new C60904dr(dbVar);
        this.f380568k = dbVar2;
        this.f380569l = aVar;
        this.f380576s = cvVar;
        this.f380577t = auVar;
        this.f380570m = zVar;
        this.f380578u = gVar;
        this.f380571n = oVar2;
        this.f380572o = String.format(Locale.US, "GSA/%s", new Object[]{str});
        this.f380579v = z;
        this.f380561d = new C46423aj(new C140039q(this, gVar, dbVar2), dbVar2);
        this.f380573p = bVar;
        this.f380574q = bVar2;
    }

    /* renamed from: g */
    public static String m227690g(C61366ah ahVar, String str) {
        C58485gu guVar = ahVar.f165948d;
        if (guVar.isEmpty()) {
            return str;
        }
        String str2 = (String) C58557jl.m90131l(guVar);
        C58976aa aaVar = C58975e.f156826a;
        return str2;
    }

    /* renamed from: h */
    public static String m227691h(C97920j jVar) {
        String str = jVar.f273429b;
        String str2 = jVar.f273431d;
        return str + ":" + str2;
    }

    /* renamed from: o */
    private final C60870cx m227692o() {
        try {
            C97882ah ahVar = (C97882ah) C97883ai.f273301c.createBuilder();
            C58801sm G = this.f380560c.mo115391b().listIterator(0);
            while (G.hasNext()) {
                ahVar.copyOnWrite();
                C97883ai aiVar = (C97883ai) ahVar.instance;
                C97914d dVar = (C97914d) ((C97874a) G.next()).build();
                dVar.getClass();
                C62971cq cqVar = aiVar.f273303a;
                if (!cqVar.mo58948c()) {
                    aiVar.f273303a = C62942bv.mutableCopy(cqVar);
                }
                aiVar.f273303a.add(dVar);
            }
            C58480gp e = C58485gu.m89837e();
            Iterator it = this.f380563f.iterator();
            for (int i = 0; i < this.f380563f.size(); i++) {
                if (this.f380563f.size() <= 100 || this.f380563f.size() - 100 <= i) {
                    e.mo55395g((C97920j) it.next());
                } else {
                    it.next();
                }
            }
            C58485gu f = e.mo55394f();
            ahVar.copyOnWrite();
            C97883ai aiVar2 = (C97883ai) ahVar.instance;
            C62971cq cqVar2 = aiVar2.f273304b;
            if (!cqVar2.mo58948c()) {
                aiVar2.f273304b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) f, (List) aiVar2.f273304b);
            m227693p();
            return this.f380578u.mo115422b(ahVar.build());
        } catch (Exception e2) {
            C59104x c = f380558a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(41530)).mo56386p("Failed to write the download_info file");
            return C60866ct.f164955a;
        }
    }

    /* renamed from: p */
    private final void m227693p() {
        this.f380576s.mo50787a(C60866ct.f164955a, C140192a.f380885a);
    }

    /* renamed from: a */
    public final C58833ax mo115395a(C97920j jVar) {
        if (!this.f380560c.mo115394f(jVar)) {
            return C58836b.f156633a;
        }
        C97874a a = this.f380560c.mo115390a(jVar);
        a.getClass();
        return C58833ax.m90834k((C97914d) a.build());
    }

    /* renamed from: b */
    public final C60870cx mo115396b(C97918h hVar) {
        C60870cx cxVar;
        C97920j jVar = hVar.f273423j;
        if (jVar == null) {
            jVar = C97920j.f273426e;
        }
        if (this.f380562e.contains(jVar)) {
            C59104x d = f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) d).mo56372aa(41528)).mo56389s("Trying to start a download request %s which has been started.", hVar);
            return C60866ct.f164955a;
        }
        if (this.f380560c.mo115394f(jVar)) {
            C97874a a = this.f380560c.mo115390a(jVar);
            a.getClass();
            C97913c a2 = C97913c.m162190a(((C97914d) a.instance).f273396b);
            if (a2 == null) {
                a2 = C97913c.UNKNOWN;
            }
            if (a2 != C97913c.CANCELLED) {
                C59104x d2 = f380558a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
                C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(41527);
                String h = m227691h(jVar);
                C97874a a3 = this.f380560c.mo115390a(jVar);
                a3.getClass();
                C97913c a4 = C97913c.m162190a(((C97914d) a3.instance).f273396b);
                if (a4 == null) {
                    a4 = C97913c.UNKNOWN;
                }
                cVar.mo56352E("Trying to download an episode %s which has download status: %d.", h, a4.f273392h);
                return C60866ct.f164955a;
            }
        }
        this.f380562e.add(jVar);
        C140021an anVar = this.f380560c;
        C97874a aVar = (C97874a) C97914d.f273393j.createBuilder();
        aVar.copyOnWrite();
        C97914d dVar = (C97914d) aVar.instance;
        hVar.getClass();
        dVar.f273397c = hVar;
        dVar.f273395a |= 2;
        C97913c cVar2 = C97913c.QUEUED_TO_DOWNLOAD;
        aVar.copyOnWrite();
        C97914d dVar2 = (C97914d) aVar.instance;
        dVar2.f273396b = cVar2.f273392h;
        dVar2.f273395a |= 1;
        anVar.mo115392c(jVar, aVar);
        m227693p();
        if ((hVar.f273414a & 1024) != 0) {
            cxVar = C60856cj.m92900i(hVar.f273425l);
        } else {
            C63111j jVar2 = hVar.f273418e;
            if (jVar2 == null) {
                jVar2 = C63111j.f170348p;
            }
            String str = jVar2.f170353d;
            String a5 = this.f380573p.mo116043a(str);
            cxVar = C47633f.m84733g(mo115398d(a5)).mo51515h(new C140029g(this, str), this.f380567j).mo51513e(Throwable.class, new C140030h(a5), this.f380567j);
        }
        C47633f i = C47633f.m84733g(C47633f.m84733g(cxVar).mo51515h(new C140043u(this, hVar), this.f380568k)).mo51516i(new C140044v(this, hVar), this.f380567j);
        C60856cj.m92911t(C47633f.m84733g(i).f164926b, C47810es.m84974n(new C140016ai(this, hVar)), this.f380567j);
        return i;
    }

    /* renamed from: c */
    public final C60870cx mo115397c() {
        C60870cx c = this.f380577t.mo115678c();
        C60870cx b = this.f380570m.mo115433b();
        return C47638k.m84753d(c, b).mo51520a(new C140037o(this, c, b), this.f380567j);
    }

    /* renamed from: d */
    public final C60870cx mo115398d(String str) {
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("HEAD");
        str.getClass();
        aeVar.f165930a = str;
        aeVar.f165933d = true;
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), this.f380572o);
        if (!this.f380579v) {
            aeVar.f165935f = true;
        }
        return this.f380575r.mo42484a(new C61365ag(aeVar));
    }

    /* renamed from: e */
    public final C60870cx mo115399e(C97874a aVar) {
        C97918h hVar = ((C97914d) aVar.instance).f273397c;
        if (hVar == null) {
            hVar = C97918h.f273412m;
        }
        C97920j jVar = hVar.f273423j;
        if (jVar == null) {
            jVar = C97920j.f273426e;
        }
        this.f380562e.add(jVar);
        this.f380560c.mo115392c(jVar, aVar);
        C60870cx o = m227692o();
        mo115406n(false);
        return o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final File mo115400f() {
        File file;
        File[] externalFilesDirs = this.f380565h.getExternalFilesDirs(Environment.DIRECTORY_PODCASTS);
        if (externalFilesDirs == null || externalFilesDirs.length == 0 || (file = externalFilesDirs[0]) == null) {
            return null;
        }
        return new File(file, "Downloads");
    }

    /* renamed from: i */
    public final void mo115401i(C97918h hVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (hVar.f273423j == null) {
            C97920j jVar = C97920j.f273426e;
        }
        C97920j jVar2 = hVar.f273423j;
        if (jVar2 == null) {
            jVar2 = C97920j.f273426e;
        }
        if (!this.f380560c.mo115394f(jVar2)) {
            C59104x d = f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) d).mo56372aa(41542)).mo56386p("Trying to cancel a downloading episode which is not indexed.");
            if (z) {
                this.f380559b = false;
                return;
            }
            return;
        }
        C97874a a = this.f380560c.mo115390a(jVar2);
        a.getClass();
        C140034l lVar = new C140034l(this, jVar2, ((C97914d) a.instance).f273398d);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(lVar), this.f380568k);
        C140015ah ahVar = new C140015ah(this, z, a);
        C60856cj.m92911t(l, C47810es.m84974n(ahVar), this.f380567j);
    }

    /* renamed from: j */
    public final void mo115402j(C97920j jVar) {
        C97874a a = this.f380560c.mo115390a(jVar);
        if (a != null) {
            C97913c a2 = C97913c.m162190a(((C97914d) a.instance).f273396b);
            if (a2 == null) {
                a2 = C97913c.UNKNOWN;
            }
            if (a2 == C97913c.DOWNLOADED) {
                C59104x b = f380558a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
                ((C59052c) ((C59052c) b).mo56372aa(41551)).mo56389s("invalid episode %s", ((C97914d) a.instance).f273400f);
                C97913c cVar = C97913c.FAILED;
                a.copyOnWrite();
                C97914d dVar = (C97914d) a.instance;
                dVar.f273396b = cVar.f273392h;
                dVar.f273395a |= 1;
                mo115405m();
            }
        }
    }

    /* renamed from: k */
    public final void mo115403k(C97920j jVar, Runnable runnable) {
        if (!this.f380560c.mo115394f(jVar)) {
            C59104x d = f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) d).mo56372aa(41553)).mo56386p("Trying to remove a downloaded episode which is not indexed.");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C97874a a = this.f380560c.mo115390a(jVar);
        a.getClass();
        long j = ((C97914d) a.instance).f273398d;
        if (j > 0) {
            C140040r rVar = new C140040r(this, j);
            C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(rVar), this.f380568k), "Failed to remove downloaded episode.", new Object[0]);
        }
        C97874a a2 = this.f380560c.mo115390a(jVar);
        a2.getClass();
        C140041s sVar = new C140041s(((C97914d) a2.instance).f273400f);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(sVar), this.f380568k);
        C140014ag agVar = new C140014ag(this, jVar, runnable);
        C60856cj.m92911t(l, C47810es.m84974n(agVar), this.f380567j);
    }

    /* renamed from: l */
    public final void mo115404l(C97920j jVar) {
        this.f380562e.remove(jVar);
        this.f380560c.mo115393d(jVar);
        this.f380563f.add(jVar);
    }

    /* renamed from: m */
    public final void mo115405m() {
        C46459k.m82829b(m227692o(), "Failed to save download info", new Object[0]);
    }

    /* renamed from: n */
    public final void mo115406n(boolean z) {
        C60870cx cxVar;
        if (!this.f380562e.isEmpty()) {
            if (!this.f380564g.isDone()) {
                if (z) {
                    this.f380564g.cancel(false);
                } else {
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            for (C97920j jVar : this.f380562e) {
                if (this.f380560c.mo115394f(jVar)) {
                    C97874a a = this.f380560c.mo115390a(jVar);
                    a.getClass();
                    hashMap.put(jVar, Long.valueOf(((C97914d) a.instance).f273398d));
                } else {
                    hashMap.remove(jVar);
                }
            }
            C140026d dVar = new C140026d(this, hashMap);
            if (z) {
                cxVar = C60856cj.m92904m(C47810es.m84978r(dVar), this.f380568k);
            } else {
                cxVar = this.f380568k.mo29165e(dVar, 1000, TimeUnit.MILLISECONDS);
            }
            this.f380564g = cxVar;
            C140017aj ajVar = new C140017aj(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(ajVar), this.f380567j);
        }
    }
}
