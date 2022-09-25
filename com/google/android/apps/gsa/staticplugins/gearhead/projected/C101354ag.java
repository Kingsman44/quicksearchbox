package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.gms.car.C143118bb;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1012b.p1013a.C13647b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.ag */
/* compiled from: PG */
final class C101354ag implements C11552b {

    /* renamed from: a */
    final /* synthetic */ C60870cx f282862a;

    /* renamed from: b */
    final /* synthetic */ C101355ah f282863b;

    public C101354ag(C101355ah ahVar, C60870cx cxVar) {
        this.f282863b = ahVar;
        this.f282862a = cxVar;
    }

    /* renamed from: a */
    public final void mo20009a(C143118bb bbVar) {
        if (this.f282863b.f282864a.mo79746e(C90086ek.f250348bT)) {
            C60870cx cxVar = this.f282862a;
            C101352ae aeVar = new C101352ae(bbVar);
            C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(aeVar), C60826bg.f164896a), "Error registering CarVendorExtensionManager", new Object[0]);
            return;
        }
        ((C13647b) this.f282863b.f282865b.mo27525b()).mo21200a(bbVar);
    }

    /* renamed from: b */
    public final void mo20010b() {
        if (this.f282863b.f282864a.mo79746e(C90086ek.f250348bT)) {
            C60870cx cxVar = this.f282862a;
            C101353af afVar = C101353af.f282861a;
            C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(afVar), C60826bg.f164896a), "Error unregistering CarVendorExtensionManager", new Object[0]);
            return;
        }
        ((C13647b) this.f282863b.f282865b.mo27525b()).mo21201b();
    }
}
