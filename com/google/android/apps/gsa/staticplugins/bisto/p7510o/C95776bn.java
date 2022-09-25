package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89620ar;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7527c.C96053d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142384di;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bn */
/* compiled from: PG */
public final class C95776bn extends C95724ao {

    /* renamed from: l */
    private static final C59071e f268186l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bn");

    /* renamed from: m */
    private final C89620ar f268187m;

    public C95776bn(Context context, C22871g gVar, C22871g gVar2, C89496ch chVar, C90926bw bwVar, C95293ae aeVar, C95850a aVar, C89656k kVar, C95355bf bfVar, C96053d dVar, C95357bh bhVar, C89620ar arVar) {
        super(context, gVar, gVar2, chVar, bwVar, aeVar, aVar, false, kVar, bfVar, dVar, bhVar);
        this.f268187m = arVar;
    }

    /* renamed from: H */
    public final boolean mo89686H() {
        return false;
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        if (!mo89685G()) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        } else if (!this.f268187m.mo83485a()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C58836b.f156633a;
        } else {
            C95723an h = mo89690h();
            if (h != null) {
                return C58833ax.m90834k(new C95774bl(this, h.f267981c.get(), h));
            }
            C59104x c = f268186l.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15340)).mo56386p("voice data received when there is no active session");
            return C58836b.f156633a;
        }
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        C59104x c = f268186l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15345)).mo56386p("unexpected handleVoiceData()");
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        int i = C95873a.f268446a;
        if (mo89685G()) {
            C95723an h = mo89690h();
            if (h == null) {
                C59104x c = f268186l.mo56225c();
                c.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
                ((C59052c) ((C59052c) c).mo56372aa(15352)).mo56386p("voice stop received when there is no active session");
                return;
            }
            if (h.f267981c.get()) {
                mo89697w(new C95773bk(this));
            }
            this.f267993k.set((Object) null);
            mo89682C(0);
        }
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        int i = this.f267992j;
        if (i != 2 && i != 1) {
            mo89710P(aVar, playbackStatus);
            mo88999f();
        }
    }

    /* renamed from: N */
    public final void mo89708N() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: O */
    public final void mo89709O() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: P */
    public final void mo89710P(C95288a aVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C22872h.m42742b(C0826b.class);
        if (!mo89685G() || this.f267992j == 2) {
            return;
        }
        if (!this.f268187m.mo83485a()) {
            C59104x b = f268186l.mo56224b();
            b.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15357)).mo56386p("ignore voiceInputStart(), mic disabled");
            return;
        }
        C95723an h = mo89690h();
        if (h != null) {
            h.mo89678a();
            mo89697w(new C95775bm(this, h));
        }
        mo89682C(2);
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        mo89682C(0);
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C22872h.m42742b(C0826b.class);
        int i2 = C95873a.f268446a;
        if (!this.f268187m.mo83485a()) {
            C59104x b = f268186l.mo56224b();
            b.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15350)).mo56386p("ignore handleVoiceStart(), mic disabled");
        } else if (dhVar.f386366k) {
            mo88997c();
        } else if (mo89685G()) {
            if (mo89690h() != null) {
                int i3 = this.f267992j;
                C22872h.m42742b(C0826b.class);
                C142384di diVar = (C142384di) C142386dk.f386370c.createBuilder();
                diVar.copyOnWrite();
                C142386dk dkVar = (C142386dk) diVar.instance;
                dkVar.f386373b = 2;
                dkVar.f386372a |= 1;
                mo89706L((C142386dk) diVar.build());
                mo89682C(i3);
            }
            C95723an i4 = mo89691i();
            if (this.f267992j == 2) {
                i4.mo89678a();
                mo89697w(new C95772bj(this));
                return;
            }
            mo89682C(1);
        }
    }

    /* renamed from: g */
    public final void mo89713g() {
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
    }

    /* renamed from: j */
    public final void mo89714j(C142379dd ddVar) {
    }

    /* renamed from: k */
    public final void mo89715k(C142381df dfVar) {
        C59104x c = f268186l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RmtMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15346)).mo56387q("Dropped some voice data, bytes dropped: %d", dfVar.f386351a);
    }
}
