package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.b */
/* compiled from: PG */
public final /* synthetic */ class C106777b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297562a;

    /* renamed from: b */
    public final /* synthetic */ C106740b f297563b;

    public /* synthetic */ C106777b(C106791p pVar, C106740b bVar) {
        this.f297562a = pVar;
        this.f297563b = bVar;
    }

    public final Object apply(Object obj) {
        ((C58970a) ((C58970a) this.f297562a.f297585a.mo56225c()).mo56372aa(23201)).mo56354G("error getting output from renderer %s. Exception:%s", this.f297563b, (RuntimeException) obj);
        return Optional.empty();
    }
}
