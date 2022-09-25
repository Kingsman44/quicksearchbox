package com.google.android.libraries.lens.view.p2159q;

import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.q.m */
/* compiled from: PG */
public final class C27639m implements C28746bx {

    /* renamed from: a */
    private final C46578l f75497a;

    static {
        C58974d.m91135i("CleanupPopulator");
    }

    public C27639m(C46578l lVar) {
        this.f75497a = lVar;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C46578l lVar = this.f75497a;
        C46582p j = C46586t.m83063j(C27634h.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.libraries.lens.view.download.AccidentalModelPushCleaner", C4634o.KEEP));
        C4410f fVar = new C4410f();
        fVar.f14072b = true;
        dVar.f121753b = fVar.mo9349a();
        C46459k.m82829b(lVar.mo50546b(j.mo50561a()), "Failed to enqueue AccidentalModelPushCleaner", new Object[0]);
        return C60866ct.f164955a;
    }
}
