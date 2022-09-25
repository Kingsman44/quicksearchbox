package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import android.util.Base64;
import com.google.android.apps.gsa.shared.speech.hotword.C90578a;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.opus.OpusDecoder;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94928z;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95000r;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k.C95024f;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96504x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66676j;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5224k.p5225a.C67231i;
import com.google.speech.p5224k.p5225a.C67244v;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.v */
/* compiled from: PG */
public final class C94961v {

    /* renamed from: a */
    public static final C59071e f265628a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.e.v");

    /* renamed from: b */
    public final C22871g f265629b;

    /* renamed from: c */
    final C90926bw f265630c;

    /* renamed from: d */
    public final C94948i f265631d;

    /* renamed from: e */
    public final C95007y f265632e;

    /* renamed from: f */
    public final C95024f f265633f;

    /* renamed from: g */
    final C96504x f265634g;

    /* renamed from: h */
    final OpusDecoder f265635h = new OpusDecoder();

    /* renamed from: i */
    volatile boolean f265636i = false;

    /* renamed from: j */
    volatile Integer f265637j;

    /* renamed from: k */
    volatile C96500t f265638k;

    /* renamed from: l */
    public C90599p f265639l;

    /* renamed from: m */
    public int f265640m = 0;

    /* renamed from: n */
    public int f265641n = 0;

    /* renamed from: o */
    public int f265642o = 0;

    /* renamed from: p */
    public volatile long f265643p;

    /* renamed from: q */
    public volatile long f265644q;

    /* renamed from: r */
    int f265645r = 4;

    /* renamed from: s */
    final C94960u f265646s;

    /* renamed from: t */
    private final C21370a f265647t;

    /* renamed from: u */
    private C94928z f265648u;

    /* renamed from: v */
    private C48090bx f265649v;

    /* renamed from: w */
    private C124548d f265650w;

    public C94961v(C22871g gVar, C94948i iVar, C96504x xVar, C21370a aVar, C95007y yVar, C95024f fVar) {
        this.f265629b = gVar;
        this.f265631d = iVar;
        this.f265634g = xVar;
        this.f265647t = aVar;
        this.f265632e = yVar;
        this.f265633f = fVar;
        this.f265646s = new C94960u(this);
        this.f265630c = new C90926bw((Object) null);
    }

