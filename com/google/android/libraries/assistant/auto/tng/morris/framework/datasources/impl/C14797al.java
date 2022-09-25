package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14078f;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14093u;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.al */
/* compiled from: PG */
public final /* synthetic */ class C14797al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14800ao f44581a;

    /* renamed from: b */
    public final /* synthetic */ int f44582b;

    public /* synthetic */ C14797al(C14800ao aoVar, int i) {
        this.f44581a = aoVar;
        this.f44582b = i;
    }

    public final void run() {
        C14800ao aoVar = this.f44581a;
        int i = this.f44582b;
        if (C14160ab.m30486g(i)) {
            C14096x xVar = aoVar.f44589c;
            C58976aa aaVar = C58975e.f156826a;
            xVar.f42764b.mo46040b(new C14078f(i), C60826bg.f164896a);
            return;
        }
        C14096x xVar2 = aoVar.f44589c;
        C58976aa aaVar2 = C58975e.f156826a;
        xVar2.f42764b.mo46040b(C14093u.f42760a, C60826bg.f164896a);
    }
}
