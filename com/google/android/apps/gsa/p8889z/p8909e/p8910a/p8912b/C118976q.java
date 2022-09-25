package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86195ae;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.audio.C92156ab;
import com.google.android.apps.gsa.speech.p7294j.C92436f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.assistant.p3897e.p3910e.p3911a.C51197l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60420po;
import com.google.common.p4552o.C60421pp;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4017at.p4060h.p4068b.p4069a.C54196m;
import com.google.p4500cm.p4514b.C58170d;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5208h.C66565av;
import com.google.speech.p5208h.C66624cv;
import com.google.speech.p5208h.C66674h;
import com.google.speech.p5230n.p5232b.C67400ap;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.q */
/* compiled from: PG */
public final class C118976q extends C92436f {

    /* renamed from: a */
    public static final C59071e f331762a = C59071e.m91332i("com.google.android.apps.gsa.z.e.a.b.q");

    /* renamed from: A */
    private C60870cx f331763A;

    /* renamed from: B */
    private C60870cx f331764B;

    /* renamed from: C */
    private final C68214a f331765C;

    /* renamed from: D */
    private boolean f331766D;

    /* renamed from: b */
    final C118979t f331767b;

    /* renamed from: c */
    final C86195ae f331768c;

    /* renamed from: d */
    protected final C119067w f331769d;

    /* renamed from: e */
    protected final Query f331770e;

    /* renamed from: f */
    public final int f331771f;

    /* renamed from: g */
    public final C23319a f331772g = new C23319a();

    /* renamed from: h */
    public final long f331773h;

    /* renamed from: i */
    public final C119053i f331774i;

    /* renamed from: j */
    C86227bj f331775j;

    /* renamed from: k */
    boolean f331776k;

    /* renamed from: l */
    public boolean f331777l = false;

    /* renamed from: m */
    public boolean f331778m = false;

    /* renamed from: n */
    long f331779n;

    /* renamed from: o */
    private final C21370a f331780o;

    /* renamed from: p */
    private final C68214a f331781p;

    /* renamed from: q */
    private final C89859i f331782q;

    /* renamed from: r */
    private final C86124t f331783r;

    /* renamed from: s */
    private final C85929cw f331784s;

    /* renamed from: t */
    private final C22871g f331785t;

    /* renamed from: u */
    private final C68214a f331786u;

    /* renamed from: v */
    private final C58833ax f331787v;

    /* renamed from: w */
    private final boolean f331788w;

    /* renamed from: x */
    private final C58833ax f331789x;

    /* renamed from: y */
    private final SettableFuture f331790y;

    /* renamed from: z */
    private boolean f331791z;

    public C118976q(C119067w wVar, C118979t tVar, Query query, C68214a aVar, C89859i iVar, C90931ca caVar, C22871g gVar, C21370a aVar2, C84474e eVar, C86124t tVar2, boolean z, int i, long j, C85929cw cwVar, C89067w wVar2, C86195ae aeVar, C68214a aVar3, C90476a aVar4, C90479a aVar5, C119053i iVar2, C68214a aVar6, C58833ax axVar, C58833ax axVar2) {
        Query query2 = query;
        boolean z2 = z;
        C85929cw cwVar2 = cwVar;
        C60870cx cxVar = C60866ct.f164955a;
        this.f331763A = cxVar;
        this.f331764B = cxVar;
        this.f331766D = false;
        this.f331779n = 0;
        this.f331769d = wVar;
        this.f331767b = tVar;
        this.f331770e = query2;
        this.f331785t = gVar;
        this.f331780o = aVar2;
        C68214a aVar7 = aVar;
        this.f331781p = aVar7;
        C89859i iVar3 = iVar;
        this.f331782q = iVar3;
        this.f331783r = tVar2;
        this.f331788w = z2;
        this.f331771f = i;
        this.f331773h = j;
        this.f331784s = cwVar2;
        this.f331768c = aeVar;
        this.f331786u = aVar3;
        this.f331787v = axVar2;
        this.f331790y = new SettableFuture();
        this.f331774i = iVar2;
        this.f331765C = aVar6;
        this.f331789x = axVar;
        C58881cr A = cwVar2.mo79560A(query2);
        C89956x xVar = new C89956x(query2.f252749G, C90719ac.f253778a.f253779b.nextLong());
        this.f331777l = true;
        C86246cb c = C86245ca.m138883c(query2, aVar2.mo26871c(), aVar7, iVar3, aVar3, tVar2);
        if (!z2) {
            c.mo79921al(ActionData.f235991b);
        }
        this.f331775j = new C86227bj(c, caVar, eVar, tVar2, xVar, A, wVar2, aVar2, aeVar, aVar3, aVar4, aVar5);
    }

