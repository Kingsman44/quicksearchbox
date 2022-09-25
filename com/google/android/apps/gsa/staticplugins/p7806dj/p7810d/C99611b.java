package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99597d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.b */
/* compiled from: PG */
public final class C99611b extends BaseAdapter {

    /* renamed from: a */
    C99597d f278756a = C99597d.f278723b;

    /* renamed from: b */
    private final LayoutInflater f278757b;

    public C99611b(Context context) {
        this.f278757b = LayoutInflater.from(context);
    }

    public final int getCount() {
        return this.f278756a.f278725a.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return (C99596c) this.f278756a.f278725a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C58838bb.m90869d(this.f278756a.f278725a.size() > i, "Settings list indexing position out of bounds.");
        if ((((C99596c) this.f278756a.f278725a.get(i)).f278718a & 2) != 0) {
            View inflate = this.f278757b.inflate(R.layout.search_results_summary_list, (ViewGroup) null, true);
            ((TextView) inflate.findViewById(R.id.search_result)).setText(((C99596c) this.f278756a.f278725a.get(i)).f278719b);
            ((TextView) inflate.findViewById(R.id.search_result_summary)).setText(((C99596c) this.f278756a.f278725a.get(i)).f278720c);
            return inflate;
        }
        View inflate2 = this.f278757b.inflate(R.layout.search_results_list, (ViewGroup) null, true);
        ((TextView) inflate2.findViewById(R.id.search_result_no_summary)).setText(((C99596c) this.f278756a.f278725a.get(i)).f278719b);
        return inflate2;
    }
}
