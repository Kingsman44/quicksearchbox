package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87668c;
import com.google.android.apps.gsa.shared.util.keepalive.C91051c;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.bn */
/* compiled from: PG */
public final class C86647bn {

    /* renamed from: a */
    public static final C59071e f234082a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.bn");

    /* renamed from: b */
    public static final Integer f234083b = 10000;

    /* renamed from: c */
    public final C91051c f234084c;

    /* renamed from: d */
    public final C87668c f234085d;

    /* renamed from: e */
    public final C68214a f234086e;

    /* renamed from: f */
    public final C68214a f234087f;

    /* renamed from: g */
    public int f234088g = 0;

    /* renamed from: h */
    public boolean f234089h = false;

    /* renamed from: i */
    public final C68214a f234090i;

    public C86647bn(C91051c cVar, C87668c cVar2, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f234084c = cVar;
        this.f234085d = cVar2;
        this.f234086e = aVar;
        this.f234087f = aVar2;
        this.f234090i = aVar3;
    }

    /* renamed from: a */
    public final void mo80261a() {
        boolean z;
        C22872h.m42743c(C86593a.class);
        if (((C86948bo) this.f234086e.mo27525b()).mo80606z(2)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f234088g++;
            z = true;
        } else {
            z = false;
            if (this.f234089h) {
                C86948bo boVar = (C86948bo) this.f234086e.mo27525b();
                if (boVar.f234846d && boVar.mo80605y() == 2) {
                    boVar.f234846d = false;
                    z = true;
                }
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (z) {
            this.f234085d.mo81927a(true);
            this.f234089h = !this.f234084c.mo85323d();
        }
    }
}
