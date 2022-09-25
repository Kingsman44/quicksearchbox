package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.MeasuringViewSwitcher;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.l */
/* compiled from: PG */
public final /* synthetic */ class C106787l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297576a;

    /* renamed from: b */
    public final /* synthetic */ List f297577b;

    /* renamed from: c */
    public final /* synthetic */ MeasuringViewSwitcher f297578c;

    public /* synthetic */ C106787l(C106791p pVar, List list, MeasuringViewSwitcher measuringViewSwitcher) {
        this.f297576a = pVar;
        this.f297577b = list;
        this.f297578c = measuringViewSwitcher;
    }

    public final Object call() {
        KeyEvent.Callback callback;
        C106791p pVar = this.f297576a;
        List list = this.f297577b;
        MeasuringViewSwitcher measuringViewSwitcher = this.f297578c;
        List<Pair> list2 = (List) Collection.EL.stream(list).map(new C106776a(pVar)).filter(C106779d.f297565a).map(C106780e.f297566a).collect(Collectors.toList());
        if (list2.isEmpty()) {
            callback = null;
        } else if (list2.size() == 1) {
            Pair pair = (Pair) list2.get(0);
            C106791p.m177536e((View) pair.second, (C106734a) pair.first);
            callback = (View) pair.second;
        } else {
            for (Pair pair2 : list2) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                C106791p.m177535c(layoutParams, (View) pair2.second);
                measuringViewSwitcher.addView((View) pair2.second, layoutParams);
            }
            callback = measuringViewSwitcher;
        }
        if (callback == null) {
            return Optional.empty();
        }
        return Optional.m71637of(callback);
    }
}
