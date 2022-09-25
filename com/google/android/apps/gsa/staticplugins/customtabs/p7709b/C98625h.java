package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.apps.gsa.search.core.p6807j.C86137f;
import com.google.android.apps.gsa.search.core.p6807j.C86139h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.p1703d.C20665u;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.h */
/* compiled from: PG */
public final /* synthetic */ class C98625h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98634q f275459a;

    /* renamed from: b */
    public final /* synthetic */ C86139h f275460b;

    public /* synthetic */ C98625h(C98634q qVar, C86139h hVar) {
        this.f275459a = qVar;
        this.f275460b = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98642y yVar;
        boolean z;
        boolean z2;
        C98634q qVar = this.f275459a;
        C86139h hVar = this.f275460b;
        C20665u uVar = (C20665u) obj;
        C98572h a = qVar.mo91230a(uVar);
        int i = hVar.f232814b;
        synchronized (qVar.f275476g) {
            yVar = (C98642y) ((WeakReference) qVar.f275476g.get(i, new WeakReference((Object) null))).get();
            z = true;
            if (yVar == null) {
                qVar.f275476g.remove(i);
                if (a.mo91189j()) {
                    yVar = qVar.mo91231b(uVar, i);
                    z2 = true;
                } else {
                    C59104x b = C98634q.f275470a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "CustomTabsController");
                    ((C59052c) ((C59052c) b).mo56372aa(19139)).mo56386p("CCT session restoration is not supported");
                    throw new C98631n();
                }
            } else {
                z2 = false;
            }
        }
        if (yVar != null) {
            if (z2) {
                C58976aa aaVar = C58975e.f156826a;
                if (hVar.f232814b != yVar.f275505j) {
                    z = false;
                }
                C58838bb.m90868c(z);
                C86137f fVar = hVar.f232815c;
                if (fVar == null) {
                    fVar = C86137f.f232804f;
                }
                yVar.mo91243a(fVar);
                yVar.f275516u = false;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
            return yVar;
        }
        C59104x c = C98634q.f275470a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CustomTabsController");
        ((C59052c) ((C59052c) c).mo56372aa(19138)).mo56386p("The CCT session could not be restored due to an internal error");
        throw new C98630m();
    }
}
