package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.C91432n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.am */
/* compiled from: PG */
public final /* synthetic */ class C104545am implements C91432n {

    /* renamed from: a */
    public final /* synthetic */ C104551as f290837a;

    public /* synthetic */ C104545am(C104551as asVar) {
        this.f290837a = asVar;
    }

    /* renamed from: a */
    public final void mo85785a(int i) {
        C104551as asVar = this.f290837a;
        if (!((Boolean) asVar.f290870c.mo94197o().f63720e).booleanValue()) {
            if (i > 0) {
                asVar.mo94252m(asVar.f290875h.mo26870b() + Duration.ofSeconds((long) i).toMillis(), false);
            } else {
                asVar.mo94250k();
            }
        }
    }
}
