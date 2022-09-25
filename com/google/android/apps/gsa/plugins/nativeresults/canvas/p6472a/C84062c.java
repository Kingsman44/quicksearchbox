package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6472a;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.binaries.satin.app.C74083iu;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.C84110n;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.C84112p;
import com.google.android.apps.gsa.search.shared.p6928f.C87549e;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.a.c */
/* compiled from: PG */
public final class C84062c implements C87549e {

    /* renamed from: a */
    final /* synthetic */ C90021c f228957a;

    public C84062c(C90021c cVar) {
        this.f228957a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo77516a(C74083iu iuVar) {
        SettableFuture settableFuture = new SettableFuture();
        C87680ah ahVar = iuVar.f206383a.f236493a;
        C22871g c = iuVar.mo69415c();
        SettableFuture settableFuture2 = new SettableFuture();
        C84110n nVar = new C84110n(ahVar, c, new C84112p(settableFuture2));
        if (C22872h.m42744d(C0826b.class)) {
            nVar.run();
        } else {
            c.mo28212l("Request canvas worker binder", nVar);
        }
        new C90873ag(settableFuture2, iuVar.mo69415c(), "CardFactoryEntryPointM#createCardFactoryFuture", new C84060a(iuVar, this.f228957a, settableFuture)).mo85223a(new C84061b(settableFuture));
        return settableFuture;
    }
}
