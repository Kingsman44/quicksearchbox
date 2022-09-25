package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.assistant.shared.i.a;
import com.google.android.apps.gsa.assistant.shared.i.c;
import com.google.android.apps.gsa.assistant.shared.i.h;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6491a.C84371q;
import com.google.android.apps.gsa.search.core.p6491a.C84376v;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85001d;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87865gl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87866gm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87867gn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88117pu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88120px;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90118fp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c.C108596a;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c.C108598c;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c.C108599d;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c.C108600e;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106384i;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106386k;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107549a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107551c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107552d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107553e;
import com.google.android.apps.gsa.staticplugins.opa.p8312ax.C107631g;
import com.google.android.apps.gsa.staticplugins.opa.p8312ax.C107632h;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109030b;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.OpaHqActivity;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109455a;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109456b;
import com.google.android.apps.gsa.staticplugins.opa.p8408q.C109951a;
import com.google.android.apps.gsa.staticplugins.opa.promo.p8407a.C109886h;
import com.google.android.apps.gsa.staticplugins.opa.promo.p8407a.C109887i;
import com.google.android.apps.gsa.staticplugins.opa.promo.p8407a.C109888j;
import com.google.android.apps.gsa.staticplugins.opa.promo.p8407a.C109889k;
import com.google.android.apps.gsa.staticplugins.opa.util.C113761ad;
import com.google.android.apps.gsa.staticplugins.opa.util.C113775ar;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.apps.gsa.staticplugins.opa.util.C113882m;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114391am;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114393ao;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114394ap;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114396ar;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114452cq;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114453cr;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114454cs;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114457cv;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114471j;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114476o;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114480s;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114496u;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114500y;
import com.google.android.apps.p8928i.p8932c.p8934b.C119162c;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2770b.C36232a;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.p2998g.p2999a.C38342ab;
import com.google.android.libraries.search.p2998g.p2999a.C38343ac;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38351b;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38353d;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38354e;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38357h;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C48926a;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52341od;
import com.google.assistant.p3897e.p3921j.C52343of;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.apb;
import com.google.assistant.p3897e.p3921j.apc;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5036r.C65316b;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.v */
/* compiled from: PG */
public final class C114507v extends C86734a implements C85005h {

    /* renamed from: a */
    public static final C59071e f317489a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.v");

    /* renamed from: A */
    private final C68214a f317490A;

    /* renamed from: B */
    private final C68214a f317491B;

    /* renamed from: C */
    private final C113882m f317492C;

    /* renamed from: D */
    private final C68214a f317493D;

    /* renamed from: E */
    private final C68214a f317494E;

    /* renamed from: F */
    private final C22871g f317495F;

    /* renamed from: G */
    private final C22871g f317496G;

    /* renamed from: H */
    private final C22871g f317497H;

    /* renamed from: I */
    private final C22871g f317498I;

    /* renamed from: J */
    private final C58833ax f317499J;

    /* renamed from: K */
    private final C113869cx f317500K;

    /* renamed from: L */
    private final C68214a f317501L;

    /* renamed from: M */
    private final C86695q f317502M;

    /* renamed from: N */
    private final C68214a f317503N;

    /* renamed from: O */
    private final C68214a f317504O;

    /* renamed from: P */
    private final C85001d f317505P;

    /* renamed from: Q */
    private final C68214a f317506Q;

    /* renamed from: R */
    private final C68214a f317507R;

    /* renamed from: S */
    private final C58833ax f317508S;

    /* renamed from: T */
    private final C58833ax f317509T;

    /* renamed from: U */
    private final C68214a f317510U;

    /* renamed from: V */
    private final C68214a f317511V;

    /* renamed from: W */
    private int f317512W = 0;

    /* renamed from: X */
    private boolean f317513X = false;

    /* renamed from: Y */
    private boolean f317514Y = false;

    /* renamed from: Z */
    private C63088z f317515Z = null;

    /* renamed from: aa */
    private final C109951a f317516aa;

    /* renamed from: ab */
    private final C108100a f317517ab;

    /* renamed from: b */
    public final C86610af f317518b;

    /* renamed from: c */
    public final C58833ax f317519c;

    /* renamed from: f */
    public final Context f317520f;

    /* renamed from: g */
    public final C68214a f317521g;

    /* renamed from: h */
    public final C21370a f317522h;

    /* renamed from: i */
    public final C84605a f317523i;

    /* renamed from: j */
    public final C58833ax f317524j;

    /* renamed from: k */
    public final C86124t f317525k;

    /* renamed from: l */
    public final C68214a f317526l;

    /* renamed from: m */
    public final C113775ar f317527m;

    /* renamed from: n */
    public final C68214a f317528n;

    /* renamed from: o */
    public final C58833ax f317529o;

    /* renamed from: p */
    public final C58881cr f317530p;

    /* renamed from: q */
    public final C114252a f317531q;

    /* renamed from: r */
    private final C58833ax f317532r;

    /* renamed from: s */
    private final bo f317533s;

    /* renamed from: t */
    private final C68214a f317534t;

    /* renamed from: u */
    private final C68214a f317535u;

    /* renamed from: v */
    private final C68214a f317536v;

    /* renamed from: w */
    private final C91097g f317537w;

    /* renamed from: x */
    private final C68214a f317538x;

    /* renamed from: y */
    private final C68214a f317539y;

    /* renamed from: z */
    private final C83580ak f317540z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114507v(C86610af afVar, C58833ax axVar, bo boVar, C68214a aVar, C68214a aVar2, C68214a aVar3, Context context, C91097g gVar, C68214a aVar4, C21370a aVar5, C109951a aVar6, C58833ax axVar2, C58833ax axVar3, C68214a aVar7, C86124t tVar, C83580ak akVar, C68214a aVar8, C68214a aVar9, C113882m mVar, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C22871g gVar2, C22871g gVar3, C22871g gVar4, C22871g gVar5, C58833ax axVar4, C113869cx cxVar, C113775ar arVar, C84605a aVar14, C68214a aVar15, C86695q qVar, C68214a aVar16, C68214a aVar17, C85001d dVar, C68214a aVar18, C68214a aVar19, C68214a aVar20, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C68214a aVar21, C58833ax axVar8, C58881cr crVar, C68214a aVar22, C114252a aVar23) {
        super(C118575h.WORKER_OPA, "opa");
        this.f317518b = afVar;
        this.f317532r = axVar;
        this.f317533s = boVar;
        this.f317534t = aVar;
        this.f317535u = aVar2;
        this.f317536v = aVar3;
        this.f317520f = context;
        this.f317537w = gVar;
        this.f317521g = aVar4;
        this.f317522h = aVar5;
        this.f317525k = tVar;
        this.f317539y = aVar13;
        this.f317500K = cxVar;
        this.f317527m = arVar;
        this.f317516aa = aVar6;
        this.f317523i = aVar14;
        C58838bb.m90869d(axVar2.mo56113h(), "OpaUiStatusOptional must be present. It is an Optional to allow use of opa specific code in search process component.");
        this.f317517ab = (C108100a) axVar2.mo56107c();
        this.f317524j = axVar3;
        C58838bb.m90869d(axVar3.mo56113h(), "PpaStarterOptional must be present. It is an Optional for historic reason when it was introduced in an LE.");
        this.f317538x = aVar7;
        this.f317540z = akVar;
        this.f317490A = aVar8;
        this.f317491B = aVar9;
        this.f317492C = mVar;
        this.f317493D = aVar10;
        this.f317526l = aVar11;
        this.f317494E = aVar12;
        this.f317495F = gVar2;
        this.f317496G = gVar3;
        this.f317497H = gVar4;
        this.f317498I = gVar5;
        this.f317499J = axVar4;
        this.f317501L = aVar15;
        this.f317502M = qVar;
        this.f317503N = aVar16;
        this.f317504O = aVar17;
        this.f317505P = dVar;
        this.f317506Q = aVar18;
        this.f317507R = aVar19;
        this.f317528n = aVar20;
        this.f317508S = axVar5;
        this.f317509T = axVar6;
        this.f317519c = axVar7;
        this.f317510U = aVar21;
        this.f317529o = axVar8;
        this.f317530p = crVar;
        this.f317511V = aVar22;
        this.f317531q = aVar23;
    }