    /* renamed from: w */
    private final void m197484w() {
        C86227bj bjVar;
        if (!this.f331774i.f332140a.f332120a.f232931a.isDone() && (bjVar = this.f331775j) != null) {
            this.f331774i.f332140a.f332120a.mo79832b(bjVar.f233010k);
        }
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
        this.f331778m = true;
        if (this.f331770e.mo84370cC()) {
            mo104087v(C89849ae.OPA_SOUND_SEARCH_ERROR);
        }
        if (tVar instanceof C90510b) {
            ((C59052c) ((C59052c) f331762a.mo56224b()).mo56372aa(34227)).mo56386p("No recognizers available.");
        }
        C86227bj bjVar = this.f331775j;
        if (bjVar != null) {
            bjVar.mo79855H(tVar);
        }
        this.f331768c.mo79828a(false);
        String sb = this.f331772g.f63816a.toString();
        if (!TextUtils.isEmpty(sb)) {
            ((C59052c) ((C59052c) f331762a.mo56225c()).mo56372aa(34226)).mo56389s("Got error after recognizing [%s]", sb);
        }
        m197484w();
        mo104086u(false);
        m197485x(this.f331770e, new C118969j(this, tVar));
    }

    /* renamed from: b */
    public final void mo87096b() {
        this.f331778m = true;
        if (!this.f331774i.f332140a.f332126g.f232931a.isDone()) {
            this.f331774i.f332140a.mo104089a();
        }
        C86227bj bjVar = this.f331775j;
        if (bjVar != null) {
            bjVar.mo79842z(new C90457d("Cancelled.", (int) C89885b.S3_CANCELLED_VALUE));
            C86246cb cbVar = this.f331775j.f233010k;
            cbVar.mo79921al(ActionData.f235991b);
            if (!this.f331774i.f332140a.f332120a.f232931a.isDone()) {
                this.f331774i.f332140a.f332120a.mo79832b(cbVar);
            }
        }
        mo104086u(true);
        if (!this.f331774i.f332140a.f332120a.f232931a.isDone()) {
            C86246cb a = C86245ca.m138881a(this.f331770e, this.f331780o.mo26871c(), this.f331781p, this.f331782q, this.f331786u, this.f331783r);
            a.mo79840k(new C90457d("Cancelled.", (int) C89885b.S3_CANCELLED_VALUE));
            a.mo79921al(ActionData.f235991b);
            this.f331774i.f332140a.f332120a.mo79832b(a);
        }
        m197485x(this.f331770e, new C118966g(this));
    }

