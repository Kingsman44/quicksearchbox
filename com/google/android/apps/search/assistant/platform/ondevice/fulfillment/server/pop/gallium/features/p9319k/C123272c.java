package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9319k;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;
import com.google.protos.p4985f.p5030q.C65149dj;
import com.google.protos.p4985f.p5030q.C65150dk;
import com.google.protos.p4985f.p5030q.C65153dn;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.k.c */
/* compiled from: PG */
public final class C123272c implements C65153dn {

    /* renamed from: b */
    private final int f341002b;

    public C123272c(int i) {
        this.f341002b = i == 2 ? 5 : i;
    }

    /* renamed from: a */
    public final C60870cx mo59346a() {
        C65149dj djVar = (C65149dj) C65150dk.f176324c.createBuilder();
        int i = this.f341002b;
        djVar.copyOnWrite();
        C65150dk dkVar = (C65150dk) djVar.instance;
        dkVar.f176327b = C64802b.m96463a(i);
        dkVar.f176326a |= 1;
        return C60856cj.m92900i((C65150dk) djVar.build());
    }
}
