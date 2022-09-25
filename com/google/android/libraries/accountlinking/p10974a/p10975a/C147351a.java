package com.google.android.libraries.accountlinking.p10974a.p10975a;

import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;

/* renamed from: com.google.android.libraries.accountlinking.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C147351a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C147352b f397755a;

    public /* synthetic */ C147351a(C147352b bVar) {
        this.f397755a = bVar;
    }

    public final void run() {
        C147352b bVar = this.f397755a;
        if (!bVar.f397761f) {
            bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_FLOW_CANCELED);
            bVar.f397759d.mo124151i(5, 6, 0, (String) null, (String) null);
            C147372e eVar = bVar.f397758c;
            eVar.f397826a.mo5706i(C147366d.m240280b(14));
            return;
        }
        bVar.f397761f = false;
    }
}
