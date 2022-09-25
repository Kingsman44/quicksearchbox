package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.support.p033v7.widget.LinearLayoutManager;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.lockscreenentry.LockscreenUnlockPausedActivity;
import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.p496a.p500c.C9311c;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6513aj.C84538aw;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.search.core.state.p6864a.C86798m;
import com.google.android.apps.gsa.search.core.state.p6864a.C86800o;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.dumper.C90538aa;
import com.google.android.apps.gsa.shared.speech.dumper.C90544ag;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.gsa.speech.audio.C92156ab;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.C92530c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p662i.C11443a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1010a.C13637a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.ssb.service.C45363i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5224k.p5225a.C67229g;
import dagger.C68214a;
import java.io.IOException;
import java.util.Random;

/* compiled from: PG */
public final class MicroDetectionWorker extends C86734a implements C84855a {

    /* renamed from: X */
    private static final C58528ij f286927X = C58733pz.f156496a;

    /* renamed from: a */
    public static final C59071e f286928a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker");

    /* renamed from: A */
    public final C68214a f286929A;

    /* renamed from: B */
    public final C58833ax f286930B;

    /* renamed from: C */
    final C68214a f286931C;

    /* renamed from: D */
    public final C68214a f286932D;

    /* renamed from: E */
    public final C58833ax f286933E;

    /* renamed from: F */
    public final boolean f286934F;

    /* renamed from: G */
    public final C68214a f286935G;

    /* renamed from: H */
    public final C92196g f286936H;

    /* renamed from: I */
    public final C58833ax f286937I;

    /* renamed from: J */
    public final C58833ax f286938J;

    /* renamed from: K */
    public final C68214a f286939K;

    /* renamed from: L */
    public final C68214a f286940L;

    /* renamed from: M */
    public final C9311c f286941M;

    /* renamed from: N */
    public final C90544ag f286942N;

    /* renamed from: O */
    public final C68214a f286943O;

    /* renamed from: P */
    public final C68214a f286944P;

    /* renamed from: Q */
    public TelephonyManager f286945Q;

    /* renamed from: R */
    public final C68214a f286946R;

    /* renamed from: S */
    boolean f286947S;

    /* renamed from: T */
    public C60870cx f286948T;

    /* renamed from: U */
    public final C13637a f286949U;

    /* renamed from: V */
    public final C11443a f286950V;

    /* renamed from: W */
    public final C92214y f286951W;

    /* renamed from: Y */
    private final C89331a f286952Y;

    /* renamed from: Z */
    private final C86800o f286953Z;

    /* renamed from: aa */
    private final C68214a f286954aa;

    /* renamed from: ab */
    private final C68214a f286955ab;

    /* renamed from: ac */
    private final C68214a f286956ac;

    /* renamed from: ad */
    private final bo f286957ad;

    /* renamed from: ae */
    private final C85385b f286958ae;

    /* renamed from: af */
    private final C102831d f286959af;

    /* renamed from: ag */
    private final C68214a f286960ag;

    /* renamed from: ah */
    private final C58833ax f286961ah;

    /* renamed from: ai */
    private final C92157ac f286962ai;

    /* renamed from: aj */
    private long f286963aj = 0;

    /* renamed from: ak */
    private long f286964ak = 0;

    /* renamed from: al */
    private C102790aa f286965al;

    /* renamed from: am */
    private boolean f286966am;

    /* renamed from: an */
    private C60870cx f286967an;

    /* renamed from: ao */
    private boolean f286968ao;

    /* renamed from: ap */
    private boolean f286969ap;

    /* renamed from: aq */
    private final C92533a f286970aq;

    /* renamed from: b */
    final C86798m f286971b;

    /* renamed from: c */
    public final C86787b f286972c;

    /* renamed from: f */
    public final C86794i f286973f;

    /* renamed from: g */
    public final C86978dd f286974g;

    /* renamed from: h */
    public final Context f286975h;

    /* renamed from: i */
    public final C86124t f286976i;

    /* renamed from: j */
    public final AudioManager f286977j;

    /* renamed from: k */
    public final C22871g f286978k;

    /* renamed from: l */
    public final C22871g f286979l;

    /* renamed from: m */
    public final C22871g f286980m;

    /* renamed from: n */
    public final C84516aa f286981n;

    /* renamed from: o */
    public final C89994f f286982o;

    /* renamed from: p */
    public final C86152a f286983p;

    /* renamed from: q */
    public final C84538aw f286984q;

    /* renamed from: r */
    public final C86610af f286985r;

    /* renamed from: s */
    public final C86054o f286986s;

    /* renamed from: t */
    public final C68214a f286987t;

    /* renamed from: u */
    public final C68214a f286988u;

    /* renamed from: v */
    public final C68214a f286989v;

    /* renamed from: w */
    public final C68214a f286990w;

    /* renamed from: x */
    public final SharedPreferences f286991x;

    /* renamed from: y */
    public final C21370a f286992y;

    /* renamed from: z */
    public final bm f286993z;

    /* compiled from: PG */
    class ResultReceiverCallback extends ResultReceiver {

        /* renamed from: b */
        private final Intent f286995b;

