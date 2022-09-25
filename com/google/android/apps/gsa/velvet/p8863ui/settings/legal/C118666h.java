package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.h */
/* compiled from: PG */
final class C118666h implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118668j f331041a;

    public C118666h(C118668j jVar) {
        this.f331041a = jVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C118669k.f331044a.mo56225c()).mo56382g(th)).mo56372aa(34082)).mo56386p("Failed to load licenses");
            this.f331041a.mo103841d();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f331041a.mo103839b((List) obj);
    }
}
