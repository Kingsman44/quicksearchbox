package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.m */
/* compiled from: PG */
public final /* synthetic */ class C110647m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110656v f308322a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308323b;

    /* renamed from: c */
    public final /* synthetic */ C83800p f308324c;

    public /* synthetic */ C110647m(C110656v vVar, C58872ci ciVar, C83800p pVar) {
        this.f308322a = vVar;
        this.f308323b = ciVar;
        this.f308324c = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110656v vVar = this.f308322a;
        C58872ci ciVar = this.f308323b;
        C83800p pVar = this.f308324c;
        ciVar.mo56158a(TimeUnit.MILLISECONDS);
        vVar.f308347f.mo109922at(ciVar.mo56158a(TimeUnit.MILLISECONDS));
        C83798n a = pVar.mo77055a();
        a.mo77048g(vVar.f308343b.mo77142e((List) obj));
        return C60856cj.m92900i(a.mo77042a());
    }
}