    /* renamed from: j */
    private final synchronized void m156769j(C94928z zVar, C124548d dVar, C48090bx bxVar, boolean z) {
        if (z) {
            this.f265645r = 5;
            return;
        }
        this.f265645r = 1;
        this.f265648u = zVar;
        this.f265649v = bxVar;
        this.f265650w = dVar;
        C94948i iVar = this.f265631d;
        C95007y yVar = this.f265632e;
        boolean e = zVar.mo88791e();
        C48090bx bxVar2 = this.f265649v;
        if (iVar.f265605e.get()) {
            C59104x c = C94948i.f265601a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17672)).mo56386p("Input was started before");
            iVar.mo88857b();
        }
        C58976aa aaVar = C58975e.f156826a;
        iVar.f265605e.get();
        C95005w wVar = iVar.f265602b;
        wVar.f265807a.execute(new C95000r(wVar, yVar, e, bxVar2));
        iVar.f265605e.set(true);
        iVar.f265606f.set(true);
        m156770k(new C94955p(this));
    }

    /* renamed from: k */
    private final void m156770k(C22870f fVar) {
        C90875ai.m148465b(C94958s.f265625a, this.f265630c.mo85235a(new C94957r(this, fVar)), this.f265629b, "v2-audio-decoder").mo85223a(C94959t.f265626a);
    }

    /* renamed from: a */
    public final void mo88862a() {
        if (this.f265638k != null) {
            this.f265638k.mo90183d();
            this.f265638k = null;
        }
    }

    /* renamed from: b */
    public final void mo88863b(C48098ce ceVar) {
        m156770k(new C94954o(this, ceVar));
    }

    /* renamed from: c */
    public final synchronized void mo88864c(byte[] bArr) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C90599p pVar;
        Object obj6;
        try {
            C66607ce ceVar = (C66607ce) C62942bv.parseFrom((C62942bv) C66607ce.f181191f, bArr, C62921ba.m95368a());
            if ((ceVar.f181193a & 8) != 0) {
                C59104x b = f265628a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
                ((C59052c) ((C59052c) b).mo56372aa(17681)).mo56386p("Received end of request, expecting initial S3Request");
                return;
            }
            C62940bt r3 = C62942bv.checkIsLite(C66678l.f181385g);
            ceVar.mo58887l(r3);
            if (ceVar.f169962ag.mo58857o(r3.f169971d)) {
                C58976aa aaVar = C58975e.f156826a;
                C62940bt r32 = C62942bv.checkIsLite(C66678l.f181385g);
                ceVar.mo58887l(r32);
                Object l = ceVar.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                if ((((C66678l) obj).f181388a & 2) != 0) {
                    C62940bt r33 = C62942bv.checkIsLite(C66678l.f181385g);
                    ceVar.mo58887l(r33);
                    Object l2 = ceVar.f169962ag.mo58854l(r33.f169971d);
                    if (l2 == null) {
                        obj6 = r33.f169969b;
                    } else {
                        obj6 = r33.mo58889c(l2);
                    }
                    this.f265640m = (int) ((C66678l) obj6).f181390c;
                }
                C62940bt r34 = C62942bv.checkIsLite(C67244v.f182772t);
                ceVar.mo58887l(r34);
                if (ceVar.f169962ag.mo58857o(r34.f169971d)) {
                    C62940bt r35 = C62942bv.checkIsLite(C67244v.f182772t);
                    ceVar.mo58887l(r35);
                    Object l3 = ceVar.f169962ag.mo58854l(r35.f169971d);
                    if (l3 == null) {
                        obj4 = r35.f169969b;
                    } else {
                        obj4 = r35.mo58889c(l3);
                    }
                    if ((((C67244v) obj4).f182774a & 1073741824) != 0) {
                        C62940bt r36 = C62942bv.checkIsLite(C67244v.f182772t);
                        ceVar.mo58887l(r36);
                        Object l4 = ceVar.f169962ag.mo58854l(r36.f169971d);
                        if (l4 == null) {
                            obj5 = r36.f169969b;
                        } else {
                            obj5 = r36.mo58889c(l4);
                        }
                        C67231i iVar = ((C67244v) obj5).f182788o;
                        if (iVar == null) {
                            iVar = C67231i.f182719l;
                        }
                        C90599p F = HotwordResult.m147742F();
                        ((C90578a) F).f253211a = iVar.f182722b;
                        F.mo84731t(iVar.f182723c);
                        F.mo84734w(iVar.f182724d);
                        F.mo84720i((long) iVar.f182725e);
                        this.f265639l = F;
                        if (iVar.f182726f.size() > 0 && (pVar = this.f265639l) != null) {
                            ((C90578a) pVar).f253215e = (String) iVar.f182726f.get(0);
                        }
                    }
                }
                C62940bt r37 = C62942bv.checkIsLite(C66678l.f181386h);
                ceVar.mo58887l(r37);
                if (ceVar.f169962ag.mo58857o(r37.f169971d)) {
                    this.f265645r = 2;
                    C62940bt r38 = C62942bv.checkIsLite(C66678l.f181386h);
                    ceVar.mo58887l(r38);
                    Object l5 = ceVar.f169962ag.mo58854l(r38.f169971d);
                    if (l5 == null) {
                        obj2 = r38.f169969b;
                    } else {
                        obj2 = r38.mo58889c(l5);
                    }
                    if ((((C66678l) obj2).f181388a & 2) != 0) {
                        C62940bt r39 = C62942bv.checkIsLite(C66678l.f181386h);
                        ceVar.mo58887l(r39);
                        Object l6 = ceVar.f169962ag.mo58854l(r39.f169971d);
                        if (l6 == null) {
                            obj3 = r39.f169969b;
                        } else {
                            obj3 = r39.mo58889c(l6);
                        }
                        this.f265641n = (int) ((C66678l) obj3).f181390c;
                        return;
                    }
                    return;
                }
                this.f265631d.mo88858c(this.f265632e, true, this.f265648u.mo88791e(), this.f265650w, this.f265640m, this.f265649v, true, C58836b.f156633a, this.f265646s);
                this.f265645r = 3;
                return;
            }
            C59104x b2 = f265628a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) b2).mo56372aa(17676)).mo56389s("Invalid initial S3Request %s", Base64.encodeToString(bArr, 0));
            mo88863b(C48098ce.INVALID_S3_REQUEST);
            this.f265645r = 5;
        } catch (C62974ct e) {
            C59104x b3 = f265628a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) ((C59052c) b3).mo56382g(e)).mo56372aa(17677)).mo56389s("Initial S3Request parsing error %s", Base64.encodeToString(bArr, 0));
            mo88863b(C48098ce.INVALID_S3_REQUEST);
            this.f265645r = 5;
        }
    }

    /* renamed from: d */
    public final synchronized void mo88865d(byte[] bArr) {
        Object obj;
        try {
            C66607ce ceVar = (C66607ce) C62942bv.parseFrom((C62942bv) C66607ce.f181191f, bArr, C62921ba.m95368a());
            if ((ceVar.f181193a & 8) != 0) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            C62940bt r2 = C62942bv.checkIsLite(C66676j.f181380e);
            ceVar.mo58887l(r2);
            if (ceVar.f169962ag.mo58857o(r2.f169971d)) {
                C58976aa aaVar2 = C58975e.f156826a;
                C90599p pVar = this.f265639l;
                if (pVar == null) {
                    pVar = HotwordResult.m147742F();
                    this.f265639l = pVar;
                }
                int i = this.f265641n;
                if (i > 0) {
                    pVar.mo84728q(i);
                }
                C62940bt r22 = C62942bv.checkIsLite(C66676j.f181380e);
                ceVar.mo58887l(r22);
                Object l = ceVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                byte[] N = ((C66676j) obj).f181383b.mo59174N();
                ((C90578a) pVar).f253212b = C58833ax.m90834k(N);
                this.f265631d.mo88858c(this.f265632e, true, this.f265648u.mo88791e(), this.f265650w, this.f265640m, this.f265649v, true, C58833ax.m90834k(pVar.mo84712a()), this.f265646s);
                this.f265645r = 3;
                m156770k(new C94953n(this, N));
                return;
            }
            C62940bt r23 = C62942bv.checkIsLite(C66676j.f181379d);
            ceVar.mo58887l(r23);
            if (ceVar.f169962ag.mo58857o(r23.f169971d)) {
                C59104x d = f265628a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "VoiceInputListener");
                ((C59052c) ((C59052c) d).mo56372aa(17684)).mo56386p("Expected preamble audio but didn't receive it");
                this.f265631d.mo88858c(this.f265632e, true, this.f265648u.mo88791e(), this.f265650w, this.f265640m, this.f265649v, true, C58836b.f156633a, this.f265646s);
                this.f265645r = 3;
                mo88866e(bArr);
                return;
            }
            C59104x d2 = f265628a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) d2).mo56372aa(17682)).mo56386p("Received preamble audio data but no audio data");
            mo88863b(C48098ce.INVALID_S3_REQUEST);
            this.f265645r = 5;
        } catch (C62974ct e) {
            C59104x b = f265628a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(17683)).mo56386p("Preamble audio request parsing error");
            mo88863b(C48098ce.INVALID_S3_REQUEST);
            this.f265645r = 5;
        }
    }

    /* renamed from: e */
    public final void mo88866e(byte[] bArr) {
        C59104x b = f265628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
        ((C59052c) ((C59052c) b).mo56372aa(17702)).mo56386p("onAudioData");
        this.f265644q = this.f265647t.mo26870b();
        m156770k(new C94950k(this, bArr));
    }

    /* renamed from: f */
    public final void mo88867f() {
        C59104x b = f265628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
        ((C59052c) ((C59052c) b).mo56372aa(17703)).mo56386p("onCancelQuery");
        m156770k(new C94949j(this));
    }

    /* renamed from: g */
    public final void mo88868g(C94928z zVar, C124548d dVar, C48090bx bxVar, boolean z) {
        boolean z2;
        boolean z3;
        C59071e eVar = f265628a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
        ((C59052c) ((C59052c) b).mo56372aa(17704)).mo56387q("onStartStreaming: samplingRate: %d", zVar.mo88789c());
        this.f265636i = false;
        if (zVar.mo88787a() == 4) {
            this.f265637j = 4;
            m156769j(zVar, dVar, bxVar, z);
        } else if (zVar.mo88787a() != 1 && zVar.mo88787a() != 2 && zVar.mo88787a() != 3) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) c).mo56372aa(17709)).mo56386p("Unsupported audio format");
            mo88863b(C48098ce.UNSUPPORTED_CONFIG);
        } else if (zVar.mo88789c() < 8000 || zVar.mo88789c() > 64000) {
            C59104x c2 = eVar.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) c2).mo56372aa(17705)).mo56386p("Bad sample rate");
            mo88863b(C48098ce.UNSUPPORTED_CONFIG);
        } else if (zVar.mo88788b() <= 0 || zVar.mo88788b() > 4) {
            C59104x c3 = eVar.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) c3).mo56372aa(17706)).mo56386p("Bad channel count");
            mo88863b(C48098ce.UNSUPPORTED_CONFIG);
        } else {
            int f = zVar.mo88793f();
            int i = f - 2;
            if (f != 0) {
                if (i == 1) {
                    z2 = false;
                } else if (i != 2) {
                    C59104x c4 = eVar.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "VoiceInputListener");
                    ((C59052c) ((C59052c) c4).mo56372aa(17707)).mo56386p("Unsupported response method");
                    mo88863b(C48098ce.UNSUPPORTED_CONFIG);
                    return;
                } else {
                    z2 = true;
                }
                int g = zVar.mo88794g();
                int i2 = g - 2;
                if (g != 0) {
                    if (i2 == 1) {
                        z3 = true;
                    } else if (i2 != 2) {
                        C59104x c5 = eVar.mo56225c();
                        c5.mo56378ag(C58975e.f156826a, "VoiceInputListener");
                        ((C59052c) ((C59052c) c5).mo56372aa(17708)).mo56386p("Unsupported query mode");
                        mo88863b(C48098ce.UNSUPPORTED_CONFIG);
                        return;
                    } else {
                        z3 = false;
                    }
                    m156770k(new C94951l(this, zVar, z2, z3, dVar, bxVar));
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo88869h() {
        C59104x b = f265628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputListener");
        ((C59052c) ((C59052c) b).mo56372aa(17710)).mo56386p("onStopStreaming");
        m156770k(new C94956q(this));
    }

    /* renamed from: i */
    public final void mo88870i() {
        if (this.f265637j != null && this.f265637j.intValue() == 1) {
            this.f265635h.mo89797b();
        }
        this.f265637j = null;
    }
}
