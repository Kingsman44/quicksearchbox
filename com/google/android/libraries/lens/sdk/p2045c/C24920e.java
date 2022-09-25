package com.google.android.libraries.lens.sdk.p2045c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.lens.sdk.c.e */
/* compiled from: PG */
public final /* synthetic */ class C24920e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24923h f68039a;

    /* renamed from: b */
    public final /* synthetic */ int f68040b;

    public /* synthetic */ C24920e(C24923h hVar, int i) {
        this.f68039a = hVar;
        this.f68040b = i;
    }

    public final void run() {
        C24923h hVar = this.f68039a;
        int i = this.f68040b;
        C59104x b = C24923h.f68044a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b).mo56372aa(48954)).mo56387q("detachInner uid %d", i);
        C24914a aVar = (C24914a) hVar.f68049f.get(Integer.valueOf(i));
        if (aVar != null) {
            hVar.mo30141a(aVar);
            return;
        }
        C59104x d = C24923h.f68044a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) d).mo56372aa(48955)).mo56387q("Failed to detach unknown client uid %d", i);
    }
}
