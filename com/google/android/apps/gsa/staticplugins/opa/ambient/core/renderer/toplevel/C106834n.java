package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.view.ViewGroup;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.n */
/* compiled from: PG */
public final /* synthetic */ class C106834n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297708a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f297709b;

    public /* synthetic */ C106834n(TopLevelRendererHelper topLevelRendererHelper, ViewGroup viewGroup) {
        this.f297708a = topLevelRendererHelper;
        this.f297709b = viewGroup;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92906o((Iterable) Collection.EL.stream((List) obj).filter(new C106821a(this.f297708a)).map(new C106832l(this.f297709b)).collect(Collectors.toList()));
    }
}
