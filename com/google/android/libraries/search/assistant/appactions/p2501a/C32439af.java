package com.google.android.libraries.search.assistant.appactions.p2501a;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RemoteViews;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32480m;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.af */
/* compiled from: PG */
public final class C32439af extends BaseAdapter {

    /* renamed from: a */
    private final Context f86910a;

    /* renamed from: b */
    private final List f86911b;

    public C32439af(Context context, List list) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(list, "itemViews");
        this.f86910a = context;
        this.f86911b = list;
    }

    public final int getCount() {
        return this.f86911b.size();
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new C32480m(this.f86910a);
        }
        if (view instanceof AppWidgetHostView) {
            ((AppWidgetHostView) view).updateAppWidget((RemoteViews) this.f86911b.get(i));
        }
        return view;
    }
}
