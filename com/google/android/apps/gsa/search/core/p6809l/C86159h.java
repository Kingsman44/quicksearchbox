package com.google.android.apps.gsa.search.core.p6809l;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.media.C87596t;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.gms.appdatasearch.C142819p;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.ssb.C45347d;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61781a;
import com.google.knowledge.p4671b.C61782aa;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61798aq;
import com.google.knowledge.p4671b.C61808b;
import com.google.knowledge.p4671b.C61812e;
import com.google.knowledge.p4671b.C61814g;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.knowledge.p4671b.C61833z;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4242bp.p4243a.p4247d.C56161a;
import com.google.p4242bp.p4243a.p4247d.C56162b;
import com.google.p4242bp.p4243a.p4247d.C56163c;
import com.google.p4242bp.p4243a.p4247d.C56164d;
import com.google.p4242bp.p4243a.p4247d.C56165e;
import com.google.p4242bp.p4243a.p4247d.C56166f;
import com.google.p5277z.p5282c.C68029s;
import com.google.p5277z.p5282c.C68030t;
import com.google.p5277z.p5282c.C68032v;
import com.google.p5277z.p5282c.C68033w;
import com.google.p5277z.p5282c.C68036z;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.l.h */
/* compiled from: PG */
public final class C86159h implements C90991b {

    /* renamed from: a */
    public static final C59071e f232831a = C59071e.m91332i("com.google.android.apps.gsa.search.core.l.h");

    /* renamed from: i */
    private static final String[] f232832i = {"gs_lp", "source", "entrypoint"};

    /* renamed from: b */
    public final C21370a f232833b;

    /* renamed from: c */
    public final C68214a f232834c;

    /* renamed from: d */
    public final Executor f232835d;

    /* renamed from: e */
    public final Optional f232836e;

    /* renamed from: f */
    public volatile C45347d f232837f = null;

    /* renamed from: g */
    public final Map f232838g = new EnumMap(C55421x.class);

    /* renamed from: h */
    public final AtomicReference f232839h = new AtomicReference();

    /* renamed from: j */
    private final C68214a f232840j;

    /* renamed from: k */
    private final C68214a f232841k;

    /* renamed from: l */
    private final C86152a f232842l;

    /* renamed from: m */
    private final C86164m f232843m;

    /* renamed from: n */
    private final C86054o f232844n;

    /* renamed from: o */
    private final C86124t f232845o;

    /* renamed from: p */
    private final C85664bo f232846p;

    /* renamed from: q */
    private final C84516aa f232847q;

    /* renamed from: r */
    private final EnumMap f232848r;

    /* renamed from: s */
    private volatile int f232849s = 0;

    public C86159h(C68214a aVar, C21370a aVar2, C86152a aVar3, C68214a aVar4, C68214a aVar5, C86164m mVar, C86054o oVar, C86124t tVar, C85664bo boVar, C91022f fVar, C84516aa aaVar, Executor executor, Optional optional) {
        this.f232834c = aVar;
        this.f232833b = aVar2;
        this.f232842l = aVar3;
        this.f232840j = aVar4;
        this.f232841k = aVar5;
        this.f232843m = mVar;
        this.f232844n = oVar;
        this.f232845o = tVar;
        this.f232846p = boVar;
        this.f232847q = aaVar;
        this.f232835d = executor;
        this.f232836e = optional;
        EnumMap enumMap = new EnumMap(C87596t.class);
        enumMap.put(C87596t.BUFFERING, C51452if.BUFFERING);
        enumMap.put(C87596t.ERROR, C51452if.ERROR);
        enumMap.put(C87596t.FAST_FORWARDING, C51452if.FAST_FORWARDING);
        enumMap.put(C87596t.NONE, C51452if.UNKNOWN_STATE);
        enumMap.put(C87596t.PAUSED, C51452if.PAUSED);
        enumMap.put(C87596t.PLAYING, C51452if.PLAYING);
        enumMap.put(C87596t.REWINDING, C51452if.REWINDING);
        enumMap.put(C87596t.SKIPPING_TO_NEXT, C51452if.SKIPPING_TO_NEXT);
        enumMap.put(C87596t.SKIPPING_TO_PREVIOUS, C51452if.SKIPPING_TO_PREVIOUS);
        enumMap.put(C87596t.STOPPED, C51452if.STOPPED);
        this.f232848r = enumMap;
        fVar.mo85301a(this);
    }

    /* renamed from: i */
    public static boolean m138579i(C61817j jVar, C87541c cVar) {
        C55421x xVar;
        boolean z;
        String str;
        C61833z zVar = (C61833z) C61782aa.f166880d.createBuilder();
        synchronized (cVar.f236439a) {
            xVar = cVar.f236447i;
        }
        boolean z2 = true;
        if (xVar != C55421x.UNKNOWN_ACTION_TYPE) {
            C58976aa aaVar = C58975e.f156826a;
            int i = xVar.f146230cP;
            zVar.copyOnWrite();
            C61782aa aaVar2 = (C61782aa) zVar.instance;
            aaVar2.f166882a |= 1;
            aaVar2.f166883b = i;
            z = true;
        } else {
            z = false;
        }
        synchronized (cVar.f236439a) {
        }
        synchronized (cVar.f236439a) {
            str = cVar.f236448j;
        }
        if (str != null) {
            C58976aa aaVar3 = C58975e.f156826a;
            zVar.copyOnWrite();
            C61782aa aaVar4 = (C61782aa) zVar.instance;
            aaVar4.f166882a |= 4;
            aaVar4.f166884c = str;
        } else {
            z2 = z;
        }
        if (z2) {
            C58976aa aaVar5 = C58975e.f156826a;
            jVar.copyOnWrite();
            C61818k kVar = (C61818k) jVar.instance;
            C61782aa aaVar6 = (C61782aa) zVar.build();
            C61818k kVar2 = C61818k.f166999r;
            aaVar6.getClass();
            kVar.f167013m = aaVar6;
            kVar.f167001a |= 4096;
        } else {
            C58976aa aaVar7 = C58975e.f156826a;
        }
        return z2;
    }

