package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fw */
/* compiled from: PG */
final class C109053fw implements C60845bz {

    /* renamed from: a */
    public final Intent f303600a;

    /* renamed from: b */
    private final WeakReference f303601b;

    public C109053fw(WeakReference weakReference, Intent intent) {
        this.f303601b = weakReference;
        this.f303600a = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C109065gb.f303614a.mo56226d()).mo56382g(th)).mo56372aa(22717)).mo56386p("Opening the calendar app failed");
        C109065gb gbVar = (C109065gb) this.f303601b.get();
        if (gbVar != null && !gbVar.f303628b.isDestroyed() && !gbVar.f303628b.isFinishing()) {
            gbVar.f303629c.mo28212l("Opening calendar in web view", new C109052fv(this, gbVar));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
    }
}
