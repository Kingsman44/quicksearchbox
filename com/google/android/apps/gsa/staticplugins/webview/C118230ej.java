package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ej */
/* compiled from: PG */
public final /* synthetic */ class C118230ej implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328226a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328227b;

    /* renamed from: c */
    public final /* synthetic */ boolean f328228c;

    public /* synthetic */ C118230ej(C118248fa faVar, C85452b bVar, boolean z) {
        this.f328226a = faVar;
        this.f328227b = bVar;
        this.f328228c = z;
    }

    public final void run() {
        C118248fa faVar = this.f328226a;
        C85452b bVar = this.f328227b;
        boolean z = this.f328228c;
        C118119ai C = faVar.mo103651C(bVar);
        if (!C.mo103529C() && C.f327790I != z) {
            if (z) {
                C58976aa aaVar = C58975e.f156826a;
                if (C.f327788G != null) {
                    C.f327788G.f235736a.onPause();
                    C.f327790I = true;
                    return;
                }
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            if (C.f327788G != null) {
                C.f327788G.f235736a.onResume();
                C.f327790I = false;
            }
        }
    }
}
