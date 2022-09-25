package com.google.android.apps.gsa.staticplugins.p7909eg;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.gsa.g.d.a;
import com.google.android.apps.gsa.g.d.b;
import com.google.android.apps.gsa.g.d.k;
import com.google.android.apps.gsa.g.d.m;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8890a.C118846i;
import com.google.android.apps.gsa.p8889z.p8890a.C118849l;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6788g.p6789a.C85773c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88355yp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.s */
/* compiled from: PG */
public final class C100528s extends C86734a implements C85392b {

    /* renamed from: a */
    public static final C59071e f281059a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eg.s");

    /* renamed from: b */
    public final C22871g f281060b;

    /* renamed from: c */
    public final C86610af f281061c;

    /* renamed from: f */
    public final C86787b f281062f;

    /* renamed from: g */
    public final C21370a f281063g;

    /* renamed from: h */
    private final C68214a f281064h;

    /* renamed from: i */
    private final C68214a f281065i;

    /* renamed from: j */
    private final C68214a f281066j;

    /* renamed from: k */
    private final C68214a f281067k;

    /* renamed from: l */
    private final C58833ax f281068l;

    /* renamed from: m */
    private final C68214a f281069m;

    /* renamed from: n */
    private final C68214a f281070n;

    /* renamed from: o */
    private long f281071o = Long.MIN_VALUE;

    public C100528s(C22871g gVar, C68214a aVar, C68214a aVar2, C86610af afVar, C68214a aVar3, C68214a aVar4, C86787b bVar, C21370a aVar5, C58833ax axVar, C68214a aVar6, C68214a aVar7) {
        super(C118575h.WORKER_TTS, "tts");
        this.f281060b = gVar;
        this.f281064h = aVar;
        this.f281065i = aVar2;
        this.f281061c = afVar;
        this.f281066j = aVar3;
        this.f281067k = aVar4;
        this.f281062f = bVar;
        this.f281063g = aVar5;
        this.f281068l = axVar;
        this.f281069m = aVar6;
        this.f281070n = aVar7;
    }

    /* renamed from: a */
    public final C60870cx mo78912a(Query query) {
        C60870cx cxVar;
        b bVar = (b) this.f281066j.mo27525b();
        m mVar = (m) bVar.e.mo27525b();
        String ae = bVar.d.mo83885ae();
        C90931ca caVar = bVar.c;
        C60870cx b = mVar.b(mVar.c, ae, caVar);
        if (caVar == null) {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            cxVar = caVar.mo85141f(b, new k(mVar, query, ae));
        }
        return bVar.c.mo85141f(cxVar, new a(bVar, query));
    }

    /* renamed from: b */
    public final void mo78913b() {
        C22871g gVar = this.f281060b;
        C86787b bVar = this.f281062f;
        Objects.requireNonNull(bVar);
        gVar.mo28212l("setTtsDoneForBistoOnly", new C100520k(bVar));
    }

    /* renamed from: c */
    public final void mo78914c() {
        ((C59052c) ((C59052c) f281059a.mo56224b()).mo56372aa(33474)).mo56386p("stopTtsPlayback(): Stopping TTS playback");
        ((C100518i) this.f281064h.mo27525b()).mo91949a();
        ((C118849l) this.f281065i.mo27525b()).mo104044e();
    }

