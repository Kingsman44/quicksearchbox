package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.f */
/* compiled from: PG */
public final /* synthetic */ class C111998f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C112000h f311146a;

    /* renamed from: b */
    public final /* synthetic */ C111999g f311147b;

    public /* synthetic */ C111998f(C112000h hVar, C111999g gVar) {
        this.f311146a = hVar;
        this.f311147b = gVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C113405ep epVar;
        C112000h hVar = this.f311146a;
        C111999g gVar = this.f311147b;
        synchronized (hVar) {
            epVar = hVar.f311150c;
            hVar.f311150c = null;
            hVar.f311151d = null;
        }
        if (epVar == null) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        hVar.f311149b.set(hVar.f311148a.mo26871c());
        return gVar.mo99334a(epVar);
    }
}
