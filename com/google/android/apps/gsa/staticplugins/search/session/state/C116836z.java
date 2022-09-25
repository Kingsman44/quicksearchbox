package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6890a.C87297a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86803r;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87399b;
import com.google.android.apps.gsa.search.shared.actions.C87401c;
import com.google.android.apps.gsa.search.shared.actions.C87412e;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.search.shared.actions.C87478u;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.PromoAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.ImageInfo;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87708aq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87709ar;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87754ci;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87772d;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87826f;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87934j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87988l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88201sx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88208td;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88209te;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88224tt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88226tv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88227tw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88229ty;
import com.google.android.apps.gsa.search.shared.service.p6935b.aac;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.soundsearch.p10653b.C141640b;
import com.google.android.apps.search.soundsearch.p10653b.C141643e;
import com.google.android.apps.search.soundsearch.p10653b.C141644f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.z */
/* compiled from: PG */
public final class C116836z extends C116780ib implements C87401c, C87297a {

    /* renamed from: a */
    public static final C59071e f324217a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.z");

    /* renamed from: A */
    private final C68214a f324218A;

    /* renamed from: B */
    private final C68214a f324219B;

    /* renamed from: C */
    private final C68214a f324220C;

    /* renamed from: D */
    private final C68214a f324221D;

    /* renamed from: E */
    private final C68214a f324222E;

    /* renamed from: F */
    private final C68214a f324223F;

    /* renamed from: G */
    private final C68214a f324224G;

    /* renamed from: H */
    private final C68214a f324225H;

    /* renamed from: L */
    private final C68214a f324226L;

    /* renamed from: M */
    private final C116835y f324227M = new C116835y();

    /* renamed from: N */
    private final C86124t f324228N;

    /* renamed from: O */
    private final C86372a f324229O;

    /* renamed from: P */
    private final C86355a f324230P;

    /* renamed from: Q */
    private List f324231Q;

    /* renamed from: R */
    private VoiceAction f324232R;

    /* renamed from: S */
    private C87423k f324233S;

    /* renamed from: T */
    private C60870cx f324234T;

    /* renamed from: U */
    private C87424l f324235U;

    /* renamed from: V */
    private aad f324236V;

    /* renamed from: W */
    private UpdateVoiceActionUiEventParcelable f324237W;

    /* renamed from: X */
    private boolean f324238X;

    /* renamed from: Y */
    private long f324239Y;

    /* renamed from: Z */
    private boolean f324240Z;

    /* renamed from: aa */
    private boolean f324241aa;

    /* renamed from: b */
    public final C68214a f324242b;

    /* renamed from: c */
    public final C68214a f324243c;

    /* renamed from: d */
    public final C68214a f324244d;

    /* renamed from: e */
    public final C68214a f324245e;

    /* renamed from: f */
    public final C68214a f324246f;

    /* renamed from: g */
    public final C68214a f324247g;

    /* renamed from: h */
    public final BitFlags f324248h;

    /* renamed from: i */
    public Query f324249i;

    /* renamed from: j */
    public ActionData f324250j;

    /* renamed from: k */
    public List f324251k;

    /* renamed from: l */
    public int f324252l;

    /* renamed from: m */
    public final Stack f324253m;

    /* renamed from: n */
    public Query f324254n;

    /* renamed from: o */
    public Query f324255o;

    /* renamed from: p */
    public CardDecision f324256p;

    /* renamed from: q */
    public int f324257q;

    /* renamed from: r */
    public boolean f324258r;

    /* renamed from: s */
    public long f324259s;

    /* renamed from: t */
    public final C84809b f324260t;

    /* renamed from: u */
    public final C22871g f324261u;

    /* renamed from: v */
    public VoiceAction f324262v;

    /* renamed from: w */
    public C60870cx f324263w;

    /* renamed from: x */
    public boolean f324264x;

    /* renamed from: y */
    private final C68214a f324265y;

    /* renamed from: z */
    private final C68214a f324266z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116836z(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C68214a aVar18, C86124t tVar, C84809b bVar, C22871g gVar, C86372a aVar19, C86355a aVar20) {
        super(aVar, 151);
        C68214a aVar21 = aVar;
        BitFlags bitFlags = new BitFlags(getClass(), "FLAG_", 0);
        this.f324248h = bitFlags;
        this.f324249i = Query.f252741b;
        this.f324250j = null;
        this.f324231Q = new ArrayList();
        this.f324257q = 0;
        this.f324258r = true;
        this.f324262v = null;
        this.f324236V = null;
        this.f324237W = null;
        this.f324238X = false;
        this.f324242b = aVar2;
        this.f324266z = aVar3;
        this.f324265y = aVar4;
        this.f324243c = aVar5;
        this.f324222E = aVar9;
        this.f324244d = aVar10;
        this.f324218A = aVar12;
        this.f324219B = aVar11;
        this.f324220C = aVar13;
        this.f324245e = aVar6;
        this.f324221D = aVar8;
        this.f324246f = aVar7;
        this.f324247g = aVar14;
        this.f324223F = aVar15;
        this.f324224G = aVar16;
        this.f324225H = aVar17;
        this.f324226L = aVar18;
        this.f324228N = tVar;
        this.f324260t = bVar;
        this.f324261u = gVar;
        this.f324253m = new Stack();
        bitFlags.mo85049c(0, 128);
        this.f324229O = aVar19;
        this.f324230P = aVar20;
    }

