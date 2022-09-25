package com.google.android.apps.search.googleapp.compliance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a */
/* compiled from: PG */
final class C133530a extends BaseExpandableListAdapter {

    /* renamed from: a */
    private final Map f363828a;

    /* renamed from: b */
    private final List f363829b;

    /* renamed from: c */
    private final Context f363830c;

    public C133530a(Context context, Map map) {
        this.f363830c = context;
        this.f363828a = map;
        this.f363829b = new ArrayList(map.keySet());
    }

    public final Object getChild(int i, int i2) {
        return ((List) Objects.requireNonNull((List) this.f363828a.get(this.f363829b.get(i)))).get(i2);
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) Objects.requireNonNull((LayoutInflater) this.f363830c.getSystemService("layout_inflater"))).inflate(R.layout.googleapp_compliance_expandable_list_child, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.googleapp_expanded_list_item)).setText((CharSequence) ((List) Objects.requireNonNull((List) this.f363828a.get(this.f363829b.get(i)))).get(i2));
        return view;
    }

    public final int getChildrenCount(int i) {
        return ((List) Objects.requireNonNull((List) this.f363828a.get(this.f363829b.get(i)))).size();
    }

    public final Object getGroup(int i) {
        return this.f363829b.get(i);
    }

    public final int getGroupCount() {
        return this.f363828a.size();
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) Objects.requireNonNull((LayoutInflater) this.f363830c.getSystemService("layout_inflater"))).inflate(R.layout.googleapp_compliance_expandable_list_group, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.googleapp_list_title)).setText((CharSequence) this.f363829b.get(i));
        return view;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
