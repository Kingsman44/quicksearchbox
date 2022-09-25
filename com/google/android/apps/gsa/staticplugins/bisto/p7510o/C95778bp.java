package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95064aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95127t;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f.C124606a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bp */
/* compiled from: PG */
public final class C95778bp extends C95814m {

    /* renamed from: f */
    private static final C59071e f268190f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bp");

    /* renamed from: e */
    public final C95064aa f268191e;

    /* renamed from: g */
    private final C21370a f268192g;

    /* renamed from: h */
    private final C95355bf f268193h;

    /* renamed from: i */
    private final C95357bh f268194i;

    /* renamed from: j */
    private volatile boolean f268195j;

    /* renamed from: k */
    private volatile C95288a f268196k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95778bp(Context context, C95064aa aaVar, C22871g gVar, C22871g gVar2, C21370a aVar, C90926bw bwVar, C96628d dVar, C95239o oVar, C89656k kVar, C124606a aVar2, C95355bf bfVar, C95357bh bhVar) {
        super(context, aaVar, oVar, gVar, gVar2, bwVar, dVar, kVar, aVar2);
        this.f268192g = aVar;
        this.f268191e = aaVar;
        this.f268193h = bfVar;
        this.f268194i = bhVar;
    }

    /* renamed from: x */
    private final void m158707x(PlaybackStatus playbackStatus) {
        if (this.f268191e.mo88995k() || this.f268195j) {
            if (this.f268275d == 1 || mo89718u()) {
                mo89766w(playbackStatus);
            }
        } else if (this.f268275d == 1) {
            mo89766w(playbackStatus);
        } else if (this.f268275d == 0) {
            mo89718u();
        }
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        return C58833ax.m90834k(new C95777bo(this, mo89782b()));
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        C59104x c = f268190f.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RemoteMicVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15360)).mo56386p("unexpected handleVoiceData()");
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        int i = C95873a.f268446a;
        mo89788p();
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        this.f268195j = true;
        this.f268196k = aVar;
        this.f268194i.mo89292e(this.f268193h);
        mo88999f();
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
        int i = this.f268275d;
        if (this.f268275d != 2) {
            m158707x(playbackStatus);
        }
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        if (this.f268275d == 1) {
            C59104x d = f268190f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RemoteMicVoiceInHandler");
            ((C59052c) ((C59052c) d).mo56372aa(15369)).mo56386p("Receive STOP_INPUT_ACTION during CACHE!");
            mo89787n();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        C22872h.m42742b(C0826b.class);
        int i2 = C95873a.f268446a;
        if (this.f268275d != 2) {
            m158707x(playbackStatus);
        }
    }

    /* renamed from: c */
    public final void mo88997c() {
        this.f268194i.mo89293f(this.f268193h);
    }

    /* renamed from: d */
    public final void mo88998d() {
        this.f268194i.mo89294g(this.f268193h);
    }

    /* renamed from: f */
    public final void mo88999f() {
        this.f268194i.mo89295h(this.f268193h);
    }

    /* renamed from: w */
    public final void mo89766w(PlaybackStatus playbackStatus) {
        Uri b = mo89782b();
        if (b == null) {
            C59104x c = f268190f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RemoteMicVoiceInHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15365)).mo56386p("Uri is not initialized");
            return;
        }
        mo89790v(new C95455a(b, this.f268195j, this.f268192g.mo26870b()), C95127t.f266137c, playbackStatus, (C95832d) null);
        this.f268195j = false;
        this.f268196k = null;
    }
}
