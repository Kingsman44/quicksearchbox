package com.google.android.libraries.p1672c.p1673a;

import com.google.android.gms.car.CarCall;
import com.google.android.gms.tasks.C146042v;
import com.google.common.p4522b.C58526ih;
import java.util.List;

/* renamed from: com.google.android.libraries.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C19686c implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C19700q f54707a;

    public /* synthetic */ C19686c(C19700q qVar) {
        this.f54707a = qVar;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        CarCall.Details details;
        C19700q qVar = this.f54707a;
        C58526ih ihVar = new C58526ih();
        for (CarCall carCall : (List) obj) {
            if (carCall.f387935e != 7 && ((details = carCall.f387936f) == null || (details.f387948i & 256) != 256)) {
                ihVar.mo55373c(carCall);
            }
        }
        qVar.f54714c = ihVar.mo55486f();
        qVar.mo25081a();
    }
}
