package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.util.C91996o;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.an */
/* compiled from: PG */
final class C117113an extends BaseAdapter {

    /* renamed from: a */
    public final ArrayList f325129a = new ArrayList();

    /* renamed from: b */
    private final Context f325130b;

    /* renamed from: c */
    private final LayoutInflater f325131c;

    public C117113an(Context context, LayoutInflater layoutInflater) {
        this.f325130b = context;
        this.f325131c = layoutInflater;
    }

    /* renamed from: a */
    public final C117112am getItem(int i) {
        return (C117112am) this.f325129a.get(i);
    }

    public final int getCount() {
        return this.f325129a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f325131c.inflate(R.layout.customization_menu_overlay_item, viewGroup, false);
        }
        C117112am a = getItem(i);
        Context context = this.f325130b;
        ((TextView) view.findViewById(R.id.menu_overlay_item_text)).setText(context.getResources().getString(a.f325127d));
        Context context2 = this.f325130b;
        ((ImageView) view.findViewById(R.id.menu_overlay_item_drawable)).setImageDrawable(C91996o.m151002a(context2.getResources(), a.f325128e, R.color.menu_icon_tint));
        return view;
    }
}
