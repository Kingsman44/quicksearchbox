package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.r */
/* compiled from: PG */
public final /* synthetic */ class C39599r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39605x f104244a;

    public /* synthetic */ C39599r(C39605x xVar) {
        this.f104244a = xVar;
    }

    public final Object call() {
        C39605x xVar = this.f104244a;
        if (xVar.f104264k.getAndSet(true) || !xVar.f104266m.mo56113h() || !xVar.f104267n.mo56113h()) {
            throw new C58894dd("The audio pushing has been stopped or hasn't started!");
        }
        ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53709)).mo56386p("Calling stopListening on hotwordListeningSession.");
        return ((C37659hf) xVar.f104266m.mo56107c()).mo41058b();
    }
}
