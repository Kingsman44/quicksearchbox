package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106224b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.i */
/* compiled from: PG */
final class C106308i extends C106224b {

    /* renamed from: a */
    final /* synthetic */ C106309j f296592a;

    public C106308i(C106309j jVar) {
        this.f296592a = jVar;
    }

    /* renamed from: e */
    public final void mo95458e(byte[] bArr, Bundle bundle) {
        if (!"com.google.android.googlequicksearchbox".equals(((PackageManager) this.f296592a.f296595c.mo27525b()).getNameForUid(getCallingUid()))) {
            C59104x c = C106309j.f296593a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaEntryPointBinderProv");
            ((C59052c) ((C59052c) c).mo56372aa(25226)).mo56386p("Caller app is not Google Search app");
            return;
        }
        ((C22871g) this.f296592a.f296594b.mo27525b()).mo28212l("sendNgaEventData", new C106307h(this, bArr, bundle));
    }
}
