package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.soda.f.h */
/* compiled from: PG */
public final /* synthetic */ class C19328h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54085a;

    public /* synthetic */ C19328h(C19329i iVar) {
        this.f54085a = iVar;
    }

    public final void run() {
        C19329i iVar = this.f54085a;
        Soda soda = iVar.f54090e;
        if (soda != null) {
            soda.mo24332h(C19329i.f54087b, 0);
            iVar.f54090e.mo24349p();
            iVar.f54090e.mo24340l();
            ((C59052c) ((C59052c) C19329i.f54086a.mo56224b()).mo56372aa(47774)).mo56386p("#delete finished");
            iVar.f54090e = null;
        }
    }
}
