package com.google.android.libraries.search.p2904c.p2908b.p2909a;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C37366c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37368e f99242a;

    /* renamed from: b */
    public final /* synthetic */ C37384h f99243b;

    public /* synthetic */ C37366c(C37368e eVar, C37384h hVar) {
        this.f99242a = eVar;
        this.f99243b = hVar;
    }

    public final Object call() {
        C37368e eVar = this.f99242a;
        C37384h hVar = this.f99243b;
        C58833ax c = eVar.f99247b.mo40909c(hVar);
        boolean z = false;
        if (!c.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            hVar.name();
        } else {
            C37363a aVar = (C37363a) c.mo56107c();
            if (!(aVar instanceof C37370g) || !((C37370g) aVar).f99256a.get()) {
                C59104x d = C37368e.f99246a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.AdapterStore");
                ((C59052c) ((C59052c) d).mo56372aa(52649)).mo56389s("#audio# audio adapter(%s) timeout, disconnect", hVar.name());
                C46459k.m82829b(aVar.mo24475e(true), "Disconnect adapter at timeout failed", new Object[0]);
                eVar.f99249d.mo41168a(hVar);
                z = eVar.mo40906d(hVar, true);
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                hVar.name();
            }
        }
        return Boolean.valueOf(z);
    }
}
