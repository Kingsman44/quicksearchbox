package com.google.android.apps.gsa.staticplugins.bisto.p7494l;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124615ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import dagger.C68214a;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.l.c */
/* compiled from: PG */
public final class C95482c implements AutoCloseable, C89495cg {

    /* renamed from: f */
    private static final C59071e f267189f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.l.c");

    /* renamed from: a */
    public final C89492cd f267190a;

    /* renamed from: b */
    public final C95346ax f267191b;

    /* renamed from: c */
    public final C95481b f267192c;

    /* renamed from: d */
    public boolean f267193d;

    /* renamed from: e */
    public boolean f267194e;

    /* renamed from: g */
    private final C95026a f267195g;

    /* renamed from: h */
    private final C89606ad f267196h;

    /* renamed from: i */
    private final C60950i f267197i;

    /* renamed from: j */
    private C124548d f267198j;

    public C95482c(C68214a aVar, C95026a aVar2, C95346ax axVar, C95481b bVar, C89606ad adVar, C60950i iVar) {
        C89492cd cdVar = (C89492cd) aVar.mo27525b();
        this.f267190a = cdVar;
        this.f267195g = aVar2;
        this.f267191b = axVar;
        this.f267192c = bVar;
        this.f267196h = adVar;
        this.f267197i = iVar;
        this.f267198j = cdVar.mo83401b(axVar.mo89270k());
    }

    /* renamed from: b */
    private final void m157934b() {
        if (this.f267196h.mo83457c() == null) {
            C59104x b = f267189f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
            ((C59052c) ((C59052c) b).mo56372aa(15100)).mo56386p("locale has not been set, skipping consent revocation");
            return;
        }
        C59104x b2 = f267189f.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(15099)).mo56386p("Hotword consent revoked due to implicit disallow");
        this.f267190a.mo83378T(this.f267191b.mo89270k(), false);
    }

    /* renamed from: c */
    private final void m157935c(C124548d dVar, C124615ah ahVar) {
        if (this.f267194e) {
            C59104x b = f267189f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
            ((C59052c) ((C59052c) b).mo56372aa(15104)).mo56386p("Notification skipped, user was notified by OOBE");
            return;
        }
        C124615ah n = dVar.mo106516n();
        int i = 0;
        if (!C124615ah.NONE_SENT.equals(ahVar) && n.equals(ahVar)) {
            i = dVar.mo106503c() != Integer.MAX_VALUE ? dVar.mo106503c() + 1 : dVar.mo106503c();
        }
        if (i >= 3) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (i <= 0 || !this.f267197i.mo57444a().isBefore(dVar.mo106467H().plus(Duration.ofDays(1)))) {
            int ordinal = ahVar.ordinal();
            if (ordinal == 0) {
                this.f267192c.mo89384c();
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            C59104x d = f267189f.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
                            ((C59052c) ((C59052c) d).mo56372aa(15101)).mo56386p("This should not be called.");
                            int i2 = C90755l.f253831a;
                        }
                    }
                }
                this.f267192c.mo89382a();
            } else {
                this.f267192c.mo89383b();
            }
            C58976aa aaVar2 = C58975e.f156826a;
            this.f267190a.mo83390af(dVar.mo106475P(), ahVar);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* renamed from: a */
    public final void mo89386a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f267193d) {
            C124548d dVar = this.f267198j;
            if (dVar == null) {
                C59104x c = f267189f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
                ((C59052c) ((C59052c) c).mo56372aa(15096)).mo56389s("null deviceInfo for deviceId: %s", this.f267191b.mo89270k());
            } else if (this.f267196h.mo83478x()) {
                C59104x b = f267189f.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
                ((C59052c) ((C59052c) b).mo56372aa(15095)).mo56386p("Skip notification, currently in enrollment");
            } else {
                int a = this.f267195g.mo88939a(dVar);
                if (a != 0) {
                    if (a == 1) {
                        return;
                    }
                    if (a != 2) {
                        if (a == 4) {
                            m157935c(dVar, C124615ah.HOTWORD_CONSENT_SENT);
                        } else if (a != 5) {
                            m157934b();
                            m157935c(dVar, C124615ah.HOTWORD_DISABLED_SENT);
                        } else {
                            m157934b();
                            m157935c(dVar, C124615ah.HOTWORD_VM_REQUIRED_SENT);
                        }
                    } else if (BuildConfig.FLAVOR.equals(dVar.mo106482W())) {
                        C59104x c2 = f267189f.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "HotwordStatusHelper");
                        ((C59052c) ((C59052c) c2).mo56372aa(15094)).mo56386p("Unable to upload new hotword model");
                        m157934b();
                        m157935c(dVar, C124615ah.HOTWORD_DISABLED_SENT);
                    }
                } else if (!C124615ah.NONE_SENT.equals(dVar.mo106516n())) {
                    m157935c(dVar, C124615ah.NONE_SENT);
                }
            }
        }
    }

    public final void close() {
        this.f267190a.mo83379U(this);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (this.f267191b.mo89270k().equals(str)) {
            this.f267198j = dVar;
            if (!set.contains(30)) {
                mo89386a();
            }
        }
    }
}
