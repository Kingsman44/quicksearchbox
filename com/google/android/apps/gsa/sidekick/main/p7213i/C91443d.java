package com.google.android.apps.gsa.sidekick.main.p7213i;

import com.google.android.apps.gsa.sidekick.shared.util.C91954ae;
import com.google.p375ai.p378b.C7715hg;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.sidekick.main.i.d */
/* compiled from: PG */
public final class C91443d extends C91954ae {

    /* renamed from: a */
    private final C91440a f255068a;

    public C91443d(C91440a aVar) {
        this.f255068a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        C91442c a;
        int a2 = C7715hg.m22813a(hjVar.f26944P);
        if (a2 != 0 && a2 == 3 && (a = this.f255068a.mo85797j(hjVar)) != null) {
            a.mo85800b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hV */
    public final void mo85802hV(C7726hr hrVar) {
        C7718hj hjVar;
        C7718hj hjVar2 = hrVar.f27015f;
        if (hjVar2 == null) {
            hjVar2 = C7718hj.f26927af;
        }
        int a = C7715hg.m22813a(hjVar2.f26944P);
        if (a != 0 && a == 3) {
            C91440a aVar = this.f255068a;
            if ((hrVar.f27010a & 2) != 0) {
                hjVar = hrVar.f27015f;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
            } else {
                hjVar = null;
            }
            C62971cq cqVar = hrVar.f27013d;
            C91442c d = aVar.mo85796d(hjVar);
            if (d != null) {
                d.mo85800b();
            }
        }
    }
}