        public ResultReceiverCallback(Intent intent) {
            super(new Handler(Looper.getMainLooper()));
            this.f286995b = intent;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            C59071e eVar = MicroDetectionWorker.f286928a;
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = this.f286995b;
            if (intent != null) {
                MicroDetectionWorker.this.mo93434G(intent);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MicroDetectionWorker(Context context, C86787b bVar, C86798m mVar, C89331a aVar, C86794i iVar, C86800o oVar, C86978dd ddVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C86124t tVar, C21370a aVar2, C86152a aVar3, AudioManager audioManager, C92214y yVar, C84516aa aaVar, C89994f fVar, C68214a aVar4, C84538aw awVar, C86610af afVar, C86054o oVar2, C68214a aVar5, C68214a aVar6, SharedPreferences sharedPreferences, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C90758bb bbVar, bm bmVar, bo boVar, C68214a aVar11, C68214a aVar12, C58833ax axVar, C68214a aVar13, C68214a aVar14, C58833ax axVar2, boolean z, C85385b bVar2, C68214a aVar15, C92196g gVar4, C102831d dVar, C58833ax axVar3, C58833ax axVar4, C68214a aVar16, C68214a aVar17, C68214a aVar18, C9311c cVar, C90544ag agVar, C11443a aVar19, C13637a aVar20, C68214a aVar21, C68214a aVar22, C92533a aVar23, C58833ax axVar5) {
        super(C118575h.WORKER_MICRO_DETECTION, "microdetection");
        C60870cx cxVar = C60866ct.f164955a;
        this.f286948T = cxVar;
        this.f286967an = cxVar;
        this.f286969ap = true;
        this.f286950V = aVar19;
        this.f286949U = aVar20;
        this.f286972c = bVar;
        this.f286971b = mVar;
        this.f286952Y = aVar;
        this.f286973f = iVar;
        this.f286953Z = oVar;
        this.f286974g = ddVar;
        this.f286976i = tVar;
        this.f286978k = gVar;
        this.f286979l = gVar2;
        this.f286980m = gVar3;
        this.f286975h = context;
        this.f286992y = aVar2;
        this.f286983p = aVar3;
        this.f286977j = audioManager;
        this.f286951W = yVar;
        this.f286981n = aaVar;
        this.f286982o = fVar;
        this.f286954aa = aVar4;
        this.f286984q = awVar;
        this.f286985r = afVar;
        this.f286986s = oVar2;
        this.f286987t = aVar5;
        this.f286955ab = aVar6;
        this.f286991x = sharedPreferences;
        this.f286959af = dVar;
        this.f286990w = aVar7;
        this.f286988u = aVar8;
        this.f286989v = aVar9;
        this.f286956ac = aVar10;
        this.f286962ai = new C92157ac(bbVar);
        this.f286993z = bmVar;
        this.f286957ad = boVar;
        this.f286929A = aVar11;
        this.f286946R = aVar12;
        this.f286930B = axVar;
        this.f286931C = aVar13;
        this.f286932D = aVar14;
        this.f286933E = axVar2;
        this.f286934F = z;
        this.f286935G = aVar15;
        this.f286937I = axVar3;
        this.f286958ae = bVar2;
        this.f286936H = gVar4;
        this.f286938J = axVar4;
        this.f286939K = aVar16;
        this.f286960ag = aVar17;
        this.f286940L = aVar18;
        this.f286941M = cVar;
        this.f286942N = agVar;
        this.f286943O = aVar21;
        this.f286944P = aVar22;
        this.f286970aq = aVar23;
        this.f286961ah = axVar5;
    }

    /* renamed from: F */
    public static void m170413F(C68214a aVar, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        ((C91097g) aVar.mo27525b()).mo65089a(intent);
    }

    /* renamed from: H */
    public static void m170414H(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r2.f232820b.mo79804a();
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m170415U(com.google.android.apps.gsa.search.core.p6809l.C86152a r2, com.google.common.base.C58833ax r3) {
        /*
            int r0 = com.google.android.apps.gsa.opa.C83583an.m133152g(r2)
            if (r0 != 0) goto L_0x001f
            boolean r1 = r3.mo56113h()
            if (r1 == 0) goto L_0x001f
            com.google.android.apps.gsa.search.core.l.j r2 = r2.f232820b
            java.lang.String r2 = r2.mo79804a()
            if (r2 == 0) goto L_0x001f
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r3 = (com.google.android.apps.gsa.assistant.shared.bd) r3
            int r2 = r3.i(r2)
            return r2
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170415U(com.google.android.apps.gsa.search.core.l.a, com.google.common.base.ax):int");
    }

    /* renamed from: W */
    private final C58833ax m170416W() {
        long c = this.f286961ah.mo56113h() ? ((C81323s) this.f286961ah.mo56107c()).mo74938c() : 0;
        if (c <= 0) {
            return C58836b.f156633a;
        }
        long c2 = this.f286992y.mo26871c() - c;
        if (c2 > this.f286976i.mo79743a(C90082eg.f249956bS)) {
            return C58836b.f156633a;
        }
        if (c2 <= 0) {
            C59104x b = f286928a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(21083)).mo56388r("Time since most recent near-miss is negative?! Propagating to server logs: %d ms.", c2);
        }
        return C58833ax.m90834k(Long.valueOf(c2));
    }

    /* renamed from: X */
    private final C59687cb m170417X() {
        boolean z = false;
        if (!((C91123v) this.f286939K.mo27525b()).mo85390b() && this.f286973f.mo80452c() && this.f286973f.mo80453e()) {
            z = true;
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String Z = this.f286982o.mo83863Z();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        Z.getClass();
        cbVar.f160115b |= 4096;
        cbVar.f160048M = Z;
        String str = Build.MANUFACTURER + "_" + Build.MODEL;
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160115b |= 1048576;
        cbVar2.f160057V = str;
        ajVar.copyOnWrite();
        C59687cb cbVar3 = (C59687cb) ajVar.instance;
        cbVar3.f160123d |= 64;
        cbVar3.f160075aM = z;
        int i = 3;
        int i2 = true != this.f286981n.mo78228b() ? 3 : 2;
        ajVar.copyOnWrite();
        C59687cb cbVar4 = (C59687cb) ajVar.instance;
        cbVar4.f160094af = i2 - 1;
        cbVar4.f160115b |= 1073741824;
        amo amo = mo93448w().f236951d;
        ajVar.copyOnWrite();
        C59687cb cbVar5 = (C59687cb) ajVar.instance;
        cbVar5.f160095ag = amo.f159234au;
        cbVar5.f160115b |= LinearLayoutManager.INVALID_OFFSET;
        boolean e = this.f286982o.mo83816e();
        C58833ax W = m170416W();
        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
        if (true == e) {
            i = 2;
        }
        ayVar.copyOnWrite();
        C59651be beVar = (C59651be) ayVar.instance;
        beVar.f159941g = i - 1;
        beVar.f159935a |= 32;
        ayVar.copyOnWrite();
        C59651be beVar2 = (C59651be) ayVar.instance;
        beVar2.f159935a |= 128;
        beVar2.f159943i = W.mo56113h();
        long longValue = ((Long) W.mo56109e(-1L)).longValue();
        ayVar.copyOnWrite();
        C59651be beVar3 = (C59651be) ayVar.instance;
        beVar3.f159935a |= 512;
        beVar3.f159944j = longValue;
        ajVar.mo57010g((C59651be) ayVar.build());
        return (C59687cb) ajVar.build();
    }

    /* renamed from: Y */
    private final String m170418Y() {
        return ((C86338r) this.f286954aa.mo27525b()).getString(C90507o.f253011a, (String) null);
    }

    /* renamed from: Z */
    private final void m170419Z() {
        if (!this.f286976i.mo79746e(C90110fh.f250606aD)) {
            return;
        }
        if (this.f286993z.s()) {
            this.f286971b.mo80478q(true);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        ((C92486a) this.f286988u.mo27525b()).mo87239m(false, EventForDump.m147675d(29));
        this.f286971b.mo80478q(false);
    }

    /* renamed from: aa */
    private final boolean m170420aa() {
        return this.f286976i.mo79746e(C90082eg.f250068e) && !f286927X.contains(this.f286982o.mo83863Z());
    }

    /* renamed from: ab */
    private final boolean m170421ab() {
        return amo.SPEAKER_ID_ENROLLMENT.equals(mo93448w().f236951d) || amo.TI_SID_ENROLLMENT.equals(mo93448w().f236951d);
    }

    /* renamed from: v */
    static Intent m170422v(Context context, C86124t tVar, C86152a aVar, C58833ax axVar, HotwordResult hotwordResult, boolean z, long j, Uri uri, boolean z2) {
        int i;
        HotwordResultMetadata r = hotwordResult == null ? null : HotwordResultMetadata.m147624r(context, hotwordResult, z, j, z2);
        int U = m170415U(aVar, axVar);
        if (hotwordResult != null) {
            i = hotwordResult.mo84685e();
        } else {
            i = (int) tVar.mo79743a(C90082eg.f250028cl);
        }
        return C83583an.m133146a(U, r, uri, 16000, i, 0);
    }

    /* renamed from: y */
    public static String m170423y(Query query) {
        if (query.mo84412cs()) {
            return "car_assistant";
        }
        return query.mo84403cj() ? "opa" : "search";
    }

    /* renamed from: A */
    public final void mo93429A(C92530c cVar, long j) {
        int i;
        long j2 = j;
        if (this.f286964ak > j2) {
            C59104x c = f286928a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) c).mo56372aa(21098)).mo56386p("Stale runnable..ignoring");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f286982o.mo83855R() == 0 && !((C91123v) this.f286939K.mo27525b()).mo85393e() && !((C91123v) this.f286939K.mo27525b()).mo85390b()) {
            ((C92486a) this.f286988u.mo27525b()).mo87239m(false, EventForDump.m147675d(18));
            this.f286982o.mo83903aw(2, EventForDump.m147675d(18));
            this.f286991x.edit().putBoolean("undecidedStateBeforeMigration", true).apply();
        } else if (this.f286982o.mo83855R() != 2 || !this.f286991x.getBoolean("hotwordDetector", true)) {
            this.f286964ak = j2;
            if (cVar.mo87301b()) {
                if (m170420aa() && this.f286982o.mo83816e() && !this.f286982o.mo83817f() && !m170421ab()) {
                    Intent intent = new Intent("com.google.android.googlequicksearchbox.STOP_DSP_HOTWORD");
                    intent.setPackage("com.google.android.googlequicksearchbox");
                    this.f286975h.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
                } else if (C118726n.m197095c(this.f286976i.mo79746e(C90082eg.f249911aa)) && !this.f286982o.mo83816e() && !this.f286982o.mo83824m(m170418Y()) && !m170421ab()) {
                    Intent intent2 = new Intent("com.google.android.googlequicksearchbox.STOP_HOTWORD");
                    intent2.setPackage("com.google.android.googlequicksearchbox");
                    intent2.putExtra("extra_disregard_voice_match", true);
                    this.f286975h.sendBroadcast(intent2, "android.permission.MANAGE_VOICE_KEYPHRASES");
                }
                if (((C102792ac) this.f286929A.mo27525b()).mo93456d()) {
                    mo93436J();
                }
            } else if (m170420aa() && cVar.mo87302c() && this.f286982o.mo83816e() && !this.f286982o.mo83817f() && !m170421ab()) {
                Intent intent3 = new Intent("com.google.android.googlequicksearchbox.START_DSP_HOTWORD");
                intent3.setPackage("com.google.android.googlequicksearchbox");
                this.f286975h.sendBroadcast(intent3, "android.permission.MANAGE_VOICE_KEYPHRASES");
            } else if (!C118726n.m197095c(this.f286976i.mo79746e(C90082eg.f249911aa)) || this.f286982o.mo83816e() || this.f286982o.mo83824m(m170418Y()) || m170421ab() || !cVar.mo87302c()) {
                if (this.f286965al == null) {
                    this.f286965al = new C102863s(this);
                }
                C102792ac acVar = (C102792ac) this.f286929A.mo27525b();
                this.f286968ao = true;
                if (acVar.mo93456d()) {
                    acVar.mo93457e(Query.f252741b);
                }
                ClientConfig w = mo93448w();
                if (w.mo81905v()) {
                    i = 1;
                } else if (w.mo81874D()) {
                    i = 3;
                } else if (!this.f286982o.mo83824m(m170418Y()) && (!this.f286982o.mo83817f() || !this.f286982o.mo83847J(m170418Y()))) {
                    i = 0;
                } else {
                    i = 2;
                }
                boolean z = (i == 1 || i == 3) && w.mo81882L();
                C90582d a = ((C92486a) this.f286988u.mo27525b()).mo87228a(z);
                boolean z2 = !z;
                boolean b = k.b(this.f286976i, this.f286985r.f233970e.mo80559a().mo80460i());
                boolean ab = m170421ab();
                C59104x b2 = f286928a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
                ((C59052c) ((C59052c) b2).mo56372aa(21123)).mo56387q("#startMicroDetector [speakerMode: %d]", i);
                Query i2 = this.f286985r.f233970e.mo80559a().mo80460i();
                boolean z3 = i2 != null && i2.mo84412cs() && !((C91123v) this.f286939K.mo27525b()).mo85390b();
                C102790aa aaVar2 = this.f286965al;
                C92157ac acVar2 = this.f286962ai;
                acVar.f287015b.mo85091a();
                C102790aa aaVar3 = acVar.f287020g;
                if (!(aaVar3 == null || aaVar3 == aaVar2)) {
                    acVar.f287020g = aaVar2;
                    ((C89911f) acVar.f287017d.mo27525b()).mo83755a((Throwable) null, 8543612, 29).mo83721a();
                }
                synchronized (acVar) {
                    if (!acVar.f287021h) {
                        acVar.f287020g = aaVar2;
                        acVar.mo93454b(a, cVar, acVar2, i, b, ab, z2, z3);
                    }
                }
            } else {
                Intent intent4 = new Intent("com.google.android.googlequicksearchbox.START_HOTWORD");
                intent4.setPackage("com.google.android.googlequicksearchbox");
                intent4.putExtra("extra_disregard_voice_match", true);
                this.f286975h.sendBroadcast(intent4, "android.permission.MANAGE_VOICE_KEYPHRASES");
            }
        } else {
            ((C92486a) this.f286988u.mo27525b()).mo87239m(false, EventForDump.m147675d(23));
            ((C118827a) this.f286940L.mo27525b()).mo77944g(C118569b.VOICE_MATCH_SETTING_ERROR_FROM_DECLINED_STATE, C118575h.WORKER_MICRO_DETECTION).mo104025g(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo93430B(Uri uri) {
        if (uri != null) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                ParcelFileDescriptor openFileDescriptor = this.f286975h.getContentResolver().openFileDescriptor(uri, C33259r.f88929b);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
            } catch (IOException | SecurityException e) {
                C59104x c = f286928a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21102)).mo56386p("#closeAudioProvider");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo93431C(HotwordResult hotwordResult, Uri uri) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f286965al == null) {
            this.f286965al = new C102863s(this);
        }
        C102790aa aaVar2 = this.f286965al;
        C58836b bVar = C58836b.f156633a;
        ((C89859i) this.f286931C.mo27525b()).mo74236a(aaVar2.mo93452a(hotwordResult, uri, bVar, bVar));
    }

    /* renamed from: D */
    public final void mo93432D(boolean z, Query query) {
        if (!this.f286976i.mo79746e(C90051dc.f248842ax) || !query.mo84458dl()) {
            ((C92156ab) this.f286960ag.mo27525b()).mo86831d(new Random().nextLong(), z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo93433E(Context context, boolean z, String str) {
        if (this.f286971b.mo80485x(z, str) && z) {
            Intent intent = new Intent("com.google.android.googlequicksearchbox.interactor.RESTART_RECOGNITION");
            intent.putExtra("delayStartByMilliseconds", SimpleSnackbar.LENGTH_SHORT);
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: G */
    public final void mo93434G(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) this.f286931C.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_LOCKSCREEN);
        intent.removeExtra("audio_content_uri");
        m170413F(this.f286990w, intent);
        mo93437K(268435482);
    }

    /* renamed from: I */
    public final void mo93435I(String str, boolean z) {
        this.f286979l.mo28212l("Hotword Debug Toast", new C102858n(this, z, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo93436J() {
        this.f286948T.cancel(false);
        C102792ac acVar = (C102792ac) this.f286929A.mo27525b();
        if (acVar.mo93456d()) {
            C58976aa aaVar = C58975e.f156826a;
            Query i = this.f286985r.f233970e.mo80559a().mo80460i();
            if (!this.f286985r.f233970e.mo80559a().mo80455H() || i == null || !this.f286985r.f233970e.mo80559a().mo80458S()) {
                acVar.mo93457e(Query.f252741b);
            } else if (acVar.mo93457e(i) && !i.mo84403cj() && !i.mo84338bW()) {
                ((C92156ab) this.f286960ag.mo27525b()).mo86831d(i.f252751I, C92207r.m151409a(i, this.f286976i));
            }
        }
    }

    /* renamed from: K */
    public final void mo93437K(int i) {
        if (this.f286947S && this.f286981n.mo78227a() != 0) {
            this.f286981n.mo78231e(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo93438L() {
        if (!this.f286981n.mo78230d()) {
            this.f286981n.mo78231e(268435482);
        }
    }

    /* renamed from: M */
    public final void mo93439M(String str, C90584f fVar) {
        this.f286971b.mo80469g(((C92504i) this.f286955ab.mo27525b()).mo87261a(str, fVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo93440N(boolean z, boolean z2) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f286969ap = false;
            return false;
        }
        if (!this.f286969ap) {
            if (z2) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f286969ap = true;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                return false;
            }
        }
        C58976aa aaVar4 = C58975e.f156826a;
        return this.f286981n.mo78230d();
    }

    /* renamed from: O */
    public final boolean mo93441O() {
        return this.f286982o.mo83817f() || this.f286982o.mo83824m(this.f286986s.mo79659F());
    }

    /* renamed from: P */
    public final boolean mo93442P() {
        if (this.f286991x.getBoolean("speech_hotword_toast_debug", false) || (this.f286976i.mo79746e(C90086ek.f250517o) && ((C91123v) this.f286939K.mo27525b()).mo85390b())) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final void mo93443Q(int i) {
        boolean z = false;
        if (!this.f286953Z.mo80494a() && this.f286957ad.s(true, i)) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f286957ad.x(2, 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo93444R(boolean z) {
        boolean isDeviceLocked = this.f286981n.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        if (!isDeviceLocked) {
            return true;
        }
        C92486a aVar = (C92486a) this.f286988u.mo27525b();
        boolean x = aVar.mo87250x();
        boolean y = aVar.mo87251y();
        if (!x && !y) {
            return false;
        }
        if (!this.f286993z.s() || !this.f286976i.mo79746e(C90014bt.f247232dK)) {
            return this.f286991x.getBoolean("hotword_from_lock_screen", false);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo93445S(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        mo93438L();
        if (this.f286993z.s() && this.f286993z.s()) {
            Context context = this.f286975h;
            Intent intent2 = new Intent();
            intent2.setClassName(context, LockscreenUnlockPausedActivity.class.getCanonicalName());
            intent2.putExtra("lockscreen_voice_unlock_entry_id", 0);
            intent2.setFlags(268468224);
            Intent putExtra = new Intent(this.f286975h, ProxyActivity.class).putExtra("android.intent.extra.INTENT", intent2);
            putExtra.putExtra("receiver", new ResultReceiverCallback(intent));
            m170414H(1100);
            ((C91097g) this.f286990w.mo27525b()).mo65089a(putExtra);
        }
        if (!this.f286953Z.mo80494a()) {
            m170414H(834);
            SharedPreferences.Editor edit = this.f286991x.edit();
            edit.putInt("trusted_voice_paused_notification_state", 2);
            edit.apply();
        }
    }

    /* renamed from: T */
    public final void mo93446T(int i, Query query, HotwordResult hotwordResult, int i2) {
        this.f286959af.mo84742b(mo93448w().f236951d, mo93450z(), i, query, hotwordResult, i2, false, false, mo93441O());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo93447V() {
        this.f286976i.mo79743a(C90082eg.f250065dv);
        synchronized (this.f286952Y.f242191a) {
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final C60870cx mo78535a(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        String action = intent.getAction();
        if (action.equals("com.google.android.googlequicksearchbox.action.PAUSE_HOTWORD")) {
            mo93433E(this.f286975h, true, intent.getStringExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE"));
        } else if (action.equals("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD")) {
            mo93433E(this.f286975h, false, intent.getStringExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE"));
        }
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo78536c() {
        if (!m170416W().mo56113h()) {
            return C118826c.f331423b;
        }
        ((C89859i) this.f286931C.mo27525b()).mo83702b(C89849ae.KEYGUARD_UNLOCKED_AFTER_NEAR_MISS_SINGLETON_START);
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.KEYGUARD_UNLOCKED_AFTER_NEAR_MISS;
        fVar.f246203c = m170417X();
        ((C89859i) this.f286931C.mo27525b()).mo74236a(fVar.mo83699a());
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78537e(HotwordDetectedEventData hotwordDetectedEventData) {
        ((C89859i) this.f286931C.mo27525b()).mo83702b(C89849ae.WORKER_RECEIVED_HOTWORD_FROM_INTERACTOR);
        C118826c.m197213c(this.f286942N.f253129b.mo46039a(C90538aa.f253122a, C60826bg.f164896a));
        HotwordResult hotwordResult = hotwordDetectedEventData.f253053a;
        mo93431C(hotwordResult, hotwordDetectedEventData.f253054b);
        SpeakerIdModel o = hotwordResult.mo84697o();
        if (hotwordResult.mo84676A() && o != null) {
            this.f286982o.mo83845H(o, false, EventForDump.m147676e(6, "onHotwordDetectedInInteractor"));
        }
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final C60870cx mo78538f(HotwordResult hotwordResult) {
        if (hotwordResult != null && hotwordResult.mo84678C() && !hotwordResult.mo84680E()) {
            mo93446T(400, this.f286984q.mo78246b(this.f286981n.mo78228b(), mo93444R(false), this.f286973f.mo80452c(), this.f286973f.mo80451b(), this.f286985r.f233970e.mo80559a().mo80459X(), (Uri) null, hotwordResult.mo84691i(), this.f286973f.mo80453e(), false), hotwordResult, this.f286981n.mo78232f());
        }
        if (mo93442P()) {
            mo93435I("DSP trigger / SW Reject", true);
        }
        this.f286991x.edit().putLong("last_missed_hotword_time_ms", this.f286992y.mo26871c()).apply();
        C58976aa aaVar = C58975e.f156826a;
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo78539g() {
        C58976aa aaVar = C58975e.f156826a;
        C90599p F = HotwordResult.m147742F();
        F.mo84728q(16000);
        F.mo84719h(true);
        F.mo84731t(1.0f);
        mo93431C(F.mo84712a(), (Uri) null);
        return C118826c.f331423b;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MicroDetectionWorker");
        C89994f fVar2 = this.f286982o;
        SpeakerIdModel D = fVar2.mo83841D(fVar2.mo83882ab());
        if (D == null) {
            fVar.mo85279c("speakerId model").mo85276a(C90752i.m148229c("not available"));
        } else if (D.f253284b.mo56113h()) {
            fVar.mo85279c("speakerId model").mo85276a(C90752i.m148229c("available"));
        } else {
            fVar.mo85279c("speakerId model").mo85276a(C90752i.m148229c("not available"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1.mo81904u() != false) goto L_0x004a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78540h() {
        /*
            r15 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.aj.aa r0 = r15.f286981n
            boolean r0 = r0.mo78228b()
            if (r0 != 0) goto L_0x000c
            goto L_0x010f
        L_0x000c:
            r0 = 4
            r15.mo93443Q(r0)
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r15.mo93448w()
            com.google.android.apps.gsa.assistant.shared.bm r2 = r15.f286993z
            boolean r2 = r2.u()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0028
            com.google.android.apps.gsa.assistant.shared.bm r2 = r15.f286993z
            boolean r2 = r2.n()
            if (r2 != 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            boolean r5 = r1.mo81876F()
            if (r5 == 0) goto L_0x0044
            com.google.android.apps.gsa.search.core.state.dd r1 = r15.f286974g
            if (r4 == r2) goto L_0x0036
            java.lang.String r5 = "search"
            goto L_0x0038
        L_0x0036:
            java.lang.String r5 = "opa"
        L_0x0038:
            com.google.android.apps.gsa.search.shared.service.c.a r6 = new com.google.android.apps.gsa.search.shared.service.c.a
            r7 = 100
            r6.<init>(r7, r5)
            r5 = 0
            r1.mo80620e(r6, r5)
            goto L_0x004a
        L_0x0044:
            boolean r1 = r1.mo81904u()
            if (r1 == 0) goto L_0x010f
        L_0x004a:
            if (r2 == 0) goto L_0x0070
            android.content.Context r5 = r15.f286975h
            com.google.android.apps.gsa.search.core.i.t r6 = r15.f286976i
            com.google.android.apps.gsa.search.core.l.a r7 = r15.f286983p
            com.google.common.base.ax r8 = r15.f286938J
            r9 = 0
            com.google.android.apps.gsa.search.core.aj.aa r0 = r15.f286981n
            boolean r0 = r0.mo78228b()
            boolean r10 = r15.mo93440N(r0, r4)
            com.google.android.libraries.f.a r0 = r15.f286992y
            long r11 = r0.mo26871c()
            r13 = 0
            r14 = 0
            android.content.Intent r0 = m170422v(r5, r6, r7, r8, r9, r10, r11, r13, r14)
            r15.mo93434G(r0)
            goto L_0x010f
        L_0x0070:
            com.google.android.apps.gsa.search.shared.service.c.b.bn r1 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn.f239106g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.bm r1 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88442bm) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            int r5 = r2.f239108a
            r5 = r5 | 2
            r2.f239108a = r5
            r2.f239110c = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            int r5 = r2.f239108a
            r5 = r5 | r4
            r2.f239108a = r5
            java.lang.String r5 = "android-lockscreen"
            r2.f239109b = r5
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.LOCKSCREEN_ENTRY
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r5
            int r2 = r2.f159234au
            r5.f239112e = r2
            int r2 = r5.f239108a
            r2 = r2 | 8
            r5.f239108a = r2
            boolean r2 = r15.mo93444R(r3)
            if (r2 != 0) goto L_0x00be
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            int r3 = r2.f239108a
            r0 = r0 | r3
            r2.f239108a = r0
            r2.f239111d = r4
        L_0x00be:
            com.google.android.apps.gsa.shared.search.Query r0 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84294af()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            int r2 = r2.f239110c
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84342ba(r2)
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            java.lang.String r2 = r2.f239109b
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84275aL(r2)
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r2
            int r2 = r2.f239112e
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.m92435a(r2)
            if (r2 != 0) goto L_0x00e6
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.UNKNOWN
        L_0x00e6:
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84272aI(r2)
            com.google.protobuf.bv r1 = r1.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bn r1 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn) r1
            boolean r1 = r1.f239111d
            if (r1 == 0) goto L_0x00f6
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84291ab()
        L_0x00f6:
            com.google.android.apps.gsa.search.core.i.t r1 = r15.f286976i
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90114fl.f250730d
            boolean r1 = r1.mo79746e(r2)
            if (r1 != 0) goto L_0x010f
            com.google.android.apps.gsa.search.core.service.af r1 = r15.f286985r
            java.lang.String r2 = m170423y(r0)
            com.google.android.apps.gsa.search.core.state.cu r1 = r1.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r1 = r1.mo80560b(r2)
            r1.mo80462q(r0)
        L_0x010f:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.mo78540h():com.google.common.util.concurrent.cx");
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f286968ao) {
            mo93436J();
        }
    }

    /* renamed from: i */
    public final C60870cx mo78541i(HotwordResult hotwordResult, long j) {
        C58833ax p = hotwordResult.mo84698p();
        if (p.mo56113h()) {
            this.f286951W.mo86891b(j, new a(hotwordResult.mo84691i(), hotwordResult.mo84685e(), (byte[]) p.mo56107c()));
        }
        return C118826c.f331423b;
    }

    /* renamed from: ib */
    public final void mo80350ib() {
        m170419Z();
        mo93439M(this.f286982o.mo83863Z(), this.f286982o.mo83827p());
    }

    /* renamed from: j */
    public final C60870cx mo78542j() {
        synchronized (this.f286952Y.f242191a) {
        }
        ((C92486a) this.f286988u.mo27525b()).mo87232f();
        return C118826c.f331423b;
    }

    /* renamed from: k */
    public final void mo78543k(int i) {
        String str;
        C90584f fVar;
        boolean L = mo93448w().mo81882L();
        boolean M = mo93448w().mo81883M();
        boolean z = i == 2;
        C59104x b = f286928a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) b).mo56372aa(21105)).mo56360M("Initializing MicroDataManager InitializeType-%d, isForced-%b, isActivePhoneEnrollment-%b isActiveGoogleHomeEnrollment-%b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(M), Boolean.valueOf(L));
        if (L || M) {
            if (L) {
                str = ((C92371d) this.f286956ac.mo27525b()).mo87021b();
            } else {
                str = this.f286982o.mo83863Z();
            }
            if (L) {
                fVar = this.f286982o.mo83828q();
            } else {
                fVar = this.f286982o.mo83827p();
            }
            this.f286978k.mo28212l("Enrollment hotword model initialized", new C102854j(this, str, fVar));
            return;
        }
        ((C92504i) this.f286955ab.mo27525b()).mo87265f(this.f286982o.mo83863Z(), new C102855k(this), z, this.f286982o.mo83827p());
    }

    /* renamed from: l */
    public final void mo78544l(boolean z) {
        if (this.f286966am != z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f286966am = z;
            boolean D = this.f286971b.mo80491D();
            C22872h.m42743c(C86593a.class);
            C45363i.f118607b.mo49379f(D);
        }
    }

    /* renamed from: m */
    public final void mo78545m(HotwordResult hotwordResult) {
        C86775r rVar = this.f286985r.f233977l;
        if (hotwordResult != null && rVar != null) {
            if (rVar.f234384f.mo81874D() || rVar.f234384f.mo81905v()) {
                C58976aa aaVar = C58975e.f156826a;
                C86771n nVar = rVar.f234383e;
                C87684al alVar = new C87684al(C88244um.SHOW_HOTWORD_TRIGGERED);
                alVar.mo81966c(hotwordResult);
                nVar.mo80379b(alVar.mo81964a());
            }
        }
    }

    /* renamed from: n */
    public final void mo78546n() {
        C86775r rVar = this.f286985r.f233977l;
        if (rVar != null && rVar.f234384f.mo81874D()) {
            C59104x c = f286928a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) c).mo56372aa(21114)).mo56386p("#onHotwordDetectionError");
            C59104x c2 = C86775r.f234377a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AttachedClient");
            ((C59052c) ((C59052c) c2).mo56372aa(8362)).mo56386p("#onHotwordDetectionError");
            rVar.f234383e.mo80379b(new C87684al(C88244um.ON_HOTWORD_DETECTION_ERROR).mo81964a());
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final void mo78547p(boolean z) {
        this.f286978k.mo28212l("MicroDetectionWorker.setIsEnrollmentClientConnected", new C102849e(this, z));
    }

    /* renamed from: q */
    public final void mo78548q(boolean z) {
        this.f286978k.mo28212l("MicroDetectionWorker.setIsGearHeadClientConnected", new C102853i(this, z));
    }

    /* renamed from: r */
    public final void mo78549r(boolean z) {
        this.f286978k.mo28212l("MicroDetectionWorker.setIsMorrisClientConnected", new C102850f(this, z));
    }

    /* renamed from: t */
    public final void mo78550t() {
        C58976aa aaVar = C58975e.f156826a;
        ((C92486a) this.f286988u.mo27525b()).mo87235i();
    }

    /* renamed from: u */
    public final void mo78551u() {
        boolean z = true;
        if (!((this.f286970aq.mo87309c() != 2 && !this.f286976i.mo79746e(C90082eg.f249960bW)) || this.f286982o.mo83855R() == 1 || this.f286982o.mo83855R() == 4)) {
            C59104x b = f286928a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(21112)).mo56386p("Attempting incomplete state migration.");
            this.f286970aq.mo87308b(1, EventForDump.m147675d(21));
            ((C92486a) this.f286988u.mo27525b()).mo87238l(true);
        }
        if (this.f286982o.mo83819h() && this.f286986s.mo79659F() == null && this.f286976i.mo79746e(C90082eg.f249859B) && !((C91123v) this.f286939K.mo27525b()).mo85393e() && !((C91123v) this.f286939K.mo27525b()).mo85390b()) {
            C59104x b2 = f286928a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b2).mo56372aa(21111)).mo56386p("Removing hotword detection due to no account being used.");
            ((C92486a) this.f286988u.mo27525b()).mo87239m(false, EventForDump.m147675d(2));
        }
        this.f286967an.cancel(false);
        this.f286967an = this.f286978k.mo28208h("Refresh external audio state", 500, new C102856l(this));
        m170419Z();
        Query i = this.f286985r.f233970e.mo80559a().mo80460i();
        if (!this.f286985r.f233970e.mo80559a().mo80458S() && (!i.mo84403cj() || this.f286985r.f233970e.mo80559a().mo80454C(i))) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f286971b.mo80486y(z)) {
            C92530c A = this.f286971b.mo80488A();
            long j = this.f286963aj;
            this.f286963aj = 1 + j;
            if (!A.mo87301b()) {
                C90875ai.m148465b(new C102851g(this, A, j), this.f286958ae.mo78908a(), this.f286978k, "transcriptionWork#maybeCancelTranscription").mo85223a(new C102852h(this, A, j));
                return;
            }
            mo93429A(A, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final ClientConfig mo93448w() {
        C86775r rVar = this.f286985r.f233977l;
        return rVar != null ? rVar.f234384f : ClientConfig.f236948a;
    }

    /* renamed from: x */
    public final C59687cb mo93449x(HotwordResult hotwordResult) {
        C59582aj ajVar = (C59582aj) m170417X().toBuilder();
        String x = hotwordResult.mo84707x();
        if (x != null && !x.isEmpty()) {
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160115b |= C89885b.S3REQUEST_VALUE;
            cbVar.f160054S = x;
            float c = hotwordResult.mo84683c();
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160115b |= C89885b.HTTP_VALUE;
            cbVar2.f160055T = c;
            float d = hotwordResult.mo84684d();
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            cbVar3.f160115b |= 524288;
            cbVar3.f160056U = d;
        }
        boolean e = this.f286982o.mo83816e();
        boolean z = hotwordResult.mo84706w() != C67229g.UNKNOWN;
        if (e != z) {
            C59104x d2 = f286928a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(21084)).mo56358K("DSP availability and reported DSP detector type are inconsistent! Logs analysis may be skewed; please update checks for AlwaysOnHotwordDetectorType if detector types have been added. SpeechSettings reports DSP availability as %b, while detector type suggests %b", e, z);
        }
        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
        boolean D = hotwordResult.mo84679D();
        ayVar.copyOnWrite();
        C59651be beVar = (C59651be) ayVar.instance;
        beVar.f159935a |= 64;
        beVar.f159942h = D;
        boolean h = this.f286982o.mo83819h();
        ayVar.copyOnWrite();
        C59651be beVar2 = (C59651be) ayVar.instance;
        beVar2.f159935a |= C89885b.NOW_VALUE;
        beVar2.f159954t = h;
        ajVar.mo57010g((C59651be) ayVar.build());
        return (C59687cb) ajVar.build();
    }

    /* renamed from: z */
    public final String mo93450z() {
        String a = this.f286983p.f232820b.mo79804a();
        if (a == null) {
            return null;
        }
        return this.f286983p.f232820b.mo79805b(a);
    }
}
