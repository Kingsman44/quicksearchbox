package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C94999q;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.d */
/* compiled from: PG */
public final /* synthetic */ class C94943d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94947h f265588a;

    /* renamed from: b */
    public final /* synthetic */ String f265589b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f265590c;

    /* renamed from: d */
    public final /* synthetic */ C48090bx f265591d;

    public /* synthetic */ C94943d(C94947h hVar, String str, C124548d dVar, C48090bx bxVar) {
        this.f265588a = hVar;
        this.f265589b = str;
        this.f265590c = dVar;
        this.f265591d = bxVar;
    }

    public final void run() {
        C94947h hVar = this.f265588a;
        String str = this.f265589b;
        C124548d dVar = this.f265590c;
        C48090bx bxVar = this.f265591d;
        if (str == null) {
            C59104x d = C94947h.f265596a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TextInputHandler");
            ((C59052c) ((C59052c) d).mo56372aa(17665)).mo56386p("Empty text query");
            return;
        }
        C95005w wVar = hVar.f265599d;
        C95007y yVar = hVar.f265598c;
        C58976aa aaVar = C58975e.f156826a;
        wVar.f265807a.execute(new C94999q(wVar, str, yVar, dVar, bxVar));
    }
}
