package com.google.android.apps.gsa.search.core.state;

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
import com.google.android.apps.gsa.shared.p7066m.C90021c;
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
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55351pd;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* compiled from: PG */
public final class TtsState extends C86898ct {

    /* renamed from: k */
    private static final C59071e f234415k = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.TtsState");

    /* renamed from: A */
    private final C58833ax f234416A;

    /* renamed from: E */
    private int f234417E = -1;

    /* renamed from: F */
    private Query f234418F;

    /* renamed from: G */
    private CardDecision f234419G;

    /* renamed from: a */
    public final C68214a f234420a;

    /* renamed from: b */
    public final Context f234421b;

    /* renamed from: c */
    public final boolean f234422c;

    /* renamed from: d */
    public final BitFlags f234423d = new BitFlags(getClass()) {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo80425a() {
            TtsState ttsState = TtsState.this;
            long j = ttsState.f234423d.f253762b;
            boolean z = false;
            C58838bb.m90884s(!BitFlags.m148144f(j, 96) && (!BitFlags.m148144f(j, 1) || ttsState.f234427h == null), "Illegal state: ".concat(String.valueOf(toString())));
            long j2 = TtsState.this.f234423d.f253762b;
            if ((BitFlags.m148144f(j2, 2) ? 1 : 0) + (BitFlags.m148144f(j2, 4) ? 1 : 0) + (BitFlags.m148144f(j2, 128) ? 1 : 0) + (BitFlags.m148144f(j2, 512) ? 1 : 0) <= 1) {
                z = true;
            }
            C58838bb.m90887v(z, "Illegal PLAY REQUESTED state: %s", toString());
        }
    };

    /* renamed from: e */
    public Query f234424e = Query.f252741b;

    /* renamed from: f */
    public CardDecision f234425f;

    /* renamed from: g */
    public TtsRequest f234426g;

    /* renamed from: h */
    public C63088z f234427h;

    /* renamed from: i */
    public SettableFuture f234428i;

    /* renamed from: j */
    public String f234429j;

    /* renamed from: l */
    private final C68214a f234430l;

    /* renamed from: m */
    private final C68214a f234431m;

    /* renamed from: n */
    private final C68214a f234432n;

    /* renamed from: o */
    private final C68214a f234433o;

    /* renamed from: p */
    private final C68214a f234434p;

    /* renamed from: q */
    private final C68214a f234435q;

    /* renamed from: r */
    private final C68214a f234436r;

    /* renamed from: s */
    private final C68214a f234437s;

    /* renamed from: t */
    private final C84516aa f234438t;

    /* renamed from: u */
    private final C22871g f234439u;

    /* renamed from: v */
    private final C85392b f234440v;

    /* renamed from: w */
    private final SharedPreferences f234441w;

    /* renamed from: x */
    private final C90021c f234442x;

    /* renamed from: y */
    private final C68214a f234443y;

    /* renamed from: z */
    private final C68214a f234444z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TtsState(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C90021c cVar, C68214a aVar9, C68214a aVar10, C84516aa aaVar, Context context, SharedPreferences sharedPreferences, C22871g gVar, C85392b bVar, C58833ax axVar, C68214a aVar11, C68214a aVar12) {
        super(aVar, 52);
        C68214a aVar13 = aVar;
        this.f234430l = aVar2;
        this.f234431m = aVar3;
        this.f234432n = aVar4;
        this.f234433o = aVar5;
        this.f234420a = aVar6;
        this.f234434p = aVar7;
        this.f234435q = aVar8;
        this.f234437s = aVar10;
        this.f234436r = aVar9;
        this.f234438t = aaVar;
        this.f234421b = context;
        this.f234441w = sharedPreferences;
        this.f234439u = gVar;
        this.f234440v = bVar;
        this.f234442x = cVar;
        this.f234422c = false;
        this.f234416A = axVar;
        this.f234443y = aVar11;
        this.f234444z = aVar12;
    }

