package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.j */
/* compiled from: PG */
final class C92801j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f258965a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f258966b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f258967c;

    /* renamed from: d */
    final /* synthetic */ C92804m f258968d;

    public C92801j(C92804m mVar, C60870cx cxVar, C60870cx cxVar2, C58833ax axVar) {
        this.f258968d = mVar;
        this.f258965a = cxVar;
        this.f258966b = cxVar2;
        this.f258967c = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C92804m.f258971a.mo56225c()).mo56382g(th)).mo56372aa(13040)).mo56386p("#handleLegacyAssistantResponse shouldSendToEventBus future failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || !((Boolean) axVar.mo56107c()).booleanValue()) {
            C92804m mVar = this.f258968d;
            C60870cx cxVar = this.f258965a;
            mVar.f258973c.mo77882c();
            C60856cj.m92911t(cxVar, new C92802k(mVar), C60826bg.f164896a);
            return;
        }
        C92804m mVar2 = this.f258968d;
        C60870cx cxVar2 = this.f258965a;
        C60870cx cxVar3 = this.f258966b;
        C60870cx[] cxVarArr = {cxVar2, cxVar3};
        C60856cj.m92895d(cxVarArr).mo57334a(new C92800i(mVar2, cxVar2, cxVar3, this.f258967c), C60826bg.f164896a);
    }
}
