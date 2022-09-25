package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25531n;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.session.p */
/* compiled from: PG */
final class C28018p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25533p f76254a;

    /* renamed from: b */
    final /* synthetic */ C28019q f76255b;

    public C28018p(C28019q qVar, C25533p pVar) {
        this.f76255b = qVar;
        this.f76254a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f76255b.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C28019q.f76256a.mo56225c()).mo56382g(th)).mo56372aa(49921)).mo56386p("Failed to decode injected image.");
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        this.f76255b.mo33477f(((C25531n) obj).mo30578b(), ((C25523f) this.f76254a).f69507e);
    }
}
