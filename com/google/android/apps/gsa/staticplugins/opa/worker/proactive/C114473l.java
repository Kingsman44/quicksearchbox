package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3803ag.p3809c.C49054et;
import com.google.assistant.p3803ag.p3809c.C49055eu;
import com.google.assistant.p3803ag.p3809c.C49057ew;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.l */
/* compiled from: PG */
public final /* synthetic */ class C114473l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114476o f317425a;

    public /* synthetic */ C114473l(C114476o oVar) {
        this.f317425a = oVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        int a;
        C114476o oVar = this.f317425a;
        long b = oVar.f317432e.mo26870b() - oVar.f317435h.f94589g.toMillis();
        C62971cq cqVar = ((C49057ew) obj).f126898a;
        int size = cqVar.size() - 1;
        while (true) {
            if (size < 0 || ((C49055eu) cqVar.get(size)).f126890b <= b) {
                z = false;
            } else {
                int a2 = C49054et.m85353a(((C49055eu) cqVar.get(size)).f126891c);
                if ((a2 != 0 && a2 == 6) || ((a = C49054et.m85353a(((C49055eu) cqVar.get(size)).f126891c)) != 0 && a == 7)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
