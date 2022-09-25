package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.search.core.state.p6875g.C87074i;
import com.google.android.apps.gsa.search.core.state.p6875g.C87075j;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.C90500h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55351pd;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* compiled from: PG */
public final class TtsState extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323217a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.TtsState");

    /* renamed from: b */
    public final C68214a f323218b;

    /* renamed from: c */
    public final Context f323219c;

    /* renamed from: d */
    public final boolean f323220d;

    /* renamed from: e */
    public final BitFlags f323221e = new BitFlags(getClass()) {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo80425a() {
            TtsState ttsState = TtsState.this;
            long j = ttsState.f323221e.f253762b;
            boolean z = false;
            C58838bb.m90884s(!BitFlags.m148144f(j, 96) && (!BitFlags.m148144f(j, 1) || ttsState.f323225i == null), "Illegal state: ".concat(String.valueOf(toString())));
            long j2 = TtsState.this.f323221e.f253762b;
            if ((BitFlags.m148144f(j2, 2) ? 1 : 0) + (BitFlags.m148144f(j2, 4) ? 1 : 0) + (BitFlags.m148144f(j2, 128) ? 1 : 0) + (BitFlags.m148144f(j2, 512) ? 1 : 0) <= 1) {
                z = true;
            }
            C58838bb.m90887v(z, "Illegal PLAY REQUESTED state: %s", toString());
        }
    };

    /* renamed from: f */
    public Query f323222f = Query.f252741b;

    /* renamed from: g */
    public CardDecision f323223g;

    /* renamed from: h */
    public TtsRequest f323224h;

    /* renamed from: i */
    public C63088z f323225i;

    /* renamed from: j */
    public String f323226j;

    /* renamed from: k */
    private final C68214a f323227k;

    /* renamed from: l */
    private final C68214a f323228l;

    /* renamed from: m */
    private final C68214a f323229m;

    /* renamed from: n */
    private final C68214a f323230n;

    /* renamed from: o */
    private final C68214a f323231o;

    /* renamed from: p */
    private final C68214a f323232p;

    /* renamed from: q */
    private final C68214a f323233q;

    /* renamed from: r */
    private final C84516aa f323234r;

    /* renamed from: s */
    private final C22871g f323235s;

    /* renamed from: t */
    private final C85392b f323236t;

    /* renamed from: u */
    private final SharedPreferences f323237u;

    /* renamed from: v */
    private int f323238v = -1;

    /* renamed from: w */
    private Query f323239w;

    /* renamed from: x */
    private CardDecision f323240x;

    public TtsState(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C84516aa aaVar, Context context, SharedPreferences sharedPreferences, C22871g gVar, C85392b bVar) {
        super(aVar, 153);
        this.f323227k = aVar2;
        this.f323228l = aVar3;
        this.f323229m = aVar4;
        this.f323230n = aVar5;
        this.f323218b = aVar6;
        this.f323231o = aVar7;
        this.f323232p = aVar8;
        this.f323233q = aVar9;
        this.f323234r = aaVar;
        this.f323219c = context;
        this.f323237u = sharedPreferences;
        this.f323235s = gVar;
        this.f323236t = bVar;
        this.f323220d = false;
    }

    /* renamed from: E */
    private final String m193358E() {
        C55349pb pbVar;
        ActionData actionData = ((C116836z) this.f323227k.mo27525b()).f324250j;
        if (actionData == null || (pbVar = actionData.f235993c) == null) {
            return null;
        }
        C55351pd pdVar = pbVar.f145834c;
        if (pdVar == null) {
            pdVar = C55351pd.f145839f;
        }
        if ((pdVar.f145841a & 4) != 0) {
            return pdVar.f145843c;
        }
        return null;
    }

    /* renamed from: F */
    private static boolean m193359F(Query query, SearchError searchError) {
        return query.mo84332bQ() && query.mo84337bV() && searchError != null && searchError.f236024h == 7;
    }

    /* renamed from: G */
    private final boolean m193360G() {
        return !this.f323221e.mo85052e(96);
    }

    /* renamed from: x */
    public static boolean m193361x(C116572aj ajVar) {
        return !ajVar.mo102780g();
    }

    /* renamed from: A */
    public final boolean mo102748A() {
        return BitFlags.m148144f(this.f323221e.f253762b, 8);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = m193358E();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102749B(com.google.android.apps.gsa.search.shared.actions.VoiceAction r11, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = r10.mo102762r()
            r1 = 0
            if (r0 != 0) goto L_0x00ef
            if (r11 == 0) goto L_0x000f
            boolean r11 = r10.mo102768z(r11)
            if (r11 == 0) goto L_0x00ef
        L_0x000f:
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r10.f323221e
            r2 = 646(0x286, double:3.19E-321)
            boolean r11 = r11.mo85052e(r2)
            if (r11 == 0) goto L_0x0023
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.ad r11 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r12 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r11, r12)
            return r1
        L_0x0023:
            r11 = 1
            if (r12 == 0) goto L_0x0047
            java.lang.String r0 = r10.m193358E()
            if (r0 != 0) goto L_0x002d
            goto L_0x0047
        L_0x002d:
            java.lang.String r2 = r12.toString()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0047
            com.google.android.apps.gsa.shared.search.Query r0 = r10.f323222f
            boolean r0 = r0.mo84329bN()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r12.mo81451b()
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r2 = 8
            r4 = 0
            if (r12 == 0) goto L_0x0088
            boolean r6 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.m141979c(r12)
            if (r6 != 0) goto L_0x0088
            if (r0 != 0) goto L_0x0088
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r12.mo81451b()
            if (r0 == 0) goto L_0x0066
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f323221e
            r0 = 512(0x200, double:2.53E-321)
            r14.mo85049c(r4, r0)
            goto L_0x007b
        L_0x0066:
            if (r14 == 0) goto L_0x0074
            boolean r14 = r12.f236281e
            if (r14 != 0) goto L_0x0074
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f323221e
            r0 = 128(0x80, double:6.32E-322)
            r14.mo85049c(r4, r0)
            goto L_0x007b
        L_0x0074:
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f323221e
            r0 = 2
            r14.mo85049c(r4, r0)
        L_0x007b:
            r10.f323224h = r12
            if (r13 == 0) goto L_0x0084
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f323221e
            r12.mo85049c(r4, r2)
        L_0x0084:
            r10.mo102755j()
            goto L_0x00ee
        L_0x0088:
            com.google.android.apps.gsa.shared.search.Query r12 = r10.f323222f
            boolean r12 = r12.mo84385cR()
            if (r12 != 0) goto L_0x00b3
            dagger.a r12 = r10.f323231o
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r12 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r12
            com.google.common.base.ax r12 = r12.f323451b
            if (r12 != 0) goto L_0x00b3
            dagger.a r12 = r10.f323229m
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.bv r12 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv) r12
            boolean r12 = r12.mo102799k()
            if (r12 == 0) goto L_0x00b0
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo102758n()
            return r11
        L_0x00b0:
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r1
        L_0x00b3:
            boolean r12 = r10.mo102766v()
            if (r12 != 0) goto L_0x00bf
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo102758n()
            goto L_0x00ee
        L_0x00bf:
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f323221e
            long r6 = r12.f253762b
            r8 = 1
            boolean r12 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r6, r8)
            if (r12 == 0) goto L_0x00d1
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo102758n()
            goto L_0x00ee
        L_0x00d1:
            if (r0 == 0) goto L_0x00db
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12 = 434(0x1b2, float:6.08E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r12)
            goto L_0x00dd
        L_0x00db:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00dd:
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f323221e
            r0 = 4
            r12.mo85049c(r4, r0)
            if (r13 == 0) goto L_0x00eb
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f323221e
            r12.mo85049c(r4, r2)
        L_0x00eb:
            r10.mo102755j()
        L_0x00ee:
            return r11
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.TtsState.mo102749B(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest, boolean, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo102750C() {
        return BitFlags.m148144f(this.f323221e.f253762b, 1024);
    }

    /* renamed from: D */
    public final boolean mo102751D() {
        boolean z;
        if (!((C116836z) this.f323227k.mo27525b()).mo102986P(((C116735gk) this.f323218b.mo27525b()).f323784p) || mo102767y()) {
            return false;
        }
        CardDecision j = ((C116836z) this.f323227k.mo27525b()).mo103015j();
        int e = ((C116836z) this.f323227k.mo27525b()).mo103012e();
        if (C58832aw.m90831a(this.f323223g, j) && this.f323238v == e) {
            return false;
        }
        this.f323223g = j;
        this.f323238v = e;
        boolean z2 = true;
        if (!this.f323222f.mo84326bK()) {
            if (j.f236266t.isEmpty() ? !TtsRequest.m141979c(j.f236250d) || (this.f323225i != null && mo102766v()) : j.mo81420e(e) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.f323223g == null || !mo102762r() || !j.f236252f || !z || this.f323222f.mo84326bK() || !this.f323221e.mo85054g()) {
                z2 = false;
            }
        }
        if (z2) {
            mo102753g(((C116569ag) this.f323228l.mo27525b()).f323267a, false);
            mo102752e();
        }
        return z2;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.TTS_PLAYBACK_COMPLETE, C87739bu.STOP_SPEAKING};
    }

    /* renamed from: e */
    public final void mo102752e() {
        Query query = ((C116735gk) this.f323218b.mo27525b()).f323784p;
        if ((query.mo84374cG() || query.mo84419cz()) && mo102761q() && !mo102767y() && !mo102762r() && query != this.f323239w) {
            this.f323239w = query;
            Bundle bundle = query.f252786y;
            if (bundle != null) {
                C58976aa aaVar = C58975e.f156826a;
                mo102749B((VoiceAction) null, (TtsRequest) bundle.getParcelable("notification-message"), true, query.mo84372cE());
            }
        }
    }

    /* renamed from: g */
    public final void mo102753g(ClientConfig clientConfig, boolean z) {
        String str;
        Query query = ((C116735gk) this.f323218b.mo27525b()).f323784p;
        SearchError searchError = ((C116611bv) this.f323229m.mo27525b()).f323415e;
        boolean z2 = false;
        if (this.f323226j != null) {
            C58976aa aaVar = C58975e.f156826a;
            str = this.f323226j;
        } else {
            if (z || m193359F(query, searchError)) {
                z2 = true;
                if (query.mo84332bQ()) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (searchError != null && searchError.mo81138R(2)) {
                        new C90873ag(this.f323236t.mo78912a(query), this.f323235s, "maybeRequestPlayTtsInternal", new C116794ip(this, clientConfig, query)).mo85223a(new C116795iq(this, clientConfig, query));
                        return;
                    }
                } else {
                    str = this.f323219c.getString(R.string.action_fallback_long_query_eyes_free_tts);
                }
            }
            str = null;
        }
        mo102754i(clientConfig, query, str, z2);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TtsState");
        fVar.mo85288o("query", this.f323222f);
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323221e.mo85048b()));
        fVar.mo85279c("network").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323225i != null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
        C87074i iVar = (C87074i) C87075j.f235277g.createBuilder();
        long j = this.f323221e.f253762b;
        iVar.copyOnWrite();
        C87075j jVar = (C87075j) iVar.instance;
        jVar.f235280a |= 2;
        jVar.f235282c = j;
        C90488d a = C90500h.m147585a(this.f323222f);
        iVar.copyOnWrite();
        C87075j jVar2 = (C87075j) iVar.instance;
        a.getClass();
        jVar2.f235283d = a;
        jVar2.f235280a |= 4;
        C63088z zVar = this.f323225i;
        if (zVar != null) {
            iVar.copyOnWrite();
            C87075j jVar3 = (C87075j) iVar.instance;
            jVar3.f235280a |= 1;
            jVar3.f235281b = zVar;
        }
        CardDecision cardDecision = this.f323223g;
        if (cardDecision != null) {
            C63088z m = C90772bp.m148305m(cardDecision);
            iVar.copyOnWrite();
            C87075j jVar4 = (C87075j) iVar.instance;
            m.getClass();
            jVar4.f235280a |= 8;
            jVar4.f235284e = m;
        }
        TtsRequest ttsRequest = this.f323224h;
        if (ttsRequest != null) {
            C63088z m2 = C90772bp.m148305m(ttsRequest);
            iVar.copyOnWrite();
            C87075j jVar5 = (C87075j) iVar.instance;
            m2.getClass();
            jVar5.f235280a |= 16;
            jVar5.f235285f = m2;
        }
        bcVar.mo58885m(C87075j.f235278h, (C87075j) iVar.build());
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: hq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80407hq(com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd r8, int r9) {
        /*
            r7 = this;
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.core.state.p6875g.C87075j.f235278h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r8.mo58887l(r0)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r8 = r8.mo58854l(r1)
            if (r8 != 0) goto L_0x0016
            java.lang.Object r8 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r8 = r0.mo58889c(r8)
        L_0x001a:
            com.google.android.apps.gsa.search.core.state.g.j r8 = (com.google.android.apps.gsa.search.core.state.p6875g.C87075j) r8
            int r0 = r8.f235280a
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            com.google.protobuf.z r0 = r8.f235281b
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            r7.f323225i = r0
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r7.f323221e
            long r3 = r0.f253762b
            long r5 = r8.f235282c
            r0.mo85049c(r3, r5)
            com.google.android.apps.gsa.shared.search.b.d r0 = r8.f235283d
            if (r0 != 0) goto L_0x0038
            com.google.android.apps.gsa.shared.search.b.d r0 = com.google.android.apps.gsa.shared.search.p7138b.C90488d.f252873g
        L_0x0038:
            com.google.android.apps.gsa.shared.search.Query r0 = com.google.android.apps.gsa.shared.search.C90500h.m147586b(r0, r9)
            r7.f323222f = r0
            if (r9 != r1) goto L_0x0051
            int r0 = r8.f235280a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0051
            com.google.protobuf.z r0 = r8.f235284e
            android.os.Parcelable$Creator r3 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.CREATOR
            android.os.Parcelable r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148301i(r0, r3)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r0
            goto L_0x0052
        L_0x0051:
            r0 = r2
        L_0x0052:
            r7.f323223g = r0
            if (r9 != r1) goto L_0x0067
            int r9 = r8.f235280a
            r9 = r9 & 16
            if (r9 == 0) goto L_0x0067
            com.google.protobuf.z r8 = r8.f235285f
            android.os.Parcelable$Creator r9 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.CREATOR
            android.os.Parcelable r8 = com.google.android.apps.gsa.shared.util.C90772bp.m148301i(r8, r9)
            r2 = r8
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r2 = (com.google.android.apps.gsa.search.shared.actions.util.TtsRequest) r2
        L_0x0067:
            r7.f323224h = r2
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r8 = r7.mo102767y()
            if (r8 == 0) goto L_0x0074
            r7.mo102758n()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.TtsState.mo80407hq(com.google.android.apps.gsa.search.shared.service.c.b.bd, int):void");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        int ordinal = a.ordinal();
        if (ordinal == 31) {
            mo102758n();
            this.f323236t.mo78913b();
        } else if (ordinal == 37) {
            C116836z zVar = (C116836z) this.f323227k.mo27525b();
            if (mo102767y()) {
                mo102757m();
            }
            if (zVar.mo102985O()) {
                zVar.mo102982L();
            }
        }
    }

    /* renamed from: i */
    public final void mo102754i(ClientConfig clientConfig, Query query, String str, boolean z) {
        CardDecision cardDecision;
        TtsRequest ttsRequest;
        C60870cx cxVar;
        if (str != null) {
            C58976aa aaVar = C58975e.f156826a;
            if ((clientConfig.mo81878H() || query.mo84337bV()) && query != this.f323239w) {
                this.f323239w = query;
                mo102749B((VoiceAction) null, new TtsRequest(str, false), true, false);
                if (z) {
                    ((C89911f) this.f323233q.mo27525b()).mo83755a((Throwable) null, 21171471, 29).mo83721a();
                    return;
                }
                return;
            }
        }
        if (((C116735gk) this.f323218b.mo27525b()).mo102880V(query) && !m193359F(query, ((C116611bv) this.f323229m.mo27525b()).f323415e) && !((C116836z) this.f323227k.mo27525b()).mo102999ad(query) && ((cxVar = ((C116836z) this.f323227k.mo27525b()).f324263w) == null || cxVar.isDone())) {
            boolean W = ((C116735gk) this.f323218b.mo27525b()).mo102881W(query);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1017;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            ((C116569ag) this.f323228l.mo27525b()).mo102773i();
            C58976aa aaVar2 = C58975e.f156826a;
            if (W) {
                query.mo84328bM();
            }
            mo102759o(query);
        }
        if (!((C116836z) this.f323227k.mo27525b()).mo102998ac() || ((C116836z) this.f323227k.mo27525b()).mo103000ae()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return;
        }
        VoiceAction f = ((C116836z) this.f323227k.mo27525b()).mo80807f();
        int e = ((C116836z) this.f323227k.mo27525b()).mo103012e();
        boolean c = ((C116836z) this.f323227k.mo27525b()).f324248h.mo85049c(256, 0);
        if (f != null && (cardDecision = this.f323223g) != null) {
            if (cardDecision != this.f323240x || c) {
                C58976aa aaVar4 = C58975e.f156826a;
                PromptSegment e2 = cardDecision.mo81420e(e);
                if (e2 == null || TtsRequest.m141979c(e2.f236272b)) {
                    ttsRequest = cardDecision.f236250d;
                } else {
                    ttsRequest = e2.f236272b;
                }
                if (!cardDecision.f236252f) {
                    if (mo102768z(f) && !mo102767y()) {
                        mo102758n();
                    }
                    this.f323240x = cardDecision;
                } else if (mo102749B(f, ttsRequest, cardDecision.f236253g, true)) {
                    this.f323240x = cardDecision;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c5, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
        if (r2 == false) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102755j() {
        /*
            r14 = this;
            dagger.a r0 = r14.f323228l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f323267a
            boolean r0 = r0.mo81875E()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            dagger.a r0 = r14.f323218b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r0
            com.google.android.apps.gsa.shared.search.Query r4 = r0.f323784p
            android.content.Context r0 = r14.f323219c
            android.content.SharedPreferences r1 = r14.f323237u
            boolean r0 = com.google.android.apps.gsa.search.core.state.p6876h.C87105a.m140757a(r0, r4, r1)
            dagger.a r1 = r14.f323227k
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r1
            dagger.a r2 = r14.f323218b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r2
            com.google.android.apps.gsa.shared.search.Query r3 = r2.f323784p
            boolean r5 = r3.mo84374cG()
            r6 = 0
            r8 = 0
            r9 = 1
            if (r5 != 0) goto L_0x015d
            boolean r3 = r3.mo84419cz()
            if (r3 == 0) goto L_0x0047
            goto L_0x015d
        L_0x0047:
            dagger.a r3 = r14.f323229m
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.bv r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv) r3
            com.google.android.apps.gsa.search.shared.actions.SearchError r3 = r3.f323415e
            dagger.a r5 = r14.f323228l
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r5
            com.google.android.apps.gsa.search.shared.service.ClientConfig r5 = r5.f323267a
            if (r3 == 0) goto L_0x0067
            boolean r5 = r5.mo81878H()
            if (r5 == 0) goto L_0x0067
            java.lang.String r3 = r3.f236027k
            if (r3 != 0) goto L_0x006f
        L_0x0067:
            com.google.android.apps.gsa.shared.search.Query r3 = r14.f323222f
            boolean r3 = r2.mo102881W(r3)
            if (r3 == 0) goto L_0x0071
        L_0x006f:
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            com.google.android.apps.gsa.shared.search.Query r5 = r14.f323222f
            boolean r5 = r1.mo102986P(r5)
            if (r5 != 0) goto L_0x008e
            if (r3 != 0) goto L_0x008e
            com.google.android.apps.gsa.shared.search.Query r3 = r14.f323222f
            boolean r3 = r2.mo102881W(r3)
            if (r3 == 0) goto L_0x019a
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo102900k()
            boolean r2 = r1.mo102986P(r2)
            if (r2 == 0) goto L_0x019a
        L_0x008e:
            boolean r2 = r14.m193360G()
            if (r2 == 0) goto L_0x019a
            dagger.a r2 = r14.f323228l
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r2
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r2.f323267a
            boolean r2 = r2.mo81900r()
            if (r2 == 0) goto L_0x00b3
            com.google.android.apps.gsa.search.core.aj.aa r2 = r14.f323234r
            boolean r2 = r2.mo78228b()
            if (r2 == 0) goto L_0x00b3
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r14.f323221e
            r10 = 1024(0x400, double:5.06E-321)
            r2.mo85049c(r6, r10)
        L_0x00b3:
            com.google.android.apps.gsa.shared.search.Query r2 = r14.f323222f
            boolean r2 = r2.mo84337bV()
            if (r2 == 0) goto L_0x00bc
            goto L_0x0116
        L_0x00bc:
            dagger.a r2 = r14.f323218b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r2
            com.google.android.apps.gsa.shared.search.Query r3 = r14.f323222f
            boolean r2 = r2.mo102881W(r3)
            if (r2 != 0) goto L_0x0116
            com.google.android.apps.gsa.search.core.aj.aa r2 = r14.f323234r
            boolean r2 = r2.mo78228b()
            if (r2 != 0) goto L_0x00d7
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0116
        L_0x00d7:
            dagger.a r2 = r14.f323232p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.r r2 = (com.google.android.apps.gsa.search.core.state.p6864a.C86803r) r2
            boolean r2 = r2.mo80509n()
            if (r2 == 0) goto L_0x00ef
            com.google.android.apps.gsa.shared.search.Query r2 = r14.f323222f
            boolean r2 = r2.mo84423dD()
            if (r2 != 0) goto L_0x00ef
            r2 = 1
            goto L_0x00f0
        L_0x00ef:
            r2 = 0
        L_0x00f0:
            dagger.a r3 = r14.f323227k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r3
            if (r2 == 0) goto L_0x0112
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r3.mo80807f()
            com.google.android.apps.gsa.shared.search.Query r3 = r14.f323222f
            boolean r3 = r3.mo84466dt()
            if (r3 == 0) goto L_0x010b
            if (r2 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r2 = 0
            goto L_0x010c
        L_0x010b:
            r2 = 1
        L_0x010c:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r2 != 0) goto L_0x0116
            goto L_0x019a
        L_0x0112:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x019a
        L_0x0116:
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = r1.f324250j
            boolean r3 = r14.mo102766v()
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r14.f323221e
            r10 = 642(0x282, double:3.17E-321)
            boolean r5 = r5.mo85052e(r10)
            if (r5 == 0) goto L_0x0129
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x015f
        L_0x0129:
            com.google.protobuf.z r5 = r14.f323225i
            if (r5 == 0) goto L_0x015a
            if (r2 == 0) goto L_0x0146
            boolean r2 = r2.mo81101l()
            if (r2 == 0) goto L_0x0146
            if (r3 == 0) goto L_0x0146
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r14.f323221e
            long r10 = r2.f253762b
            r12 = 4
            boolean r2 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r10, r12)
            if (r2 == 0) goto L_0x0146
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x015f
        L_0x0146:
            boolean r2 = r1.mo102998ac()
            if (r2 != 0) goto L_0x014f
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x019a
        L_0x014f:
            boolean r1 = r1.mo102990U()
            if (r1 != 0) goto L_0x019a
            if (r3 != 0) goto L_0x019a
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x015f
        L_0x015a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x019a
        L_0x015d:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x015f:
            boolean r1 = r14.m193360G()
            if (r1 == 0) goto L_0x019a
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r14.f323221e
            long r2 = r1.f253762b
            r10 = 2
            boolean r5 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r2, r10)
            if (r5 == 0) goto L_0x0173
            r2 = 2
            goto L_0x0188
        L_0x0173:
            r10 = 512(0x200, double:2.53E-321)
            boolean r5 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r2, r10)
            if (r5 == 0) goto L_0x017d
            r2 = 5
            goto L_0x0188
        L_0x017d:
            r10 = 128(0x80, double:6.32E-322)
            boolean r2 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r2, r10)
            if (r2 == 0) goto L_0x0187
            r2 = 4
            goto L_0x0188
        L_0x0187:
            r2 = 3
        L_0x0188:
            if (r0 == 0) goto L_0x018e
            r14.mo102758n()
            goto L_0x019c
        L_0x018e:
            r10 = 32
            boolean r0 = r1.mo85049c(r6, r10)
            if (r0 == 0) goto L_0x019d
            r14.mo80591ar()
            goto L_0x019d
        L_0x019a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x019c:
            r2 = 1
        L_0x019d:
            if (r2 == r9) goto L_0x0220
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r0 = r14.f323224h
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.f236287k
            if (r0 == 0) goto L_0x01a8
            r8 = 1
        L_0x01a8:
            dagger.a r0 = r14.f323227k
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r0
            if (r8 != 0) goto L_0x01b3
            goto L_0x01c7
        L_0x01b3:
            boolean r1 = r0.mo102986P(r4)
            if (r1 == 0) goto L_0x01c7
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r0.f324250j
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r0.mo81092e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x01d7
        L_0x01c7:
            android.content.Context r0 = r14.f323219c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.toString()
        L_0x01d7:
            r1 = 45
            r3 = 95
            java.lang.String r3 = r0.replace(r1, r3)
            com.google.protobuf.z r0 = r14.f323225i
            if (r0 == 0) goto L_0x01f2
            com.google.android.apps.gsa.shared.speech.m r0 = new com.google.android.apps.gsa.shared.speech.m
            r0.<init>()
            com.google.protobuf.z r1 = r14.f323225i
            r0.mo84746b(r1)
            com.google.android.apps.gsa.shared.speech.n r0 = r0.mo84745a()
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            r5 = r0
            com.google.android.apps.gsa.search.core.al.dl.b r1 = r14.f323236t
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r6 = r14.f323224h
            dagger.a r0 = r14.f323228l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f323267a
            boolean r7 = r0.mo81879I()
            dagger.a r0 = r14.f323228l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f323267a
            boolean r8 = r0.mo81897o()
            java.lang.String r9 = r14.m193358E()
            com.google.android.apps.gsa.staticplugins.search.session.state.ir r10 = new com.google.android.apps.gsa.staticplugins.search.session.state.ir
            r10.<init>(r14, r4)
            r1.mo78915d(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.TtsState.mo102755j():void");
    }

    /* renamed from: k */
    public final void mo102756k() {
        if (!mo102750C()) {
            this.f323236t.mo78914c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo102757m() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo102767y()) {
            mo102756k();
        }
    }

    /* renamed from: n */
    public final void mo102758n() {
        if (this.f323221e.mo85049c(32, 64)) {
            mo102751D();
            mo80591ar();
        }
    }

    /* renamed from: o */
    public final void mo102759o(Query query) {
        if (((C116735gk) this.f323218b.mo27525b()).f323784p.mo84383cP(query)) {
            C58976aa aaVar = C58975e.f156826a;
            mo102758n();
        }
    }

    /* renamed from: p */
    public final void mo102760p() {
        if (this.f323222f.mo84337bV()) {
            C59104x d = f323217a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_TtsState");
            ((C59052c) ((C59052c) d).mo56372aa(32310)).mo56386p("setDoneOrReportTtsMissing: Report missing TTS.");
            mo102753g(((C116569ag) this.f323228l.mo27525b()).f323267a, true);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo102758n();
    }

    /* renamed from: q */
    public final boolean mo102761q() {
        return ((C116735gk) this.f323218b.mo27525b()).f323784p.mo84383cP(this.f323222f);
    }

    /* renamed from: r */
    public final boolean mo102762r() {
        return BitFlags.m148144f(this.f323221e.f253762b, 64);
    }

    /* renamed from: s */
    public final boolean mo102763s(CardDecision cardDecision) {
        return mo102762r() && C58832aw.m90831a(this.f323223g, cardDecision) && this.f323238v == ((C116836z) this.f323227k.mo27525b()).mo103012e();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b.equals(r4.mo102840e(r6)) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r3 == null) goto L_0x0080;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102764t() {
        /*
            r8 = this;
            boolean r0 = r8.mo102762r()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            dagger.a r0 = r8.f323218b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r0
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f323784p
            dagger.a r3 = r8.f323229m
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.bv r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv) r3
            com.google.android.apps.gsa.search.shared.actions.SearchError r3 = r3.f323415e
            boolean r4 = r2.mo84431dL()
            r5 = 1
            if (r4 == 0) goto L_0x0081
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r4 = r0.f323791w
            com.google.android.apps.gsa.shared.search.Query r4 = r4.f323727b
            com.google.android.apps.gsa.shared.search.Query r6 = r0.f323784p
            boolean r4 = r6.mo84383cP(r4)
            if (r4 == 0) goto L_0x0043
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r4 = r0.f323791w
            boolean r4 = r4.mo102857h()
            if (r4 != 0) goto L_0x0043
            boolean r4 = r0.mo102881W(r2)
            if (r4 == 0) goto L_0x0080
            boolean r4 = r2.mo84338bW()
            if (r4 != 0) goto L_0x0080
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r4 = r0.f323791w
            boolean r4 = r4.mo102859j(r2)
            if (r4 == 0) goto L_0x006f
            dagger.a r4 = r8.f323230n
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.fq r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116714fq) r4
            dagger.a r6 = r4.f323677a
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r6
            com.google.android.apps.gsa.shared.search.Query r6 = r6.f323784p
            boolean r7 = r4.mo102842i(r6)
            if (r7 == 0) goto L_0x006f
            com.google.android.apps.gsa.search.shared.actions.ActionData r7 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            com.google.android.apps.gsa.search.shared.actions.ActionData r4 = r4.mo102840e(r6)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0080
        L_0x006f:
            boolean r4 = r2.mo84331bP()
            if (r4 == 0) goto L_0x0081
            com.google.android.apps.gsa.shared.search.Query r4 = r0.f323784p
            boolean r4 = r4.mo84383cP(r2)
            if (r4 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            return r5
        L_0x0081:
            dagger.a r4 = r8.f323227k
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r4
            boolean r4 = r4.mo103006as()
            if (r4 == 0) goto L_0x0090
            return r5
        L_0x0090:
            boolean r4 = r2.mo84374cG()
            if (r4 == 0) goto L_0x0097
            return r5
        L_0x0097:
            boolean r4 = r2.mo84419cz()
            if (r4 == 0) goto L_0x009e
            return r5
        L_0x009e:
            dagger.a r4 = r8.f323228l
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r4
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = r4.f323267a
            boolean r0 = r0.mo102881W(r2)
            if (r0 == 0) goto L_0x00af
            return r5
        L_0x00af:
            if (r3 == 0) goto L_0x00bc
            java.lang.String r0 = r3.f236027k
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r4.mo81878H()
            if (r0 == 0) goto L_0x00bc
            return r5
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.TtsState.mo102764t():boolean");
    }

    public final String toString() {
        String b = this.f323221e.mo85048b();
        boolean z = this.f323225i != null;
        String valueOf = String.valueOf(this.f323222f);
        return "S_TtsState(flags=" + b + ", available-network=" + z + ", query=" + valueOf + ")";
    }

    /* renamed from: v */
    public final boolean mo102766v() {
        if (this.f323222f.mo84385cR() && this.f323222f.mo84364bx("android.speech.extra.ACTION_DATA") && this.f323222f.mo84431dL()) {
            return true;
        }
        C116628cl clVar = (C116628cl) this.f323231o.mo27525b();
        Query query = this.f323222f;
        C86247cc e = clVar.mo102807e();
        if (!clVar.f323450a.mo84383cP(query) || e == null || !e.f233135d.f155540e) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean mo102767y() {
        return BitFlags.m148144f(this.f323221e.f253762b, 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo102768z(VoiceAction voiceAction) {
        C116836z zVar = (C116836z) this.f323227k.mo27525b();
        return voiceAction == zVar.mo80807f() && zVar.mo102986P(this.f323222f) && zVar.mo102988S(zVar.f324250j);
    }
}
