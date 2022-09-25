package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24449d;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24454i;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24459n;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24470y;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.p1994b.C24067a;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.p2056af.C25057bb;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25131a;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25138b;
import com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a.C25136e;
import com.google.android.libraries.lens.view.p2067ak.C25210ap;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25245bx;
import com.google.android.libraries.lens.view.p2067ak.C25246by;
import com.google.android.libraries.lens.view.p2069am.C25292a;
import com.google.android.libraries.lens.view.p2069am.C25319b;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.p2070an.C25429ba;
import com.google.android.libraries.lens.view.p2159q.C27608bb;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27979b;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27980c;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27981d;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27861ar;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27863at;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27877bg;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45140az;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59877am;
import com.google.common.p4552o.p4563i.C59878an;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class OfflineDownloadManagerImpl implements C27981d, C24450e, C25131a, C45140az {

    /* renamed from: a */
    public static final C58974d f76145a = C58974d.m91135i("OfflineDownloadManager");

    /* renamed from: p */
    private static final C58485gu f76146p = C58485gu.m89831A(C25327c.PERMANENT, C25327c.NON_DOWNLOADABLE, C25327c.FAILED, C25327c.DOWNLOADABLE, C25327c.UNKNOWN, C25327c.QUEUED, C25327c.BACKGROUND_QUEUED, C25327c.DOWNLOADING, C25327c.DOWNLOADED);

    /* renamed from: q */
    private static final C58528ij f76147q = C58528ij.m90011K(C25327c.DOWNLOADED, C25327c.DOWNLOADING);

    /* renamed from: A */
    private final C25429ba f76148A;

    /* renamed from: B */
    private final boolean f76149B;

    /* renamed from: C */
    private final boolean f76150C;

    /* renamed from: D */
    private final int f76151D;

    /* renamed from: E */
    private C58881cr f76152E;

    /* renamed from: F */
    private C60870cx f76153F = C60856cj.m92899h(new IllegalStateException("Hybrid cascade not loaded"));

    /* renamed from: G */
    private boolean f76154G;

    /* renamed from: b */
    public final Map f76155b = new HashMap();

    /* renamed from: c */
    public final Map f76156c = new HashMap();

    /* renamed from: d */
    public C25327c f76157d = C25327c.UNKNOWN;

    /* renamed from: e */
    public final C60888db f76158e;

    /* renamed from: f */
    public final C60888db f76159f;

    /* renamed from: g */
    public final C60888db f76160g;

    /* renamed from: h */
    public final LensConnectivityManager f76161h;

    /* renamed from: i */
    public final C68214a f76162i;

    /* renamed from: j */
    public final C25225bd f76163j;

    /* renamed from: k */
    public final C37215b f76164k;

    /* renamed from: l */
    public final C24067a f76165l;

    /* renamed from: m */
    public final C25057bb f76166m;

    /* renamed from: n */
    public C60870cx f76167n;

    /* renamed from: o */
    public boolean f76168o;

    /* renamed from: r */
    private final Set f76169r = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: s */
    private final Map f76170s = new HashMap();

    /* renamed from: t */
    private final Map f76171t = new HashMap();

    /* renamed from: u */
    private C58833ax f76172u = C58836b.f156633a;

    /* renamed from: v */
    private final Executor f76173v;

    /* renamed from: w */
    private final C68214a f76174w;

    /* renamed from: x */
    private final C68214a f76175x;

    /* renamed from: y */
    private final C68214a f76176y;

    /* renamed from: z */
    private final C26034j f76177z;

    public OfflineDownloadManagerImpl(C60888db dbVar, C60888db dbVar2, C60888db dbVar3, Executor executor, LensConnectivityManager lensConnectivityManager, C68214a aVar, C25225bd bdVar, C37215b bVar, C68214a aVar2, C68214a aVar3, C24067a aVar4, C26034j jVar, C68214a aVar5, C25429ba baVar, C25057bb bbVar, boolean z, boolean z2, long j) {
        this.f76158e = dbVar;
        this.f76159f = dbVar2;
        this.f76160g = dbVar3;
        this.f76173v = executor;
        this.f76161h = lensConnectivityManager;
        this.f76162i = aVar;
        this.f76163j = bdVar;
        this.f76164k = bVar;
        this.f76175x = aVar2;
        this.f76174w = aVar3;
        this.f76165l = aVar4;
        this.f76177z = jVar;
        this.f76176y = aVar5;
        this.f76148A = baVar;
        this.f76166m = bbVar;
        this.f76149B = z;
        this.f76150C = z2;
        this.f76151D = (int) j;
    }

    /* renamed from: A */
    private final C25327c m52112A(Locale locale) {
        return m52119z((C25327c) this.f76170s.get(locale), (C25327c) this.f76156c.get(locale), this.f76157d);
    }

    /* renamed from: B */
    private static C58833ax m52113B(C58833ax axVar, C58833ax axVar2) {
        long j;
        long j2;
        if (axVar.mo56113h()) {
            j2 = ((C25319b) axVar.mo56107c()).f68890a;
            j = ((C25319b) axVar.mo56107c()).f68891b;
        } else {
            j2 = 0;
            j = 0;
        }
        if (axVar2.mo56113h()) {
            j2 += ((C25319b) axVar2.mo56107c()).f68890a;
            j += ((C25319b) axVar2.mo56107c()).f68891b;
        }
        long j3 = j2;
        if (j == 0) {
            return C58836b.f156633a;
        }
        if (j3 > j) {
            ((C58970a) ((C58970a) f76145a.mo56226d()).mo56372aa(50077)).mo56350C("Current download size is larger than total size (%d > %d)", j3, j);
            j3 = j;
        }
        C25292a aVar = (C25292a) C25319b.f68888c.createBuilder();
        aVar.copyOnWrite();
        ((C25319b) aVar.instance).f68890a = j3;
        aVar.copyOnWrite();
        ((C25319b) aVar.instance).f68891b = j;
        return C58833ax.m90834k((C25319b) aVar.build());
    }

    /* renamed from: C */
    private final synchronized void m52114C() {
        if (this.f76157d != C25327c.DOWNLOADING) {
            if (this.f76157d != C25327c.DOWNLOADED) {
                this.f76158e.execute(C47810es.m84977q(new C27990g(this)));
                mo33447t(C25327c.DOWNLOADING);
                return;
            }
        }
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50090)).mo56386p("The on-device native library is already downloading or downloaded.");
    }

    /* renamed from: D */
    private final void m52115D(Locale locale, boolean z) {
        locale.getLanguage();
        mo33448u(locale, z ? C25327c.DOWNLOADING : C25327c.BACKGROUND_QUEUED);
        C24454i iVar = (C24454i) C24459n.f66948g.createBuilder();
        iVar.copyOnWrite();
        C24459n nVar = (C24459n) iVar.instance;
        nVar.f66950a |= 1;
        nVar.f66951b = z;
        C24459n nVar2 = (C24459n) iVar.build();
        C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        tVar.f66966a |= 1;
        tVar.f66967b = "ocr_multiscript_tflite";
        String locale2 = locale.toString();
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        locale2.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = locale2;
        C24465t tVar3 = (C24465t) sVar.build();
        yVar.copyOnWrite();
        C24471z zVar = (C24471z) yVar.instance;
        tVar3.getClass();
        zVar.f66983b = tVar3;
        zVar.f66982a |= 1;
        yVar.copyOnWrite();
        C24471z zVar2 = (C24471z) yVar.instance;
        nVar2.getClass();
        zVar2.f66984c = nVar2;
        zVar2.f66982a |= 2;
        C60856cj.m92911t(((C27608bb) this.f76175x.mo27525b()).mo33131g(C58485gu.m89846n((C24471z) yVar.build()), this), C47810es.m84974n(new C28001r()), this.f76158e);
    }

    /* renamed from: E */
    private final void m52116E(Locale locale, C25319b bVar) {
        if (m52112A(locale) == C25327c.DOWNLOADING) {
            for (C27980c jVar : this.f76169r) {
                this.f76160g.execute(C47810es.m84977q(new C27993j(jVar, locale, bVar)));
            }
        }
    }

    /* renamed from: F */
    private final void m52117F(Locale locale, C25327c cVar) {
        C25327c cVar2 = C25327c.UNKNOWN;
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            this.f76155b.remove(locale);
            mo33450w();
        } else if (ordinal == 5) {
            this.f76155b.remove(locale);
            mo33450w();
        } else if (ordinal == 7) {
            C27979b bVar = C27979b.UNKNOWN;
            if (!m52112A(locale).equals(C25327c.FAILED)) {
                for (C27980c aVar : this.f76169r) {
                    this.f76160g.execute(C47810es.m84977q(new C27984a(aVar, locale, bVar)));
                }
            }
        }
        for (C27980c hVar : this.f76169r) {
            this.f76160g.execute(C47810es.m84977q(new C27991h(hVar, locale, cVar)));
        }
    }

    /* renamed from: s */
    public static C59898bg m52118s(String str) {
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        C59877am amVar = (C59877am) C59878an.f161811c.createBuilder();
        amVar.copyOnWrite();
        C59878an anVar = (C59878an) amVar.instance;
        str.getClass();
        anVar.f161813a |= 1;
        anVar.f161814b = str;
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        C59878an anVar2 = (C59878an) amVar.build();
        anVar2.getClass();
        bgVar.f161878j = anVar2;
        bgVar.f161869a |= 256;
        return (C59898bg) afVar.build();
    }

    /* renamed from: z */
    private static C25327c m52119z(C25327c cVar, C25327c cVar2, C25327c cVar3) {
        if (cVar == null) {
            cVar = C25327c.UNKNOWN;
        }
        if (cVar2 == null) {
            cVar2 = C25327c.UNKNOWN;
        }
        if (cVar3 == null) {
            cVar3 = C25327c.UNKNOWN;
        }
        C58485gu p = C58485gu.m89848p(cVar, cVar2, cVar3);
        C58485gu guVar = f76146p;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            C25327c cVar4 = (C25327c) guVar.get(i2);
            i2++;
            if (p.contains(cVar4)) {
                return cVar4;
            }
        }
        ((C58970a) ((C58970a) f76145a.mo56226d()).mo56372aa(50075)).mo56386p("Trying to combine the DownloadStates with either no states, or using an unknown state");
        return C25327c.UNKNOWN;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33446a(Object obj) {
        C45137aw awVar = (C45137aw) obj;
        if (awVar.mo48972l().contains("lens_ondevice_engine_feature_module")) {
            ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50108)).mo56387q("State of the on-device native library split install : %s", awVar.mo48947c());
            int c = awVar.mo48947c();
            if (c == 1) {
                mo33447t(C25327c.DOWNLOADING);
            } else if (c == 2) {
                mo33447t(C25327c.DOWNLOADING);
                C25292a aVar = (C25292a) C25319b.f68888c.createBuilder();
                long d = awVar.mo48948d();
                aVar.copyOnWrite();
                ((C25319b) aVar.instance).f68890a = d;
                long e = awVar.mo48949e();
                aVar.copyOnWrite();
                ((C25319b) aVar.instance).f68891b = e;
                C25319b bVar = (C25319b) aVar.build();
                if (!this.f76172u.mo56113h() || !((C25319b) this.f76172u.mo56107c()).equals(bVar)) {
                    for (Map.Entry key : this.f76156c.entrySet()) {
                        Locale locale = (Locale) key.getKey();
                        C58833ax B = m52113B(C58833ax.m90833j((C25319b) this.f76171t.get(locale)), C58833ax.m90834k(bVar));
                        if (B.mo56113h()) {
                            m52116E(locale, (C25319b) B.mo56107c());
                        }
                    }
                    this.f76172u = C58833ax.m90834k(bVar);
                }
                ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50109)).mo56350C("Native Library download bytes: %d / %d", awVar.mo48948d(), awVar.mo48949e());
            } else if (c == 3) {
                mo33447t(C25327c.DOWNLOADED);
            } else if (c == 6) {
                mo33447t(C25327c.FAILED);
            } else if (c == 7) {
                mo33447t(C25327c.DOWNLOADABLE);
            }
        }
    }

    /* renamed from: b */
    public final void mo29904b(C24449d dVar) {
        this.f76173v.execute(C47810es.m84977q(new C27992i(this, dVar)));
    }

    /* renamed from: c */
    public final void mo30271c(String str) {
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50105)).mo56389s("onDeleteTranslateModelResponse: %s", str);
        if (mo33452y(Locale.forLanguageTag(str))) {
            this.f76164k.mo19974a(C37194a.f98529bm.mo40812e(C59898bg.f161867w, m52118s(str)));
        }
        mo33449v(Locale.forLanguageTag(str), C25327c.DOWNLOADABLE);
    }

    /* renamed from: d */
    public final void mo30272d(String str, int i) {
        C58974d dVar = f76145a;
        ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(50106)).mo56352E("error with downloading translate model: %s errorType: %d", str, i);
        if (i == 4) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50107)).mo56389s("Swallowing cancelled error for model: %s", str);
            return;
        }
        this.f76166m.mo30247b(3, str, 2, mo33452y(Locale.forLanguageTag(str)), false);
        mo33449v(Locale.forLanguageTag(str), C25327c.FAILED);
    }

    /* renamed from: e */
    public final void mo30273e(String str, long j) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C25292a aVar = (C25292a) C25319b.f68888c.createBuilder();
        aVar.copyOnWrite();
        ((C25319b) aVar.instance).f68890a = j;
        long a = this.f76177z.mo31239a(str);
        aVar.copyOnWrite();
        ((C25319b) aVar.instance).f68891b = a;
        C25319b bVar = (C25319b) aVar.build();
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50114)).mo56354G("progress event %s for: Translate : %s", forLanguageTag, bVar);
        if (!bVar.equals((C25319b) this.f76171t.get(forLanguageTag))) {
            C58833ax B = m52113B(C58833ax.m90834k(bVar), this.f76172u);
            if (B.mo56113h()) {
                m52116E(forLanguageTag, (C25319b) B.mo56107c());
            }
            this.f76171t.put(forLanguageTag, bVar);
        }
    }

    /* renamed from: f */
    public final void mo30274f(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (mo33452y(forLanguageTag)) {
            this.f76171t.remove(forLanguageTag);
        }
        this.f76166m.mo30247b(1, str, 2, mo33452y(forLanguageTag), false);
        mo33449v(forLanguageTag, C25327c.DOWNLOADED);
    }

    /* renamed from: g */
    public final void mo30275g(String str, int i, String str2) {
        ((C58970a) ((C58970a) f76145a.mo56226d()).mo56372aa(50103)).mo56359L("error cancelling translate model download: %s code: %d message: %s", str, Integer.valueOf(i - 2), str2);
        mo33449v(Locale.forLanguageTag(str), C25327c.UNKNOWN);
    }

    /* renamed from: h */
    public final void mo30276h(String str, String str2) {
        ((C58970a) ((C58970a) f76145a.mo56226d()).mo56372aa(50104)).mo56359L("error with deleting translate model: %s code: %d message: %s", str, 3, str2);
        mo33449v(Locale.forLanguageTag(str), C25327c.UNKNOWN);
    }

    /* renamed from: i */
    public final C25327c mo33436i(Locale locale) {
        if (this.f76156c.isEmpty()) {
            return C25327c.UNKNOWN;
        }
        if (!this.f76156c.containsKey(locale)) {
            return C25327c.NON_DOWNLOADABLE;
        }
        return (C25327c) this.f76156c.get(locale);
    }

    /* renamed from: j */
    public final C60870cx mo33437j() {
        if (!this.f76154G) {
            C27877bg bgVar = (C27877bg) this.f76174w.mo27525b();
            C60870cx e = bgVar.f75978d.mo33335e();
            C27861ar arVar = new C27861ar(bgVar);
            C60870cx h = C60922j.m93045h(e, C47810es.m84966f(arVar), C60826bg.f164896a);
            this.f76153F = h;
            this.f76154G = true;
            C28003t tVar = new C28003t();
            C60856cj.m92911t(h, C47810es.m84974n(tVar), this.f76158e);
        }
        return this.f76153F;
    }

    /* renamed from: k */
    public final C60870cx mo33438k() {
        if (!this.f76156c.isEmpty()) {
            return C60856cj.m92900i(C58495hd.m89898l(this.f76156c));
        }
        if (this.f76152E == null) {
            this.f76152E = C58886cw.m90973a(new C27987d(this));
        }
        return (C60870cx) this.f76152E.mo6453a();
    }

    /* renamed from: l */
    public final void mo33439l(C27980c cVar) {
        this.f76169r.add(cVar);
    }

    /* renamed from: m */
    public final void mo33440m(Locale locale) {
        Locale e = C28136y.m52434e(locale);
        if (Locale.ENGLISH.getLanguage().equals(e.getLanguage())) {
            return;
        }
        if (this.f76156c.isEmpty() || !f76147q.contains(this.f76156c.get(e))) {
            if (!this.f76165l.mo29460c()) {
                this.f76165l.mo29462e();
            }
            if (!this.f76155b.containsKey(e)) {
                this.f76166m.mo30246a(C28136y.m52430a(e), 2, false);
            }
            this.f76155b.put(e, C28005v.DOWNLOAD_TYPE_BACKGROUND);
            m52115D(e, false);
            if (this.f76176y.mo27525b() != null) {
                ((C25136e) this.f76176y.mo27525b()).mo30280d(C28136y.m52430a(e), this, false);
                mo33449v(locale, C25327c.BACKGROUND_QUEUED);
                mo33450w();
            }
        }
    }

    /* renamed from: n */
    public final void mo33441n(Locale locale) {
        if (!this.f76161h.mo30907k()) {
            ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50087)).mo56389s("Not currently connected, cancelling queued %s download", locale);
            if (mo33452y(locale)) {
                this.f76164k.mo19974a(C37194a.f98527bk.mo40812e(C59898bg.f161867w, m52118s(C28136y.m52430a(locale))));
            }
            mo33449v(locale, C25327c.DOWNLOADABLE);
        } else if (mo33452y(locale)) {
            ((C25138b) this.f76162i.mo27525b()).mo30278b(C28136y.m52430a(locale), this);
        } else {
            ((C25136e) this.f76176y.mo27525b()).mo30278b(C28136y.m52430a(locale), this);
        }
    }

    /* renamed from: o */
    public final void mo33442o(Locale locale) {
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50089)).mo56386p("deleting translate pack");
        ((C25138b) this.f76162i.mo27525b()).mo30279c(C28136y.m52430a(locale), this);
    }

    /* renamed from: p */
    public final void mo33443p(Locale locale) {
        C58974d dVar = f76145a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50092)).mo56389s("downloading translate config %s", locale);
        if (!mo33452y(locale)) {
            mo33448u(locale, C25327c.QUEUED);
            mo33449v(locale, C25327c.QUEUED);
            C25327c cVar = this.f76157d;
            if (!(cVar == C25327c.DOWNLOADING || cVar == C25327c.DOWNLOADED)) {
                mo33447t(C25327c.QUEUED);
            }
            this.f76155b.put(locale, C28005v.DOWNLOAD_TYPE_FOREGROUND);
            mo33450w();
        }
        if (!this.f76161h.mo30907k()) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50093)).mo56389s("Not currently connected, queuing %s download", locale);
            this.f76164k.mo19974a(C37194a.f98526bj.mo40812e(C59898bg.f161867w, m52118s(C28136y.m52430a(locale))));
            return;
        }
        mo33451x(locale);
    }

    /* renamed from: q */
    public final void mo33444q(C2384o oVar) {
        oVar.mo5790b(new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                OfflineDownloadManagerImpl offlineDownloadManagerImpl = OfflineDownloadManagerImpl.this;
                offlineDownloadManagerImpl.f76165l.mo29458a(offlineDownloadManagerImpl);
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                OfflineDownloadManagerImpl offlineDownloadManagerImpl = OfflineDownloadManagerImpl.this;
                offlineDownloadManagerImpl.f76165l.mo29459b(offlineDownloadManagerImpl);
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: r */
    public final void mo33445r() {
        if ((this.f76149B || this.f76150C) && this.f76148A.mo30480a() >= ((long) this.f76151D) && !this.f76168o) {
            C27877bg bgVar = (C27877bg) this.f76174w.mo27525b();
            C60870cx d = bgVar.f75978d.mo33334d();
            C27863at atVar = new C27863at(bgVar);
            C60870cx h = C60922j.m93045h(d, C47810es.m84966f(atVar), C60826bg.f164896a);
            this.f76168o = true;
            C28002s sVar = new C28002s(this, bgVar);
            C60856cj.m92911t(h, C47810es.m84974n(sVar), this.f76158e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo33447t(C25327c cVar) {
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50100)).mo56389s("Native Library Status event: %s", cVar);
        C25327c cVar2 = this.f76157d;
        if (cVar != cVar2) {
            for (Map.Entry entry : this.f76156c.entrySet()) {
                if (!C25327c.DOWNLOADABLE.equals(entry.getValue()) && !C25327c.PERMANENT.equals(entry.getValue())) {
                    Locale locale = (Locale) entry.getKey();
                    C25327c z = m52119z((C25327c) this.f76170s.get(locale), (C25327c) this.f76156c.get(locale), cVar2);
                    C25327c z2 = m52119z((C25327c) this.f76170s.get(locale), (C25327c) this.f76156c.get(locale), cVar);
                    if (!z.equals(z2)) {
                        m52117F(locale, z2);
                    }
                }
            }
            this.f76157d = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo33448u(Locale locale, C25327c cVar) {
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50101)).mo56354G("OCR Status event for %s: %s", locale, cVar);
        if (cVar != this.f76170s.get(locale)) {
            C25327c A = m52112A(locale);
            C25327c z = m52119z(cVar, (C25327c) this.f76156c.get(locale), this.f76157d);
            if (!z.equals(A)) {
                m52117F(locale, z);
            }
            this.f76170s.put(locale, cVar);
        }
    }

    /* renamed from: v */
    public final void mo33449v(Locale locale, C25327c cVar) {
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50102)).mo56354G("Translate Status event for %s: %s", locale, cVar);
        if (cVar != this.f76156c.get(locale)) {
            if (cVar != C25327c.DOWNLOADING) {
                this.f76171t.remove(locale);
            }
            C25327c A = m52112A(locale);
            C25327c z = m52119z((C25327c) this.f76170s.get(locale), cVar, this.f76157d);
            if (!z.equals(A)) {
                m52117F(locale, z);
            }
            this.f76156c.put(locale, cVar);
        }
    }

    /* renamed from: w */
    public final synchronized void mo33450w() {
        C58485gu guVar = (C58485gu) Collection.EL.stream(this.f76155b.entrySet()).filter(C27996m.f76198a).map(C27997n.f76199a).collect(C58370cn.f155946a);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(this.f76155b.entrySet()).filter(C27998o.f76200a).map(C27999p.f76201a).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) f76145a.mo56224b()).mo56372aa(50110)).mo56393w("Saving %d queued foreground and %d background language packs", guVar.size(), guVar2.size());
        C25225bd bdVar = this.f76163j;
        C25245bx bxVar = (C25245bx) C25246by.f68705c.createBuilder();
        bxVar.copyOnWrite();
        C25246by byVar = (C25246by) bxVar.instance;
        C62971cq cqVar = byVar.f68707a;
        if (!cqVar.mo58948c()) {
            byVar.f68707a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) byVar.f68707a);
        bxVar.copyOnWrite();
        C25246by byVar2 = (C25246by) bxVar.instance;
        C62971cq cqVar2 = byVar2.f68708b;
        if (!cqVar2.mo58948c()) {
            byVar2.f68708b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) guVar2, (List) byVar2.f68708b);
        bdVar.f68662a.mo30363c(new C25210ap((C25246by) bxVar.build()));
    }

    /* renamed from: x */
    public final void mo33451x(Locale locale) {
        String a = C28136y.m52430a(locale);
        this.f76166m.mo30246a(a, 2, true);
        m52115D(locale, true);
        m52114C();
        if (!Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
            mo33449v(locale, C25327c.DOWNLOADING);
            locale.getLanguage();
            ((C25138b) this.f76162i.mo27525b()).mo30280d(a, this, true);
        }
    }

    /* renamed from: y */
    public final boolean mo33452y(Locale locale) {
        return this.f76155b.get(locale) == C28005v.DOWNLOAD_TYPE_FOREGROUND;
    }
}