    /* renamed from: d */
    public final void mo78915d(int i, String str, Query query, C90606n nVar, TtsRequest ttsRequest, boolean z, boolean z2, String str2, C85386a aVar) {
        C100518i iVar;
        int i2;
        int i3 = i;
        Query query2 = query;
        TtsRequest ttsRequest2 = ttsRequest;
        boolean z3 = z;
        C85386a aVar2 = aVar;
        ((C59052c) ((C59052c) f281059a.mo56224b()).mo56372aa(33472)).mo56386p("startTtsPlayback");
        if (!this.f281068l.mo56113h() || !((C74715bp) this.f281068l.mo56107c()).mo71084e() || !((C86124t) this.f281069m.mo27525b()).mo79746e(C90014bt.f247152bk)) {
            boolean z4 = z2;
            long j = query2.f252780s;
            if (j != this.f281071o) {
                this.f281071o = j;
                C59582aj ajVar = (C59582aj) C90499g.m147581a(query2, ((SharedPreferences) this.f281070n.mo27525b()).getLong("last_missed_hotword_time_ms", -1)).toBuilder();
                int i4 = i3 - 1;
                if (i4 == 1) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar = (C59687cb) ajVar.instance;
                    cbVar.f160040E = 2;
                    cbVar.f160115b |= 4;
                    C89949q.m146523g(241);
                } else if (i4 == 2) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar2 = (C59687cb) ajVar.instance;
                    cbVar2.f160040E = 3;
                    cbVar2.f160115b |= 4;
                    C89949q.m146523g(240);
                } else if (i4 != 3) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar3 = (C59687cb) ajVar.instance;
                    cbVar3.f160040E = 5;
                    cbVar3.f160115b |= 4;
                    C89949q.m146523g(241);
                } else {
                    ajVar.copyOnWrite();
                    C59687cb cbVar4 = (C59687cb) ajVar.instance;
                    cbVar4.f160040E = 4;
                    cbVar4.f160115b |= 4;
                    C89949q.m146523g(304);
                }
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.TTS_PLAY_REQUESTED;
                fVar.f246203c = (C59687cb) ajVar.build();
                ((C89859i) this.f281067k.mo27525b()).mo74236a(fVar.mo83699a());
            }
            C22871g gVar = this.f281060b;
            C86787b bVar = this.f281062f;
            Objects.requireNonNull(bVar);
            C60870cx g = gVar.mo28207g("onTtsPlaying", new C100519j(bVar));
            SettableFuture settableFuture = new SettableFuture();
            C100525p pVar = r1;
            C100524o oVar = new C100524o(this, settableFuture, query2);
            C100518i iVar2 = (C100518i) this.f281064h.mo27525b();
            C85386a aVar3 = aVar;
            SettableFuture settableFuture2 = settableFuture;
            boolean z5 = z;
            C60870cx cxVar = g;
            boolean z6 = z2;
            C100525p pVar2 = new C100525p(this, aVar3, z5, z6, query);
            C100526q qVar = r1;
            C100526q qVar2 = new C100526q(this, aVar3, z5, z6, query);
            C100527r rVar = new C100527r(aVar2);
            iVar2.mo91949a();
            if (i3 == 4) {
                iVar = iVar2;
                if (!((C89037bh) iVar.f281032f.mo27525b()).mo27377b().mo83040a() || query.mo84332bQ()) {
                    C58976aa aaVar = C58975e.f156826a;
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                iVar = iVar2;
            }
            if (i3 != 4) {
                i2 = i3;
            } else if (ttsRequest2 == null || !ttsRequest2.f236281e) {
                i2 = 4;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                i2 = 2;
            }
            iVar.f281037k = i2;
            C58976aa aaVar3 = C58975e.f156826a;
            new C90873ag(cxVar, iVar.f281036j, "ttsPlayingStarted", new C100505b(iVar, settableFuture2)).mo85223a(new C100512c(settableFuture2));
            C58833ax axVar = (C58833ax) iVar.f281034h.mo27525b();
            String str3 = iVar.f281037k == 3 ? "TTS_TYPE_SERVER" : "TTS_TYPE_CLIENT";
            C100513d dVar = new C100513d(axVar, str3, oVar);
            C100514e eVar = new C100514e(axVar, str3, pVar);
            C100515f fVar2 = new C100515f(axVar, str3, qVar);
            C100516g gVar2 = new C100516g(iVar, eVar);
            int i5 = iVar.f281037k;
            int i6 = i5 - 1;
            Uri uri = null;
            if (i5 == 0) {
                throw null;
            } else if (i6 == 1) {
                ttsRequest.getClass();
                if (z3) {
                    C118849l lVar = iVar.f281029c;
                    List a = ttsRequest.mo81450a();
                    synchronized (lVar.f331485d) {
                        if (a == null) {
                            lVar.f331486e = Collections.emptyList();
                        } else {
                            lVar.f331486e = a;
                        }
                    }
                    iVar.f281030d.mo85139d(eVar);
                    return;
                }
                iVar.f281028b.mo78354f(ttsRequest2, dVar, eVar, str);
            } else if (i6 == 2) {
                nVar.getClass();
                if (z3) {
                    iVar.f281029c.mo104041b(nVar.mo84646b().mo59174N());
                    iVar.f281030d.mo85139d(eVar);
                } else {
                    iVar.f281030d.mo85139d(dVar);
                    iVar.f281029c.mo104044e();
                    iVar.f281029c.mo104050k(nVar.mo84646b().mo59174N(), 1);
                    if (nVar.mo84645a().mo56113h()) {
                        iVar.f281035i.f281010a = (C58485gu) nVar.mo84645a().mo56107c();
                        iVar.f281035i.mo91944b(rVar);
                    }
                    iVar.f281029c.mo104040a(gVar2);
                }
                if (axVar.mo56113h()) {
                    ((C100321a) axVar.mo56107c()).mo91879c("TtsManager", "TTS_START", "TTS_TYPE_SERVER", str2, Base64.encodeToString(nVar.mo84646b().mo59174N(), 11));
                }
            } else if (i6 == 3) {
                ttsRequest.getClass();
                if (query.mo84403cj()) {
                    ttsRequest2.f236282f = true;
                    ttsRequest2.f236283g = true;
                }
                C58833ax axVar2 = (C58833ax) iVar.f281031e.mo27525b();
                if (axVar2.mo56113h()) {
                    ((C85773c) axVar2.mo56107c()).mo79432b(ttsRequest, str, dVar, eVar, fVar2, new C100517h(rVar), z);
                }
            } else if (i6 != 4) {
                C59104x c = C100518i.f281027a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TtsManager");
                C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(33465);
                int i7 = iVar.f281037k;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    cVar.mo56387q("synthesize(): ignore Tts for unknown TtsMode %d", i8);
                    return;
                }
                throw null;
            } else {
                iVar.f281029c.mo104044e();
                if (ttsRequest2 != null) {
                    uri = ttsRequest2.f236279c;
                }
                if (uri != null) {
                    iVar.f281029c.mo104048i(uri);
                    iVar.f281029c.mo104040a(eVar);
                }
            }
        } else {
            mo91953e(aVar2, z3, z2, query2);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo91953e(C85386a aVar, boolean z, boolean z2, Query query) {
        C86775r rVar;
        List list;
        if (z && (rVar = this.f281061c.f233977l) != null) {
            C88355yp ypVar = (C88355yp) C88356yq.f238944d.createBuilder();
            byte[] g = ((C118849l) this.f281065i.mo27525b()).mo104046g();
            C118849l lVar = (C118849l) this.f281065i.mo27525b();
            synchronized (lVar.f331485d) {
                list = lVar.f331486e;
                lVar.f331486e = Collections.emptyList();
            }
            if (g != null) {
                String d = C118846i.m197278d(g);
                ypVar.copyOnWrite();
                C88356yq yqVar = (C88356yq) ypVar.instance;
                yqVar.f238946a |= 1;
                yqVar.f238947b = d;
            } else if (!list.isEmpty()) {
                ypVar.copyOnWrite();
                C88356yq yqVar2 = (C88356yq) ypVar.instance;
                C62971cq cqVar = yqVar2.f238948c;
                if (!cqVar.mo58948c()) {
                    yqVar2.f238948c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) list, (List) yqVar2.f238948c);
            }
            C87684al alVar = new C87684al(C88244um.TTS_RESULT_EVENT);
            alVar.mo81965b(C88354yo.f238943a, (C88356yq) ypVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
            if (z2) {
                return;
            }
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.TTS_PLAY_DONE;
        ((C89859i) this.f281067k.mo27525b()).mo74236a(fVar.mo83699a());
        this.f281060b.mo28212l("Set TtsState done", new C100521l(this, aVar, query));
    }
}
