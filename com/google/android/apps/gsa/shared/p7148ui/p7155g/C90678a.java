package com.google.android.apps.gsa.shared.p7148ui.p7155g;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91116o;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58597ky;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a */
/* compiled from: PG */
public final class C90678a extends BaseAdapter {

    /* renamed from: a */
    private final LayoutInflater f253573a;

    /* renamed from: b */
    private final List f253574b;

    public C90678a(Context context, String[] strArr) {
        this.f253574b = C58597ky.m90213d(r0);
        for (String oVar : strArr) {
            this.f253574b.add(new C91116o(oVar, (String) null, (Object) null, false));
        }
        this.f253574b.size();
        this.f253573a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public final C91116o getItem(int i) {
        return (C91116o) this.f253574b.get(i);
    }

    public final int getCount() {
        return this.f253574b.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f253573a.inflate(R.layout.location_spinner_element, viewGroup, false);
        }
        C91116o a = getItem(i);
        TextView textView = (TextView) view.findViewById(16908309);
        ((TextView) view.findViewById(16908308)).setText(a.f254416a);
        String str = a.f254429d;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        return view;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f253573a.inflate(R.layout.action_card_multiline_combined_content_wrapped, viewGroup, false);
        }
        C91116o a = getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.argument_value);
        TextView textView2 = (TextView) view.findViewById(R.id.argument_secondary_value);
        textView.setText(a.f254416a);
        String str = a.f254429d;
        if (!TextUtils.isEmpty(str)) {
            textView2.setText(str);
            textView2.setVisibility(0);
            textView.setMaxLines(1);
        } else {
            textView2.setVisibility(8);
            textView.setMaxLines(2);
        }
        return view;
    }
}
