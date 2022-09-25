package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.content.Intent;
import android.databinding.C0118a;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.os.Handler;
import com.google.android.apps.gsa.binaries.satin.app.C74025fh;
import com.google.android.apps.gsa.binaries.satin.app.C74026fj;
import com.google.android.apps.gsa.binaries.satin.app.C74029fo;
import com.google.android.apps.gsa.binaries.satin.app.C74262rs;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95631e;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95636f;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95639g;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95655d;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95353bd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95711ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95766bd;
import com.google.android.apps.gsa.staticplugins.bisto.p7517s.C95863e;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96056f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.c */
/* compiled from: PG */
public abstract class C96025c implements C96021bq, C96023bs, C95353bd, C96024bt {

    /* renamed from: c */
    private static final C59071e f268856c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.c");

    /* renamed from: a */
    public boolean f268857a;

    /* renamed from: b */
    public C96026d f268858b;

    /* renamed from: d */
    private final C95355bf f268859d;

    /* renamed from: e */
    private final String f268860e;

    /* renamed from: f */
    private final C96022br f268861f;

    /* renamed from: g */
    private final C96056f f268862g;

    /* renamed from: h */
    private final C96027e f268863h;

    /* renamed from: i */
    private final Map f268864i;

    /* renamed from: j */
    private Consumer f268865j;

    /* renamed from: k */
    private final C96026d f268866k;

