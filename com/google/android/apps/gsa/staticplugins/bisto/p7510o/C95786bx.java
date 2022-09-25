package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89640k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7511a.C95709a;
import com.google.android.apps.gsa.staticplugins.bisto.sbcdecoder.JniSbcDecoder;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bx */
/* compiled from: PG */
public final class C95786bx implements C95803ci {

    /* renamed from: a */
    public static final C59071e f268207a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bx");

    /* renamed from: b */
    public final C22871g f268208b;

    /* renamed from: c */
    public final JniSbcDecoder f268209c;

    /* renamed from: d */
    public boolean f268210d = false;

    /* renamed from: e */
    public volatile ByteArrayOutputStream f268211e;

    /* renamed from: f */
    public final C89640k f268212f;

    /* renamed from: g */
    public final C95709a f268213g;

    /* renamed from: h */
    private final C90926bw f268214h;

    /* renamed from: i */
    private final C95357bh f268215i;

    /* renamed from: j */
    private final C95355bf f268216j;

    /* renamed from: k */
    private final C95803ci f268217k;

    public C95786bx(C22871g gVar, JniSbcDecoder jniSbcDecoder, C90926bw bwVar, C95709a aVar, C95357bh bhVar, C95355bf bfVar, C89640k kVar, C95803ci ciVar) {
        this.f268208b = gVar;
        this.f268209c = jniSbcDecoder;
        this.f268214h = bwVar;
        this.f268213g = aVar;
        this.f268215i = bhVar;
        this.f268216j = bfVar;
        this.f268217k = ciVar;
        this.f268212f = kVar;
    }

    /* renamed from: b */
    private final void m158722b(Runnable runnable) {
        C90875ai.m148465b(C95783bu.f268203a, this.f268214h.mo85235a(new C95782bt(this, runnable)), this.f268208b, "audio-decoder").mo85223a(C95784bv.f268204a);
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        C59104x c = f268207a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15370)).mo56386p("prepareVoiceData called on the decoder handler");
        return C58836b.f156633a;
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        boolean z;
        if (this.f268211e == null) {
            C59104x c = f268207a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15374)).mo56386p("Received VoiceData without a valid VoiceStart.");
            this.f268215i.mo89293f(this.f268216j);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo89688a();
        dbVar.f386342a.mo59031d();
        C58833ax J = this.f268217k.mo89704J();
        if (!J.mo56113h()) {
            C59104x b = f268207a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15373)).mo56386p("Ignore VoiceData.");
            return;
        }
        synchronized (this) {
            z = false;
            try {
                if (this.f268211e.size() == 0) {
                    z = true;
                }
                dbVar.f386342a.mo59046r(this.f268211e);
                C95709a aVar = this.f268213g;
                dbVar.f386342a.mo59174N();
                aVar.mo89670c();
            } catch (IOException e) {
                C59104x d = f268207a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(15372)).mo56386p("What?");
                int i = C90755l.f253831a;
            }
        }
        if (z) {
            m158722b(new C95785bw(this, J));
        }
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        this.f268217k.mo89706L(dkVar);
        m158722b(new C95780br(this));
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        this.f268217k.mo89707M(aVar, playbackStatus);
    }

    /* renamed from: N */
    public final void mo89708N() {
        this.f268217k.mo89708N();
    }

    /* renamed from: O */
    public final void mo89709O() {
        this.f268217k.mo89709O();
    }

    /* renamed from: P */
    public final void mo89710P(C95288a aVar, PlaybackStatus playbackStatus) {
        this.f268217k.mo89710P(aVar, playbackStatus);
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        this.f268217k.mo89711Q();
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        synchronized (this) {
            if (!(this.f268211e == null || this.f268211e.size() == 0)) {
                C59104x d = f268207a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
                ((C59052c) ((C59052c) d).mo56372aa(15375)).mo56386p("voiceStart with non-empty VoiceData buffer");
            }
            this.f268211e = new ByteArrayOutputStream((int) (((float) dhVar.f386360e) * 0.1f));
        }
        m158722b(new C95779bq(this, dhVar));
        this.f268217k.mo89712R(dhVar, playbackStatus);
    }

    /* renamed from: a */
    public final int mo89688a() {
        return this.f268217k.mo89688a();
    }

    /* renamed from: c */
    public final void mo88997c() {
        this.f268217k.mo88997c();
    }

    /* renamed from: d */
    public final void mo88998d() {
        this.f268217k.mo88998d();
    }

    /* renamed from: f */
    public final void mo88999f() {
        this.f268217k.mo88999f();
    }

    /* renamed from: g */
    public final void mo89713g() {
        this.f268217k.mo89713g();
    }

    /* renamed from: j */
    public final void mo89714j(C142379dd ddVar) {
        this.f268217k.mo89714j(ddVar);
    }

    /* renamed from: k */
    public final void mo89715k(C142381df dfVar) {
        this.f268217k.mo89715k(dfVar);
    }

    /* renamed from: q */
    public final boolean mo89694q(C142359ck ckVar) {
        return this.f268217k.mo89694q(ckVar);
    }

    /* renamed from: r */
    public final boolean mo89695r() {
        return this.f268217k.mo89695r();
    }

    /* renamed from: t */
    public final boolean mo89696t() {
        return this.f268217k.mo89696t();
    }
}
