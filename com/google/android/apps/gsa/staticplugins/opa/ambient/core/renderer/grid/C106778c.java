package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.c */
/* compiled from: PG */
public final /* synthetic */ class C106778c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106734a f297564a;

    public /* synthetic */ C106778c(C106734a aVar) {
        this.f297564a = aVar;
    }

    public final Object apply(Object obj) {
        C106734a aVar = this.f297564a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        View view = (View) optional.get();
        C106791p.m177536e(view, aVar);
        return Optional.m71637of(view);
    }
}
