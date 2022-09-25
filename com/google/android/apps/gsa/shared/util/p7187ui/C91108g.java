package com.google.android.apps.gsa.shared.util.p7187ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.g */
/* compiled from: PG */
public final class C91108g extends ArrayAdapter {

    /* renamed from: a */
    protected int f254415a;

    public C91108g(Context context, Object[] objArr) {
        super(context, R.layout.edit_reminder_spinner);
        addAll(objArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (i == this.f254415a) {
            ((TextView) view2).setText((CharSequence) null);
        }
        return view2;
    }

    public final void notifyDataSetChanged() {
        this.f254415a = getCount() - 1;
        super.notifyDataSetChanged();
    }
}
