package com.google.android.libraries.search.assistant.appactions.p2501a;

import android.appwidget.AppWidgetHostView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.core.p098j.C2050bp;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.w */
/* compiled from: PG */
public final class C32464w {
    /* renamed from: a */
    public static final View m60249a(View view, int i, Class cls) {
        if (view.getId() != i) {
            if (!(view instanceof AppWidgetHostView) && (view instanceof ViewGroup)) {
                Iterator a = C2050bp.m5609a((ViewGroup) view).mo5191a();
                while (a.hasNext()) {
                    View a2 = m60249a((View) a.next(), i, cls);
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
    public static final void m60250b(View view, List list) {
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
                    m60250b((View) a.next(), list);
                }
            }
        }
    }
}
