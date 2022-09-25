package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58528ij;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ao */
/* compiled from: PG */
public final /* synthetic */ class C108553ao implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108556ar f301990a;

    /* renamed from: b */
    public final /* synthetic */ C108680ez f301991b;

    public /* synthetic */ C108553ao(C108556ar arVar, C108680ez ezVar) {
        this.f301990a = arVar;
        this.f301991b = ezVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108556ar arVar = this.f301990a;
        C108680ez ezVar = this.f301991b;
        arVar.f301994b.clear();
        arVar.f301994b.addAll((Set) obj);
        if (!arVar.f301994b.isEmpty()) {
            ezVar.mo97060d();
        }
        return C58528ij.m90006F(arVar.f301994b);
    }
}
