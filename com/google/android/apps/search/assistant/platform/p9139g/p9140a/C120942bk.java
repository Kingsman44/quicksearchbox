package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RemoteViews;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.bk */
/* compiled from: PG */
public final class C120942bk extends BaseAdapter {

    /* renamed from: a */
    private final Context f336256a;

    /* renamed from: b */
    private final List f336257b;

    public C120942bk(Context context, List list) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(list, "itemViews");
        this.f336256a = context;
        this.f336257b = list;
    }

    public final int getCount() {
        return this.f336257b.size();
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new C120926av(this.f336256a);
        }
        if (view instanceof AppWidgetHostView) {
            ((AppWidgetHostView) view).updateAppWidget((RemoteViews) this.f336257b.get(i));
        }
        return view;
    }
}
