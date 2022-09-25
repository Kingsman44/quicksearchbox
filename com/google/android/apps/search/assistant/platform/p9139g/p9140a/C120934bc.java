package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.appwidget.AppWidgetHostView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.core.p098j.C2050bp;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.bc */
/* compiled from: PG */
public final class C120934bc {
    /* renamed from: a */
    public static final View m200196a(View view, int i, Class cls) {
        if (view.getId() != i) {
            if (!(view instanceof AppWidgetHostView) && (view instanceof ViewGroup)) {
                Iterator a = C2050bp.m5609a((ViewGroup) view).mo5191a();
                while (a.hasNext()) {
                    View a2 = m200196a((View) a.next(), i, cls);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return null;
        } else if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static final void m200197b(View view, List list) {
        if (!(view instanceof AppWidgetHostView)) {
            if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                if (adapterView.getId() != -1 && adapterView.getAdapter() == null) {
                    list.add(Integer.valueOf(adapterView.getId()));
                }
            }
            if (view instanceof ViewGroup) {
                Iterator a = C2050bp.m5609a((ViewGroup) view).mo5191a();
                while (a.hasNext()) {
                    m200197b((View) a.next(), list);
                }
            }
        }
    }
}
