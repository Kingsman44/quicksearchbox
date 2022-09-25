package com.google.android.apps.gsa.assistant.settings.p526e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.k */
/* compiled from: PG */
final class C9759k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C9761m f33676a;

    public C9759k(C9761m mVar) {
        this.f33676a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59052c cVar = (C59052c) C9761m.f33678a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, this.f33676a.f33681d);
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(1631)).mo56386p("Failure determining WebView data owner. Retry.");
        this.f33676a.mo18020b(true);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f33676a.mo18021c();
            return;
        }
        C59052c cVar = (C59052c) C9761m.f33678a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, this.f33676a.f33681d);
        ((C59052c) cVar.mo56372aa(1632)).mo56386p("Account is not current WebView data owner. Retry.");
        this.f33676a.mo18020b(true);
    }
}
