package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.io.File;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.gsa.c.a.aa */
/* compiled from: PG */
final class C22202aa implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ File f61286a;

    /* renamed from: b */
    final /* synthetic */ C22209ah f61287b;

    public C22202aa(C22209ah ahVar, File file) {
        this.f61287b = ahVar;
        this.f61286a = file;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C22209ah.f61294b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(48451)).mo56386p("Cronet engine failed to instantiate.");
        int i = C90755l.f253831a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f61287b.mo27466l((ExperimentalCronetEngine) obj, this.f61286a);
    }
}
