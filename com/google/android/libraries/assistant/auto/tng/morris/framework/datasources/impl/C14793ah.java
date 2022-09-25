package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ah */
/* compiled from: PG */
public final class C14793ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14794ai f44572a;

    public C14793ah(C14794ai aiVar) {
        this.f44572a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f44572a.f44576d.mo22279a();
        C59104x d = C14794ai.f44573a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.ReqCallbkHndlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45528)).mo56386p("DataSource future failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (C14782b.SUCCESS.equals((C14782b) obj)) {
            C14794ai aiVar = this.f44572a;
            aiVar.f44574b.mo29164d(new C14792ag(this), aiVar.f44577e.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
