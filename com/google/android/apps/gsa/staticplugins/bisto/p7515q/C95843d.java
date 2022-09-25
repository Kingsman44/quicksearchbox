package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95392cp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95393cq;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95430e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142444fo;
import com.google.android.p10712d.C142445fp;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142465gi;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.Collection;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.d */
/* compiled from: PG */
public final /* synthetic */ class C95843d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95848i f268393a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f268394b;

    public /* synthetic */ C95843d(C95848i iVar, C124548d dVar) {
        this.f268393a = iVar;
        this.f268394b = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95848i iVar = this.f268393a;
        C142468gl glVar = (C142468gl) obj;
        String c = iVar.mo89818c(this.f268394b, glVar);
        String str = glVar.f386631j;
        Collection c2 = iVar.f268401c.mo83586c(glVar);
        C89492cd cdVar = iVar.f268402d;
        String k = iVar.f268400b.mo89270k();
        String str2 = glVar.f386629h;
        String str3 = glVar.f386630i;
        C142465gi a = C142465gi.m231087a(glVar.f386628g);
        if (a == null) {
            a = C142465gi.DEVICE_TYPE_UNKNOWN;
        }
        cdVar.mo83389ae(k, c, str, c2, str2, str3, a.equals(C142465gi.DEVICE_TYPE_HOTWORD_MODEL));
        C59104x b = C95848i.f268399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordActivator");
        ((C59052c) ((C59052c) b).mo56372aa(15477)).mo56389s("Activating hotword model: %s", c);
        if (str.equals(c)) {
            C59104x b2 = C95848i.f268399a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HotwordActivator");
            ((C59052c) ((C59052c) b2).mo56372aa(15478)).mo56386p("Target model is already activated");
            iVar.mo89820e(c);
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C22871g gVar = iVar.f268403e;
        int i = glVar.f386626e;
        C95355bf bfVar = iVar.f268400b;
        C95392cp f = C95393cq.m157754f();
        C95430e eVar = (C95430e) f;
        eVar.f267019a = "ACTIVATE_FEATURE";
        eVar.f267020b = 3;
        f.mo89329c(C142455fz.OTA_ACTIVATE_FEATURE.f386567k);
        C142444fo foVar = (C142444fo) C142445fp.f386524d.createBuilder();
        foVar.copyOnWrite();
        C142445fp fpVar = (C142445fp) foVar.instance;
        fpVar.f386526a |= 1;
        fpVar.f386527b = i;
        foVar.copyOnWrite();
        C142445fp fpVar2 = (C142445fp) foVar.instance;
        c.getClass();
        fpVar2.f386526a |= 2;
        fpVar2.f386528c = c;
        f.mo89328b(((C142445fp) foVar.build()).toByteArray());
        f.mo89330d(Duration.ofSeconds(5));
        return iVar.f268403e.mo28205e(gVar.mo28209i(bfVar.mo89267h(f.mo89327a(), C142455fz.OTA_RESPONSE.f386567k, new C95844e()), "handle-activate-feature", new C95842c(iVar, c, c2, glVar)), "log-activate-failure", Exception.class, new C95840a(iVar, c));
    }
}
