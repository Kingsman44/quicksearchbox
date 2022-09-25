package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.r */
/* compiled from: PG */
public final /* synthetic */ class C110652r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110656v f308334a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308335b;

    public /* synthetic */ C110652r(C110656v vVar, C58872ci ciVar) {
        this.f308334a = vVar;
        this.f308335b = ciVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110656v vVar = this.f308334a;
        C58872ci ciVar = this.f308335b;
        C83800p pVar = (C83800p) obj;
        if (pVar.mo77058d().mo56113h()) {
            return vVar.f308344c.mo28210j(vVar.f308343b.mo77143f((C83741am) pVar.mo77058d().mo56107c(), vVar.f308346e), "fetchImage", new C110647m(vVar, ciVar, pVar));
        }
        ciVar.mo56158a(TimeUnit.MILLISECONDS);
        vVar.f308347f.mo109922at(ciVar.mo56158a(TimeUnit.MILLISECONDS));
        return C60856cj.m92900i(pVar);
    }
}