    /* renamed from: D */
    private final String m139845D() {
        C55349pb pbVar;
        ActionData actionData = ((C87171z) this.f234430l.mo27525b()).f235555j;
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

    /* renamed from: E */
    private static boolean m139846E(Query query, SearchError searchError) {
        return query.mo84332bQ() && query.mo84337bV() && searchError != null && searchError.f236024h == 7;
    }

    /* renamed from: F */
    private final boolean m139847F() {
        return !this.f234423d.mo85052e(96);
    }

    /* renamed from: A */
    public final boolean mo80399A() {
        return BitFlags.m148144f(this.f234423d.f253762b, 8);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = m139845D();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80400B(com.google.android.apps.gsa.search.shared.actions.VoiceAction r11, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = r10.mo80418s()
            r1 = 0
            if (r0 != 0) goto L_0x00dc
            if (r11 == 0) goto L_0x000f
            boolean r11 = r10.mo80424z(r11)
            if (r11 == 0) goto L_0x00dc
        L_0x000f:
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r10.f234423d
            r2 = 646(0x286, double:3.19E-321)
            boolean r11 = r11.mo85052e(r2)
            if (r11 == 0) goto L_0x0021
            com.google.common.f.ad r11 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r12 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r11, r12)
            return r1
        L_0x0021:
            r11 = 1
            if (r12 == 0) goto L_0x0045
            java.lang.String r0 = r10.m139845D()
            if (r0 != 0) goto L_0x002b
            goto L_0x0045
        L_0x002b:
            java.lang.String r2 = r12.toString()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0045
            com.google.android.apps.gsa.shared.search.Query r0 = r10.f234424e
            boolean r0 = r0.mo84329bN()
            if (r0 != 0) goto L_0x0045
            boolean r0 = r12.mo81451b()
            if (r0 != 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r2 = 8
            r4 = 0
            if (r12 == 0) goto L_0x0084
            boolean r6 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.m141979c(r12)
            if (r6 != 0) goto L_0x0084
            if (r0 != 0) goto L_0x0084
            boolean r0 = r12.mo81451b()
            if (r0 == 0) goto L_0x0062
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f234423d
            r0 = 512(0x200, double:2.53E-321)
            r14.mo85049c(r4, r0)
            goto L_0x0077
        L_0x0062:
            if (r14 == 0) goto L_0x0070
            boolean r14 = r12.f236281e
            if (r14 != 0) goto L_0x0070
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f234423d
            r0 = 128(0x80, double:6.32E-322)
            r14.mo85049c(r4, r0)
            goto L_0x0077
        L_0x0070:
            com.google.android.apps.gsa.shared.util.BitFlags r14 = r10.f234423d
            r0 = 2
            r14.mo85049c(r4, r0)
        L_0x0077:
            r10.f234426g = r12
            if (r13 == 0) goto L_0x0080
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f234423d
            r12.mo85049c(r4, r2)
        L_0x0080:
            r10.mo80409i()
            goto L_0x00db
        L_0x0084:
            com.google.android.apps.gsa.shared.search.Query r12 = r10.f234424e
            boolean r12 = r12.mo84385cR()
            if (r12 != 0) goto L_0x00a9
            dagger.a r12 = r10.f234434p
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.state.cy r12 = (com.google.android.apps.gsa.search.core.state.C86903cy) r12
            com.google.common.base.ax r12 = r12.f234679b
            if (r12 != 0) goto L_0x00a9
            dagger.a r12 = r10.f234432n
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.state.co r12 = (com.google.android.apps.gsa.search.core.state.C86893co) r12
            com.google.android.apps.gsa.search.shared.actions.SearchError r12 = r12.f234656d
            if (r12 == 0) goto L_0x00a8
            r10.mo80412m()
            return r11
        L_0x00a8:
            return r1
        L_0x00a9:
            boolean r12 = r10.mo80422x()
            if (r12 != 0) goto L_0x00b3
            r10.mo80412m()
            goto L_0x00db
        L_0x00b3:
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f234423d
            long r6 = r12.f253762b
            r8 = 1
            boolean r12 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r6, r8)
            if (r12 == 0) goto L_0x00c3
            r10.mo80412m()
            goto L_0x00db
        L_0x00c3:
            if (r0 == 0) goto L_0x00ca
            r12 = 434(0x1b2, float:6.08E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r12)
        L_0x00ca:
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f234423d
            r0 = 4
            r12.mo85049c(r4, r0)
            if (r13 == 0) goto L_0x00d8
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r10.f234423d
            r12.mo85049c(r4, r2)
        L_0x00d8:
            r10.mo80409i()
        L_0x00db:
            return r11
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.mo80400B(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest, boolean, boolean):boolean");
    }

    /* renamed from: C */
    public final boolean mo80401C() {
        boolean z;
        if (!((C87171z) this.f234430l.mo27525b()).mo80781M(((C87052fn) this.f234420a.mo27525b()).f235177m) || mo80423y()) {
            return false;
        }
        CardDecision g = ((C87171z) this.f234430l.mo27525b()).mo80808g();
        int a = ((C87171z) this.f234430l.mo27525b()).mo80794a();
        if (C58832aw.m90831a(this.f234425f, g) && this.f234417E == a) {
            return false;
        }
        this.f234425f = g;
        this.f234417E = a;
        boolean z2 = true;
        if (!this.f234424e.mo84326bK()) {
            if (g.f236266t.isEmpty() ? !TtsRequest.m141979c(g.f236250d) || (this.f234427h != null && mo80422x()) : g.mo81420e(a) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.f234425f == null || !mo80418s() || !g.f236252f || !z || this.f234424e.mo84326bK() || !this.f234423d.mo85054g()) {
                z2 = false;
            }
        }
        if (z2) {
            mo80404e(((C86812ai) this.f234431m.mo27525b()).f234471a, false);
            mo80402a();
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo80402a() {
        Query query = ((C87052fn) this.f234420a.mo27525b()).f235177m;
        if ((query.mo84374cG() || query.mo84419cz()) && mo80417r() && !mo80423y() && !mo80418s() && query != this.f234418F) {
            this.f234418F = query;
            Bundle bundle = query.f252786y;
            if (bundle != null) {
                TtsRequest ttsRequest = (TtsRequest) bundle.getParcelable("notification-message");
                boolean cE = query.mo84372cE();
                boolean z = false;
                if (query.mo84403cj() && query.mo84372cE()) {
                    z = true;
                }
                mo80400B((VoiceAction) null, ttsRequest, !z, cE);
            }
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.TTS_PLAYBACK_COMPLETE, C87739bu.STOP_SPEAKING};
    }

    /* renamed from: e */
    public final void mo80404e(ClientConfig clientConfig, boolean z) {
        Query query = ((C87052fn) this.f234420a.mo27525b()).f235177m;
        SearchError searchError = ((C86893co) this.f234432n.mo27525b()).f234656d;
        String str = this.f234429j;
        boolean z2 = false;
        if (str == null) {
            str = null;
            if (z || m139846E(query, searchError)) {
                z2 = true;
                if (!query.mo84332bQ()) {
                    str = this.f234421b.getString(R.string.action_fallback_long_query_eyes_free_tts);
                } else if (searchError != null && searchError.mo81138R(2)) {
                    new C90873ag(this.f234440v.mo78912a(query), this.f234439u, "maybeRequestPlayTtsInternal", new C87118hm(this, clientConfig, query)).mo85223a(new C87119hn(this, clientConfig, query));
                    return;
                }
            }
        }
        mo80405g(clientConfig, query, str, z2);
    }

    /* renamed from: g */
    public final void mo80405g(ClientConfig clientConfig, Query query, String str, boolean z) {
        CardDecision cardDecision;
        TtsRequest ttsRequest;
        C60870cx cxVar;
        if (str == null || ((!clientConfig.mo81878H() && !query.mo84337bV()) || query == this.f234418F)) {
            if (((C87052fn) this.f234420a.mo27525b()).mo80691L(query) && !m139846E(query, ((C86893co) this.f234432n.mo27525b()).f234656d) && !((C87171z) this.f234430l.mo27525b()).mo80792Y(query) && ((cxVar = ((C87171z) this.f234430l.mo27525b()).f235570y) == null || cxVar.isDone())) {
                boolean M = ((C87052fn) this.f234420a.mo27525b()).mo80692M(query);
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1017;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                ((C86812ai) this.f234431m.mo27525b()).mo80518e();
                if (M) {
                    query.mo84328bM();
                }
                mo80413n(query);
            }
            if (((C87171z) this.f234430l.mo27525b()).mo80791X() && !((C87171z) this.f234430l.mo27525b()).mo80793Z()) {
                VoiceAction f = ((C87171z) this.f234430l.mo27525b()).mo80807f();
                int a = ((C87171z) this.f234430l.mo27525b()).mo80794a();
                boolean c = ((C87171z) this.f234430l.mo27525b()).f235552g.mo85049c(256, 0);
                if (f != null && (cardDecision = this.f234425f) != null) {
                    if (cardDecision != this.f234419G || c) {
                        PromptSegment e = cardDecision.mo81420e(a);
                        if (e == null || TtsRequest.m141979c(e.f236272b)) {
                            ttsRequest = cardDecision.f236250d;
                        } else {
                            ttsRequest = e.f236272b;
                        }
                        if (!cardDecision.f236252f) {
                            if (mo80424z(f) && !mo80423y()) {
                                mo80412m();
                            }
                            this.f234419G = cardDecision;
                        } else if (mo80400B(f, ttsRequest, cardDecision.f236253g, true)) {
                            this.f234419G = cardDecision;
                        }
                    }
                }
            }
        } else {
            this.f234418F = query;
            mo80400B((VoiceAction) null, new TtsRequest(str, false), true, false);
            if (z) {
                ((C89911f) this.f234437s.mo27525b()).mo83755a((Throwable) null, 21171471, 29).mo83721a();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TtsState");
        fVar.mo85288o("query", this.f234424e);
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f234423d.mo85048b()));
        fVar.mo85279c("network").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234427h != null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87074i iVar = (C87074i) C87075j.f235277g.createBuilder();
        long j = this.f234423d.f253762b;
        iVar.copyOnWrite();
        C87075j jVar = (C87075j) iVar.instance;
        jVar.f235280a |= 2;
        jVar.f235282c = j;
        C90488d a = C90500h.m147585a(this.f234424e);
        iVar.copyOnWrite();
        C87075j jVar2 = (C87075j) iVar.instance;
        a.getClass();
        jVar2.f235283d = a;
        jVar2.f235280a |= 4;
        C63088z zVar = this.f234427h;
        if (zVar != null) {
            iVar.copyOnWrite();
            C87075j jVar3 = (C87075j) iVar.instance;
            jVar3.f235280a |= 1;
            jVar3.f235281b = zVar;
        }
        CardDecision cardDecision = this.f234425f;
        if (cardDecision != null) {
            C63088z m = C90772bp.m148305m(cardDecision);
            iVar.copyOnWrite();
            C87075j jVar4 = (C87075j) iVar.instance;
            m.getClass();
            jVar4.f235280a |= 8;
            jVar4.f235284e = m;
        }
        TtsRequest ttsRequest = this.f234426g;
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

    /* JADX WARNING: type inference failed for: r8v7, types: [android.os.Parcelable] */
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
            r7.f234427h = r0
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r7.f234423d
            long r3 = r0.f253762b
            long r5 = r8.f235282c
            r0.mo85049c(r3, r5)
            com.google.android.apps.gsa.shared.search.b.d r0 = r8.f235283d
            if (r0 != 0) goto L_0x0038
            com.google.android.apps.gsa.shared.search.b.d r0 = com.google.android.apps.gsa.shared.search.p7138b.C90488d.f252873g
        L_0x0038:
            com.google.android.apps.gsa.shared.search.Query r0 = com.google.android.apps.gsa.shared.search.C90500h.m147586b(r0, r9)
            r7.f234424e = r0
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
            r7.f234425f = r0
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
            r7.f234426g = r2
            boolean r8 = r7.mo80423y()
            if (r8 == 0) goto L_0x0072
            r7.mo80412m()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.mo80407hq(com.google.android.apps.gsa.search.shared.service.c.b.bd, int):void");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 31) {
            mo80412m();
            this.f234440v.mo78913b();
        } else if (ordinal == 37) {
            C87171z zVar = (C87171z) this.f234430l.mo27525b();
            if (mo80423y()) {
                mo80411k();
            }
            if (zVar.mo80780L()) {
                zVar.mo80777I();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (r5 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0147, code lost:
        if (r7 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0179, code lost:
        if (com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b.equals(r5) != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0191, code lost:
        if (com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r11.f234423d.f253762b, 4) == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        if (r7 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80409i() {
        /*
            r11 = this;
            dagger.a r0 = r11.f234431m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r0 = (com.google.android.apps.gsa.search.core.state.C86812ai) r0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f234471a
            boolean r0 = r0.mo81875E()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            dagger.a r0 = r11.f234420a
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r0 = (com.google.android.apps.gsa.search.core.state.C87052fn) r0
            com.google.android.apps.gsa.shared.search.Query r4 = r0.f235177m
            android.content.Context r0 = r11.f234421b
            android.content.SharedPreferences r1 = r11.f234441w
            boolean r0 = com.google.android.apps.gsa.search.core.state.p6876h.C87105a.m140757a(r0, r4, r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0070
            dagger.a r0 = r11.f234430l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r0 = (com.google.android.apps.gsa.search.core.state.C87171z) r0
            com.google.android.apps.gsa.search.shared.actions.ActionData r3 = r0.f235555j
            com.google.common.base.ax r5 = r11.f234416A
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x006e
            com.google.common.base.ax r5 = r11.f234416A
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.nga.api.bp r5 = (com.google.android.apps.gsa.nga.api.C74715bp) r5
            boolean r5 = r5.mo71084e()
            if (r5 == 0) goto L_0x006e
            dagger.a r5 = r11.f234420a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r5 = (com.google.android.apps.gsa.search.core.state.C87052fn) r5
            com.google.android.apps.gsa.shared.search.Query r5 = r5.f235177m
            boolean r0 = r0.mo80781M(r5)
            if (r0 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            com.google.android.apps.gsa.shared.m.c r0 = r11.f234442x
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251055bb
            com.google.common.b.gu r0 = r0.mo79745c(r5)
            com.google.bb.a.x r3 = r3.f235998h
            java.lang.String r3 = r3.name()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            dagger.a r3 = r11.f234430l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r3 = (com.google.android.apps.gsa.search.core.state.C87171z) r3
            dagger.a r5 = r11.f234420a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r5 = (com.google.android.apps.gsa.search.core.state.C87052fn) r5
            com.google.android.apps.gsa.shared.search.Query r6 = r5.f235177m
            boolean r7 = r6.mo84374cG()
            if (r7 != 0) goto L_0x01a3
            boolean r7 = r6.mo84419cz()
            if (r7 == 0) goto L_0x0091
            goto L_0x01a3
        L_0x0091:
            dagger.a r7 = r11.f234432n
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.state.co r7 = (com.google.android.apps.gsa.search.core.state.C86893co) r7
            com.google.android.apps.gsa.search.shared.actions.SearchError r7 = r7.f234656d
            dagger.a r8 = r11.f234431m
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r8 = (com.google.android.apps.gsa.search.core.state.C86812ai) r8
            com.google.android.apps.gsa.search.shared.service.ClientConfig r8 = r8.f234471a
            if (r7 == 0) goto L_0x00b1
            boolean r8 = r8.mo81878H()
            if (r8 == 0) goto L_0x00b1
            java.lang.String r7 = r7.f236027k
            if (r7 != 0) goto L_0x00b9
        L_0x00b1:
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            boolean r7 = r5.mo80692M(r7)
            if (r7 == 0) goto L_0x00bb
        L_0x00b9:
            r7 = 1
            goto L_0x00bc
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            com.google.android.apps.gsa.shared.search.Query r8 = r11.f234424e
            boolean r8 = r3.mo80781M(r8)
            if (r8 != 0) goto L_0x00d8
            if (r7 != 0) goto L_0x00d8
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            boolean r7 = r5.mo80692M(r7)
            if (r7 == 0) goto L_0x01e0
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo80710j()
            boolean r5 = r3.mo80781M(r5)
            if (r5 == 0) goto L_0x01e0
        L_0x00d8:
            boolean r5 = r11.m139847F()
            if (r5 == 0) goto L_0x01e0
            com.google.android.apps.gsa.shared.search.Query r5 = r11.f234424e
            boolean r5 = r5.mo84337bV()
            if (r5 == 0) goto L_0x00e7
            goto L_0x014b
        L_0x00e7:
            dagger.a r5 = r11.f234420a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r5 = (com.google.android.apps.gsa.search.core.state.C87052fn) r5
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            boolean r5 = r5.mo80692M(r7)
            if (r5 != 0) goto L_0x014b
            com.google.android.apps.gsa.search.core.aj.aa r5 = r11.f234438t
            boolean r5 = r5.mo78228b()
            if (r5 == 0) goto L_0x014b
            dagger.a r5 = r11.f234435q
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.r r5 = (com.google.android.apps.gsa.search.core.state.p6864a.C86803r) r5
            boolean r5 = r5.mo80509n()
            if (r5 == 0) goto L_0x0117
            com.google.android.apps.gsa.shared.search.Query r5 = r11.f234424e
            boolean r5 = r5.mo84423dD()
            if (r5 != 0) goto L_0x0117
            r5 = 1
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            boolean r7 = r7.mo84403cj()
            if (r7 == 0) goto L_0x012c
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            java.lang.String r8 = "android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN"
            boolean r7 = r7.mo84363bw(r8)
            if (r7 == 0) goto L_0x012c
            r7 = 1
            goto L_0x012d
        L_0x012c:
            r7 = 0
        L_0x012d:
            dagger.a r8 = r11.f234430l
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r8 = (com.google.android.apps.gsa.search.core.state.C87171z) r8
            if (r5 == 0) goto L_0x0147
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r8.mo80807f()
            com.google.android.apps.gsa.shared.search.Query r7 = r11.f234424e
            boolean r7 = r7.mo84466dt()
            if (r7 == 0) goto L_0x014b
            if (r5 != 0) goto L_0x014b
            goto L_0x01e0
        L_0x0147:
            if (r7 != 0) goto L_0x014b
            goto L_0x01e0
        L_0x014b:
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = r3.f235555j
            boolean r7 = r11.mo80422x()
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r11.f234423d
            r9 = 642(0x282, double:3.17E-321)
            boolean r8 = r8.mo85052e(r9)
            if (r8 != 0) goto L_0x01a3
            com.google.protobuf.z r8 = r11.f234427h
            if (r8 == 0) goto L_0x01e0
            boolean r6 = r6.mo84403cj()
            if (r6 == 0) goto L_0x017d
            dagger.a r6 = r11.f234436r
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.state.eq r6 = (com.google.android.apps.gsa.search.core.state.C87023eq) r6
            boolean r6 = r6.f235053r
            if (r6 != 0) goto L_0x017d
            if (r5 == 0) goto L_0x01e0
            com.google.android.apps.gsa.search.shared.actions.ActionData r6 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x017d
            goto L_0x01e0
        L_0x017d:
            if (r5 == 0) goto L_0x0193
            boolean r5 = r5.mo81101l()
            if (r5 == 0) goto L_0x0193
            if (r7 == 0) goto L_0x0193
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r11.f234423d
            long r5 = r5.f253762b
            r8 = 4
            boolean r5 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r8)
            if (r5 != 0) goto L_0x01a3
        L_0x0193:
            boolean r5 = r3.mo80791X()
            if (r5 != 0) goto L_0x019a
            goto L_0x01e0
        L_0x019a:
            boolean r3 = r3.mo80784Q()
            if (r3 != 0) goto L_0x01e0
            if (r7 == 0) goto L_0x01a3
            goto L_0x01e0
        L_0x01a3:
            boolean r3 = r11.m139847F()
            if (r3 == 0) goto L_0x01e0
            com.google.android.apps.gsa.shared.util.BitFlags r3 = r11.f234423d
            long r5 = r3.f253762b
            r7 = 2
            boolean r7 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r7)
            if (r7 == 0) goto L_0x01b7
            r5 = 2
            goto L_0x01cc
        L_0x01b7:
            r7 = 512(0x200, double:2.53E-321)
            boolean r7 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r7)
            if (r7 == 0) goto L_0x01c1
            r5 = 5
            goto L_0x01cc
        L_0x01c1:
            r7 = 128(0x80, double:6.32E-322)
            boolean r5 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r7)
            if (r5 == 0) goto L_0x01cb
            r5 = 4
            goto L_0x01cc
        L_0x01cb:
            r5 = 3
        L_0x01cc:
            if (r0 == 0) goto L_0x01d2
            r11.mo80412m()
            goto L_0x01e0
        L_0x01d2:
            r6 = 0
            r8 = 32
            boolean r0 = r3.mo85049c(r6, r8)
            if (r0 == 0) goto L_0x01e1
            r11.mo80591ar()
            goto L_0x01e1
        L_0x01e0:
            r5 = 1
        L_0x01e1:
            if (r5 == r2) goto L_0x0283
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r0 = r11.f234426g
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r0.f236287k
            if (r0 == 0) goto L_0x01ec
            r1 = 1
        L_0x01ec:
            dagger.a r0 = r11.f234430l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r0 = (com.google.android.apps.gsa.search.core.state.C87171z) r0
            if (r1 != 0) goto L_0x01f7
            goto L_0x020c
        L_0x01f7:
            boolean r1 = r0.mo80781M(r4)
            if (r1 == 0) goto L_0x020c
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r0.f235555j
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = r0.mo81092e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x020c
            goto L_0x0239
        L_0x020c:
            dagger.a r0 = r11.f234444z
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250270V
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0229
            dagger.a r0 = r11.f234443y
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.carassistant.e.c r0 = (com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c) r0
            java.lang.String r0 = r0.mo79343a()
            goto L_0x0239
        L_0x0229:
            android.content.Context r0 = r11.f234421b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.toString()
        L_0x0239:
            r1 = 45
            r2 = 95
            java.lang.String r3 = r0.replace(r1, r2)
            com.google.protobuf.z r0 = r11.f234427h
            if (r0 == 0) goto L_0x0254
            com.google.android.apps.gsa.shared.speech.m r0 = new com.google.android.apps.gsa.shared.speech.m
            r0.<init>()
            com.google.protobuf.z r1 = r11.f234427h
            r0.mo84746b(r1)
            com.google.android.apps.gsa.shared.speech.n r0 = r0.mo84745a()
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            com.google.android.apps.gsa.search.core.al.dl.b r1 = r11.f234440v
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r6 = r11.f234426g
            dagger.a r2 = r11.f234431m
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r2 = (com.google.android.apps.gsa.search.core.state.C86812ai) r2
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r2.f234471a
            boolean r7 = r2.mo81879I()
            dagger.a r2 = r11.f234431m
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r2 = (com.google.android.apps.gsa.search.core.state.C86812ai) r2
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r2.f234471a
            boolean r8 = r2.mo81897o()
            java.lang.String r9 = r11.m139845D()
            com.google.android.apps.gsa.search.core.state.ho r10 = new com.google.android.apps.gsa.search.core.state.ho
            r10.<init>(r11, r4)
            r2 = r5
            r5 = r0
            r1.mo78915d(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.mo80409i():void");
    }

    /* renamed from: j */
    public final void mo80410j(Query query, C63088z zVar) {
        if (((C87052fn) this.f234420a.mo27525b()).f235177m.mo84383cP(query) && !BitFlags.m148144f(this.f234423d.f253762b, 1) && this.f234427h == null) {
            this.f234427h = zVar;
            zVar.mo59031d();
            if (this.f234428i != null) {
                mo80415p(C58833ax.m90834k(zVar));
                mo80412m();
                if (mo80421v()) {
                    mo80591ar();
                    return;
                }
                return;
            }
            mo80409i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo80411k() {
        if (mo80423y()) {
            mo80416q();
        }
    }

    /* renamed from: m */
    public final void mo80412m() {
        SettableFuture settableFuture = this.f234428i;
        if (settableFuture != null && !settableFuture.isDone()) {
            mo80415p(C58836b.f156633a);
        }
        if (this.f234423d.mo85049c(32, 64)) {
            mo80401C();
            mo80591ar();
        }
    }

    /* renamed from: n */
    public final void mo80413n(Query query) {
        if (((C87052fn) this.f234420a.mo27525b()).f235177m.mo84383cP(query)) {
            mo80412m();
        }
    }

    /* renamed from: o */
    public final void mo80414o() {
        if (!this.f234424e.mo84337bV() || this.f234424e.mo84403cj()) {
            mo80412m();
            return;
        }
        ((C59052c) ((C59052c) f234415k.mo56226d()).mo56372aa(8962)).mo56386p("setDoneOrReportTtsMissing: Report missing TTS.");
        mo80404e(((C86812ai) this.f234431m.mo27525b()).f234471a, true);
    }

    /* renamed from: p */
    public final void mo80415p(C58833ax axVar) {
        SettableFuture settableFuture = this.f234428i;
        if (settableFuture != null) {
            settableFuture.mo57356n(axVar);
            this.f234428i = null;
        }
    }

    /* renamed from: q */
    public final void mo80416q() {
        this.f234440v.mo78914c();
    }

    /* renamed from: r */
    public final boolean mo80417r() {
        return ((C87052fn) this.f234420a.mo27525b()).f235177m.mo84383cP(this.f234424e);
    }

    /* renamed from: s */
    public final boolean mo80418s() {
        return BitFlags.m148144f(this.f234423d.f253762b, 64);
    }

    /* renamed from: t */
    public final boolean mo80419t(CardDecision cardDecision) {
        return mo80418s() && C58832aw.m90831a(this.f234425f, cardDecision) && this.f234417E == ((C87171z) this.f234430l.mo27525b()).mo80794a();
    }

    public final String toString() {
        String b = this.f234423d.mo85048b();
        boolean z = this.f234427h != null;
        String valueOf = String.valueOf(this.f234424e);
        return "TtsState(flags=" + b + ", available-network=" + z + ", query=" + valueOf + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b.equals(r5.mo80642a(r6)) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r4 == null) goto L_0x008c;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80421v() {
        /*
            r8 = this;
            com.google.common.util.concurrent.SettableFuture r0 = r8.f234428i
            r1 = 1
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            boolean r0 = r8.mo80418s()
            r2 = 0
            if (r0 == 0) goto L_0x0015
            return r2
        L_0x0015:
            dagger.a r0 = r8.f234420a
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r0 = (com.google.android.apps.gsa.search.core.state.C87052fn) r0
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f235177m
            dagger.a r4 = r8.f234432n
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.co r4 = (com.google.android.apps.gsa.search.core.state.C86893co) r4
            com.google.android.apps.gsa.search.shared.actions.SearchError r4 = r4.f234656d
            boolean r5 = r3.mo84431dL()
            if (r5 == 0) goto L_0x008d
            com.google.android.apps.gsa.search.core.state.fm r5 = r0.f235184t
            com.google.android.apps.gsa.shared.search.Query r5 = r5.f235136b
            com.google.android.apps.gsa.shared.search.Query r6 = r0.f235177m
            boolean r5 = r6.mo84383cP(r5)
            if (r5 == 0) goto L_0x004f
            com.google.android.apps.gsa.search.core.state.fm r5 = r0.f235184t
            boolean r5 = r5.mo80678h()
            if (r5 != 0) goto L_0x004f
            boolean r5 = r0.mo80692M(r3)
            if (r5 == 0) goto L_0x008c
            boolean r5 = r3.mo84338bW()
            if (r5 != 0) goto L_0x008c
        L_0x004f:
            com.google.android.apps.gsa.search.core.state.fm r5 = r0.f235184t
            boolean r5 = r5.mo80680j(r3)
            if (r5 == 0) goto L_0x007b
            dagger.a r5 = r8.f234433o
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.ev r5 = (com.google.android.apps.gsa.search.core.state.C87028ev) r5
            dagger.a r6 = r5.f235073b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r6 = (com.google.android.apps.gsa.search.core.state.C87052fn) r6
            com.google.android.apps.gsa.shared.search.Query r6 = r6.f235177m
            boolean r7 = r5.mo80645i(r6)
            if (r7 == 0) goto L_0x007b
            com.google.android.apps.gsa.search.shared.actions.ActionData r7 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = r5.mo80642a(r6)
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x008c
        L_0x007b:
            boolean r5 = r3.mo84331bP()
            if (r5 == 0) goto L_0x008d
            com.google.android.apps.gsa.shared.search.Query r5 = r0.f235177m
            boolean r5 = r5.mo84383cP(r3)
            if (r5 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r1
        L_0x008d:
            dagger.a r5 = r8.f234430l
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r5 = (com.google.android.apps.gsa.search.core.state.C87171z) r5
            boolean r5 = r5.mo80799af()
            if (r5 == 0) goto L_0x009c
            return r1
        L_0x009c:
            boolean r5 = r3.mo84374cG()
            if (r5 == 0) goto L_0x00a3
            return r1
        L_0x00a3:
            boolean r5 = r3.mo84419cz()
            if (r5 == 0) goto L_0x00aa
            return r1
        L_0x00aa:
            dagger.a r5 = r8.f234431m
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r5 = (com.google.android.apps.gsa.search.core.state.C86812ai) r5
            com.google.android.apps.gsa.search.shared.service.ClientConfig r5 = r5.f234471a
            boolean r0 = r0.mo80692M(r3)
            if (r0 == 0) goto L_0x00bb
            return r1
        L_0x00bb:
            if (r4 == 0) goto L_0x00c8
            java.lang.String r0 = r4.f236027k
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r5.mo81878H()
            if (r0 == 0) goto L_0x00c8
            return r1
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.mo80421v():boolean");
    }

    /* renamed from: x */
    public final boolean mo80422x() {
        if (this.f234424e.mo84385cR() && this.f234424e.mo84364bx("android.speech.extra.ACTION_DATA") && this.f234424e.mo84431dL()) {
            return true;
        }
        C86903cy cyVar = (C86903cy) this.f234434p.mo27525b();
        Query query = this.f234424e;
        C86247cc a = cyVar.mo80561a();
        if (!cyVar.f234678a.mo84383cP(query) || a == null || !a.f233135d.f155540e) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean mo80423y() {
        return BitFlags.m148144f(this.f234423d.f253762b, 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo80424z(VoiceAction voiceAction) {
        C87171z zVar = (C87171z) this.f234430l.mo27525b();
        return voiceAction == zVar.mo80807f() && zVar.mo80781M(this.f234424e) && zVar.mo80783P(zVar.f235555j);
    }
}
