package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.di */
/* compiled from: PG */
public final /* synthetic */ class C96159di implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96162dl f269182a;

    public /* synthetic */ C96159di(C96162dl dlVar) {
        this.f269182a = dlVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96162dl dlVar = this.f269182a;
        Exception exc = (Exception) obj;
        C59104x d = C96162dl.f269185a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EnableDeviceSequence");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(16968)).mo56386p("Enable Device Failed");
        dlVar.f269197m = true;
        throw exc;
    }
}
