package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.j */
/* compiled from: PG */
public final /* synthetic */ class C110644j implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110645k f308316a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f308317b;

    public /* synthetic */ C110644j(C110645k kVar, C58528ij ijVar) {
        this.f308316a = kVar;
        this.f308317b = ijVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        return (Set) Collection.EL.stream(this.f308316a.f308319b.mo83623e()).filter(new C110641g(this.f308317b)).collect(C58370cn.f155947b);
    }
}
