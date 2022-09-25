package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95353bd;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96054d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.d */
/* compiled from: PG */
public class C96026d implements AutoCloseable, C96054d, C95353bd, C96024bt, C89495cg {

    /* renamed from: c */
    private static final C59071e f268867c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.d");

    /* renamed from: a */
    public final String f268868a;

    /* renamed from: b */
    public boolean f268869b;

    /* renamed from: d */
    private final C96023bs f268870d;

    /* renamed from: e */
    private boolean f268871e;

    public C96026d(C96023bs bsVar, String str, C95850a aVar) {
        this.f268870d = bsVar;
        this.f268868a = str;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268871e = true;
    }

    /* renamed from: fW */
    public void mo17874fW(String str, Set set, long j, C124548d dVar) {
    }

    /* renamed from: g */
    public void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
    }

    /* renamed from: i */
    public void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
    }

    /* renamed from: io */
    public void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: ip */
    public void mo89286ip(String str, boolean z) {
    }

    /* renamed from: j */
    public void mo89847j(String str, Intent intent) {
        if (this.f268871e) {
            C59104x c = f268867c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BaseLifecycleState");
            C59052c cVar = (C59052c) c;
            cVar.mo56378ag(C58975e.f156826a, this.f268868a);
            ((C59052c) cVar.mo56372aa(15598)).mo56389s("moveToState %s when destroyed", str);
        } else if (this.f268868a.equals(str)) {
            C59104x b = f268867c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BaseLifecycleState");
            C59052c cVar2 = (C59052c) b;
            cVar2.mo56378ag(C58975e.f156826a, this.f268868a);
            ((C59052c) cVar2.mo56372aa(15597)).mo56389s("Already in %s; not moving into it", str);
        } else {
            C58976aa aaVar = C58975e.f156826a;
            this.f268870d.mo89838h(this.f268868a, str, intent);
        }
    }

    /* renamed from: k */
    public void mo89853k() {
        if (this.f268871e) {
            C59104x c = f268867c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BaseLifecycleState");
            ((C59052c) ((C59052c) c).mo56372aa(15599)).mo56386p("onVoiceLocaleChanged when destroyed");
        }
    }

    /* renamed from: l */
    public boolean mo89848l(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268871e) {
            return false;
        }
        C59104x c = f268867c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BaseLifecycleState");
        ((C59052c) ((C59052c) c).mo56372aa(15601)).mo56386p("handleIntent when destroyed");
        return true;
    }

    /* renamed from: s */
    public void mo89850s() {
    }

    public final String toString() {
        return this.f268868a;
    }
}
