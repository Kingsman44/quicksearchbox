package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.android.apps.gsa.shared.p7066m.C90083eh;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.j */
/* compiled from: PG */
public final /* synthetic */ class C100011j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100023v f279711a;

    public /* synthetic */ C100011j(C100023v vVar) {
        this.f279711a = vVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100023v vVar = this.f279711a;
        C89261d dVar = (C89261d) obj;
        boolean z = true;
        if ((dVar.f242035a & 1) != 0) {
            long j = dVar.f242036b;
            if (vVar.f279737l.mo26870b() - j < Duration.ofHours((long) ((int) vVar.f279732g.mo79743a(C90083eh.f250092c))).toMillis()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
