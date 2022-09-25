package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.content.ComponentName;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98570f;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20668x;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.p */
/* compiled from: PG */
final class C98633p extends C20668x {

    /* renamed from: b */
    public final SettableFuture f275468b = new SettableFuture();

    /* renamed from: c */
    final /* synthetic */ C98634q f275469c;

    public C98633p(C98634q qVar) {
        this.f275469c = qVar;
    }

    /* renamed from: b */
    public final void mo25656b(C20665u uVar) {
        C59071e eVar = C98634q.f275470a;
        C58976aa aaVar = C58975e.f156826a;
        this.f275469c.f275477h = uVar;
        if (this.f275469c.f275475f.mo79746e(C90110fh.f250627aY)) {
            this.f275469c.f275474e.mo28212l("prepareCustomTabs", new C98632o(this, uVar));
        } else {
            mo91228c(uVar);
        }
    }

    /* renamed from: c */
    public final void mo91228c(C20665u uVar) {
        C98572h a = this.f275469c.f275472c.mo91191a();
        boolean e = this.f275469c.f275475f.mo79746e(C90110fh.f250707m);
        if (e || a == null || !a.f57882c.mo25583f()) {
            this.f275469c.f275472c.mo91192b(uVar);
            C58976aa aaVar = C58975e.f156826a;
        }
        this.f275469c.mo91233e(uVar);
        C98642y yVar = this.f275469c.f275479j;
        if (yVar != null && e) {
            C98570f fVar = this.f275469c.f275473d;
            C20670z zVar = yVar.f275506k;
            if (fVar.mo91186c()) {
                fVar.mo91184a(C37182a.f98119gg);
                fVar.mo91185b(zVar);
            }
        }
        if (!this.f275468b.isDone()) {
            this.f275468b.mo57356n(true);
            return;
        }
        C59104x d = C98634q.f275470a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CustomTabsController");
        ((C59052c) ((C59052c) d).mo56372aa(19134)).mo56386p("Service connected but future was already done");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = C98634q.f275470a;
        C58976aa aaVar = C58975e.f156826a;
        this.f275469c.mo91234f();
    }
}
