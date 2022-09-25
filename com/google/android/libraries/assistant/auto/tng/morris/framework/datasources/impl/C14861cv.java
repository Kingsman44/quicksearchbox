package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14372gu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14375gx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14385hg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cv */
/* compiled from: PG */
final class C14861cv implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14862cw f44735a;

    public C14861cv(C14862cw cwVar) {
        this.f44735a = cwVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C14863cx.f44739a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.RcntCallsDataSrc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45650)).mo56386p("Failed refreshing recent call cache");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C14782b) obj) == C14782b.ERROR) {
            C59104x c = C14863cx.f44739a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.RcntCallsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45651)).mo56386p("Recent call fetch future completed with ERROR DataSourceFetchStatus");
            return;
        }
        C14986h hVar = this.f44735a.f44736a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14372gu guVar = (C14372gu) C14385hg.f43516f.createBuilder();
        C14375gx gxVar = C14375gx.f43500a;
        guVar.copyOnWrite();
        C14385hg hgVar = (C14385hg) guVar.instance;
        gxVar.getClass();
        hgVar.f43520c = gxVar;
        hgVar.f43519b = 3;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14385hg hgVar2 = (C14385hg) guVar.build();
        hgVar2.getClass();
        lfVar.f43801d = hgVar2;
        lfVar.f43800c = 15;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
