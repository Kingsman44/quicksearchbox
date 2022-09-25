package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.n.f.b;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86116l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103868bu;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.download.C28696ab;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.er */
/* compiled from: PG */
public final class C104026er implements C104042fg {

    /* renamed from: a */
    public static final C58974d f289441a = C58974d.m91136j();

    /* renamed from: u */
    private static final long f289442u = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: A */
    private final C104079gq f289443A;

    /* renamed from: B */
    private final AtomicBoolean f289444B = new AtomicBoolean(false);

    /* renamed from: C */
    private final AtomicBoolean f289445C = new AtomicBoolean(false);

    /* renamed from: D */
    private final C60836bq f289446D = new C60836bq();

    /* renamed from: E */
    private final C104080gr f289447E;

    /* renamed from: b */
    public final C22871g f289448b;

    /* renamed from: c */
    public final C22871g f289449c;

    /* renamed from: d */
    public final C86124t f289450d;

    /* renamed from: e */
    public final C103799g f289451e;

    /* renamed from: f */
    public final C80617l f289452f;

    /* renamed from: g */
    public final C68214a f289453g;

    /* renamed from: h */
    public final C68214a f289454h;

    /* renamed from: i */
    public final C68214a f289455i;

    /* renamed from: j */
    public final C68214a f289456j;

    /* renamed from: k */
    public final C68214a f289457k;

    /* renamed from: l */
    public final C103908ah f289458l;

    /* renamed from: m */
    public final C68214a f289459m;

    /* renamed from: n */
    public final C68214a f289460n;

    /* renamed from: o */
    public final C68214a f289461o;

    /* renamed from: p */
    public final C104126w f289462p;

    /* renamed from: q */
    public final C103868bu f289463q;

    /* renamed from: r */
    public final C68214a f289464r;

    /* renamed from: s */
    public final Object f289465s = new Object();

    /* renamed from: t */
    public C60870cx f289466t = C60856cj.m92900i(new ArrayList());

    /* renamed from: v */
    private final C68214a f289467v;

    /* renamed from: w */
    private final C86116l f289468w;

    /* renamed from: x */
    private final C103951bx f289469x;

    /* renamed from: y */
    private final b f289470y;

    /* renamed from: z */
    private final C104037fb f289471z;

    public C104026er(C22871g gVar, C22871g gVar2, C86124t tVar, C103799g gVar3, C80617l lVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C103908ah ahVar, C68214a aVar7, C86116l lVar2, C68214a aVar8, C103951bx bxVar, b bVar, C68214a aVar9, C104037fb fbVar, C104079gq gqVar, C103868bu buVar, C104126w wVar, C104080gr grVar, C68214a aVar10) {
        this.f289448b = gVar;
        this.f289449c = gVar2;
        this.f289450d = tVar;
        this.f289451e = gVar3;
        this.f289452f = lVar;
        this.f289456j = aVar;
        this.f289457k = aVar2;
        this.f289453g = aVar3;
        this.f289454h = aVar4;
        this.f289455i = aVar5;
        this.f289459m = aVar6;
        this.f289458l = ahVar;
        this.f289467v = aVar7;
        this.f289468w = lVar2;
        this.f289460n = aVar8;
        this.f289469x = bxVar;
        this.f289470y = bVar;
        this.f289461o = aVar9;
        this.f289471z = fbVar;
        this.f289443A = gqVar;
        this.f289463q = buVar;
        this.f289462p = wVar;
        this.f289447E = grVar;
        this.f289464r = aVar10;
    }

    /* renamed from: a */
    public final C60870cx mo93917a() {
        this.f289444B.set(true);
        return this.f289449c.mo28209i(this.f289448b.mo28209i(mo93919c(C29689e.DOWNLOADED), "[NGA] NgaInitialDownloader.discoverPresentGroupIds.toSet", new C103978cx(this)), "[NGA] NgaInitialDownloader.discoverPresentGroupIds.includeSystemImage", new C103979cy(this));
    }

    /* renamed from: b */
    public final C60870cx mo93918b(C60930r rVar) {
        return this.f289446D.mo57305b(rVar, new C103970cp(this));
    }

    /* renamed from: c */
    public final C60870cx mo93919c(C29689e eVar) {
        return this.f289448b.mo28209i(this.f289448b.mo28202b("[NGA] NgaInitialDownloader.getClientFileGroups", new C103992dk(this)), "[NGA] NgaInitialDownloader.getClientFileGroups.getLatest", new C103993dl(this, eVar));
    }

