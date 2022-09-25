package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ae */
/* compiled from: PG */
public class C91954ae {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo77745a(C7718hj hjVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo85912b(C7718hj hjVar, C7726hr hrVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo85913d(C7718hj hjVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: hV */
    public void mo85802hV(C7726hr hrVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo86657i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo86658j(C7744ii iiVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo86659k() {
    }

    /* renamed from: l */
    public final void mo86660l(C7744ii iiVar) {
        if (iiVar != null) {
            mo86659k();
            if ((iiVar.f27056a & 1) != 0) {
                C7726hr hrVar = iiVar.f27057b;
                if (hrVar == null) {
                    hrVar = C7726hr.f27008i;
                }
                if (hrVar != null) {
                    mo85802hV(hrVar);
                }
                mo86661m(hrVar);
            }
            mo86658j(iiVar);
        }
    }

    /* renamed from: m */
    public final void mo86661m(C7726hr hrVar) {
        if (hrVar != null) {
            for (C7726hr hrVar2 : hrVar.f27012c) {
                mo85802hV(hrVar2);
                mo86661m(hrVar2);
                mo86657i();
            }
            if ((hrVar.f27010a & 8) != 0) {
                C7718hj hjVar = hrVar.f27016g;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                mo85913d(hjVar);
            }
            if ((hrVar.f27010a & 2) != 0) {
                C7718hj hjVar2 = hrVar.f27015f;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                mo85912b(hjVar2, hrVar);
            }
            for (C7718hj a : hrVar.f27013d) {
                mo77745a(a);
            }
        }
    }
}
