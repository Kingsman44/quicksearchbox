package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.g */
/* compiled from: PG */
public final /* synthetic */ class C94883g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94886j f265361a;

    public /* synthetic */ C94883g(C94886j jVar) {
        this.f265361a = jVar;
    }

    public final void run() {
        C94886j jVar = this.f265361a;
        C59104x c = C94887k.f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) c).mo56372aa(17264)).mo56389s("[%s] Fatal handshake timeout error during crypto setup", C94876ay.m156554c(jVar.f265364a.f265385b));
        jVar.f265364a.mo88750i(true);
    }
}
