package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.au */
/* compiled from: PG */
abstract class C86625au implements C22869e {

    /* renamed from: a */
    private final C86775r f234011a;

    /* renamed from: b */
    private final String f234012b;

    /* renamed from: c */
    private C86626av f234013c;

    /* renamed from: d */
    public C86610af f234014d;

    /* renamed from: e */
    private boolean f234015e;

    public C86625au(C86775r rVar, String str) {
        this.f234011a = rVar;
        this.f234012b = str;
    }

    /* renamed from: a */
    public abstract void mo80234a();

    /* renamed from: b */
    public final void mo80235b(C86626av avVar, C86610af afVar, boolean z, boolean z2) {
        C58838bb.m90884s(this.f234013c == null, "May only be executed once");
        this.f234013c = avVar;
        this.f234014d = afVar;
        this.f234015e = z;
        if (!z2) {
            C22871g gVar = avVar.f234026d;
            String str = this.f234012b;
            gVar.mo28212l("ServiceTransaction[" + str + "]", this);
        } else if (C22872h.m42744d(C86593a.class)) {
            run();
        } else {
            C59104x d = C86626av.f234016a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchServiceCore");
            ((C59052c) ((C59052c) d).mo56372aa(8406)).mo56386p("We were not on event bus thread");
            int i = C90755l.f253831a;
        }
    }

    public final void run() {
        C22872h.m42743c(C86593a.class);
        if (this.f234015e || this.f234011a.f234387i) {
            mo80234a();
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