    public C96025c(C96056f fVar, C96022br brVar, C96027e eVar, C95355bf bfVar, C96023bs bsVar, Map map, C96026d dVar) {
        C59104x b = f268856c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C58975e.f156826a, mo89866o());
        ((C59052c) cVar.mo56372aa(15566)).mo56389s("%s: Created", bfVar.mo89270k());
        this.f268866k = dVar;
        this.f268861f = brVar;
        this.f268862g = fVar;
        this.f268863h = eVar;
        this.f268859d = bfVar;
        this.f268864i = map;
        this.f268858b = dVar;
        this.f268860e = bfVar.mo89270k();
        bsVar.mo89841k(this);
    }

    /* renamed from: a */
    public final void mo89831a() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f268863h.mo89898a(this);
        }
    }

    /* renamed from: b */
    public final void mo89832b(C95711ab abVar) {
        C95863e eVar;
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C96027e eVar2 = this.f268863h;
        if (equals(eVar2.f268877f) && (eVar = eVar2.f268878g) != null) {
            eVar.mo69404a().mo89673b(abVar);
        }
    }

    /* renamed from: c */
    public final void mo89833c() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C96027e eVar = this.f268863h;
        if (!equals(eVar.f268877f)) {
            C59104x c = C96027e.f268872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15605)).mo56386p("createBistoSdkComponent requested outside of interaction mode");
            return;
        }
        C95863e eVar2 = eVar.f268878g;
        if (eVar2 == null) {
            C74025fh fhVar = eVar.f268882k;
            fhVar.mo69403b(mo89891n());
            eVar2 = fhVar.mo69402a();
            eVar.f268878g = eVar2;
            eVar2.mo69405b().mo89683D();
        }
        if (eVar.f268883l == null) {
            C74026fj fjVar = (C74026fj) eVar2;
            eVar.f268883l = new C74029fo(fjVar.f206074a, fjVar.f206075b, fjVar.f206076c);
            C95766bd bdVar = (C95766bd) eVar.f268883l.f206133g.mo17428b();
            C59104x b = C95766bd.f268135a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15317)).mo56386p("registered");
        }
    }

    public final void close() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x b = f268856c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C58975e.f156826a, mo89866o());
        ((C59052c) cVar.mo56372aa(15569)).mo56389s("%s: Close", this.f268860e);
        this.f268857a = true;
        this.f268862g.mo89919a(this);
        this.f268863h.mo89898a(this);
        this.f268863h.mo89903e(false, this);
        this.f268859d.mo89276q(this);
    }

    /* renamed from: d */
    public final void mo89834d() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C96027e eVar = this.f268863h;
        if (!equals(eVar.f268877f)) {
            C59104x c = C96027e.f268872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15607)).mo56386p("createInteractingComponent requested outside of interaction mode");
            return;
        }
        C95639g gVar = eVar.f268880i;
        if (gVar == null) {
            C59104x c2 = C96027e.f268872a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c2).mo56372aa(15606)).mo56386p("createInteractingComponent when notifications not requested!");
            return;
        }
        C95863e eVar2 = eVar.f268878g;
        if (eVar2 == null) {
            C74025fh fhVar = eVar.f268882k;
            fhVar.mo69403b(mo89891n());
            eVar2 = fhVar.mo69402a();
            eVar.f268878g = eVar2;
            eVar2.mo69405b().mo89683D();
        }
        if (eVar.f268879h == null) {
            C74026fj fjVar = (C74026fj) eVar2;
            C74262rs rsVar = new C74262rs(fjVar.f206074a, fjVar.f206075b, fjVar.f206076c);
            eVar.f268879h = rsVar;
            C95655d dVar = (C95655d) rsVar.f207948A.mo17428b();
            C95293ae aeVar = (C95293ae) rsVar.f207952c.f206080g.mo17428b();
            C68214a a = C68219e.m98518a(rsVar.f207952c.f206098y);
            C68214a a2 = C68219e.m98518a(rsVar.f207952c.f206099z);
            C95188c cVar = (C95188c) rsVar.f207951b.f197825p.mo17428b();
            C95239o oVar = (C95239o) rsVar.f207952c.f206092s.mo17428b();
            C95214aa aaVar2 = (C95214aa) rsVar.f207952c.f206093t.mo17428b();
            C95355bf n = mo89891n();
            C58976aa aaVar3 = C58975e.f156826a;
            C95636f fVar = (C95636f) gVar;
            C60870cx cxVar = fVar.f267674w;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            fVar.f267674w = fVar.f267672u.mo28209i(((C89492cd) fVar.f267660i.mo27525b()).mo83408n(n.mo89270k()), "bisto-enter-on-head", new C95631e(fVar, dVar, aeVar, a, a2, cVar, oVar, aaVar2, n));
        }
    }

    /* renamed from: e */
    public final void mo89835e() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f268863h.mo89899b(this);
        }
    }

    /* renamed from: f */
    public final void mo89836f() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268857a) {
            this.f268863h.mo89900c(this);
        }
    }

    /* renamed from: g */
    public final void mo89837g() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f268863h.mo89902d(this);
        }
    }

    /* renamed from: h */
    public final void mo89838h(String str, String str2, Intent intent) {
        if (this.f268857a) {
            C59104x c = f268856c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
            C59052c cVar = (C59052c) c;
            cVar.mo56378ag(C58975e.f156826a, mo89866o());
            ((C59052c) cVar.mo56372aa(15583)).mo56354G("%s: moveToState %s when destroyed", this.f268860e, str2);
        } else if (!this.f268858b.f268868a.equals(str)) {
            C59104x c2 = f268856c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
            C59052c cVar2 = (C59052c) c2;
            cVar2.mo56378ag(C58975e.f156826a, mo89866o());
            ((C59052c) cVar2.mo56372aa(15582)).mo56360M("%s: Requested transition from %s to %s; current state: %s.", this.f268860e, str, str2, this.f268858b);
        } else {
            C59071e eVar = f268856c;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
            C59052c cVar3 = (C59052c) b;
            cVar3.mo56378ag(C58975e.f156826a, mo89866o());
            ((C59052c) cVar3.mo56372aa(15580)).mo56359L("%s: Moving from %s to %s.", this.f268860e, str, str2);
            C96026d dVar = (C96026d) this.f268864i.get(str2);
            if (dVar == null) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
                C59052c cVar4 = (C59052c) d;
                cVar4.mo56378ag(C58975e.f156826a, mo89866o());
                ((C59052c) cVar4.mo56372aa(15581)).mo56389s("No state found for %s", str2);
                int i = C90755l.f253831a;
                return;
            }
            this.f268858b.mo89846i();
            this.f268858b = dVar;
            dVar.mo89845g();
            Consumer consumer = this.f268865j;
            if (consumer != null) {
                consumer.accept(this.f268858b);
            }
            if (intent != null) {
                this.f268858b.mo89848l(intent);
            }
            C96026d dVar2 = this.f268858b;
            if (dVar2.f268868a.equals(this.f268866k.f268868a)) {
                this.f268861f.mo89859b(this.f268860e);
            }
        }
    }

    /* renamed from: i */
    public final void mo89839i(C95711ab abVar) {
        C95863e eVar;
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C96027e eVar2 = this.f268863h;
        if (equals(eVar2.f268877f) && (eVar = eVar2.f268878g) != null) {
            eVar.mo69404a().mo89674e(abVar);
        }
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268857a) {
            this.f268865j = new C95978b(routeInfo, z, z2, z3);
            this.f268858b.mo89849io(routeInfo, z, z2, z3);
        }
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (str.equals(this.f268860e)) {
            this.f268858b.mo89286ip(str, z);
        }
    }

    /* renamed from: j */
    public final void mo89840j(boolean z) {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f268863h.mo89903e(z, this);
        }
    }

    /* renamed from: k */
    public final void mo89841k(C96023bs bsVar) {
    }

    /* renamed from: l */
    public void mo89842l() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: m */
    public final boolean mo89843m() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C96027e eVar = this.f268863h;
        C58976aa aaVar2 = C58975e.f156826a;
        if (eVar.f268881j) {
            return false;
        }
        if (eVar.f268880i == null) {
            C59104x c = C96027e.f268872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15623)).mo56386p("requestUserInteractionMode when notifications not requested!");
            return false;
        }
        C96024bt btVar = (C96024bt) eVar.f268876e.put(this, this);
        if (!(btVar == null || btVar == this)) {
            C59104x c2 = C96027e.f268872a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c2).mo56372aa(15622)).mo56389s("Same lifecycle manager (%s) registered different callback", this);
        }
        if (!equals(eVar.f268877f)) {
            if (eVar.f268877f != null) {
                C59104x b = C96027e.f268872a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
                ((C59052c) ((C59052c) b).mo56372aa(15620)).mo56389s("requestUserInteractionMode: another manager (%s) in interaction mode", this);
                return false;
            }
            eVar.f268877f = this;
            C124548d b2 = ((C89492cd) eVar.f268875d.mo27525b()).mo83401b(mo89891n().mo89270k());
            if (b2 != null && b2.mo106497ak()) {
                boolean b3 = eVar.f268874c.mo88940b(b2);
                C59104x b4 = C96027e.f268872a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
                ((C59052c) ((C59052c) b4).mo56372aa(15619)).mo56389s("#setEnableHotwordOnDevice: %b", Boolean.valueOf(b3));
                eVar.f268873b.mo89296i(mo89891n(), b3);
            }
            int i = C95873a.f268446a;
        }
        return true;
    }

    /* renamed from: n */
    public final C95355bf mo89891n() {
        return this.f268859d;
    }

    /* renamed from: o */
    public abstract String mo89866o();

    /* renamed from: p */
    public final void mo89892p(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268857a) {
            this.f268861f.mo89859b(this.f268860e);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            C59104x c = f268856c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BaseDeviceLifecycleMngr");
            C0118a.m109q(c, "Null action", 15578, mo89866o(), C58975e.f156826a);
            return;
        }
        mo89867q(intent, action);
        C96026d dVar = this.f268858b;
        if (dVar.f268868a.equals(this.f268866k.f268868a)) {
            this.f268861f.mo89859b(this.f268860e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo89867q(Intent intent, String str);

    /* renamed from: r */
    public final void mo89894r() {
        C96056f fVar = this.f268862g;
        boolean isEmpty = fVar.f268942f.isEmpty();
        fVar.f268942f.add(this);
        if (isEmpty) {
            fVar.f268941e.mo83360B(new C58759qy(6), fVar);
            MediaRouter mediaRouter = fVar.f268944h;
            if (mediaRouter != null) {
                mediaRouter.addCallback(1, fVar.f268939c);
            }
            AudioManager audioManager = fVar.f268945i;
            if (audioManager != null) {
                C96049c cVar = fVar.f268943g;
                cVar.getClass();
                audioManager.registerAudioDeviceCallback(cVar, (Handler) null);
            }
            fVar.mo89920b();
        }
        this.f268859d.mo89274o(this);
    }

    /* renamed from: s */
    public final void mo89850s() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f268858b.mo89850s();
        }
    }

    /* renamed from: t */
    public final void mo89895t() {
        if (this.f268857a) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.f268858b.f268868a.equals("ClassicIdleState")) {
            mo89838h(this.f268858b.f268868a, "ConnectingLCState", (Intent) null);
        } else if (this.f268858b.f268868a.equals("WiredIdleState")) {
            mo89838h(this.f268858b.f268868a, "WiredConnectingState", (Intent) null);
        }
    }
}
