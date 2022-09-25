package com.google.apps.p3589d.p3599j;

import com.google.apps.p3589d.p3592c.C45725a;
import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45755n;

/* renamed from: com.google.apps.d.j.z */
/* compiled from: PG */
final class C45935z extends C45917h {

    /* renamed from: a */
    final /* synthetic */ C45905ac f120720a;

    public C45935z(C45905ac acVar) {
        this.f120720a = acVar;
    }

    /* renamed from: a */
    public final C45916g mo50023a(C45731g gVar) {
        int i = 0;
        while (i < ((C45725a) gVar).f120228c) {
            C45755n i2 = gVar.mo49854i(i);
            if (!this.f120720a.mo50024a(i2) || i2.f120315d != null || i2.f120316e != null) {
                break;
            }
            i++;
        }
        if (i == 0) {
            return null;
        }
        return new C45902a(gVar.mo49851f(0, i));
    }
}
