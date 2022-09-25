package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.p */
/* compiled from: PG */
public final class C113637p implements C22868d {

    /* renamed from: a */
    final /* synthetic */ boolean f314688a;

    /* renamed from: b */
    final /* synthetic */ C51910dq f314689b;

    /* renamed from: c */
    final /* synthetic */ OfflineSubController f314690c;

    public C113637p(OfflineSubController offlineSubController, boolean z, C51910dq dqVar) {
        this.f314690c = offlineSubController;
        this.f314688a = z;
        this.f314689b = dqVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) OfflineSubController.f314597a.mo56226d()).mo56382g(th)).mo56372aa(28098)).mo56386p("fail to check model");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f314688a && bool.booleanValue()) {
            this.f314690c.f314605i.mo104025g(this.f314689b.f136176p ? 1 : 0);
        }
    }
}