    /* renamed from: N */
    private static C88431bb m189804N(C107551c cVar, byte[] bArr) {
        C107549a aVar = (C107549a) C107552d.f299204d.createBuilder();
        aVar.copyOnWrite();
        C107552d dVar = (C107552d) aVar.instance;
        dVar.f299207b = cVar.f299203d;
        dVar.f299206a |= 1;
        C63088z A = C63088z.m96139A(bArr);
        aVar.copyOnWrite();
        C107552d dVar2 = (C107552d) aVar.instance;
        dVar2.f299206a |= 2;
        dVar2.f299208c = A;
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C107553e.f299209a, (C107552d) aVar.build());
        return (C88431bb) baVar.build();
    }

    /* renamed from: O */
    private static String m189805O(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38342ab abVar = (C38342ab) it.next();
            if (str.equals(abVar.f101526b)) {
                return abVar.f101527c;
            }
        }
        return null;
    }

    /* renamed from: P */
    private final void m189806P(C38355f fVar, boolean z, C87565h hVar) {
        int i = fVar.f101545a;
        if ((i & 2) != 0) {
            hVar.f236568n = fVar.f101547c;
            hVar.f236560f = 1;
        }
        if ((i & 256) != 0) {
            hVar.f236514R = fVar.f101554j;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo78612H(hVar.mo81685a(), z);
    }

    /* renamed from: Q */
    private final void m189807Q(C51536li liVar, C51406gn gnVar, C51936ep epVar) {
        new C90873ag(this.f317505P.mo78597a(liVar.f134320c, gnVar, epVar), this.f317496G, "logActionCompletion", C114503r.f317481a).mo85223a(C114504s.f317482a);
    }

    /* renamed from: R */
    private final void m189808R(int i) {
        e eVar = e.bG;
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.opa.upgrade.notification";
        hVar.f236514R = i;
        hVar.f236556b = eVar;
        ((C87568k) this.f317524j.mo56107c()).mo81688b(this.f317520f, hVar.mo81685a());
    }

    /* renamed from: S */
    private final void m189809S(C87565h hVar, String str, int i, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
        hwVar.copyOnWrite();
        C53287ih ihVar = (C53287ih) hwVar.instance;
        ihVar.f139698d = 1;
        ihVar.f139695a |= 1;
        hwVar.copyOnWrite();
        C53287ih ihVar2 = (C53287ih) hwVar.instance;
        ihVar2.f139702h = 10;
        ihVar2.f139695a |= 64;
        hwVar.copyOnWrite();
        C53287ih ihVar3 = (C53287ih) hwVar.instance;
        ihVar3.f139703i = i - 1;
        ihVar3.f139695a |= 128;
        String g = C58837ba.m90858g(str2);
        hwVar.copyOnWrite();
        C53287ih ihVar4 = (C53287ih) hwVar.instance;
        ihVar4.f139695a |= 8;
        ihVar4.f139701g = g;
        hVar.f236499C = true;
        hVar.f236556b = e.aw;
        hVar.f236523a = str;
        hVar.f236560f = 6;
        ((C87571n) this.f317538x.mo27525b()).mo81699k(this.f317520f, (C53287ih) hwVar.build(), hVar.mo81685a());
    }

    /* renamed from: A */
    public final void mo78605A(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 0);
        C58976aa aaVar = C58975e.f156826a;
        if (intExtra == 1) {
            this.f317533s.o(1, 3);
            if (this.f317533s.r()) {
                this.f317533s.m();
            }
        } else if (intExtra == 8) {
            this.f317533s.o(8, 3);
        } else if (intExtra == 16) {
            String stringExtra = intent.getStringExtra("ved");
            C109889k kVar = (C109889k) this.f317503N.mo27525b();
            C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
            long longExtra = intent.getLongExtra("notification_content_id", 0);
            gVar.copyOnWrite();
            C53658j jVar = (C53658j) gVar.instance;
            jVar.f140831b = 1;
            jVar.f140832c = Long.valueOf(longExtra);
            gVar.copyOnWrite();
            C53658j jVar2 = (C53658j) gVar.instance;
            jVar2.f140835f = 3;
            jVar2.f140830a |= 2;
            C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
            C48980c a = C48980c.m85331a(intent.getIntExtra("notification_channel", 0));
            aVar.copyOnWrite();
            ((C49007d) aVar.instance).f126768a = a.getNumber();
            gVar.copyOnWrite();
            C53658j jVar3 = (C53658j) gVar.instance;
            C49007d dVar = (C49007d) aVar.build();
            dVar.getClass();
            jVar3.f140837h = dVar;
            jVar3.f140830a |= 8;
            C53658j jVar4 = (C53658j) gVar.build();
            kVar.mo98223c(jVar4);
            kVar.mo98222b(jVar4, stringExtra);
        } else if (intExtra == 32) {
            this.f317533s.o(32, 3);
        } else if (intExtra == 64) {
            long longExtra2 = intent.getLongExtra("notification_content_id", -1);
            String stringExtra2 = intent.getStringExtra("ved");
            bo boVar = this.f317533s;
            C53655g gVar2 = (C53655g) C53658j.f140828i.createBuilder();
            gVar2.copyOnWrite();
            C53658j jVar5 = (C53658j) gVar2.instance;
            jVar5.f140831b = 1;
            jVar5.f140832c = Long.valueOf(longExtra2);
            gVar2.copyOnWrite();
            C53658j jVar6 = (C53658j) gVar2.instance;
            jVar6.f140835f = 3;
            jVar6.f140830a |= 2;
            boVar.i((C53658j) gVar2.build(), stringExtra2);
        } else if (intExtra == 128) {
            String stringExtra3 = intent.getStringExtra("ved");
            if (stringExtra3 != null && (!intent.hasExtra("opa-nga-auto-dismiss-timestamp") || intent.getLongExtra("opa-nga-auto-dismiss-timestamp", -1) < this.f317522h.mo26869a())) {
                this.f317533s.w(stringExtra3, 22);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("opa-nga-target-intent");
            if (intent2 != null) {
                this.f317537w.mo65089a(intent2);
            }
        } else if (intExtra != 512) {
            C59104x d = f317489a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) d).mo56372aa(28853)).mo56387q("Worker received dismissal about unknown notification type: %d", intExtra);
            int i = C90755l.f253831a;
        } else {
            ((C89859i) this.f317490A.mo27525b()).mo83702b(C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISS_REQUESTED);
            new C1800aq(this.f317520f).f5622a.cancel((String) null, C89094c.OPA_LOCK_SCREEN_ENTRY_POINT.f241522aD);
            if (this.f317525k.mo79746e(C90037cp.f248607dy)) {
                C118826c.m197213c(((h) this.f317511V.mo27525b()).a.mo46039a(c.a, C60826bg.f164896a));
            } else {
                C118826c.m197213c(((C42876ab) ((C106391p) this.f317510U.mo27525b()).f296744b.mo27525b()).mo46039a(C106386k.f296738a, C60826bg.f164896a));
            }
            ((C89859i) this.f317490A.mo27525b()).mo83702b(C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISSED);
        }
    }

    /* renamed from: C */
    public final void mo78607C(Intent intent) {
        ((C114500y) this.f317535u.mo27525b()).mo101304a(intent, ((C84371q) this.f317532r.mo56107c()).mo77930b(0));
    }

    /* renamed from: D */
    public final void mo78608D(Intent intent) {
        C114500y yVar = (C114500y) this.f317535u.mo27525b();
        C84370p b = ((C84371q) this.f317532r.mo56107c()).mo77930b(2);
        C108100a aVar = this.f317517ab;
        boolean z = false;
        if ((aVar instanceof C108100a) && aVar.mo96449n()) {
            z = true;
        }
        yVar.mo101305b(intent, b, z);
    }

    /* renamed from: E */
    public final void mo78609E(ServiceEventData serviceEventData) {
        C86775r rVar = this.f317518b.f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(serviceEventData);
        }
    }

    /* renamed from: F */
    public final void mo78610F(byte[] bArr, Query query) {
        C51805du a = C109455a.m182150a(bArr);
        int a2 = C84376v.m134657a(query, this.f317501L);
        if (a2 == 0) {
            C59104x d = f317489a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) d).mo56372aa(28860)).mo56386p("Should handle ConversationClientType.OPA_AGSA in OPA session.");
            int i = C90755l.f253831a;
            return;
        }
        ((C84371q) this.f317532r.mo56107c()).mo77930b(a2).mo77919a(a);
    }

    /* renamed from: H */
    public final void mo78612H(Bundle bundle, boolean z) {
        int i = true != z ? 268468224 : 268435456;
        C58976aa aaVar = C58975e.f156826a;
        ((C87568k) this.f317524j.mo56107c()).mo81689c(this.f317520f, bundle, i);
    }

    /* renamed from: I */
    public final void mo78613I(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        this.f317502M.mo80275j("opa", m189804N(C107551c.NOTIFICATION, bArr));
    }

    /* renamed from: J */
    public final void mo78614J(C63088z zVar) {
        C86337q b = ((C86338r) this.f317521g.mo27525b()).mo80076b();
        b.mo80068c("opa_last_assistant_dialog_token", zVar.mo59174N());
        b.apply();
        ((C87541c) this.f317536v.mo27525b()).mo81655q(zVar);
    }

    /* renamed from: K */
    public final void mo78615K(int i) {
        if (((C90743b) this.f317491B.mo27525b()).mo85090c()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (i != 0) {
            this.f317517ab.mo96443h(1);
            return;
        }
        this.f317517ab.mo96443h(0);
    }

    /* renamed from: L */
    public final void mo78616L(C51195j jVar) {
        if ((jVar.f133266a & 32) != 0) {
            C52091ex exVar = jVar.f133273h;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            for (C52232kc kcVar : exVar.f136712a) {
                if (kcVar.f137065b.equals("asst.startup.display.params")) {
                    C83580ak akVar = this.f317540z;
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    akVar.mo76922c(kaVar.f137061c.mo59174N());
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo78617M(int i, int i2, aas aas, ajy ajy) {
        C58976aa aaVar = C58975e.f156826a;
        C114464db dbVar = (C114464db) this.f317534t.mo27525b();
        if ((aas.f134663a & 2048) == 0) {
            String g = dbVar.f317389j.mo79673g();
            if (!C58837ba.m90859h(g)) {
                aaj aaj = (aaj) aas.f134661u.createBuilder(aas);
                aaj.copyOnWrite();
                aas aas2 = (aas) aaj.instance;
                g.getClass();
                aas2.f134663a |= 2048;
                aas2.f134674l = g;
                aas = (aas) aaj.build();
            }
        }
        C114476o oVar = (C114476o) dbVar.f317400u.mo27525b();
        aaj aaj2 = (aaj) aas.toBuilder();
        aap aap = ((aas) aaj2.instance).f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        aam aam = (aam) aap.toBuilder();
        aam.copyOnWrite();
        aap aap2 = (aap) aam.instance;
        aap2.f134652a |= 1;
        aap2.f134653b = i - 1;
        int b = C65316b.m96665b(i2);
        aam.copyOnWrite();
        aap aap3 = (aap) aam.instance;
        aap3.f134652a |= 4;
        aap3.f134655d = b;
        aap aap4 = (aap) aam.build();
        aaj2.copyOnWrite();
        aas aas3 = (aas) aaj2.instance;
        aap4.getClass();
        aas3.f134676n = aap4;
        aas3.f134663a |= 8192;
        Class<Throwable> cls = Throwable.class;
        C47638k.m84753d(C60846c.m92879h(C60922j.m93045h(C60922j.m93045h(((C36275ad) oVar.f317430c.mo27525b()).mo40080e(), C47810es.m84966f(new C114471j(oVar, i, i2, aaj2)), oVar.f317429b), C47810es.m84966f(new C114452cq(dbVar, ajy, aas)), C60826bg.f164896a), cls, C47810es.m84966f(new C114453cr(dbVar, aas)), C60826bg.f164896a)).mo51520a(new C114454cs(dbVar, aas, i2), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo78618a(C86387ai aiVar, C89356b bVar, C85422c cVar) {
        C107632h hVar = (C107632h) this.f317539y.mo27525b();
        cVar.getClass();
        C86255j jVar = (C86255j) hVar.f299449a.mo17428b();
        jVar.getClass();
        C85005h hVar2 = (C85005h) hVar.f299450b.mo17428b();
        hVar2.getClass();
        C22871g gVar = (C22871g) hVar.f299451c.mo17428b();
        gVar.getClass();
        return C60856cj.m92900i(new C107631g(bVar, aiVar, cVar, jVar, hVar2, gVar));
    }

    /* renamed from: c */
    public final C60870cx mo78619c() {
        C88117pu puVar = (C88117pu) C88120px.f238222d.createBuilder();
        long a = this.f317525k.mo79743a(C90014bt.f247631km);
        puVar.copyOnWrite();
        C88120px pxVar = (C88120px) puVar.instance;
        pxVar.f238224a |= 1;
        pxVar.f238225b = (int) a;
        C87684al alVar = new C87684al(C88244um.OPA_KEEP_SCREEN_ON);
        alVar.mo81965b(C88116pt.f238220a, (C88120px) puVar.build());
        return C60856cj.m92900i(alVar.mo81964a());
    }

    /* renamed from: d */
    public final C60870cx mo78620d(Intent intent) {
        String stringExtra = intent.getStringExtra("grouping_key");
        if (C58837ba.m90859h(stringExtra)) {
            C59104x d = f317489a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) d).mo56372aa(28818)).mo56389s("Found invalid groupingKey: %s", stringExtra);
            return C60856cj.m92899h(new PendingIntent.CanceledException("GroupingKey not found."));
        }
        C114464db dbVar = (C114464db) this.f317534t.mo27525b();
        aaj aaj = (aaj) aas.f134661u.createBuilder();
        aaj.copyOnWrite();
        aas aas = (aas) aaj.instance;
        aas.f134664b = 3;
        aas.f134663a |= 1;
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        stringExtra.getClass();
        aas2.f134663a |= 256;
        aas2.f134670h = stringExtra;
        aas aas3 = (aas) aaj.build();
        dbVar.mo101332j(aas3);
        dbVar.f317392m.mo101314d(aas3);
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78621e(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        this.f317502M.mo80275j("opa", m189804N(C107551c.ASSISTANT_ASYNC_EVENT, bArr));
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final C60870cx mo78622f(Intent intent) {
        C60870cx cxVar;
        C114396ar arVar = ((C114464db) this.f317534t.mo27525b()).f317392m;
        long longExtra = intent.getLongExtra("unique_id", -1);
        C114496u uVar = (C114496u) arVar.f317201c.mo27525b();
        String stringExtra = intent.getStringExtra("fence_key");
        if (((FenceStateImpl) FenceStateImpl.m234223a(intent)).f390277a != 2 || C58837ba.m90859h(stringExtra)) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            C60870cx a = uVar.mo101355a(stringExtra);
            C114480s sVar = new C114480s(intent);
            cxVar = C60922j.m93044g(a, C47810es.m84963c(sVar), uVar.f317470e);
        }
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(cxVar), new C114393ao(arVar, longExtra), arVar.f317204f), new C114394ap(arVar), arVar.f317204f);
    }

    /* renamed from: g */
    public final C60870cx mo78623g(C58833ax axVar, Query query, C60870cx cxVar, C86251f fVar) {
        ClientConfig clientConfig;
        int a = C84376v.m134657a(query, this.f317501L);
        C60870cx p = mo78631p(fVar.f233151j);
        C86775r rVar = this.f317518b.f233977l;
        if (rVar != null) {
            clientConfig = rVar.f234384f;
        } else {
            clientConfig = ClientConfig.f236948a;
        }
        if (this.f317509T.mo56113h() && (clientConfig.f236951d == amo.ANDROID_AUTO_PHONE || clientConfig.f236951d == amo.ANDROID_AUTO_PROJECTED)) {
            ((C85700a) this.f317509T.mo56107c()).mo79322d(C89849ae.ASSISTANT_AUTO_CLIENTOP_EXECUTION_START);
        }
        return C60856cj.m92893b(p, C60922j.m93044g(this.f317523i.mo78370b(a, fVar.f233149h), new C114505t(this, axVar, fVar, query, cxVar), C60826bg.f164896a)).mo57334a(C114282e.f316910a, C60826bg.f164896a);
    }

    /* renamed from: h */
    public final C60870cx mo78624h() {
        return this.f317496G.mo28209i(new C119162c(this.f317520f).mo18058a(), "edit duo capabilities in main preference", new C114370p(this));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        if (!this.f317513X) {
            C113775ar arVar = this.f317527m;
            ((Application) arVar.f315099c.getApplicationContext()).unregisterActivityLifecycleCallbacks(arVar.f315106j);
            this.f317513X = true;
        }
    }

    /* renamed from: i */
    public final C60870cx mo78625i() {
        return this.f317497H.mo28201a("isBlockingLanguagePickerEnabledForUser", new C114295f(this));
    }

    /* renamed from: j */
    public final C60870cx mo78626j(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        C114464db dbVar = (C114464db) this.f317534t.mo27525b();
        return dbVar.f317383d.mo28210j(dbVar.mo101329f(bArr), "showPushMessageNotification", new C114457cv(dbVar));
    }

    /* renamed from: k */
    public final C60870cx mo78627k(Bundle bundle) {
        C86775r rVar = this.f317518b.f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(new C87684al(C88244um.NOTIFY_OPA_LAUNCH_FOR_SEARCH_RESULTS).mo81964a());
        }
        if (this.f317524j.mo56113h()) {
            ((C87568k) this.f317524j.mo56107c()).mo81688b(this.f317520f, bundle);
        } else {
            this.f317537w.mo65089a(C87566i.m142320s(this.f317520f, bundle, 0));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: l */
    public final C60870cx mo78628l(Query query) {
        if ((this.f317525k.mo79746e(C90110fh.f250670bO) || this.f317525k.mo79746e(C90014bt.f247387gG)) && ((C58833ax) this.f317493D.mo27525b()).mo56113h() && ((C109030b) ((C58833ax) this.f317493D.mo27525b()).mo56107c()).mo97406a()) {
            String bn = query != null ? query.mo84355bn() : null;
            if (bn == null || TextUtils.isEmpty(bn)) {
                bn = "and.gsa.widget.mic";
            }
            C58976aa aaVar = C58975e.f156826a;
            this.f317496G.mo28212l("Start OPA for voice search", new C114369o(this, bn));
            query = null;
        }
        return C60856cj.m92900i(C58833ax.m90833j(query));
    }

    /* renamed from: m */
    public final C60870cx mo78629m(Intent intent) {
        aas a = C36232a.m64674a(intent);
        if (a == null) {
            return C118826c.f331423b;
        }
        int d = C36232a.m64677d(intent);
        aas a2 = C36232a.m64674a(intent);
        int i = 2;
        if (a2 != null) {
            aap aap = a2.f134676n;
            if (aap == null) {
                aap = aap.f134650h;
            }
            int c = C65316b.m96666c(aap.f134655d);
            if (c != 0) {
                i = c;
            } else if (C36232a.m64677d(intent) == 35) {
                i = 4;
            }
        }
        ajy a3 = ajy.m92417a(intent.getIntExtra("content_source", 4));
        if (a3 == null) {
            a3 = ajy.CLIENT_GENERATED;
        }
        mo78617M(d, i, a, a3);
        return C118826c.f331423b;
    }

    /* renamed from: n */
    public final C60870cx mo78630n(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        String stringExtra = intent.getStringExtra("grouping_key");
        long longExtra = intent.getLongExtra("delayed_unique_id", 0);
        if (C58837ba.m90859h(stringExtra)) {
            return C60856cj.m92899h(new PendingIntent.CanceledException("GroupingKey not found."));
        }
        C114396ar arVar = ((C114464db) this.f317534t.mo27525b()).f317392m;
        C60870cx a = arVar.mo101311a(stringExtra, longExtra);
        C114391am amVar = new C114391am(arVar);
        C60922j.m93044g(a, C47810es.m84963c(amVar), arVar.f317204f);
        return C118826c.f331423b;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final C60870cx mo78631p(C60870cx cxVar) {
        return this.f317496G.mo28210j(cxVar, "updateOpaqueTokenForResponseStream#assistantResponseSourceFuture", new C114502q(this));
    }

    /* renamed from: q */
    public final void mo78632q(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        C87684al alVar = new C87684al(C88244um.HANDLE_CONTEXTUAL_CARDS);
        C62940bt btVar = C87865gl.f237713a;
        C87866gm gmVar = (C87866gm) C87867gn.f237714e.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        gmVar.copyOnWrite();
        C87867gn gnVar = (C87867gn) gmVar.instance;
        gnVar.f237716a |= 1;
        gnVar.f237717b = A;
        alVar.mo81965b(btVar, (C87867gn) gmVar.build());
        mo78609E(alVar.mo81964a());
    }

    /* renamed from: r */
    public final void mo78633r(Uri uri, String str) {
        if (!uri.getHost().equals("assistant.google.com") || !uri.getPath().startsWith("/services/invoke")) {
            C59104x d = f317489a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) d).mo56372aa(28827)).mo56389s("invalid conversation deeplink: %s", uri);
            int i = C90755l.f253831a;
            return;
        }
        apb apb = (apb) apc.f135542e.createBuilder();
        String uri2 = uri.toString();
        apb.copyOnWrite();
        apc apc = (apc) apb.instance;
        uri2.getClass();
        boolean z = true;
        apc.f135544a |= 1;
        apc.f135545b = uri2;
        apb.copyOnWrite();
        apc apc2 = (apc) apb.instance;
        str.getClass();
        apc2.f135544a |= 4;
        apc2.f135546c = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.UrlIntentInput";
        C63088z byteString = ((apc) apb.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "url.INTENT";
        dsVar.mo53729a("url_intent_input", (C52230ka) jzVar.build());
        C87565h hVar = new C87565h();
        hVar.f236517U = ((C51805du) dsVar.build()).toByteArray();
        boolean z2 = uri.toString().contains("param.asst") && !uri.toString().contains("param.asst=interpreter");
        boolean z3 = str.equals("android-app://com.google.android.apps.nexuslauncher") && uri.toString().contains("intent=actions.intent.START_TRANSLATION");
        if ((!uri.getPath().contains("uid/0000004f0e04d1da") || z2) && !z3) {
            hVar.f236560f = 1;
        } else {
            hVar.f236560f = 3;
        }
        if (((C84516aa) this.f317504O.mo27525b()).mo78228b()) {
            hVar.f236556b = e.av;
            hVar.f236523a = "and.opa.lockscreen.conversation.deeplink";
        } else {
            hVar.f236556b = e.au;
            hVar.f236523a = "and.opa.conversation.deeplink";
        }
        boolean contains = uri.toString().contains("intent=actions.intent.SHOW_REMINDER_CONFIRMATION");
        hVar.f236497A = !contains;
        if (uri.toString().contains("param.workflow_id") || uri.toString().contains("param.asst") || contains) {
            z = false;
        }
        mo78612H(hVar.mo81685a(), z);
    }

    /* renamed from: s */
    public final void mo78634s(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 0);
        int intExtra2 = intent.getIntExtra("com.google.android.search.core.extra.NOTIFICATION_ACTION_FLAG", 0);
        C58976aa aaVar = C58975e.f156826a;
        if (intExtra != 8) {
            if (intExtra != 16) {
                if (intExtra != 64) {
                    C59104x d = f317489a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "OpaWorker");
                    ((C59052c) ((C59052c) d).mo56372aa(28829)).mo56387q("Worker received an action press about an unknown notification type: %d", intExtra);
                    int i = C90755l.f253831a;
                } else if (intExtra2 == 1) {
                    String stringExtra = intent.getStringExtra("ved");
                    long longExtra = intent.getLongExtra("notification_content_id", -1);
                    bo boVar = this.f317533s;
                    C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
                    gVar.copyOnWrite();
                    C53658j jVar = (C53658j) gVar.instance;
                    jVar.f140831b = 1;
                    jVar.f140832c = Long.valueOf(longExtra);
                    gVar.copyOnWrite();
                    C53658j jVar2 = (C53658j) gVar.instance;
                    jVar2.f140835f = 6;
                    jVar2.f140830a |= 2;
                    boVar.i((C53658j) gVar.build(), stringExtra);
                    this.f317533s.k();
                }
            } else if (intExtra2 == 1) {
                long longExtra2 = intent.getLongExtra("notification_content_id", 0);
                int intExtra3 = intent.getIntExtra("notification_channel", 0);
                C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
                C48980c a = C48980c.m85331a(intExtra3);
                aVar.copyOnWrite();
                ((C49007d) aVar.instance).f126768a = a.getNumber();
                C49007d dVar = (C49007d) aVar.build();
                C109889k kVar = (C109889k) this.f317503N.mo27525b();
                C53655g gVar2 = (C53655g) C53658j.f140828i.createBuilder();
                gVar2.copyOnWrite();
                C53658j jVar3 = (C53658j) gVar2.instance;
                jVar3.f140831b = 1;
                jVar3.f140832c = Long.valueOf(longExtra2);
                gVar2.copyOnWrite();
                C53658j jVar4 = (C53658j) gVar2.instance;
                jVar4.f140835f = 6;
                jVar4.f140830a |= 2;
                gVar2.copyOnWrite();
                C53658j jVar5 = (C53658j) gVar2.instance;
                dVar.getClass();
                jVar5.f140837h = dVar;
                jVar5.f140830a |= 8;
                C53658j jVar6 = (C53658j) gVar2.build();
                kVar.mo98223c(jVar6);
                kVar.mo98222b(jVar6, (String) null);
                C109889k kVar2 = (C109889k) this.f317503N.mo27525b();
                C60870cx h = C60922j.m93045h(((C108013bm) kVar2.f306189d.mo27525b()).mo96369z(), new C109886h(kVar2), C60826bg.f164896a);
                C90476a aVar2 = C91018d.f254254a;
                new C90873ag(h, kVar2.f306190e, "recordOptOut", C109887i.f306184a).mo85223a(C109888j.f306185a);
                ((C109889k) this.f317503N.mo27525b()).mo98221a();
            } else {
                C59104x c = f317489a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaWorker");
                ((C59052c) ((C59052c) c).mo56372aa(28830)).mo56386p("Unknown action type");
            }
        } else if (intExtra2 == 1) {
            this.f317533s.e();
            C86337q b = ((C86338r) this.f317521g.mo27525b()).mo80076b();
            b.mo80067b("opa_user_turned_off_multiday_notification", true);
            b.apply();
            this.f317495F.mo28212l("Show pre-upgrade notification disabled toast", new C114368n(this));
        }
    }

    /* renamed from: t */
    public final void mo78635t(C38355f fVar, C38377r rVar, boolean z) {
        int a;
        C38355f fVar2 = fVar;
        C38377r rVar2 = rVar;
        boolean z2 = z;
        C58976aa aaVar = C58975e.f156826a;
        int a2 = C38351b.m67651a(fVar2.f101546b);
        int i = 2;
        int i2 = 1;
        if (a2 == 0 || a2 == 1) {
            C87565h hVar = new C87565h();
            if ((fVar2.f101545a & 4) == 0 || !fVar2.f101548d.equals(this.f317525k.mo79758x(C90014bt.f247052Q))) {
                if ((fVar2.f101545a & 4) == 0 || !fVar2.f101548d.equals("com.google.android.googlequicksearchbox") || !fVar2.f101552h.equals("homescreen.shortcut")) {
                    int i3 = fVar2.f101555k;
                    int a3 = C38357h.m67653a(i3);
                    if (a3 != 0 && a3 == 4) {
                        hVar.f236560f = 3;
                        hVar.f236556b = e.aj;
                        hVar.f236523a = "and.opa.deeplink";
                        hVar.f236497A = true;
                        m189806P(fVar2, z2, hVar);
                        return;
                    }
                    int a4 = C38357h.m67653a(i3);
                    if ((a4 != 0 && a4 == 5) || ((a = C38357h.m67653a(i3)) != 0 && a == 6)) {
                        hVar.f236556b = e.aw;
                        hVar.f236523a = "and.opa.conversation.deeplink";
                        hVar.f236558d = 1;
                        hVar.f236560f = 4;
                        int i4 = fVar2.f101555k;
                        int a5 = C38357h.m67653a(i4);
                        if (a5 != 0 && a5 == 5) {
                            hVar.f236568n = this.f317520f.getString(R.string.opa_create_reminder_query);
                        } else {
                            int a6 = C38357h.m67653a(i4);
                            if (a6 != 0 && a6 == 6) {
                                hVar.f236559e = true;
                                if (rVar2 != null) {
                                    C38343ac acVar = rVar2.f101616b;
                                    if (acVar == null) {
                                        acVar = C38343ac.f101528b;
                                    }
                                    C62971cq cqVar = acVar.f101530a;
                                    String O = m189805O(cqVar, "client_assigned_reminder_id");
                                    String O2 = m189805O(cqVar, "server_assigned_reminder_id");
                                    if (!TextUtils.isEmpty(O)) {
                                        hVar.f236517U = C109456b.m182151a(O, true).toByteArray();
                                    } else if (!TextUtils.isEmpty(O2)) {
                                        hVar.f236517U = C109456b.m182151a(O2, false).toByteArray();
                                    } else {
                                        C59104x d = f317489a.mo56226d();
                                        d.mo56378ag(C58975e.f156826a, "OpaWorker");
                                        ((C59052c) ((C59052c) d).mo56372aa(28832)).mo56354G("Key %s and %s not found in HUB_UPDATE_REMINDER deeplinkInfo", "client_assigned_reminder_id", "server_assigned_reminder_id");
                                    }
                                } else {
                                    C59104x d2 = f317489a.mo56226d();
                                    d2.mo56378ag(C58975e.f156826a, "OpaWorker");
                                    ((C59052c) ((C59052c) d2).mo56372aa(28831)).mo56386p("Null deeplinkInfo in HUB_UPDATE_REMINDER deeplink");
                                }
                            }
                        }
                        m189806P(fVar2, z2, hVar);
                        return;
                    }
                    int a7 = C38357h.m67653a(i3);
                    if (a7 != 0 && a7 == 7) {
                        m189809S(hVar, "and.opa.deeplink", 21, (String) null);
                        return;
                    }
                    int a8 = C38357h.m67653a(i3);
                    if (a8 != 0 && a8 == 8) {
                        hVar.f236497A = true;
                        hVar.f236556b = e.aw;
                        hVar.f236523a = "and.opa.deeplink";
                        hVar.f236560f = 1;
                        m189806P(fVar2, z2, hVar);
                        return;
                    }
                    int a9 = C38357h.m67653a(i3);
                    if (a9 != 0 && a9 == 9) {
                        if (!fVar2.f101547c.isEmpty()) {
                            C59104x d3 = f317489a.mo56226d();
                            d3.mo56378ag(C58975e.f156826a, "OpaWorker");
                            ((C59052c) ((C59052c) d3).mo56372aa(28835)).mo56389s("VOICE_MODE_MIC_OFF is not supported with a query, got '%s'", fVar2.f101547c);
                            C38354e eVar = (C38354e) fVar.toBuilder();
                            eVar.copyOnWrite();
                            C38355f fVar3 = (C38355f) eVar.instance;
                            fVar3.f101545a &= -3;
                            fVar3.f101547c = C38355f.f101543s.f101547c;
                            fVar2 = (C38355f) eVar.build();
                        }
                        hVar.f236556b = e.aw;
                        hVar.f236523a = "and.opa.conversation.deeplink";
                        hVar.f236560f = 3;
                        m189806P(fVar2, z2, hVar);
                        return;
                    }
                    int a10 = C38357h.m67653a(i3);
                    if (a10 != 0 && a10 == 10) {
                        C83879am o = C83880an.m133553o();
                        C83940g gVar = (C83940g) o;
                        gVar.f228605a = "opa_android:iris_promo";
                        gVar.f228607c = new C83938e(0, (String) null, (String) null);
                        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
                        C9439b bVar = C9439b.OPA_IRIS_PROMO;
                        vVar.copyOnWrite();
                        C59567w wVar = (C59567w) vVar.instance;
                        wVar.f158062c = bVar.f32835aq;
                        wVar.f158060a |= 2;
                        o.mo77222b((C59567w) vVar.build());
                        Intent n = o.mo77221a().mo77240n();
                        n.setFlags(8388608);
                        this.f317537w.mo65089a(n);
                        return;
                    }
                    hVar.f236556b = e.aw;
                    hVar.f236523a = "and.opa.deeplink";
                    hVar.f236560f = 2;
                    if (!this.f317525k.mo79746e(C90118fp.f250755a) && !fVar2.f101547c.isEmpty()) {
                        hVar.f236523a = "and.opa.conversation.deeplink";
                    }
                    m189806P(fVar2, z2, hVar);
                    return;
                }
                hVar.f236556b = e.aT;
                hVar.f236558d = 1;
                hVar.f236523a = "and.opa.launcher.shortcut";
                if (true == C113761ad.m188326a((SharedPreferences) this.f317521g.mo27525b()).equals("typing")) {
                    i = 1;
                }
                hVar.f236560f = i;
                hVar.f236541al = false;
                m189806P(fVar2, z2, hVar);
            } else if (!this.f317525k.mo79746e(C90014bt.f247314en)) {
                hVar.f236556b = e.bB;
                hVar.f236558d = 1;
                hVar.f236523a = "and.opa.shellapp";
                if (true != C113761ad.m188326a((SharedPreferences) this.f317521g.mo27525b()).equals("typing")) {
                    i2 = 2;
                }
                hVar.f236560f = i2;
                hVar.f236541al = false;
                int i5 = fVar2.f101555k;
                int a11 = C38357h.m67653a(i5);
                if (a11 != 0 && a11 == 2) {
                    hVar.f236560f = 4;
                    hVar.f236556b = e.bC;
                    hVar.f236568n = this.f317520f.getString(R.string.opa_my_day_query);
                } else {
                    int a12 = C38357h.m67653a(i5);
                    if (a12 != 0 && a12 == 3) {
                        hVar.f236556b = e.bD;
                    }
                }
                m189806P(fVar2, z2, hVar);
            } else {
                m189809S(hVar, "and.opa.shellapp", 39, this.f317525k.mo79758x(C90080ee.f249803b));
            }
        } else if (a2 == 2) {
            this.f317537w.mo65089a(C87566i.m142322u(this.f317520f, false));
        } else if (a2 == 3) {
            C108598c q = C108599d.m180579q();
            C108596a aVar = (C108596a) q;
            aVar.f302071a = fVar2.f101548d;
            aVar.f302072b = fVar2.f101550f;
            aVar.f302073c = fVar2.f101551g;
            q.mo97001d(fVar2.f101553i);
            q.mo96999b(fVar2.f101557m);
            q.mo97000c(fVar2.f101558n);
            q.mo97002e(fVar2.f101559o);
            int a13 = C38353d.m67652a(fVar2.f101556l);
            if (a13 != 0) {
                i2 = a13;
            }
            aVar.f302081k = i2;
            aVar.f302075e = fVar2.f101549e;
            aVar.f302076f = Boolean.valueOf(fVar2.f101561q);
            aVar.f302077g = fVar2.f101552h;
            int i6 = fVar2.f101545a;
            if ((65536 & i6) != 0) {
                aVar.f302079i = Integer.valueOf(fVar2.f101562r);
            }
            if ((i6 & 256) != 0) {
                aVar.f302074d = Integer.valueOf(fVar2.f101554j);
            }
            if (rVar2 != null) {
                C38343ac acVar2 = rVar2.f101616b;
                if (acVar2 == null) {
                    acVar2 = C38343ac.f101528b;
                }
                C62971cq cqVar2 = acVar2.f101530a;
                aVar.f302078h = C108600e.m180600e(cqVar2, "account_name");
                aVar.f302080j = C108600e.m180600e(cqVar2, "assistant_device_id");
            }
            this.f317537w.mo65089a(q.mo96998a().mo97021p());
        } else if (a2 != 4) {
            C18509a c = C18522b.m35986c();
            if ((fVar2.f101545a & 16384) != 0) {
                ((C18523c) c).f52492a = fVar2.f101560p;
            }
            this.f317537w.mo65089a(new Intent(this.f317520f, ProxyActivity.class).putExtra("android.intent.extra.INTENT", c.mo24020b().mo24031a()));
        } else {
            this.f317537w.mo65089a(new Intent(this.f317520f, OpaHqActivity.class).addFlags(268435456));
        }
    }

    /* renamed from: u */
    public final void mo78636u() {
        mo78609E(new C87684al(C88244um.START_OF_SPEECH).mo81964a());
    }

    /* renamed from: v */
    public final void mo78637v() {
        C58976aa aaVar = C58975e.f156826a;
        mo78609E(new C87684al(C88244um.VOICE_SEARCH_DONE).mo81964a());
    }

    /* renamed from: w */
    public final void mo78638w(long j) {
        this.f317498I.mo28212l("Resolve binder", new C114366l(this, j));
    }

    /* renamed from: x */
    public final void mo78639x(C52081en enVar) {
        if (this.f317525k.mo79746e(C90014bt.f247256di) && (enVar.f136681a & 16) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            C52091ex exVar = enVar.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            C58833ax f = C11210e.m26594f(exVar);
            if (f.mo56113h()) {
                boolean z = false;
                for (C52083ep epVar : enVar.f136684d) {
                    if (epVar.f136692b == 4) {
                        C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                        if (dyVar == null) {
                            dyVar = C51809dy.f135933f;
                        }
                        if (dyVar.f135936b.equals("ui.EXIT_NATIVE_FORM")) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    C58833ax d = C11210e.m26592d(exVar);
                    if (d.mo56113h() && (((C51254ax) d.mo56107c()).f133436a & 1) != 0) {
                        C51536li liVar = (C51536li) f.mo56107c();
                        C51406gn gnVar = ((C51254ax) d.mo56107c()).f133437b;
                        if (gnVar == null) {
                            gnVar = C51406gn.f133887s;
                        }
                        m189807Q(liVar, gnVar, C51936ep.CALL);
                    }
                    C58833ax e = C11210e.m26593e(exVar);
                    if (e.mo56113h() && (((C51460in) e.mo56107c()).f134054a & 1) != 0) {
                        C51536li liVar2 = (C51536li) f.mo56107c();
                        C51406gn gnVar2 = ((C51460in) e.mo56107c()).f134055b;
                        if (gnVar2 == null) {
                            gnVar2 = C51406gn.f133887s;
                        }
                        m189807Q(liVar2, gnVar2, C51936ep.MESSAGE);
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x c = f317489a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) c).mo56372aa(28842)).mo56386p("#maybeLogFluidActionsEvents: Missing RequestLoggingParams");
        }
    }

    /* renamed from: y */
    public final void mo78640y() {
        int b = this.f317533s.b(1, 1);
        int b2 = this.f317533s.b(8, 1);
        int i = b == 2 ? 1 : 0;
        if (b2 == 2) {
            i |= 8;
        }
        if (i != this.f317512W) {
            C58976aa aaVar = C58975e.f156826a;
            if ((i & 8) != 0) {
                this.f317533s.h(8);
            } else if ((i & 1) != 0) {
                this.f317533s.h(1);
            } else {
                this.f317533s.e();
            }
            this.f317512W = i;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: z */
    public final void mo78641z(com.google.assistant.p3897e.p3910e.p3911a.C51195j r11, com.google.android.apps.gsa.shared.search.Query r12) {
        /*
            r10 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r10.f317506Q
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.dz.a r0 = (com.google.android.apps.gsa.staticplugins.p7884dz.C100321a) r0
            boolean r0 = r0.f280539a
            if (r0 == 0) goto L_0x0026
            com.google.android.libraries.gsa.k.g r0 = r10.f317496G
            com.google.android.apps.gsa.staticplugins.opa.worker.g r1 = new com.google.android.apps.gsa.staticplugins.opa.worker.g
            r1.<init>(r10, r12, r11)
            java.lang.String r2 = "Store assistant response to files"
            r0.mo28212l(r2, r1)
        L_0x0026:
            com.google.android.apps.gsa.staticplugins.opa.util.m r0 = r10.f317492C
            android.content.SharedPreferences r1 = r0.f315316a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences r2 = r0.f315316a
            java.lang.String r3 = "assistant_response_received"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            r3 = 1
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = "assistant_response_received"
            r1.putBoolean(r2, r3)
        L_0x003f:
            dagger.a r2 = r0.f315317b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            android.content.SharedPreferences r5 = r0.f315316a
            boolean r2 = com.google.android.apps.gsa.staticplugins.opa.util.C113765ah.m188332a(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = "opa_has_seen_greeting_for_lockhart"
            boolean r2 = r5.getBoolean(r2, r4)
            if (r2 == 0) goto L_0x0066
            android.content.SharedPreferences r0 = r0.f315316a
            java.lang.String r2 = "assistant_response_received_since_lockhart_greeting"
            boolean r0 = r0.getBoolean(r2, r4)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "assistant_response_received_since_lockhart_greeting"
            r1.putBoolean(r0, r3)
        L_0x0066:
            r1.apply()
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f317525k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90143v.f251877a
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0075
            goto L_0x00bd
        L_0x0075:
            com.google.assistant.e.j.en r0 = r11.f133275j
            if (r0 != 0) goto L_0x007b
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x007b:
            int r0 = r0.f136681a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0089
            com.google.assistant.e.j.en r0 = r11.f133275j
            if (r0 != 0) goto L_0x0086
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x0086:
            com.google.protobuf.z r0 = r0.f136682b
            goto L_0x008a
        L_0x0089:
            r0 = r1
        L_0x008a:
            com.google.protobuf.z r2 = r10.f317515Z
            boolean r2 = p3186j$.util.Objects.equals(r0, r2)
            if (r2 != 0) goto L_0x0096
            r10.f317514Y = r4
            r10.f317515Z = r0
        L_0x0096:
            boolean r0 = r10.f317514Y
            if (r0 != 0) goto L_0x00a3
            boolean r0 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138692b(r11)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r0 = 0
            goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            boolean r2 = r11.f133274i
            if (r2 != 0) goto L_0x00bb
            if (r0 != 0) goto L_0x00b8
            com.google.android.apps.gsa.search.shared.service.al r0 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_NOTIFY_NO_CARD_IN_RESPONSE
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r0 = r0.mo81964a()
            r10.mo78609E(r0)
        L_0x00b8:
            r10.f317514Y = r4
            goto L_0x00bd
        L_0x00bb:
            r10.f317514Y = r0
        L_0x00bd:
            int r0 = r11.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            r2 = 4
            if (r0 == 0) goto L_0x0105
            com.google.assistant.e.j.en r0 = r11.f133275j
            if (r0 != 0) goto L_0x00ca
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x00ca:
            com.google.protobuf.cq r0 = r0.f136684d
            java.util.Iterator r0 = r0.iterator()
        L_0x00d0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r0.next()
            com.google.assistant.e.j.ep r5 = (com.google.assistant.p3897e.p3921j.C52083ep) r5
            int r6 = r5.f136692b
            if (r6 != r2) goto L_0x00e5
            java.lang.Object r5 = r5.f136693c
            com.google.assistant.e.j.ei r5 = (com.google.assistant.p3897e.p3921j.C52076ei) r5
            goto L_0x00e7
        L_0x00e5:
            com.google.assistant.e.j.ei r5 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00e7:
            com.google.assistant.e.j.dy r5 = r5.f136668c
            if (r5 != 0) goto L_0x00ed
            com.google.assistant.e.j.dy r5 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00ed:
            java.lang.String r6 = "photos.DISPLAY_PHOTOS"
            java.lang.String r5 = r5.f135936b
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00d0
            com.google.android.apps.gsa.search.shared.service.al r0 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_NOTIFY_DISPLAY_PHOTOS_IN_RESPONSE
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r5)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r0 = r0.mo81964a()
            r10.mo78609E(r0)
        L_0x0105:
            com.google.assistant.e.e.a.i r0 = r11.f133270e
            if (r0 != 0) goto L_0x010b
            com.google.assistant.e.e.a.i r0 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x010b:
            int r0 = r0.f133260a
            r5 = 2
            r0 = r0 & r5
            if (r0 == 0) goto L_0x011c
            com.google.assistant.e.e.a.i r0 = r11.f133270e
            if (r0 != 0) goto L_0x0117
            com.google.assistant.e.e.a.i r0 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x0117:
            com.google.protobuf.z r0 = r0.f133262c
            r10.mo78614J(r0)
        L_0x011c:
            java.lang.String r0 = "android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA"
            boolean r0 = r12.mo84363bw(r0)
            if (r0 != 0) goto L_0x016e
            com.google.android.apps.gsa.staticplugins.opa.bm.a r0 = r10.f317517ab
            r0.mo96441f(r4)
            com.google.assistant.e.j.en r0 = r11.f133275j
            if (r0 != 0) goto L_0x012f
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x012f:
            int r0 = r0.f136681a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x016e
            com.google.assistant.e.j.en r0 = r11.f133275j
            if (r0 != 0) goto L_0x013b
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x013b:
            com.google.assistant.e.j.ex r0 = r0.f136685e
            if (r0 != 0) goto L_0x0141
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0141:
            com.google.protobuf.cq r0 = r0.f136712a
            java.util.Iterator r0 = r0.iterator()
        L_0x0147:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x016e
            java.lang.Object r6 = r0.next()
            com.google.assistant.e.j.kc r6 = (com.google.assistant.p3897e.p3921j.C52232kc) r6
            java.lang.String r7 = r6.f137065b
            java.lang.String r8 = "asst.startup.display.params"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0147
            com.google.android.apps.gsa.opa.ak r0 = r10.f317540z
            com.google.assistant.e.j.ka r6 = r6.f137066c
            if (r6 != 0) goto L_0x0165
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0165:
            com.google.protobuf.z r6 = r6.f137061c
            byte[] r6 = r6.mo59174N()
            r0.mo76922c(r6)
        L_0x016e:
            dagger.a r0 = r10.f317490A
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.f r6 = new com.google.android.apps.gsa.shared.logger.b.f
            r6.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RENDERING_START
            r6.f246201a = r7
            java.lang.String r7 = "rId"
            long r8 = r12.f252749G
            java.lang.String r8 = java.lang.Long.toString(r8)
            r6.mo83701c(r7, r8)
            com.google.android.apps.gsa.shared.logger.b.g r6 = r6.mo83699a()
            r0.mo74236a(r6)
            com.google.android.apps.gsa.staticplugins.opa.q.a r0 = r10.f317516aa
            java.lang.String r6 = "response-received"
            r0.mo98270a(r6)
            dagger.a r0 = r10.f317521g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0
            com.google.android.apps.gsa.search.core.preferences.q r0 = r0.mo80076b()
            int r6 = r11.f133266a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x01b5
            com.google.assistant.e.e.a.i r2 = r11.f133270e
            if (r2 != 0) goto L_0x01af
            com.google.assistant.e.e.a.i r2 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x01af:
            boolean r2 = r2.f133261b
            if (r2 == 0) goto L_0x01b5
            r2 = 1
            goto L_0x01b6
        L_0x01b5:
            r2 = 0
        L_0x01b6:
            java.lang.String r6 = "opa_last_response_expects_follow_on"
            r0.mo80067b(r6, r2)
            java.lang.String r2 = "opa_last_response_timestamp"
            com.google.android.libraries.f.a r6 = r10.f317522h
            long r6 = r6.mo26870b()
            r0.mo80072g(r2, r6)
            r0.apply()
            dagger.a r0 = r10.f317536v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r0 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r0
            java.lang.Object r2 = r0.f236439a
            monitor-enter(r2)
            r0.f236444f = r1     // Catch:{ all -> 0x029e }
            monitor-exit(r2)     // Catch:{ all -> 0x029e }
            int r0 = r11.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01fc
            com.google.common.base.ax r0 = r10.f317499J
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x01fc
            com.google.common.base.ax r0 = r10.f317499J
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.a.u r0 = (com.google.android.apps.gsa.search.core.p6491a.C84375u) r0
            dagger.a r1 = r10.f317501L
            int r1 = com.google.android.apps.gsa.search.core.p6491a.C84376v.m134657a(r12, r1)
            com.google.assistant.e.j.en r2 = r11.f133275j
            if (r2 != 0) goto L_0x01f9
            com.google.assistant.e.j.en r2 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x01f9:
            r0.mo77934c(r1, r2)
        L_0x01fc:
            if (r11 == 0) goto L_0x0256
            boolean r0 = r12.mo84404ck()
            if (r0 != 0) goto L_0x0205
            goto L_0x0256
        L_0x0205:
            com.google.protobuf.cq r0 = r11.f133272g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0256
            com.google.protobuf.cq r0 = r11.f133272g
            java.lang.Object r0 = r0.get(r4)
            com.google.assistant.e.e.a.b r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51187b) r0
            com.google.assistant.e.a.f r1 = r0.f133241e
            if (r1 != 0) goto L_0x021b
            com.google.assistant.e.a.f r1 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x021b:
            int r1 = r1.f132452e
            int r1 = com.google.assistant.p3897e.p3898a.C50869e.m85974a(r1)
            if (r1 != 0) goto L_0x0224
            goto L_0x023f
        L_0x0224:
            if (r1 == r5) goto L_0x023f
            com.google.assistant.e.a.f r0 = r0.f133241e
            if (r0 != 0) goto L_0x022c
            com.google.assistant.e.a.f r0 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x022c:
            int r0 = r0.f132452e
            int r0 = com.google.assistant.p3897e.p3898a.C50869e.m85974a(r0)
            if (r0 == 0) goto L_0x0256
            r1 = 3
            if (r0 != r1) goto L_0x0256
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            com.google.android.ssb.service.SsbService.m80862e(r0, r1)
            goto L_0x0256
        L_0x023f:
            com.google.assistant.e.a.f r0 = r0.f133241e
            if (r0 != 0) goto L_0x0246
            com.google.assistant.e.a.f r1 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
            goto L_0x0247
        L_0x0246:
            r1 = r0
        L_0x0247:
            java.lang.String r1 = r1.f132450c
            if (r0 != 0) goto L_0x024d
            com.google.assistant.e.a.f r0 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x024d:
            java.lang.String r0 = r0.f132449b
            if (r1 == 0) goto L_0x0256
            if (r0 == 0) goto L_0x0256
            com.google.android.ssb.service.SsbService.m80862e(r1, r0)
        L_0x0256:
            int r0 = r11.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0265
            com.google.assistant.e.j.en r11 = r11.f133275j
            if (r11 != 0) goto L_0x0262
            com.google.assistant.e.j.en r11 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x0262:
            r10.mo78639x(r11)
        L_0x0265:
            java.lang.String r11 = "android.opa.extra.TRIGGERED_BY"
            int r11 = r12.mo84263a(r11)
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.a(r11)
            com.google.android.apps.gsa.assistant.shared.l.e r12 = com.google.android.apps.gsa.assistant.shared.l.e.aI
            if (r11 == r12) goto L_0x0277
            com.google.android.apps.gsa.assistant.shared.l.e r12 = com.google.android.apps.gsa.assistant.shared.l.e.bJ
            if (r11 != r12) goto L_0x029d
        L_0x0277:
            dagger.a r11 = r10.f317521g
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r11 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r11
            java.lang.String r12 = "counter_of_opa_response_from_lockhart"
            int r12 = r11.getInt(r12, r4)
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f317525k
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247094af
            long r0 = r0.mo79743a(r1)
            int r1 = (int) r0
            if (r12 >= r1) goto L_0x029d
            com.google.android.apps.gsa.search.core.preferences.q r11 = r11.mo80076b()
            java.lang.String r0 = "counter_of_opa_response_from_lockhart"
            int r12 = r12 + r3
            r11.mo80070e(r0, r12)
            r11.apply()
        L_0x029d:
            return
        L_0x029e:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x029e }
            goto L_0x02a2
        L_0x02a1:
            throw r11
        L_0x02a2:
            goto L_0x02a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.C114507v.mo78641z(com.google.assistant.e.e.a.j, com.google.android.apps.gsa.shared.search.Query):void");
    }

    /* renamed from: G */
    public final void mo78611G(boolean z, boolean z2, boolean z3) {
        C17823i iVar;
        if (z3 && z) {
            iVar = C17823i.FREE_NAVIGATION_IN_FOREGROUND;
        } else if (z2 && z) {
            iVar = C17823i.GUIDED_NAVIGATION_IN_FOREGROUND;
        } else if (z3 || z2) {
            iVar = C17823i.RUNNING_IN_BACKGROUND;
        } else {
            iVar = C17823i.STOPPED;
        }
        this.f317496G.mo28212l("maybeTriggerMorrisOobeNotification", new C114367m(this, iVar));
        if (((C58833ax) this.f317494E.mo27525b()).mo56113h()) {
            ((d) ((C58833ax) this.f317494E.mo27525b()).mo56107c()).f(iVar);
        }
    }

    /* renamed from: B */
    public final void mo78606B(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 0);
        int intExtra2 = intent.getIntExtra("value_prop_id", 0);
        C58976aa aaVar = C58975e.f156826a;
        if (intExtra == 4 || intExtra == 8) {
            this.f317533s.o(intExtra, 4);
            m189808R(intExtra2);
        } else if (intExtra == 16) {
            long longExtra = intent.getLongExtra("notification_content_id", -1);
            if (longExtra < 0) {
                C59104x c = f317489a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaWorker");
                ((C59052c) ((C59052c) c).mo56372aa(28856)).mo56388r("Invalid content id: %d", longExtra);
                return;
            }
            String stringExtra = intent.getStringExtra("ved");
            C109889k kVar = (C109889k) this.f317503N.mo27525b();
            C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
            gVar.copyOnWrite();
            C53658j jVar = (C53658j) gVar.instance;
            jVar.f140831b = 1;
            jVar.f140832c = Long.valueOf(longExtra);
            gVar.copyOnWrite();
            C53658j jVar2 = (C53658j) gVar.instance;
            jVar2.f140835f = 4;
            jVar2.f140830a |= 2;
            C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
            C48980c a = C48980c.m85331a(intent.getIntExtra("notification_channel", 0));
            aVar.copyOnWrite();
            ((C49007d) aVar.instance).f126768a = a.getNumber();
            gVar.copyOnWrite();
            C53658j jVar3 = (C53658j) gVar.instance;
            C49007d dVar = (C49007d) aVar.build();
            dVar.getClass();
            jVar3.f140837h = dVar;
            jVar3.f140830a |= 8;
            C53658j jVar4 = (C53658j) gVar.build();
            kVar.mo98223c(jVar4);
            kVar.mo98222b(jVar4, stringExtra);
            m189808R(intExtra2);
            ((C109889k) this.f317503N.mo27525b()).mo98221a();
        } else if (intExtra == 32) {
            this.f317533s.o(intExtra, 4);
            e eVar = e.bi;
            C87565h hVar = new C87565h();
            hVar.f236556b = eVar;
            hVar.f236497A = true;
            hVar.f236509M = true;
            hVar.f236560f = 1;
            hVar.f236517U = C113869cx.m188498g(this.f317500K.mo100734h(10), this.f317500K.mo100729b((C52341od) C52343of.f137384i.createBuilder())).toByteArray();
            ((C87568k) this.f317524j.mo56107c()).mo81688b(this.f317520f, hVar.mo81685a());
        } else if (intExtra == 64) {
            String stringExtra2 = intent.getStringExtra("ved");
            long longExtra2 = intent.getLongExtra("notification_content_id", -1);
            bo boVar = this.f317533s;
            C53655g gVar2 = (C53655g) C53658j.f140828i.createBuilder();
            gVar2.copyOnWrite();
            C53658j jVar5 = (C53658j) gVar2.instance;
            jVar5.f140831b = 1;
            jVar5.f140832c = Long.valueOf(longExtra2);
            gVar2.copyOnWrite();
            C53658j jVar6 = (C53658j) gVar2.instance;
            jVar6.f140835f = 4;
            jVar6.f140830a |= 2;
            boVar.i((C53658j) gVar2.build(), stringExtra2);
            if (!intent.getBooleanExtra("nga-pie-swipe-education", false) || !((Boolean) this.f317508S.mo56106b(C114317h.f316975a).mo56109e(false)).booleanValue()) {
                Intent intent2 = (Intent) intent.getParcelableExtra("opa-nga-target-intent");
                if (intent2 != null) {
                    this.f317537w.mo65089a(intent2);
                    return;
                }
                String stringExtra3 = intent.getStringExtra("nga-promo-query");
                if (stringExtra3 == null) {
                    return;
                }
                if (!intent.getBooleanExtra("nga-pie-suggest", false) || !((Boolean) this.f317508S.mo56106b(new C114332i(stringExtra3)).mo56109e(false)).booleanValue()) {
                    C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
                    e eVar2 = e.bi;
                    abVar.copyOnWrite();
                    C83614ac acVar = (C83614ac) abVar.instance;
                    acVar.f227955c = eVar2.ca;
                    acVar.f227953a |= 2;
                    abVar.copyOnWrite();
                    C83614ac acVar2 = (C83614ac) abVar.instance;
                    acVar2.f227954b = 1;
                    acVar2.f227953a |= 1;
                    abVar.copyOnWrite();
                    C83614ac acVar3 = (C83614ac) abVar.instance;
                    acVar3.f227953a |= 4;
                    acVar3.f227956d = stringExtra3;
                    ((C107759j) this.f317507R.mo27525b()).mo96272h((C83614ac) abVar.build());
                }
            }
        } else if (intExtra == 128) {
            String stringExtra4 = intent.getStringExtra("ved");
            if (stringExtra4 != null) {
                this.f317533s.w(stringExtra4, 5);
            }
            Intent intent3 = (Intent) intent.getParcelableExtra("opa-nga-target-intent");
            if (intent3 != null) {
                this.f317537w.mo65089a(intent3);
            }
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("opa-target-pending-intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    C59104x c2 = f317489a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "OpaWorker");
                    ((C59052c) ((C59052c) c2).mo56372aa(28857)).mo56386p("Pending Intent failed to send.");
                }
            }
        } else if (intExtra == 256) {
            e eVar3 = e.bi;
            C87565h hVar2 = new C87565h();
            hVar2.f236556b = eVar3;
            hVar2.f236548as = true;
            ((C87568k) this.f317524j.mo56107c()).mo81688b(this.f317520f, hVar2.mo81685a());
        } else if (intExtra != 512) {
            C59104x d = f317489a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) d).mo56372aa(28855)).mo56387q("Worker received tap about unknown notification type: %d", intExtra);
            int i = C90755l.f253831a;
        } else {
            String stringExtra5 = intent.getStringExtra("opa-query-string");
            e eVar4 = e.bm;
            C87565h hVar3 = new C87565h();
            hVar3.f236556b = eVar4;
            hVar3.f236523a = "and.opa.lockscreen.entrypoint";
            hVar3.f236507K = true;
            hVar3.f236509M = true;
            hVar3.f236560f = 2;
            if (stringExtra5 != null) {
                hVar3.f236568n = stringExtra5;
                hVar3.f236560f = 3;
                if (this.f317525k.mo79746e(C90037cp.f248607dy)) {
                    C118826c.m197213c(((h) this.f317511V.mo27525b()).a.mo46039a(new a(stringExtra5), C60826bg.f164896a));
                } else {
                    C118826c.m197213c(((C42876ab) ((C106391p) this.f317510U.mo27525b()).f296744b.mo27525b()).mo46039a(new C106384i(stringExtra5), C60826bg.f164896a));
                }
            }
            ((C87568k) this.f317524j.mo56107c()).mo81688b(this.f317520f, hVar3.mo81685a());
        }
    }
}
