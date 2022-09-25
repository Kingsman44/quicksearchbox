package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.j */
/* compiled from: PG */
public final /* synthetic */ class C106412j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106740b f296840a;

    public /* synthetic */ C106412j(C106740b bVar) {
        this.f296840a = bVar;
    }

    public final Object apply(Object obj) {
        C106740b bVar = this.f296840a;
        C59104x c = C106419n.f296855a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AADetailsHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((RuntimeException) obj)).mo56372aa(23055)).mo56389s("Error getting output from renderer %s", bVar);
        return Optional.empty();
    }
}