    /* renamed from: R */
    public static boolean m194059R(C55244le leVar) {
        if (leVar.f145469b.size() <= 0 || (((C55365pr) leVar.f145469b.get(0)).f145878a & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: aA */
    private final void m194060aA() {
        this.f324260t.mo78500t(mo80807f(), this.f324250j, mo103015j(), mo103014i(), ((C116735gk) this.f324244d.mo27525b()).f323784p);
    }

    /* renamed from: aB */
    private final void m194061aB(C87423k kVar) {
        int a;
        if (kVar == null || (a = C87478u.m141962a(kVar.f236087b)) == 0 || a != 8) {
            this.f324233S = kVar;
        }
    }

    /* renamed from: aC */
    private final void m194062aC(CardDecision cardDecision, boolean z) {
        this.f324256p = cardDecision;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (z) {
            this.f324257q = 0;
        }
        mo103007at(true, false, false, false);
        mo103009av();
        if (mo103015j().f236254h) {
            mo103016k().mo81654p();
        }
        if (this.f324264x) {
            this.f324264x = false;
            new C90873ag(this.f324260t.mo78487f(mo103015j(), mo103013g(), this.f324252l, this.f324253m.contains(Integer.valueOf(C89885b.ACTION_ERROR_NO_PROGRESS_VALUE))), this.f324261u, "Create ShowPromptEventData", new C116833w(this)).mo85223a(C116834x.f324215a);
        }
    }

    /* renamed from: aD */
    private final boolean m194063aD(VoiceAction voiceAction, int i) {
        return this.f324227M.mo102970a(voiceAction, i);
    }

    /* renamed from: aE */
    private final boolean m194064aE(int i, int i2, C87423k kVar) {
        boolean z;
        int a;
        boolean z2;
        C58976aa aaVar = C58975e.f156826a;
        m194061aB(kVar);
        boolean c = this.f324248h.mo85049c(0, 134217728);
        if (mo102995Z()) {
            c = c | this.f324248h.mo85049c(0, 65536) | this.f324248h.mo85049c(0, 34359738368L);
        }
        if (!mo102995Z() || i != 2) {
            c |= this.f324248h.mo85049c(0, 128);
            if (i == 1) {
                z2 = this.f324248h.mo85049c(131072, 0);
            } else {
                z = c;
                if (i2 == 3 && this.f324248h.mo85049c(0, 32768)) {
                    mo102980J();
                    z = true;
                }
                mo103010aw(true);
                if (kVar != null && (((a = C87478u.m141962a(kVar.f236087b)) == 0 || a != 8) && mo103014i().mo81205e(1))) {
                    m194060aA();
                }
                return z;
            }
        } else {
            z2 = this.f324248h.mo85049c(0, 131072);
        }
        z = z2 | c;
        mo102980J();
        z = true;
        mo103010aw(true);
        m194060aA();
        return z;
    }

    /* renamed from: aF */
    private final boolean m194065aF(ActionData actionData, Query query) {
        if (!C58832aw.m90831a(actionData, this.f324250j)) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f324254n = query;
        return mo102998ac();
    }

    /* renamed from: aG */
    private final boolean m194066aG(ActionData actionData) {
        if (!C58832aw.m90831a(actionData, this.f324250j)) {
            return false;
        }
        List list = this.f324251k;
        if (list != null && list.isEmpty()) {
            return false;
        }
        this.f324251k = Collections.emptyList();
        m194062aC((CardDecision) null, true);
        this.f324260t.mo78497q((C87541c) this.f324247g.mo27525b());
        return true;
    }

    /* renamed from: aH */
    private final boolean m194067aH(ActionData actionData, List list) {
        if (!C58832aw.m90831a(actionData, this.f324250j)) {
            return false;
        }
        C90748e.m148225c(list);
        this.f324251k = list;
        m194062aC((CardDecision) null, true);
        this.f324248h.mo85049c(0, 4096);
        mo102980J();
        mo103009av();
        mo103028y();
        mo102979I();
        mo102978H();
        mo103014i().mo81201a(this.f324250j, mo80807f(), this.f324249i);
        mo103027x();
        return true;
    }

    /* renamed from: aI */
    private final boolean m194068aI(ActionData actionData) {
        return actionData != null && actionData.f235998h != null && this.f324228N.mo79745c(C90014bt.f247823oj).contains(actionData.f235998h.name()) && C87399b.m141527a(actionData);
    }

    /* renamed from: aJ */
    private final void m194069aJ(ActionData actionData, List list) {
        if (m194067aH(actionData, list)) {
            mo80591ar();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: ak */
    public static boolean m194070ak(ActionData actionData, Query query) {
        return query.mo84435dP() && !ActionData.m141430o(actionData);
    }

    /* renamed from: az */
    private final void m194071az(VoiceAction voiceAction) {
        this.f324248h.mo85049c(0, 4);
        if (mo103014i().mo81205e((voiceAction == null || !voiceAction.mo81083v()) ? 3 : 4)) {
            m194060aA();
        }
        if (voiceAction != null) {
            this.f324260t.mo78506z(voiceAction);
        }
    }

    /* renamed from: A */
    public final void mo80769A(VoiceAction voiceAction) {
        if (voiceAction == mo80807f() && voiceAction.mo81065f() != null) {
            this.f324248h.mo85049c(0, 524288);
            new C90873ag(this.f324260t.mo78485c(voiceAction, ((C116735gk) this.f324244d.mo27525b()).f323784p), this.f324261u, String.format("[%s] On matching provider info created", new Object[]{"S_ActionState"}), new C116829s(this, voiceAction)).mo85223a(C116830t.f324210a);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102972B(com.google.android.apps.gsa.search.shared.actions.VoiceAction r6, com.google.android.apps.gsa.search.shared.actions.C87421i r7, int r8) {
        /*
            r5 = this;
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r5.f324248h
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            r3 = 0
            r0.mo85049c(r1, r3)
            com.google.android.apps.gsa.search.core.al.b.b r0 = r5.f324260t
            r0.mo78505y(r7)
            com.google.android.apps.gsa.search.core.al.b.b r0 = r5.f324260t
            r0.mo78473A()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r5.f324232R
            if (r0 == r6) goto L_0x002f
            com.google.common.f.e r6 = f324217a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "S_ActionState"
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "#onExecutionError for unrecognized action."
            r8 = 31933(0x7cbd, float:4.4748E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
            return
        L_0x002f:
            boolean r6 = r7.mo81197b()
            r1 = 2
            if (r6 == 0) goto L_0x003f
            r6 = 106(0x6a, float:1.49E-43)
            if (r8 == r6) goto L_0x003d
            r6 = 105(0x69, float:1.47E-43)
            goto L_0x0055
        L_0x003d:
            r8 = 106(0x6a, float:1.49E-43)
        L_0x003f:
            boolean r6 = r7.mo81199d()
            if (r6 == 0) goto L_0x0048
            r6 = 103(0x67, float:1.44E-43)
            goto L_0x0055
        L_0x0048:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = r0.mo81065f()
            boolean r6 = r6.mo81438h()
            if (r6 == 0) goto L_0x0054
            r6 = 2
            goto L_0x0055
        L_0x0054:
            r6 = r8
        L_0x0055:
            r0.mo81072hy()
            if (r6 == r1) goto L_0x00c6
            switch(r6) {
                case 102: goto L_0x00c2;
                case 103: goto L_0x00c6;
                case 104: goto L_0x00be;
                case 105: goto L_0x00ba;
                case 106: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x00b2
        L_0x005e:
            boolean r6 = r0.mo81082u()
            if (r6 == 0) goto L_0x00b2
            r6 = r0
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r8 = r6.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r8 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r8
            com.google.bb.a.ln r8 = r8.mo81239b()
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r6.f235985a
            boolean r2 = r2.mo81118g()
            if (r2 != 0) goto L_0x007f
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r6.f235985a
            boolean r2 = r2.mo81117f()
            if (r2 == 0) goto L_0x00c9
        L_0x007f:
            if (r8 == 0) goto L_0x0099
            boolean r2 = r7.mo81198c()
            if (r2 == 0) goto L_0x0099
            int r2 = r8.f145509a
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r6 = r6.f235985a
            com.google.bb.a.le r8 = r8.f145511c
            if (r8 != 0) goto L_0x0095
            com.google.bb.a.le r8 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x0095:
            r6.mo81112b(r8)
            goto L_0x00c9
        L_0x0099:
            if (r8 == 0) goto L_0x00b2
            boolean r2 = r7.mo81197b()
            if (r2 == 0) goto L_0x00b2
            int r2 = r8.f145509a
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00b2
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r6 = r6.f235985a
            com.google.bb.a.le r8 = r8.f145512d
            if (r8 != 0) goto L_0x00ae
            com.google.bb.a.le r8 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x00ae:
            r6.mo81112b(r8)
            goto L_0x00c9
        L_0x00b2:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r5.f324232R
            if (r6 == 0) goto L_0x00c9
            r6.mo81057G()
            goto L_0x00c9
        L_0x00ba:
            r0.mo81059I()
            goto L_0x00c9
        L_0x00be:
            r0.mo81055E()
            goto L_0x00c9
        L_0x00c2:
            r0.mo81057G()
            goto L_0x00c9
        L_0x00c6:
            r0.mo81061K()
        L_0x00c9:
            r6 = 0
            r5.f324232R = r6
            r5.mo102980J()
            r6 = 0
            r5.mo103010aw(r6)
            com.google.android.apps.gsa.shared.util.BitFlags r6 = r5.f324248h
            r1 = 8
            r6.mo85049c(r3, r1)
            r5.mo102979I()
            boolean r6 = r7.mo81198c()
            if (r6 == 0) goto L_0x00fa
            com.google.android.apps.gsa.search.shared.actions.ActionData r6 = r5.f324250j
            if (r6 == 0) goto L_0x00fa
            boolean r6 = r6.mo81095g()
            if (r6 != 0) goto L_0x00fa
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r5.mo80807f()
            if (r6 != r0) goto L_0x00fa
            com.google.android.apps.gsa.shared.util.BitFlags r6 = r5.f324248h
            r7 = 8192(0x2000, double:4.0474E-320)
            r6.mo85049c(r3, r7)
        L_0x00fa:
            r5.mo80591ar()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116836z.mo102972B(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.i, int):void");
    }

    /* renamed from: C */
    public final void mo102973C() {
        C84809b bVar = this.f324260t;
        C88208td tdVar = (C88208td) C88209te.f238431e.createBuilder();
        tdVar.copyOnWrite();
        C88209te teVar = (C88209te) tdVar.instance;
        teVar.f238433a |= 1;
        teVar.f238434b = 3;
        bVar.mo78478F((C88209te) tdVar.build());
    }

    /* renamed from: D */
    public final void mo102974D(VoiceAction voiceAction, int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f324233S = null;
        if (this.f324232R != null) {
            C59104x d = f324217a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_ActionState");
            ((C59052c) ((C59052c) d).mo56372aa(31937)).mo56386p("requestActionToBeExecuted called when an action is already executing, return.");
        } else if (voiceAction.mo81086x() || voiceAction.mo81088z()) {
            C59104x d2 = f324217a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "S_ActionState");
            ((C59052c) ((C59052c) d2).mo56372aa(31936)).mo56386p("requestActionToBeExecuted called on an already executing action.");
        } else {
            this.f324232R = voiceAction;
            voiceAction.mo81060J(i);
        }
    }

    /* renamed from: E */
    public final void mo102975E(ActionData actionData) {
        if (!C58832aw.m90831a(this.f324250j, actionData)) {
            this.f324250j = actionData;
            C84809b bVar = this.f324260t;
            if (actionData == null) {
                actionData = ActionData.f235991b;
            }
            bVar.mo78476D(actionData);
        }
    }

    /* renamed from: F */
    public final void mo102976F(VoiceAction voiceAction, CardDecision cardDecision) {
        if (voiceAction == mo80807f()) {
            boolean c = this.f324248h.mo85049c(2048, 0);
            if (!C58832aw.m90831a(cardDecision, this.f324256p) || this.f324248h.mo85049c(8589934592L, 0)) {
                CardDecision cardDecision2 = this.f324256p;
                m194062aC(cardDecision, false);
                C58976aa aaVar = C58975e.f156826a;
                if (cardDecision.f236256j) {
                    voiceAction.mo81055E();
                }
                if (this.f324257q == 0 && cardDecision2 == null) {
                    mo103024t();
                }
                if (!cardDecision.f236252f && !cardDecision.f236254h && !mo103002ah() && !mo102996aa() && !voiceAction.mo81080s() && !this.f324249i.mo84326bK() && !this.f324249i.mo84419cz()) {
                    this.f324248h.mo85049c(0, 34359738368L);
                    this.f324248h.mo85049c(0, 128);
                }
                mo103028y();
                c = true;
                if (mo103014i().mo81204d(cardDecision, mo80807f(), mo102995Z())) {
                    m194060aA();
                }
            }
            if (this.f324248h.mo85049c(16384, 0) || c) {
                this.f324248h.mo85049c(0, 8);
                mo80591ar();
            }
        }
    }

    /* renamed from: G */
    public final void mo102977G(ActionData actionData) {
        if (m194066aG(actionData)) {
            mo102980J();
            mo103009av();
            mo80591ar();
        }
    }

    /* renamed from: H */
    public final void mo102978H() {
        C116735gk gkVar = (C116735gk) this.f324244d.mo27525b();
        C60870cx p = this.f324260t.mo78496p(this.f324250j, mo103013g(), this.f324252l, mo103006as(), gkVar.mo102881W(gkVar.f323784p), mo103016k());
        this.f324263w = p;
        new C90873ag(p, this.f324261u, "On actions errors updated", new C116827q(this)).mo85223a(C116828r.f324207a);
    }

    /* renamed from: I */
    public final void mo102979I() {
        this.f324260t.mo78480H((C87541c) this.f324247g.mo27525b(), ((C116569ag) this.f324266z.mo27525b()).f323267a, ((C116735gk) this.f324244d.mo27525b()).f323784p, this.f324250j, mo80807f(), mo103015j(), C55421x.UNKNOWN_ACTION_TYPE, ((C116735gk) this.f324244d.mo27525b()).mo102881W(((C116735gk) this.f324244d.mo27525b()).f323784p));
    }

    /* renamed from: J */
    public final void mo102980J() {
        PromoAction promoAction;
        VoiceAction f;
        ModularAction modularAction;
        C55244le a;
        Object obj;
        if (mo103001af()) {
            m194063aD(ButtonAction.f236040f, 1);
        } else {
            this.f324227M.mo102970a((VoiceAction) null, 1);
        }
        VoiceAction f2 = mo80807f();
        if ((f2 instanceof ModularAction) && f2.mo81084w() && (a = (modularAction = (ModularAction) f2).f235985a.mo81111a(modularAction.mo81219Z())) != null) {
            Iterator it = a.f145474g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C55365pr prVar = (C55365pr) it.next();
                C62940bt r4 = C62942bv.checkIsLite(C55263lx.f145543j);
                prVar.mo58887l(r4);
                Object l = prVar.f169962ag.mo58854l(r4.f169971d);
                if (l == null) {
                    obj = r4.f169969b;
                } else {
                    obj = r4.mo58889c(l);
                }
                C55263lx lxVar = (C55263lx) obj;
                C55136he heVar = prVar.f145879b;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                if (!heVar.f145133b.isEmpty() && lxVar.f145552g.size() > 0 && !((C55136he) lxVar.f145552g.get(0)).f145133b.isEmpty() && !lxVar.f145549d.isEmpty()) {
                    promoAction = new PromoAction(prVar);
                    break;
                }
            }
        }
        promoAction = null;
        if (!(promoAction == null || !m194063aD(promoAction, 2) || (f = mo80807f()) == null)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 619;
            int i = f.mo81066g().f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 256;
            ufVar2.f164264s = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        ArrayList arrayList = new ArrayList();
        this.f324231Q = arrayList;
        List list = this.f324251k;
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = this.f324231Q;
        C116835y yVar = this.f324227M;
        ArrayList arrayList2 = new ArrayList();
        VoiceAction voiceAction = (VoiceAction) yVar.f324216a.get(1);
        if (voiceAction != null) {
            arrayList2.add(voiceAction);
        }
        VoiceAction voiceAction2 = (VoiceAction) yVar.f324216a.get(2);
        if (voiceAction2 != null) {
            arrayList2.add(voiceAction2);
        }
        list2.addAll(arrayList2);
        this.f324248h.mo85055h(1024, true ^ this.f324231Q.isEmpty());
    }

    /* renamed from: K */
    public final void mo102981K(Query query, ActionData actionData) {
        List p = ((C116735gk) this.f324244d.mo27525b()).mo102902p(actionData);
        if (p != null) {
            mo103019o(query, actionData, p);
        } else {
            mo103020p(query, actionData);
        }
        mo102980J();
        mo103009av();
        mo80591ar();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo102982L() {
        boolean M = mo102983M(true);
        if (M) {
            mo102980J();
            mo102979I();
            mo80591ar();
        }
        return M;
    }

    /* renamed from: M */
    public final boolean mo102983M(boolean z) {
        VoiceAction f = mo80807f();
        if (f == null || !f.mo81055E()) {
            return false;
        }
        if (z) {
            mo103008au();
        }
        this.f324248h.mo85049c(0, 8);
        m194071az(f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo102984N(Query query) {
        return mo102986P(query) && mo102988S(this.f324250j) && mo80807f() != null;
    }

    /* renamed from: O */
    public final boolean mo102985O() {
        VoiceAction f = mo80807f();
        if (f == null) {
            return false;
        }
        if (this.f324232R != null || (f.mo81133M() && mo103015j().f236255i && f.mo81051A())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo102986P(Query query) {
        return (this.f324250j == null || query == null || !query.mo84383cP(this.f324249i)) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo102987Q() {
        ActionData actionData = this.f324250j;
        return actionData != null && actionData.mo81099j() && this.f324250j.mo81089a() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo102988S(ActionData actionData) {
        return actionData != null && C58832aw.m90831a(actionData, this.f324250j) && BitFlags.m148144f(this.f324248h.f253762b, 4096);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo102989T() {
        return BitFlags.m148144f(this.f324248h.f253762b, 1024);
    }

    /* renamed from: U */
    public final boolean mo102990U() {
        return mo102989T() || mo102991V();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean mo102991V() {
        return BitFlags.m148144f(this.f324248h.f253762b, 262144);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r0.f236266t.size();
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102992W() {
        /*
            r3 = this;
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r3.f324256p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.List r0 = r0.f236266t
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0016
            int r2 = r3.f324257q
            int r0 = r0 + -1
            if (r2 != r0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116836z.mo102992W():boolean");
    }

    /* renamed from: X */
    public final boolean mo102993X() {
        return BitFlags.m148144f(this.f324248h.f253762b, 4294967296L);
    }

    /* renamed from: Y */
    public final boolean mo102994Y() {
        return !mo102995Z();
    }

    /* renamed from: Z */
    public final boolean mo102995Z() {
        return (!BitFlags.m148144f(this.f324248h.f253762b, 128) || ((TtsState) this.f324220C.mo27525b()).mo102750C()) && !m194068aI(this.f324250j);
    }

    /* renamed from: a */
    public final UpdateVoiceActionUiEventParcelable mo80942a() {
        return this.f324237W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final boolean mo102996aa() {
        return BitFlags.m148144f(this.f324248h.f253762b, 4194304);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ab */
    public final boolean mo102997ab(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        Query query2 = this.f324255o;
        return query2 != null && query2.mo84383cP(query);
    }

    /* renamed from: ac */
    public final boolean mo102998ac() {
        return BitFlags.m148144f(this.f324248h.f253762b, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ad */
    public final boolean mo102999ad(Query query) {
        return mo102986P(query) && this.f324253m.size() > 0 && mo103013g() == 1114114;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public final boolean mo103000ae() {
        return BitFlags.m148144f(this.f324248h.f253762b, 2048);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r4.f324251k;
     */
    /* renamed from: af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103001af() {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r4.f324250j
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.mo81099j()
            if (r0 != 0) goto L_0x0043
            java.util.List r0 = r4.f324251k
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r4.f324248h
            long r0 = r0.f253762b
            r2 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r0, r2)
            if (r0 != 0) goto L_0x0043
            dagger.a r0 = r4.f324244d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f323784p
            boolean r0 = r0.mo84318bC()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f324249i
            boolean r0 = r0.mo84369cB()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f324249i
            boolean r0 = r0.mo84331bP()
            if (r0 != 0) goto L_0x0043
            r0 = 1
            return r0
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116836z.mo103001af():boolean");
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.CONTACT_SELECTED_EXTERNALLY, C87739bu.ACTION_CHANGED_EXTERNALLY, C87739bu.ACTION_COUNTDOWN_CANCELED, C87739bu.ESCAPE_HATCH_CLICKED, C87739bu.HANDLE_ACTIONS_BACK_PRESS, C87739bu.SAVE_USER_INTERACTION, C87739bu.ACTION_USER_INTERACTION, C87739bu.REMOTE_ACTION_TRIGGERED, C87739bu.ACTION_UI_READY, C87739bu.CLEAR_VOICE_ACTIONS, C87739bu.REQUEST_EXECUTE_ACTION, C87739bu.REQUEST_CANCEL_ACTION_EXECUTION, C87739bu.SAVE_ENTRY_LOCATION, C87739bu.SAVE_RELATIONSHIP};
    }

    /* renamed from: ah */
    public final boolean mo103002ah() {
        CardDecision cardDecision = this.f324256p;
        return (cardDecision == null || cardDecision.mo81420e(this.f324257q) == null) ? false : true;
    }

    /* renamed from: ai */
    public final boolean mo103003ai() {
        VoiceAction f = mo80807f();
        if (!(f instanceof ModularAction)) {
            return false;
        }
        ModularAction modularAction = (ModularAction) f;
        boolean ak = modularAction.mo81231ak(((ModularActionMatchingProviderInfo) modularAction.f235986b).f236115a);
        CardDecision cardDecision = this.f324256p;
        if (cardDecision == null || f.mo81054D() || !cardDecision.f236255i || cardDecision.f236257k != 0 || !ak || !modularAction.mo81232al() || this.f324249i.mo84423dD() || this.f324249i.mo84466dt()) {
            return false;
        }
        return true;
    }

    /* renamed from: aj */
    public final boolean mo103004aj() {
        int i;
        VoiceAction f = mo80807f();
        if (f == null) {
            i = -1;
        } else {
            i = f.mo81067ht();
        }
        return ((C116735gk) this.f324244d.mo27525b()).f323784p.mo84337bV() || mo103003ai() || i == 101;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: al */
    public final boolean mo103005al() {
        if (mo103000ae()) {
            return false;
        }
        return this.f324248h.mo85049c(8, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: as */
    public final boolean mo103006as() {
        return BitFlags.m148144f(this.f324248h.f253762b, 131072);
    }

    /* renamed from: at */
    public final void mo103007at(boolean z, boolean z2, boolean z3, boolean z4) {
        aac aac;
        UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable;
        ActionData actionData;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f324240Z) {
            Query query = ((C116735gk) this.f324244d.mo27525b()).f323784p;
            List<VoiceAction> m = mo103017m();
            if ((this.f324256p == null || m == null) && (!this.f324238X || mo102984N(query))) {
                updateVoiceActionUiEventParcelable = null;
                aac = null;
            } else {
                CardDecision j = mo103015j();
                boolean z5 = mo102989T() && ((C116740gp) this.f324219B.mo27525b()).mo102912i();
                boolean z6 = mo102986P(query) && !((TtsState) this.f324220C.mo27525b()).mo102762r();
                ArrayList arrayList = new ArrayList();
                if (m != null) {
                    for (VoiceAction parcelableVoiceAction : m) {
                        arrayList.add(new ParcelableVoiceAction(parcelableVoiceAction));
                    }
                }
                updateVoiceActionUiEventParcelable = new UpdateVoiceActionUiEventParcelable(query, arrayList, j);
                aac = (aac) aad.f237059j.createBuilder();
                if ((z3 && ((C116740gp) this.f324219B.mo27525b()).mo102915m()) || z4) {
                    aac.copyOnWrite();
                    aad aad = (aad) aac.instance;
                    aad.f237061a |= 8;
                    aad.f237065e = true;
                }
                if (z || z2) {
                    aac.copyOnWrite();
                    aad aad2 = (aad) aac.instance;
                    aad2.f237061a |= 16;
                    aad2.f237066f = true;
                }
                aac.copyOnWrite();
                aad aad3 = (aad) aac.instance;
                aad3.f237061a |= 1;
                aad3.f237062b = z6;
                aac.copyOnWrite();
                aad aad4 = (aad) aac.instance;
                aad4.f237061a |= 2;
                aad4.f237063c = z5;
                this.f324241aa = z5;
                if (z) {
                    aac.copyOnWrite();
                    aad aad5 = (aad) aac.instance;
                    aad5.f237061a |= 32;
                    aad5.f237067g = true;
                    boolean al = mo103005al();
                    aac.copyOnWrite();
                    aad aad6 = (aad) aac.instance;
                    aad6.f237061a |= 4;
                    aad6.f237064d = al;
                }
                if (z && (actionData = this.f324250j) != null) {
                    C63088z A = C63088z.m96139A(C90772bp.m148289P(actionData));
                    aac.copyOnWrite();
                    aad aad7 = (aad) aac.instance;
                    aad7.f237061a |= 64;
                    aad7.f237068h = A;
                }
            }
            this.f324238X = mo102984N(query);
            if (aac == null || updateVoiceActionUiEventParcelable == null || (((aad) aac.build()).equals(this.f324236V) && updateVoiceActionUiEventParcelable.equals(this.f324237W) && this.f324239Y == this.f324259s)) {
                if (aac != null) {
                    this.f324236V = (aad) aac.build();
                } else {
                    this.f324236V = null;
                }
                this.f324237W = updateVoiceActionUiEventParcelable;
                return;
            }
            this.f324239Y = this.f324259s;
            C87708aq aqVar = (C87708aq) C87709ar.f237172f.createBuilder();
            if (this.f324250j == null || mo103003ai()) {
                aqVar.copyOnWrite();
                C87709ar arVar = (C87709ar) aqVar.instance;
                arVar.f237174a |= 16;
                arVar.f237178e = true;
            } else {
                VoiceAction f = mo80807f();
                CardDecision j2 = mo103015j();
                C63088z A2 = C63088z.m96139A(C90772bp.m148289P(((C116735gk) this.f324244d.mo27525b()).f323784p));
                aqVar.copyOnWrite();
                C87709ar arVar2 = (C87709ar) aqVar.instance;
                arVar2.f237174a |= 1;
                arVar2.f237175b = A2;
                C63088z A3 = C63088z.m96139A(C90772bp.m148289P(new ParcelableVoiceAction(f)));
                aqVar.copyOnWrite();
                C87709ar arVar3 = (C87709ar) aqVar.instance;
                arVar3.f237174a |= 4;
                arVar3.f237176c = A3;
                C63088z A4 = C63088z.m96139A(C90772bp.m148289P(j2));
                aqVar.copyOnWrite();
                C87709ar arVar4 = (C87709ar) aqVar.instance;
                arVar4.f237174a |= 8;
                arVar4.f237177d = A4;
                aqVar.copyOnWrite();
                C87709ar arVar5 = (C87709ar) aqVar.instance;
                arVar5.f237174a |= 16;
                arVar5.f237178e = false;
            }
            C87709ar arVar6 = (C87709ar) aqVar.build();
            aac.copyOnWrite();
            aad aad8 = (aad) aac.instance;
            arVar6.getClass();
            aad8.f237069i = arVar6;
            aad8.f237061a |= 128;
            this.f324236V = (aad) aac.build();
            this.f324237W = updateVoiceActionUiEventParcelable;
            this.f324260t.mo78482J((aad) aac.build(), updateVoiceActionUiEventParcelable);
        }
    }

    /* renamed from: au */
    public final void mo103008au() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo103000ae()) {
            VoiceAction f = mo80807f();
            ActionData actionData = this.f324250j;
            if (f != null && actionData != null) {
                C87413a aVar = (mo103013g() == 0 || this.f324252l <= 0) ? null : new C87413a(mo103013g(), this.f324252l, this.f324253m.size());
                Query query = ((C116735gk) this.f324244d.mo27525b()).f323784p;
                boolean z = ((C86803r) this.f324218A.mo27525b()).mo80509n() && !query.mo84423dD() && !query.mo84337bV() && (!query.mo84326bK() || !query.mo84332bQ());
                boolean z2 = mo102993X() || actionData.mo81104p();
                C84809b bVar = this.f324260t;
                ClientConfig clientConfig = ((C116569ag) this.f324266z.mo27525b()).f323267a;
                boolean Z = mo102995Z();
                long j = this.f324248h.f253762b;
                C60870cx K = bVar.mo78483K(f, actionData, query, aVar, clientConfig, Z, BitFlags.m148144f(j, 4), mo103006as(), BitFlags.m148144f(j, 134217728), z, z2);
                this.f324248h.mo85049c(0, 2048);
                new C90873ag(K, this.f324261u, String.format("[%s] On create cardDecision", new Object[]{"S_ActionState"}), new C116831u(this, f)).mo85223a(C116832v.f324213a);
            }
        }
    }

    /* renamed from: aw */
    public final void mo103010aw(boolean z) {
        if (mo80807f() != null) {
            if (z) {
                this.f324248h.mo85049c(0, 16384);
            }
            mo103008au();
        }
    }

    /* renamed from: ax */
    public final boolean mo103011ax(ActionData actionData, C87412e eVar, MatchingProviderInfo matchingProviderInfo) {
        Query a = eVar.mo81177a();
        if (a == null || !a.mo84369cB()) {
            ClientConfig clientConfig = ((C116569ag) this.f324266z.mo27525b()).f323267a;
            if (a != null && !clientConfig.mo81908x() && m194065aF(actionData, a)) {
                mo80591ar();
            }
            List b = eVar.mo81178b();
            if (mo103014i().mo81203c(b == null || b.isEmpty() || (b.get(0) instanceof PuntAction))) {
                m194060aA();
            }
            if (b != null) {
                if (!b.isEmpty()) {
                    VoiceAction voiceAction = (VoiceAction) b.get(0);
                    if (matchingProviderInfo != null) {
                        voiceAction.mo81076o(matchingProviderInfo);
                    }
                    ClientConfig clientConfig2 = ((C116569ag) this.f324266z.mo27525b()).f323267a;
                    if (matchingProviderInfo == null || (matchingProviderInfo.mo81435e() && !clientConfig2.mo81892j() && !actionData.mo81096h())) {
                        C59104x d = f324217a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "S_ActionState");
                        ((C59052c) ((C59052c) d).mo56372aa(31961)).mo56389s("Action suppressed due to no matching apps: %s", voiceAction);
                        if (mo103014i().mo81203c(true)) {
                            m194060aA();
                        }
                        m194069aJ(actionData, new ArrayList());
                    } else {
                        m194069aJ(actionData, b);
                        return true;
                    }
                } else {
                    m194069aJ(actionData, b);
                }
                return false;
            }
            mo102977G(actionData);
            return false;
        }
        ((C84691a) this.f324226L.mo27525b()).mo78426g();
        C141640b bVar = (C141640b) C141643e.f384462c.createBuilder();
        bVar.copyOnWrite();
        C141643e eVar2 = (C141643e) bVar.instance;
        eVar2.f384465b = 2;
        eVar2.f384464a |= 1;
        ((C91097g) this.f324225H.mo27525b()).mo65089a(C141644f.m229859a((C141643e) bVar.build()));
        return true;
    }

    /* renamed from: b */
    public final aad mo80943b() {
        return this.f324236V;
    }

    /* renamed from: c */
    public final boolean mo80944c() {
        return this.f324241aa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo103012e() {
        CardDecision cardDecision;
        if (mo80807f() == null || (cardDecision = this.f324256p) == null || cardDecision.mo81420e(this.f324257q) == null) {
            return -1;
        }
        return this.f324257q;
    }

    /* renamed from: f */
    public final VoiceAction mo80807f() {
        List list = this.f324251k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (VoiceAction) this.f324251k.get(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo103013g() {
        if (this.f324253m.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f324253m.peek()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: gS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ActionState"
            r7.mo85291r(r0)
            java.lang.String r0 = "Flags"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85279c(r0)
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r6.f324248h
            java.lang.String r1 = r1.mo85048b()
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "CurrentQuery"
            com.google.android.apps.gsa.shared.search.Query r1 = r6.f324249i
            r7.mo85288o(r0, r1)
            java.lang.String r0 = "ActionData"
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = r6.f324250j
            r7.mo85288o(r0, r1)
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r6.f324250j
            r1 = 0
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.mo81108t()
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r6.f324250j
            com.google.android.speech.embedded.TaggerResult r0 = r0.f235994d
            if (r0 == 0) goto L_0x008d
        L_0x0037:
            java.lang.String r0 = "Last card displayed"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85278b(r0)
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r6.mo80807f()
            boolean r3 = r2 instanceof com.google.android.apps.gsa.search.shared.actions.modular.ModularAction
            if (r3 == 0) goto L_0x005b
            r3 = r2
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r3 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r3
            com.google.bb.a.nl r3 = r3.mo81219Z()
            int r4 = r3.f145691a
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x005b
            com.google.bb.a.he r3 = r3.f145700j
            if (r3 != 0) goto L_0x0058
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0058:
            java.lang.String r3 = r3.f145133b
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r4 = 1
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r4 != r5) goto L_0x0065
            java.lang.String r3 = "UNKNOWN"
        L_0x0065:
            if (r2 == 0) goto L_0x0086
            com.google.bb.a.x r2 = r2.mo81066g()
            int r2 = r2.f146230cP
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "["
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "]"
            r4.append(r2)
            java.lang.String r3 = r4.toString()
        L_0x0086:
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r3)
            r0.mo85276a(r2)
        L_0x008d:
            java.lang.String r0 = "ModifiedCommit"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f324254n
            r7.mo85288o(r0, r2)
            java.lang.String r0 = "VoiceQueryWithFollowOn"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f324255o
            r7.mo85288o(r0, r2)
            java.util.List r0 = r6.f324251k
            java.lang.String r2 = "VoiceActions"
            if (r0 != 0) goto L_0x00af
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85279c(r2)
            java.lang.String r1 = "null"
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            goto L_0x00ca
        L_0x00af:
            com.google.android.apps.gsa.shared.util.debug.a.f r1 = r7.mo85281e(r1)
            r1.mo85291r(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.shared.util.debug.a.g r2 = (com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g) r2
            r1.mo85287n(r2)
            goto L_0x00ba
        L_0x00ca:
            java.lang.String r0 = "Action to be executed"
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r6.f324232R
            r7.mo85288o(r0, r1)
            java.lang.String r0 = "Extra cards state"
            com.google.android.apps.gsa.staticplugins.search.session.state.y r1 = r6.f324227M
            r7.mo85290q(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116836z.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 5) {
            boolean z4 = false;
            if (ordinal == 8) {
                VoiceAction voiceAction = ((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                if (voiceAction != null) {
                    C62940bt btVar = C87772d.f237543a;
                    C87741bw bwVar = clientEventData.f236955a;
                    C62940bt r10 = C62942bv.checkIsLite(btVar);
                    bwVar.mo58887l(r10);
                    if (bwVar.f169962ag.mo58857o(r10.f169971d)) {
                        C62940bt btVar2 = C87772d.f237543a;
                        C87741bw bwVar2 = clientEventData.f236955a;
                        C62940bt r102 = C62942bv.checkIsLite(btVar2);
                        bwVar2.mo58887l(r102);
                        Object l = bwVar2.f169962ag.mo58854l(r102.f169971d);
                        if (l == null) {
                            obj2 = r102.f169969b;
                        } else {
                            obj2 = r102.mo58889c(l);
                        }
                        C87826f fVar = (C87826f) obj2;
                        boolean z5 = fVar.f237634b;
                        boolean z6 = fVar.f237635c;
                        z = fVar.f237636d;
                        z2 = z6;
                        z3 = z5;
                    } else {
                        z3 = false;
                        z2 = false;
                        z = false;
                    }
                    mo103029z(voiceAction, (C87423k) null, z3, z2, z);
                    return;
                }
                C59104x c = f324217a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "S_ActionState");
                ((C59052c) ((C59052c) c).mo56372aa(31902)).mo56386p("handleGenericClientEvent(): Action changed externally, but none supplied");
            } else if (ordinal == 35) {
                C62940bt btVar3 = C88201sx.f238422a;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r103 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r103);
                if (bwVar3.f169962ag.mo58857o(r103.f169971d)) {
                    C62940bt btVar4 = C88201sx.f238422a;
                    C87741bw bwVar4 = clientEventData.f236955a;
                    C62940bt r104 = C62942bv.checkIsLite(btVar4);
                    bwVar4.mo58887l(r104);
                    Object l2 = bwVar4.f169962ag.mo58854l(r104.f169971d);
                    if (l2 == null) {
                        obj3 = r104.f169969b;
                    } else {
                        obj3 = r104.mo58889c(l2);
                    }
                    C88206tb tbVar = (C88206tb) obj3;
                    if (tbVar != null && (tbVar.f238426a & 2) != 0) {
                        new C90873ag(this.f324260t.mo78495n(tbVar), this.f324261u, "Process remote action request data", new C116751h(this, tbVar)).mo85223a(new C116778i(this));
                        return;
                    }
                    return;
                }
                C59104x c2 = f324217a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "S_ActionState");
                ((C59052c) ((C59052c) c2).mo56372aa(31904)).mo56386p("REMOTE_ACTION_TRIGGERED event data without expected extension");
            } else if (ordinal == 62) {
                this.f324240Z = true;
                mo103007at(true, false, false, false);
            } else if (ordinal == 14) {
                m194071az(mo80807f());
                mo80591ar();
            } else if (ordinal != 15) {
                C87423k kVar = null;
                if (ordinal == 18) {
                    C62940bt btVar5 = C87934j.f237849a;
                    C87741bw bwVar5 = clientEventData.f236955a;
                    C62940bt r105 = C62942bv.checkIsLite(btVar5);
                    bwVar5.mo58887l(r105);
                    if (bwVar5.f169962ag.mo58857o(r105.f169971d)) {
                        C62940bt btVar6 = C87934j.f237849a;
                        C87741bw bwVar6 = clientEventData.f236955a;
                        C62940bt r106 = C62942bv.checkIsLite(btVar6);
                        bwVar6.mo58887l(r106);
                        Object l3 = bwVar6.f169962ag.mo58854l(r106.f169971d);
                        if (l3 == null) {
                            obj4 = r106.f169969b;
                        } else {
                            obj4 = r106.mo58889c(l3);
                        }
                        C87988l lVar = (C87988l) obj4;
                        this.f324248h.mo85049c(0, 8589934592L);
                        int i = lVar.f237956b;
                        int i2 = lVar.f237957c;
                        if ((lVar.f237955a & 4) != 0 && (kVar = lVar.f237958d) == null) {
                            kVar = C87423k.f236084e;
                        }
                        if (m194064aE(i, i2, kVar)) {
                            mo80591ar();
                            return;
                        }
                        return;
                    }
                    C59104x c3 = f324217a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "S_ActionState");
                    ((C59052c) ((C59052c) c3).mo56372aa(31903)).mo56386p("ACTION_USER_INTERACTION event data without expected extension");
                } else if (ordinal == 19) {
                    C62940bt btVar7 = C88227tw.f238468a;
                    C87741bw bwVar7 = clientEventData.f236955a;
                    C62940bt r107 = C62942bv.checkIsLite(btVar7);
                    bwVar7.mo58887l(r107);
                    Object l4 = bwVar7.f169962ag.mo58854l(r107.f169971d);
                    if (l4 == null) {
                        obj5 = r107.f169969b;
                    } else {
                        obj5 = r107.mo58889c(l4);
                    }
                    C88229ty tyVar = (C88229ty) obj5;
                    if ((tyVar.f238471a & 1) != 0 && (kVar = tyVar.f238472b) == null) {
                        kVar = C87423k.f236084e;
                    }
                    m194061aB(kVar);
                } else if (ordinal == 23) {
                    mo102977G(this.f324250j);
                } else if (ordinal == 24) {
                    m194062aC((CardDecision) null, true);
                    VoiceAction f = mo80807f();
                    if (f == null) {
                        this.f324233S = null;
                    } else {
                        if (!f.mo81077p()) {
                            this.f324233S = null;
                        }
                        C87423k kVar2 = this.f324233S;
                        if (f.mo81082u() && ((ModularAction) f).f236111q) {
                            z4 = true;
                        }
                        if (kVar2 == null || z4) {
                            ActionData actionData = this.f324250j;
                            if (actionData != null && actionData.f235997g) {
                                mo103018n();
                            } else if (this.f324248h.mo85049c(0, 16777216)) {
                                mo80591ar();
                            }
                        } else {
                            if (mo102995Z()) {
                                this.f324253m.clear();
                                this.f324253m.push(Integer.valueOf(C89885b.ACTION_ERROR_NO_PROGRESS_VALUE));
                                this.f324252l = 1;
                                this.f324248h.mo85049c(0, 131072);
                            }
                            int a2 = C87478u.m141962a(kVar2.f236087b);
                            if (a2 != 0 && a2 == 9) {
                                this.f324233S = null;
                                if (((C116579aq) this.f324265y.mo27525b()).f323307f) {
                                    if (this.f324248h.mo85049c(0, 67108864)) {
                                        mo80591ar();
                                    }
                                } else if (this.f324248h.mo85049c(0, 33554432)) {
                                    mo80591ar();
                                }
                            }
                        }
                        C87423k kVar3 = this.f324233S;
                        this.f324233S = null;
                        kVar = kVar3;
                    }
                    if (kVar != null) {
                        this.f324260t.mo78498r(kVar);
                    }
                } else if (ordinal == 48) {
                    C62940bt btVar8 = C88213ti.f238443a;
                    C87741bw bwVar8 = clientEventData.f236955a;
                    C62940bt r108 = C62942bv.checkIsLite(btVar8);
                    bwVar8.mo58887l(r108);
                    Object l5 = bwVar8.f169962ag.mo58854l(r108.f169971d);
                    if (l5 == null) {
                        obj6 = r108.f169969b;
                    } else {
                        obj6 = r108.mo58889c(l5);
                    }
                    C88215tk tkVar = (C88215tk) obj6;
                    VoiceAction voiceAction2 = ((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                    int i3 = tkVar.f238447b;
                    boolean z7 = tkVar.f238448c;
                    C58976aa aaVar = C58975e.f156826a;
                    boolean c4 = this.f324248h.mo85049c(0, 4294967296L) | this.f324248h.mo85049c(4, 0);
                    if (mo103014i().mo81202b(!z7, this.f324256p)) {
                        m194060aA();
                    }
                    if (z7) {
                        c4 |= m194064aE(2, 3, (C87423k) null);
                        if (voiceAction2 != null) {
                            mo102974D(voiceAction2, i3);
                            mo103022r();
                        }
                    } else {
                        mo103023s();
                    }
                    if (c4) {
                        mo80591ar();
                    }
                } else if (ordinal == 49) {
                    m194071az(((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a);
                    mo80591ar();
                } else if (ordinal == 127) {
                    C84809b bVar = this.f324260t;
                    C62940bt btVar9 = C88224tt.f238461a;
                    C87741bw bwVar9 = clientEventData.f236955a;
                    C62940bt r11 = C62942bv.checkIsLite(btVar9);
                    bwVar9.mo58887l(r11);
                    Object l6 = bwVar9.f169962ag.mo58854l(r11.f169971d);
                    if (l6 == null) {
                        obj7 = r11.f169969b;
                    } else {
                        obj7 = r11.mo58889c(l6);
                    }
                    bVar.mo78474B((C88226tv) obj7);
                } else if (ordinal == 128) {
                    this.f324260t.mo78475C((PersonDisambiguation) clientEventData.mo81912b(PersonDisambiguation.class), ((C116735gk) this.f324244d.mo27525b()).f323784p);
                }
            } else {
                ActionData actionData2 = this.f324250j;
                if (actionData2 != null && actionData2.f235997g) {
                    mo103018n();
                } else if (mo103001af()) {
                    mo103018n();
                    C116735gk gkVar = (C116735gk) this.f324244d.mo27525b();
                    while (gkVar.f323784p.f252770i.isEmpty() && !gkVar.f323789u.isEmpty()) {
                        gkVar.mo102889af(false);
                    }
                    if (!gkVar.f323784p.f252770i.isEmpty()) {
                        gkVar.mo102867E(gkVar.f323784p.mo84497x());
                    }
                } else {
                    mo102982L();
                }
            }
        } else {
            VoiceAction f2 = mo80807f();
            ActionData actionData3 = this.f324250j;
            if (f2 != null && actionData3 != null) {
                C62940bt btVar10 = C87754ci.f237512a;
                C87741bw bwVar10 = clientEventData.f236955a;
                C62940bt r2 = C62942bv.checkIsLite(btVar10);
                bwVar10.mo58887l(r2);
                Object l7 = bwVar10.f169962ag.mo58854l(r2.f169971d);
                if (l7 == null) {
                    obj = r2.f169969b;
                } else {
                    obj = r2.mo58889c(l7);
                }
                C87756ck ckVar = (C87756ck) obj;
                if (ckVar == null) {
                    return;
                }
                if ((1 & ckVar.f237515a) != 0) {
                    C87456t e = f2.mo81064e();
                    if (e != null) {
                        C90875ai.m148465b(new C116697f(this), this.f324260t.mo78490i(actionData3, ckVar, e, ((C116735gk) this.f324244d.mo27525b()).f323784p), this.f324261u, "Handle contact selection").mo85223a(C116724g.f323715a);
                        return;
                    }
                    return;
                }
                C59104x c5 = f324217a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "S_ActionState");
                ((C59052c) ((C59052c) c5).mo56372aa(31901)).mo56386p("Event data for the CONTACT_SELECTED_EXTERNALLY event missing expected id.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        mo103020p(Query.f252741b, (ActionData) null);
        this.f324260t.mo78497q((C87541c) this.f324247g.mo27525b());
    }

    /* renamed from: i */
    public final C87424l mo103014i() {
        if (this.f324235U == null) {
            this.f324235U = new C87424l();
        }
        return this.f324235U;
    }

    /* renamed from: j */
    public final CardDecision mo103015j() {
        CardDecision cardDecision;
        if (mo80807f() == null || (cardDecision = this.f324256p) == null) {
            return CardDecision.f236248b;
        }
        return cardDecision;
    }

    @Deprecated
    /* renamed from: k */
    public final C87541c mo103016k() {
        return (C87541c) this.f324247g.mo27525b();
    }

    /* renamed from: m */
    public final List mo103017m() {
        if (this.f324251k != null || !this.f324231Q.isEmpty()) {
            return this.f324231Q;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo103018n() {
        if (mo102983M(false) || m194066aG(this.f324250j)) {
            mo102980J();
            mo103009av();
            mo102979I();
            mo80591ar();
        }
    }

    /* renamed from: o */
    public final void mo103019o(Query query, ActionData actionData, List list) {
        mo102975E(actionData);
        this.f324249i = query;
        this.f324254n = null;
        this.f324255o = null;
        this.f324251k = list;
        m194062aC((CardDecision) null, true);
        C58976aa aaVar = C58975e.f156826a;
        this.f324248h.mo85057i(true != mo103006as() ? 0 : 131200);
        this.f324248h.mo85049c(0, 4608);
        if (!mo103006as()) {
            this.f324248h.mo85049c(0, 128);
        }
        mo103008au();
        mo103014i().mo81201a(this.f324250j, mo80807f(), this.f324249i);
        mo103027x();
    }

    /* renamed from: p */
    public final void mo103020p(Query query, ActionData actionData) {
        this.f324248h.mo85057i(128);
        this.f324251k = null;
        m194062aC((CardDecision) null, true);
        this.f324253m.clear();
        this.f324252l = 0;
        mo102975E(actionData);
        this.f324249i = query;
        this.f324254n = null;
        this.f324255o = null;
        this.f324233S = null;
        if (actionData != null) {
            if (actionData.mo81098i()) {
                mo102979I();
            }
            mo103026v(actionData, query);
        }
    }

    /* renamed from: q */
    public final void mo103021q(Query query) {
        if (mo102986P(query)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 194;
            String b = C39191a.m68623b(this.f324249i.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: r */
    public final void mo103022r() {
        VoiceAction voiceAction = this.f324232R;
        if (voiceAction == null || !voiceAction.mo81088z() || BitFlags.m148144f(this.f324248h.f253762b, 524288)) {
            voiceAction = null;
        } else {
            voiceAction.mo81058H();
        }
        if (voiceAction != null) {
            C58976aa aaVar = C58975e.f156826a;
            new C90873ag(this.f324260t.mo78488g(voiceAction, ((C116735gk) this.f324244d.mo27525b()).f323784p, C58833ax.m90834k(this)), this.f324261u, "executionResult callback", new C116825o(this, voiceAction)).mo85223a(C116826p.f324205a);
        }
    }

    /* renamed from: s */
    public final void mo103023s() {
        VoiceAction f = mo80807f();
        CardDecision j = mo103015j();
        ClientConfig clientConfig = ((C116569ag) this.f324266z.mo27525b()).f323267a;
        Query query = ((C116735gk) this.f324244d.mo27525b()).f323784p;
        boolean z = false;
        int i = 1;
        boolean z2 = clientConfig.mo81890h() && !mo102993X();
        boolean i2 = ((C116800iv) this.f324224G.mo27525b()).mo102949i(query);
        if (!((TtsState) this.f324220C.mo27525b()).mo102763s(j) && !((TtsState) this.f324220C.mo27525b()).mo102748A()) {
            z = true;
        }
        if (clientConfig.mo81908x()) {
            return;
        }
        if ((!mo103003ai() && (i2 || z2)) || z || query.mo84326bK()) {
            return;
        }
        if (!query.mo84337bV() && ((C84516aa) this.f324223F.mo27525b()).mo78228b()) {
            return;
        }
        if (f == null || !f.mo81051A() || !j.f236255i || j.f236254h) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ActionData actionData = this.f324250j;
        if (actionData == null) {
            actionData = ActionData.f235991b;
        }
        f.mo81071hx(286, query != null ? Long.valueOf(query.f252749G) : null, j, actionData.f235998h);
        if (m194068aI(actionData)) {
            mo102974D(f, 1);
            mo102972B(f, C87421i.f236079a, 1);
            return;
        }
        if (f.mo81082u() && actionData.mo81095g()) {
            i = 101;
        }
        mo102974D(f, i);
        mo103022r();
    }

    /* renamed from: t */
    public final void mo103024t() {
        PromptSegment e;
        CardDecision cardDecision = this.f324256p;
        if (cardDecision != null && (e = cardDecision.mo81420e(this.f324257q)) != null) {
            String str = e.f236271a;
            ImageInfo imageInfo = e.f236273c;
            if (!TextUtils.isEmpty(str) || !ImageInfo.m141972a(imageInfo)) {
                ActionData actionData = this.f324250j;
                String str2 = actionData != null ? actionData.f236000j : null;
                VoiceAction f = mo80807f();
                boolean z = false;
                if (mo102992W() && f != null && (f.mo81084w() || f.mo81083v())) {
                    z = true;
                }
                new C90873ag(this.f324260t.mo78486e(e, str2, z), this.f324261u, "Create ShowDisplaySegmentEventData", new C116805j(this)).mo85223a(C116821k.f324198a);
            }
            if (!TtsRequest.m141979c(e.f236272b)) {
                this.f324248h.mo85049c(0, 256);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action{");
        int identityHashCode = System.identityHashCode(this);
        sb.append("Identity=" + identityHashCode + " ");
        sb.append(" Flags=");
        sb.append(this.f324248h.mo85048b());
        sb.append(" ActionDataQuery=");
        Query query = this.f324249i;
        sb.append(query.mo84360bs(query.f252768g));
        sb.append(" ExtraCards=");
        sb.append(this.f324227M.toString());
        sb.append(" ");
        ActionData actionData = this.f324250j;
        sb.append(actionData == null ? "null data" : actionData.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public final void mo103026v(ActionData actionData, Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f324234T;
        if ((cxVar == null || cxVar.isDone()) && !actionData.mo81098i() && !m194070ak(actionData, this.f324249i)) {
            mo103021q(query);
            if (query.mo84435dP()) {
                C84809b bVar = this.f324260t;
                C116642cz czVar = (C116642cz) this.f324221D.mo27525b();
                PlaybackStatus playbackStatus = czVar.f323508g;
                czVar.f323508g = null;
                this.f324234T = bVar.mo78493l(query, actionData, playbackStatus, this.f324230P, this.f324229O);
                return;
            }
            C84809b bVar2 = this.f324260t;
            C116642cz czVar2 = (C116642cz) this.f324221D.mo27525b();
            PlaybackStatus playbackStatus2 = czVar2.f323508g;
            czVar2.f323508g = null;
            C60870cx k = bVar2.mo78492k(query, actionData, playbackStatus2, this.f324230P, this.f324229O);
            new C90873ag(k, this.f324261u, "Handle action", new C116589b(this, query, actionData)).mo85223a(C116616c.f323425a);
            this.f324234T = C118826c.m197213c(k);
        }
    }

    /* renamed from: x */
    public final void mo103027x() {
        VoiceAction f = mo80807f();
        if (f != null && f.mo81082u() && !mo102996aa()) {
            List ac = ((ModularAction) f).mo81223ac();
            if (!ac.isEmpty()) {
                Argument argument = (Argument) ac.get(0);
                if (this.f324248h.mo85049c(0, 4194304)) {
                    mo80591ar();
                }
                C90875ai.m148465b(new C116823m(this, argument), this.f324260t.mo78494m(argument), this.f324261u, "On top argument in ModularAction processed").mo85223a(C116824n.f324202a);
            }
        }
    }

    /* renamed from: y */
    public final void mo103028y() {
        CardDecision cardDecision;
        ClientConfig clientConfig = ((C116569ag) this.f324266z.mo27525b()).f323267a;
        C116735gk gkVar = (C116735gk) this.f324244d.mo27525b();
        if (this.f324249i.mo84361bt() && mo103015j().f236254h) {
            if ((mo102992W() || (cardDecision = this.f324256p) == null || cardDecision.f236266t.isEmpty()) && !gkVar.mo102878T() && this.f324249i.mo84383cP(gkVar.f323784p)) {
                C58976aa aaVar = C58975e.f156826a;
                if (this.f324249i.mo84430dK()) {
                    ((C116720fw) this.f324222E.mo27525b()).mo102849k(this.f324249i);
                }
                if (clientConfig.mo81909y()) {
                    this.f324255o = this.f324249i;
                    return;
                }
                ActionData actionData = this.f324250j;
                if (actionData != null) {
                    m194065aF(actionData, this.f324249i.mo84292ad());
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo103029z(VoiceAction voiceAction, C87423k kVar, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        C58976aa aaVar = C58975e.f156826a;
        boolean z4 = false;
        if (z2 && voiceAction != null) {
            List list = this.f324251k;
            if (list == null || list.isEmpty()) {
                arrayList = C58597ky.m90212c(voiceAction);
            } else {
                arrayList = C58597ky.m90211b(this.f324251k);
                arrayList.set(0, voiceAction);
            }
            ActionData actionData = this.f324250j;
            if (actionData != null) {
                z4 = m194067aH(actionData, arrayList);
            }
        }
        if (z3) {
            z4 |= m194064aE(2, 3, kVar);
        }
        if (voiceAction != null && z) {
            mo80769A(voiceAction);
        }
        if (z4) {
            mo80591ar();
        }
    }

    /* renamed from: av */
    public final void mo103009av() {
        List list;
        ActionData actionData = this.f324250j;
        if (actionData == null || (!actionData.mo81098i() && ((list = this.f324251k) == null || (!list.isEmpty() && (!mo102988S(this.f324250j) || this.f324256p == null))))) {
            this.f324248h.mo85049c(2, 0);
            return;
        }
        ActionData actionData2 = this.f324250j;
        Query query = ((C116735gk) this.f324244d.mo27525b()).f323784p;
        if (!(query == null || actionData2 == null || !mo103004aj())) {
            this.f324260t.mo78503w(query, actionData2, mo80807f(), mo103015j(), (C87541c) this.f324247g.mo27525b(), (C84773a) this.f324242b.mo27525b());
        }
        this.f324248h.mo85049c(0, 2);
    }
}
