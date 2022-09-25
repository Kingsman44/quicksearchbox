package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89618ap;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7494l.C95482c;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60084kd;
import com.google.common.p4552o.C60086kf;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.v */
/* compiled from: PG */
public final class C95927v extends C95914i {

    /* renamed from: c */
    public static final C59071e f268588c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.v");

    /* renamed from: d */
    public final C95482c f268589d;

    /* renamed from: e */
    private final C95346ax f268590e;

    /* renamed from: f */
    private final C95848i f268591f;

    /* renamed from: g */
    private final C89492cd f268592g;

    /* renamed from: h */
    private final C22871g f268593h;

    /* renamed from: i */
    private final C95307m f268594i;

    /* renamed from: j */
    private final C95026a f268595j;

    /* renamed from: k */
    private final C89618ap f268596k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95927v(C95346ax axVar, C96023bs bsVar, C95482c cVar, C95848i iVar, C89492cd cdVar, C22871g gVar, C95307m mVar, C95026a aVar, C89618ap apVar, C95850a aVar2) {
        super(axVar, bsVar, "HotwordInitState", cdVar, iVar, aVar2);
        this.f268590e = axVar;
        this.f268589d = cVar;
        this.f268591f = iVar;
        this.f268592g = cdVar;
        this.f268593h = gVar;
        this.f268595j = aVar;
        this.f268596k = apVar;
        this.f268594i = mVar;
    }

    /* renamed from: b */
    public final void mo89854b() {
        C90875ai.m148465b(new C95923r(this), this.f268591f.mo89816a(), this.f268593h, "activateHotwordModel").mo85223a(new C95924s(this));
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        C124548d b = this.f268592g.mo83401b(this.f268590e.mo89270k());
        if (b == null) {
            C59104x c = f268588c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordInitState");
            ((C59052c) ((C59052c) c).mo56372aa(15855)).mo56386p("Unable to get deviceinfo for device, disconnecting");
            mo89847j("DisconnectingState", (Intent) null);
        } else if (b.mo106497ak()) {
            int a = this.f268595j.mo88939a(b);
            int i = 2;
            if (a != 0) {
                if (a == 1) {
                    i = 3;
                } else if (a != 2) {
                    i = 5;
                    if (a != 3) {
                        i = a != 4 ? a != 5 ? 8 : 7 : 6;
                    }
                } else {
                    i = 4;
                }
            }
            C95307m mVar = this.f268594i;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60084kd kdVar = (C60084kd) C60086kf.f162445c.createBuilder();
            kdVar.copyOnWrite();
            C60086kf kfVar = (C60086kf) kdVar.instance;
            kfVar.f162448b = i - 1;
            kfVar.f162447a = 1 | kfVar.f162447a;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60086kf kfVar2 = (C60086kf) kdVar.build();
            kfVar2.getClass();
            nmVar.f163142C = kfVar2;
            nmVar.f163148b |= 2048;
            mVar.mo83545c(nkVar);
            C90875ai.m148465b(new C95925t(this), this.f268596k.mo83482a(), this.f268593h, "updating hotword model maps in Interactor").mo85223a(new C95926u(this));
        } else {
            mo89847j("ReadyNoAudClassicState", (Intent) null);
        }
    }
}
