package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bt */
/* compiled from: PG */
final class C103867bt implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f289127a;

    /* renamed from: b */
    final /* synthetic */ C103868bu f289128b;

    public C103867bt(C103868bu buVar, String str) {
        this.f289128b = buVar;
        this.f289127a = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56382g(th)).mo56372aa(21784)).mo56389s("Failed to create an event for %s", this.f289127a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C103877cc ccVar = (C103877cc) obj;
        synchronized (this.f289128b.f289140l) {
            this.f289128b.f289140l.add(ccVar);
            C103868bu buVar = this.f289128b;
            buVar.f289141m.mo57304a(new C103848ba(buVar, ccVar), new C103849bb(buVar));
        }
    }
}