    /* renamed from: j */
    public static boolean m138580j(C61817j jVar, C87541c cVar) {
        C68036z zVar;
        CardDecision e = cVar.mo81643e();
        if (e != null && (zVar = e.f236262p) != null) {
            C68029s sVar = (C68029s) C68030t.f184316b.createBuilder();
            sVar.mo60079a(zVar);
            jVar.copyOnWrite();
            C61818k kVar = (C61818k) jVar.instance;
            C68030t tVar = (C68030t) sVar.build();
            C61818k kVar2 = C61818k.f166999r;
            tVar.getClass();
            kVar.f167004d = tVar;
            kVar.f167001a |= 2;
            return true;
        } else if (cVar.mo81641b() == null) {
            return m138584s(jVar, cVar);
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m138581k(C61817j jVar, C87541c cVar) {
        String str;
        if (cVar.mo81639A()) {
            jVar.copyOnWrite();
            C61818k kVar = (C61818k) jVar.instance;
            C61818k kVar2 = C61818k.f166999r;
            kVar.f167001a |= 16;
            kVar.f167005e = true;
            str = "GMM_NAVIGATING";
        } else {
            str = cVar.mo81664z() ? "GMM_FREENAV" : BuildConfig.FLAVOR;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (str.isEmpty()) {
            return false;
        }
        C61789ah ahVar = (C61789ah) C61790ai.f166898o.createBuilder();
        C61812e eVar = (C61812e) C61814g.f166984j.createBuilder();
        eVar.copyOnWrite();
        C61814g gVar = (C61814g) eVar.instance;
        gVar.f166986a |= 1;
        gVar.f166987b = "com.google.android.apps.maps";
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        C61814g gVar2 = (C61814g) eVar.build();
        gVar2.getClass();
        aiVar.f166903d = gVar2;
        aiVar.f166900a |= 16;
        C62940bt btVar = C61798aq.f166935a;
        C56165e eVar2 = (C56165e) C56166f.f149643c.createBuilder();
        eVar2.mo54329a(str);
        ahVar.mo58885m(btVar, (C56166f) eVar2.build());
        C61790ai aiVar2 = (C61790ai) ahVar.build();
        jVar.copyOnWrite();
        C61818k kVar3 = (C61818k) jVar.instance;
        C61818k kVar4 = C61818k.f166999r;
        aiVar2.getClass();
        kVar3.mo58203b();
        kVar3.f167003c.add(aiVar2);
        return true;
    }

    /* renamed from: p */
    public static boolean m138582p(C61817j jVar, C87541c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        Query h = cVar.mo81646h();
        if (!h.mo84403cj() || !h.mo84363bw("android.opa.extra.INITIAL_QUERY") || h.mo84328bM() || cVar.mo81663y(false)) {
            return false;
        }
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C61818k kVar2 = C61818k.f166999r;
        kVar.f167001a |= 1048576;
        kVar.f167017q = true;
        return true;
    }

    /* renamed from: r */
    public static void m138583r(C87541c cVar) {
        if (cVar != null) {
            synchronized (cVar.f236439a) {
                cVar.f236455q = true;
            }
        }
    }

    /* renamed from: s */
    private static boolean m138584s(C61817j jVar, C87541c cVar) {
        C68032v j = cVar.mo81648j();
        if (j == null || C68032v.f184320b.equals(j)) {
            return false;
        }
        C68033w wVar = (C68033w) C68036z.f184326f.createBuilder();
        wVar.copyOnWrite();
        C68036z zVar = (C68036z) wVar.instance;
        zVar.f184329b = j;
        zVar.f184328a |= 1;
        wVar.copyOnWrite();
        C68036z zVar2 = (C68036z) wVar.instance;
        zVar2.f184332e = 2;
        zVar2.f184328a |= 8;
        C68029s sVar = (C68029s) C68030t.f184316b.createBuilder();
        sVar.mo60079a((C68036z) wVar.build());
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C68030t tVar = (C68030t) sVar.build();
        C61818k kVar2 = C61818k.f166999r;
        tVar.getClass();
        kVar.f167004d = tVar;
        kVar.f167001a |= 2;
        return true;
    }

    /* renamed from: a */
    public final C87541c mo79792a() {
        return (C87541c) this.f232834c.mo27525b();
    }

    /* renamed from: b */
    public final C60870cx mo79793b() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo79802o()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C86164m mVar = this.f232843m;
        C90719ac.f253778a.f253779b.nextLong();
        C60870cx e = mVar.f232856c.mo85140e(mVar.f232855b.mo79808a(C142819p.m231754a(false)), new C86163l(mVar));
        mVar.f232856c.mo85143h(e, mVar.f232857d);
        return e;
    }

    /* renamed from: c */
    public final C61808b mo79794c(C45347d dVar, C87541c cVar) {
        C61808b bVar;
        String x = this.f232845o.mo79758x(C90120fr.f250852s);
        if (x == null || x.isEmpty()) {
            C86152a aVar = this.f232842l;
            if (dVar != null) {
                C61790ai aiVar = dVar.f118536b;
                if (aiVar == null) {
                    aiVar = C61790ai.f166898o;
                }
                C61814g gVar = aiVar.f166903d;
                if (gVar == null) {
                    gVar = C61814g.f166984j;
                }
                if ((1 & gVar.f166986a) != 0) {
                    C61790ai aiVar2 = dVar.f118536b;
                    if (aiVar2 == null) {
                        aiVar2 = C61790ai.f166898o;
                    }
                    C61814g gVar2 = aiVar2.f166903d;
                    if (gVar2 == null) {
                        gVar2 = C61814g.f166984j;
                    }
                    bVar = aVar.mo79790b(gVar2.f166987b);
                }
            }
            bVar = null;
        } else {
            C59104x d = f232831a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DiscourseContextHelper");
            ((C59052c) ((C59052c) d).mo56372aa(7649)).mo56389s("Using debug_context_app: %s", x);
            C61781a aVar2 = (C61781a) C61808b.f166967h.createBuilder();
            aVar2.copyOnWrite();
            C61808b bVar2 = (C61808b) aVar2.instance;
            bVar2.f166969a |= 1;
            bVar2.f166970b = x;
            aVar2.copyOnWrite();
            C61808b bVar3 = (C61808b) aVar2.instance;
            bVar3.f166969a |= 2;
            bVar3.f166971c = 1;
            aVar2.copyOnWrite();
            C61808b bVar4 = (C61808b) aVar2.instance;
            bVar4.f166969a |= 4;
            bVar4.f166972d = true;
            bVar = (C61808b) aVar2.build();
        }
        if (bVar != null) {
            return bVar;
        }
        if (this.f232845o.mo79746e(C90014bt.f247332fE) && (cVar.mo81639A() || cVar.mo81664z())) {
            C58976aa aaVar = C58975e.f156826a;
            String bf = cVar.mo81646h().mo84347bf("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME");
            if (bf != null) {
                return this.f232842l.mo79790b(bf);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02f5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.knowledge.p4671b.C61818k mo79795e(boolean r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "="
            java.lang.String r2 = "&"
            com.google.android.ssb.d r3 = r1.f232837f
            dagger.a r4 = r1.f232834c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r4 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r4
            com.google.knowledge.b.b r5 = r1.mo79794c(r3, r4)
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f232845o
            com.google.android.apps.gsa.shared.m.h r7 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250853t
            java.lang.String r6 = r6.mo79758x(r7)
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            java.lang.String r10 = "DiscourseContextHelper"
            r11 = 1
            if (r6 == 0) goto L_0x00d3
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x00d3
            com.google.common.f.e r3 = f232831a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r12, r10)
            java.lang.String r12 = "Using debug_context_url: %s"
            r13 = 7657(0x1de9, float:1.073E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r13)).mo56389s(r12, r6)
            com.google.knowledge.b.ai r3 = com.google.knowledge.p4671b.C61790ai.f166898o
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.knowledge.b.ah r3 = (com.google.knowledge.p4671b.C61789ah) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.knowledge.b.ai r12 = (com.google.knowledge.p4671b.C61790ai) r12
            int r13 = r12.f166900a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.f166900a = r13
            r12.f166906g = r6
            com.google.android.libraries.f.a r6 = r1.f232833b
            long r12 = r6.mo26870b()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            int r14 = r6.f166900a
            r14 = r14 | 2
            r6.f166900a = r14
            r14 = -1000(0xfffffffffffffc18, double:NaN)
            long r12 = r12 + r14
            long r12 = r12 * r7
            r6.f166901b = r12
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            int r12 = r6.f166900a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r6.f166900a = r12
            r12 = 4
            r6.f166907h = r12
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f232845o
            com.google.android.apps.gsa.shared.m.h r12 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250852s
            java.lang.String r6 = r6.mo79758x(r12)
            if (r6 == 0) goto L_0x00cc
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x00cc
            com.google.knowledge.b.g r12 = com.google.knowledge.p4671b.C61814g.f166984j
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.knowledge.b.e r12 = (com.google.knowledge.p4671b.C61812e) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.knowledge.b.g r13 = (com.google.knowledge.p4671b.C61814g) r13
            int r14 = r13.f166986a
            r14 = r14 | r11
            r13.f166986a = r14
            r13.f166987b = r6
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.knowledge.b.g r6 = (com.google.knowledge.p4671b.C61814g) r6
            int r13 = r6.f166986a
            r13 = r13 | 8
            r6.f166986a = r13
            r13 = 1
            r6.f166990e = r13
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            com.google.protobuf.bv r12 = r12.build()
            com.google.knowledge.b.g r12 = (com.google.knowledge.p4671b.C61814g) r12
            r12.getClass()
            r6.f166903d = r12
            int r12 = r6.f166900a
            r12 = r12 | 16
            r6.f166900a = r12
        L_0x00cc:
            com.google.protobuf.bv r3 = r3.build()
            com.google.knowledge.b.ai r3 = (com.google.knowledge.p4671b.C61790ai) r3
            goto L_0x00dd
        L_0x00d3:
            if (r3 == 0) goto L_0x00dc
            com.google.knowledge.b.ai r3 = r3.f118536b
            if (r3 != 0) goto L_0x00dd
            com.google.knowledge.b.ai r3 = com.google.knowledge.p4671b.C61790ai.f166898o
            goto L_0x00dd
        L_0x00dc:
            r3 = r9
        L_0x00dd:
            com.google.android.libraries.f.a r6 = r1.f232833b
            long r12 = r6.mo26870b()
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r6 = r4.mo81645g()
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            java.lang.String r9 = r6.f236609f
        L_0x00f1:
            com.google.knowledge.b.k r14 = com.google.knowledge.p4671b.C61818k.f166999r
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.knowledge.b.j r14 = (com.google.knowledge.p4671b.C61817j) r14
            com.google.android.apps.gsa.search.shared.d.d r15 = r4.mo81644f()
            java.lang.String r7 = r15.f236463b
            if (r7 == 0) goto L_0x01c3
            java.lang.String[] r17 = f232832i     // Catch:{ RuntimeException -> 0x0176 }
            r8 = r7
            r18 = r8
            r11 = 0
        L_0x0107:
            r7 = 3
            if (r11 >= r7) goto L_0x0172
            r7 = r17[r11]     // Catch:{ RuntimeException -> 0x0170 }
            r19 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x016e }
            r12.<init>()     // Catch:{ RuntimeException -> 0x016e }
            r12.append(r2)     // Catch:{ RuntimeException -> 0x016e }
            r12.append(r7)     // Catch:{ RuntimeException -> 0x016e }
            r12.append(r0)     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r12 = r12.toString()     // Catch:{ RuntimeException -> 0x016e }
            int r12 = r8.indexOf(r12)     // Catch:{ RuntimeException -> 0x016e }
            r13 = -1
            if (r12 != r13) goto L_0x013f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x016e }
            r12.<init>()     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r13 = "?"
            r12.append(r13)     // Catch:{ RuntimeException -> 0x016e }
            r12.append(r7)     // Catch:{ RuntimeException -> 0x016e }
            r12.append(r0)     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r7 = r12.toString()     // Catch:{ RuntimeException -> 0x016e }
            int r12 = r8.indexOf(r7)     // Catch:{ RuntimeException -> 0x016e }
        L_0x013f:
            r7 = -1
            if (r12 == r7) goto L_0x0169
            int r12 = r12 + 1
            int r13 = r8.indexOf(r2, r12)     // Catch:{ RuntimeException -> 0x016e }
            if (r13 != r7) goto L_0x0152
            int r12 = r12 + -1
            r7 = 0
            java.lang.String r8 = r8.substring(r7, r12)     // Catch:{ RuntimeException -> 0x016e }
            goto L_0x0169
        L_0x0152:
            r7 = 0
            java.lang.String r12 = r8.substring(r7, r12)     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ RuntimeException -> 0x016e }
            int r13 = r13 + 1
            java.lang.String r8 = r8.substring(r13)     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ RuntimeException -> 0x016e }
            java.lang.String r8 = r7.concat(r8)     // Catch:{ RuntimeException -> 0x016e }
        L_0x0169:
            int r11 = r11 + 1
            r12 = r19
            goto L_0x0107
        L_0x016e:
            r0 = move-exception
            goto L_0x017b
        L_0x0170:
            r0 = move-exception
            goto L_0x0179
        L_0x0172:
            r19 = r12
            r7 = r8
            goto L_0x018f
        L_0x0176:
            r0 = move-exception
            r18 = r7
        L_0x0179:
            r19 = r12
        L_0x017b:
            com.google.common.f.e r2 = f232831a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r7, r10)
            java.lang.String r7 = ""
            r8 = 7674(0x1dfa, float:1.0754E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r8)).mo56386p(r7)
            r7 = r18
        L_0x018f:
            com.google.knowledge.b.ai r0 = com.google.knowledge.p4671b.C61790ai.f166898o
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.knowledge.b.ah r0 = (com.google.knowledge.p4671b.C61789ah) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.knowledge.b.ai r2 = (com.google.knowledge.p4671b.C61790ai) r2
            r7.getClass()
            int r8 = r2.f166900a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r2.f166900a = r8
            r2.f166906g = r7
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.knowledge.b.k r2 = (com.google.knowledge.p4671b.C61818k) r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.knowledge.b.ai r0 = (com.google.knowledge.p4671b.C61790ai) r0
            r0.getClass()
            r2.f167008h = r0
            int r0 = r2.f167001a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.f167001a = r0
            r0 = 1
            goto L_0x01c6
        L_0x01c3:
            r19 = r12
            r0 = 0
        L_0x01c6:
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.common.b.gu r7 = r15.f236462a
            r2.<init>(r7)
            com.google.knowledge.b.ai r7 = r15.f236467f
            if (r7 == 0) goto L_0x01d4
            r2.add(r7)
        L_0x01d4:
            boolean r7 = r23.mo79802o()
            if (r7 == 0) goto L_0x0283
            if (r3 == 0) goto L_0x0283
            com.google.knowledge.b.ai r7 = com.google.knowledge.p4671b.C61790ai.f166898o
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.b.ah r7 = (com.google.knowledge.p4671b.C61789ah) r7
            int r8 = r3.f166900a
            r8 = r8 & 16
            if (r8 == 0) goto L_0x025b
            com.google.knowledge.b.g r8 = com.google.knowledge.p4671b.C61814g.f166984j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.knowledge.b.e r8 = (com.google.knowledge.p4671b.C61812e) r8
            com.google.knowledge.b.g r11 = r3.f166903d
            if (r11 != 0) goto L_0x01f9
            com.google.knowledge.b.g r12 = com.google.knowledge.p4671b.C61814g.f166984j
            goto L_0x01fa
        L_0x01f9:
            r12 = r11
        L_0x01fa:
            int r12 = r12.f166986a
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x021a
            if (r11 != 0) goto L_0x0204
            com.google.knowledge.b.g r11 = com.google.knowledge.p4671b.C61814g.f166984j
        L_0x0204:
            java.lang.String r11 = r11.f166987b
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.knowledge.b.g r12 = (com.google.knowledge.p4671b.C61814g) r12
            r11.getClass()
            int r13 = r12.f166986a
            r16 = 1
            r13 = r13 | 1
            r12.f166986a = r13
            r12.f166987b = r11
        L_0x021a:
            com.google.knowledge.b.g r11 = r3.f166903d
            if (r11 != 0) goto L_0x0221
            com.google.knowledge.b.g r12 = com.google.knowledge.p4671b.C61814g.f166984j
            goto L_0x0222
        L_0x0221:
            r12 = r11
        L_0x0222:
            int r12 = r12.f166986a
            r12 = r12 & 8
            if (r12 == 0) goto L_0x0240
            if (r11 != 0) goto L_0x022c
            com.google.knowledge.b.g r11 = com.google.knowledge.p4671b.C61814g.f166984j
        L_0x022c:
            long r11 = r11.f166990e
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.knowledge.b.g r13 = (com.google.knowledge.p4671b.C61814g) r13
            r17 = r0
            int r0 = r13.f166986a
            r0 = r0 | 8
            r13.f166986a = r0
            r13.f166990e = r11
            goto L_0x0242
        L_0x0240:
            r17 = r0
        L_0x0242:
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.knowledge.b.ai r0 = (com.google.knowledge.p4671b.C61790ai) r0
            com.google.protobuf.bv r8 = r8.build()
            com.google.knowledge.b.g r8 = (com.google.knowledge.p4671b.C61814g) r8
            r8.getClass()
            r0.f166903d = r8
            int r8 = r0.f166900a
            r8 = r8 | 16
            r0.f166900a = r8
            goto L_0x025d
        L_0x025b:
            r17 = r0
        L_0x025d:
            int r0 = r3.f166900a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0274
            long r11 = r3.f166901b
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.knowledge.b.ai r0 = (com.google.knowledge.p4671b.C61790ai) r0
            int r8 = r0.f166900a
            r8 = r8 | 2
            r0.f166900a = r8
            r0.f166901b = r11
        L_0x0274:
            com.google.protobuf.bv r0 = r7.build()
            boolean r0 = r3.equals(r0)
            r7 = 0
            if (r0 != 0) goto L_0x0286
            r2.add(r7, r3)
            goto L_0x0286
        L_0x0283:
            r17 = r0
            r7 = 0
        L_0x0286:
            if (r4 == 0) goto L_0x033d
            if (r6 == 0) goto L_0x033d
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f232845o
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250793aF
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x033d
            com.google.knowledge.b.ai r0 = com.google.knowledge.p4671b.C61790ai.f166898o
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.knowledge.b.ah r0 = (com.google.knowledge.p4671b.C61789ah) r0
            com.google.knowledge.b.am r3 = com.google.knowledge.p4671b.C61794am.f166922f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.knowledge.b.al r3 = (com.google.knowledge.p4671b.C61793al) r3
            long r11 = r6.f236613j
            r21 = 0
            int r8 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r8 == 0) goto L_0x02bb
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.knowledge.b.am r8 = (com.google.knowledge.p4671b.C61794am) r8
            int r13 = r8.f166924a
            r13 = r13 | 8
            r8.f166924a = r13
            r8.f166926c = r11
        L_0x02bb:
            long r11 = r6.f236614k
            int r8 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r8 == 0) goto L_0x02d0
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.knowledge.b.am r8 = (com.google.knowledge.p4671b.C61794am) r8
            int r13 = r8.f166924a
            r13 = r13 | 16
            r8.f166924a = r13
            r8.f166927d = r11
        L_0x02d0:
            int r8 = r6.f236612i
            int r8 = com.google.p4152bb.p4153a.C55165ig.m87614a(r8)
            if (r8 != 0) goto L_0x02f5
            com.google.common.f.e r8 = f232831a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r11, r10)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r10 = 7673(0x1df9, float:1.0752E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r10)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r10 = "no matching majel.Rating.Style value for: %d"
            int r11 = r6.f236612i
            r8.mo56387q(r10, r11)
            goto L_0x0309
        L_0x02f5:
            r10 = 1
            if (r8 == r10) goto L_0x0309
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.knowledge.b.am r10 = (com.google.knowledge.p4671b.C61794am) r10
            r11 = -1
            int r8 = r8 + r11
            r10.f166928e = r8
            int r8 = r10.f166924a
            r8 = r8 | 32
            r10.f166924a = r8
        L_0x0309:
            java.lang.String r8 = r6.f236606c
            if (r8 == 0) goto L_0x031c
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.knowledge.b.am r10 = (com.google.knowledge.p4671b.C61794am) r10
            int r11 = r10.f166924a
            r12 = 1
            r11 = r11 | r12
            r10.f166924a = r11
            r10.f166925b = r8
        L_0x031c:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.knowledge.b.ai r8 = (com.google.knowledge.p4671b.C61790ai) r8
            com.google.protobuf.bv r3 = r3.build()
            com.google.knowledge.b.am r3 = (com.google.knowledge.p4671b.C61794am) r3
            r3.getClass()
            r8.f166905f = r3
            int r3 = r8.f166900a
            r3 = r3 | 64
            r8.f166900a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.knowledge.b.ai r0 = (com.google.knowledge.p4671b.C61790ai) r0
            r2.add(r0)
        L_0x033d:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0355
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            com.google.protobuf.cq r3 = com.google.knowledge.p4671b.C61818k.emptyProtobufList()
            r0.f167003c = r3
            r14.mo58201b(r2)
            r17 = 1
        L_0x0355:
            boolean r0 = r1.mo79797g(r14, r4)
            r0 = r17 | r0
            boolean r2 = m138580j(r14, r4)
            r0 = r0 | r2
            r2 = 1
            boolean r3 = r1.mo79801n(r14, r2)
            r0 = r0 | r3
            boolean r2 = r1.mo79798h(r14, r5, r9)
            r0 = r0 | r2
            boolean r2 = m138581k(r14, r4)
            r0 = r0 | r2
            boolean r2 = m138579i(r14, r4)
            r0 = r0 | r2
            boolean r2 = r1.mo79799l(r14, r6)
            r0 = r0 | r2
            if (r24 != 0) goto L_0x0381
            boolean r2 = r1.mo79800m(r14, r5, r9)
            r0 = r0 | r2
        L_0x0381:
            com.google.android.apps.gsa.search.core.aj.aa r2 = r1.f232847q
            android.app.KeyguardManager r2 = r2.f230023b
            boolean r2 = r2.isDeviceLocked()
            if (r2 == 0) goto L_0x03d4
            com.google.knowledge.b.au r3 = com.google.knowledge.p4671b.C61802au.f166944d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.knowledge.b.at r3 = (com.google.knowledge.p4671b.C61801at) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.knowledge.b.au r5 = (com.google.knowledge.p4671b.C61802au) r5
            int r6 = r5.f166946a
            r8 = 1
            r6 = r6 | r8
            r5.f166946a = r6
            r5.f166947b = r8
            com.google.android.apps.gsa.shared.search.Query r5 = r4.mo81646h()
            boolean r5 = r5.mo84466dt()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.knowledge.b.au r6 = (com.google.knowledge.p4671b.C61802au) r6
            int r9 = r6.f166946a
            r9 = r9 | 2
            r6.f166946a = r9
            r5 = r5 ^ r8
            r6.f166948c = r5
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.knowledge.b.k r5 = (com.google.knowledge.p4671b.C61818k) r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.knowledge.b.au r3 = (com.google.knowledge.p4671b.C61802au) r3
            r3.getClass()
            r5.f167014n = r3
            int r3 = r5.f167001a
            r6 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r6
            r5.f167001a = r3
            goto L_0x03d5
        L_0x03d4:
            r8 = 1
        L_0x03d5:
            r0 = r0 | r2
            com.google.knowledge.d.f r2 = r15.f236464c
            r3 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x03eb
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.knowledge.b.k r5 = (com.google.knowledge.p4671b.C61818k) r5
            r5.f167016p = r2
            int r6 = r5.f167001a
            r3 = r3 | r6
            r5.f167001a = r3
            goto L_0x0407
        L_0x03eb:
            com.google.protobuf.bv r5 = r14.instance
            com.google.knowledge.b.k r5 = (com.google.knowledge.p4671b.C61818k) r5
            int r5 = r5.f167001a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x0407
            com.google.knowledge.d.f r5 = com.google.knowledge.p4682d.C61995f.f167540a
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.knowledge.b.k r6 = (com.google.knowledge.p4671b.C61818k) r6
            r5.getClass()
            r6.f167016p = r5
            int r5 = r6.f167001a
            r3 = r3 | r5
            r6.f167001a = r3
        L_0x0407:
            if (r2 == 0) goto L_0x040b
            r11 = 1
            goto L_0x040c
        L_0x040b:
            r11 = 0
        L_0x040c:
            m138583r(r4)
            r0 = r0 | r11
            boolean r2 = m138582p(r14, r4)
            r0 = r0 | r2
            if (r0 == 0) goto L_0x042a
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            int r2 = r0.f167001a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r0.f167001a = r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r12 = r19 * r2
            r0.f167009i = r12
        L_0x042a:
            com.google.protobuf.bv r0 = r14.build()
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86159h.mo79795e(boolean):com.google.knowledge.b.k");
    }

    /* renamed from: f */
    public final C63088z mo79796f() {
        C87541c cVar = (C87541c) this.f232834c.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        if (cVar.mo81646h().mo84403cj() && cVar.mo81650l() == null) {
            boolean z = ((C86338r) this.f232841k.mo27525b()).getBoolean("opa_last_response_expects_follow_on", false);
            byte[] e = ((C86338r) this.f232841k.mo27525b()).mo80079e("opa_last_assistant_dialog_token", (byte[]) null);
            if (z && e != null) {
                cVar.mo81655q(C63088z.m96139A(e));
            }
        }
        return cVar.mo81650l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.google.bb.a.ad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.bb.a.bg} */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.google.bb.a.bg] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.bb.a.bg] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        if (r0.f144649g != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79797g(com.google.knowledge.p4671b.C61817j r10, com.google.android.apps.gsa.search.shared.p6926d.C87541c r11) {
        /*
            r9 = this;
            dagger.a r0 = r9.f232840j
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r11.mo81641b()
            r1 = 0
            if (r2 == 0) goto L_0x00c2
            com.google.bb.a.ad r3 = r11.mo81649k()
            if (r3 == 0) goto L_0x003f
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C54960ar.f144579d
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r5 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x003f
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C54960ar.f144579d
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r5 = r3.f169962ag
            com.google.protobuf.bs r6 = r4.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x0038
            java.lang.Object r4 = r4.f169969b
            goto L_0x003c
        L_0x0038:
            java.lang.Object r4 = r4.mo58889c(r5)
        L_0x003c:
            com.google.bb.a.ar r4 = (com.google.p4152bb.p4153a.C54960ar) r4
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 != 0) goto L_0x0065
            int r5 = r11.mo81640a()
            if (r5 == 0) goto L_0x0065
            com.google.bb.a.ar r4 = com.google.p4152bb.p4153a.C54960ar.f144578c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.aq r4 = (com.google.p4152bb.p4153a.C54959aq) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.bb.a.ar r6 = (com.google.p4152bb.p4153a.C54960ar) r6
            int r7 = r6.f144581a
            r7 = r7 | 2
            r6.f144581a = r7
            r6.f144582b = r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.bb.a.ar r4 = (com.google.p4152bb.p4153a.C54960ar) r4
        L_0x0065:
            r5 = r4
            if (r3 == 0) goto L_0x0077
            int r4 = r3.f144533a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0075
            com.google.bb.a.af r4 = r3.f144536d
            if (r4 != 0) goto L_0x00a3
            com.google.bb.a.af r4 = com.google.p4152bb.p4153a.C54948af.f144541h
            goto L_0x00a3
        L_0x0075:
            r4 = r1
            goto L_0x00a3
        L_0x0077:
            java.lang.Object r4 = r11.f236439a
            monitor-enter(r4)
            com.google.android.apps.gsa.search.shared.d.a r6 = r11.f236443e     // Catch:{ all -> 0x00bf }
            if (r6 == 0) goto L_0x0081
            java.lang.String r6 = r6.f236435g     // Catch:{ all -> 0x00bf }
            goto L_0x0082
        L_0x0081:
            r6 = r1
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x00bf }
            if (r6 != 0) goto L_0x0086
            goto L_0x0075
        L_0x0086:
            com.google.bb.a.af r4 = com.google.p4152bb.p4153a.C54948af.f144541h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.ae r4 = (com.google.p4152bb.p4153a.C54947ae) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.bb.a.af r7 = (com.google.p4152bb.p4153a.C54948af) r7
            int r8 = r7.f144543a
            r8 = r8 | 64
            r7.f144543a = r8
            r7.f144548f = r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.bb.a.af r4 = (com.google.p4152bb.p4153a.C54948af) r4
        L_0x00a3:
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.shared.actions.v r0 = (com.google.android.apps.gsa.search.shared.actions.C87500v) r0
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r6 = r11.mo81643e()
            if (r3 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            com.google.bb.a.bg r1 = r3.f144537e
            if (r1 != 0) goto L_0x00b6
            com.google.bb.a.bg r1 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x00b6:
            r7 = r1
            r1 = r0
            r3 = r6
            r6 = r7
            com.google.bb.a.ad r1 = r1.mo81493a(r2, r3, r4, r5, r6)
            goto L_0x00c2
        L_0x00bf:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00bf }
            throw r10
        L_0x00c2:
            if (r1 == 0) goto L_0x0154
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r11.mo81641b()
            r2 = 1
            if (r0 == 0) goto L_0x012f
            boolean r0 = r0.mo81077p()
            if (r0 == 0) goto L_0x012f
            com.google.android.apps.gsa.shared.search.Query r0 = r11.mo81646h()
            boolean r0 = r0.mo84403cj()
            if (r0 == 0) goto L_0x012f
            int r0 = r1.f144533a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x012f
            com.google.bb.a.bg r0 = r1.f144537e
            if (r0 != 0) goto L_0x00e7
            com.google.bb.a.bg r0 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x00e7:
            boolean r3 = r0.f144646d
            if (r3 != 0) goto L_0x00ef
            int r0 = r0.f144649g
            if (r0 == 0) goto L_0x012f
        L_0x00ef:
            com.google.protobuf.bn r0 = r1.toBuilder()
            com.google.bb.a.ac r0 = (com.google.p4152bb.p4153a.C54945ac) r0
            com.google.bb.a.bg r1 = r1.f144537e
            if (r1 != 0) goto L_0x00fb
            com.google.bb.a.bg r1 = com.google.p4152bb.p4153a.C54976bg.f144641o
        L_0x00fb:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.bb.a.bf r1 = (com.google.p4152bb.p4153a.C54975bf) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bb.a.bg r3 = (com.google.p4152bb.p4153a.C54976bg) r3
            int r4 = r3.f144643a
            r4 = r4 | 8
            r3.f144643a = r4
            r3.f144647e = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.bb.a.ad r3 = (com.google.p4152bb.p4153a.C54946ad) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.bg r1 = (com.google.p4152bb.p4153a.C54976bg) r1
            r1.getClass()
            r3.f144537e = r1
            int r1 = r3.f144533a
            r1 = r1 | 32
            r3.f144533a = r1
            com.google.protobuf.bv r0 = r0.build()
            r1 = r0
            com.google.bb.a.ad r1 = (com.google.p4152bb.p4153a.C54946ad) r1
        L_0x012f:
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            com.google.knowledge.b.k r3 = com.google.knowledge.p4671b.C61818k.f166999r
            com.google.protobuf.cq r3 = com.google.knowledge.p4671b.C61818k.emptyProtobufList()
            r0.f167002b = r3
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            r1.getClass()
            r0.mo58202a()
            com.google.protobuf.cq r0 = r0.f167002b
            r0.add(r1)
            m138584s(r10, r11)
            return r2
        L_0x0154:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86159h.mo79797g(com.google.knowledge.b.j, com.google.android.apps.gsa.search.shared.d.c):boolean");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("DiscourseContextProtoHelper");
        C91005e c = fVar.mo85279c("Previous AppDataSearchContext status");
        if (this.f232849s == 0) {
            str = "[none]";
        } else {
            int i = this.f232849s;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "FAILED" : "READY" : "NOT_READY" : "NOT_PREFETCHED" : "NOT_ENABLED";
            if (i != 0) {
                str = str2;
            } else {
                throw null;
            }
        }
        c.mo85276a(C90752i.m148229c(str));
    }

    /* renamed from: h */
    public final boolean mo79798h(C61817j jVar, C61808b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            boolean o = mo79802o();
            boolean z = bVar.f166972d;
            C58976aa aaVar = C58975e.f156826a;
            if (o || z) {
                C61781a aVar = (C61781a) bVar.toBuilder();
                String b = this.f232842l.f232820b.mo79805b(((C61808b) aVar.instance).f166970b);
                if (!TextUtils.isEmpty(b)) {
                    aVar.copyOnWrite();
                    C61808b bVar2 = (C61808b) aVar.instance;
                    b.getClass();
                    bVar2.f166969a |= 32;
                    bVar2.f166975g = b;
                }
                arrayList.add((C61808b) aVar.build());
            }
        }
        if (!TextUtils.isEmpty(str)) {
            C61781a aVar2 = (C61781a) C61808b.f166967h.createBuilder();
            aVar2.copyOnWrite();
            C61808b bVar3 = (C61808b) aVar2.instance;
            str.getClass();
            bVar3.f166969a |= 1;
            bVar3.f166970b = str;
            aVar2.copyOnWrite();
            C61808b bVar4 = (C61808b) aVar2.instance;
            bVar4.f166969a |= 16;
            bVar4.f166974f = true;
            aVar2.copyOnWrite();
            C61808b bVar5 = (C61808b) aVar2.instance;
            bVar5.f166969a |= 8;
            bVar5.f166973e = false;
            arrayList.add((C61808b) aVar2.build());
            C58976aa aaVar2 = C58975e.f156826a;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        jVar.copyOnWrite();
        C61818k kVar = C61818k.f166999r;
        ((C61818k) jVar.instance).f167010j = C61818k.emptyProtobufList();
        jVar.copyOnWrite();
        C61818k kVar2 = (C61818k) jVar.instance;
        C62971cq cqVar = kVar2.f167010j;
        if (!cqVar.mo58948c()) {
            kVar2.f167010j = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) kVar2.f167010j);
        return true;
    }

    /* renamed from: l */
    public final boolean mo79799l(C61817j jVar, PlaybackStatus playbackStatus) {
        C51452if ifVar;
        if (!this.f232845o.mo79746e(C90120fr.f250793aF)) {
            return false;
        }
        if (playbackStatus != null) {
            jVar.copyOnWrite();
            C61818k kVar = (C61818k) jVar.instance;
            C61818k kVar2 = C61818k.f166999r;
            kVar.f167001a |= 32;
            kVar.f167006f = true;
            if (this.f232848r.containsKey(playbackStatus.f236604a)) {
                ifVar = (C51452if) this.f232848r.get(playbackStatus.f236604a);
            } else {
                ifVar = C51452if.UNKNOWN_STATE;
            }
            jVar.copyOnWrite();
            C61818k kVar3 = (C61818k) jVar.instance;
            kVar3.f167007g = ifVar.f134016m;
            kVar3.f167001a |= 64;
        }
        C58976aa aaVar = C58975e.f156826a;
        return playbackStatus != null;
    }

    /* renamed from: m */
    public final boolean mo79800m(C61817j jVar, C61808b bVar, String str) {
        if (mo79802o()) {
            C56161a aVar = (C56161a) C56162b.f149632c.createBuilder();
            if (bVar == null || (bVar.f166969a & 1) == 0 || bVar.f166970b.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C56163c cVar = (C56163c) C56164d.f149637d.createBuilder();
                String str2 = bVar.f166970b;
                cVar.copyOnWrite();
                C56164d dVar = (C56164d) cVar.instance;
                str2.getClass();
                dVar.f149639a |= 1;
                dVar.f149640b = str2;
                long j = bVar.f166971c;
                cVar.copyOnWrite();
                C56164d dVar2 = (C56164d) cVar.instance;
                dVar2.f149639a |= 2;
                dVar2.f149641c = j;
                C56164d dVar3 = (C56164d) cVar.build();
                aVar.copyOnWrite();
                C56162b bVar2 = (C56162b) aVar.instance;
                dVar3.getClass();
                C62971cq cqVar = bVar2.f149634a;
                if (!cqVar.mo58948c()) {
                    bVar2.f149634a = C62942bv.mutableCopy(cqVar);
                }
                bVar2.f149634a.add(dVar3);
                C58976aa aaVar2 = C58975e.f156826a;
            }
            if (str != null && !str.isEmpty()) {
                C56163c cVar2 = (C56163c) C56164d.f149637d.createBuilder();
                cVar2.copyOnWrite();
                C56164d dVar4 = (C56164d) cVar2.instance;
                dVar4.f149639a |= 1;
                dVar4.f149640b = str;
                C56164d dVar5 = (C56164d) cVar2.build();
                aVar.copyOnWrite();
                C56162b bVar3 = (C56162b) aVar.instance;
                dVar5.getClass();
                C62971cq cqVar2 = bVar3.f149635b;
                if (!cqVar2.mo58948c()) {
                    bVar3.f149635b = C62942bv.mutableCopy(cqVar2);
                }
                bVar3.f149635b.add(dVar5);
            }
            C56162b bVar4 = (C56162b) aVar.build();
            if (C56162b.f149632c.equals(bVar4)) {
                return false;
            }
            jVar.copyOnWrite();
            C61818k kVar = (C61818k) jVar.instance;
            C61818k kVar2 = C61818k.f166999r;
            bVar4.getClass();
            kVar.f167011k = bVar4;
            kVar.f167001a |= 1024;
            return true;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return false;
    }

    /* renamed from: n */
    public final boolean mo79801n(C61817j jVar, boolean z) {
        if (this.f232838g.isEmpty()) {
            return false;
        }
        jVar.copyOnWrite();
        C61818k kVar = C61818k.f166999r;
        ((C61818k) jVar.instance).f167002b = C61818k.emptyProtobufList();
        jVar.mo58200a(Collections.unmodifiableList(((C61818k) jVar.instance).f167002b));
        jVar.mo58200a(this.f232838g.values());
        if (!z) {
            return true;
        }
        this.f232838g.clear();
        return true;
    }

    /* renamed from: o */
    public final boolean mo79802o() {
        if (!this.f232846p.mo79190b(new C85662bm[]{C85662bm.WEB_AND_APP_HISTORY}).mo79180f()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x040f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0410, code lost:
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0415, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0416, code lost:
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x041b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x041c, code lost:
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0421, code lost:
        r20 = r4;
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0440, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0441, code lost:
        r6 = r4;
        r18 = r5;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x045e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x045f, code lost:
        r6 = r4;
        r18 = r5;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x047c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x047d, code lost:
        r6 = r4;
        r18 = r5;
        r3 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01f4 A[Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }, LOOP:2: B:80:0x013b->B:123:0x01f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x037b A[Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x037c A[Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x040f A[ExcHandler: CancellationException (e java.util.concurrent.CancellationException), PHI: r4 r5 
      PHI: (r4v16 java.lang.String) = (r4v0 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v18 com.google.common.b.gu) = (r5v1 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0415 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r4 r5 
      PHI: (r4v14 java.lang.String) = (r4v0 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v17 com.google.common.b.gu) = (r5v1 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x041b A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), PHI: r4 r5 
      PHI: (r4v12 java.lang.String) = (r4v0 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v16 com.google.common.b.gu) = (r5v1 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu) binds: [B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:29:0x0089, B:30:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:231:? A[ExcHandler: TimeoutException (unused java.util.concurrent.TimeoutException), PHI: r4 r5 
      PHI: (r4v10 java.lang.String) = (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String) binds: [B:3:0x001d, B:4:?, B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:17:0x0065, B:18:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v15 com.google.common.b.gu) = (r5v1 com.google.common.b.gu), (r5v1 com.google.common.b.gu), (r5v1 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu), (r5v19 com.google.common.b.gu) binds: [B:3:0x001d, B:4:?, B:5:0x001f, B:10:0x0043, B:26:0x007f, B:27:?, B:17:0x0065, B:18:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:3:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x01f3 A[SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79803q(com.google.knowledge.p4671b.C61817j r23, java.util.concurrent.Future r24) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r3 = "name"
            java.lang.String r4 = "DiscourseContextHelper"
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            boolean r6 = r22.mo79802o()
            r9 = 1
            if (r6 != 0) goto L_0x001d
            r1.f232849s = r9
            r9 = 0
            goto L_0x0499
        L_0x001d:
            com.google.android.apps.gsa.search.core.google.gaia.o r11 = r1.f232844n     // Catch:{ ExecutionException -> 0x047c, InterruptedException -> 0x045e, CancellationException -> 0x0440, TimeoutException -> 0x0421 }
            java.lang.String r11 = r11.mo79659F()     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            r13 = 0
            r15 = r24
            java.lang.Object r12 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r15, r13, r12)     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            com.google.common.b.gp r13 = new com.google.common.b.gp     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            r14 = 4
            r13.<init>(r14)     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            java.util.Iterator r15 = r12.iterator()     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
        L_0x0039:
            boolean r16 = r15.hasNext()     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            java.lang.String r10 = "object"
            r17 = 0
            if (r16 == 0) goto L_0x0301
            java.lang.Object r16 = r15.next()     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            r6 = r16
            com.google.android.gms.appdatasearch.UsageInfo r6 = (com.google.android.gms.appdatasearch.UsageInfo) r6     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            java.lang.String r14 = com.google.android.apps.gsa.search.core.p6809l.C86152a.m138562d(r6)     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            boolean r14 = com.google.android.apps.gsa.search.core.p6809l.C86152a.m138564f(r11, r14)     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            if (r14 != 0) goto L_0x0061
            r21 = r3
            r20 = r4
            r18 = r5
            r16 = r15
        L_0x005d:
            r3 = r17
            goto L_0x02e7
        L_0x0061:
            com.google.android.gms.appdatasearch.DocumentContents r14 = r6.f387566e     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            if (r14 == 0) goto L_0x007d
            com.google.android.gms.appdatasearch.DocumentSection[] r14 = r14.f387430a     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x006f, CancellationException -> 0x0068, TimeoutException -> 0x0421 }
            goto L_0x007f
        L_0x0068:
            r0 = move-exception
            r3 = r0
            r6 = r4
            r18 = r5
            goto L_0x0445
        L_0x006f:
            r0 = move-exception
            r3 = r0
            r6 = r4
            r18 = r5
            goto L_0x0463
        L_0x0076:
            r0 = move-exception
            r3 = r0
            r6 = r4
            r18 = r5
            goto L_0x0481
        L_0x007d:
            r14 = r17
        L_0x007f:
            com.google.knowledge.b.ai r16 = com.google.knowledge.p4671b.C61790ai.f166898o     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            com.google.knowledge.b.ah r16 = (com.google.knowledge.p4671b.C61789ah) r16     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0421 }
            if (r14 == 0) goto L_0x0128
            int r7 = r14.length     // Catch:{ ExecutionException -> 0x041b, InterruptedException -> 0x0415, CancellationException -> 0x040f, TimeoutException -> 0x0122 }
            r8 = r17
            r9 = 0
        L_0x008d:
            if (r9 >= r7) goto L_0x0119
            r18 = r5
            r5 = r14[r9]     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            r19 = r7
            com.google.android.gms.appdatasearch.RegisterSectionInfo r7 = r5.f387443c     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r7 == 0) goto L_0x0109
            java.lang.String r7 = r7.f387526a     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            r20 = r8
            java.lang.String r8 = "SsbContext"
            boolean r8 = r8.equals(r7)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r8 == 0) goto L_0x00df
            byte[] r8 = r5.f387445e     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r8 == 0) goto L_0x00df
            r21 = r14
            int r14 = r8.length     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r14 <= 0) goto L_0x00e1
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00cf }
            com.google.android.ssb.d r7 = com.google.android.ssb.C45347d.f118533e     // Catch:{ ct -> 0x00cf }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r8, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x00cf }
            com.google.android.ssb.d r5 = (com.google.android.ssb.C45347d) r5     // Catch:{ ct -> 0x00cf }
            int r7 = r5.f118535a     // Catch:{ ct -> 0x00cf }
            r7 = r7 & 2
            if (r7 == 0) goto L_0x010d
            com.google.knowledge.b.ai r5 = r5.f118536b     // Catch:{ ct -> 0x00cf }
            if (r5 != 0) goto L_0x00c6
            com.google.knowledge.b.ai r5 = com.google.knowledge.p4671b.C61790ai.f166898o     // Catch:{ ct -> 0x00cf }
        L_0x00c6:
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ ct -> 0x00cf }
            com.google.knowledge.b.ah r5 = (com.google.knowledge.p4671b.C61789ah) r5     // Catch:{ ct -> 0x00cf }
            r16 = r5
            goto L_0x010d
        L_0x00cf:
            r0 = move-exception
            r5 = r0
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.core.p6809l.C86152a.f232819a     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            java.lang.String r8 = "Could not parse SsbContext bytes."
            r14 = 7636(0x1dd4, float:1.07E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r14)).mo56386p(r8)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            goto L_0x010d
        L_0x00df:
            r21 = r14
        L_0x00e1:
            java.lang.String r8 = "title"
            boolean r8 = r8.equals(r7)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r8 == 0) goto L_0x00f4
            java.lang.String r8 = r5.f387442b     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r8 != 0) goto L_0x00f4
            java.lang.String r8 = r5.f387442b     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            goto L_0x010f
        L_0x00f4:
            java.lang.String r8 = "web_url"
            boolean r7 = r8.equals(r7)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r7 == 0) goto L_0x010d
            java.lang.String r7 = r5.f387442b     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r7 != 0) goto L_0x010d
            java.lang.String r5 = r5.f387442b     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            r17 = r5
            goto L_0x010d
        L_0x0109:
            r20 = r8
            r21 = r14
        L_0x010d:
            r8 = r20
        L_0x010f:
            int r9 = r9 + 1
            r5 = r18
            r7 = r19
            r14 = r21
            goto L_0x008d
        L_0x0119:
            r18 = r5
            r20 = r8
            r5 = r16
            r7 = r17
            goto L_0x012f
        L_0x0122:
            r18 = r5
        L_0x0124:
            r20 = r4
            goto L_0x0425
        L_0x0128:
            r18 = r5
            r5 = r16
            r7 = r17
            r8 = r7
        L_0x012f:
            com.google.android.gms.appdatasearch.DocumentContents r9 = r6.f387566e     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r9 == 0) goto L_0x0205
            com.google.android.gms.appdatasearch.DocumentSection[] r9 = r9.f387430a     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r9 == 0) goto L_0x0205
            int r14 = r9.length     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            r16 = r15
            r15 = 0
        L_0x013b:
            if (r15 >= r14) goto L_0x0200
            r17 = r14
            r14 = r9[r15]     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            r19 = r9
            byte[] r9 = r14.f387445e     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r9 == 0) goto L_0x01e5
            int r9 = r9.length     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r9 == 0) goto L_0x01e5
            com.google.android.gms.appdatasearch.RegisterSectionInfo r9 = r14.f387443c     // Catch:{ ExecutionException -> 0x02fe, InterruptedException -> 0x02fb, CancellationException -> 0x02f8, TimeoutException -> 0x0124 }
            if (r9 == 0) goto L_0x01e5
            n.a.a.d r9 = p5591n.p5592a.p5593a.C71853d.f191391b     // Catch:{ c -> 0x01cf, ct -> 0x01cd }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ c -> 0x01cf, ct -> 0x01cd }
            n.a.a.c r9 = (p5591n.p5592a.p5593a.C71852c) r9     // Catch:{ c -> 0x01cf, ct -> 0x01cd }
            byte[] r14 = r14.f387445e     // Catch:{ c -> 0x01cf, ct -> 0x01cd }
            r20 = r4
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            com.google.protobuf.b r4 = r9.mergeFrom((byte[]) r14, (com.google.protobuf.C62921ba) r4)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.c r4 = (p5591n.p5592a.p5593a.C71852c) r4     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.d r4 = (p5591n.p5592a.p5593a.C71853d) r4     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            r9.<init>()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            com.google.protobuf.cq r4 = r4.f191393a     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
        L_0x0175:
            boolean r14 = r4.hasNext()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r14 == 0) goto L_0x0191
            java.lang.Object r14 = r4.next()     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.b r14 = (p5591n.p5592a.p5593a.C71851b) r14     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            r21 = r4
            java.lang.String r4 = r14.f191389b     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.f r14 = r14.f191390c     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r14 != 0) goto L_0x018b
            n.a.a.f r14 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
        L_0x018b:
            r9.put(r4, r14)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            r4 = r21
            goto L_0x0175
        L_0x0191:
            java.lang.Object r4 = r9.get(r3)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r4 == 0) goto L_0x01c6
            java.lang.String r4 = "google_voice_actions_developer_context"
            java.lang.Object r14 = r9.get(r3)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.f r14 = (p5591n.p5592a.p5593a.C71855f) r14     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            java.lang.String r14 = r14.f191397b     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            boolean r4 = android.text.TextUtils.equals(r4, r14)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r4 == 0) goto L_0x01c6
            java.lang.Object r4 = r9.get(r10)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            n.a.a.f r4 = (p5591n.p5592a.p5593a.C71855f) r4     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            r4.getClass()
            n.a.a.d r4 = r4.f191398c     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r4 != 0) goto L_0x01b6
            n.a.a.d r4 = p5591n.p5592a.p5593a.C71853d.f191391b     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
        L_0x01b6:
            com.google.bp.a.d.f r4 = com.google.android.apps.gsa.search.core.p6809l.C86155d.m138570a(r4)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            com.google.bp.a.d.f r9 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            boolean r9 = r4.equals(r9)     // Catch:{ c -> 0x01cb, ct -> 0x01c9 }
            if (r9 == 0) goto L_0x01c3
            goto L_0x01c6
        L_0x01c3:
            r21 = r3
            goto L_0x01eb
        L_0x01c6:
            r21 = r3
            goto L_0x01e9
        L_0x01c9:
            r0 = move-exception
            goto L_0x01d2
        L_0x01cb:
            r0 = move-exception
            goto L_0x01d2
        L_0x01cd:
            r0 = move-exception
            goto L_0x01d0
        L_0x01cf:
            r0 = move-exception
        L_0x01d0:
            r20 = r4
        L_0x01d2:
            r4 = r0
            com.google.common.f.e r9 = com.google.android.apps.gsa.search.core.p6809l.C86155d.f232823a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            java.lang.String r14 = "Malformed section in app indexing response provided."
            r21 = r3
            r3 = 7645(0x1ddd, float:1.0713E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r4)).mo56372aa(r3)).mo56386p(r14)     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.bp.a.d.f r4 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            goto L_0x01eb
        L_0x01e5:
            r21 = r3
            r20 = r4
        L_0x01e9:
            com.google.bp.a.d.f r4 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x01eb:
            com.google.bp.a.d.f r3 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            boolean r3 = r4.equals(r3)     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            if (r3 != 0) goto L_0x01f4
            goto L_0x020d
        L_0x01f4:
            int r15 = r15 + 1
            r14 = r17
            r9 = r19
            r4 = r20
            r3 = r21
            goto L_0x013b
        L_0x0200:
            r21 = r3
            r20 = r4
            goto L_0x020b
        L_0x0205:
            r21 = r3
            r20 = r4
            r16 = r15
        L_0x020b:
            com.google.bp.a.d.f r4 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x020d:
            com.google.bp.a.d.f r3 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            boolean r3 = r4.equals(r3)     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            if (r3 != 0) goto L_0x021a
            com.google.protobuf.bt r3 = com.google.knowledge.p4671b.C61798aq.f166935a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r5.mo58885m(r3, r4)     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x021a:
            if (r7 == 0) goto L_0x022c
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r3 = (com.google.knowledge.p4671b.C61790ai) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r4 = r3.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.f166900a = r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.f166906g = r7     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            goto L_0x0242
        L_0x022c:
            com.google.android.gms.appdatasearch.DocumentId r3 = r6.f387562a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            java.lang.String r3 = r3.f387436c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.getClass()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r7 = r4.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r4.f166900a = r7     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.f166906g = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x0242:
            if (r8 == 0) goto L_0x027b
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r3 = (com.google.knowledge.p4671b.C61790ai) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.am r3 = r3.f166905f     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            if (r3 != 0) goto L_0x024e
            com.google.knowledge.b.am r3 = com.google.knowledge.p4671b.C61794am.f166922f     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x024e:
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.al r3 = (com.google.knowledge.p4671b.C61793al) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.am r4 = (com.google.knowledge.p4671b.C61794am) r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r7 = r4.f166924a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r9 = 1
            r7 = r7 | r9
            r4.f166924a = r7     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.f166925b = r8     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.am r3 = (com.google.knowledge.p4671b.C61794am) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.getClass()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.f166905f = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r3 = r4.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3 = r3 | 64
            r4.f166900a = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x027b:
            long r3 = r6.f387563b     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r7 = (com.google.knowledge.p4671b.C61790ai) r7     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r8 = r7.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r8 = r8 | 2
            r7.f166900a = r8     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r7.f166901b = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.g r3 = r7.f166903d     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            if (r3 != 0) goto L_0x0296
            com.google.knowledge.b.g r3 = com.google.knowledge.p4671b.C61814g.f166984j     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x0296:
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.e r3 = (com.google.knowledge.p4671b.C61812e) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.android.gms.appdatasearch.DocumentId r4 = r6.f387562a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            if (r4 == 0) goto L_0x02b4
            java.lang.String r4 = r4.f387434a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.g r7 = (com.google.knowledge.p4671b.C61814g) r7     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.getClass()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r8 = r7.f166986a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r9 = 1
            r8 = r8 | r9
            r7.f166986a = r8     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r7.f166987b = r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x02b4:
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.g r3 = (com.google.knowledge.p4671b.C61814g) r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3.getClass()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.f166903d = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r3 = r4.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r3 = r3 | 16
            r4.f166900a = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r3 = r6.f387564c     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r5.copyOnWrite()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            int r6 = r4.f166900a     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r4.f166900a = r6     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r4.f166907h = r3     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            r17 = r3
            com.google.knowledge.b.ai r17 = (com.google.knowledge.p4671b.C61790ai) r17     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            goto L_0x005d
        L_0x02e7:
            if (r3 == 0) goto L_0x02ec
            r13.mo55395g(r3)     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
        L_0x02ec:
            r15 = r16
            r5 = r18
            r4 = r20
            r3 = r21
            r9 = 1
            r14 = 4
            goto L_0x0039
        L_0x02f8:
            r0 = move-exception
            goto L_0x0412
        L_0x02fb:
            r0 = move-exception
            goto L_0x0418
        L_0x02fe:
            r0 = move-exception
            goto L_0x041e
        L_0x0301:
            r20 = r4
            r18 = r5
            com.google.common.b.gu r5 = r13.mo55394f()     // Catch:{ ExecutionException -> 0x0409, InterruptedException -> 0x0403, CancellationException -> 0x03fe, TimeoutException -> 0x0425 }
            java.util.Iterator r3 = r12.iterator()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
        L_0x030d:
            boolean r4 = r3.hasNext()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r4 == 0) goto L_0x03d4
            java.lang.Object r4 = r3.next()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.android.gms.appdatasearch.UsageInfo r4 = (com.google.android.gms.appdatasearch.UsageInfo) r4     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.android.gms.appdatasearch.DocumentContents r6 = r4.f387566e     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.android.gms.appdatasearch.DocumentId r7 = r4.f387562a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r7 == 0) goto L_0x030d
            java.lang.String r7 = r7.f387434a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r7 != 0) goto L_0x030d
            com.google.android.gms.appdatasearch.DocumentId r7 = r4.f387562a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            java.lang.String r7 = r7.f387434a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            java.lang.String r8 = "com.google.android.deskclock"
            boolean r7 = r7.equals(r8)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r7 == 0) goto L_0x030d
            java.lang.String r7 = com.google.android.apps.gsa.search.core.p6809l.C86152a.m138562d(r4)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            boolean r7 = com.google.android.apps.gsa.search.core.p6809l.C86152a.m138564f(r11, r7)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r7 == 0) goto L_0x030d
            if (r6 == 0) goto L_0x030d
            com.google.android.gms.appdatasearch.DocumentSection[] r6 = r6.f387430a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r6 == 0) goto L_0x030d
            com.google.android.gms.appdatasearch.DocumentContents r6 = r4.f387566e     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r6 == 0) goto L_0x030d
            com.google.android.gms.appdatasearch.DocumentSection[] r6 = r6.f387430a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            int r7 = r6.length     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r8 = 0
        L_0x034b:
            if (r8 >= r7) goto L_0x030d
            r9 = r6[r8]     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            byte[] r9 = r9.f387445e     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r9 == 0) goto L_0x0377
            int r12 = r9.length     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r12 != 0) goto L_0x0357
            goto L_0x0377
        L_0x0357:
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0364 }
            n.a.a.d r13 = p5591n.p5592a.p5593a.C71853d.f191391b     // Catch:{ ct -> 0x0364 }
            com.google.protobuf.bv r9 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (byte[]) r9, (com.google.protobuf.C62921ba) r12)     // Catch:{ ct -> 0x0364 }
            n.a.a.d r9 = (p5591n.p5592a.p5593a.C71853d) r9     // Catch:{ ct -> 0x0364 }
            goto L_0x0379
        L_0x0364:
            r0 = move-exception
            r9 = r0
            com.google.common.f.e r12 = com.google.android.apps.gsa.search.core.p6809l.C86152a.f232819a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            java.lang.String r13 = "Malformed section in app indexing response provided: %s"
            java.lang.String r9 = r9.getMessage()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r14 = 7642(0x1dda, float:1.0709E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56389s(r13, r9)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
        L_0x0377:
            r9 = r17
        L_0x0379:
            if (r9 != 0) goto L_0x037c
            goto L_0x03d0
        L_0x037c:
            com.google.protobuf.cq r9 = r9.f191393a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
        L_0x0382:
            boolean r12 = r9.hasNext()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r12 == 0) goto L_0x03d0
            java.lang.Object r12 = r9.next()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            n.a.a.b r12 = (p5591n.p5592a.p5593a.C71851b) r12     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            java.lang.String r13 = r12.f191389b     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            boolean r13 = r13.equals(r10)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r13 == 0) goto L_0x0382
            n.a.a.f r13 = r12.f191390c     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            if (r13 != 0) goto L_0x039c
            n.a.a.f r13 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
        L_0x039c:
            int r13 = r13.f191396a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r13 = r13 & 16
            if (r13 == 0) goto L_0x0382
            com.google.protobuf.bn r3 = r12.toBuilder()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            n.a.a.a r3 = (p5591n.p5592a.p5593a.C71850a) r3     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            long r6 = r4.f387563b     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.String r4 = java.lang.Long.toString(r6)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r3.copyOnWrite()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            n.a.a.b r6 = (p5591n.p5592a.p5593a.C71851b) r6     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r4.getClass()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            int r7 = r6.f191388a     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r8 = 1
            r7 = r7 | r8
            r6.f191388a = r7     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r6.f191389b = r4     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            n.a.a.b r3 = (p5591n.p5592a.p5593a.C71851b) r3     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            com.google.android.apps.gsa.search.core.p6809l.C86152a.m138563e(r3, r2)     // Catch:{ ExecutionException -> 0x03f8, InterruptedException -> 0x03f2, CancellationException -> 0x03ec, TimeoutException -> 0x0427 }
            r3 = 4
            r9 = 1
            goto L_0x03d6
        L_0x03d0:
            int r8 = r8 + 1
            goto L_0x034b
        L_0x03d4:
            r3 = 4
            r9 = 0
        L_0x03d6:
            r1.f232849s = r3     // Catch:{ ExecutionException -> 0x03e6, InterruptedException -> 0x03e0, CancellationException -> 0x03da, TimeoutException -> 0x0428 }
            goto L_0x0499
        L_0x03da:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0448
        L_0x03e0:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0466
        L_0x03e6:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0484
        L_0x03ec:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0447
        L_0x03f2:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0465
        L_0x03f8:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0483
        L_0x03fe:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0445
        L_0x0403:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0463
        L_0x0409:
            r0 = move-exception
            r3 = r0
            r6 = r20
            goto L_0x0481
        L_0x040f:
            r0 = move-exception
            r18 = r5
        L_0x0412:
            r3 = r0
            r6 = r4
            goto L_0x0445
        L_0x0415:
            r0 = move-exception
            r18 = r5
        L_0x0418:
            r3 = r0
            r6 = r4
            goto L_0x0463
        L_0x041b:
            r0 = move-exception
            r18 = r5
        L_0x041e:
            r3 = r0
            r6 = r4
            goto L_0x0481
        L_0x0421:
            r20 = r4
            r18 = r5
        L_0x0425:
            r5 = r18
        L_0x0427:
            r9 = 0
        L_0x0428:
            com.google.common.f.e r3 = f232831a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6 = r20
            r3.mo56378ag(r4, r6)
            java.lang.String r4 = "AppDataSearch context is not ready yet."
            r6 = 7690(0x1e0a, float:1.0776E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r4)
            r3 = 3
            r1.f232849s = r3
            goto L_0x0499
        L_0x0440:
            r0 = move-exception
            r6 = r4
            r18 = r5
            r3 = r0
        L_0x0445:
            r5 = r18
        L_0x0447:
            r9 = 0
        L_0x0448:
            com.google.common.f.e r4 = f232831a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r6)
            java.lang.String r6 = "AppDataSearch context cancelled."
            r7 = 7689(0x1e09, float:1.0775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r6)
            r3 = 5
            r1.f232849s = r3
            goto L_0x0499
        L_0x045e:
            r0 = move-exception
            r6 = r4
            r18 = r5
            r3 = r0
        L_0x0463:
            r5 = r18
        L_0x0465:
            r9 = 0
        L_0x0466:
            com.google.common.f.e r4 = f232831a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r6)
            java.lang.String r6 = "AppDataSearch context fetch interrupted."
            r7 = 7688(0x1e08, float:1.0773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r6)
            r3 = 5
            r1.f232849s = r3
            goto L_0x0499
        L_0x047c:
            r0 = move-exception
            r6 = r4
            r18 = r5
            r3 = r0
        L_0x0481:
            r5 = r18
        L_0x0483:
            r9 = 0
        L_0x0484:
            com.google.common.f.e r4 = f232831a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r6)
            java.lang.String r6 = "AppDataSearch context fetch failed."
            r7 = 7687(0x1e07, float:1.0772E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r6)
            r3 = 5
            r1.f232849s = r3
        L_0x0499:
            r3 = r5
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x04aa
            if (r9 == 0) goto L_0x04a8
        L_0x04a6:
            r2 = 1
            goto L_0x04ee
        L_0x04a8:
            r2 = 0
            return r2
        L_0x04aa:
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
            int r3 = r3.f167001a
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x04cd
            com.google.android.libraries.f.a r3 = r1.f232833b
            long r3 = r3.mo26870b()
            r23.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.knowledge.b.k r6 = (com.google.knowledge.p4671b.C61818k) r6
            int r7 = r6.f167001a
            r7 = r7 | 256(0x100, float:3.59E-43)
            r6.f167001a = r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            r6.f167009i = r3
        L_0x04cd:
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
            com.google.protobuf.cq r3 = r3.f167003c
            int r3 = r3.size()
            if (r3 != 0) goto L_0x04ea
            r23.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
            com.google.protobuf.cq r4 = com.google.knowledge.p4671b.C61818k.emptyProtobufList()
            r3.f167003c = r4
            r2.mo58201b(r5)
            goto L_0x04a6
        L_0x04ea:
            r2.mo58201b(r5)
            goto L_0x04a6
        L_0x04ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86159h.mo79803q(com.google.knowledge.b.j, java.util.concurrent.Future):boolean");
    }
}
