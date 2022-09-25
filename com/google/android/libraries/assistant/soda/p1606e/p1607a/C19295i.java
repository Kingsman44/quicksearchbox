package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.i */
/* compiled from: PG */
public final /* synthetic */ class C19295i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17046am f54018a;

    public /* synthetic */ C19295i(C17046am amVar) {
        this.f54018a = amVar;
    }

    public final void run() {
        C17046am amVar = this.f54018a;
        C59052c cVar = (C59052c) ((C59052c) C19299m.f54021a.mo56226d()).mo56372aa(47723);
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        cVar.mo56359L("Couldn't find %s in file group %s. Status: %s", "hotmatch.data", "apa_hotmatch", a.name());
    }
}