    /* renamed from: d */
    public final C60870cx mo93920d() {
        return C60856cj.m92894c((Iterable) Collection.EL.stream((Set) this.f289467v.mo27525b()).map(new C104017ei(this)).collect(Collectors.toList())).mo57334a(C104018ej.f289430a, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo93921e(Locale locale, boolean z) {
        C60870cx c;
        if (z) {
            ((C103964cj) this.f289460n.mo27525b()).mo93903d();
        } else {
            ((C103964cj) this.f289460n.mo27525b()).mo93902c();
        }
        ((C103967cm) this.f289459m.mo27525b()).mo93913f(3);
        C60870cx i = this.f289448b.mo28209i(this.f289448b.mo28210j(this.f289448b.mo28210j(this.f289448b.mo28205e(C90877ak.m148471e(this.f289468w.mo79734a(), f289442u, TimeUnit.MILLISECONDS, this.f289448b), "[NGA] NgaInitialDownloader.tryStartDownload.refreshFlagsError", Exception.class, new C104006dy(this)), "[NGA] NgaInitialDownloader.tryStartDownload.refreshFileGroups", new C104007dz(this)), "[NGA] NgaInitialDownloader.tryStartDownload.discoverPresentGroupIds", new C104009ea(this)), "[NGA] NgaInitialDownloader.tryStartDownload.discoverMissingGroupIds", new C104010eb(this, locale));
        C60870cx j = this.f289448b.mo28210j(i, "[NGA] NgaInitialDownloader.tryStartDownload.recalculateDownladSize", new C104012ed(this, z));
        synchronized (this.f289465s) {
            C60870cx j2 = this.f289448b.mo28210j(j, "[NGA] NgaInitialDownloader.tryStartDownload.downloadGroupIds.shouldDownload", new C104013ee(this, i));
            this.f289466t = j2;
            c = C118826c.m197213c(j2);
        }
        C60870cx j3 = this.f289448b.mo28210j(this.f289448b.mo28205e(c, "[NGA] NgaInitialDownloader.tryStartDownload.handleDownloadError", Exception.class, new C104014ef(this)), "[NGA] NgaInitialDownloader.tryStartDownload.downloadComplete", new C104015eg(this));
        new C90873ag(j3, this.f289448b, "[NGA] NgaInitialDownloader.tryStartDownload.afterDownloadDiscovery.processResult", new C103975cu(this, locale)).mo85223a(new C103976cv(this));
        return this.f289448b.mo28210j(j3, "[NGA] NgaInitialDownloader.tryStartDownload.downloadComplete", new C104016eh(this, z));
    }

    /* renamed from: f */
    public final Set mo93922f(Locale locale) {
        return (Set) Collection.EL.stream(this.f289469x.mo93894a()).filter(new C104000ds(this, this.f289458l.mo93879a(locale))).collect(Collectors.toSet());
    }

    /* renamed from: g */
    public final boolean mo93923g() {
        C104080gr grVar = this.f289447E;
        ((C58970a) ((C58970a) C104080gr.f289584a.mo56224b()).mo56372aa(21780)).mo56386p("NGA Sync: beginOnDataPresent");
        grVar.mo93941c();
        if (!this.f289443A.mo93940c()) {
            return true;
        }
        Locale b = this.f289451e.mo93859b();
        boolean andSet = this.f289444B.getAndSet(true);
        boolean i = this.f289458l.mo93887i(b);
        boolean f = this.f289452f.mo74371f();
        boolean compareAndSet = this.f289445C.compareAndSet(!f, f);
        if ((true ^ andSet) || i || compareAndSet) {
            C104037fb fbVar = this.f289471z;
            Objects.requireNonNull(fbVar);
            C90875ai.m148465b(C103986de.f289388a, mo93918b(new C103985dd(this, mo93918b(new C103984dc(this, mo93918b(new C103983db(fbVar)))), b)), this.f289448b, "[NGA] NgaInitialDownloader.isDataPresent.downloadComplete").mo85223a(new C103987df(this));
            if (((C103948bu) this.f289454h.mo27525b()).mo93893a() && !this.f289470y.a(false)) {
                ((C58970a) ((C58970a) f289441a.mo56226d()).mo56372aa(21754)).mo56386p("Failed to trigger geller sync task");
            }
        }
        Set set = (Set) Collection.EL.stream(mo93922f(b)).map(C103989dh.f289391a).collect(Collectors.toSet());
        if (!set.isEmpty()) {
            ((C58970a) ((C58970a) f289441a.mo56224b()).mo56372aa(21752)).mo56389s("Missing groups: %s", set);
        }
        C104080gr grVar2 = this.f289447E;
        ((C58970a) ((C58970a) C104080gr.f289584a.mo56224b()).mo56372aa(21779)).mo56386p("NGA Sync: endOnDataPresent");
        grVar2.mo93941c();
        return set.isEmpty();
    }

    /* renamed from: h */
    public final C60870cx mo93924h(String str) {
        ((C58970a) ((C58970a) f289441a.mo56224b()).mo56372aa(21736)).mo56389s("Downloading '%s' and refreshing groups afterwards", str);
        C28739bq m = C28740br.m53599m();
        m.mo34338d(str);
        m.mo34337c(C28696ab.f77968a);
        C60870cx a = ((C103943bp) this.f289457k.mo27525b()).mo93888a(m.mo34335a());
        C22871g gVar = this.f289448b;
        return this.f289448b.mo28205e(gVar.mo28210j(a, "[NGA] NgaInitialDownloader.downloadAndRefreshGroups.refreshAfterDownload '" + str + "'", new C103988dg(this)), "[NGA] NgaInitialDownloader.downloadAndRefreshGroups.catchEx", Exception.class, new C103999dr(str));
    }

    /* renamed from: s */
    public final void mo93760s() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C90875ai.m148465b(new C103995dn(this, atomicBoolean), mo93918b(new C103994dm(this, atomicBoolean)), this.f289448b, "[NGA] onMddUpdate.processResult").mo85223a(C103996do.f289401a);
    }
}
