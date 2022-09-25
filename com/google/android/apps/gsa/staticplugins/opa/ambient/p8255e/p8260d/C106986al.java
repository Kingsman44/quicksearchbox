package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.al */
/* compiled from: PG */
final class C106986al implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C106989ao f297975a;

    public C106986al(C106989ao aoVar) {
        this.f297975a = aoVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String str;
        C106601a aVar = this.f297975a.f297984g;
        Object[] objArr = new Object[1];
        if (th.getMessage() != null) {
            str = String.format(" Error: %s", new Object[]{th.getMessage()});
        } else {
            str = BuildConfig.FLAVOR;
        }
        objArr[0] = str;
        aVar.mo95588b(5, "SmartspaceUpdates generation failed.%s", objArr);
        ((C58970a) ((C58970a) ((C58970a) this.f297975a.f297978a.mo56226d()).mo56382g(th)).mo56372aa(23429)).mo56386p("SmartspaceUpdates generation failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            this.f297975a.f297984g.mo95588b(5, "SmartspaceUpdates: Total: %d.", Integer.valueOf(guVar.size()));
        }
    }
}
