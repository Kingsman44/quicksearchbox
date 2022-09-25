package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.sidekick.shared.util.C91954ae;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7874nd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.i */
/* compiled from: PG */
public final class C91535i extends C91954ae {

    /* renamed from: a */
    public final List f255292a = new ArrayList();

    /* renamed from: c */
    static /* synthetic */ boolean m149754c(C7874nd ndVar) {
        return (ndVar == null || C91525bj.m149693f(ndVar) == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        if ((hjVar.f26955a & 1073741824) != 0) {
            C7874nd ndVar = hjVar.f26938J;
            if (ndVar == null) {
                ndVar = C7874nd.f27577J;
            }
            if (m149754c(ndVar)) {
                this.f255292a.add(hjVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85912b(C7718hj hjVar, C7726hr hrVar) {
        mo77745a(hjVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo85913d(C7718hj hjVar) {
        mo77745a(hjVar);
    }
}
