package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C106200m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296374a;

    public /* synthetic */ C106200m(C106203p pVar) {
        this.f296374a = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C106203p pVar = this.f296374a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        pVar.f296377a.startActivity(new Intent("android.intent.action.VIEW", (Uri) optional.get()).setFlags(268435456));
        return pVar.f296392p.mo74921j();
    }
}
