package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c;

import com.google.android.gms.car.C143117ba;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13668a;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.b */
/* compiled from: PG */
final class C13676b implements C143117ba {

    /* renamed from: a */
    final /* synthetic */ C13678d f41740a;

    public C13676b(C13678d dVar) {
        this.f41740a = dVar;
    }

    /* renamed from: a */
    public final void mo21199a(byte[] bArr) {
        C13678d dVar = this.f41740a;
        if (bArr == null || bArr.length == 0) {
            ((C58970a) C13678d.f41742a.mo56225c()).mo56386p("Bytes received are null or have length zero.");
        } else if (dVar.f41743b.isPresent()) {
            ((C13668a) dVar.f41743b.get()).mo21207a(bArr);
        }
    }
}
