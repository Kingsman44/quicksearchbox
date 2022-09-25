package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fy */
/* compiled from: PG */
final class C109055fy implements C60845bz {

    /* renamed from: a */
    private final WeakReference f303603a;

    public C109055fy(WeakReference weakReference) {
        this.f303603a = weakReference;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C109065gb.f303614a.mo56226d()).mo56382g(th)).mo56372aa(22718)).mo56386p("Opening the calendar event in the other profile failed");
        C109065gb gbVar = (C109065gb) this.f303603a.get();
        if (gbVar != null && !gbVar.f303628b.isDestroyed() && !gbVar.f303628b.isFinishing()) {
            gbVar.f303629c.mo28212l("Show calendar error", new C109054fx(gbVar));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
    }
}
