package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.assistant.shared.l.i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ar */
/* compiled from: PG */
public final /* synthetic */ class C112323ar implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112331az f311698a;

    public /* synthetic */ C112323ar(C112331az azVar) {
        this.f311698a = azVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112331az azVar = this.f311698a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || ((i) axVar.mo56107c()).equals(i.b)) {
            ((C59052c) ((C59052c) C112331az.f311705b.mo56224b()).mo56372aa(27689)).mo56386p("Got empty Tapas models from OpaStore.");
            return C112329ax.m186189d();
        }
        ((C59052c) ((C59052c) C112331az.f311705b.mo56224b()).mo56372aa(27690)).mo56386p("Successfully read Tapas models from OpaStore.");
        return azVar.mo99499c(Optional.m71637of((i) axVar.mo56107c()));
    }
}
