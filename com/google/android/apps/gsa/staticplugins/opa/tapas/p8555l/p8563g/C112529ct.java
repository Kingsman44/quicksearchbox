package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ct */
/* compiled from: PG */
public final /* synthetic */ class C112529ct implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112548dl f312096a;

    /* renamed from: b */
    public final /* synthetic */ C48634bw f312097b;

    public /* synthetic */ C112529ct(C112548dl dlVar, C48634bw bwVar) {
        this.f312096a = dlVar;
        this.f312097b = bwVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx i;
        C112548dl dlVar = this.f312096a;
        C48634bw bwVar = this.f312097b;
        Void voidR = (Void) obj;
        if (!dlVar.mo99585g()) {
            return C60856cj.m92900i(C48635bx.f125704d);
        }
        C112547dk dkVar = (C112547dk) dlVar.f312132d.get(bwVar);
        if (dkVar == null) {
            return C60856cj.m92900i(C48635bx.f125704d);
        }
        synchronized (dkVar) {
            if (dkVar.mo99580j()) {
                i = dkVar.mo99572b();
                if (i == null) {
                    i = C60856cj.m92900i(C48635bx.f125704d);
                }
            } else if (dkVar.mo99581k(dlVar.f312134f.mo26870b())) {
                i = C60856cj.m92900i(C48635bx.f125704d);
            } else {
                i = C60856cj.m92900i(dkVar.mo99571a());
            }
        }
        return i;
    }
}