    /* renamed from: c */
    public final void mo87097c(C66674h hVar) {
        C86227bj bjVar = this.f331775j;
        if (bjVar != null) {
            bjVar.mo79849B(hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (com.google.android.apps.gsa.search.core.p6816p.C86217b.m138692b(r6) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cb, code lost:
        if (((com.google.assistant.p3897e.p3917i.p3918a.C51544lq) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.assistant.p3897e.p3917i.p3918a.C51544lq.f134342j, r1.f137061c, com.google.protobuf.C62921ba.f169869a)).f134352i != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (com.google.android.apps.gsa.search.core.p6816p.C86217b.m138692b(r6) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        mo104087v(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_FAILURE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        mo104087v(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_SUCCESS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ef, code lost:
        r0 = r5.f331775j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f1, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        r0.f233010k.mo79923an(r5.f331770e);
        r0.f233020b = r5.f331784s.mo79560A(r5.f331770e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        r0 = r5.f331775j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0106, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0108, code lost:
        r0.mo79850C(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010d, code lost:
        if (r6.f133276k != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010f, code lost:
        r5.f331790y.mo57356n(com.google.android.apps.gsa.p8883x.C118826c.f331422a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0116, code lost:
        r6 = r5.f331775j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0118, code lost:
        if (r6 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011a, code lost:
        r6 = r6.f233010k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011d, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011e, code lost:
        r5.f331790y.mo4106b(new com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118975p(r5, r6), com.google.common.util.concurrent.C60826bg.f164896a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87098d(com.google.assistant.p3897e.p3910e.p3911a.C51195j r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_RESULT_DOWNLOADED
            r5.mo104087v(r0)
            com.google.android.apps.gsa.z.e.a.b.t r0 = r5.f331767b
            int r1 = r5.f331771f
            boolean r0 = r0.mo91314k(r1)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            boolean r0 = com.google.android.apps.gsa.assistant.shared.k.c(r6)
            if (r0 == 0) goto L_0x0020
            com.google.android.apps.gsa.z.e.a.w r0 = r5.f331769d
            com.google.protobuf.z r6 = r6.toByteString()
            r0.mo91377b(r6)
            return
        L_0x0020:
            com.google.android.apps.gsa.shared.search.Query r0 = r5.f331770e
            boolean r0 = r0.mo84370cC()
            if (r0 == 0) goto L_0x012b
            int r0 = r6.f133266a
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002f
            goto L_0x0070
        L_0x002f:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0068
            com.google.assistant.e.j.en r0 = r6.f133275j
            if (r0 != 0) goto L_0x0039
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x0039:
            com.google.protobuf.cq r0 = r0.f136684d
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.google.assistant.e.j.ep r1 = (com.google.assistant.p3897e.p3921j.C52083ep) r1
            int r2 = r1.f136692b
            r3 = 4
            if (r2 != r3) goto L_0x0055
            java.lang.Object r1 = r1.f136693c
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            goto L_0x0057
        L_0x0055:
            com.google.assistant.e.j.ei r1 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0057:
            com.google.assistant.e.j.dy r1 = r1.f136668c
            if (r1 != 0) goto L_0x005d
            com.google.assistant.e.j.dy r1 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x005d:
            java.lang.String r2 = "ui.SHOW_TEXT"
            java.lang.String r1 = r1.f135936b
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003f
            goto L_0x0070
        L_0x0068:
            boolean r0 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138692b(r6)
            if (r0 != 0) goto L_0x0070
            goto L_0x012b
        L_0x0070:
            int r0 = r6.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0085
            com.google.assistant.e.j.en r0 = r6.f133275j
            if (r0 != 0) goto L_0x007c
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x007c:
            com.google.assistant.e.j.ex r0 = r0.f136685e
            if (r0 != 0) goto L_0x0082
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0082:
            com.google.protobuf.cq r0 = r0.f136712a
            goto L_0x008d
        L_0x0085:
            com.google.assistant.e.j.ex r0 = r6.f133273h
            if (r0 != 0) goto L_0x008b
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x008b:
            com.google.protobuf.cq r0 = r0.f136712a
        L_0x008d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0091:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r0.next()
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            java.lang.String r2 = "asst.response.logging.params"
            java.lang.String r3 = r1.f137065b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0091
            com.google.assistant.e.j.ka r2 = r1.f137066c
            if (r2 != 0) goto L_0x00ad
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x00ad:
            java.lang.String r3 = "assistant.api.params.ResponseLoggingParams"
            java.lang.String r2 = r2.f137060b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0091
            com.google.assistant.e.j.ka r1 = r1.f137066c     // Catch:{ ct -> 0x00ce }
            if (r1 != 0) goto L_0x00bd
            com.google.assistant.e.j.ka r1 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00ce }
        L_0x00bd:
            com.google.protobuf.z r1 = r1.f137061c     // Catch:{ ct -> 0x00ce }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x00ce }
            com.google.assistant.e.i.a.lq r3 = com.google.assistant.p3897e.p3917i.p3918a.C51544lq.f134342j     // Catch:{ ct -> 0x00ce }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x00ce }
            com.google.assistant.e.i.a.lq r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51544lq) r1     // Catch:{ ct -> 0x00ce }
            boolean r0 = r1.f134352i     // Catch:{ ct -> 0x00ce }
            if (r0 == 0) goto L_0x00ea
            goto L_0x00e4
        L_0x00ce:
            r1 = move-exception
            com.google.common.f.e r2 = f331762a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "ResponseLoggingParams could not be parsed"
            r4 = 34244(0x85c4, float:4.7986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0091
        L_0x00de:
            boolean r0 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138692b(r6)
            if (r0 != 0) goto L_0x00ea
        L_0x00e4:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_FAILURE
            r5.mo104087v(r0)
            goto L_0x00ef
        L_0x00ea:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_SUCCESS
            r5.mo104087v(r0)
        L_0x00ef:
            com.google.android.apps.gsa.search.core.p.bj r0 = r5.f331775j
            if (r0 == 0) goto L_0x0104
            com.google.android.apps.gsa.search.core.p.cb r1 = r0.f233010k
            com.google.android.apps.gsa.shared.search.Query r2 = r5.f331770e
            r1.mo79923an(r2)
            com.google.android.apps.gsa.search.core.google.cw r1 = r5.f331784s
            com.google.android.apps.gsa.shared.search.Query r2 = r5.f331770e
            com.google.common.base.cr r1 = r1.mo79560A(r2)
            r0.f233020b = r1
        L_0x0104:
            com.google.android.apps.gsa.search.core.p.bj r0 = r5.f331775j
            if (r0 == 0) goto L_0x010b
            r0.mo79850C(r6)
        L_0x010b:
            boolean r6 = r6.f133276k
            if (r6 != 0) goto L_0x0116
            com.google.common.util.concurrent.SettableFuture r6 = r5.f331790y
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r6.mo57356n(r0)
        L_0x0116:
            com.google.android.apps.gsa.search.core.p.bj r6 = r5.f331775j
            if (r6 == 0) goto L_0x011d
            com.google.android.apps.gsa.search.core.p.cb r6 = r6.f233010k
            goto L_0x011e
        L_0x011d:
            r6 = 0
        L_0x011e:
            com.google.common.util.concurrent.SettableFuture r0 = r5.f331790y
            com.google.android.apps.gsa.z.e.a.b.p r1 = new com.google.android.apps.gsa.z.e.a.b.p
            r1.<init>(r5, r6)
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a
            r0.mo4106b(r1, r6)
            return
        L_0x012b:
            com.google.android.apps.gsa.search.core.p.bj r0 = r5.f331775j
            if (r0 == 0) goto L_0x0132
            r0.mo79850C(r6)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118976q.mo87098d(com.google.assistant.e.e.a.j):void");
    }

    /* renamed from: e */
    public final void mo87099e(C51197l lVar) {
        if (!this.f331791z) {
            mo104087v(C89849ae.OPA_WEBVIEW_FIRST_BYTE_RECEIVED);
        }
        this.f331791z = true;
        if ((lVar.f133285a & 8) != 0 && lVar.f133288d) {
            mo104087v(C89849ae.OPA_WEBVIEW_LAST_BYTE_RECEIVED);
        }
        C86227bj bjVar = this.f331775j;
        if (bjVar != null) {
            bjVar.mo79851D(lVar);
        }
    }

    /* renamed from: f */
    public final void mo87100f() {
        mo104087v(C89849ae.TTS_RESPONSE_FIRST_BYTE);
    }

    /* renamed from: g */
    public final void mo87101g(C90607o oVar) {
        mo104087v(C89849ae.SPEECH_START_RECEIVED);
        this.f331767b.mo91304a(oVar);
    }

    /* renamed from: h */
    public final void mo87102h(C58170d dVar) {
        C86227bj bjVar = this.f331775j;
        if (bjVar != null) {
            bjVar.mo79852E(dVar);
        }
    }

    /* renamed from: i */
    public final void mo87103i(C66624cv cvVar) {
        if (!cvVar.f181252c) {
            this.f331768c.f232926b = cvVar;
        } else {
            this.f331768c.mo79829b(cvVar);
        }
    }

    /* renamed from: j */
    public final void mo87104j() {
        this.f331778m = true;
        this.f331763A.cancel(true);
        this.f331764B.cancel(true);
        if (!this.f331766D) {
            C23319a aVar = this.f331772g;
            if (!aVar.f63817b || aVar.mo28814c()) {
                m197484w();
                C86227bj bjVar = this.f331775j;
                if (bjVar != null) {
                    bjVar.mo79842z(new C90457d(524292));
                }
                this.f331775j = null;
                m197485x(this.f331770e, new C118963d(this));
            }
        }
        if (!this.f331788w) {
            C86227bj bjVar2 = this.f331775j;
            if (bjVar2 != null && !bjVar2.mo79857J()) {
                this.f331775j.mo79848A();
                ((C59052c) ((C59052c) f331762a.mo56226d()).mo56372aa(34223)).mo56389s("Incomplete proxy task: %s", this.f331775j);
            }
            mo104086u(false);
            m197485x(this.f331770e, new C118967h(this));
            return;
        }
        C86227bj bjVar3 = this.f331775j;
        if (bjVar3 != null) {
            bjVar3.mo79842z(C118962c.m197481a(this.f331789x));
        }
        mo104086u(false);
    }

    /* renamed from: k */
    public final void mo87105k(C90607o oVar) {
        mo104087v(C89849ae.SPEECH_END_RECEIVED);
        this.f331767b.mo91306c(oVar);
        long a = this.f331783r.mo79743a(C90086ek.f250481du);
        if (a >= 0 && this.f331770e.mo84412cs()) {
            this.f331764B = this.f331785t.mo28208h("limited connectivity detected", a, new C118973n(this));
        }
        long a2 = this.f331783r.mo79743a(C90082eg.f249942bE);
        if (a2 >= 0 && this.f331770e.mo84412cs()) {
            this.f331763A = this.f331785t.mo28208h("General network query timeout", a2, new C118974o(this));
        }
    }

    /* renamed from: m */
    public final void mo87107m(C90606n nVar) {
        this.f331778m = true;
        mo104087v(C89849ae.TTS_RESPONSE_LAST_BYTE);
        m197485x(this.f331770e, new C118968i(this, nVar));
        if (this.f331770e.mo84370cC()) {
            this.f331790y.mo57356n(C118826c.f331422a);
        }
    }

    /* renamed from: n */
    public final void mo87108n(C54196m mVar) {
        C86227bj bjVar;
        if (this.f331767b.mo91314k(this.f331771f) && (bjVar = this.f331775j) != null) {
            bjVar.mo79853F(mVar);
        }
    }

    /* renamed from: o */
    public final void mo87109o() {
        this.f331774i.f332140a.mo104097i();
        m197484w();
        m197485x(this.f331770e, new C118972m(this));
    }

    /* renamed from: p */
    public final void mo87110p(C66565av avVar) {
        C86227bj bjVar;
        if (!this.f331776k) {
            mo104087v(C89849ae.FIRST_BYTE_RECEIVED);
        }
        this.f331776k = true;
        if (this.f331767b.mo91314k(this.f331771f) && (bjVar = this.f331775j) != null) {
            bjVar.mo79854G(avVar);
        }
    }

    /* renamed from: q */
    public final void mo87111q(long j, long j2) {
        this.f331767b.mo91310g(j, j2);
    }

    /* renamed from: r */
    public final void mo87112r(C63088z zVar, C67400ap apVar) {
        this.f331769d.mo91382g(apVar);
        this.f331766D = true;
        this.f331772g.mo28813b(C67442ak.f183276i);
    }

    /* renamed from: s */
    public final void mo87113s() {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 5;
        String b = C39191a.m68623b(this.f331773h);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f331774i.f332140a.mo104090b();
    }

    /* renamed from: u */
    public final void mo104086u(boolean z) {
        C86227bj bjVar;
        if (z && (bjVar = this.f331775j) != null) {
            bjVar.mo79848A();
        }
        this.f331775j = null;
    }

    /* renamed from: v */
    public final void mo104087v(C89849ae aeVar) {
        C89859i iVar = this.f331782q;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f331770e.f252749G));
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: x */
    private final void m197485x(Query query, Runnable runnable) {
        if (!this.f331788w && ((!this.f331783r.mo79746e(C90086ek.f250496ei) || !this.f331774i.f332140a.f332130k.f232931a.isDone()) && query.mo84368cA())) {
            ((C59052c) ((C59052c) f331762a.mo56225c()).mo56372aa(34203)).mo56386p("should wait for decision");
            new C90873ag(this.f331768c.f232925a, this.f331785t, "Multi-device decision", new C118964e(this, runnable, query)).mo85223a(new C118965f(runnable));
            return;
        }
        runnable.run();
    }

    /* renamed from: t */
    public final void mo87114t(C67438ag agVar, String str) {
        long j;
        C67438ag agVar2 = agVar;
        String str2 = str;
        if (!this.f331772g.f63817b) {
            int a = C67437af.m97466a(agVar2.f183259b);
            if (a == 0 || a == 1) {
                int i = agVar2.f183258a;
                if (!((i & 8) == 0 && (i & 4) == 0)) {
                    Pair a2 = this.f331772g.mo28812a(agVar2);
                    String str3 = (String) a2.first;
                    String str4 = (String) a2.second;
                    if ((agVar2.f183258a & 512) != 0) {
                        this.f331779n = agVar2.f183265h;
                    }
                    ((C92156ab) this.f331765C.mo27525b()).mo86829b(str3, str4);
                    this.f331767b.mo91312i(this.f331771f, this.f331770e, new C118895a(str3, str4, false, str2));
                    return;
                }
            }
            int a3 = C67437af.m97466a(agVar2.f183259b);
            if (a3 != 0 && a3 == 2) {
                C86246cb cbVar = null;
                if (this.f331776k) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 466;
                    String b = C39191a.m68623b(this.f331773h);
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    b.getClass();
                    ufVar2.f164093a |= 4;
                    ufVar2.f164259n = b;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                long j2 = this.f331779n;
                C67442ak akVar = agVar2.f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
                Pair a4 = C118978s.m197518a(this.f331772g.mo28813b(akVar), str2);
                if (a4.first == null || TextUtils.isEmpty((CharSequence) a4.first)) {
                    ((C59052c) ((C59052c) f331762a.mo56224b()).mo56372aa(34229)).mo56386p("Empty combined result");
                    m197484w();
                    m197485x(this.f331770e, new C118970k(this));
                } else {
                    this.f331767b.mo91312i(this.f331771f, this.f331770e, new C118895a(((SpannedString) a4.first).toString(), BuildConfig.FLAVOR, true, str2));
                    C60421pp b2 = C118978s.m197519b(agVar2, j2, this.f331783r.mo79746e(C90126fx.f251775pf));
                    Query aG = this.f331770e.mo84270aG((CharSequence) a4.first, (C58485gu) a4.second, b2.f163513b, this.f331788w);
                    if (this.f331783r.mo79746e(C89996bb.f246777g) && this.f331787v.mo56113h()) {
                        C60870cx d = ((C74458k) this.f331787v.mo56107c()).mo70777d();
                        if (d.isDone()) {
                            C58833ax axVar = (C58833ax) C90877ak.m148475i(d, C58836b.f156633a);
                            if (axVar.mo56113h()) {
                                aG = aG.mo84279aP(((C37397bb) axVar.mo56107c()).f99323b);
                            }
                        }
                    }
                    C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar2.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar2.instance;
                    ufVar3.f164093a |= 2;
                    ufVar3.f164258m = 555;
                    String b3 = C39191a.m68623b(this.f331773h);
                    tzVar2.copyOnWrite();
                    C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                    b3.getClass();
                    ufVar4.f164093a |= 4;
                    ufVar4.f164259n = b3;
                    long j3 = b2.f163513b;
                    tzVar2.copyOnWrite();
                    C60555uf ufVar5 = (C60555uf) tzVar2.instance;
                    ufVar5.f164250e = 2 | ufVar5.f164250e;
                    ufVar5.f164144ay = j3;
                    if (this.f331788w) {
                        tzVar2.copyOnWrite();
                        C60555uf ufVar6 = (C60555uf) tzVar2.instance;
                        ufVar6.f164251f |= 1024;
                        ufVar6.f164112aS = true;
                    }
                    C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                    HotwordResultMetadata hotwordResultMetadata = this.f331770e.f252756N;
                    if (!this.f331783r.mo79746e(C90014bt.f247754nC) || hotwordResultMetadata == null || hotwordResultMetadata.mo84604g() <= 0) {
                        j = this.f331770e.f252747E;
                    } else {
                        j = hotwordResultMetadata.mo84604g();
                    }
                    long j4 = b2.f163513b;
                    C89859i iVar = this.f331782q;
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.ESTIMATED_END_OF_SPEECH;
                    fVar.mo83701c("rId", Long.toString(this.f331770e.f252749G));
                    fVar.f246204d = (j + j4) * 1000000;
                    C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                    C60420po a5 = C60420po.m92578a(b2.f163514c);
                    if (a5 == null) {
                        a5 = C60420po.UNKNOWN;
                    }
                    ajVar.copyOnWrite();
                    C59687cb cbVar2 = (C59687cb) ajVar.instance;
                    cbVar2.f160104ap = a5.f163509l;
                    cbVar2.f160122c |= 128;
                    fVar.f246203c = (C59687cb) ajVar.build();
                    iVar.mo74236a(fVar.mo83699a());
                    if (TextUtils.isEmpty(aG.f252768g)) {
                        ((C59052c) ((C59052c) f331762a.mo56226d()).mo56372aa(34231)).mo56386p("empty recognized text");
                        int i2 = C90755l.f253831a;
                    }
                    C86227bj bjVar = this.f331775j;
                    if (bjVar != null) {
                        bjVar.f233010k.mo79923an(aG);
                        bjVar.f233020b = this.f331784s.mo79560A(aG);
                    }
                    C86227bj bjVar2 = this.f331775j;
                    if (bjVar2 != null) {
                        cbVar = bjVar2.f233010k;
                    }
                    m197485x(aG, new C118971l(this, aG, cbVar));
                }
                this.f331779n = 0;
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f331762a.mo56225c()).mo56372aa(34241)).mo56386p("Result after completed recognition.");
    }
}
