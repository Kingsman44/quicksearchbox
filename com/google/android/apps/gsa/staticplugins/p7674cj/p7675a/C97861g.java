package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.g */
/* compiled from: PG */
final class C97861g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C97862h f273267a;

    public C97861g(C97862h hVar) {
        this.f273267a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C97864j.f273273a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PersonalContextWorker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30357)).mo56386p("Failed to call post visit badge service.");
        this.f273267a.f273268a.cancel(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
