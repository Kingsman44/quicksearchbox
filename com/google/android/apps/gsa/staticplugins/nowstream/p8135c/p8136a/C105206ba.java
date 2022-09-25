package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C105206ba implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C105207bb f293423a;

    public /* synthetic */ C105206ba(C105207bb bbVar) {
        this.f293423a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C105207bb bbVar = this.f293423a;
        C89261d dVar = (C89261d) obj;
        boolean z = true;
        if ((dVar.f242035a & 1) != 0) {
            long j = dVar.f242036b;
            if (bbVar.f293432n.mo26870b() - j < Duration.ofHours((long) ((int) bbVar.f293802l.mo79743a(C89972ak.f246551Z))).toMillis()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
