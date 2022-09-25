package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C17391i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17393k f50274a;

    /* renamed from: b */
    public final /* synthetic */ boolean f50275b;

    public /* synthetic */ C17391i(C17393k kVar, boolean z) {
        this.f50274a = kVar;
        this.f50275b = z;
    }

    public final void run() {
        C17393k kVar = this.f50274a;
        boolean z = this.f50275b;
        if (kVar.f50280c) {
            C58976aa aaVar = C58975e.f156826a;
            if (z) {
                kVar.mo23339e("S3 request source closed");
                return;
            }
            kVar.f50279b.mo20121a();
            kVar.f50280c = false;
        }
    }
}
